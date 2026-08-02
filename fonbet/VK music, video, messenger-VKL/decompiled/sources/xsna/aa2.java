package xsna;

import android.graphics.Bitmap;

/* compiled from: AndroidImageBitmap.android.kt */
/* loaded from: classes11.dex */
public final class aa2 implements agw {
    public final Bitmap a;

    public aa2(Bitmap bitmap) {
        this.a = bitmap;
    }

    public final int a() {
        Bitmap.Config config = this.a.getConfig();
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        if (config == Bitmap.Config.RGBA_F16) {
            return 3;
        }
        return config == Bitmap.Config.HARDWARE ? 4 : 0;
    }

    public final void b() {
        this.a.prepareToDraw();
    }

    @Override // xsna.agw
    public final int getHeight() {
        return this.a.getHeight();
    }

    @Override // xsna.agw
    public final int getWidth() {
        return this.a.getWidth();
    }
}
