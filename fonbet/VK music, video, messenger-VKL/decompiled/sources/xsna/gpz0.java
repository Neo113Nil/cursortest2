package xsna;

import android.app.AlertDialog;
import android.app.Dialog;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class gpz0 extends de {
    public final /* synthetic */ Dialog b;
    public final /* synthetic */ jpz0 c;

    public gpz0(jpz0 jpz0Var, AlertDialog alertDialog) {
        this.b = alertDialog;
        this.c = jpz0Var;
    }

    @Override // xsna.de
    public final void p0() {
        mpz0 mpz0Var = this.c.c;
        mpz0Var.c.set(null);
        mpz0Var.c();
        Dialog dialog = this.b;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
    }
}
