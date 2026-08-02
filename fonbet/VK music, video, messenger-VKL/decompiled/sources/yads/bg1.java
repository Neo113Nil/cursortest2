package yads;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class bg1 extends SuspendLambda implements wzs {
    public int b;
    public final /* synthetic */ dg1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg1(dg1 dg1Var, spj spjVar) {
        super(2, spjVar);
        this.c = dg1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new bg1(this.c, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return new bg1(this.c, (spj) obj2).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return obj;
        }
        kotlin.a.a(obj);
        sf1 sf1Var = this.c.b;
        this.b = 1;
        Object a = sf1Var.a(this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
