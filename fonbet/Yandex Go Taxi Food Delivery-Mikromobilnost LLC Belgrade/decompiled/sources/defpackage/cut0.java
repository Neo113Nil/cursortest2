package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class cut0 {
    public final s2e0 a;
    public final Throwable b;
    public final a9u0 c;
    public final a9u0 d;
    public final boolean e;
    public final List f;

    public cut0(s2e0 s2e0Var, Throwable th, a9u0 a9u0Var, a9u0 a9u0Var2, boolean z, List list) {
        this.a = s2e0Var;
        this.b = th;
        this.c = a9u0Var;
        this.d = a9u0Var2;
        this.e = z;
        this.f = list;
    }

    public static cut0 a(cut0 cut0Var, s2e0 s2e0Var, Throwable th, int i) {
        if ((i & 1) != 0) {
            s2e0Var = cut0Var.a;
        }
        s2e0 s2e0Var2 = s2e0Var;
        if ((i & 2) != 0) {
            th = cut0Var.b;
        }
        Throwable th2 = th;
        a9u0 a9u0Var = cut0Var.c;
        a9u0 a9u0Var2 = cut0Var.d;
        boolean z = (i & 16) != 0 ? cut0Var.e : false;
        List list = cut0Var.f;
        cut0Var.getClass();
        return new cut0(s2e0Var2, th2, a9u0Var, a9u0Var2, z, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cut0)) {
            return false;
        }
        cut0 cut0Var = (cut0) obj;
        return jl40.l(this.a, cut0Var.a) && jl40.l(this.b, cut0Var.b) && jl40.l(this.c, cut0Var.c) && jl40.l(this.d, cut0Var.d) && this.e == cut0Var.e && this.f.equals(cut0Var.f);
    }

    public final int hashCode() {
        s2e0 s2e0Var = this.a;
        int hashCode = (s2e0Var == null ? 0 : s2e0Var.hashCode()) * 31;
        Throwable th = this.b;
        int hashCode2 = (hashCode + (th == null ? 0 : th.hashCode())) * 31;
        a9u0 a9u0Var = this.c;
        int hashCode3 = (hashCode2 + (a9u0Var == null ? 0 : a9u0Var.hashCode())) * 31;
        a9u0 a9u0Var2 = this.d;
        return this.f.hashCode() + unr0.e((hashCode3 + (a9u0Var2 != null ? a9u0Var2.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        return "SplitDepositPaymentStatusState(paymentStatusPollingState=" + this.a + ", challengeWebViewError=" + this.b + ", paymentPendingScreenData=" + this.c + ", paymentTimeoutScreenData=" + this.d + ", shouldAnimateStatusIcon=" + this.e + ", localVariables=" + this.f + Extension.C_BRAKE;
    }
}
