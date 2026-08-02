package xsna;

import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public final class z901 {
    public final mb01 a;

    public z901(qj01 qj01Var) {
        this.a = qj01Var.m;
    }

    @VisibleForTesting
    public final boolean a() {
        mb01 mb01Var = this.a;
        try {
            a890 a = xzx0.a(mb01Var.b);
            if (a != null) {
                return a.b("com.android.vending", 128).versionCode >= 80837300;
            }
            k901 k901Var = mb01Var.j;
            mb01.k(k901Var);
            k901Var.q.a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            k901 k901Var2 = mb01Var.j;
            mb01.k(k901Var2);
            k901Var2.q.b(e, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }
}
