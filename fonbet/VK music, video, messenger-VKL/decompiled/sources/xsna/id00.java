package xsna;

/* compiled from: MarketEditAlbumCoverViewState.kt */
/* loaded from: classes18.dex */
public final class id00 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public id00(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id00)) {
            return false;
        }
        id00 id00Var = (id00) obj;
        return this.a == id00Var.a && this.b == id00Var.b && this.c == id00Var.c && this.d == id00Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MainAndHiddenViewState(isHidden=");
        sb.append(this.a);
        sb.append(", isHiddenEnabled=");
        sb.append(this.b);
        sb.append(", isMain=");
        sb.append(this.c);
        sb.append(", isMainEnabled=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
