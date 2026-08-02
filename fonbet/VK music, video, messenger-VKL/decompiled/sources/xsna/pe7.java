package xsna;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.core.graphics.BlendModeCompat;
import xsna.te7;

/* compiled from: BlendModeColorFilterCompat.java */
/* loaded from: classes11.dex */
public final class pe7 {

    /* compiled from: BlendModeColorFilterCompat.java */
    public static class a {
        public static ColorFilter a(int i, Object obj) {
            return new BlendModeColorFilter(i, (BlendMode) obj);
        }
    }

    public static ColorFilter a(int i, BlendModeCompat blendModeCompat) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object a2 = te7.b.a(blendModeCompat);
            if (a2 != null) {
                return a.a(i, a2);
            }
            return null;
        }
        PorterDuff.Mode a3 = te7.a(blendModeCompat);
        if (a3 != null) {
            return new PorterDuffColorFilter(i, a3);
        }
        return null;
    }
}
