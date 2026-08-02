package defpackage;

import android.app.Application;

/* loaded from: classes5.dex */
public final class dli implements v7p {
    public static io9 a() {
        y8g u = bvf0.u();
        gjz gjzVar = u.a;
        Application application = (Application) gjzVar.b.c;
        q5z.h(application);
        qcp0 qcp0Var = new qcp0();
        hwy0 c = gjzVar.c();
        hjz h = u.h();
        dci b = gjzVar.b();
        q5z.h(b);
        return new io9(new v920(application, qcp0Var, c, h, b, (q8s) u.X0.get()));
    }

    @Override // defpackage.yvf0
    public final Object get() {
        return a();
    }
}
