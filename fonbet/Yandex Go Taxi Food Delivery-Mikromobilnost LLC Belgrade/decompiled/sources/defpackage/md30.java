package defpackage;

import java.util.Iterator;
import ru.yandex.taxi.masstransit.model.MtCheckoutDeeplinkStatus;

/* loaded from: classes6.dex */
public final class md30 {
    public static MtCheckoutDeeplinkStatus a(String str) {
        Object obj = null;
        if (str == null) {
            return null;
        }
        Iterator<E> it = MtCheckoutDeeplinkStatus.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (cvu0.t(((MtCheckoutDeeplinkStatus) next).getWireName(), str, true)) {
                obj = next;
                break;
            }
        }
        MtCheckoutDeeplinkStatus mtCheckoutDeeplinkStatus = (MtCheckoutDeeplinkStatus) obj;
        return mtCheckoutDeeplinkStatus == null ? MtCheckoutDeeplinkStatus.UNKNOWN : mtCheckoutDeeplinkStatus;
    }
}
