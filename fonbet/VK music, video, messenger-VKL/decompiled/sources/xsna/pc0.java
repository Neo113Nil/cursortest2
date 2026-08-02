package xsna;

import com.vk.core.preference.Preference;
import java.util.concurrent.TimeUnit;

/* compiled from: AdAwayTokenStorage.kt */
/* loaded from: classes7.dex */
public final class pc0 {
    public static volatile t31 a;
    public static final long b = TimeUnit.HOURS.toSeconds(12);
    public static final String c = "ad_away";
    public static final String d = "ad_away_token";
    public static final String e = "ad_away_token_expired";

    public static t31 a() {
        return b();
    }

    public static t31 b() {
        String s;
        String s2;
        if (a != null) {
            return a;
        }
        String str = c;
        s = Preference.s(str, d, new String());
        t31 t31Var = null;
        try {
            s2 = Preference.s(str, e, new String());
            int parseInt = Integer.parseInt(s2);
            if (s.length() > 0 && parseInt > 0) {
                t31Var = new t31(s, parseInt);
            }
        } catch (NumberFormatException unused) {
        }
        a = t31Var;
        return t31Var;
    }

    public static void c(boolean z) {
        if (o25.a().b()) {
            a = b();
            if (!z) {
                if ((a != null ? epx.h(r4.b - pvo0.a(), b) : 0) > 0) {
                    return;
                }
            }
            if (o25.a().b()) {
                int i = 1;
                rsg0.T(new qn()).subscribe(new az(new oc0(0), i), new cz(new bz(i), 1));
            }
        }
    }

    public static void d() {
        e(null);
    }

    public static void e(t31 t31Var) {
        a = t31Var;
        String str = e;
        String str2 = d;
        String str3 = c;
        if (t31Var == null) {
            Preference.C(str3, str2);
            Preference.C(str3, str);
        } else {
            Preference.H(str3, str2, t31Var.a);
            Preference.H(str3, str, String.valueOf(t31Var.b));
        }
    }
}
