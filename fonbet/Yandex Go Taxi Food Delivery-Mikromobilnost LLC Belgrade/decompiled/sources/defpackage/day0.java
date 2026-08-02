package defpackage;

import java.util.HashMap;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes14.dex */
public final class day0 {
    public final pho a;

    public day0(pho phoVar) {
        this.a = phoVar;
    }

    public final void a(String str, long j, Long l) {
        HashMap p = x4e.p(ClidProvider.STATE, str);
        p.put("plan_time", Long.valueOf(j));
        if (l != null) {
            p.put("fact_time", l);
        }
        this.a.a("TaxiSearch.CarAssigned", p, 1, new HashMap());
    }
}
