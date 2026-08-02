package xsna;

import androidx.compose.foundation.gestures.Orientation;

/* compiled from: LazyLayoutSemantics.kt */
/* loaded from: classes11.dex */
final class ouy extends d730<puy> {
    public final gzs<androidx.compose.foundation.lazy.layout.b> a;
    public final luy b;
    public final Orientation c;
    public final boolean d;

    public ouy(gzs gzsVar, luy luyVar, Orientation orientation, boolean z) {
        this.a = gzsVar;
        this.b = luyVar;
        this.c = orientation;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ouy)) {
            return false;
        }
        ouy ouyVar = (ouy) obj;
        return this.a == ouyVar.a && epx.f(this.b, ouyVar.b) && this.c == ouyVar.c && this.d == ouyVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + qoy.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }

    @Override // xsna.d730
    public final puy r() {
        return new puy(this.a, this.b, this.c, this.d);
    }

    @Override // xsna.d730
    public final void s(puy puyVar) {
        puy puyVar2 = puyVar;
        puyVar2.p = this.a;
        puyVar2.q = this.b;
        Orientation orientation = puyVar2.r;
        Orientation orientation2 = this.c;
        if (orientation != orientation2) {
            puyVar2.r = orientation2;
            itl.f(puyVar2).R();
        }
        boolean z = puyVar2.s;
        boolean z2 = this.d;
        if (z == z2) {
            return;
        }
        puyVar2.s = z2;
        puyVar2.i2();
        itl.f(puyVar2).R();
    }
}
