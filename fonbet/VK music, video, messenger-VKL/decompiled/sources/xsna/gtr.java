package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;

/* compiled from: SafeCollector.common.kt */
/* loaded from: classes11.dex */
public final class gtr implements ksr<Object> {
    public final /* synthetic */ ksr b;
    public final /* synthetic */ SuspendLambda c;

    /* JADX WARN: Multi-variable type inference failed */
    public gtr(ksr ksrVar, wzs wzsVar) {
        this.b = ksrVar;
        this.c = (SuspendLambda) wzsVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, xsna.wzs] */
    @Override // xsna.ksr
    public final Object collect(lsr<? super Object> lsrVar, spj<? super s3q0> spjVar) {
        Object collect = this.b.collect(new htr(new Ref$BooleanRef(), lsrVar, this.c), spjVar);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
    }
}
