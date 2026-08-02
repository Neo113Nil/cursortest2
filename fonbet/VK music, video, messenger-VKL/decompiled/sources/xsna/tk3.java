package xsna;

import android.graphics.drawable.Drawable;

/* compiled from: ArrayDrawable.java */
/* loaded from: classes.dex */
public final class tk3 implements ako {
    public final /* synthetic */ int b;
    public final /* synthetic */ uk3 c;

    public tk3(uk3 uk3Var, int i) {
        this.c = uk3Var;
        this.b = i;
    }

    @Override // xsna.ako
    public final Drawable d(Drawable drawable) {
        return this.c.d(drawable, this.b);
    }

    @Override // xsna.ako
    public final Drawable l() {
        return this.c.a(this.b);
    }
}
