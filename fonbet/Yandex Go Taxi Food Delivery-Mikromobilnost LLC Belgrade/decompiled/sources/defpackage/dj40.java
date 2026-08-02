package defpackage;

import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;

/* loaded from: classes6.dex */
public final class dj40 {
    public final List a;
    public final MtTransportType b;

    public dj40(List list) {
        this.a = list;
        MtTransportType mtTransportType = (MtTransportType) a.R(list);
        this.b = mtTransportType == null ? MtTransportType.UNKNOWN : mtTransportType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dj40) && this.a.equals(((dj40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("MtTransportHierarchy(types=", Extension.C_BRAKE, this.a);
    }
}
