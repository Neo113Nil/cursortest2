package defpackage;

import com.yandex.go.address.models.PlaceType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class i3c0 {
    public static PlaceType a(String str) {
        if (str == null) {
            return null;
        }
        int hashCode = str.hashCode();
        if (hashCode == 3208415) {
            if (str.equals("home")) {
                return PlaceType.HOME;
            }
            return null;
        }
        if (hashCode == 3655441) {
            if (str.equals("work")) {
                return PlaceType.WORK;
            }
            return null;
        }
        if (hashCode == 106069776 && str.equals("other")) {
            return PlaceType.OTHER;
        }
        return null;
    }

    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = PlaceType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
