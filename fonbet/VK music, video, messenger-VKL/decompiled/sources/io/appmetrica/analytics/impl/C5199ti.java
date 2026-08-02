package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.LinkedHashMap;
import java.util.List;
import xsna.e43;

/* renamed from: io.appmetrica.analytics.impl.ti, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5199ti implements InterfaceC4804eb {
    public final Context a;
    public final Lf b;
    public final Gi c;
    public final Handler d;
    public final Yl e;
    public final Ec f;
    public final LinkedHashMap g;
    public final On h;
    public final List i;
    public C5193tc j;
    public C5288x6 k;

    public C5199ti(Context context, Lf lf, Gi gi, Handler handler, Yl yl) {
        this.a = context;
        this.b = lf;
        this.c = gi;
        this.d = handler;
        this.e = yl;
        this.f = new Ec(context, lf, gi, yl);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.g = linkedHashMap;
        this.h = new On(new C5250vi(linkedHashMap));
        this.i = e43.l("20799a27-fa80-4b36-b2db-0f8141f24180", "0e5e9c33-f8c3-4568-86c5-2e4f57523f72");
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4804eb, io.appmetrica.analytics.impl.InterfaceC4830fb
    public final InterfaceC4804eb a() {
        return this;
    }

    public final C5199ti b() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4804eb
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized C5193tc b(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, C4974l0 c4974l0) {
        C5193tc c5193tc;
        try {
            c5193tc = this.j;
            if (c5193tc != null) {
                Ec ec = this.f;
                ec.getClass();
                publicLogger.info("Update anonymous config with value " + appMetricaConfig.toJson(), new Object[0]);
                ec.f.b.applyFromAnonymousConfig(appMetricaConfig);
            } else {
                this.h.a(appMetricaConfig.apiKey);
                Ec ec2 = this.f;
                ec2.getClass();
                publicLogger.info("Update anonymous config with value " + appMetricaConfig.toJson(), new Object[0]);
                ec2.f.b.applyFromAnonymousConfig(appMetricaConfig);
                c5193tc = new C5193tc(this.f);
                c5193tc.i = new Ab(this.d, c5193tc);
                Yl yl = this.e;
                Ph ph = c5193tc.b;
                if (yl != null) {
                    ph.b.setUuid(yl.g());
                } else {
                    ph.getClass();
                }
                c5193tc.a(appMetricaConfig, c4974l0);
                c5193tc.k();
                this.c.f.c = new C5173si(c5193tc);
                this.g.put(appMetricaConfig.apiKey, c5193tc);
                this.j = c5193tc;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c5193tc;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4804eb
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final synchronized C5193tc a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, C4974l0 c4974l0) {
        C5193tc c5193tc;
        try {
            c5193tc = this.j;
            if (c5193tc != null) {
                this.f.a(appMetricaConfig, publicLogger);
                c5193tc.a(appMetricaConfig, c4974l0);
                C5030n4.l().getClass();
                this.g.put(appMetricaConfig.apiKey, c5193tc);
            } else {
                this.h.a(appMetricaConfig.apiKey);
                this.f.a(appMetricaConfig, publicLogger);
                c5193tc = new C5193tc(this.f);
                c5193tc.i = new Ab(this.d, c5193tc);
                Yl yl = this.e;
                Ph ph = c5193tc.b;
                if (yl != null) {
                    ph.b.setUuid(yl.g());
                } else {
                    ph.getClass();
                }
                c5193tc.a(appMetricaConfig, c4974l0);
                c5193tc.k();
                this.c.f.c = new C5173si(c5193tc);
                this.g.put(appMetricaConfig.apiKey, c5193tc);
                C5030n4.l().getClass();
                this.j = c5193tc;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c5193tc;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4804eb
    public final synchronized void a(ReporterConfig reporterConfig) {
        try {
            if (this.g.containsKey(reporterConfig.apiKey)) {
                LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey).warning("Reporter with apiKey=%s already exists.", ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey));
            } else {
                b(reporterConfig);
                ImportantLogger.INSTANCE.info(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA, "Activate reporter with APIKey " + ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey), new Object[0]);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4804eb
    public final synchronized InterfaceC4779db b(ReporterConfig reporterConfig) {
        InterfaceC4779db interfaceC4779db;
        try {
            InterfaceC4779db interfaceC4779db2 = (InterfaceC4779db) this.g.get(reporterConfig.apiKey);
            interfaceC4779db = interfaceC4779db2;
            if (interfaceC4779db2 == null) {
                if (!this.i.contains(reporterConfig.apiKey)) {
                    this.e.i();
                }
                Context context = this.a;
                Kc kc = new Kc(context, this.b, reporterConfig, this.c, new Y9(context));
                kc.i = new Ab(this.d, kc);
                Yl yl = this.e;
                Ph ph = kc.b;
                if (yl != null) {
                    ph.b.setUuid(yl.g());
                } else {
                    ph.getClass();
                }
                kc.k();
                this.g.put(reporterConfig.apiKey, kc);
                interfaceC4779db = kc;
            }
        } catch (Throwable th) {
            throw th;
        }
        return interfaceC4779db;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4804eb
    public final synchronized InterfaceC4856gb a(AppMetricaConfig appMetricaConfig) {
        C5288x6 c5288x6;
        try {
            c5288x6 = this.k;
            if (c5288x6 != null) {
                c5288x6.a(appMetricaConfig);
            } else {
                C5288x6 c5288x62 = new C5288x6(new C5313y6(this.b, this.f.e, this.c, appMetricaConfig));
                this.k = c5288x62;
                c5288x6 = c5288x62;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c5288x6;
    }
}
