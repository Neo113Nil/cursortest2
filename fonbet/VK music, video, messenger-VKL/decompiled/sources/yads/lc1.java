package yads;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.qta;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class lc1 extends SuspendLambda implements wzs {
    public int b;
    public final /* synthetic */ nc1 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc1(nc1 nc1Var, String str, spj spjVar) {
        super(2, spjVar);
        this.c = nc1Var;
        this.d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new lc1(this.c, this.d, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return new lc1(this.c, this.d, (spj) obj2).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            kotlin.a.a(obj);
            qta qtaVar = this.c.o;
            l90 l90Var = new l90(this.d);
            this.b = 1;
            if (qtaVar.t(l90Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
