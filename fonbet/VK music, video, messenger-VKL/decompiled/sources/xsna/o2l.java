package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vkontakte.android.VKApplication;
import xsna.ky6;

/* compiled from: DebugAppSettings.kt */
/* loaded from: classes.dex */
public final class o2l {
    public static final o2l a = new o2l();
    public static boolean b;

    public static String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(b("__removeInternalPrefix", false) ? "" : "internal.");
        sb.append(c("apiHost", "api.".concat(a0a.d)));
        return sb.toString();
    }

    public static boolean b(String str, boolean z) {
        return Preference.j().getBoolean(str, z);
    }

    public static String c(String str, String str2) {
        String string = Preference.j().getString(str, str2);
        return string == null ? str2 : string;
    }

    public static boolean d() {
        boolean z;
        if (!BuildInfo.h()) {
            VKApplication vKApplication = com.vk.core.apps.a.a;
            if (!BuildInfo.i()) {
                z = false;
                return !z || (!o25.a().i().a || o25.a().i().b || o25.a().i().c);
            }
        }
        z = true;
        if (z) {
        }
    }

    public static boolean e() {
        boolean z;
        if (!BuildInfo.h()) {
            VKApplication vKApplication = com.vk.core.apps.a.a;
            if (!BuildInfo.i()) {
                z = false;
                return !z || (!o25.a().i().a || o25.a().i().b || o25.a().i().c);
            }
        }
        z = true;
        if (z) {
        }
    }

    public static boolean f() {
        if (BuildInfo.h()) {
            return true;
        }
        VKApplication vKApplication = com.vk.core.apps.a.a;
        return BuildInfo.i() || o25.a().i().c;
    }

    public static boolean g() {
        return !BuildInfo.m();
    }

    public static void h(String str, boolean z) {
        ky6.a aVar = (ky6.a) Preference.j().edit();
        aVar.putBoolean(str, z);
        aVar.apply();
    }

    public static void i(int i, String str) {
        ky6.a aVar = (ky6.a) Preference.j().edit();
        aVar.putInt(str, i);
        aVar.apply();
    }

    public static void j(String str, String str2) {
        ky6.a aVar = (ky6.a) Preference.j().edit();
        aVar.putString(str, str2);
        aVar.apply();
    }
}
