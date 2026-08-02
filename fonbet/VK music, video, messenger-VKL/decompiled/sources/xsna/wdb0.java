package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PlaylistScreenView.kt */
@b6l(c = "com.vk.video.playlist.playlistscreen.ui.view.PlaylistScreenViewKt$PlaylistScreenView$1$1", f = "PlaylistScreenView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class wdb0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $isEmptyStateWithoutCover;
    final /* synthetic */ zdb0 $state;
    final /* synthetic */ x6p0 $topAppBarState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wdb0(boolean z, x6p0 x6p0Var, zdb0 zdb0Var, spj<? super wdb0> spjVar) {
        super(2, spjVar);
        this.$isEmptyStateWithoutCover = z;
        this.$topAppBarState = x6p0Var;
        this.$state = zdb0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new wdb0(this.$isEmptyStateWithoutCover, this.$topAppBarState, this.$state, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((wdb0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (this.$isEmptyStateWithoutCover) {
            x6p0 x6p0Var = this.$topAppBarState;
            x6p0Var.e(x6p0Var.c());
        } else if (this.$state.g) {
            this.$topAppBarState.e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        return s3q0.a;
    }
}
