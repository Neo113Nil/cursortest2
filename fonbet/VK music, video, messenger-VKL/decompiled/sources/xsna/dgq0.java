package xsna;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: UserAgentHelper.kt */
/* loaded from: classes15.dex */
public final class dgq0 {
    public static String a(Context context) {
        PackageInfo packageInfo;
        String str;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Exception unused) {
            packageInfo = null;
        }
        if (packageInfo != null) {
            str = DomExceptionUtils.SEPARATOR + packageInfo.versionName + '-' + packageInfo.versionCode;
        } else {
            str = "";
        }
        String str2 = str;
        mgn0 mgn0Var = dgn0.a;
        mgn0 mgn0Var2 = dgn0.a;
        String str3 = (mgn0Var2 != null ? mgn0Var2 : null).g;
        return String.format(Locale.US, "SAK_%s(%s)%s (Android %s; SDK %d; %s; %s %s; %s; %dx%d)", Arrays.copyOf(new Object[]{drm0.k0(str3, "+", str3), context.getPackageName(), str2, Build.VERSION.RELEASE, Integer.valueOf(Build.VERSION.SDK_INT), Build.CPU_ABI, Build.MANUFACTURER, Build.MODEL, System.getProperty("user.language"), Integer.valueOf(Math.max(iah0.f().widthPixels, iah0.f().heightPixels)), Integer.valueOf(Math.min(iah0.f().widthPixels, iah0.f().heightPixels))}, 11));
    }
}
