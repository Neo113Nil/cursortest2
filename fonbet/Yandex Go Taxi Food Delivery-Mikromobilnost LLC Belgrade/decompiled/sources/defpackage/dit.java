package defpackage;

/* loaded from: classes2.dex */
public final class dit {
    public final String a;
    public final String b;
    public final boolean c;

    public dit(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dit)) {
            return false;
        }
        dit ditVar = (dit) obj;
        return jl40.l(this.a, ditVar.a) && jl40.l(this.b, ditVar.b) && this.c == ditVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GlobalAnalyticsParams(clientSource=");
        sb.append(this.a);
        sb.append(", clientSubSource=");
        sb.append(this.b);
        sb.append(", isPlusHome=");
        return unr0.u(sb, this.c, ')');
    }
}
