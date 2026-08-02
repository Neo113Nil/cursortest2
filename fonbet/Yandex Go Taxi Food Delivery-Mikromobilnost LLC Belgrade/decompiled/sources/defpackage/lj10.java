package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class lj10 {
    public static final lj10 g = new lj10(true, true, true, true, true, false);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public /* synthetic */ lj10(int i) {
        this((i & 1) == 0, false, (i & 4) == 0, (i & 8) == 0, false, (i & 32) == 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj10)) {
            return false;
        }
        lj10 lj10Var = (lj10) obj;
        return this.a == lj10Var.a && this.b == lj10Var.b && this.c == lj10Var.c && this.d == lj10Var.d && this.e == lj10Var.e && this.f == lj10Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + unr0.e(unr0.e(unr0.e(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder u = qv10.u("MenuBadgeConfig(enableSupport=", ", enableCards=", ", enableCreateSharedPaymentNotification=", this.a, this.b);
        nnm.v(", enableSharedPaymentProtectionNotification=", ", enableAccountUpgrade=", u, this.c, this.d);
        return smw0.k(", showWithoutCount=", Extension.C_BRAKE, u, this.e, this.f);
    }

    public lj10() {
        this(63);
    }

    public lj10(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
    }
}
