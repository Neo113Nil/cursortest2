package xsna;

import android.content.DialogInterface;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class dxa implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;

    public /* synthetic */ dxa(int i) {
        this.b = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                dialogInterface.dismiss();
                break;
            default:
                String[] strArr = DebugDevSettingsFragment.t0;
                dialogInterface.dismiss();
                break;
        }
    }
}
