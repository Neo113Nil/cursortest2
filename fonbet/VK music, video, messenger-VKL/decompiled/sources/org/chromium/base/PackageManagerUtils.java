package org.chromium.base;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.TransactionTooLargeException;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public class PackageManagerUtils {
    public static final Intent BROWSER_INTENT = new Intent().setAction(CommonConstant.ACTION.HWID_SCHEME_URL).addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts("http", "", null));
    private static final String TAG = "PackageManagerUtils";
    public static final String XR_OPENXR_FEATURE_NAME = "android.software.xr.api.openxr";

    public static boolean canResolveActivity(Intent intent, int i) {
        return !queryIntentActivities(intent, i).isEmpty();
    }

    public static Intent getQueryInstalledHomeLaunchersIntent() {
        return new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME");
    }

    private static void handleExpectedExceptionsOrRethrow(RuntimeException runtimeException, Intent intent) {
        if (!(runtimeException instanceof NullPointerException) && !(runtimeException.getCause() instanceof TransactionTooLargeException)) {
            throw runtimeException;
        }
        Log.e(TAG, "Could not resolve Activity for intent " + intent.toString(), (Throwable) runtimeException);
    }

    public static boolean hasSystemFeature(String str) {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature(str);
    }

    public static List<ResolveInfo> queryAllLaunchersInfo() {
        return queryIntentActivities(getQueryInstalledHomeLaunchersIntent(), 131072);
    }

    public static List<ResolveInfo> queryAllWebBrowsersInfo() {
        return queryIntentActivities(BROWSER_INTENT, 983040);
    }

    public static List<ResolveInfo> queryIntentActivities(Intent intent, int i) {
        try {
            StrictModeContext allowDiskReads = StrictModeContext.allowDiskReads();
            try {
                List<ResolveInfo> queryIntentActivities = ContextUtils.getApplicationContext().getPackageManager().queryIntentActivities(intent, i);
                if (allowDiskReads == null) {
                    return queryIntentActivities;
                }
                allowDiskReads.close();
                return queryIntentActivities;
            } finally {
            }
        } catch (RuntimeException e) {
            handleExpectedExceptionsOrRethrow(e, intent);
            return Collections.EMPTY_LIST;
        }
    }

    public static ResolveInfo resolveActivity(Intent intent, int i) {
        try {
            StrictModeContext allowDiskWrites = StrictModeContext.allowDiskWrites();
            try {
                ResolveInfo resolveActivity = ContextUtils.getApplicationContext().getPackageManager().resolveActivity(intent, i);
                if (allowDiskWrites == null) {
                    return resolveActivity;
                }
                allowDiskWrites.close();
                return resolveActivity;
            } finally {
            }
        } catch (RuntimeException e) {
            handleExpectedExceptionsOrRethrow(e, intent);
            return null;
        }
    }

    public static ResolveInfo resolveDefaultWebBrowserActivity() {
        return resolveActivity(BROWSER_INTENT, 65536);
    }

    public static boolean canResolveActivity(Intent intent) {
        return canResolveActivity(intent, 0);
    }
}
