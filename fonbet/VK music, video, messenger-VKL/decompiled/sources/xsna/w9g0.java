package xsna;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;

/* compiled from: ResizeImagePostprocessor.kt */
/* loaded from: classes2.dex */
public final class w9g0 extends mk6 {
    public final int c;
    public final int d;
    public final ppj0 e;
    public final int f;

    public w9g0(int i, int i2) {
        this.c = i;
        this.d = i2;
        this.e = new ppj0(efz.a(i, i2, "ResizeImagePostprocessor: w=", ", h="));
        this.f = Math.min(i, i2);
    }

    @Override // xsna.mk6, xsna.ktc0
    public final ww8 a() {
        return this.e;
    }

    @Override // xsna.mk6, xsna.ktc0
    public final uvf<Bitmap> b(Bitmap bitmap, hta0 hta0Var) {
        if (bitmap.getWidth() == this.c && bitmap.getHeight() == this.d) {
            return hta0Var.a(bitmap);
        }
        int i = this.f;
        Bitmap extractThumbnail = ThumbnailUtils.extractThumbnail(bitmap, i, i);
        uvf<Bitmap> a = hta0Var.a(extractThumbnail);
        extractThumbnail.recycle();
        return a;
    }

    @Override // xsna.mk6, xsna.ktc0
    public final String getName() {
        return "ResizeImagePostprocessor";
    }
}
