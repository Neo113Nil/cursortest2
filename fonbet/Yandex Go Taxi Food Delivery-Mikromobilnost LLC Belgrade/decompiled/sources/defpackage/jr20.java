package defpackage;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes8.dex */
public final class jr20 {
    public final sls a;
    public final rot b;
    public ike c;

    public jr20(sls slsVar, rot rotVar) {
        this.a = slsVar;
        this.b = rotVar;
    }

    public static pzt0 b(jr20 jr20Var, jse jseVar, wls wlsVar, int i) {
        fse fseVar = jseVar;
        if ((i & 1) != 0) {
            fseVar = EmptyCoroutineContext.a;
        }
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        ike ikeVar = jr20Var.c;
        if (ikeVar == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Using cancelled scope instead of MOB_SCOPE");
            ike b = bvf0.b();
            bvf0.i(b, "Already cancelled", illegalStateException);
            ikeVar = b;
        }
        return tje.M(ikeVar, fseVar, coroutineStart, wlsVar);
    }

    public final void a() {
        this.c = bvf0.M(bvf0.M(bvf0.a(cvw.U(jl40.a(), (fse) this.a.invoke())), new pse("MOB_SCOPE")), new ir20(this.b, new Throwable().getStackTrace()));
    }
}
