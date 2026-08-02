package defpackage;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public interface lml {
    public static final kml a = new kml();

    Typeface a();

    Typeface b();

    Typeface c();

    default Typeface d(int i) {
        return (i < 0 || i >= 350) ? (i < 350 || i >= 450) ? (i < 450 || i >= 600) ? c() : b() : a() : getLight();
    }

    Typeface getLight();
}
