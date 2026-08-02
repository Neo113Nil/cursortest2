package xsna;

/* compiled from: MusicCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final class ld40 {
    public final boolean a;
    public final cd40 b;
    public final dd40 c;
    public final tr9 d;
    public final h1j e;
    public final ll40 f;
    public final lq40 g;
    public final g950 h;
    public final yw90 i;
    public final vsn0 j;

    public ld40(boolean z, cd40 cd40Var, dd40 dd40Var, tr9 tr9Var, h1j h1jVar, ll40 ll40Var, lq40 lq40Var, g950 g950Var, yw90 yw90Var, tiy tiyVar) {
        this.a = z;
        this.b = cd40Var;
        this.c = dd40Var;
        this.d = tr9Var;
        this.e = h1jVar;
        this.f = ll40Var;
        this.g = lq40Var;
        this.h = g950Var;
        this.i = yw90Var;
        this.j = tiyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld40)) {
            return false;
        }
        ld40 ld40Var = (ld40) obj;
        return this.a == ld40Var.a && this.b.equals(ld40Var.b) && this.c.equals(ld40Var.c) && this.d.equals(ld40Var.d) && this.e.equals(ld40Var.e) && epx.f(this.f, ld40Var.f) && epx.f(this.g, ld40Var.g) && epx.f(this.h, ld40Var.h) && this.i.equals(ld40Var.i) && epx.f(this.j, ld40Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MusicCatalogRootVhParams(isBackButtonAllowed=" + this.a + ", hasDrawerEntryPoint=" + this.b + ", onDrawerIconClicked=" + this.c + ", onDrawerIconLongClicked=" + this.d + ", viewLifecycleOwnerProvider=" + this.e + ", hintsManager=" + this.f + ", offlineManager=" + this.g + ", subscriptionProvider=" + this.h + ", performanceSession=" + this.i + ", tabLayoutOnboardingDelegate=" + this.j + ')';
    }
}
