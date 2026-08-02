package defpackage;

import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes.dex */
public final class k1w0 {
    public final lx4 a;

    public k1w0(lx4 lx4Var) {
        this.a = lx4Var;
    }

    public static String a(pwz0 pwz0Var) {
        return jl40.l(pwz0Var, nwz0.a) ? "geo_disabled" : jl40.l(pwz0Var, mwz0.a) ? "missed_geo_permission" : pwz0Var instanceof owz0 ? "unsupported_address" : "other";
    }

    public final void b(pwz0 pwz0Var) {
        String str;
        if (pwz0Var instanceof owz0) {
            str = "SuperappMain.UnavailableLocationWidget.Shown";
        } else {
            if (!jl40.l(pwz0Var, nwz0.a) && !jl40.l(pwz0Var, mwz0.a)) {
                if (jl40.l(pwz0Var, lwz0.a)) {
                    return;
                }
                w511.b();
                return;
            }
            str = "SuperappMain.UnavailableLocationServiceWidget.Shown";
        }
        i d = ((j) this.a).d(str);
        d.a.put("type", a(pwz0Var));
        d.m();
    }
}
