package xsna;

import java.util.List;

/* compiled from: StorefrontServicesState.kt */
/* loaded from: classes18.dex */
public final class gr1 {
    public final List<goi0> a;
    public final int b;
    public final boolean c;
    public final int d;

    public gr1(List<goi0> list, int i, boolean z, int i2) {
        this.a = list;
        this.b = i;
        this.c = z;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr1)) {
            return false;
        }
        gr1 gr1Var = (gr1) obj;
        return epx.f(this.a, gr1Var.a) && this.b == gr1Var.b && this.c == gr1Var.c && this.d == gr1Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + qoy.b(shy.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AlbumsStateData(albums=");
        sb.append(this.a);
        sb.append(", totalAlbums=");
        sb.append(this.b);
        sb.append(", onlyAlbumsRequested=");
        sb.append(this.c);
        sb.append(", requestedCount=");
        return vu5.b(sb, this.d, ')');
    }
}
