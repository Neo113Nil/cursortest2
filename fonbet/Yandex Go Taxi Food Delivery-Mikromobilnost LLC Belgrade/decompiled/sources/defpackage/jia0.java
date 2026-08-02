package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class jia0 {
    public static final iia0 Companion = new iia0();
    public final String a;
    public final String b;
    public final long c;
    public final long d;

    public /* synthetic */ jia0(int i, long j, long j2, String str, String str2) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, hia0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jia0)) {
            return false;
        }
        jia0 jia0Var = (jia0) obj;
        return jl40.l(this.a, jia0Var.a) && jl40.l(this.b, jia0Var.b) && this.c == jia0Var.c && this.d == jia0Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + qv10.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScreenContent(screenType=");
        sb.append(this.a);
        sb.append(", targetUrl=");
        sb.append(this.b);
        sb.append(", initStartMessageTimeoutMillis=");
        sb.append(this.c);
        sb.append(", loadMessageTimeoutMillis=");
        return b64.o(sb, this.d, ')');
    }
}
