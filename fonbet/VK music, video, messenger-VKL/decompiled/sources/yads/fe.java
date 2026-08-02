package yads;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class fe extends SuspendLambda implements wzs {
    public final /* synthetic */ ie b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe(ie ieVar, spj spjVar) {
        super(2, spjVar);
        this.b = ieVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new fe(this.b, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return new fe(this.b, (spj) obj2).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.a.a(obj);
        return this.b.c.a();
    }
}
