package xsna;

import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.WeakHashMap;

/* compiled from: DrawableAlphaProperty.java */
/* loaded from: classes13.dex */
public final class pjo extends Property<Drawable, Integer> {
    public static final pjo a;

    static {
        pjo pjoVar = new pjo(Integer.class, "drawableAlphaCompat");
        new WeakHashMap();
        a = pjoVar;
    }

    @Override // android.util.Property
    @Nullable
    public final Integer get(@NonNull Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    public final void set(@NonNull Drawable drawable, @NonNull Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
