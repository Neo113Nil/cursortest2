package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.views.RotatingView;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class jex implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ jex(View view, int i) {
        this.b = i;
        this.c = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                kex kexVar = (kex) this.c;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                kexVar.getLayoutParams().height = intValue;
                kexVar.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
                kexVar.requestLayout();
                if (intValue == 0) {
                    kexVar.setVisibility(8);
                    break;
                }
                break;
            default:
                RotatingView rotatingView = (RotatingView) this.c;
                rotatingView.p = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                rotatingView.q = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                Iterator<RotatingView.a> it = rotatingView.w.iterator();
                while (it.hasNext()) {
                    RotatingView.a next = it.next();
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    rotatingView.o = floatValue;
                    next.d(floatValue, true);
                }
                rotatingView.invalidate();
                break;
        }
    }
}
