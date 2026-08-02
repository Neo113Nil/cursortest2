package xsna;

import android.view.ViewGroup;

/* compiled from: CommunityChecklistItem.kt */
/* loaded from: classes5.dex */
public final class axg extends we6 {
    public final bxg g;
    public final g5 h;
    public final i70 i;

    /* compiled from: CommunityChecklistItem.kt */
    public static final class a extends vif0<axg> {
        @Override // xsna.vif0
        public final void i6(axg axgVar) {
            dxg dxgVar;
            axg axgVar2 = axgVar;
            cxg cxgVar = (cxg) this.itemView;
            if (axgVar2 != null) {
                bxg bxgVar = axgVar2.g;
                bxgVar.getClass();
                dxgVar = new dxg(bxgVar.b, bxgVar.c, bxgVar.d, bxgVar.e, axgVar2.h, axgVar2.i);
            } else {
                dxgVar = null;
            }
            cxgVar.d(dxgVar);
        }
    }

    public axg(bxg bxgVar, g5 g5Var, i70 i70Var) {
        this.g = bxgVar;
        this.h = g5Var;
        this.i = i70Var;
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        return new a(new cxg(viewGroup.getContext()));
    }

    @Override // xsna.we6
    public final int h() {
        return -218;
    }
}
