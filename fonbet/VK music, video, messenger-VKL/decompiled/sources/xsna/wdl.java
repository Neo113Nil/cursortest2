package xsna;

import java.io.IOException;
import java.util.ArrayDeque;
import xsna.xn10;

/* compiled from: DefaultEbmlReader.java */
/* loaded from: classes12.dex */
public final class wdl {
    public final byte[] a = new byte[8];
    public final ArrayDeque<a> b = new ArrayDeque<>();
    public final jkr0 c = new jkr0();
    public xn10.a d;
    public int e;
    public int f;
    public long g;

    /* compiled from: DefaultEbmlReader.java */
    public static final class a {
        public final int a;
        public final long b;

        public a(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }

    public final long a(qgq qgqVar, int i) throws IOException {
        qgqVar.readFully(this.a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (r0[i2] & 255);
        }
        return j;
    }
}
