package defpackage;

import androidx.appcompat.app.AlertDialog;
import com.ybsdk.feature.transfer.internal.screens.targets.presentation.TransferTargetsFragment;

/* loaded from: classes2.dex */
public abstract class coc {
    public static void a(TransferTargetsFragment transferTargetsFragment, String str, zr01 zr01Var) {
        bgc bgcVar = new bgc(12);
        AlertDialog.a aVar = new AlertDialog.a(transferTargetsFragment.requireContext());
        if (str == null) {
            aVar.i(dzh0.ybsdk_transfer_default_error);
        } else {
            aVar.setTitle(str);
        }
        transferTargetsFragment.showAlertDialog(aVar.setPositiveButton(dzh0.ybsdk_transfer_button_try_again, new p97(3, zr01Var)).setNegativeButton(dzh0.ybsdk_transfer_button_cancel, new p97(4, bgcVar)));
    }
}
