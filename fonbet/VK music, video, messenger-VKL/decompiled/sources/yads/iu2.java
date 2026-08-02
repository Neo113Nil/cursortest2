package yads;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.izs;
import xsna.s3q0;
import xsna.spj;

/* loaded from: classes10.dex */
public final class iu2 extends SuspendLambda implements izs {
    public iu2(spj spjVar) {
        super(1, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(spj spjVar) {
        return new iu2(spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        new iu2((spj) obj);
        s3q0 s3q0Var = s3q0.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.a.a(s3q0Var);
        return nu2.d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.a.a(obj);
        return nu2.d;
    }
}
