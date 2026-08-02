package com.yandex.passport.internal.report;

import android.content.Context;
import com.yandex.passport.common.logger.LogLevel;
import defpackage.bvf0;
import defpackage.tje;
import defpackage.uyj;
import io.appmetrica.analytics.IReporterYandex;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class kd implements sd {
    public final Context a;
    public final IReporterYandex b;
    public volatile Map c = kotlin.collections.b.f();

    public kd(Context context, IReporterYandex iReporterYandex) {
        this.a = context;
        this.b = iReporterYandex;
        tje.N(bvf0.a(uyj.a), null, null, new HostReporter$1(this, null), 3);
    }

    @Override // com.yandex.passport.internal.report.sd
    public final void a(String str, Map map) {
        LinkedHashMap n = kotlin.collections.b.n(map, this.c);
        this.b.reportEvent(str, n);
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.VERBOSE, "[METRICA EVENT]", str + Extension.COLON_SPACE + n, 8);
        }
    }

    @Override // com.yandex.passport.internal.report.sd
    public final void b(String str, LinkedHashMap linkedHashMap) {
        LinkedHashMap n = kotlin.collections.b.n(linkedHashMap, this.c);
        this.b.reportStatboxEvent(str, kotlin.collections.b.n(linkedHashMap, this.c));
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.VERBOSE, "[STATBOX EVENT]", str + Extension.COLON_SPACE + n, 8);
        }
    }
}
