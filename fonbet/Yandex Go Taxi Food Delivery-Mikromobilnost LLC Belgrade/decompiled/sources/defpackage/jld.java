package defpackage;

/* loaded from: classes2.dex */
public final class jld {
    public final String a;
    public final String b;

    public jld(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jld)) {
            return false;
        }
        jld jldVar = (jld) obj;
        return this.a.equals(jldVar.a) && jl40.l(this.b, jldVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessScreen(title=");
        sb.append(this.a);
        sb.append(", message=");
        return b64.p(sb, this.b, ')');
    }
}
