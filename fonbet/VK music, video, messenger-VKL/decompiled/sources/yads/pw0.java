package yads;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* loaded from: classes10.dex */
public final class pw0 extends SuspendLambda implements wzs {
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ sw0 d;
    public final /* synthetic */ eo2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw0(sw0 sw0Var, eo2 eo2Var, spj spjVar) {
        super(2, spjVar);
        this.d = sw0Var;
        this.e = eo2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        pw0 pw0Var = new pw0(this.d, this.e, spjVar);
        pw0Var.c = obj;
        return pw0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return ((pw0) create((yvj) obj, (spj) obj2)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                sw0 sw0Var = this.d;
                eo2 eo2Var = this.e;
                this.b = 1;
                obj = sw0Var.a(eo2Var, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            failure = (Boolean) obj;
            failure.getClass();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return new Result(failure);
    }
}
