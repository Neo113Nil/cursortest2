package xsna;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public class hin0 extends androidx.fragment.app.d {
    public Dialog x;
    public DialogInterface.OnCancelListener y;

    @Nullable
    public AlertDialog z;

    @NonNull
    public static hin0 Dn(@NonNull Dialog dialog, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        hin0 hin0Var = new hin0();
        exc0.j(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        hin0Var.x = dialog;
        if (onCancelListener != null) {
            hin0Var.y = onCancelListener;
        }
        return hin0Var;
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.y;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.d
    @NonNull
    public final Dialog yn(@Nullable Bundle bundle) {
        Dialog dialog = this.x;
        if (dialog != null) {
            return dialog;
        }
        this.o = false;
        if (this.z == null) {
            Context mo2getContext = mo2getContext();
            exc0.i(mo2getContext);
            this.z = new AlertDialog.Builder(mo2getContext).create();
        }
        return this.z;
    }
}
