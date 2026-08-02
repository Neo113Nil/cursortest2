package xsna;

import kotlin.Lazy;

/* compiled from: NewsfeedPreloadController.kt */
/* loaded from: classes4.dex */
public final class x0d0 {
    public final int a;
    public final ly3 b;
    public final d6f0 c;
    public final Lazy<ro10> d;
    public final w5r0 e;
    public final jhv f;
    public final dui g;
    public final awy h;

    public x0d0(int i, ly3 ly3Var, d6f0 d6f0Var, Lazy lazy, w5r0 w5r0Var, jhv jhvVar, dui duiVar, awy awyVar) {
        this.a = i;
        this.b = ly3Var;
        this.c = d6f0Var;
        this.d = lazy;
        this.e = w5r0Var;
        this.f = jhvVar;
        this.g = duiVar;
        this.h = awyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0d0)) {
            return false;
        }
        x0d0 x0d0Var = (x0d0) obj;
        return this.a == x0d0Var.a && this.b.equals(x0d0Var.b) && this.c.equals(x0d0Var.c) && epx.f(this.d, x0d0Var.d) && epx.f(this.e, x0d0Var.e) && epx.f(this.f, x0d0Var.f) && epx.f(this.g, x0d0Var.g) && epx.f(this.h, x0d0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + g7r0.a(this.d, (this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31, 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PreloadControllerParams(preloadCount=" + this.a + ", contentPreloader=" + this.b + ", reactionsPreloader=" + this.c + ", maxSkipCountClosingAdInteractorLazy=" + this.d + ", uxPollsViewPool=" + this.e + ", html5ViewPool=" + this.f + ", compositeOnScrollListeners=" + this.g + ", lazyLoadBlocksDelegate=" + this.h + ')';
    }
}
