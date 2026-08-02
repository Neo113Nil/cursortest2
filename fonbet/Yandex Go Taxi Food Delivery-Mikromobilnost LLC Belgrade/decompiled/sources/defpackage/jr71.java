package defpackage;

/* loaded from: classes7.dex */
public abstract class jr71 {
    public static int a(int i, int i2) {
        if (i2 < 0) {
            ny61.f("cannot store more than MAX_VALUE elements");
            return 0;
        }
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            i3 = Integer.highestOneBit(i2 - 1) << 1;
        }
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }
}
