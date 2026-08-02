package xsna;

/* compiled from: AuthorHeaderPicturePager.kt */
/* loaded from: classes5.dex */
public final class ia5 {
    public final ma5 a;
    public final float b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final ka5 f;
    public final mc90 g;
    public final bc90 h;
    public final fb5 i;

    public ia5(ma5 ma5Var, float f, boolean z, boolean z2, boolean z3, ka5 ka5Var, mc90 mc90Var, bc90 bc90Var, fb5 fb5Var) {
        this.a = ma5Var;
        this.b = f;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = ka5Var;
        this.g = mc90Var;
        this.h = bc90Var;
        this.i = fb5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia5)) {
            return false;
        }
        ia5 ia5Var = (ia5) obj;
        return epx.f(this.a, ia5Var.a) && Float.compare(this.b, ia5Var.b) == 0 && this.c == ia5Var.c && this.d == ia5Var.d && this.e == ia5Var.e && epx.f(this.f, ia5Var.f) && epx.f(this.g, ia5Var.g) && epx.f(this.h, ia5Var.h) && epx.f(this.i, ia5Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + qoy.b(qoy.b(qoy.b(io.reactivex.rxjava3.subjects.b.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AuthorHeaderMediaPageParams(item=" + this.a + ", currentProgress=" + this.b + ", isCurrentSettledPage=" + this.c + ", isScrollInProgress=" + this.d + ", shouldAutoAdvance=" + this.e + ", paginationCallbacks=" + this.f + ", pagerState=" + this.g + ", pagerSettings=" + this.h + ", presentation=" + this.i + ')';
    }
}
