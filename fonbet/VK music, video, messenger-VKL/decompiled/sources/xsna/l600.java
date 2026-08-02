package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import xsna.tra0;

/* compiled from: Placeable.kt */
/* loaded from: classes11.dex */
public final class l600 extends tra0.a {
    public final androidx.compose.ui.node.f c;

    public l600(androidx.compose.ui.node.f fVar) {
        this.c = fVar;
    }

    @Override // xsna.tra0.a
    public final float e(qrg0 qrg0Var) {
        int U;
        wzs<tra0.a, Float, Float> wzsVar = qrg0Var.a;
        if (wzsVar != null) {
            return wzsVar.invoke(this, Float.valueOf(Float.NaN)).floatValue();
        }
        androidx.compose.ui.node.f fVar = this.c;
        if (fVar.l) {
            return Float.NaN;
        }
        androidx.compose.ui.node.f fVar2 = fVar;
        while (true) {
            trg0 trg0Var = fVar2.n;
            float f = (trg0Var == null || (U = rl3.U(qrg0Var, trg0Var.b)) < 0) ? Float.NaN : trg0Var.c[U];
            if (!Float.isNaN(f)) {
                fVar2.x0(fVar.o1(), qrg0Var);
                return qrg0Var.a(f, fVar2.g1(), fVar.g1());
            }
            androidx.compose.ui.node.f M0 = fVar2.M0();
            if (M0 == null) {
                fVar2.x0(fVar.o1(), qrg0Var);
                return Float.NaN;
            }
            fVar2 = M0;
        }
    }

    @Override // xsna.tra0.a, xsna.azl
    public final float getDensity() {
        return this.c.getDensity();
    }

    @Override // xsna.tra0.a, xsna.azl
    public final float getFontScale() {
        return this.c.getFontScale();
    }

    @Override // xsna.tra0.a
    public final LayoutDirection k() {
        return this.c.getLayoutDirection();
    }

    @Override // xsna.tra0.a
    public final int p() {
        return this.c.n0();
    }
}
