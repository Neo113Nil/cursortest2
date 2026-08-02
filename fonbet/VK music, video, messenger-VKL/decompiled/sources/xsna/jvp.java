package xsna;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public class jvp extends DialogFragment {
    public Dialog b;
    public DialogInterface.OnCancelListener c;

    @Nullable
    public AlertDialog d;

    @NonNull
    public static jvp a(@NonNull Dialog dialog, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        jvp jvpVar = new jvp();
        exc0.j(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        jvpVar.b = dialog;
        if (onCancelListener != null) {
            jvpVar.c = onCancelListener;
        }
        return jvpVar;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.c;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    @NonNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog dialog = this.b;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.d == null) {
            Activity activity = getActivity();
            exc0.i(activity);
            this.d = new AlertDialog.Builder(activity).create();
        }
        return this.d;
    }
}
