package xsna;

import android.graphics.Bitmap;
import android.graphics.RectF;

/* compiled from: SimpleCropPostProcessor.kt */
/* loaded from: classes3.dex */
public final class bqj0 extends mk6 {
    public final RectF c;

    public bqj0(RectF rectF) {
        this.c = rectF;
    }

    @Override // xsna.mk6, xsna.ktc0
    public final uvf<Bitmap> b(Bitmap bitmap, hta0 hta0Var) {
        RectF rectF = this.c;
        uvf b = hta0Var.b(bitmap, (int) (bitmap.getWidth() * rectF.left), (int) (bitmap.getHeight() * rectF.top), (int) ((rectF.right - rectF.left) * bitmap.getWidth()), (int) ((rectF.bottom - rectF.top) * bitmap.getHeight()));
        try {
            return b.clone();
        } finally {
            b.close();
        }
    }
}
