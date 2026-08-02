package xsna;

/* compiled from: PlayerStateChangedParams.kt */
/* loaded from: classes3.dex */
public final class o4b0 {
    public final String a;
    public final String b;
    public final long c;

    public o4b0(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4b0)) {
            return false;
        }
        o4b0 o4b0Var = (o4b0) obj;
        return epx.f(this.a, o4b0Var.a) && epx.f(this.b, o4b0Var.b) && this.c == o4b0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerStateChangedParams(currentState=");
        sb.append(this.a);
        sb.append(", prevState=");
        sb.append(this.b);
        sb.append(", durationSec=");
        return vu5.a(')', this.c, sb);
    }
}
