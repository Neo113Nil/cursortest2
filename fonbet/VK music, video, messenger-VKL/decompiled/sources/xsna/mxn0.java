package xsna;

import java.nio.ByteBuffer;

/* compiled from: Table.java */
/* loaded from: classes12.dex */
public class mxn0 {
    public int a;
    public ByteBuffer b;
    public int c;
    public int d;

    public mxn0() {
        if (fsk.f == null) {
            fsk.f = new fsk();
        }
    }

    public final int a(int i) {
        if (i < this.d) {
            return this.b.getShort(this.c + i);
        }
        return 0;
    }
}
