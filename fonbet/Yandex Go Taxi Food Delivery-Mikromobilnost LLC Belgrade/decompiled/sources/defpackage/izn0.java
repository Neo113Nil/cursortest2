package defpackage;

import com.yandex.go.scooters.mosru.api.domain.model.ScootersMosRuWebViewOpenReason;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class izn0 implements jzn0 {
    public final ScootersMosRuWebViewOpenReason a;

    public final boolean equals(Object obj) {
        if (obj instanceof izn0) {
            return this.a == ((izn0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WebView(openReason=" + this.a + Extension.C_BRAKE;
    }
}
