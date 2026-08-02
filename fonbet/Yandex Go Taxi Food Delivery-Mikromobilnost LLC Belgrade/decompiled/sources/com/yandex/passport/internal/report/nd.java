package com.yandex.passport.internal.report;

import android.content.Context;
import com.yandex.passport.common.logger.LogLevel;
import defpackage.bvf0;
import defpackage.gw00;
import defpackage.tcc;
import defpackage.tje;
import defpackage.uyj;
import io.appmetrica.analytics.IReporterYandex;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class nd implements sd {
    public final Context a;
    public final g b;
    public final IReporterYandex c;
    public volatile Map d = kotlin.collections.b.f();

    public nd(Context context, g gVar, IReporterYandex iReporterYandex, com.yandex.passport.common.analytics.f fVar) {
        this.a = context;
        this.b = gVar;
        this.c = iReporterYandex;
        tje.N(bvf0.a(uyj.a), null, null, new MetricaReporter$1(fVar, this, null), 3);
    }

    @Override // com.yandex.passport.internal.report.sd
    public final void a(String str, Map map) {
        Map<String, Object> c = c(map);
        this.c.reportEvent(str, c);
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.VERBOSE, "[METRICA EVENT]", str + Extension.COLON_SPACE + c, 8);
        }
    }

    @Override // com.yandex.passport.internal.report.sd
    public final void b(String str, LinkedHashMap linkedHashMap) {
        Map<String, Object> c = c(linkedHashMap);
        this.c.reportStatboxEvent(str, c);
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.VERBOSE, "[STATBOX EVENT]", str + Extension.COLON_SPACE + c, 8);
        }
    }

    public final Map c(Map map) {
        ArrayList a = this.b.a();
        ArrayList arrayList = new ArrayList(tcc.n(a, 10));
        Iterator it = a.iterator();
        while (it.hasNext()) {
            pd pdVar = (pd) it.next();
            arrayList.add(new Pair(pdVar.getName(), pdVar.getValue()));
        }
        if (map.isEmpty()) {
            return kotlin.collections.b.s(arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        kotlin.collections.b.p(linkedHashMap, arrayList);
        return linkedHashMap;
    }

    public final void d(wd wdVar) {
        Throwable c;
        Pair b = wdVar.b();
        String str = (String) b.getFirst();
        Map map = (Map) b.getSecond();
        ArrayList a = this.b.a();
        int d = gw00.d(tcc.n(a, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        Iterator it = a.iterator();
        while (it.hasNext()) {
            pd pdVar = (pd) it.next();
            Pair pair = new Pair(pdVar.getName(), pdVar.getValue());
            linkedHashMap.put(pair.c(), pair.f());
        }
        LinkedHashMap n = kotlin.collections.b.n(linkedHashMap, map);
        this.c.reportEvent(str, n);
        this.c.reportRtmError(wdVar.a(this.a, kotlin.collections.b.n(linkedHashMap, this.d)));
        if ((wdVar instanceof ud) && (c = ((ud) wdVar).c()) != null) {
            this.c.reportUnhandledException(c);
        }
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.ERROR, "[METRICA EVENT]", str + Extension.COLON_SPACE + n, 8);
        }
    }
}
