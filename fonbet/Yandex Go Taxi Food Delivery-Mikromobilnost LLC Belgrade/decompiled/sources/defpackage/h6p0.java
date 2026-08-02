package defpackage;

import com.yandex.go.deeplinks.generated.scooters.ScootersUpdateUserPdDataSection;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class h6p0 {
    public final ScootersUpdateUserPdDataSection a;

    public h6p0(ScootersUpdateUserPdDataSection scootersUpdateUserPdDataSection) {
        this.a = scootersUpdateUserPdDataSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h6p0) && this.a == ((h6p0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ScootersUpdateUserPdDataDeeplink(section=" + this.a + Extension.C_BRAKE;
    }
}
