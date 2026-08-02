package xsna;

import android.graphics.Bitmap;

/* compiled from: BackgroundColorsPostProcessor.kt */
/* loaded from: classes3.dex */
public final class dw5 extends mk6 {
    public final String c;
    public final pfl0 d;
    public final long e;
    public final ppj0 f = new ppj0("BackgroundColorsPostProcessor");

    public dw5(String str, pfl0 pfl0Var, long j) {
        this.c = str;
        this.d = pfl0Var;
        this.e = j;
    }

    @Override // xsna.mk6, xsna.ktc0
    public final ww8 a() {
        return this.f;
    }

    @Override // xsna.mk6
    public final void d(Bitmap bitmap) {
        this.d.b(this.c, tfl0.a(this.e, bitmap));
    }

    @Override // xsna.mk6, xsna.ktc0
    public final String getName() {
        return "BackgroundColorsPostProcessor";
    }

    public final String toString() {
        return "BackgroundColorsPostProcessor";
    }
}
