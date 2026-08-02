package com.yandex.passport.internal.flags.experiments;

import android.content.SharedPreferences;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.pd;
import com.yandex.passport.internal.report.reporters.a0;
import defpackage.cvu0;
import io.appmetrica.analytics.IReporterYandex;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class g {
    public final SharedPreferences a;
    public final f b;
    public final a0 c;
    public final com.yandex.passport.internal.report.g d;
    public final b e;

    public g(com.yandex.passport.common.a aVar, SharedPreferences sharedPreferences, f fVar, a0 a0Var, com.yandex.passport.internal.report.g gVar, b bVar) {
        this.a = sharedPreferences;
        this.b = fVar;
        this.c = a0Var;
        this.d = gVar;
        this.e = bVar;
    }

    public final void a(a aVar) {
        long b;
        Map map = aVar.a;
        Map t = kotlin.collections.b.t(map);
        for (Map.Entry entry : map.entrySet()) {
            Iterable iterable = (List) aVar.b.get((String) entry.getKey());
            if (iterable == null) {
                iterable = EmptyList.a;
            }
            Object key = entry.getKey();
            LinkedHashMap linkedHashMap = new LinkedHashMap(t);
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((n) it.next()).a(this.b.a)) {
                    linkedHashMap.remove(key);
                }
            }
            t = linkedHashMap;
        }
        SharedPreferences sharedPreferences = this.a;
        b = com.yandex.passport.common.time.a.b(0L, 0L, 0L, sharedPreferences.getLong("__last__enqueue__time", 0L));
        SharedPreferences.Editor clear = sharedPreferences.edit().clear();
        for (Map.Entry entry2 : t.entrySet()) {
            clear.putString((String) entry2.getKey(), (String) entry2.getValue());
        }
        clear.putLong("__last__updated__time", System.currentTimeMillis());
        clear.putLong("__last__enqueue__time", b);
        clear.apply();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry3 : this.e.a.getAll().entrySet()) {
            arrayList.add(new jd(entry3.getKey(), entry3.getValue()));
        }
        ArrayList m0 = kotlin.collections.a.m0(this.d.a(), arrayList);
        IReporterYandex iReporterYandex = this.c.a.a;
        iReporterYandex.clearAppEnvironment();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = m0.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            pd pdVar = (pd) next;
            if (!cvu0.x(pdVar.getName(), "experiments_ios_", false) && !cvu0.x(pdVar.getName(), "experiments_reporting_", false)) {
                arrayList2.add(next);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            pd pdVar2 = (pd) it3.next();
            iReporterYandex.putAppEnvironmentValue(pdVar2.getName(), pdVar2.getValue());
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.VERBOSE, "[ENVIRONMENT EVENT]", pdVar2.getName() + Extension.COLON_SPACE + pdVar2.getValue(), 8);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
            if (sb.length() > 0) {
                sb.append(",\n");
            }
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
        }
        return "{\n" + ((Object) sb) + "\n}";
    }
}
