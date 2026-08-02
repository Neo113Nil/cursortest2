package xsna;

import android.view.ViewPropertyAnimator;
import android.view.animation.OvershootInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.ui.ad.AdvertBannerView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class o31 implements Runnable {
    public final /* synthetic */ AdvertBannerView b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ o31(AdvertBannerView advertBannerView, boolean z) {
        this.b = advertBannerView;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewPropertyAnimator translationX;
        AdvertBannerView advertBannerView = this.b;
        if (this.c) {
            advertBannerView.setTranslationY(iah0.a(AdvertBannerView.Style.FULLSCREEN.k()) * 1.5f);
            translationX = advertBannerView.animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            advertBannerView.setTranslationX(-iah0.a(400));
            translationX = advertBannerView.animate().translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        ViewPropertyAnimator interpolator = translationX.setDuration(700L).withStartAction(new p31(advertBannerView, 0)).setInterpolator(new OvershootInterpolator(1.0f));
        interpolator.start();
        advertBannerView.e = interpolator;
    }
}
