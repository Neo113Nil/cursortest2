package xsna;

/* compiled from: IntegerParser.java */
/* loaded from: classes12.dex */
public final class v9x {
    public final int a;
    public final long b;

    public v9x(long j, int i) {
        this.b = j;
        this.a = i;
    }

    public static v9x a(int i, int i2, String str) {
        if (i >= i2) {
            return null;
        }
        long j = 0;
        int i3 = i;
        while (i3 < i2) {
            char charAt = str.charAt(i3);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            j = (j * 10) + (charAt - '0');
            if (j > 2147483647L) {
                return null;
            }
            i3++;
        }
        if (i3 == i) {
            return null;
        }
        return new v9x(j, i3);
    }
}
