package xsna;

import java.util.Map;

/* compiled from: LayoutNodeAlignmentLines.kt */
/* loaded from: classes11.dex */
public final class k600 extends jt1 {
    @Override // xsna.jt1
    public final long b(androidx.compose.ui.node.o oVar, long j) {
        long j2 = oVar.w1().r;
        return ov70.f((Float.floatToRawIntBits((int) (j2 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L), j);
    }

    @Override // xsna.jt1
    public final Map<gt1, Integer> c(androidx.compose.ui.node.o oVar) {
        return oVar.w1().J0().q();
    }

    @Override // xsna.jt1
    public final int d(androidx.compose.ui.node.o oVar, gt1 gt1Var) {
        return oVar.w1().g0(gt1Var);
    }
}
