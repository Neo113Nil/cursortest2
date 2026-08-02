package defpackage;

/* loaded from: classes8.dex */
public final class llc0 {
    public final Long a;
    public final boolean b;
    public final String c;

    public llc0(Long l, String str, boolean z) {
        this.a = l;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof llc0)) {
            return false;
        }
        llc0 llc0Var = (llc0) obj;
        return jl40.l(this.a, llc0Var.a) && this.b == llc0Var.b && jl40.l(this.c, llc0Var.c);
    }

    public final int hashCode() {
        Long l = this.a;
        int e = unr0.e((l == null ? 0 : l.hashCode()) * 31, 31, this.b);
        String str = this.c;
        return e + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(userId=");
        sb.append(this.a);
        sb.append(", isLightTheme=");
        sb.append(this.b);
        sb.append(", subscriptionState=");
        return b64.p(sb, this.c, ')');
    }
}
