package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class mu80 implements pw80 {
    public static final lu80 Companion = new lu80();
    public final String a;
    public final String b;

    public /* synthetic */ mu80(int i, String str, String str2) {
        if (2 != (i & 2)) {
            qje.Z(i, 2, ku80.a.getDescriptor());
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
        if (!(obj instanceof mu80)) {
            return false;
        }
        mu80 mu80Var = (mu80) obj;
        return jl40.l(this.a, mu80Var.a) && jl40.l(this.b, mu80Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OptionStatusRequest(trackId=");
        sb.append(this.a);
        sb.append(", optionId=");
        return b64.p(sb, this.b, ')');
    }
}
