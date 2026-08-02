package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.plus.badge.CashbackBadgeStyle;

/* loaded from: classes6.dex */
public final class ek60 implements hk60 {
    public final kdc a;
    public final CharSequence b;
    public final String c;
    public final CashbackBadgeStyle d;
    public final wp2 e;

    public ek60(kdc kdcVar, CharSequence charSequence, String str, CashbackBadgeStyle cashbackBadgeStyle, wp2 wp2Var) {
        this.a = kdcVar;
        this.b = charSequence;
        this.c = str;
        this.d = cashbackBadgeStyle;
        this.e = wp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek60)) {
            return false;
        }
        ek60 ek60Var = (ek60) obj;
        return jl40.l(this.a, ek60Var.a) && jl40.l(this.b, ek60Var.b) && this.c.equals(ek60Var.c) && this.d == ek60Var.d && jl40.l(this.e, ek60Var.e);
    }

    public final int hashCode() {
        kdc kdcVar = this.a;
        return this.e.hashCode() + ((this.d.hashCode() + unr0.b(smw0.b((kdcVar == null ? 0 : kdcVar.hashCode()) * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        return "NavigationWithCashback(navColor=" + this.a + ", text=" + ((Object) this.b) + ", cashBack=" + this.c + ", cashBackStyle=" + this.d + ", navAppColor=" + this.e + Extension.C_BRAKE;
    }
}
