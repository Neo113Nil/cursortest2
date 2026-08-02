package defpackage;

import com.yandex.go.design.compose.haptic.HapticEffect;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class dlj0 implements xlj0 {
    public final String a;
    public final HapticEffect b;

    public dlj0(String str, HapticEffect hapticEffect) {
        this.a = str;
        this.b = hapticEffect;
    }

    @Override // defpackage.xlj0
    public final HapticEffect a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlj0)) {
            return false;
        }
        dlj0 dlj0Var = (dlj0) obj;
        return jl40.l(this.a, dlj0Var.a) && this.b == dlj0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DeliveryRentalClicked(tariffClass=" + this.a + ", hapticEffect=" + this.b + Extension.C_BRAKE;
    }
}
