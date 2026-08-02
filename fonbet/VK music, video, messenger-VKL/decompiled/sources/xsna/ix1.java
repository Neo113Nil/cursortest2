package xsna;

import com.vk.uxpolls.api.models.UxPollsAnswer;
import com.vk.uxpolls.api.models.UxPollsPoll;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.u5r0;

/* compiled from: AnalyticsControllerImpl.kt */
@b6l(c = "com.vk.uxpolls.presentation.controller.AnalyticsControllerImpl$handleSendAnswer$1", f = "AnalyticsControllerImpl.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class ix1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ List<UxPollsAnswer> $answers;
    final /* synthetic */ UxPollsPoll $poll;
    final /* synthetic */ String $trigger;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ kx1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix1(kx1 kx1Var, UxPollsPoll uxPollsPoll, String str, List<UxPollsAnswer> list, spj<? super ix1> spjVar) {
        super(2, spjVar);
        this.this$0 = kx1Var;
        this.$poll = uxPollsPoll;
        this.$trigger = str;
        this.$answers = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        ix1 ix1Var = new ix1(this.this$0, this.$poll, this.$trigger, this.$answers, spjVar);
        ix1Var.L$0 = obj;
        return ix1Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ix1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            u5r0 u5r0Var = (u5r0) this.this$0.d.getValue();
            kotlin.coroutines.d coroutineContext = yvjVar.getCoroutineContext();
            blq0 blq0Var = l4r0.a;
            if (blq0Var == null) {
                blq0Var = null;
            }
            asl b = u5r0Var.b(coroutineContext, new u5r0.a(blq0Var, this.$poll.getId(), this.$trigger, this.$answers));
            this.L$0 = null;
            this.label = 1;
            if (b.J(this) == coroutineSingletons) {
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
