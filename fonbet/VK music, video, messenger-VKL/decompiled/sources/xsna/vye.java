package xsna;

import android.animation.ValueAnimator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.cameraui.widgets.ClipsProgressView;
import com.vk.feed.design.view.posting.preview.image.attach.PostingPreviewImage;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class vye implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vye(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ClipsProgressView clipsProgressView = (ClipsProgressView) obj;
                clipsProgressView.l.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                clipsProgressView.invalidate();
                break;
            case 1:
                int i2 = PostingPreviewImage.z;
                bwt0.r0(((Integer) valueAnimator.getAnimatedValue()).intValue(), ((PostingPreviewImage) obj).u);
                break;
            default:
                fkm0 fkm0Var = (fkm0) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fkm0Var.o.b = floatValue;
                fkm0Var.c.j = swe0.f(floatValue, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                fkm0Var.f.a();
                break;
        }
    }
}
