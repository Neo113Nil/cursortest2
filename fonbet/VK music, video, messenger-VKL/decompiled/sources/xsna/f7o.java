package xsna;

import android.animation.ValueAnimator;
import android.view.animation.PathInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.rlottie.RLottieDrawable;

/* compiled from: DoubleTapLikeDecoration.kt */
/* loaded from: classes18.dex */
public final class f7o implements RLottieDrawable.a {
    public final /* synthetic */ x6o a;
    public final /* synthetic */ g7o b;
    public final /* synthetic */ RLottieDrawable c;

    public f7o(x6o x6oVar, g7o g7oVar, RLottieDrawable rLottieDrawable) {
        this.a = x6oVar;
        this.b = g7oVar;
        this.c = rLottieDrawable;
    }

    @Override // com.vk.rlottie.RLottieDrawable.a
    public final void a() {
        if (this.a.e) {
            new t61(21);
            ValueAnimator ofInt = ValueAnimator.ofInt(255, 0);
            ofInt.setInterpolator(new PathInterpolator(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.83f, 0.83f));
            ofInt.setStartDelay(415L);
            ofInt.setDuration(333L);
            ofInt.setRepeatCount(0);
            ofInt.addUpdateListener(new of0(this.c, 1));
            ofInt.addListener(new e7o());
            ofInt.start();
            this.b.p = ofInt;
        }
    }

    @Override // com.vk.rlottie.RLottieDrawable.a
    public final void b() {
        g7o g7oVar = this.b;
        g7oVar.m = Integer.MIN_VALUE;
        g7oVar.o = null;
    }
}
