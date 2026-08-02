package xsna;

import android.view.InputDevice;
import android.view.KeyEvent;

/* compiled from: TextFieldFocusModifier.android.kt */
/* loaded from: classes11.dex */
public final class tfo0 implements izs<hdy, Boolean> {
    public final /* synthetic */ vvr b;
    public final /* synthetic */ j1z c;

    public tfo0(vvr vvrVar, j1z j1zVar) {
        this.b = vvrVar;
        this.c = j1zVar;
    }

    @Override // xsna.izs
    public final Boolean invoke(hdy hdyVar) {
        KeyEvent keyEvent = hdyVar.a;
        InputDevice device = keyEvent.getDevice();
        boolean z = false;
        if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEvent.getSource() == 33554433) && zq70.w(keyEvent) == 2 && keyEvent.getSource() != 257)) {
            boolean j = ne7.j(19, keyEvent);
            vvr vvrVar = this.b;
            if (j) {
                z = vvrVar.h(5);
            } else if (ne7.j(20, keyEvent)) {
                z = vvrVar.h(6);
            } else if (ne7.j(21, keyEvent)) {
                z = vvrVar.h(3);
            } else if (ne7.j(22, keyEvent)) {
                z = vvrVar.h(4);
            } else if (ne7.j(23, keyEvent)) {
                nek0 nek0Var = this.c.c;
                if (nek0Var != null) {
                    nek0Var.show();
                }
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
