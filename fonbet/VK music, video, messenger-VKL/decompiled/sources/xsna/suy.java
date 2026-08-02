package xsna;

import androidx.compose.foundation.gestures.Orientation;

/* compiled from: LazyListBeyondBoundsModifier.kt */
/* loaded from: classes11.dex */
public final class suy implements tsy {
    public final xvy a;

    public suy(xvy xvyVar) {
        this.a = xvyVar;
    }

    @Override // xsna.tsy
    public final int a() {
        return Math.max(0, this.a.h());
    }

    @Override // xsna.tsy
    public final int b() {
        int i;
        xvy xvyVar = this.a;
        if (xvyVar.j().f().isEmpty()) {
            return 0;
        }
        fvy j = xvyVar.j();
        int a = (int) (j.getOrientation() == Orientation.Vertical ? j.a() & 4294967295L : j.a() >> 32);
        int w = hpt0.w(xvyVar.j());
        if (w != 0 && (i = a / w) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // xsna.tsy
    public final boolean c() {
        return !this.a.j().f().isEmpty();
    }

    @Override // xsna.tsy
    public final int d() {
        return Math.min(getItemCount() - 1, ((xuy) j5g.i0(this.a.j().f())).getIndex());
    }

    @Override // xsna.tsy
    public final int getItemCount() {
        return this.a.j().d();
    }
}
