package xsna;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: RootDrawable.java */
/* loaded from: classes.dex */
public final class gmg0 extends j9s implements r4u0 {
    public Drawable f;
    public t4u0 g;

    @Override // xsna.j9s, android.graphics.drawable.Drawable
    @SuppressLint({"WrongCall"})
    public final void draw(Canvas canvas) {
        if (isVisible()) {
            t4u0 t4u0Var = this.g;
            if (t4u0Var != null) {
                t4u0Var.onDraw();
            }
            super.draw(canvas);
            Drawable drawable = this.f;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.f.draw(canvas);
            }
        }
    }

    @Override // xsna.j9s, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return -1;
    }

    @Override // xsna.j9s, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return -1;
    }

    @Override // xsna.r4u0
    public final void h(t4u0 t4u0Var) {
        this.g = t4u0Var;
    }

    @Override // xsna.j9s, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        t4u0 t4u0Var = this.g;
        if (t4u0Var != null) {
            t4u0Var.a(z);
        }
        return super.setVisible(z, z2);
    }
}
