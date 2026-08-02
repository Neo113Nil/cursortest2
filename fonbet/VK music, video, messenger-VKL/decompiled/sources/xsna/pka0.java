package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PictureOverlayState.kt */
@b6l(c = "com.vk.profile.design.compose.header.header.picture.paging.PictureOverlayStateKt$rememberDelayedLoadingVisibility$1$1", f = "PictureOverlayState.kt", l = {110}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class pka0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ wh50<Boolean> $isVisible$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pka0(spj spjVar, wh50 wh50Var, boolean z) {
        super(2, spjVar);
        this.$isLoading = z;
        this.$isVisible$delegate = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new pka0(spjVar, this.$isVisible$delegate, this.$isLoading);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((pka0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (!this.$isLoading) {
                this.$isVisible$delegate.setValue(Boolean.FALSE);
                return s3q0.a;
            }
            this.$isVisible$delegate.setValue(Boolean.FALSE);
            this.label = 1;
            if (qsl.b(1500L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        this.$isVisible$delegate.setValue(Boolean.TRUE);
        return s3q0.a;
    }
}
