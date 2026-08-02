package defpackage;

import com.yandex.go.network_metrics.api.NetworkSettingsProvider$NetworkType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class l060 {
    public final boolean a;
    public final NetworkSettingsProvider$NetworkType b;

    public l060(boolean z, NetworkSettingsProvider$NetworkType networkSettingsProvider$NetworkType) {
        this.a = z;
        this.b = networkSettingsProvider$NetworkType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l060)) {
            return false;
        }
        l060 l060Var = (l060) obj;
        return this.a == l060Var.a && this.b == l060Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Settings(isVpn=" + this.a + ", network=" + this.b + Extension.C_BRAKE;
    }
}
