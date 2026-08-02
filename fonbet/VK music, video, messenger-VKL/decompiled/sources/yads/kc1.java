package yads;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.myc0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class kc1 extends SuspendLambda implements wzs {
    public int b;
    public final /* synthetic */ nc1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc1(nc1 nc1Var, spj spjVar) {
        super(2, spjVar);
        this.c = nc1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new kc1(this.c, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return new kc1(this.c, (spj) obj2).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        m90 m90Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            kotlin.a.a(obj);
            jz0 jz0Var = this.c.b;
            this.b = 1;
            o80 o80Var = jz0Var.a;
            obj = myc0.k(o80Var.f, new n80(o80Var, null), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        d71 d71Var = (d71) obj;
        if (d71Var instanceof c71) {
            m90Var = new k90(((c71) d71Var).a);
        } else if (d71Var instanceof a71) {
            m90Var = new j90(((a71) d71Var).a);
        } else {
            if (!(d71Var instanceof b71)) {
                throw new NoWhenBranchMatchedException();
            }
            m90Var = i90.a;
        }
        nc1 nc1Var = this.c;
        myc0.h(nc1Var.a, null, null, new jc1(nc1Var, m90Var, null), 3);
        return s3q0.a;
    }
}
