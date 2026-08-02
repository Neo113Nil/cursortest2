package xsna;

import androidx.compose.foundation.gestures.Orientation;

/* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
/* loaded from: classes11.dex */
final class rsy extends d730<ssy> {
    public final tsy a;
    public final qsy b;
    public final Orientation c;

    public rsy(tsy tsyVar, qsy qsyVar, Orientation orientation) {
        this.a = tsyVar;
        this.b = qsyVar;
        this.c = orientation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rsy)) {
            return false;
        }
        rsy rsyVar = (rsy) obj;
        return epx.f(this.a, rsyVar.a) && epx.f(this.b, rsyVar.b) && this.c == rsyVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, false);
    }

    @Override // xsna.d730
    public final ssy r() {
        ssy ssyVar = new ssy();
        ssyVar.p = this.a;
        ssyVar.q = this.b;
        ssyVar.r = this.c;
        return ssyVar;
    }

    @Override // xsna.d730
    public final void s(ssy ssyVar) {
        ssy ssyVar2 = ssyVar;
        ssyVar2.p = this.a;
        ssyVar2.q = this.b;
        ssyVar2.r = this.c;
    }
}
