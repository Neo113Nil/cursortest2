package defpackage;

import com.yandex.delivery.mapper.model.Expansion;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ahg extends hhg {
    public final String a;
    public final Expansion b;

    public ahg(String str, Expansion expansion) {
        this.a = str;
        this.b = expansion;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahg)) {
            return false;
        }
        ahg ahgVar = (ahg) obj;
        return jl40.l(this.a, ahgVar.a) && this.b == ahgVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenTrackingCardAction(deliveryId=" + this.a + ", expansion=" + this.b + Extension.C_BRAKE;
    }
}
