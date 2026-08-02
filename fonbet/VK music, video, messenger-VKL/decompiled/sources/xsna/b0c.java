package xsna;

import android.app.Dialog;
import android.content.DialogInterface;
import com.vk.auth.ui.checkaccess.CheckAccessBottomSheetFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class b0c implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b0c(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.b) {
            case 0:
                CheckAccessBottomSheetFragment checkAccessBottomSheetFragment = (CheckAccessBottomSheetFragment) this.c;
                checkAccessBottomSheetFragment.D = false;
                Dialog dialog = checkAccessBottomSheetFragment.s;
                if (dialog != null) {
                    dialog.dismiss();
                    break;
                }
                break;
            default:
                ((gzs) this.c).invoke();
                break;
        }
    }
}
