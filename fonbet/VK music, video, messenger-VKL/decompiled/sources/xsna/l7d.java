package xsna;

import android.animation.ValueAnimator;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.vk.core.view.AdsButton;
import com.vk.newsfeed.common.views.header.NewsfeedHeaderDescriptionLayout;
import com.vk.toggle.data.AdsBtnStyle;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class l7d implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l7d(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View childAt;
        switch (this.b) {
            case 0:
                ((m7d) this.c).a().setAlpha((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                NewsfeedHeaderDescriptionLayout newsfeedHeaderDescriptionLayout = (NewsfeedHeaderDescriptionLayout) this.c;
                if (newsfeedHeaderDescriptionLayout.d >= 2) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    float measuredHeight = newsfeedHeaderDescriptionLayout.getMeasuredHeight();
                    float f = -((newsfeedHeaderDescriptionLayout.b + floatValue) * measuredHeight);
                    float f2 = 1;
                    float b = u11.b(floatValue, f2, 2.8f * floatValue, f2);
                    int childCount = newsfeedHeaderDescriptionLayout.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt2 = newsfeedHeaderDescriptionLayout.getChildAt(i);
                        if (childAt2 != null && childAt2.getVisibility() == 0) {
                            childAt2.setTranslationY(f);
                        }
                    }
                    if (newsfeedHeaderDescriptionLayout.b == newsfeedHeaderDescriptionLayout.d - 1 && (childAt = newsfeedHeaderDescriptionLayout.getChildAt(newsfeedHeaderDescriptionLayout.e)) != null) {
                        childAt.setTranslationY((1.0f - floatValue) * measuredHeight);
                    }
                    newsfeedHeaderDescriptionLayout.setAlpha(b);
                    break;
                }
                break;
            case 2:
                kac0 kac0Var = (kac0) this.c;
                kac0Var.e.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                kac0Var.a.invalidate();
                break;
            case 3:
                ((pkc0) this.c).b.invoke();
                break;
            default:
                ysm0 ysm0Var = (ysm0) this.c;
                h170 h170Var = ysm0Var.b;
                AdsButton adsButton = ysm0Var.a;
                com.vk.toggle.data.a a = h170Var.a();
                if ((a != null ? a.a : null) == AdsBtnStyle.SHORT) {
                    adsButton.setBackground(new dpg0(new ColorDrawable(((Integer) valueAnimator.getAnimatedValue()).intValue()), ysm0.k));
                    break;
                } else {
                    adsButton.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    break;
                }
        }
    }
}
