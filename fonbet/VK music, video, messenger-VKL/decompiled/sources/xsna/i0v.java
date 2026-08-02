package xsna;

/* compiled from: HealthConnectVersionInfo.kt */
/* loaded from: classes12.dex */
public final class i0v {
    public final Long a;
    public final h0v b;

    public i0v(Long l, h0v h0vVar) {
        this.a = l;
        this.b = h0vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0v)) {
            return false;
        }
        i0v i0vVar = (i0v) obj;
        return epx.f(this.a, i0vVar.a) && epx.f(this.b, i0vVar.b);
    }

    public final int hashCode() {
        Long l = this.a;
        return this.b.hashCode() + ((l == null ? 0 : l.hashCode()) * 31);
    }

    public final String toString() {
        return "HealthConnectVersionInfo(apkVersionCode=" + this.a + ", platformVersion=" + this.b + ')';
    }
}
