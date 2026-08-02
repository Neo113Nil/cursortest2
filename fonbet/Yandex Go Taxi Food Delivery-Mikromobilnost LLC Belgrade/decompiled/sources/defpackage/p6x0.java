package defpackage;

/* loaded from: classes2.dex */
public final class p6x0 {
    public final la60 a;
    public final int b;
    public final byte[] c;
    public final byte[] d;

    public p6x0(la60 la60Var, int i, byte[] bArr, byte[] bArr2) {
        this.a = la60Var;
        this.b = i;
        this.c = bArr;
        this.d = bArr2;
        if (i == bArr2.length) {
            return;
        }
        ny61.g("Failed requirement.");
        throw null;
    }

    public final String toString() {
        String c = cdb1.c("%02x", this.c);
        String c2 = cdb1.c("%02x", this.d);
        StringBuilder sb = new StringBuilder("tag ");
        sb.append(this.a);
        sb.append(", length : ");
        sb.append(this.b);
        sb.append(", rawEncodedLengthBytes : ");
        return unr0.r(sb, c, " valueBytes : ", c2);
    }
}
