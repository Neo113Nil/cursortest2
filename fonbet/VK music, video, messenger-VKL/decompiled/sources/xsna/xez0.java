package xsna;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes.dex */
public abstract class xez0 {
    public static boolean a;

    public static void a(idy0 idy0Var) {
        Object obj;
        Context context = idy0Var.a;
        if (gu8.a || a) {
            return;
        }
        a = true;
        try {
            if (b(context)) {
                gu8.a = true;
                gu8.c(null, "LoggingUtils: debug mode is enabled by device name");
                return;
            }
            try {
                obj = Integer.class.cast(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get("com.my.target.debugMode"));
            } catch (Throwable th) {
                eb3.a(null, new StringBuilder("SystemUtils: exception when access to application info with key - com.my.target.debugMode, "), th);
                obj = null;
            }
            Integer num = 1;
            if (num.equals((Integer) obj)) {
                gu8.a = true;
                gu8.c(null, "LoggingUtils: debug mode is enabled by manifest metadata");
            } else if (c(context)) {
                gu8.a = true;
                gu8.c(null, "LoggingUtils: debug mode is enabled by system properties");
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean b(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            if ("debug_phone".equals(Settings.Secure.getString(contentResolver, "bluetooth_name"))) {
                return true;
            }
        } catch (Throwable unused) {
            gu8.e(null, "LoggingUtils: case 0 failure");
        }
        try {
            if ("debug_phone".equals(Settings.System.getString(contentResolver, "bluetooth_name"))) {
                return true;
            }
        } catch (Throwable unused2) {
            gu8.e(null, "LoggingUtils: case 1 failure");
        }
        try {
            return "debug_phone".equals(Settings.Global.getString(contentResolver, "device_name"));
        } catch (Throwable unused3) {
            gu8.e(null, "LoggingUtils: case 2 failure");
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(Context context) {
        String str;
        String a2 = fo8.a(context.getPackageName(), "_mytarget_debug");
        try {
            str = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, a2);
        } catch (Throwable th) {
            eb3.a(null, t33.a("SystemUtils: error occurred when getting value for property - ", a2, ", "), th);
        }
        if (!TextUtils.isEmpty(str)) {
            if (String.valueOf((Object) 1).equals(str)) {
                gu8.c(null, "LoggingUtils: no debug data in SystemProperties");
                return false;
            }
            gu8.c(null, "LoggingUtils: debug data in SystemProperties has been found");
            return true;
        }
        gu8.c(null, "SystemUtils: value in system properties is null for ".concat(a2));
        str = null;
        if (String.valueOf((Object) 1).equals(str)) {
        }
    }
}
