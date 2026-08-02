package yads;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class ju2 extends SuspendLambda implements wzs {
    public int b;
    public final /* synthetic */ mu2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju2(mu2 mu2Var, spj spjVar) {
        super(2, spjVar);
        this.c = mu2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new ju2(this.c, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return new ju2(this.c, (spj) obj2).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            kotlin.a.a(obj);
            dw2 dw2Var = this.c.e;
            t61 t61Var = t61.f;
            this.b = 1;
            obj = dw2Var.a(t61Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        uv2 uv2Var = (uv2) obj;
        if (uv2Var instanceof tv2) {
            return null;
        }
        if (uv2Var instanceof sv2) {
            return nu2.c;
        }
        throw new NoWhenBranchMatchedException();
    }
}
