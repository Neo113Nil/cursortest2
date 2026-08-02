package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;

/* loaded from: classes8.dex */
public final class Gi {
    public final R4 a;
    public final C4766co b;
    public final Ii c;
    public final C5078p0 d;
    public Zl e;
    public final C4916ik f;

    public Gi(C5078p0 c5078p0, C4766co c4766co, R4 r4, C4916ik c4916ik) {
        this(c5078p0, c4766co, r4, c4916ik, new Ii(c5078p0, c4916ik));
    }

    public final void a(Fh fh) {
        Ph ph = fh.e;
        Zl zl = this.e;
        if (zl != null) {
            ph.b.setUuid(((Yl) zl).g());
        } else {
            ph.getClass();
        }
        this.c.a(fh);
    }

    public final void b(String str) {
        Lf lf = this.a.a;
        synchronized (lf) {
            lf.a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", str);
        }
    }

    public Gi(C5078p0 c5078p0, C4766co c4766co, R4 r4, C4916ik c4916ik, Ii ii) {
        this.d = c5078p0;
        this.a = r4;
        this.b = c4766co;
        this.f = c4916ik;
        this.c = ii;
    }

    public final void a(Yl yl) {
        this.e = yl;
        this.a.b.setUuid(yl.g());
    }

    public final void a(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        if (vo.a(bool)) {
            this.a.b.setLocationTracking(bool.booleanValue());
        }
        if (vo.a(bool2)) {
            this.a.b.setDataSendingEnabled(bool2.booleanValue());
        }
        if (vo.a(bool3)) {
            this.a.b.setAdvIdentifiersTracking(bool3.booleanValue(), bool4.booleanValue());
        }
        C4722b6 a = C4722b6.a();
        R4 r4 = this.a;
        a(a(a, r4), r4, 1, (Map) null);
    }

    public final void a(C4722b6 c4722b6, Ph ph, int i, Map map) {
        String str;
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        this.d.b();
        if (!vo.a(map)) {
            c4722b6.setValue(AbstractC5166sb.b(map));
            a(c4722b6, ph);
        }
        Lf lf = new Lf(ph.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(ph.b);
        P8 p8 = ph.c;
        synchronized (ph) {
            str = ph.f;
        }
        a(new Fh(c4722b6, false, i, null, new Ph(lf, counterConfiguration, p8, str)));
    }

    public static C4722b6 a(C4722b6 c4722b6, Ph ph) {
        if (I9.a.contains(Integer.valueOf(c4722b6.d))) {
            c4722b6.c = ph.d();
        }
        return c4722b6;
    }

    public final void a(List list) {
        Lf lf = this.a.a;
        synchronized (lf) {
            lf.a.put("PROCESS_CFG_CUSTOM_HOSTS", vo.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
        }
    }

    public final void a(HashMap hashMap) {
        Lf lf = this.a.a;
        synchronized (lf) {
            lf.a.put("PROCESS_CFG_CLIDS", AbstractC5166sb.b(hashMap));
        }
    }

    public final void a(String str) {
        Lf lf = this.a.a;
        synchronized (lf) {
            lf.a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
        }
    }

    public final Fh a(C4714ao c4714ao, Ph ph) {
        String str;
        String str2;
        this.d.b();
        C4766co c4766co = this.b;
        c4766co.getClass();
        Qn qn = c4714ao.a;
        if (qn == null) {
            str = "";
        } else {
            str = (String) WrapUtils.getOrDefault(qn.a, "");
        }
        byte[] fromModel = c4766co.a.fromModel(c4714ao);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(ph.b.getApiKey());
        Set set = I9.a;
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        Y3 y3 = new Y3(fromModel, str, 5891, orCreatePublicLogger);
        y3.c = ph.d();
        HashMap hashMap = y3.q;
        Lf lf = new Lf(ph.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(ph.b);
        P8 p8 = ph.c;
        synchronized (ph) {
            str2 = ph.f;
        }
        return new Fh(y3, true, 1, hashMap, new Ph(lf, counterConfiguration, p8, str2));
    }
}
