package xsna;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import androidx.core.graphics.BlendModeCompat;
import xsna.te7;

/* compiled from: PaintCompat.java */
/* loaded from: classes.dex */
public final class hg90 {

    /* compiled from: PaintCompat.java */
    public static class a {
        public static void a(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    public static void a(Paint paint, BlendModeCompat blendModeCompat) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.a(paint, blendModeCompat != null ? te7.b.a(blendModeCompat) : null);
        } else if (blendModeCompat == null) {
            paint.setXfermode(null);
        } else {
            PorterDuff.Mode a2 = te7.a(blendModeCompat);
            paint.setXfermode(a2 != null ? new PorterDuffXfermode(a2) : null);
        }
    }
}
