package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.newsfeed.api.posting.viewpresenter.PreviewRatio;
import com.vkontakte.android.R;

/* compiled from: CropOnboardingView.kt */
/* loaded from: classes4.dex */
public final class xhk extends FrameLayout {
    public final io.reactivex.rxjava3.disposables.b b;
    public final ImageView c;
    public final ImageView d;
    public boolean e;

    public xhk(Context context) {
        super(context, null, 0);
        this.b = new io.reactivex.rxjava3.disposables.b();
        LayoutInflater.from(context).inflate(R.layout.crop_onboarding_layout, this);
        this.c = (ImageView) findViewById(R.id.topLottieContainer);
        this.d = (ImageView) findViewById(R.id.leftLottieContainer);
        setVisibility(4);
    }

    public static void b(View view, gzs gzsVar, boolean z) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        d3m.h(alphaAnimation, new vhk(0, gzsVar));
        view.startAnimation(alphaAnimation);
    }

    public final void a(PreviewRatio previewRatio, boolean z) {
        if (this.e) {
            return;
        }
        this.e = true;
        boolean z2 = previewRatio.b() <= previewRatio.a();
        ImageView imageView = this.c;
        if (imageView != null) {
            bwt0.p0(imageView, z2);
        }
        ImageView imageView2 = this.d;
        if (imageView2 != null) {
            bwt0.p0(imageView2, !z2);
        }
        if (!z2) {
            imageView = imageView2;
        }
        if (imageView != null) {
            imageView.setRotation(z ? 90.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        b(this, new ss3(8, this, imageView), true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.e();
    }
}
