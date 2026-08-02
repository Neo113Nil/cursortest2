package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class p9d0 {
    public static final o9d0 Companion = new o9d0();
    public final String a;
    public final String b;

    public /* synthetic */ p9d0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, n9d0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9d0)) {
            return false;
        }
        p9d0 p9d0Var = (p9d0) obj;
        return jl40.l(this.a, p9d0Var.a) && jl40.l(this.b, p9d0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(text=");
        sb.append(this.a);
        sb.append(", uri=");
        return b64.p(sb, this.b, ')');
    }
}
