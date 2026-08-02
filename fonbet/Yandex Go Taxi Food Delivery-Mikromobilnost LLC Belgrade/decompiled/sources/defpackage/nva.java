package defpackage;

import com.yandex.go.deeplinks.generated.chargers.ChargersSuperpassSection;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class nva {
    public final ChargersSuperpassSection a;

    public nva(ChargersSuperpassSection chargersSuperpassSection) {
        this.a = chargersSuperpassSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nva) && this.a == ((nva) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ChargersSuperpassDeeplink(section=" + this.a + Extension.C_BRAKE;
    }
}
