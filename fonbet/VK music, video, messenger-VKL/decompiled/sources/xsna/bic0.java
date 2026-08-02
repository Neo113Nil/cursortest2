package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PostingOtherStepsContentView.kt */
@b6l(c = "com.vk.newsfeed.posting.impl.presentation.base.view.PostingOtherStepsContentView$HintSaveDraftButton$1$1", f = "PostingOtherStepsContentView.kt", l = {Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class bic0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $isOnboardingAvailable;
    final /* synthetic */ gzs<s3q0> $onOnboardingAvailable;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bic0(boolean z, gzs<s3q0> gzsVar, spj<? super bic0> spjVar) {
        super(2, spjVar);
        this.$isOnboardingAvailable = z;
        this.$onOnboardingAvailable = gzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new bic0(this.$isOnboardingAvailable, this.$onOnboardingAvailable, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((bic0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.$isOnboardingAvailable) {
                this.label = 1;
                if (qsl.b(300L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return s3q0.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$onOnboardingAvailable.invoke();
        return s3q0.a;
    }
}
