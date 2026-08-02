package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class gd1 implements qjr {
    public final h3y a;

    public gd1(h3y h3yVar) {
        this.a = h3yVar;
    }

    @Override // defpackage.qjr
    public final Object a(omt omtVar, ContinuationImpl continuationImpl) {
        String oaid;
        x4j0 x4j0Var = omtVar.b;
        if (cvu0.s(x4j0Var.a.b(), "mlutp/v1/widgets/layout/superapp", false) && (oaid = ((cp60) this.a.get()).getOaid()) != null) {
            keu d = x4j0Var.b.d();
            d.a("x-adv-oaid", oaid);
            return omtVar.a(x4j0.a(x4j0Var, d.d(), null, 5), continuationImpl);
        }
        return omtVar.a(x4j0Var, continuationImpl);
    }
}
