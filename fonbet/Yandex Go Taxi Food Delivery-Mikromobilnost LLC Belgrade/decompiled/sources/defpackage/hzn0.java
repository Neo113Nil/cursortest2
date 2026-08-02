package defpackage;

import com.yandex.go.scooters.mosru.api.domain.model.ScootersMosRuActionDialogOpenReason;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class hzn0 implements jzn0 {
    public final ScootersMosRuActionDialogOpenReason a;

    public final boolean equals(Object obj) {
        if (obj instanceof hzn0) {
            return this.a == ((hzn0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ActionDialog(openReason=" + this.a + Extension.C_BRAKE;
    }
}
