package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@gsq0
/* loaded from: classes6.dex */
public final class o1a0 {
    public static final j1a0 Companion = new j1a0();
    public static final i3y[] c = {a.b(LazyThreadSafetyMode.PUBLICATION, new nk90(22)), null};
    public final PaymentMethod$Type a;
    public final String b;

    public /* synthetic */ o1a0(int i, String str, PaymentMethod$Type paymentMethod$Type) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, h1a0.a.getDescriptor());
            throw null;
        }
        this.a = paymentMethod$Type;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1a0)) {
            return false;
        }
        o1a0 o1a0Var = (o1a0) obj;
        return this.a == o1a0Var.a && jl40.l(this.b, o1a0Var.b);
    }

    public final int hashCode() {
        PaymentMethod$Type paymentMethod$Type = this.a;
        int hashCode = (paymentMethod$Type == null ? 0 : paymentMethod$Type.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentInfo(paymentMethod=" + this.a + ", paymentMethodId=" + this.b + Extension.C_BRAKE;
    }

    public o1a0(e4a0 e4a0Var, String str) {
        this.a = e4a0Var != null ? e4a0Var.a() : null;
        this.b = str;
    }
}
