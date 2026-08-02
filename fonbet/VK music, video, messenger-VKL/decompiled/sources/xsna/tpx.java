package xsna;

/* compiled from: DialogsListLoaderUpdate.kt */
/* loaded from: classes18.dex */
public final class tpx implements zsm {
    public final gkx0 a;
    public final int b;

    public tpx(int i, gkx0 gkx0Var) {
        this.a = gkx0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tpx)) {
            return false;
        }
        tpx tpxVar = (tpx) obj;
        return epx.f(this.a, tpxVar.a) && this.b == tpxVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InvalidateRange(invalidateSince=");
        sb.append(this.a);
        sb.append(", limit=");
        return vu5.b(sb, this.b, ')');
    }
}
