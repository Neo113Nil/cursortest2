package yads;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes10.dex */
public final class n23 {
    public final q23 a = new q23();
    public final bm b = new bm();
    public final bp c = new bp();
    public p23 d;

    public final void a(ImageView imageView) {
        imageView.removeOnLayoutChangeListener(this.d);
    }

    public final void a(Drawable drawable, ImageView imageView, x41 x41Var) {
        p23 p23Var = new p23(this.b, this.c, this.a, x41Var, drawable);
        this.d = p23Var;
        imageView.addOnLayoutChangeListener(p23Var);
        if (imageView.getLayoutParams().width == -1 || imageView.getLayoutParams().height == -1 || imageView.getLayoutParams().width == -2 || imageView.getLayoutParams().height == -2) {
            imageView.setImageDrawable(drawable);
        }
    }
}
