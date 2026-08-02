package xsna;

import android.graphics.Bitmap;
import android.graphics.Rect;

/* compiled from: AnimatedDrawableFactoryDelegate.kt */
/* loaded from: classes2.dex */
public final class hc7 implements gc7 {
    public final gc7 a;

    public hc7(gc7 gc7Var) {
        this.a = gc7Var;
    }

    @Override // xsna.gc7
    public final boolean a(int i, Bitmap bitmap) {
        return this.a.a(i, bitmap);
    }

    @Override // xsna.gc7
    public final int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    @Override // xsna.gc7
    public final int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    @Override // xsna.gc7
    public final void setBounds(Rect rect) {
        this.a.setBounds(rect);
    }
}
