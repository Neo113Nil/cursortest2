package defpackage;

import com.yandex.mob.okhttp.metrics.MobNetworkSettingsProvider$MobNetworkType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class hp20 {
    public final boolean a;
    public final MobNetworkSettingsProvider$MobNetworkType b;

    public hp20(boolean z, MobNetworkSettingsProvider$MobNetworkType mobNetworkSettingsProvider$MobNetworkType) {
        this.a = z;
        this.b = mobNetworkSettingsProvider$MobNetworkType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp20)) {
            return false;
        }
        hp20 hp20Var = (hp20) obj;
        return this.a == hp20Var.a && this.b == hp20Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "MobNetworkSettings(isVpn=" + this.a + ", network=" + this.b + Extension.C_BRAKE;
    }
}
