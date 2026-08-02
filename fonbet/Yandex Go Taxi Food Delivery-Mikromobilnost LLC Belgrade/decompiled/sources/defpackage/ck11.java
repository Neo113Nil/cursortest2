package defpackage;

/* loaded from: classes.dex */
public final class ck11 implements f3n {
    public final int a;
    public final int b;
    public final rbn c;

    public ck11(int i, rbn rbnVar, int i2) {
        this((i2 & 1) != 0 ? 300 : i, 0, (i2 & 4) != 0 ? ubn.a : rbnVar);
    }

    @Override // defpackage.jj2
    public final f531 a(gl11 gl11Var) {
        return new n531(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ck11) {
            ck11 ck11Var = (ck11) obj;
            if (ck11Var.a == this.a && ck11Var.b == this.b && jl40.l(ck11Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.a * 31)) * 31) + this.b;
    }

    @Override // defpackage.f3n, defpackage.jj2
    public final h531 a(gl11 gl11Var) {
        return new n531(this.a, this.b, this.c);
    }

    public ck11() {
        this(0, (rbn) null, 7);
    }

    public ck11(int i, int i2, rbn rbnVar) {
        this.a = i;
        this.b = i2;
        this.c = rbnVar;
    }
}
