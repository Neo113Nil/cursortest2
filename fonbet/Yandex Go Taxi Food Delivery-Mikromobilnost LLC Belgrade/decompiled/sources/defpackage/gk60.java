package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.plus.badge.CashbackBadgeStyle;

/* loaded from: classes6.dex */
public final class gk60 implements hk60 {
    public final CharSequence a;
    public final String b;
    public final CashbackBadgeStyle c;

    public gk60(CharSequence charSequence, String str, CashbackBadgeStyle cashbackBadgeStyle) {
        this.a = charSequence;
        this.b = str;
        this.c = cashbackBadgeStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gk60)) {
            return false;
        }
        gk60 gk60Var = (gk60) obj;
        return jl40.l(this.a, gk60Var.a) && this.b.equals(gk60Var.b) && this.c == gk60Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "TextWithCashback(text=" + ((Object) this.a) + ", cashBack=" + this.b + ", cashBackStyle=" + this.c + Extension.C_BRAKE;
    }
}
