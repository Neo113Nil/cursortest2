package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CoverView.kt */
@b6l(c = "com.vk.video.playlist.playlistscreen.ui.view.CoverViewKt$CoverView$1$1$1", f = "CoverView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class k3k extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ w7b0 $buttonsViewState;
    final /* synthetic */ wh50<Boolean> $buttonsVisible;
    final /* synthetic */ lg90 $remotePainter;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3k(lg90 lg90Var, w7b0 w7b0Var, wh50<Boolean> wh50Var, spj<? super k3k> spjVar) {
        super(2, spjVar);
        this.$remotePainter = lg90Var;
        this.$buttonsViewState = w7b0Var;
        this.$buttonsVisible = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new k3k(this.$remotePainter, this.$buttonsViewState, this.$buttonsVisible, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((k3k) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (this.$remotePainter != null && this.$buttonsViewState != null) {
            this.$buttonsVisible.setValue(Boolean.TRUE);
        }
        return s3q0.a;
    }
}
