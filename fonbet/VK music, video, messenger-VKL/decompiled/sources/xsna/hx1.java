package xsna;

import com.vk.uxpolls.api.models.UxPollsPoll;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.d5r0;

/* compiled from: AnalyticsControllerImpl.kt */
@b6l(c = "com.vk.uxpolls.presentation.controller.AnalyticsControllerImpl$handleHide$1", f = "AnalyticsControllerImpl.kt", l = {97}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class hx1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ String $notifier;
    final /* synthetic */ UxPollsPoll $poll;
    final /* synthetic */ String $projectId;
    final /* synthetic */ String $trigger;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ kx1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx1(kx1 kx1Var, UxPollsPoll uxPollsPoll, String str, String str2, String str3, spj<? super hx1> spjVar) {
        super(2, spjVar);
        this.this$0 = kx1Var;
        this.$poll = uxPollsPoll;
        this.$trigger = str;
        this.$projectId = str2;
        this.$notifier = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        hx1 hx1Var = new hx1(this.this$0, this.$poll, this.$trigger, this.$projectId, this.$notifier, spjVar);
        hx1Var.L$0 = obj;
        return hx1Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((hx1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            d5r0 d5r0Var = (d5r0) this.this$0.c.getValue();
            kotlin.coroutines.d coroutineContext = yvjVar.getCoroutineContext();
            blq0 blq0Var = l4r0.a;
            asl b = d5r0Var.b(coroutineContext, new d5r0.a.C2707a(blq0Var != null ? blq0Var : null, this.$poll.getId(), this.$trigger, this.$projectId, this.$notifier));
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
