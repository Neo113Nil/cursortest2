package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import xsna.b25;

/* compiled from: LaunchActionSynchronizerTask.kt */
/* loaded from: classes11.dex */
public final class nmy implements b25.a {
    public final /* synthetic */ w50 b;

    public nmy(w50 w50Var) {
        this.b = w50Var;
    }

    @Override // xsna.b25.a
    public final void d(tbu0 tbu0Var) {
        boolean b = tbu0Var.b();
        w50 w50Var = this.b;
        if (b) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.i, new Object[]{"Offline:LaunchActionSynchronizerTask", "Launch ActionSynchronizer because user is logged in."});
            }
            w50Var.a();
            return;
        }
        L l2 = L.a;
        l2.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l2, L.LogType.i, new Object[]{"Offline:LaunchActionSynchronizerTask", "Shutdown ActionSynchronizer because user is logged out."});
        }
        w50Var.shutdown();
        w50Var.b();
    }
}
