package xsna;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.util.Size;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: ImRemoteConfig.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.dex */
public final class mbw implements uuf0 {
    public static final mbw a;
    public static final /* synthetic */ qcy<Object>[] b;
    public static final g9e0 c;
    public static final g9e0 d;
    public static final Size e;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(mbw.class, "prefs", "getPrefs()Landroid/content/SharedPreferences;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
        a = new mbw();
        g9e0 g9e0Var = new g9e0(new knf(9));
        c = g9e0Var;
        d = g9e0Var;
        e = new Size(480, 480);
    }

    public static SharedPreferences c() {
        qcy<Object> qcyVar = b[0];
        return (SharedPreferences) d.b();
    }

    public static Size d(String str) {
        if (str != null) {
            List c0 = drm0.c0(str, new String[]{"x"}, 0, 6);
            String str2 = (String) j5g.b0(0, c0);
            Integer m = str2 != null ? arm0.m(10, str2) : null;
            String str3 = (String) j5g.b0(1, c0);
            Integer m2 = str3 != null ? arm0.m(10, str3) : null;
            if (m != null && m2 != null) {
                return new Size(m.intValue(), m2.intValue());
            }
        }
        return e;
    }

    @Override // xsna.uuf0
    public final boolean a() {
        return c().getBoolean("is_modal_web_view_enabled", false);
    }

    @Override // xsna.uuf0
    public final boolean b() {
        return c().getBoolean("is_reset_counters_tooltip_enabled", false);
    }
}
