package defpackage;

import androidx.compose.foundation.layout.Direction;
import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import kotlin.collections.b;

/* loaded from: classes.dex */
public final class m3r extends e530 implements v0y {
    public Direction a;
    public float b;

    @Override // defpackage.v0y
    public final aa10 e(k kVar, x910 x910Var, long j) {
        int k;
        int i;
        int i2;
        int i3;
        if (!n8e.e(j) || this.a == Direction.Vertical) {
            k = n8e.k(j);
            i = n8e.i(j);
        } else {
            int round = Math.round(n8e.i(j) * this.b);
            int k2 = n8e.k(j);
            k = n8e.i(j);
            if (round < k2) {
                round = k2;
            }
            if (round <= k) {
                k = round;
            }
            i = k;
        }
        if (!n8e.d(j) || this.a == Direction.Horizontal) {
            int j2 = n8e.j(j);
            int h = n8e.h(j);
            i2 = j2;
            i3 = h;
        } else {
            int round2 = Math.round(n8e.h(j) * this.b);
            int j3 = n8e.j(j);
            i2 = n8e.h(j);
            if (round2 < j3) {
                round2 = j3;
            }
            if (round2 <= i2) {
                i2 = round2;
            }
            i3 = i2;
        }
        o l0 = x910Var.l0(p8e.a(k, i, i2, i3));
        return kVar.w(l0.a, l0.b, b.f(), new l3r(l0, 0));
    }
}
