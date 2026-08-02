package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* loaded from: classes8.dex */
public final class Kc extends U2 {
    public Kc(Context context, Lf lf, ReporterConfig reporterConfig, Gi gi, Y9 y9) {
        this(context, gi, new Ph(lf, new CounterConfiguration(reporterConfig), new P8(new Bl(LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey), "Crash Environment")), reporterConfig.userProfileID), y9, C5030n4.l().n(), new C4740bo(), new Og(), new H6(), new C4768d0(), new Ue(y9));
    }

    @Override // io.appmetrica.analytics.impl.U2
    public final String j() {
        return "[ManualReporter]";
    }

    public Kc(Context context, Gi gi, Ph ph, Y9 y9, D6 d6, C4740bo c4740bo, Og og, H6 h6, C4768d0 c4768d0, Ue ue) {
        super(context, gi, ph, y9, d6, c4740bo, og, h6, c4768d0, ue);
        C5030n4.l().getClass();
    }
}
