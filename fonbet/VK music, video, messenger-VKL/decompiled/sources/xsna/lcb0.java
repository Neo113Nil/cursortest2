package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PlaylistScreenContent.kt */
@b6l(c = "com.vk.music.playlist.framework.presentation.screen.PlaylistScreenContentKt$PlaylistScreenContent$1$1", f = "PlaylistScreenContent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class lcb0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ icb0 $actionProcessor;
    final /* synthetic */ mtk0<Float> $normalizedFraction$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lcb0(icb0 icb0Var, mtk0<Float> mtk0Var, spj<? super lcb0> spjVar) {
        super(2, spjVar);
        this.$actionProcessor = icb0Var;
        this.$normalizedFraction$delegate = mtk0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new lcb0(this.$actionProcessor, this.$normalizedFraction$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((lcb0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$actionProcessor.a(this.$normalizedFraction$delegate.getValue().floatValue());
        return s3q0.a;
    }
}
