package xsna;

import android.view.ViewConfiguration;

/* compiled from: EdgeEffectCompat.android.kt */
/* loaded from: classes11.dex */
public final class hyo {
    public static final float a = ViewConfiguration.getScrollFriction();
    public static final double b;
    public static final double c;

    static {
        double log = Math.log(0.78d) / Math.log(0.9d);
        b = log;
        c = log - 1.0d;
    }
}
