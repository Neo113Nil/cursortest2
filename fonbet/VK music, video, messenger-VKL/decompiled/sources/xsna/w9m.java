package xsna;

/* compiled from: DialogAppearanceMeta.kt */
/* loaded from: classes2.dex */
public final class w9m {
    public final String a;
    public final long b;

    public w9m(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9m)) {
            return false;
        }
        w9m w9mVar = (w9m) obj;
        return epx.f(this.a, w9mVar.a) && this.b == w9mVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogAppearanceMeta(id=");
        sb.append(this.a);
        sb.append(", updateTime=");
        return vu5.a(')', this.b, sb);
    }
}
