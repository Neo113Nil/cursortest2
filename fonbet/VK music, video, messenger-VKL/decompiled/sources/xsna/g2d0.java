package xsna;

/* compiled from: OverlayAdBannerLoader.kt */
/* loaded from: classes18.dex */
public final class g2d0 {
    public final String a;
    public final long b;
    public final long c;

    public g2d0() {
        this((String) null, 0L, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2d0)) {
            return false;
        }
        g2d0 g2d0Var = (g2d0) obj;
        return epx.f(this.a, g2d0Var.a) && this.b == g2d0Var.b && this.c == g2d0Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        return Long.hashCode(this.c) + bh10.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreparedOverlayData(bannerId=");
        sb.append(this.a);
        sb.append(", startAt=");
        sb.append(this.b);
        sb.append(", duration=");
        return vu5.a(')', this.c, sb);
    }

    public /* synthetic */ g2d0(String str, long j, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? 0L : j, 0L);
    }

    public g2d0(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }
}
