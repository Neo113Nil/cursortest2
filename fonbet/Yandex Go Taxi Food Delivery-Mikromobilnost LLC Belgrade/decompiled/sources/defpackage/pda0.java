package defpackage;

import android.app.Activity;
import ru.yandex.taxi.widget.dialog.AlertDialog;

/* loaded from: classes13.dex */
public final class pda0 extends h55 {
    public final Activity D;
    public AlertDialog E;

    public pda0(Activity activity) {
        super(null);
        this.D = activity;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        oda0 oda0Var = (oda0) obj;
        if (oda0Var instanceof jda0) {
            if (jx81.D(((jda0) oda0Var).a)) {
                P(kyh0.network_error);
                return;
            } else {
                P(kyh0.change_payment_error);
                return;
            }
        }
        if (oda0Var instanceof lda0) {
            if (jx81.D(((lda0) oda0Var).a)) {
                P(kyh0.network_error);
                return;
            } else {
                P(kyh0.common_unknown_error);
                return;
            }
        }
        if (oda0Var instanceof mda0) {
            CharSequence charSequence = ((mda0) oda0Var).a;
            AlertDialog alertDialog = new AlertDialog(this.D);
            alertDialog.setMessage(charSequence);
            this.E = alertDialog.setPositiveButton(kyh0.common_ok, (Runnable) null).setDismissListener(new ii30(12, this)).show();
            return;
        }
        if (jl40.l(oda0Var, kda0.a)) {
            P(kyh0.google_pay_payment_temporary_unavailable);
        } else if (jl40.l(oda0Var, nda0.a)) {
            P(kyh0.payment_method_changed_multiple_orders);
        } else {
            w511.b();
        }
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        AlertDialog alertDialog = this.E;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this.E = null;
    }

    public final void P(int i) {
        AlertDialog alertDialog = new AlertDialog(this.D);
        alertDialog.setMessage(i);
        this.E = alertDialog.setPositiveButton(kyh0.common_ok, (Runnable) null).setDismissListener(new ii30(12, this)).show();
    }
}
