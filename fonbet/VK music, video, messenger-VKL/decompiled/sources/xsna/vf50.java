package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MusicWithBottomPlayer.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.MusicWithBottomPlayerKt$MusicContent$1$1", f = "MusicWithBottomPlayer.kt", l = {176}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class vf50 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ f3b0 $screenState;
    final /* synthetic */ dlv0 $snackbarHostState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf50(dlv0 dlv0Var, f3b0 f3b0Var, spj<? super vf50> spjVar) {
        super(2, spjVar);
        this.$snackbarHostState = dlv0Var;
        this.$screenState = f3b0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new vf50(this.$snackbarHostState, this.$screenState, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((vf50) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            dlv0 dlv0Var = this.$snackbarHostState;
            String s7k0Var = this.$screenState.b().toString();
            this.label = 1;
            if (dlv0.d(dlv0Var, s7k0Var, null, this, 30) == coroutineSingletons) {
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
