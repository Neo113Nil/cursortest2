package defpackage;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes.dex */
public final class hbp0 implements tse {
    public final sls a;
    public final String b;
    public final mse c;
    public ike w;

    public /* synthetic */ hbp0(sls slsVar, String str, mse mseVar, int i) {
        this(slsVar, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : mseVar);
    }

    public static pzt0 e(hbp0 hbp0Var, fse fseVar, CoroutineStart coroutineStart, wls wlsVar, int i) {
        if ((i & 1) != 0) {
            fseVar = EmptyCoroutineContext.a;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return tje.M(hbp0Var.c(), fseVar, coroutineStart, wlsVar);
    }

    public final void a() {
        fse fseVar = this.c;
        if (fseVar == null) {
            fseVar = gtq0.i();
        }
        this.w = bvf0.M(bvf0.M(bvf0.a(cvw.U(jl40.a(), (fse) this.a.invoke())), new pse(this.b)), fseVar);
    }

    public final void b() {
        ike ikeVar = this.w;
        if (ikeVar != null) {
            bvf0.i(ikeVar, "detach scope", null);
        }
    }

    public final tse c() {
        ike ikeVar = this.w;
        if (ikeVar != null) {
            return ikeVar;
        }
        IllegalStateException illegalStateException = new IllegalStateException(g8e.o("Using cancelled scope instead of ", this.b));
        xby.d.j(illegalStateException);
        ike b = bvf0.b();
        bvf0.i(b, "Already cancelled", illegalStateException);
        return b;
    }

    public final boolean d() {
        ike ikeVar = this.w;
        return ikeVar != null && bvf0.D(ikeVar);
    }

    public final void f() {
        b();
        a();
    }

    @Override // defpackage.tse
    public final fse getCoroutineContext() {
        return ((ike) c()).a;
    }

    public hbp0(sls slsVar, String str, mse mseVar) {
        this.a = slsVar;
        this.b = str;
        this.c = mseVar;
    }
}
