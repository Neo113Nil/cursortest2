package defpackage;

/* loaded from: classes2.dex */
public final class kld {
    public final String a;
    public final String b;

    public kld(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kld)) {
            return false;
        }
        kld kldVar = (kld) obj;
        return this.a.equals(kldVar.a) && jl40.l(this.b, kldVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessScreenDetails(title=");
        sb.append(this.a);
        sb.append(", message=");
        return b64.p(sb, this.b, ')');
    }
}
