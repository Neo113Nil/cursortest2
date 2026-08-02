package xsna;

import android.app.AlertDialog;
import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class n301 implements DialogInterface.OnClickListener {
    public final /* synthetic */ fip0 b;

    public n301(fip0 fip0Var) {
        this.b = fip0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        fip0 fip0Var = this.b;
        AlertDialog alertDialog = fip0Var.B;
        if (alertDialog != null) {
            alertDialog.cancel();
            fip0Var.B = null;
        }
    }
}
