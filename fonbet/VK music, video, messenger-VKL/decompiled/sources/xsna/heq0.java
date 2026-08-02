package xsna;

import android.content.res.Resources;
import android.graphics.Bitmap;

/* compiled from: UpscaleImageProcessor.kt */
/* loaded from: classes4.dex */
public final class heq0 implements h4p {
    public final int a;

    public heq0() {
        int i = Resources.getSystem().getDisplayMetrics().widthPixels;
        int i2 = Resources.getSystem().getDisplayMetrics().heightPixels;
        this.a = (i > i2 ? i2 : i) > 1080 ? 1440 : 1080;
    }

    @Override // xsna.h4p
    public final ota0 a(ota0 ota0Var) {
        Bitmap bitmap;
        ld7 ld7Var = ota0Var instanceof ld7 ? (ld7) ota0Var : null;
        if (ld7Var != null && (bitmap = ld7Var.a) != null) {
            int width = bitmap.getWidth();
            int i = this.a;
            if (width < i) {
                float width2 = i / bitmap.getWidth();
                int width3 = (int) (bitmap.getWidth() * width2);
                int height = (int) (width2 * bitmap.getHeight());
                n3p.a(width3, height);
                return new ld7(Bitmap.createScaledBitmap(bitmap, width3, height, true));
            }
        }
        return ota0Var;
    }
}
