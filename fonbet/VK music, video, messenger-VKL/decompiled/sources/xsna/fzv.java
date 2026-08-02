package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.q1w;

/* compiled from: ImCmdCoroutinesExecutorImpl.kt */
/* loaded from: classes2.dex */
public final class fzv implements ezv {
    public final a1w a;

    public fzv(a1w a1wVar) {
        this.a = a1wVar;
    }

    @Override // xsna.ezv
    public final Object a(Object obj, e1w e1wVar, ContinuationImpl continuationImpl) {
        a1w a1wVar = this.a;
        a1wVar.getClass();
        lq9 lq9Var = new lq9(1, s7s0.c(continuationImpl));
        lq9Var.o();
        e1wVar.d(obj);
        lq9Var.r(new b1w(a1wVar.j(e1wVar).subscribe(new q1w.a(new dr8(lq9Var, 3)), new q1w.a(new n8c(lq9Var, 2)))));
        Object n = lq9Var.n();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return n;
    }
}
