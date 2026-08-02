package defpackage;

import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.n;

/* loaded from: classes.dex */
public final class g6a1 {
    public final g a;

    public g6a1(n nVar) {
        this.a = nVar.E;
    }

    public final boolean a() {
        g gVar = this.a;
        try {
            tbz a = nb51.a(gVar.a);
            if (a != null) {
                return a.c(128, "com.android.vending").versionCode >= 80837300;
            }
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.H.a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            y1a1 y1a1Var2 = gVar.y;
            g.g(y1a1Var2);
            y1a1Var2.H.b(e, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }
}
