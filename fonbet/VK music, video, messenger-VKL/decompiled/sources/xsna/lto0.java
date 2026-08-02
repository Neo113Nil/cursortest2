package xsna;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Shader;

/* compiled from: TiledSvgRenderer.kt */
/* loaded from: classes3.dex */
public final class lto0 extends hln0 {
    public boolean i;
    public final Shader.TileMode j;

    public lto0(String str, int i, int i2) {
        super(str, i, i2);
        this.j = Shader.TileMode.REPEAT;
    }

    @Override // xsna.hln0
    public final boolean a() {
        return this.i;
    }

    @Override // xsna.hln0
    public final void d(Canvas canvas, int i, int i2) {
        canvas.drawPaint(this.e);
    }

    @Override // xsna.hln0
    public final void e(int i, int i2, int[] iArr) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(iArr, 0, i, 0, 0, i, i2);
        Shader.TileMode tileMode = this.j;
        this.e.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        this.i = true;
    }
}
