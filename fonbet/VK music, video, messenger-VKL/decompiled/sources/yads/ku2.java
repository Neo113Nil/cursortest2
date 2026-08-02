package yads;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class ku2 extends SuspendLambda implements wzs {
    public /* synthetic */ Object b;

    public ku2(spj spjVar) {
        super(2, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        ku2 ku2Var = new ku2(spjVar);
        ku2Var.b = obj;
        return ku2Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        ku2 ku2Var = new ku2((spj) obj2);
        ku2Var.b = (nu2) obj;
        return ku2Var.invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.a.a(obj);
        return (nu2) this.b;
    }
}
