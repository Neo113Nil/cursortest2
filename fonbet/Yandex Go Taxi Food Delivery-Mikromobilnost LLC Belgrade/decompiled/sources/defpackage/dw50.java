package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class dw50 implements co50 {
    public static final cw50 Companion = new cw50();
    public final String a;
    public final String b;

    public /* synthetic */ dw50(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, bw50.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw50)) {
            return false;
        }
        dw50 dw50Var = (dw50) obj;
        return jl40.l(this.a, dw50Var.a) && jl40.l(this.b, dw50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkJustInteractActionModel(actionContext=");
        sb.append(this.a);
        sb.append(", type=");
        return b64.p(sb, this.b, ')');
    }
}
