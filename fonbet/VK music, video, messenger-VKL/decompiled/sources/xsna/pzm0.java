package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SubscriptionProposalHolder.kt */
@b6l(c = "com.vk.video.ui.discovery.minimizable.player.views.SubscriptionProposalHolder$bindViewState$2", f = "SubscriptionProposalHolder.kt", l = {Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class pzm0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ sdh0 $state;
    int label;
    final /* synthetic */ szm0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pzm0(szm0 szm0Var, sdh0 sdh0Var, spj<? super pzm0> spjVar) {
        super(2, spjVar);
        this.this$0 = szm0Var;
        this.$state = sdh0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new pzm0(this.this$0, this.$state, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((pzm0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            caj0 caj0Var = this.this$0.k;
            sdh0 sdh0Var = this.$state;
            this.label = 1;
            if (caj0Var.emit(sdh0Var, this) == coroutineSingletons) {
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
