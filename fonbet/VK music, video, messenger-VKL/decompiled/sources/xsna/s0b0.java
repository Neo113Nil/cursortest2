package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog.mvi.block.video.impl.video.largelist.entity.VideoLargeListState;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vkontakte.android.R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.mno0;

/* compiled from: PlayerControlsDelegate.kt */
@b6l(c = "com.vk.catalog.mvi.block.video.impl.video.largelist.actor.delegate.PlayerControlsDelegateKt$handleToggleMuteClick$1", f = "PlayerControlsDelegate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class s0b0 extends SuspendLambda implements wzs<yg5, spj<? super s3q0>, Object> {
    final /* synthetic */ ars0 $this_handleToggleMuteClick;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0b0(ars0 ars0Var, spj<? super s0b0> spjVar) {
        super(2, spjVar);
        this.$this_handleToggleMuteClick = ars0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        s0b0 s0b0Var = new s0b0(this.$this_handleToggleMuteClick, spjVar);
        s0b0Var.L$0 = obj;
        return s0b0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yg5 yg5Var, spj<? super s3q0> spjVar) {
        return ((s0b0) create(yg5Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        com.vk.libvideo.autoplay.a aVar;
        VideoRestriction O;
        String str;
        yg5 yg5Var = (yg5) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        VideoFile videoFile = ((VideoLargeListState) ((b2a) this.$this_handleToggleMuteClick.b.b).getCurrentState()).d;
        boolean z = (yg5Var.d() || yg5Var.isPlaying()) && yg5Var.v0() != null;
        boolean z2 = yg5Var.P0() || yg5Var.w0();
        if (z || z2) {
            if (!videoFile.k0() || yg5Var.P0()) {
                ars0 ars0Var = this.$this_handleToggleMuteClick;
                rlt0 m0 = yg5Var.m0();
                com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
                if (com.vk.libvideo.autoplay.e.c()) {
                    com.vk.libvideo.autoplay.e.f(false);
                    z2s0.b.getClass();
                    yg5Var.setVolume(z2s0.n);
                    if (m0 != null) {
                        m0.i("volume", "on");
                    }
                } else {
                    com.vk.libvideo.autoplay.e.f(true);
                    yg5Var.setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    if (m0 != null) {
                        m0.i("volume", "off");
                    }
                }
                final boolean z3 = yg5Var.getVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || ((aVar = ((VideoLargeListState) ((b2a) ars0Var.b.b).getCurrentState()).s) != null && aVar.f()) || videoFile.k0();
                ars0Var.m(new izs() { // from class: xsna.l0b0
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        return VideoLargeListState.a((VideoLargeListState) obj2, null, false, false, null, null, null, false, null, z3 ? new mno0.g(R.string.video_sound_off) : new mno0.g(R.string.video_sound_on), null, null, null, null, null, null, null, null, null, 0, 67076095);
                    }
                });
                m0b0.a(ars0Var);
            } else if (videoFile.k0() && (O = videoFile.O()) != null && (str = O.j) != null) {
                com.vk.music.notifications.inapp.b.f(new qst0(str), null, null, 14);
            }
        }
        return s3q0.a;
    }
}
