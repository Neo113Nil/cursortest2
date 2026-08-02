package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.dz40;

/* compiled from: AudioBookWithBottomPlayer.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.AudioBookWithBottomPlayerKt$AudioBookContent$4$1$1$1$1", f = "AudioBookWithBottomPlayer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class xk4 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ mtk0<dz40.g> $covers$delegate;
    final /* synthetic */ pfl0 $coversController;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk4(pfl0 pfl0Var, mtk0<dz40.g> mtk0Var, spj<? super xk4> spjVar) {
        super(2, spjVar);
        this.$coversController = pfl0Var;
        this.$covers$delegate = mtk0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new xk4(this.$coversController, this.$covers$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((xk4) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$coversController.a(new wow(this.$covers$delegate.getValue().a));
        return s3q0.a;
    }
}
