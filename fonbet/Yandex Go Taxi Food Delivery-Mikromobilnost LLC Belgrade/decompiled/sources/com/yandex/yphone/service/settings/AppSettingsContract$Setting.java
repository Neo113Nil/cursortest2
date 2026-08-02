package com.yandex.yphone.service.settings;

import android.net.Uri;
import android.provider.BaseColumns;
import android.util.Log;
import defpackage.ww2;
import java.util.List;

/* loaded from: classes2.dex */
public final class AppSettingsContract$Setting implements BaseColumns {
    public static final String COLUMN_KEY = "key";
    public static final String COLUMN_PREFIX = "prefix";
    public static final String COLUMN_UID = "uid";
    public static final String COLUMN_VALUE = "value";
    public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/com.yandex.yphone.settings.app_settings.uid.prefix";
    public static final String CONTENT_TYPE_ROOT_DIR = "vnd.android.cursor.dir/com.yandex.yphone.settings.app_settings";
    public static final String CONTENT_TYPE_USER_APP_DIR = "vnd.android.cursor.dir/com.yandex.yphone.settings.app_settings.uid.prefix";
    public static final String CONTENT_TYPE_USER_DIR = "vnd.android.cursor.dir/com.yandex.yphone.settings.app_settings.uid";
    static final String TABLE_NAME = "app_settings";

    private AppSettingsContract$Setting() {
    }

    public static Uri buildUri(long j, String str, String str2) {
        return ww2.a.buildUpon().appendPath(String.valueOf(j)).appendPath(str).appendPath(str2).build();
    }

    public static String getKeyFromUri(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() > 2) {
            return pathSegments.get(2);
        }
        return null;
    }

    public static String getPrefixFromUri(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() > 1) {
            return pathSegments.get(1);
        }
        return null;
    }

    public static long getUserIdFromUri(Uri uri) {
        try {
            return Long.parseLong(uri.getPathSegments().get(0));
        } catch (Exception e) {
            Log.e("AppSettings", "Failed to parse uid from Uri", e);
            return 0L;
        }
    }

    public static Uri buildUri(long j, String str) {
        return ww2.a.buildUpon().appendPath(String.valueOf(j)).appendPath(str).build();
    }

    public static Uri buildUri(long j) {
        return ww2.a.buildUpon().appendPath(String.valueOf(j)).build();
    }
}
