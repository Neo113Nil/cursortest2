package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import kotlin.collections.b;

/* loaded from: classes10.dex */
public final class h421 extends e530 implements v0y {
    public float a;
    public float b;

    @Override // defpackage.v0y
    public final int O(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        int k0 = x910Var.k0(i);
        int f0 = !Float.isNaN(this.a) ? lookaheadCapablePlaceable.f0(this.a) : 0;
        return k0 < f0 ? f0 : k0;
    }

    @Override // defpackage.v0y
    public final int b(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        int e0 = x910Var.e0(i);
        int f0 = !Float.isNaN(this.a) ? lookaheadCapablePlaceable.f0(this.a) : 0;
        return e0 < f0 ? f0 : e0;
    }

    @Override // defpackage.v0y
    public final aa10 e(k kVar, x910 x910Var, long j) {
        int k;
        int j2;
        if (Float.isNaN(this.a) || n8e.k(j) != 0) {
            k = n8e.k(j);
        } else {
            int f0 = kVar.f0(this.a);
            k = n8e.i(j);
            if (f0 < 0) {
                f0 = 0;
            }
            if (f0 <= k) {
                k = f0;
            }
        }
        int i = n8e.i(j);
        if (Float.isNaN(this.b) || n8e.j(j) != 0) {
            j2 = n8e.j(j);
        } else {
            int f02 = kVar.f0(this.b);
            j2 = n8e.h(j);
            int i2 = f02 >= 0 ? f02 : 0;
            if (i2 <= j2) {
                j2 = i2;
            }
        }
        o l0 = x910Var.l0(p8e.a(k, i, j2, n8e.h(j)));
        return kVar.w(l0.a, l0.b, b.f(), new q83(l0, 20));
    }

    @Override // defpackage.v0y
    public final int l0(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        int V = x910Var.V(i);
        int f0 = !Float.isNaN(this.b) ? lookaheadCapablePlaceable.f0(this.b) : 0;
        return V < f0 ? f0 : V;
    }

    @Override // defpackage.v0y
    public final int v(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        int y = x910Var.y(i);
        int f0 = !Float.isNaN(this.b) ? lookaheadCapablePlaceable.f0(this.b) : 0;
        return y < f0 ? f0 : y;
    }
}
