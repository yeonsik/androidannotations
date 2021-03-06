/**
 * Copyright (C) 2010-2012 eBusiness Information, Excilys Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed To in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.googlecode.androidannotations.helper;

import java.util.Arrays;
import java.util.List;

public abstract class GreenDroidConstants {

	public static final String GREENDROID_GD_ACTIVITY_CLASS = "greendroid.app.GDActivity";

	public static final String GREENDROID_GD_LIST_ACTIVITY_CLASS = "greendroid.app.GDListActivity";

	public static final String GREENDROID_GD_TAB_ACTIVITY_CLASS = "greendroid.app.GDTabActivity";

	public static final String GREENDROID_GD_MAP_ACTIVITY_CLASS = "greendroid.app.GDMapActivity";

	public static final List<String> GREENDROID_ACTIVITIES_LIST_CLASS = Arrays.asList(new String[] { //
			GREENDROID_GD_ACTIVITY_CLASS, //
					GREENDROID_GD_LIST_ACTIVITY_CLASS, //
					GREENDROID_GD_TAB_ACTIVITY_CLASS, //
					GREENDROID_GD_MAP_ACTIVITY_CLASS //
			});

	private GreenDroidConstants() {
	}

}
