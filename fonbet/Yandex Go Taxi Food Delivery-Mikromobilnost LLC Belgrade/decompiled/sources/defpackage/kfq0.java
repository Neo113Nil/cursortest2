package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.node.s;
import java.util.List;

/* loaded from: classes10.dex */
public final class kfq0 extends lqh implements v0y, pam, ejt {
    public lkq0 c;
    public final yjy0 w;

    public kfq0(kk2 kk2Var, ety0 ety0Var, dyr dyrVar, tls tlsVar, int i, boolean z, int i2, int i3, List list, tls tlsVar2, lkq0 lkq0Var, xfc xfcVar, xt3 xt3Var) {
        this.c = lkq0Var;
        yjy0 yjy0Var = new yjy0(kk2Var, ety0Var, dyrVar, tlsVar, i, z, i2, i3, list, tlsVar2, lkq0Var, xfcVar, xt3Var, null);
        E0(yjy0Var);
        this.w = yjy0Var;
        if (this.c == null) {
            throw nzs.g("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        }
    }

    @Override // defpackage.v0y
    public final int O(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        return this.w.O(lookaheadCapablePlaceable, x910Var, i);
    }

    @Override // defpackage.v0y
    public final int b(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        return this.w.b(lookaheadCapablePlaceable, x910Var, i);
    }

    @Override // defpackage.pam
    public final void d(c1y c1yVar) {
        this.w.d(c1yVar);
    }

    @Override // defpackage.v0y
    public final aa10 e(k kVar, x910 x910Var, long j) {
        return this.w.e(kVar, x910Var, j);
    }

    @Override // defpackage.ejt
    public final void g(s sVar) {
        lkq0 lkq0Var = this.c;
        if (lkq0Var != null) {
            lkq0Var.w = ymu.k(lkq0Var.w, sVar, null, 2);
            zkq0 zkq0Var = lkq0Var.b;
            long j = lkq0Var.a;
            zkq0Var.a = false;
            hkq0 hkq0Var = zkq0Var.e;
            if (hkq0Var != null) {
                hkq0Var.invoke(Long.valueOf(j));
            }
        }
    }

    @Override // defpackage.e530
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.v0y
    public final int l0(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        return this.w.l0(lookaheadCapablePlaceable, x910Var, i);
    }

    @Override // defpackage.v0y
    public final int v(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        return this.w.v(lookaheadCapablePlaceable, x910Var, i);
    }
}
