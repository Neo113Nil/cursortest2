package defpackage;

import android.content.Context;
import ru.yandex.taxi.order.modals.impl.presentation.TaxiOrderPopupView;

/* loaded from: classes6.dex */
public final class j4y0 {
    public final w030 a;
    public final zxs0 b;

    public j4y0(w030 w030Var, zxs0 zxs0Var) {
        this.a = w030Var;
        this.b = zxs0Var;
    }

    public static void a(j4y0 j4y0Var, z3y0 z3y0Var, c4y0 c4y0Var, int i) {
        if ((i & 2) != 0) {
            c4y0Var = b4y0.a;
        }
        boolean z = (i & 4) == 0;
        zxs0 zxs0Var = j4y0Var.b;
        zxs0Var.getClass();
        z3y0Var.getClass();
        c4y0Var.getClass();
        Context context = (Context) zxs0Var.a;
        q5z.h(context);
        tt2 tt2Var = (tt2) zxs0Var.b;
        q5z.h(tt2Var);
        TaxiOrderPopupView taxiOrderPopupView = new TaxiOrderPopupView(context, new i4y0(new hhs0(26, z3y0Var, tt2Var), c4y0Var));
        if (z) {
            taxiOrderPopupView.addCloseButton();
        }
        j4y0Var.a.s(taxiOrderPopupView, true);
    }
}
