package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.Calendar;
import ru.yandex.taxi.widget.dialog.AlertDialog;

/* loaded from: classes8.dex */
public final class fm10 extends h55 {
    public final Context D;
    public final zuj0 E;
    public final nf7 F;
    public final ney G;
    public final n20 H;
    public final q2p I;
    public AlertDialog J;
    public final pc5 K;

    public fm10(Context context, zuj0 zuj0Var, nf7 nf7Var, ney neyVar, n20 n20Var, q2p q2pVar) {
        super(null);
        this.D = context;
        this.E = zuj0Var;
        this.F = nf7Var;
        this.G = neyVar;
        this.H = n20Var;
        this.I = q2pVar;
        this.K = new pc5(2, this);
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        h9a0 h9a0Var = (h9a0) obj;
        A((m950) this.I.get(), h9a0Var, new em10(this, 0));
        ney neyVar = this.G;
        pc5 pc5Var = this.K;
        neyVar.b(pc5Var, pc5Var);
        Calendar calendar = h9a0Var.b;
        if (calendar == null) {
            return;
        }
        AlertDialog alertDialog = this.J;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        Context context = this.D;
        this.J = new AlertDialog((Activity) context).setTitle(((avj0) this.E).i(kyh0.verify_payment_random_amt_retry_title, t7s.f(context, this.F, calendar))).setMessage(kyh0.verify_payment_random_amt_retry_desc).setPositiveButton(kyh0.common_close).show();
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        this.G.d(this.K);
        j(dpb.a);
        AlertDialog alertDialog = this.J;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this.J = null;
    }
}
