package defpackage;

/* loaded from: classes7.dex */
public final class en81 extends de71 {
    public final n171 a;
    public final g8q0 w;
    public final byte[] x;
    public final yc7 y;

    public en81(yj81 yj81Var, n171 n171Var, g8q0 g8q0Var, byte[] bArr) {
        this.a = n171Var;
        this.w = g8q0Var;
        this.x = bArr;
        this.y = new yc7(n171Var, yj81Var.b, bArr, g8q0Var);
    }

    @Override // defpackage.de71
    public final void a() {
        this.y.f = true;
    }

    @Override // defpackage.de71
    public final Object b() {
        float f;
        this.y.a();
        g8q0 g8q0Var = this.w;
        if (g8q0Var == null) {
            return null;
        }
        int i = g8q0Var.w + 1;
        g8q0Var.w = i;
        zv71 zv71Var = (zv71) g8q0Var.x;
        long j = g8q0Var.a;
        long j2 = g8q0Var.c;
        if (j == -1 || j == 0) {
            int i2 = g8q0Var.b;
            f = i2 != 0 ? (i * 100.0f) / i2 : -1.0f;
        } else {
            f = (j2 * 100.0f) / j;
        }
        zv71Var.a(j, f, j2);
        return null;
    }
}
