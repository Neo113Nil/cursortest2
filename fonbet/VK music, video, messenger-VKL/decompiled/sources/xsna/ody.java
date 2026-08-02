package xsna;

import android.view.KeyEvent;
import xsna.q630;

/* compiled from: KeyInputModifier.kt */
/* loaded from: classes11.dex */
public final class ody extends q630.c implements ndy {
    public izs<? super hdy, Boolean> p;
    public izs<? super hdy, Boolean> q;

    public ody() {
        throw null;
    }

    @Override // xsna.ndy
    public final boolean J1(KeyEvent keyEvent) {
        izs<? super hdy, Boolean> izsVar = this.p;
        if (izsVar != null) {
            return izsVar.invoke(new hdy(keyEvent)).booleanValue();
        }
        return false;
    }

    @Override // xsna.ndy
    public final boolean T(KeyEvent keyEvent) {
        izs<? super hdy, Boolean> izsVar = this.q;
        if (izsVar != null) {
            return izsVar.invoke(new hdy(keyEvent)).booleanValue();
        }
        return false;
    }
}
