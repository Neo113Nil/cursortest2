package xsna;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;

/* compiled from: IterativeBoxBlurPostProcessor.java */
/* loaded from: classes12.dex */
public final class jwx extends mk6 {
    public final int c;
    public final int d;
    public ppj0 e;

    public jwx(int i, int i2) {
        if (!(i > 0)) {
            throw new IllegalArgumentException();
        }
        if (!(i2 > 0)) {
            throw new IllegalArgumentException();
        }
        this.c = i;
        this.d = i2;
    }

    @Override // xsna.mk6, xsna.ktc0
    public final ww8 a() {
        if (this.e == null) {
            this.e = new ppj0(efz.a(this.c, this.d, "i", "r"));
        }
        return this.e;
    }

    @Override // xsna.mk6
    public final void d(Bitmap bitmap) {
        NativeBlurFilter.iterativeBoxBlur(bitmap, this.c, this.d);
    }
}
