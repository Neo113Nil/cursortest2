package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.vk.common.view.DotsIndicatorView;
import com.vk.content.design.view.camera.ShutterButton;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class v5o implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ v5o(View view, int i) {
        this.b = i;
        this.c = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        View view = this.c;
        switch (i) {
            case 0:
                DotsIndicatorView dotsIndicatorView = (DotsIndicatorView) view;
                int i2 = DotsIndicatorView.v;
                dotsIndicatorView.q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dotsIndicatorView.invalidate();
                break;
            case 1:
                ShutterButton shutterButton = (ShutterButton) view;
                shutterButton.H.w0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                shutterButton.invalidate();
                break;
            default:
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup != null) {
                    for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                        View childAt = viewGroup.getChildAt(i3);
                        childAt.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        childAt.setVisibility(0);
                    }
                    break;
                }
                break;
        }
    }
}
