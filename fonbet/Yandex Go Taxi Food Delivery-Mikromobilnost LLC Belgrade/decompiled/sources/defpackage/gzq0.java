package defpackage;

@gsq0
/* loaded from: classes.dex */
public final class gzq0 {
    public static final fzq0 Companion = new fzq0();
    public final String a;
    public final String b;
    public final int c;
    public final long d;

    public /* synthetic */ gzq0(long j, String str, int i, int i2, String str2) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, ezq0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = i2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzq0)) {
            return false;
        }
        gzq0 gzq0Var = (gzq0) obj;
        return jl40.l(this.a, gzq0Var.a) && jl40.l(this.b, gzq0Var.b) && this.c == gzq0Var.c && this.d == gzq0Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + oyr.b(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionDetails(sessionId=");
        sb.append(this.a);
        sb.append(", firstSessionId=");
        sb.append(this.b);
        sb.append(", sessionIndex=");
        sb.append(this.c);
        sb.append(", sessionStartTimestampUs=");
        return b64.o(sb, this.d, ')');
    }

    public gzq0(String str, String str2, int i, long j) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
    }
}
