package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.h700;
import xsna.s600;

/* compiled from: DownloadAnimatedIcon.kt */
@b6l(c = "com.vk.music.bottomsheets.track.redesigned.presentation.components.DownloadAnimatedIconKt$DownloadAnimatedIcon$1$1", f = "DownloadAnimatedIcon.kt", l = {TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class e8o extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ float $actualSpeed;
    final /* synthetic */ s600 $animatable;
    final /* synthetic */ h700.a $clipSpec;
    final /* synthetic */ s700 $composition$delegate;
    final /* synthetic */ wh50<h700.a> $lastClipSpec$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8o(s600 s600Var, float f, h700.a aVar, wh50<h700.a> wh50Var, s700 s700Var, spj<? super e8o> spjVar) {
        super(2, spjVar);
        this.$animatable = s600Var;
        this.$actualSpeed = f;
        this.$clipSpec = aVar;
        this.$lastClipSpec$delegate = wh50Var;
        this.$composition$delegate = s700Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new e8o(this.$animatable, this.$actualSpeed, this.$clipSpec, this.$lastClipSpec$delegate, this.$composition$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((e8o) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.$lastClipSpec$delegate.getValue() != null) {
                s600 s600Var = this.$animatable;
                i700 value = this.$composition$delegate.getValue();
                float f = this.$actualSpeed;
                h700.a aVar = this.$clipSpec;
                this.label = 1;
                if (s600.a.a(s600Var, value, 0, false, f, aVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, this, 1998) == coroutineSingletons) {
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
