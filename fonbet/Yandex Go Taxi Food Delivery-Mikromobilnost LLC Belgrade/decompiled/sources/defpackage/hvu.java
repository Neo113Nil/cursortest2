package defpackage;

/* loaded from: classes.dex */
public final class hvu {
    public final String a;
    public final String b;

    public hvu(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvu)) {
            return false;
        }
        hvu hvuVar = (hvu) obj;
        return jl40.l(this.a, hvuVar.a) && jl40.l(this.b, hvuVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpHeader(name=");
        sb.append(this.a);
        sb.append(", value=");
        return b64.p(sb, this.b, ')');
    }
}
