package xsna;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Base2ExponentialHistogramIndexer.java */
/* loaded from: classes8.dex */
public final class i46 {
    public static final ConcurrentHashMap c = new ConcurrentHashMap();
    public static final double d = 1.0d / Math.log(2.0d);
    public final int a;
    public final double b;

    public i46(int i) {
        this.a = i;
        this.b = Math.scalb(d, i);
    }

    public static i46 b(int i) {
        return (i46) c.computeIfAbsent(Integer.valueOf(i), new h46());
    }

    public static int c(double d2) {
        long doubleToLongBits = Double.doubleToLongBits(d2);
        long j = (9218868437227405312L & doubleToLongBits) >> 52;
        long j2 = doubleToLongBits & 4503599627370495L;
        if (j == 0) {
            j -= Long.numberOfLeadingZeros(j2 - 1) - 12;
        }
        int i = (int) (j - 1023);
        return j2 == 0 ? i - 1 : i;
    }

    public final int a(double d2) {
        double abs = Math.abs(d2);
        int i = this.a;
        return i > 0 ? ((int) Math.ceil(Math.log(abs) * this.b)) - 1 : i == 0 ? c(abs) : c(abs) >> (-i);
    }
}
