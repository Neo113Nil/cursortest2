package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class bl6 implements r630 {
    public final sls a;
    public final cc4 b;

    public bl6(cii0 cii0Var) {
        this.a = cii0Var;
        this.b = new cc4();
    }

    @Override // defpackage.fse
    public final Object fold(Object obj, wls wlsVar) {
        return wlsVar.invoke(obj, this);
    }

    @Override // defpackage.fse
    public final dse get(ese eseVar) {
        return ffx.H(this, eseVar);
    }

    @Override // defpackage.fse
    public final fse minusKey(ese eseVar) {
        return ffx.Y(this, eseVar);
    }

    @Override // defpackage.fse
    public final fse plus(fse fseVar) {
        return cvw.U(this, fseVar);
    }

    @Override // defpackage.r630
    public final Object v(tls tlsVar, Continuation continuation) {
        j18 j18Var = new j18(1, dvw.b(continuation));
        j18Var.u();
        al6 al6Var = new al6();
        al6Var.a = j18Var;
        al6Var.b = tlsVar;
        j18Var.w(new dq0(1, this.b.a(al6Var, this.a)));
        Object s = j18Var.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }

    public bl6() {
        this(null);
    }
}
