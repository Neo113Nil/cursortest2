package defpackage;

import com.yandex.go.design.compose.haptic.HapticEffect;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class hlj0 implements xlj0 {
    public final HapticEffect a;

    public hlj0(HapticEffect hapticEffect) {
        this.a = hapticEffect;
    }

    @Override // defpackage.xlj0
    public final HapticEffect a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hlj0) && this.a == ((hlj0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ExtraPhoneNumberTrailClicked(hapticEffect=" + this.a + Extension.C_BRAKE;
    }
}
