package defpackage;

import com.yandex.go.design.compose.haptic.HapticEffect;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class flj0 implements xlj0 {
    public final sls a;
    public final HapticEffect b;

    public flj0(sls slsVar, HapticEffect hapticEffect) {
        this.a = slsVar;
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
        if (!(obj instanceof flj0)) {
            return false;
        }
        flj0 flj0Var = (flj0) obj;
        return this.a.equals(flj0Var.a) && this.b == flj0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DialogueButtonClicked(clickCallBack=" + this.a + ", hapticEffect=" + this.b + Extension.C_BRAKE;
    }
}
