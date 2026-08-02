package com.yandex.plus.analytics.dwh;

import com.yandex.plus.log.api.LogPriority;
import defpackage.ike;
import defpackage.jse;
import defpackage.qc20;
import defpackage.qv10;
import defpackage.rkd0;
import defpackage.tje;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class a {
    public final qc20 a;
    public final rkd0 b;
    public final ike c;

    public a(qc20 qc20Var, rkd0 rkd0Var, jse jseVar) {
        this.a = qc20Var;
        this.b = rkd0Var;
        this.c = qv10.e(jseVar);
    }

    public final void a(String str, Map map) {
        LogPriority logPriority = LogPriority.DEBUG;
        rkd0 rkd0Var = this.b;
        if (rkd0Var.e(logPriority)) {
            rkd0Var.b(logPriority, "DWH", "RestDwhAnalyticsReporter.reportDwhEvent(" + str + Extension.FIX_SPACE + map + ')', null);
        }
        tje.N(this.c, null, null, new RestDwhAnalyticsReporter$reportDwhEvent$2(this, str, map, null), 3);
    }
}
