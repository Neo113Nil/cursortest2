package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.plus.badge.CashbackBadgeStyle;

/* loaded from: classes6.dex */
public final class ibx0 implements nbx0 {
    public final String a;
    public final CashbackBadgeStyle b;

    public ibx0(String str, CashbackBadgeStyle cashbackBadgeStyle) {
        this.a = str;
        this.b = cashbackBadgeStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibx0)) {
            return false;
        }
        ibx0 ibx0Var = (ibx0) obj;
        return this.a.equals(ibx0Var.a) && this.b == ibx0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CashbackPromotion(cashBack=" + this.a + ", cashBackStyle=" + this.b + Extension.C_BRAKE;
    }
}
