package xsna;

import android.animation.ValueAnimator;
import android.widget.TextView;
import com.vk.auth.verification.base.ui.HorizontalCountDownBar;
import com.vk.photo.editor.markup.view.tools.PipetteView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class yxb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yxb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                TextView textView = ((com.vk.im.ui.components.chat_profile.a) obj).r;
                if (textView == null) {
                    textView = null;
                }
                textView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                HorizontalCountDownBar.a((HorizontalCountDownBar) obj, valueAnimator);
                break;
            default:
                PipetteView pipetteView = (PipetteView) obj;
                int i2 = PipetteView.t;
                pipetteView.q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pipetteView.invalidate();
                valueAnimator.addListener(new PipetteView.b(pipetteView));
                break;
        }
    }
}
