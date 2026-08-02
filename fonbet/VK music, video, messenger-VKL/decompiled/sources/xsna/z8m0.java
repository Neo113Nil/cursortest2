package xsna;

import android.graphics.Bitmap;
import com.vk.medianative.MediaNative;

/* compiled from: StoryPreviewPostProcessor.java */
/* loaded from: classes17.dex */
public final class z8m0 extends mk6 {
    public static final z8m0 e = new z8m0(5);
    public final int c;
    public final int d;

    static {
        new z8m0(15);
    }

    public z8m0(int i) {
        this(i, 100);
    }

    @Override // xsna.mk6, xsna.ktc0
    public final ww8 a() {
        return new ppj0("StoryPreviewPostProcessor-" + this.c);
    }

    @Override // xsna.mk6, xsna.ktc0
    public final uvf<Bitmap> b(Bitmap bitmap, hta0 hta0Var) {
        int i;
        String str = kd7.a;
        float width = (bitmap == null || bitmap.isRecycled()) ? 1.0f : bitmap.getWidth() / bitmap.getHeight();
        int i2 = this.d;
        if (width > 1.0f) {
            i = (int) (i2 / width);
        } else if (width < 1.0f) {
            i2 = (int) (i2 * width);
            i = i2;
        } else {
            i = i2;
        }
        hta0Var.getClass();
        uvf<Bitmap> c = hta0Var.c(i2, i, Bitmap.Config.ARGB_8888);
        try {
            Bitmap r = c.r();
            fkw.a(bitmap, r);
            MediaNative.blurBitmap(r, this.c);
            return c.n();
        } finally {
            c.close();
        }
    }

    @Override // xsna.mk6, xsna.ktc0
    public final String getName() {
        return "StoryPreviewPostProcessor-" + this.c + "-" + this.d;
    }

    public z8m0(int i, int i2) {
        this.c = i;
        this.d = i2;
    }
}
