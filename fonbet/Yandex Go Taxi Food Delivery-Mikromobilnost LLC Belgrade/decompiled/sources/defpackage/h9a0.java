package defpackage;

import java.util.Calendar;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class h9a0 {
    public final boolean a;
    public final Calendar b;
    public final wjd0 c;
    public final boolean d;
    public final String e;
    public final lv90 f;

    public h9a0(boolean z, Calendar calendar, wjd0 wjd0Var, boolean z2, String str, lv90 lv90Var, int i) {
        z = (i & 1) != 0 ? false : z;
        calendar = (i & 2) != 0 ? null : calendar;
        wjd0Var = (i & 4) != 0 ? null : wjd0Var;
        z2 = (i & 8) != 0 ? false : z2;
        str = (i & 16) != 0 ? null : str;
        lv90Var = (i & 32) != 0 ? null : lv90Var;
        this.a = z;
        this.b = calendar;
        this.c = wjd0Var;
        this.d = z2;
        this.e = str;
        this.f = lv90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9a0)) {
            return false;
        }
        h9a0 h9a0Var = (h9a0) obj;
        return this.a == h9a0Var.a && jl40.l(this.b, h9a0Var.b) && jl40.l(this.c, h9a0Var.c) && this.d == h9a0Var.d && jl40.l(this.e, h9a0Var.e) && jl40.l(this.f, h9a0Var.f);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        Calendar calendar = this.b;
        int hashCode2 = (hashCode + (calendar == null ? 0 : calendar.hashCode())) * 31;
        wjd0 wjd0Var = this.c;
        int e = unr0.e((hashCode2 + (wjd0Var == null ? 0 : wjd0Var.hashCode())) * 31, 31, this.d);
        String str = this.e;
        int hashCode3 = (e + (str == null ? 0 : str.hashCode())) * 31;
        lv90 lv90Var = this.f;
        return hashCode3 + (lv90Var != null ? lv90Var.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentMethodsAttachment(justAddedNewCard=" + this.a + ", whenRetry=" + this.b + ", plusRemoveCardsNotification=" + this.c + ", mainMenuPaymentMethodsSelectorExperimentEnabled=" + this.d + ", service=" + this.e + ", deferredSelectPayment=" + this.f + Extension.C_BRAKE;
    }

    public h9a0() {
        this(false, null, null, false, null, null, 63);
    }
}
