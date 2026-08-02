package defpackage;

import android.view.View;
import yads.lv1;

/* loaded from: classes7.dex */
public final class dx71 extends ia71 {
    @Override // defpackage.ia71
    public final void b(uy71 uy71Var, pj71 pj71Var, Object obj) {
        lv1 lv1Var = (lv1) d();
        if (lv1Var == null) {
            return;
        }
        pj71Var.m(lv1Var, uy71Var);
        pj71Var.o(uy71Var, new sl81(lv1Var));
    }

    @Override // defpackage.ia71
    public final /* bridge */ /* synthetic */ boolean c(View view, Object obj) {
        return true;
    }

    @Override // defpackage.ia71
    public final void e(View view, Object obj) {
        lv1 lv1Var = (lv1) view;
        lg71 lg71Var = (lg71) obj;
        li61 li61Var = lg71Var.a;
        lv1Var.setAspectRatio(lg71Var.b);
        if (li61Var instanceof kv81) {
            lv1Var.a(((kv81) li61Var).a, null);
            return;
        }
        if (li61Var instanceof y191) {
            String str = ((y191) li61Var).a;
            if (lv1Var.l instanceof wd71) {
                lv1Var.l = new ua71(null);
                c081 c081Var = lv1Var.m;
                lv1 lv1Var2 = c081Var.a;
                dv81 dv81Var = c081Var.c;
                nn61 nn61Var = c081Var.b;
                tj61 tj61Var = new mh71(lv1Var2, c081Var, dv81Var, nn61Var, nn61Var, nn61Var).c;
                lv1Var2.setHtmlWebViewListener(new u171(tj61Var));
                ne71.a(tj61Var.a.getContext(), tj61Var.g, new sj61(tj61Var, str, 0));
            }
        }
    }
}
