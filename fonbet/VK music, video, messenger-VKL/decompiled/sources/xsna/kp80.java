package xsna;

/* compiled from: OnlineMembersLocalModel.kt */
/* loaded from: classes2.dex */
public final class kp80 {
    public final fmb a;
    public final int b;
    public final long c;

    public kp80(fmb fmbVar, int i, long j) {
        this.a = fmbVar;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp80)) {
            return false;
        }
        kp80 kp80Var = (kp80) obj;
        return epx.f(this.a, kp80Var.a) && this.b == kp80Var.b && this.c == kp80Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnlineMembersLocalModel(chat=");
        sb.append(this.a);
        sb.append(", onlineCount=");
        sb.append(this.b);
        sb.append(", updateTimestamp=");
        return vu5.a(')', this.c, sb);
    }
}
