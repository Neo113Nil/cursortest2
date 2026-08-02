package xsna;

import androidx.compose.foundation.text.KeyCommand;

/* compiled from: SelectionManager.kt */
/* loaded from: classes11.dex */
public final class ydi0 implements izs<hdy, Boolean> {
    public final /* synthetic */ bei0 b;

    public ydi0(bei0 bei0Var) {
        this.b = bei0Var;
    }

    @Override // xsna.izs
    public final Boolean invoke(hdy hdyVar) {
        boolean z;
        if (rdy.a.a(hdyVar.a) == KeyCommand.COPY) {
            this.b.b();
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
