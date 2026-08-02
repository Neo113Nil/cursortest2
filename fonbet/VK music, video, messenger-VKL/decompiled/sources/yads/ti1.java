package yads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;

/* loaded from: classes10.dex */
public final class ti1 {
    public static Object a(Context context, String str) {
        ApplicationInfo applicationInfo;
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (Throwable unused) {
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            return null;
        }
        try {
            Bundle bundle = applicationInfo.metaData;
            if (bundle == null || !bundle.containsKey(str)) {
                return null;
            }
            Object obj = bundle.get(str);
            if (obj == null) {
                return null;
            }
            return obj;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static boolean c(Context context) {
        Boolean bool = (Boolean) a(context, ui1.j.b);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
