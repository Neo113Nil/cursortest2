package defpackage;

/* loaded from: classes10.dex */
public final class i8q0 extends skl0 {
    public final h8q0 a;
    public final eb7 b;
    public final g8q0 c;
    public final byte[] w;
    public final yc7 x;

    public i8q0(h8q0 h8q0Var, eb7 eb7Var, g8q0 g8q0Var, byte[] bArr) {
        this.a = h8q0Var;
        this.b = eb7Var;
        this.c = g8q0Var;
        this.w = bArr;
        this.x = new yc7(eb7Var, h8q0Var.b, bArr, g8q0Var);
    }

    @Override // defpackage.skl0
    public final void cancelWork() {
        this.x.f = true;
    }

    @Override // defpackage.skl0
    public final Object doWork() {
        this.x.b();
        g8q0 g8q0Var = this.c;
        if (g8q0Var == null) {
            return null;
        }
        g8q0Var.w++;
        ((t7m) g8q0Var.x).b(g8q0Var.a, g8q0Var.b(), g8q0Var.c);
        return null;
    }
}
