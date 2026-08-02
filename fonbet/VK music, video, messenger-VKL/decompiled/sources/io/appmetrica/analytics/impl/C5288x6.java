package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.x6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5288x6 implements InterfaceC4856gb {
    public final C5313y6 a;
    public final Ph b;

    public C5288x6(C5313y6 c5313y6) {
        this.a = c5313y6;
        this.b = c5313y6.a();
        C5030n4.l().getClass();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4856gb
    public final void a(C4714ao c4714ao) {
        Gi gi = this.a.a;
        Fh a = gi.a(c4714ao, this.b);
        Ph ph = a.e;
        Zl zl = gi.e;
        if (zl != null) {
            ph.b.setUuid(((Yl) zl).g());
        } else {
            ph.getClass();
        }
        gi.c.b(a);
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Unhandled exception received: " + c4714ao, new Object[0]);
    }

    public final void a(AppMetricaConfig appMetricaConfig) {
        Map<String, String> map = appMetricaConfig.errorEnvironment;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                Ph ph = this.b;
                String key = entry.getKey();
                String value = entry.getValue();
                synchronized (ph) {
                    P8 p8 = ph.c;
                    p8.b.b(p8.a, key, value);
                }
            }
        }
    }
}
