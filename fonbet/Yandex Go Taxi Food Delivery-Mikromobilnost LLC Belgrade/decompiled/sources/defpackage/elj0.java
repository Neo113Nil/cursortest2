package defpackage;

import com.yandex.go.design.compose.haptic.HapticEffect;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class elj0 implements xlj0 {
    public final String a;
    public final int b;
    public final HapticEffect c;

    public elj0(String str, int i, HapticEffect hapticEffect) {
        this.a = str;
        this.b = i;
        this.c = hapticEffect;
    }

    @Override // defpackage.xlj0
    public final HapticEffect a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof elj0)) {
            return false;
        }
        elj0 elj0Var = (elj0) obj;
        return jl40.l(this.a, elj0Var.a) && this.b == elj0Var.b && this.c == elj0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder u = b64.u(this.b, "DeliveryRentalRemoveClicked(tariffClass=", this.a, ", selectedDuration=", ", hapticEffect=");
        u.append(this.c);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
