package xsna;

import com.vk.im.chat.restriction.impl.domain.WriteRestrictionAction;
import com.vk.im.engine.models.dialogs.DialogMember;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: WriteRestrictionInteractor.kt */
@b6l(c = "com.vk.im.chat.restriction.impl.domain.WriteRestrictionInteractor$fetchCurrentAction$2", f = "WriteRestrictionInteractor.kt", l = {30}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class u2y0 extends SuspendLambda implements wzs<yvj, spj<? super WriteRestrictionAction>, Object> {
    final /* synthetic */ e1w<dem> $cmd;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ v2y0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2y0(v2y0 v2y0Var, e1w<dem> e1wVar, spj<? super u2y0> spjVar) {
        super(2, spjVar);
        this.this$0 = v2y0Var;
        this.$cmd = e1wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        u2y0 u2y0Var = new u2y0(this.this$0, this.$cmd, spjVar);
        u2y0Var.L$0 = obj;
        return u2y0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super WriteRestrictionAction> spjVar) {
        return ((u2y0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DialogMember dialogMember;
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ezv ezvVar = this.this$0.b;
            e1w<dem> e1wVar = this.$cmd;
            this.L$0 = null;
            this.label = 1;
            obj = ezvVar.a(yvjVar, e1wVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        ohm ohmVar = ((dem) obj).a.b;
        return (ohmVar == null || (dialogMember = (DialogMember) j5g.Z(ohmVar)) == null || !dialogMember.j) ? WriteRestrictionAction.DISABLE : WriteRestrictionAction.ENABLE;
    }
}
