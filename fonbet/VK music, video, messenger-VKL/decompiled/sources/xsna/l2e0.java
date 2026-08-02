package xsna;

import android.graphics.Canvas;

/* compiled from: IndeterminateProgressBarWithLogoView.kt */
/* loaded from: classes.dex */
public final class l2e0 extends xng0 {
    public final int c;
    public final int d;
    public final o45 e;
    public float f;

    public l2e0(int i, int i2, int i3, o45 o45Var) {
        super(i);
        this.c = i2;
        this.d = i3;
        this.e = o45Var;
    }

    @Override // xsna.xng0, android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int width = canvas.getWidth();
        int i = this.d;
        int i2 = this.c;
        int i3 = i + ((int) ((((width - i) + i2) - i) * this.f));
        getBounds().set(Math.max(0, i3 - i2), getBounds().top, Math.min(canvas.getWidth(), i3), getBounds().bottom);
        super.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        float f = i / 10000.0f;
        this.f = f;
        o45 o45Var = this.e;
        if (o45Var == null) {
            return true;
        }
        o45Var.invoke(Float.valueOf(f));
        return true;
    }
}
