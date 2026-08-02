package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AuthorHeaderLiveCoverVideoPlayer.kt */
@b6l(c = "com.vk.profile.core.livecover.AuthorHeaderLiveCoverVideoPlayerKt$AuthorHeaderLiveCoverVideoPlayer$11$1", f = "AuthorHeaderLiveCoverVideoPlayer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class da5 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wh50<yg5> $autoPlay$delegate;
    final /* synthetic */ mtk0<Boolean> $isExpandedState$delegate;
    final /* synthetic */ s95 $playbackController;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da5(s95 s95Var, wh50<yg5> wh50Var, mtk0<Boolean> mtk0Var, spj<? super da5> spjVar) {
        super(2, spjVar);
        this.$playbackController = s95Var;
        this.$autoPlay$delegate = wh50Var;
        this.$isExpandedState$delegate = mtk0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new da5(this.$playbackController, this.$autoPlay$delegate, this.$isExpandedState$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((da5) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        yg5 value = this.$autoPlay$delegate.getValue();
        if (value == null) {
            return s3q0.a;
        }
        this.$playbackController.a(value, ha5.b(this.$isExpandedState$delegate));
        return s3q0.a;
    }
}
