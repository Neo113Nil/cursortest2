package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AuthorHeaderLiveCoverVideoPlayer.kt */
@b6l(c = "com.vk.profile.core.livecover.AuthorHeaderLiveCoverVideoPlayerKt$AuthorHeaderLiveCoverVideoPlayer$10$1", f = "AuthorHeaderLiveCoverVideoPlayer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ca5 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wh50<yg5> $autoPlay$delegate;
    final /* synthetic */ mtk0<Boolean> $canPlayState$delegate;
    final /* synthetic */ mtk0<Boolean> $isExpandedState$delegate;
    final /* synthetic */ rg50 $lastConsumedSamePageReplayRequest$delegate;
    final /* synthetic */ mtk0<Integer> $lastConsumedSamePageReplayRequestState$delegate;
    final /* synthetic */ wh50<Boolean> $pendingSamePageLoopReplay$delegate;
    final /* synthetic */ s95 $playbackController;
    final /* synthetic */ mtk0<Integer> $samePageReplayRequestState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca5(s95 s95Var, mtk0<Integer> mtk0Var, mtk0<Integer> mtk0Var2, rg50 rg50Var, mtk0<Boolean> mtk0Var3, wh50<Boolean> wh50Var, wh50<yg5> wh50Var2, mtk0<Boolean> mtk0Var4, spj<? super ca5> spjVar) {
        super(2, spjVar);
        this.$playbackController = s95Var;
        this.$samePageReplayRequestState$delegate = mtk0Var;
        this.$lastConsumedSamePageReplayRequestState$delegate = mtk0Var2;
        this.$lastConsumedSamePageReplayRequest$delegate = rg50Var;
        this.$canPlayState$delegate = mtk0Var3;
        this.$pendingSamePageLoopReplay$delegate = wh50Var;
        this.$autoPlay$delegate = wh50Var2;
        this.$isExpandedState$delegate = mtk0Var4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ca5(this.$playbackController, this.$samePageReplayRequestState$delegate, this.$lastConsumedSamePageReplayRequestState$delegate, this.$lastConsumedSamePageReplayRequest$delegate, this.$canPlayState$delegate, this.$pendingSamePageLoopReplay$delegate, this.$autoPlay$delegate, this.$isExpandedState$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ca5) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (this.$samePageReplayRequestState$delegate.getValue().intValue() <= this.$lastConsumedSamePageReplayRequestState$delegate.getValue().intValue()) {
            return s3q0.a;
        }
        this.$lastConsumedSamePageReplayRequest$delegate.C(this.$samePageReplayRequestState$delegate.getValue().intValue());
        if (!this.$canPlayState$delegate.getValue().booleanValue()) {
            this.$pendingSamePageLoopReplay$delegate.setValue(Boolean.TRUE);
            return s3q0.a;
        }
        yg5 value = this.$autoPlay$delegate.getValue();
        if (value == null) {
            this.$pendingSamePageLoopReplay$delegate.setValue(Boolean.TRUE);
            return s3q0.a;
        }
        this.$playbackController.a(value, ha5.b(this.$isExpandedState$delegate));
        value.S(false);
        return s3q0.a;
    }
}
