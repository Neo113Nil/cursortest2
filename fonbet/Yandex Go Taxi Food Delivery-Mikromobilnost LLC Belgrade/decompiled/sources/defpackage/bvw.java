package defpackage;

import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.ui.node.LookaheadCapablePlaceable;

/* loaded from: classes10.dex */
public final class bvw extends zuw {
    public IntrinsicSize a;
    public boolean b;

    @Override // defpackage.zuw
    public final long E0(x910 x910Var, long j) {
        int e0 = this.a == IntrinsicSize.Min ? x910Var.e0(n8e.h(j)) : x910Var.k0(n8e.h(j));
        if (e0 < 0) {
            e0 = 0;
        }
        if (e0 < 0) {
            kxv.a("width must be >= 0");
        }
        return p8e.h(e0, e0, 0, Integer.MAX_VALUE);
    }

    @Override // defpackage.zuw
    public final boolean F0() {
        return this.b;
    }

    @Override // defpackage.zuw, defpackage.v0y
    public final int O(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        return this.a == IntrinsicSize.Min ? x910Var.e0(i) : x910Var.k0(i);
    }

    @Override // defpackage.zuw, defpackage.v0y
    public final int b(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        return this.a == IntrinsicSize.Min ? x910Var.e0(i) : x910Var.k0(i);
    }
}
