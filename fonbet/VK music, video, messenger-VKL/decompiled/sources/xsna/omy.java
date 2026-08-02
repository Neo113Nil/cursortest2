package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;

/* compiled from: LaunchActionSynchronizerTask.kt */
/* loaded from: classes11.dex */
public final class omy implements gzs<s3q0> {
    public final cu2 b;

    public omy(cu2 cu2Var) {
        this.b = cu2Var;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        w50 w50Var = (w50) this.b.invoke();
        if (o25.a().b()) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.i, new Object[]{"Offline:LaunchActionSynchronizerTask", "Launch ActionSynchronizer."});
            }
            w50Var.a();
        } else {
            L l2 = L.a;
            l2.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l2, L.LogType.i, new Object[]{"Offline:LaunchActionSynchronizerTask", "Shutdown ActionSynchronizer because user is logged out."});
            }
            w50Var.shutdown();
            w50Var.b();
        }
        o25.a().b0(new nmy(w50Var));
        return s3q0.a;
    }
}
