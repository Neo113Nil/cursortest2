package xsna;

import android.content.Context;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.g0v;

/* compiled from: GetHealthConnectWorkoutsCommand.kt */
@b6l(c = "com.vk.superapp.vkworkout.infrastructure.commands.GetHealthConnectWorkoutsCommand$checkHealthConnectPermissions$1", f = "GetHealthConnectWorkoutsCommand.kt", l = {178}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class ast extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ bst this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ast(bst bstVar, spj<? super ast> spjVar) {
        super(1, spjVar);
        this.this$0 = bstVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new ast(this.this$0, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((ast) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        g0v g0vVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            Context mo2getContext = this.this$0.e.mo2getContext();
            if (mo2getContext == null) {
                return s3q0.a;
            }
            bst bstVar = this.this$0;
            this.label = 1;
            obj = bst.d(bstVar, mo2getContext, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        iyu0 iyu0Var = (iyu0) obj;
        if (iyu0Var == null || (g0vVar = iyu0Var.f) == null) {
            return s3q0.a;
        }
        if (g0vVar.equals(g0v.b.a)) {
            bst bstVar2 = this.this$0;
            Context mo2getContext2 = bstVar2.e.mo2getContext();
            if (mo2getContext2 != null) {
                bstVar2.g(mo2getContext2);
            }
        } else {
            bst bstVar3 = this.this$0;
            bstVar3.l.a(bstVar3.k);
        }
        return s3q0.a;
    }
}
