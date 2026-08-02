package yads;

import android.view.View;

/* loaded from: classes10.dex */
public final class kx1 extends ll3 {
    public kx1(ix1 ix1Var) {
        super(ix1Var);
    }

    @Override // yads.ll3
    public final void a(oi oiVar, ol3 ol3Var, Object obj) {
        ix1 ix1Var = (ix1) b();
        if (ix1Var == null) {
            return;
        }
        ol3Var.a(ix1Var, oiVar);
        ol3Var.a(oiVar, new tw1(ix1Var));
    }

    @Override // yads.ll3
    public final void b(View view, Object obj) {
        ix1 ix1Var = (ix1) view;
        pk1 pk1Var = (pk1) obj;
        String str = pk1Var.a;
        if (str != null && str.length() > 0) {
            ix1Var.setAspectRatio(pk1Var.b);
            ix1Var.a(str, (hx1) null);
        }
    }

    @Override // yads.ll3
    public final /* bridge */ /* synthetic */ boolean a(View view, Object obj) {
        return true;
    }
}
