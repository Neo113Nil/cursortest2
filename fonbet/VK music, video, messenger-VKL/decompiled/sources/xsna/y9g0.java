package xsna;

import android.graphics.drawable.Drawable;

/* compiled from: ResizedDrawable.kt */
/* loaded from: classes17.dex */
public final class y9g0 extends alo {
    public final Drawable b;
    public final int c;
    public final int d;

    public y9g0(Drawable drawable, int i, int i2) {
        super(drawable);
        this.b = drawable;
        this.c = i;
        this.d = i2;
    }

    @Override // xsna.alo, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.d;
    }

    @Override // xsna.alo, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.c;
    }
}
