package xsna;

/* compiled from: SessionEvent.kt */
/* loaded from: classes.dex */
public final class wti0 {
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public final ztk e;
    public final String f;
    public final String g;

    public wti0(String str, String str2, int i, long j, ztk ztkVar, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.e = ztkVar;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wti0)) {
            return false;
        }
        wti0 wti0Var = (wti0) obj;
        return epx.f(this.a, wti0Var.a) && epx.f(this.b, wti0Var.b) && this.c == wti0Var.c && this.d == wti0Var.d && epx.f(this.e, wti0Var.e) && epx.f(this.f, wti0Var.f) && epx.f(this.g, wti0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + urd0.a((this.e.hashCode() + bh10.a(shy.a(this.c, urd0.a(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.a);
        sb.append(", firstSessionId=");
        sb.append(this.b);
        sb.append(", sessionIndex=");
        sb.append(this.c);
        sb.append(", eventTimestampUs=");
        sb.append(this.d);
        sb.append(", dataCollectionStatus=");
        sb.append(this.e);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f);
        sb.append(", firebaseAuthenticationToken=");
        return ho8.a(sb, this.g, ')');
    }
}
