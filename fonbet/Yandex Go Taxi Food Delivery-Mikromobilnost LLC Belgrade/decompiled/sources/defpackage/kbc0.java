package defpackage;

import com.yandex.go.places.api.navigation.CardRevealing;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class kbc0 {
    public final CardRevealing a;

    public kbc0(CardRevealing cardRevealing) {
        this.a = cardRevealing;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kbc0) && this.a == ((kbc0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PlacesMapScreenParamsOverride(revealing=" + this.a + Extension.C_BRAKE;
    }
}
