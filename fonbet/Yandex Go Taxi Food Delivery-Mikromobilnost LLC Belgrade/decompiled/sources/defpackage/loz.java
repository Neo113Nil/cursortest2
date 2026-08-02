package defpackage;

import androidx.compose.ui.layout.r;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class loz implements fwi {
    public boolean a;
    public long b = 9223372034707292159L;
    public long c = 0;
    public final /* synthetic */ LookaheadCapablePlaceable w;

    public loz(LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        this.w = lookaheadCapablePlaceable;
    }

    public final void a(r rVar, float f) {
        LookaheadCapablePlaceable lookaheadCapablePlaceable = this.w;
        gkl0 gkl0Var = lookaheadCapablePlaceable.F;
        if (gkl0Var == null) {
            gkl0Var = new gkl0();
            lookaheadCapablePlaceable.F = gkl0Var;
        }
        int H = j73.H(gkl0Var.b, rVar);
        if (H >= 0) {
            float[] fArr = gkl0Var.c;
            if (fArr[H] != f) {
                fArr[H] = f;
                gkl0Var.d[H] = 1;
                return;
            } else {
                byte[] bArr = gkl0Var.d;
                if (bArr[H] == 2) {
                    bArr[H] = 0;
                    return;
                }
                return;
            }
        }
        int i = gkl0Var.a;
        r[] rVarArr = gkl0Var.b;
        if (i == rVarArr.length) {
            int i2 = i * 2;
            gkl0Var.b = (r[]) Arrays.copyOf(rVarArr, i2);
            gkl0Var.c = Arrays.copyOf(gkl0Var.c, i2);
            gkl0Var.d = Arrays.copyOf(gkl0Var.d, i2);
        }
        gkl0Var.b[i] = rVar;
        gkl0Var.d[i] = 3;
        gkl0Var.c[i] = f;
        gkl0Var.a++;
    }

    @Override // defpackage.fwi
    public final float getDensity() {
        return this.w.getDensity();
    }

    @Override // defpackage.fwi
    public final float u0() {
        return this.w.u0();
    }
}
