package xsna;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class c9g implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ c9g(View view, int i) {
        this.b = i;
        this.c = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                d9g.a((d9g) this.c, valueAnimator);
                break;
            default:
                pl70 pl70Var = (pl70) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pl70Var.d.setTranslationX((-pl70Var.b.getWidth()) * floatValue);
                pl70Var.d.setRotation((-180.0f) * floatValue);
                RecyclerView recyclerView = pl70Var.b;
                Rect rect = pl70Var.h;
                int width = (int) ((1.0f - floatValue) * recyclerView.getWidth());
                if (!gz80.a(24)) {
                    width = Math.max(width, 1);
                }
                rect.right = width;
                recyclerView.setClipBounds(rect);
                break;
        }
    }
}
