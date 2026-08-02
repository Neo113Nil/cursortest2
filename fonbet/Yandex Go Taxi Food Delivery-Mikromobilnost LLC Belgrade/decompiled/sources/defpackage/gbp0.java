package defpackage;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes5.dex */
public final class gbp0 implements tse {
    public final sls a;
    public final String b;
    public ike c;

    public gbp0(sls slsVar, String str) {
        this.a = slsVar;
        this.b = str;
    }

    public static pzt0 c(gbp0 gbp0Var, wls wlsVar) {
        return tje.M(gbp0Var.b(), EmptyCoroutineContext.a, CoroutineStart.DEFAULT, wlsVar);
    }

    public final void a() {
        this.c = bvf0.M(bvf0.M(bvf0.a(cvw.U(jl40.a(), (fse) this.a.invoke())), new pse(this.b)), new gz4(new Throwable().getStackTrace(), 1));
    }

    public final tse b() {
        ike ikeVar = this.c;
        if (ikeVar != null) {
            return ikeVar;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Using cancelled scope instead of ".concat(this.b));
        xby.d.j(illegalStateException);
        ike b = bvf0.b();
        bvf0.i(b, "Already cancelled", illegalStateException);
        return b;
    }

    @Override // defpackage.tse
    public final fse getCoroutineContext() {
        return ((ike) b()).a;
    }
}
