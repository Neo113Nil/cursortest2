package xsna;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import com.vk.clips.design.view.interests.AvatarWithStepProgress;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ys5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ys5(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = AvatarWithStepProgress.j;
                ((AvatarWithStepProgress) obj).c.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 1:
                ((ImageView) obj).setImageTintList(ColorStateList.valueOf(((Integer) valueAnimator.getAnimatedValue()).intValue()));
                break;
            case 2:
                m7d m7dVar = (m7d) obj;
                m7dVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m7dVar.g = -((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 3:
                ((izs) obj).invoke((Float) valueAnimator.getAnimatedValue());
                break;
            case 4:
                pac0 pac0Var = (pac0) obj;
                pac0Var.e.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                pac0Var.a.invalidate();
                break;
            default:
                WebView webView = (WebView) obj;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ViewGroup.LayoutParams layoutParams = webView.getLayoutParams();
                layoutParams.height = intValue;
                webView.setLayoutParams(layoutParams);
                break;
        }
    }
}
