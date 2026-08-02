package xsna;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ll70 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ ll70(View view, int i) {
        this.b = i;
        this.c = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                pl70 pl70Var = (pl70) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f = 1.0f - floatValue;
                pl70Var.d.setTranslationX((-pl70Var.b.getWidth()) * f);
                pl70Var.d.setRotation(f * (-180.0f));
                RecyclerView recyclerView = pl70Var.b;
                Rect rect = pl70Var.h;
                int width = (int) (recyclerView.getWidth() * floatValue);
                if (!gz80.a(24)) {
                    width = Math.max(width, 1);
                }
                rect.right = width;
                recyclerView.setClipBounds(rect);
                break;
            default:
                wwt0.a(((Integer) valueAnimator.getAnimatedValue()).intValue(), this.c);
                break;
        }
    }
}
