package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class p6c {
    public static final o6c Companion = new o6c();
    public final q3k0 a;
    public final q3k0 b;
    public final q9v c;
    public final q3k0 d;

    public /* synthetic */ p6c(int i, q3k0 q3k0Var, q3k0 q3k0Var2, q9v q9vVar, q3k0 q3k0Var3) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, n6c.a.getDescriptor());
            throw null;
        }
        this.a = q3k0Var;
        this.b = q3k0Var2;
        this.c = q9vVar;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = q3k0Var3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6c)) {
            return false;
        }
        p6c p6cVar = (p6c) obj;
        return jl40.l(this.a, p6cVar.a) && jl40.l(this.b, p6cVar.b) && jl40.l(this.c, p6cVar.c) && jl40.l(this.d, p6cVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        q3k0 q3k0Var = this.d;
        return hashCode + (q3k0Var == null ? 0 : q3k0Var.hashCode());
    }

    public final String toString() {
        return "ClosingOfferAsset(title=" + this.a + ", price=" + this.b + ", icon=" + this.c + ", additionalButtonText=" + this.d + ')';
    }
}
