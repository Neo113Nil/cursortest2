package xsna;

import android.app.Activity;
import android.view.View;
import xsna.av20;
import xsna.f520;

/* compiled from: VideoBottomSheet.kt */
/* loaded from: classes2.dex */
public final class g6s0 implements av20.b<e520> {
    public final /* synthetic */ e6s0 a;

    public g6s0(e6s0 e6s0Var) {
        this.a = e6s0Var;
    }

    @Override // xsna.av20.b
    public final void a(View view, Object obj, int i, wmg wmgVar) {
        e520 e520Var = (e520) obj;
        boolean R0 = fxc0.B().J().R0();
        e6s0 e6s0Var = this.a;
        ume0 ume0Var = R0 ? new ume0(11, e6s0Var, view) : null;
        y6s0 y6s0Var = e6s0Var.e;
        s6s0 s6s0Var = e6s0Var.d;
        Activity activity = e6s0Var.c;
        e0a e0aVar = e6s0.i;
        if (e520Var.n != null) {
            h6s0 U = e0aVar.U(e520Var);
            if (U != null) {
                U.b(activity, s6s0Var, ume0Var);
            }
        } else {
            h6s0 U2 = e0aVar.U(e520Var);
            if (U2 != null) {
                U2.c(activity, s6s0Var, y6s0Var);
            }
        }
        h6s0 U3 = e0aVar.U(e520Var);
        if (U3 == null || U3.d(e520Var)) {
            e6s0Var.b(view);
        }
        f520 f520Var = e520Var.n;
        f520.a aVar = f520Var instanceof f520.a ? (f520.a) f520Var : null;
        wmgVar.invoke(Integer.valueOf(i), aVar != null ? aVar.a : null);
    }
}
