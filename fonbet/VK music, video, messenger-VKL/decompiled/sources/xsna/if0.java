package xsna;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class if0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ RecyclerView.e0 c;

    public /* synthetic */ if0(RecyclerView.e0 e0Var, int i) {
        this.b = i;
        this.c = e0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                ((jf0) this.c).L.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                tgb0 tgb0Var = (tgb0) this.c;
                ViewGroup.LayoutParams layoutParams = tgb0Var.n.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                }
                tgb0Var.n.requestLayout();
                break;
        }
    }
}
