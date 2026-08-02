package defpackage;

import android.R;
import flex.engine.section.c;

/* loaded from: classes2.dex */
public final class m6q0 implements lfe {
    public final cf21 a;
    public final pvy0 b;

    public m6q0(cf21 cf21Var, pvy0 pvy0Var) {
        this.a = cf21Var;
        this.b = pvy0Var;
    }

    @Override // defpackage.lfe
    public final void dispose(l1o l1oVar, see seeVar) {
    }

    @Override // defpackage.lfe
    public final gfe get(l1o l1oVar, see seeVar) {
        c990 c990Var = new c990();
        izp0 izp0Var = new izp0(false, false, true, false);
        n530 n530Var = l1oVar.a;
        txl txlVar = l1oVar.b;
        i0q0 i0q0Var = new i0q0();
        y0x y0xVar = new y0x(l1oVar, this.a);
        pvy0 pvy0Var = this.b;
        return new c(izp0Var, n530Var, txlVar, i0q0Var, y0xVar, null, null, new yke(), new r7o(), c990Var, null, null, pvy0Var, new exy0(pvy0Var, R.color.white), l1oVar.e, null, 215040);
    }
}
