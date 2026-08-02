package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public class o5x0 {
    public int a;
    public ByteBuffer b;
    public int c;
    public int d;

    public o5x0() {
        if (lw21.a == null) {
            lw21.a = new mw21();
        }
    }

    public final int a(int i) {
        if (i < this.d) {
            return this.b.getShort(this.c + i);
        }
        return 0;
    }
}
