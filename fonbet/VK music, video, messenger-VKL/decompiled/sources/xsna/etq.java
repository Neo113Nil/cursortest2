package xsna;

/* compiled from: FavoritesContentState.kt */
/* loaded from: classes16.dex */
public final class etq {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public etq() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof etq)) {
            return false;
        }
        etq etqVar = (etq) obj;
        return this.a == etqVar.a && this.b == etqVar.b && this.c == etqVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FavoritesContentState(isAvailable=");
        sb.append(this.a);
        sb.append(", isAvailableForItem=");
        sb.append(this.b);
        sb.append(", isInFavorites=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    public /* synthetic */ etq(int i) {
        this(true, true, false);
    }

    public etq(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }
}
