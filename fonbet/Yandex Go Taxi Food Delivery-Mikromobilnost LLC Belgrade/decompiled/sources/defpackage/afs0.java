package defpackage;

/* loaded from: classes11.dex */
public final class afs0 extends cnz0 {
    public final short c;
    public final short d;

    public afs0(cnz0 cnz0Var, int i, int i2) {
        super(cnz0Var);
        this.c = (short) i;
        this.d = (short) i2;
    }

    @Override // defpackage.cnz0
    public final void a(uz5 uz5Var, byte[] bArr) {
        uz5Var.b(this.c, this.d);
    }

    public final String toString() {
        short s = this.d;
        return "<" + Integer.toBinaryString((this.c & ((1 << s) - 1)) | (1 << s) | (1 << s)).substring(1) + '>';
    }
}
