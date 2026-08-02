package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import com.vk.feed.design.view.newsfeed.header.description.VkFeedNewsfeedHeaderDescriptionLayout;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class x5f0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x5f0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View childAt;
        switch (this.b) {
            case 0:
                y5f0 y5f0Var = (y5f0) this.c;
                y5f0Var.a.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                y5f0Var.a.invalidate();
                break;
            default:
                VkFeedNewsfeedHeaderDescriptionLayout vkFeedNewsfeedHeaderDescriptionLayout = (VkFeedNewsfeedHeaderDescriptionLayout) this.c;
                if (vkFeedNewsfeedHeaderDescriptionLayout.d >= 2) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    float measuredHeight = vkFeedNewsfeedHeaderDescriptionLayout.getMeasuredHeight();
                    float f = -((vkFeedNewsfeedHeaderDescriptionLayout.b + floatValue) * measuredHeight);
                    float f2 = 1;
                    float b = u11.b(floatValue, f2, 2.8f * floatValue, f2);
                    int childCount = vkFeedNewsfeedHeaderDescriptionLayout.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt2 = vkFeedNewsfeedHeaderDescriptionLayout.getChildAt(i);
                        if (childAt2 != null && childAt2.getVisibility() == 0) {
                            childAt2.setTranslationY(f);
                        }
                    }
                    if (vkFeedNewsfeedHeaderDescriptionLayout.b == vkFeedNewsfeedHeaderDescriptionLayout.d - 1 && (childAt = vkFeedNewsfeedHeaderDescriptionLayout.getChildAt(vkFeedNewsfeedHeaderDescriptionLayout.e)) != null) {
                        childAt.setTranslationY((1.0f - floatValue) * measuredHeight);
                    }
                    vkFeedNewsfeedHeaderDescriptionLayout.setAlpha(b);
                    break;
                }
                break;
        }
    }
}
