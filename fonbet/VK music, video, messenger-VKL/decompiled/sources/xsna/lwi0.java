package xsna;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.vk.voip.ui.sessionrooms.dialog.SessionRoomsDialog;

/* compiled from: SessionRoomsDialogImpl.kt */
/* loaded from: classes7.dex */
public abstract class lwi0 extends dw20 implements SessionRoomsDialog {
    public abstract View Yn();

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            tn();
        }
    }

    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public Dialog yn(Bundle bundle) {
        dw20.Rn(this, Yn(), 6);
        return super.yn(bundle);
    }
}
