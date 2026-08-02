package defpackage;

import com.yandex.go.design.compose.haptic.HapticEffect;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class olj0 implements xlj0 {
    public final boolean a;
    public final HapticEffect b;

    public olj0(boolean z, HapticEffect hapticEffect) {
        this.a = z;
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
        if (!(obj instanceof olj0)) {
            return false;
        }
        olj0 olj0Var = (olj0) obj;
        return this.a == olj0Var.a && this.b == olj0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PayOnDeliveryClicked(isChecked=" + this.a + ", hapticEffect=" + this.b + Extension.C_BRAKE;
    }
}
