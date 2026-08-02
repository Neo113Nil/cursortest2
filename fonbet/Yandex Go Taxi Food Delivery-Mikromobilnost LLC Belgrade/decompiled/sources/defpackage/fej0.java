package defpackage;

import com.yandex.go.design.compose.haptic.HapticEffect;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class fej0 implements iej0 {
    public final HapticEffect a;

    public fej0(HapticEffect hapticEffect) {
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
        return (obj instanceof fej0) && this.a == ((fej0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OrderDueClicked(hapticEffect=" + this.a + Extension.C_BRAKE;
    }
}
