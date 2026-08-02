package xsna;

/* compiled from: DialogBackgroundsMeta.kt */
/* loaded from: classes2.dex */
public final class uam {
    public final String a;
    public final long b;

    public uam(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uam)) {
            return false;
        }
        uam uamVar = (uam) obj;
        return epx.f(this.a, uamVar.a) && this.b == uamVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogBackgroundsMeta(id=");
        sb.append(this.a);
        sb.append(", updateTime=");
        return vu5.a(')', this.b, sb);
    }
}
