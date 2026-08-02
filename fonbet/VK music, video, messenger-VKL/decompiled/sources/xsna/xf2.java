package xsna;

import android.graphics.PointF;
import java.util.List;

/* compiled from: AnimatableSplitDimensionPathValue.java */
/* loaded from: classes12.dex */
public final class xf2 implements fg2<PointF, PointF> {
    public final nf2 b;
    public final nf2 c;

    public xf2(nf2 nf2Var, nf2 nf2Var2) {
        this.b = nf2Var;
        this.c = nf2Var2;
    }

    @Override // xsna.fg2
    public final boolean d() {
        return this.b.d() && this.c.d();
    }

    @Override // xsna.fg2
    public final tf6<PointF, PointF> j() {
        return new llk0(this.b.j(), this.c.j());
    }

    @Override // xsna.fg2
    public final List<nhy<PointF>> l() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
}
