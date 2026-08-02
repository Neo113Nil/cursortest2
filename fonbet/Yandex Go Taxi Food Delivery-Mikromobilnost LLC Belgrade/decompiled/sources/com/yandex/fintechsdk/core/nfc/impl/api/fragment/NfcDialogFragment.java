package com.yandex.fintechsdk.core.nfc.impl.api.fragment;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
import com.yandex.fintechsdk.core.nfc.impl.api.fragment.NfcDialogFragment;
import defpackage.brg0;
import defpackage.hua1;
import defpackage.i860;
import defpackage.vxh0;
import defpackage.wwg;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0003¨\u0006\r"}, d2 = {"Lcom/yandex/fintechsdk/core/nfc/impl/api/fragment/NfcDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Lzy11;", "onStart", "Companion", "i860", "impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NfcDialogFragment extends DialogFragment {
    public static final i860 Companion = new i860();
    public static final String REQUEST_KEY = "NfcAlertDialog";
    public static final String RESULT_KEY = "NfcAlertDialogResult";
    public static final String RESULT_NEGATIVE = "NfcAlertDialogResultNegative";
    public static final String RESULT_POSITIVE = "NfcAlertDialogResultPositive";
    public static final String TAG = "NfcDialogFragmentTag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateDialog$lambda$0(NfcDialogFragment nfcDialogFragment, DialogInterface dialogInterface, int i) {
        hua1.f(wwg.g(new Pair(RESULT_KEY, RESULT_POSITIVE)), nfcDialogFragment, REQUEST_KEY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateDialog$lambda$1(NfcDialogFragment nfcDialogFragment, DialogInterface dialogInterface, int i) {
        hua1.f(wwg.g(new Pair(RESULT_KEY, RESULT_NEGATIVE)), nfcDialogFragment, REQUEST_KEY);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final int i = 0;
        final int i2 = 1;
        return new AlertDialog.a(requireContext()).setTitle(getString(vxh0.finsdk_enable_nfc)).d(getString(vxh0.finsdk_nfc_module_enabled_is_required)).h(getString(vxh0.finsdk_yes), new DialogInterface.OnClickListener(this) { // from class: g860
            public final /* synthetic */ NfcDialogFragment b;

            {
                this.b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                int i4 = i;
                NfcDialogFragment nfcDialogFragment = this.b;
                switch (i4) {
                    case 0:
                        NfcDialogFragment.onCreateDialog$lambda$0(nfcDialogFragment, dialogInterface, i3);
                        break;
                    default:
                        NfcDialogFragment.onCreateDialog$lambda$1(nfcDialogFragment, dialogInterface, i3);
                        break;
                }
            }
        }).e(getString(vxh0.finsdk_no), new DialogInterface.OnClickListener(this) { // from class: g860
            public final /* synthetic */ NfcDialogFragment b;

            {
                this.b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                int i4 = i2;
                NfcDialogFragment nfcDialogFragment = this.b;
                switch (i4) {
                    case 0:
                        NfcDialogFragment.onCreateDialog$lambda$0(nfcDialogFragment, dialogInterface, i3);
                        break;
                    default:
                        NfcDialogFragment.onCreateDialog$lambda$1(nfcDialogFragment, dialogInterface, i3);
                        break;
                }
            }
        }).create();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        AlertDialog alertDialog = dialog instanceof AlertDialog ? (AlertDialog) dialog : null;
        if (alertDialog != null) {
            Button button = alertDialog.getButton(-1);
            if (button != null) {
                button.setTextColor(requireContext().getColor(brg0.finsdk_alert_button_text));
            }
            Button button2 = alertDialog.getButton(-2);
            if (button2 != null) {
                button2.setTextColor(requireContext().getColor(brg0.finsdk_alert_button_text));
            }
        }
    }
}
