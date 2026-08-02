package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MusicWithBottomPlayer.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.MusicWithBottomPlayerKt$MusicContent$2$1", f = "MusicWithBottomPlayer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class wf50 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ dlv0 $snackbarHostState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf50(dlv0 dlv0Var, spj<? super wf50> spjVar) {
        super(2, spjVar);
        this.$snackbarHostState = dlv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new wf50(this.$snackbarHostState, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((wf50) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$snackbarHostState.a();
        return s3q0.a;
    }
}
