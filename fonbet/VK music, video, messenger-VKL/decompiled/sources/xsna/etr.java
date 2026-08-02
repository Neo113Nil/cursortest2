package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: SafeCollector.common.kt */
/* loaded from: classes8.dex */
public final class etr implements ksr<Object> {
    public final /* synthetic */ ksr b;

    public etr(ksr ksrVar) {
        this.b = ksrVar;
    }

    @Override // xsna.ksr
    public final Object collect(lsr<? super Object> lsrVar, spj<? super s3q0> spjVar) {
        Object collect = this.b.collect(new ftr(new Ref$IntRef(), lsrVar), spjVar);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
    }
}
