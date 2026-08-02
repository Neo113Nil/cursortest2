package defpackage;

import com.yandex.payment.sdk.flex.impl.customview.views.cardinput.contract.CardNetwork;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class ik8 {
    public final CardNetwork a;
    public final ek8 b;

    public ik8(CardNetwork cardNetwork, ek8 ek8Var) {
        this.a = cardNetwork;
        this.b = ek8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ik8)) {
            return false;
        }
        ik8 ik8Var = (ik8) obj;
        return this.a == ik8Var.a && jl40.l(this.b, ik8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CardNetworkWithPattern(cardNetwork=" + this.a + ", pattern=" + this.b + Extension.C_BRAKE;
    }
}
