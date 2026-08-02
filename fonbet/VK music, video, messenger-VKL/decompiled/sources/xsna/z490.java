package xsna;

/* compiled from: OwnerGridConfig.kt */
/* loaded from: classes17.dex */
public final class z490 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public z490(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z490)) {
            return false;
        }
        z490 z490Var = (z490) obj;
        return this.a == z490Var.a && this.b == z490Var.b && this.c == z490Var.c && this.d == z490Var.d && this.e == z490Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OwnerGridConfig(fetchDrafts=");
        sb.append(this.a);
        sb.append(", withLikes=");
        sb.append(this.b);
        sb.append(", withProfile=");
        sb.append(this.c);
        sb.append(", withDelayedPublications=");
        sb.append(this.d);
        sb.append(", observeUploads=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
