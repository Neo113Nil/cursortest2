package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class jp11 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final wjm b;
    public volatile int c = 0;

    public jp11(wjm wjmVar, int i) {
        this.b = wjmVar;
        this.a = i;
    }

    public final int a(int i) {
        g920 d2 = d();
        int a = d2.a(16);
        if (a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = d2.b;
        int i2 = a + d2.a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final short b() {
        g920 d2 = d();
        int a = d2.a(10);
        if (a != 0) {
            return d2.b.getShort(a + d2.a);
        }
        return (short) 0;
    }

    public final int c() {
        g920 d2 = d();
        int a = d2.a(4);
        if (a != 0) {
            return d2.b.getInt(a + d2.a);
        }
        return 0;
    }

    public final g920 d() {
        ThreadLocal threadLocal = d;
        g920 g920Var = (g920) threadLocal.get();
        if (g920Var == null) {
            g920Var = new g920();
            threadLocal.set(g920Var);
        }
        h920 h920Var = (h920) this.b.b;
        int a = h920Var.a(6);
        if (a != 0) {
            int i = a + h920Var.a;
            int i2 = (this.a * 4) + h920Var.b.getInt(i) + i + 4;
            int i3 = h920Var.b.getInt(i2) + i2;
            ByteBuffer byteBuffer = h920Var.b;
            g920Var.b = byteBuffer;
            if (byteBuffer != null) {
                g920Var.a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                g920Var.c = i4;
                g920Var.d = g920Var.b.getShort(i4);
                return g920Var;
            }
            g920Var.a = 0;
            g920Var.c = 0;
            g920Var.d = 0;
        }
        return g920Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(c()));
        sb.append(", codepoints:");
        g920 d2 = d();
        int a = d2.a(16);
        if (a != 0) {
            int i2 = a + d2.a;
            i = d2.b.getInt(d2.b.getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
