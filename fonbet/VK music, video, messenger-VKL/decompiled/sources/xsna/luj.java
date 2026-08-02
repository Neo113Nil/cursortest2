package xsna;

import android.view.KeyEvent;
import androidx.compose.foundation.text.HandleState;

/* compiled from: CoreTextField.kt */
/* loaded from: classes11.dex */
public final class luj implements izs<hdy, Boolean> {
    public final /* synthetic */ j1z b;
    public final /* synthetic */ gho0 c;

    public luj(j1z j1zVar, gho0 gho0Var) {
        this.b = j1zVar;
        this.c = gho0Var;
    }

    @Override // xsna.izs
    public final Boolean invoke(hdy hdyVar) {
        boolean z;
        KeyEvent keyEvent = hdyVar.a;
        if (this.b.a() == HandleState.Selection && keyEvent.getKeyCode() == 4) {
            z = true;
            if (zq70.w(keyEvent) == 1) {
                this.c.i(null);
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
