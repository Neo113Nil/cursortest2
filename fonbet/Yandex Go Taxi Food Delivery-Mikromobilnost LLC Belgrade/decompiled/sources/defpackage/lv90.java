package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@gsq0
/* loaded from: classes9.dex */
public final class lv90 {
    public static final kv90 Companion = new kv90();
    public static final i3y[] e = {a.b(LazyThreadSafetyMode.PUBLICATION, new ks90(8)), null, null, null};
    public static final lv90 f = new lv90(PaymentMethod$Type.CASH, null, null, null);
    public static final lv90 g = new lv90(null, "unknown_payment_method", null, null);
    public final PaymentMethod$Type a;
    public final String b;
    public final String c;
    public final Boolean d;

    public /* synthetic */ lv90(int i, PaymentMethod$Type paymentMethod$Type, String str, String str2, Boolean bool) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = paymentMethod$Type;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
    }

    public final e4a0 a() {
        PaymentMethod$Type paymentMethod$Type = this.a;
        return paymentMethod$Type != null ? paymentMethod$Type : e4a0.R3;
    }

    public final String b() {
        PaymentMethod$Type paymentMethod$Type = this.a;
        if (paymentMethod$Type != null) {
            return paymentMethod$Type.getCode();
        }
        return null;
    }

    public final boolean c() {
        return (this.b == null && this.a == null) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !lv90.class.equals(obj.getClass())) {
            return false;
        }
        lv90 lv90Var = (lv90) obj;
        if (this.a != lv90Var.a) {
            return false;
        }
        return jl40.l(this.b, lv90Var.b);
    }

    public final int hashCode() {
        PaymentMethod$Type paymentMethod$Type = this.a;
        int hashCode = (paymentMethod$Type != null ? paymentMethod$Type.hashCode() : 0) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "Payment{type=" + this.a + ", paymentMethodId='" + this.b + "'}";
    }

    public lv90(PaymentMethod$Type paymentMethod$Type, String str, String str2, Boolean bool) {
        this.a = paymentMethod$Type;
        this.b = str;
        this.c = str2;
        this.d = bool;
    }
}
