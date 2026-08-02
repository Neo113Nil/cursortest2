package xsna;

/* compiled from: CurrentAccountInformation.kt */
/* loaded from: classes18.dex */
public final class glk {
    public final boolean a;
    public final long b;

    public glk(boolean z, long j) {
        this.a = z;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof glk)) {
            return false;
        }
        glk glkVar = (glk) obj;
        return this.a == glkVar.a && this.b == glkVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurrentAccountInformation(hasMusicSubscription=");
        sb.append(this.a);
        sb.append(", expiresDate=");
        return vu5.a(')', this.b, sb);
    }
}
