package defpackage;

import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.contract.CardNetwork;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class jk8 {
    public final CardNetwork a;
    public final fk8 b;

    public jk8(CardNetwork cardNetwork, fk8 fk8Var) {
        this.a = cardNetwork;
        this.b = fk8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk8)) {
            return false;
        }
        jk8 jk8Var = (jk8) obj;
        return this.a == jk8Var.a && jl40.l(this.b, jk8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CardNetworkWithPattern(cardNetwork=" + this.a + ", pattern=" + this.b + Extension.C_BRAKE;
    }
}
