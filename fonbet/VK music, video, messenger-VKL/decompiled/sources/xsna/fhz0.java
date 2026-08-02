package xsna;

import android.content.ComponentName;
import xsna.ehz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class fhz0 extends nok {
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ ehz0 c;

    public fhz0(ehz0 ehz0Var, Runnable runnable) {
        this.c = ehz0Var;
        this.b = runnable;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.nok
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCustomTabsServiceConnected(ComponentName componentName, lok lokVar) {
        ook ookVar;
        Runnable runnable;
        ehz0 ehz0Var = this.c;
        ehz0.b bVar = ehz0Var.e;
        smv smvVar = lokVar.a;
        kok kokVar = new kok(bVar);
        if (smvVar.O(kokVar)) {
            ookVar = new ook(smvVar, kokVar, lokVar.b);
            ehz0Var.d = ookVar;
            runnable = this.b;
            if (runnable == null) {
                runnable.run();
                return;
            }
            return;
        }
        ookVar = null;
        ehz0Var.d = ookVar;
        runnable = this.b;
        if (runnable == null) {
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
