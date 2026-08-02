package defpackage;

import com.ybsdk.feature.savings.internal.screens.dashboard.v4.SavingsDashboardStateV4$Status;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class fbm0 {
    public final SavingsDashboardStateV4$Status a;
    public final boolean b;
    public final boolean c;
    public final lam0 d;
    public final Throwable e;

    public fbm0(SavingsDashboardStateV4$Status savingsDashboardStateV4$Status, boolean z, boolean z2, lam0 lam0Var, Throwable th) {
        this.a = savingsDashboardStateV4$Status;
        this.b = z;
        this.c = z2;
        this.d = lam0Var;
        this.e = th;
    }

    public static fbm0 a(fbm0 fbm0Var, SavingsDashboardStateV4$Status savingsDashboardStateV4$Status, lam0 lam0Var, Throwable th, int i) {
        if ((i & 1) != 0) {
            savingsDashboardStateV4$Status = fbm0Var.a;
        }
        SavingsDashboardStateV4$Status savingsDashboardStateV4$Status2 = savingsDashboardStateV4$Status;
        boolean z = (i & 2) != 0 ? fbm0Var.b : false;
        boolean z2 = (i & 4) != 0 ? fbm0Var.c : false;
        if ((i & 8) != 0) {
            lam0Var = fbm0Var.d;
        }
        lam0 lam0Var2 = lam0Var;
        if ((i & 16) != 0) {
            th = fbm0Var.e;
        }
        fbm0Var.getClass();
        return new fbm0(savingsDashboardStateV4$Status2, z, z2, lam0Var2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbm0)) {
            return false;
        }
        fbm0 fbm0Var = (fbm0) obj;
        return this.a == fbm0Var.a && this.b == fbm0Var.b && this.c == fbm0Var.c && jl40.l(this.d, fbm0Var.d) && jl40.l(this.e, fbm0Var.e);
    }

    public final int hashCode() {
        int e = unr0.e(unr0.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        lam0 lam0Var = this.d;
        int hashCode = (e + (lam0Var == null ? 0 : lam0Var.hashCode())) * 31;
        Throwable th = this.e;
        return hashCode + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "SavingsDashboardStateV4(status=" + this.a + ", canShowEducationV2=" + this.b + ", canShowBalanceAnimation=" + this.c + ", data=" + this.d + ", throwable=" + this.e + Extension.C_BRAKE;
    }
}
