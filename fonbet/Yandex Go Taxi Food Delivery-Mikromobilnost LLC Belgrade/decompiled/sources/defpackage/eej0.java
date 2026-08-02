package defpackage;

import com.yandex.go.design.compose.haptic.HapticEffect;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class eej0 implements iej0 {
    public final HapticEffect a;

    public eej0(HapticEffect hapticEffect) {
        this.a = hapticEffect;
    }

    @Override // defpackage.iej0
    public final HapticEffect a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eej0) && this.a == ((eej0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "IntercityContactClicked(hapticEffect=" + this.a + Extension.C_BRAKE;
    }
}
