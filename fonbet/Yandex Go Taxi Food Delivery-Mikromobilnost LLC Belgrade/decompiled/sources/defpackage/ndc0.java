package defpackage;

import com.yandex.go.places.map.domain.entities.PlacesPinWarV2Config$PinStyle;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ndc0 {
    public final Map a;

    public ndc0(Map map) {
        this.a = map;
    }

    public static PlacesPinWarV2Config$PinStyle a(fo00 fo00Var) {
        if (fo00Var instanceof co00) {
            return PlacesPinWarV2Config$PinStyle.UNIVERSAL_M;
        }
        if (fo00Var instanceof bo00) {
            return PlacesPinWarV2Config$PinStyle.UNIVERSAL_L;
        }
        if (fo00Var instanceof xn00) {
            return PlacesPinWarV2Config$PinStyle.SUPERMAP;
        }
        if (fo00Var instanceof zn00) {
            return PlacesPinWarV2Config$PinStyle.SUPERMAP_FALLBACK;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ndc0) && this.a.equals(((ndc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return nnm.j("PinsConfigs(pinStyleConfigs=", Extension.C_BRAKE, this.a);
    }
}
