package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class ps80 implements pw80 {
    public static final os80 Companion = new os80();
    public final String a;
    public final String b;

    public /* synthetic */ ps80(int i, String str, String str2) {
        if (2 != (i & 2)) {
            qje.Z(i, 2, ns80.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps80)) {
            return false;
        }
        ps80 ps80Var = (ps80) obj;
        return jl40.l(this.a, ps80Var.a) && jl40.l(this.b, ps80Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CriticalError(trackId=");
        sb.append(this.a);
        sb.append(", message=");
        return b64.p(sb, this.b, ')');
    }
}
