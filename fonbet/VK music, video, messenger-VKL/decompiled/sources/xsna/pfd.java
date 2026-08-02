package xsna;

/* compiled from: ClipVisibilityAnalytics.kt */
/* loaded from: classes4.dex */
public final class pfd {
    public String a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;

    public pfd() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfd)) {
            return false;
        }
        pfd pfdVar = (pfd) obj;
        return epx.f(this.a, pfdVar.a) && this.b == pfdVar.b && this.c == pfdVar.c && this.d == pfdVar.d && this.e == pfdVar.e && this.f == pfdVar.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + bh10.a(bh10.a(bh10.a(bh10.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipVisibilityAnalytics(clipUniqueKey=");
        sb.append(this.a);
        sb.append(", percent1=");
        sb.append(this.b);
        sb.append(", percent25=");
        sb.append(this.c);
        sb.append(", percent50=");
        sb.append(this.d);
        sb.append(", percent75=");
        sb.append(this.e);
        sb.append(", percent100=");
        return vu5.a(')', this.f, sb);
    }

    public pfd(int i) {
        this.a = "";
        this.b = -1L;
        this.c = -1L;
        this.d = -1L;
        this.e = -1L;
        this.f = -1L;
    }
}
