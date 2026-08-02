package defpackage;

/* loaded from: classes10.dex */
public final class bez0 implements b2k0 {
    public final long b;
    public final b2k0 c;

    public bez0(long j, b2k0 b2k0Var) {
        d6z.m("Timeout must be non-negative.", j >= 0);
        this.b = j;
        this.c = b2k0Var;
    }

    @Override // defpackage.b2k0
    public final long a() {
        return this.b;
    }

    @Override // defpackage.b2k0
    public final a2k0 b(os7 os7Var) {
        a2k0 b = this.c.b(os7Var);
        long j = this.b;
        return (j <= 0 || os7Var.b < j - b.a) ? b : a2k0.d;
    }
}
