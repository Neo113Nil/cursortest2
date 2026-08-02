package yads;

import android.content.Context;
import io.appmetrica.analytics.AppMetrica;
import xsna.bpn0;
import xsna.s3q0;

/* loaded from: classes10.dex */
public abstract class du1 {
    public static final hx2 a = gx2.a();
    public static volatile bu1 b;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static bu1 a(Context context, qu2 qu2Var, gr3 gr3Var) {
        gh ghVar;
        tv3 tv3Var = tv3.a;
        bh bhVar = new bh();
        fh a2 = pg.a(context);
        String str = ub.a(context) ? "322a737a-a0ca-44e0-bc85-649b1c7c1db6" : "478cb909-6ad1-4e12-84cc-b3629a789f93";
        boolean z = false;
        if (a2.a.a()) {
            ghVar = new gh(new bpn0(new eh(gr3Var, context, a2, str)), a2.a);
            bpn0 bpn0Var = new bpn0(new cu1(context));
            if (qu2Var != null && qu2Var.h0) {
                z = true;
            }
            bu1 bu1Var = new bu1(ghVar, bpn0Var, z, oh1.a().a());
            ru2 ru2Var = new ru2(context, bhVar);
            av2 a3 = zu2.a();
            synchronized (av2.b) {
                try {
                    if (!a3.a.containsKey(ru2Var)) {
                        a3.a.put(ru2Var, null);
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bu1Var;
        }
        AppMetrica.setDataSendingEnabled(false);
        ghVar = null;
        bpn0 bpn0Var2 = new bpn0(new cu1(context));
        if (qu2Var != null) {
            z = true;
        }
        bu1 bu1Var2 = new bu1(ghVar, bpn0Var2, z, oh1.a().a());
        ru2 ru2Var2 = new ru2(context, bhVar);
        av2 a32 = zu2.a();
        synchronized (av2.b) {
        }
    }
}
