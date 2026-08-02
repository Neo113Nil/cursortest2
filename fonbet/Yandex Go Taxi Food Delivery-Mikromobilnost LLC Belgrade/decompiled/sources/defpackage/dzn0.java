package defpackage;

import com.yandex.go.deeplinks.generated.scooters.ScootersMosRuAuthorizationSection;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class dzn0 {
    public final ScootersMosRuAuthorizationSection a;

    public dzn0(ScootersMosRuAuthorizationSection scootersMosRuAuthorizationSection) {
        this.a = scootersMosRuAuthorizationSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dzn0) && this.a == ((dzn0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ScootersMosRuAuthorizationDeeplink(section=" + this.a + Extension.C_BRAKE;
    }
}
