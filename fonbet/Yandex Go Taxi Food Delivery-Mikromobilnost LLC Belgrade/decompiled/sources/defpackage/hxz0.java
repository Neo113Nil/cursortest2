package defpackage;

/* loaded from: classes2.dex */
public final class hxz0 {
    public final String a;
    public final String b;
    public final Long c;
    public final Long d;

    public hxz0(Long l, String str, String str2, Long l2) {
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxz0)) {
            return false;
        }
        hxz0 hxz0Var = (hxz0) obj;
        return jl40.l(this.a, hxz0Var.a) && jl40.l(this.b, hxz0Var.b) && jl40.l(this.c, hxz0Var.c) && jl40.l(this.d, hxz0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        return hashCode3 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopupConfiguration(actionScenario=");
        sb.append(this.a);
        sb.append(", webPageUrl=");
        sb.append(this.b);
        sb.append(", startMessageTimeoutMillis=");
        sb.append(this.c);
        sb.append(", loadMessageTimeoutMillis=");
        return qv10.q(sb, this.d, ')');
    }
}
