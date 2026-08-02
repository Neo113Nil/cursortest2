package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class aw50 implements ry50 {
    public static final zv50 Companion = new zv50();
    public final String a;
    public final String b;

    public /* synthetic */ aw50(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, yv50.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw50)) {
            return false;
        }
        aw50 aw50Var = (aw50) obj;
        return jl40.l(this.a, aw50Var.a) && jl40.l(this.b, aw50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkIsExistPredicateModel(type=");
        sb.append(this.a);
        sb.append(", argName=");
        return b64.p(sb, this.b, ')');
    }
}
