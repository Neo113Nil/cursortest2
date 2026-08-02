package defpackage;

import com.yandex.go.address.models.PlaceType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class pep implements tep {
    public final PlaceType a;

    public pep(PlaceType placeType) {
        this.a = placeType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pep) && this.a == ((pep) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PlaceTypeChanged(placeType=" + this.a + Extension.C_BRAKE;
    }
}
