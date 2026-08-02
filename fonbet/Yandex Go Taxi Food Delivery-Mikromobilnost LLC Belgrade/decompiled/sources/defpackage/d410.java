package defpackage;

import java.util.List;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class d410 {
    public final List a;
    public final MapBuilder b;

    public d410(List list) {
        this.a = list;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("transport_types", list);
        this.b = mapBuilder.j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d410) && this.a.equals(((d410) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("PurchaseScenario(transportTypes=", Extension.C_BRAKE, this.a);
    }
}
