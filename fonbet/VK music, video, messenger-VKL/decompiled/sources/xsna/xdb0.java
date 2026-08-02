package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PlaylistScreenView.kt */
@b6l(c = "com.vk.video.playlist.playlistscreen.ui.view.PlaylistScreenViewKt$PlaylistScreenView$2$1", f = "PlaylistScreenView.kt", l = {61}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class xdb0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ dlv0 $snackbarHostState;
    final /* synthetic */ zdb0 $state;
    int I$0;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xdb0(zdb0 zdb0Var, dlv0 dlv0Var, spj<? super xdb0> spjVar) {
        super(2, spjVar);
        this.$state = zdb0Var;
        this.$snackbarHostState = dlv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new xdb0(this.$state, this.$snackbarHostState, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((xdb0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.$state.d != null) {
                dlv0 dlv0Var = this.$snackbarHostState;
                dlv0Var.a();
                this.L$0 = null;
                this.I$0 = 0;
                this.label = 1;
                if (dlv0.d(dlv0Var, "", null, this, 30) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
