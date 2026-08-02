package xsna;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: TypefaceUtils.java */
/* loaded from: classes13.dex */
public final class tup0 {
    @Nullable
    public static Typeface a(@NonNull Configuration configuration, @NonNull Typeface typeface) {
        int i;
        int i2;
        int i3;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i = configuration.fontWeightAdjustment;
        if (i == Integer.MAX_VALUE) {
            return null;
        }
        i2 = configuration.fontWeightAdjustment;
        if (i2 == 0 || typeface == null) {
            return null;
        }
        int weight = typeface.getWeight();
        i3 = configuration.fontWeightAdjustment;
        return Typeface.create(typeface, xwk.b(i3 + weight, 1, 1000), typeface.isItalic());
    }
}
