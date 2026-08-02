package defpackage;

import com.yandex.go.due.data.api.dto.AllowedTimeInfo;
import com.yandex.go.due.data.api.dto.PricePrefetch;
import com.yandex.go.due.data.api.dto.ScheduledOrderAvailabilityResponse;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class fwm {
    public final wiq0 a;

    public fwm(wiq0 wiq0Var) {
        this.a = wiq0Var;
    }

    public final PricePrefetch a(ScheduledOrderAvailabilityResponse scheduledOrderAvailabilityResponse) {
        Object obj;
        pex0 m = ((k) this.a).m();
        String str = m != null ? m.b : null;
        Iterator it = scheduledOrderAvailabilityResponse.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((AllowedTimeInfo) obj).d, str)) {
                break;
            }
        }
        AllowedTimeInfo allowedTimeInfo = (AllowedTimeInfo) obj;
        if (allowedTimeInfo != null) {
            return allowedTimeInfo.e;
        }
        return null;
    }
}
