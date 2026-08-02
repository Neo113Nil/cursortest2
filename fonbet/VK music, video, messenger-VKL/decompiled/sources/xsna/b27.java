package xsna;

/* compiled from: BigSignificand.java */
/* loaded from: classes12.dex */
public final class b27 {
    public final int a;
    public final int[] b;
    public int c;

    public b27(long j) {
        if (j <= 0 || j >= 2147483647L) {
            throw new IllegalArgumentException(defpackage.k0.a(j, "numBits="));
        }
        int i = (((int) ((j + 63) >>> 6)) + 1) << 1;
        this.a = i;
        this.b = new int[i];
        this.c = i;
    }
}
