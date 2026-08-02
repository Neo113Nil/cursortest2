package xsna;

/* compiled from: OwnerTopBarState.kt */
/* loaded from: classes5.dex */
public final class w590 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final ja5 g;

    public w590(dd80 dd80Var, dd80 dd80Var2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, ja5 ja5Var) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = ja5Var;
    }

    public static w590 a(w590 w590Var, boolean z, int i) {
        w590Var.getClass();
        return new w590(null, null, w590Var.a, (i & 8) != 0 ? w590Var.b : false, w590Var.c, (i & 32) != 0 ? w590Var.d : false, z, w590Var.f, w590Var.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w590)) {
            return false;
        }
        w590 w590Var = (w590) obj;
        w590Var.getClass();
        return epx.f(null, null) && epx.f(null, null) && this.a == w590Var.a && this.b == w590Var.b && this.c == w590Var.c && this.d == w590Var.d && this.e == w590Var.e && this.f == w590Var.f && epx.f(this.g, w590Var.g);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "OwnerTopBarState(config=" + ((Object) null) + ", overlayConfig=" + ((Object) null) + ", isOwner=" + this.a + ", hasLoadedContent=" + this.b + ", isLoading=" + this.c + ", isLoadingSkeletonVisible=" + this.d + ", isErrorPlaceholderVisible=" + this.e + ", useDefaultNativeNavigation=" + this.f + ", mediaPagerState=" + this.g + ')';
    }
}
