package xsna;

import androidx.compose.foundation.gestures.Orientation;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ContentWithBottomPlayer.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.ContentWithBottomPlayerKt$ContentWithBottomPlayer$2$1", f = "ContentWithBottomPlayer.kt", l = {68}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class tmj extends SuspendLambda implements yzs<yvj, Float, spj<? super s3q0>, Object> {
    final /* synthetic */ oy40 $scrollConnection;
    /* synthetic */ float F$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tmj(oy40 oy40Var, spj<? super tmj> spjVar) {
        super(3, spjVar);
        this.$scrollConnection = oy40Var;
    }

    @Override // xsna.yzs
    public final Object invoke(yvj yvjVar, Float f, spj<? super s3q0> spjVar) {
        float floatValue = f.floatValue();
        tmj tmjVar = new tmj(this.$scrollConnection, spjVar);
        tmjVar.F$0 = floatValue;
        return tmjVar.invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float f = this.F$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            oy40 oy40Var = this.$scrollConnection;
            this.F$0 = f;
            this.label = 1;
            Object m0 = oy40Var.m0(0L, oy40Var.b == Orientation.Vertical ? m200.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f) : m200.b(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), this);
            if (m0 != coroutineSingletons) {
                m0 = s3q0.a;
            }
            if (m0 == coroutineSingletons) {
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
