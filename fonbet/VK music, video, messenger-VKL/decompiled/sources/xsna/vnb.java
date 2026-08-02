package xsna;

import android.animation.ValueAnimator;
import android.graphics.drawable.ColorDrawable;
import com.vk.im.chat.clips.decoration.impl.presentation.bottom.view.linkedtext.LinkedMessageView;
import com.vk.photo.editor.views.DashedSeekBar;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class vnb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vnb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                LinkedMessageView linkedMessageView = ((ynb) obj).n;
                if (linkedMessageView != null) {
                    ynb.s(linkedMessageView, 1 - animatedFraction);
                    break;
                }
                break;
            case 1:
                DashedSeekBar dashedSeekBar = (DashedSeekBar) obj;
                int i2 = DashedSeekBar.M;
                dashedSeekBar.D = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                dashedSeekBar.invalidate();
                break;
            case 2:
                ((ColorDrawable) obj).setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 3:
                dbw0 dbw0Var = (dbw0) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dbw0Var.g = floatValue;
                dbw0Var.c.setAlpha(floatValue);
                dbw0Var.b.setAlpha(dbw0Var.g);
                dbw0Var.requestLayout();
                break;
            default:
                ((kdx0) obj).a().setAlpha((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
