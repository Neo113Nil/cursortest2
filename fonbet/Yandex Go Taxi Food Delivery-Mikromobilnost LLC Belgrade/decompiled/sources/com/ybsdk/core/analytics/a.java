package com.ybsdk.core.analytics;

import defpackage.bvf0;
import defpackage.cvw;
import defpackage.jl40;
import defpackage.sd00;
import defpackage.tje;
import defpackage.uyj;
import defpackage.w42;
import io.appmetrica.analytics.IReporterYandex;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.b;

/* loaded from: classes8.dex */
public final class a {
    public final IReporterYandex a;
    public w42 b;
    public final LinkedList c = new LinkedList();

    static {
        new AtomicBoolean(false);
    }

    public a(IReporterYandex iReporterYandex) {
        this.a = iReporterYandex;
        tje.N(bvf0.a(cvw.U(jl40.a(), uyj.a)), null, null, new MainYbAnalyticsReportQueue$1(this, null), 3);
    }

    public final void a(String str, Map map) {
        if (map == null) {
            map = b.f();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put("event_timestamp", Long.valueOf(System.currentTimeMillis()));
        w42 w42Var = this.b;
        if (w42Var == null) {
            this.c.add(new sd00(str, linkedHashMap));
        } else {
            this.a.reportEvent(str, bvf0.v(linkedHashMap, w42Var.a(), this.b.b()));
        }
    }

    public final void b() {
        w42 w42Var = this.b;
        if (w42Var == null) {
            return;
        }
        while (true) {
            LinkedList linkedList = this.c;
            if (linkedList.isEmpty()) {
                return;
            }
            sd00 sd00Var = (sd00) linkedList.poll();
            if (sd00Var != null) {
                this.a.reportEvent(sd00Var.a, bvf0.v(sd00Var.b, w42Var.a(), w42Var.b()));
            }
        }
    }
}
