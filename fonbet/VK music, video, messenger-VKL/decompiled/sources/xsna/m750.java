package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.music.stickyplayer.domain.PlayerContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.sx40;

/* compiled from: MusicStandaloneBottomPlayer.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.components.MusicStandaloneBottomPlayerKt$MusicStandaloneBottomPlayer$1$4$1", f = "MusicStandaloneBottomPlayer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class m750 extends SuspendLambda implements yzs<yvj, Float, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $canGoBack;
    final /* synthetic */ boolean $canGoForward;
    final /* synthetic */ b78 $state;
    final /* synthetic */ kg50 $totalDrag$delegate;
    /* synthetic */ float F$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m750(boolean z, b78 b78Var, boolean z2, kg50 kg50Var, spj<? super m750> spjVar) {
        super(3, spjVar);
        this.$canGoBack = z;
        this.$state = b78Var;
        this.$canGoForward = z2;
        this.$totalDrag$delegate = kg50Var;
    }

    @Override // xsna.yzs
    public final Object invoke(yvj yvjVar, Float f, spj<? super s3q0> spjVar) {
        float floatValue = f.floatValue();
        m750 m750Var = new m750(this.$canGoBack, this.$state, this.$canGoForward, this.$totalDrag$delegate, spjVar);
        m750Var.F$0 = floatValue;
        return m750Var.invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float f = this.F$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (Math.abs(this.$totalDrag$delegate.getFloatValue()) > 100.0f) {
            if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (this.$canGoBack) {
                    this.$state.a().invoke(new sx40.h0(PlayerContext.MINI_STANDALONE));
                }
            } else if (this.$canGoForward) {
                this.$state.a().invoke(new sx40.g0(PlayerContext.MINI_STANDALONE));
            }
        }
        this.$totalDrag$delegate.g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        return s3q0.a;
    }
}
