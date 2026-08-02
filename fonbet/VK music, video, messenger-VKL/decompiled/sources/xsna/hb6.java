package xsna;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.ViewGroup;
import com.airbnb.lottie.AsyncUpdates;
import com.vk.clips.viewer.impl.feed.view.subs.ClipsCanvasSubtitleView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class hb6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hb6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                ib6 ib6Var = (ib6) this.c;
                ViewGroup.LayoutParams layoutParams = ib6Var.z.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                }
                ib6Var.z.requestLayout();
                break;
            case 1:
                ClipsCanvasSubtitleView clipsCanvasSubtitleView = (ClipsCanvasSubtitleView) this.c;
                float height = clipsCanvasSubtitleView.o.height();
                RectF rectF = clipsCanvasSubtitleView.l;
                clipsCanvasSubtitleView.m = valueAnimator.getAnimatedFraction() * (height - rectF.height());
                clipsCanvasSubtitleView.n = valueAnimator.getAnimatedFraction() * (clipsCanvasSubtitleView.o.width() - rectF.width());
                clipsCanvasSubtitleView.invalidate();
                break;
            default:
                k800 k800Var = (k800) this.c;
                AsyncUpdates asyncUpdates = k800Var.O;
                if (asyncUpdates == null) {
                    asyncUpdates = tky.a;
                }
                if (asyncUpdates != AsyncUpdates.ENABLED) {
                    com.airbnb.lottie.model.layer.b bVar = k800Var.r;
                    if (bVar != null) {
                        bVar.r(k800Var.c.i());
                        break;
                    }
                } else {
                    k800Var.invalidateSelf();
                    break;
                }
                break;
        }
    }
}
