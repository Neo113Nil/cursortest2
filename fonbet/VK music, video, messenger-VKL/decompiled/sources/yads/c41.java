package yads;

import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.phd0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.zhd0;

/* loaded from: classes10.dex */
public final class c41 extends SuspendLambda implements wzs {
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ f41 d;
    public final /* synthetic */ Set e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c41(f41 f41Var, Set set, spj spjVar) {
        super(2, spjVar);
        this.d = f41Var;
        this.e = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        c41 c41Var = new c41(this.d, this.e, spjVar);
        c41Var.c = obj;
        return c41Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return ((c41) create((zhd0) obj, (spj) obj2)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            kotlin.a.a(obj);
            zhd0 zhd0Var = (zhd0) this.c;
            this.d.a(this.e, new b41(zhd0Var));
            this.b = 1;
            if (phd0.a(zhd0Var, new xsna.ob0(25), this) == coroutineSingletons) {
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
