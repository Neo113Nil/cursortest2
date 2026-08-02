package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MarketProductGallery.kt */
@b6l(c = "com.vk.ecomm.design.compose.gallery.MarketProductGalleryKt$ProductGallerySlider$3$1", f = "MarketProductGallery.kt", l = {167}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class rb10 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ mc90 $pagerState;
    final /* synthetic */ int $position;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb10(mc90 mc90Var, int i, spj<? super rb10> spjVar) {
        super(2, spjVar);
        this.$pagerState = mc90Var;
        this.$position = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new rb10(this.$pagerState, this.$position, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((rb10) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            int k = this.$pagerState.k();
            int i2 = this.$position;
            if (k != i2) {
                mc90 mc90Var = this.$pagerState;
                this.label = 1;
                if (mc90Var.w(i2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this) == coroutineSingletons) {
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
