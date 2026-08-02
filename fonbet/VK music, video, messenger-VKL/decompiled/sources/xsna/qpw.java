package xsna;

/* compiled from: ImmutableTraceFlags.java */
/* loaded from: classes11.dex */
public final class qpw implements rdp0 {
    public static final qpw[] c;
    public static final qpw d;
    public final String a;
    public final byte b;

    static {
        qpw[] qpwVarArr = new qpw[256];
        for (int i = 0; i < 256; i++) {
            qpwVarArr[i] = new qpw((byte) i);
        }
        c = qpwVarArr;
        d = qpwVarArr[0];
    }

    public qpw(byte b) {
        char[] cArr = new char[2];
        oz80.b(b, cArr, 0);
        this.a = new String(cArr);
        this.b = b;
    }

    public final String toString() {
        return this.a;
    }
}
