package defpackage;

import java.util.Locale;
import java.util.Map;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;

/* loaded from: classes6.dex */
public final class ij40 {
    public static MtTransportType a(String str) {
        Map map;
        map = MtTransportType.map;
        MtTransportType mtTransportType = (MtTransportType) map.get(str.toLowerCase(Locale.ROOT));
        return mtTransportType == null ? MtTransportType.UNKNOWN : mtTransportType;
    }
}
