package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import one.video.player.OneVideoPlayer;

/* compiled from: PlayerControlsDelegate.kt */
@b6l(c = "com.vk.catalog.mvi.block.video.impl.video.largelist.actor.delegate.PlayerControlsDelegateKt$handleToggleSubtitleClick$1", f = "PlayerControlsDelegate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class t0b0 extends SuspendLambda implements wzs<yg5, spj<? super s3q0>, Object> {
    final /* synthetic */ ars0 $this_handleToggleSubtitleClick;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0b0(ars0 ars0Var, spj<? super t0b0> spjVar) {
        super(2, spjVar);
        this.$this_handleToggleSubtitleClick = ars0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        t0b0 t0b0Var = new t0b0(this.$this_handleToggleSubtitleClick, spjVar);
        t0b0Var.L$0 = obj;
        return t0b0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yg5 yg5Var, spj<? super s3q0> spjVar) {
        return ((t0b0) create(yg5Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OneVideoPlayer a;
        yg5 yg5Var = (yg5) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        d3b0 v0 = yg5Var.v0();
        if (v0 != null && (a = v0.a()) != null) {
            ars0 ars0Var = this.$this_handleToggleSubtitleClick;
            if (a.Q() != null) {
                a.t();
            } else {
                one.video.player.tracks.b bVar = (one.video.player.tracks.b) j5g.a0(yg5Var.O0());
                if (bVar != null) {
                    a.z(bVar);
                }
            }
            ars0Var.m(new u3u(a.Q(), 23));
            m0b0.a(ars0Var);
        }
        return s3q0.a;
    }
}
