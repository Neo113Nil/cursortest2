package xsna;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutManager;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;

/* compiled from: ShortcutUtil.kt */
/* loaded from: classes17.dex */
public final class fhj0 {
    public static final fhj0 a = new fhj0();
    public static final List<String> b = e43.l("com.miui.home", "com.mi.android.globallauncher");
    public static Boolean c;

    public static Uri a(long j, String str) {
        return Uri.parse(String.format("https://%s/write", Arrays.copyOf(new Object[]{str}, 1)) + j);
    }

    public final boolean b(Context context) {
        String str;
        ActivityInfo activityInfo;
        Boolean bool = c;
        if (bool != null) {
            return bool.booleanValue();
        }
        synchronized (this) {
            Boolean bool2 = c;
            if (bool2 != null) {
                return bool2.booleanValue();
            }
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
            if (resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null || (str = activityInfo.packageName) == null) {
                str = "";
            }
            boolean z = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).isRequestPinShortcutSupported() && !b.contains(str);
            c = Boolean.valueOf(z);
            return z;
        }
    }
}
