package xsna;

import android.view.KeyEvent;

/* compiled from: BasicTooltip.kt */
/* loaded from: classes11.dex */
public final class qu6 implements izs<hdy, Boolean> {
    public final /* synthetic */ h6p0 b;
    public final /* synthetic */ wh50<Boolean> c;

    public qu6(h6p0 h6p0Var, wh50 wh50Var) {
        this.b = h6p0Var;
        this.c = wh50Var;
    }

    @Override // xsna.izs
    public final Boolean invoke(hdy hdyVar) {
        KeyEvent keyEvent = hdyVar.a;
        if (!this.b.isVisible()) {
            this.c.setValue(Boolean.FALSE);
        }
        return Boolean.FALSE;
    }
}
