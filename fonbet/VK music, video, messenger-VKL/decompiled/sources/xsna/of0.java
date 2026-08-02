package xsna;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.vk.rlottie.RLottieDrawable;
import com.vk.tab.presentation.TabView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class of0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ of0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                ((View) ((rf0) this.c).H.getValue()).setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                Drawable drawable = (RLottieDrawable) this.c;
                Object animatedValue = valueAnimator.getAnimatedValue();
                Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
                if (num != null) {
                    drawable.setAlpha(num.intValue());
                    Drawable.Callback callback = drawable.getCallback();
                    if (callback != null) {
                        callback.invalidateDrawable(drawable);
                        break;
                    }
                }
                break;
            case 2:
                zpr zprVar = (zpr) this.c;
                ptl0 ptl0Var = zprVar.b;
                Object animatedValue2 = zprVar.d.getAnimatedValue();
                ptl0Var.invoke(Float.valueOf(animatedValue2 != null ? ((Float) animatedValue2).floatValue() : 0.75f));
                break;
            default:
                ((TabView) this.c).c.setCardElevation(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
