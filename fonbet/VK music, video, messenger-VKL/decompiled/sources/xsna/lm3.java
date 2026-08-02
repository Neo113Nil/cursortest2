package xsna;

import android.annotation.TargetApi;
import android.graphics.Bitmap;

/* compiled from: ArtBitmapFactory.kt */
@TargetApi(21)
/* loaded from: classes.dex */
public final class lm3 extends hta0 {
    public final sc7 a;
    public final vvf b;

    public lm3(sc7 sc7Var, vvf vvfVar) {
        this.a = sc7Var;
        this.b = vvfVar;
    }

    @Override // xsna.hta0
    public final uvf<Bitmap> c(int i, int i2, Bitmap.Config config) {
        int c = id7.c(i, i2, config);
        sc7 sc7Var = this.a;
        Bitmap bitmap = sc7Var.get(c);
        if (bitmap.getAllocationByteCount() < id7.b(config) * i * i2) {
            throw new IllegalStateException("Check failed.");
        }
        bitmap.reconfigure(i, i2, config);
        return uvf.x(bitmap, sc7Var, this.b.a);
    }
}
