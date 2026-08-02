package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SafeCollector.common.kt */
/* loaded from: classes8.dex */
public final class psr implements ksr<Object> {
    public final /* synthetic */ SuspendLambda b;

    /* JADX WARN: Multi-variable type inference failed */
    public psr(yzs yzsVar) {
        this.b = (SuspendLambda) yzsVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, xsna.yzs] */
    @Override // xsna.ksr
    public final Object collect(lsr<? super Object> lsrVar, spj<? super s3q0> spjVar) {
        qsr qsrVar = new qsr(this.b, lsrVar, null);
        osr osrVar = new osr(spjVar, spjVar.getContext());
        Object c = e2l.c(osrVar, true, osrVar, qsrVar);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : s3q0.a;
    }
}
