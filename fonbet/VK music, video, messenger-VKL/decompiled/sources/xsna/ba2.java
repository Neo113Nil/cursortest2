package xsna;

import android.graphics.Bitmap;

/* compiled from: AndroidImageBitmap.android.kt */
/* loaded from: classes11.dex */
public final class ba2 {
    public static final Bitmap a(agw agwVar) {
        if (agwVar instanceof aa2) {
            return ((aa2) agwVar).a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final Bitmap.Config b(int i) {
        return i == 0 ? Bitmap.Config.ARGB_8888 : i == 1 ? Bitmap.Config.ALPHA_8 : i == 2 ? Bitmap.Config.RGB_565 : i == 3 ? Bitmap.Config.RGBA_F16 : i == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }
}
