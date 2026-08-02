package xsna;

/* compiled from: AndroidWindowInfo.android.kt */
/* loaded from: classes11.dex */
public final class d1m {
    public static final d1m c = new d1m(0, 0);
    public final long a;
    public final long b;

    public d1m(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1m)) {
            return false;
        }
        d1m d1mVar = (d1m) obj;
        return q9x.b(this.a, d1mVar.a) && uco.a(this.b, d1mVar.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
