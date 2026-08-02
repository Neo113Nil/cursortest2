package com.yandex.passport.internal.analytics;

import com.yandex.passport.common.logger.LogLevel;
import defpackage.tls;
import io.appmetrica.analytics.IReporterYandex;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class t {
    public final IReporterYandex a;
    public final ArrayList b = new ArrayList();

    public t(IReporterYandex iReporterYandex) {
        this.a = iReporterYandex;
    }

    public final void a(m mVar, Map map) {
        b(mVar.a, map);
    }

    public final void b(String str, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Iterator it = Collections.unmodifiableList(kotlin.collections.a.J0(this.b)).iterator();
        while (it.hasNext()) {
            ((tls) it.next()).invoke(linkedHashMap);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.putAll(linkedHashMap);
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.VERBOSE, "[METRICA EVENT]", str + Extension.COLON_SPACE + linkedHashMap2, 8);
        }
        IReporterYandex iReporterYandex = this.a;
        iReporterYandex.reportEvent(str, linkedHashMap2);
        if (linkedHashMap2.containsKey("error")) {
            iReporterYandex.reportEvent("error", linkedHashMap2);
        }
    }

    public final void c(Exception exc) {
        this.a.reportError("error", exc);
    }

    public final void d(m mVar, Map map) {
        String str = mVar.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Iterator it = Collections.unmodifiableList(kotlin.collections.a.J0(this.b)).iterator();
        while (it.hasNext()) {
            ((tls) it.next()).invoke(linkedHashMap);
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            try {
                jSONObject.put(str2, value);
            } catch (JSONException e) {
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "toJsonString: '" + str2 + "' = '" + value + '\'', e);
                }
            }
        }
        String jSONObject2 = jSONObject.toString();
        com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "reportStatboxEvent(eventId=" + str + ", eventData=" + jSONObject2 + ')', 8);
        }
        IReporterYandex iReporterYandex = this.a;
        iReporterYandex.reportStatboxEvent(str, jSONObject2);
        if (linkedHashMap.containsKey("error")) {
            iReporterYandex.reportEvent("error", jSONObject2);
        }
    }
}
