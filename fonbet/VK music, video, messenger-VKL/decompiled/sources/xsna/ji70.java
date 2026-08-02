package xsna;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.widget.ImageView;
import com.vk.stickers.roulette.StickersRouletteFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ji70 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ji70(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                li70 li70Var = (li70) this.c;
                li70Var.p = (Float) valueAnimator.getAnimatedValue();
                li70Var.requestLayout();
                break;
            default:
                ImageView imageView = ((StickersRouletteFragment) this.c).V;
                if (imageView != null) {
                    imageView.setImageTintList(ColorStateList.valueOf(((Integer) valueAnimator.getAnimatedValue()).intValue()));
                    break;
                }
                break;
        }
    }
}
