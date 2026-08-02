package xsna;

/* compiled from: ExternalFileInfo.kt */
/* loaded from: classes5.dex */
public final class jeq {
    public final long a;
    public final String b;

    public jeq(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jeq)) {
            return false;
        }
        jeq jeqVar = (jeq) obj;
        return this.a == jeqVar.a && epx.f(this.b, jeqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExternalFileInfo(size=");
        sb.append(this.a);
        sb.append(", displayName=");
        return ho8.a(sb, this.b, ')');
    }
}
