package xsna;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: IconDelegate.kt */
/* loaded from: classes18.dex */
public final class eqv extends yc6 {
    public Integer g;
    public Integer h;
    public Drawable i;
    public String j;
    public int k;

    @Override // xsna.yc6
    public final void b() {
        Drawable drawable = this.i;
        if (drawable != null) {
            RectF rectF = this.d;
            drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
    }

    public final void d(Drawable drawable) {
        if (epx.f(this.i, drawable)) {
            return;
        }
        this.i = drawable;
        if (this.d.isEmpty()) {
            return;
        }
        this.a.a();
    }
}
