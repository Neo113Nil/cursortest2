package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/* compiled from: FitXYSvgRenderer.kt */
/* loaded from: classes3.dex */
public final class mmr extends hln0 {
    public Bitmap i;

    @Override // xsna.hln0
    public final boolean a() {
        return this.i != null;
    }

    @Override // xsna.hln0
    public final int b() {
        Bitmap bitmap = this.i;
        if (bitmap != null) {
            return bitmap.getHeight();
        }
        return -1;
    }

    @Override // xsna.hln0
    public final int c() {
        Bitmap bitmap = this.i;
        if (bitmap != null) {
            return bitmap.getWidth();
        }
        return -1;
    }

    @Override // xsna.hln0
    public final void d(Canvas canvas, int i, int i2) {
        Bitmap bitmap = this.i;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, i, i2, this.e);
        }
    }

    @Override // xsna.hln0
    public final void e(int i, int i2, int[] iArr) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(iArr, 0, i, 0, 0, i, i2);
        this.i = createBitmap;
    }
}
