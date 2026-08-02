package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class d9d0 {
    public static final c9d0 Companion = new c9d0();
    public final long a;
    public final String b;

    public /* synthetic */ d9d0(long j, int i, String str) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, b9d0.a.getDescriptor());
            throw null;
        }
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9d0)) {
            return false;
        }
        d9d0 d9d0Var = (d9d0) obj;
        return this.a == d9d0Var.a && jl40.l(this.b, d9d0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Bdui(configId=");
        sb.append(this.a);
        sb.append(", divDataJson=");
        return b64.p(sb, this.b, ')');
    }
}
