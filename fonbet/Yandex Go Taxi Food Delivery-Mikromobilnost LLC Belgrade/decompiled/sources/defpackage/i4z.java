package defpackage;

/* loaded from: classes2.dex */
public final class i4z {
    public final Long a;
    public final boolean b;
    public final String c;

    public i4z(Long l, String str, boolean z) {
        this.a = l;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4z)) {
            return false;
        }
        i4z i4zVar = (i4z) obj;
        return jl40.l(this.a, i4zVar.a) && this.b == i4zVar.b && jl40.l(this.c, i4zVar.c);
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
