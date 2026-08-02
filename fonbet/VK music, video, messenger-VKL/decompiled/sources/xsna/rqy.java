package xsna;

import androidx.compose.foundation.gestures.Orientation;

/* compiled from: LazyGridBeyondBoundsModifier.kt */
/* loaded from: classes11.dex */
public final class rqy implements tsy {
    public final dsy a;

    public rqy(dsy dsyVar) {
        this.a = dsyVar;
    }

    @Override // xsna.tsy
    public final int a() {
        return this.a.g();
    }

    @Override // xsna.tsy
    public final int b() {
        int i;
        dsy dsyVar = this.a;
        if (dsyVar.i().f().isEmpty()) {
            return 0;
        }
        kry i2 = dsyVar.i();
        int a = (int) (i2.getOrientation() == Orientation.Vertical ? i2.a() & 4294967295L : i2.a() >> 32);
        int p = kn4.p(dsyVar.i());
        if (p != 0 && (i = a / p) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // xsna.tsy
    public final boolean c() {
        return !this.a.i().f().isEmpty();
    }

    @Override // xsna.tsy
    public final int d() {
        return ((xqy) j5g.i0(this.a.i().f())).getIndex();
    }

    @Override // xsna.tsy
    public final int getItemCount() {
        return this.a.i().d();
    }
}
