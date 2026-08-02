package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class nq50 implements ry50 {
    public static final mq50 Companion = new mq50();
    public final String a;
    public final String b;
    public final xy50 c;

    public /* synthetic */ nq50(int i, String str, String str2, xy50 xy50Var) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, lq50.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = xy50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nq50)) {
            return false;
        }
        nq50 nq50Var = (nq50) obj;
        return jl40.l(this.a, nq50Var.a) && jl40.l(this.b, nq50Var.b) && jl40.l(this.c, nq50Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "NetworkContainsPredicateModel(type=" + this.a + ", argName=" + this.b + ", primitiveArg=" + this.c + ')';
    }
}
