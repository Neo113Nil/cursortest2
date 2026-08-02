package yads;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class xz1 extends SuspendLambda implements wzs {
    public int b;
    public final /* synthetic */ zz1 c;
    public final /* synthetic */ oi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz1(zz1 zz1Var, oi oiVar, spj spjVar) {
        super(2, spjVar);
        this.c = zz1Var;
        this.d = oiVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new xz1(this.c, this.d, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return new xz1(this.c, this.d, (spj) obj2).invokeSuspend(s3q0.a);
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
        zz1 zz1Var = this.c;
        oi oiVar = this.d;
        this.b = 1;
        Object a = zz1.a(zz1Var, oiVar, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
