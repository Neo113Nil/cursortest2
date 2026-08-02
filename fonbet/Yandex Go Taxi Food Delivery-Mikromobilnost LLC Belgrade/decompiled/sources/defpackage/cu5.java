package defpackage;

/* loaded from: classes11.dex */
public final class cu5 extends cnz0 {
    public final int c;
    public final int d;

    public cu5(cnz0 cnz0Var, int i, int i2) {
        super(cnz0Var);
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.cnz0
    public final void a(uz5 uz5Var, byte[] bArr) {
        int i = 0;
        while (true) {
            int i2 = this.d;
            if (i >= i2) {
                return;
            }
            if (i == 0 || (i == 31 && i2 <= 62)) {
                uz5Var.b(31, 5);
                if (i2 > 62) {
                    uz5Var.b(i2 - 31, 16);
                } else if (i == 0) {
                    uz5Var.b(Math.min(i2, 31), 5);
                } else {
                    uz5Var.b(i2 - 31, 5);
                }
            }
            uz5Var.b(bArr[this.c + i], 8);
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(this.c);
        sb.append("::");
        sb.append((r1 + this.d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
