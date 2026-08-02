package xsna;

import xsna.o6j;

/* compiled from: LayoutUtils.kt */
/* loaded from: classes11.dex */
public final class wpy {
    public static final long a(float f, int i, long j, boolean z) {
        int i2 = ((z || i == 2 || i == 4 || i == 5) && o6j.e(j)) ? o6j.i(j) : Integer.MAX_VALUE;
        if (o6j.k(j) != i2) {
            i2 = swe0.g(tdo0.a(f), o6j.k(j), i2);
        }
        return o6j.a.b(0, i2, 0, o6j.h(j));
    }
}
