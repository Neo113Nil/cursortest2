package com.yandex.fintechsdk.core.analytics.impl.internal;

import android.content.Context;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import defpackage.b6o;
import defpackage.bvf0;
import defpackage.e42;
import defpackage.g8e;
import defpackage.glt0;
import defpackage.ike;
import defpackage.jl40;
import defpackage.keo;
import defpackage.kkl0;
import defpackage.ljo;
import defpackage.mdh;
import defpackage.mv2;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.w511;
import defpackage.w870;
import defpackage.wdz;
import defpackage.x05;
import defpackage.z22;
import io.appmetrica.analytics.AppMetricaYandex;
import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.ReporterYandexConfig;
import io.appmetrica.analytics.RtmConfig;
import io.appmetrica.analytics.RtmErrorEvent;
import java.util.LinkedHashMap;
import java.util.Optional;
import kotlin.collections.builders.MapBuilder;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class a implements z22 {
    public final x05 a;
    public final Optional b;
    public final IReporterYandex c;
    public final com.yandex.fintechsdk.core.analytics.impl.internal.rum.a d;
    public final ike e;

    public a(kkl0 kkl0Var, Context context, DefaultEnvironment defaultEnvironment, x05 x05Var, mv2 mv2Var, b6o b6oVar, Optional optional) {
        RtmConfig.Environment environment;
        this.a = x05Var;
        this.b = optional;
        String apiKey = mv2Var.getApiKey();
        RtmConfig.Builder withProjectName = RtmConfig.newBuilder().withProjectName(b6oVar.get());
        int i = e42.a[defaultEnvironment.ordinal()];
        if (i == 1) {
            environment = RtmConfig.Environment.PRODUCTION;
        } else {
            if (i != 2) {
                w511.b();
                throw null;
            }
            environment = RtmConfig.Environment.TESTING;
        }
        AppMetricaYandex.activateReporter(context, ReporterYandexConfig.newBuilder(apiKey).withRtmConfig(withProjectName.withEnvironment(environment).build()).build());
        this.c = AppMetricaYandex.getReporter(context, apiKey);
        wdz a = kkl0Var.a();
        this.d = a != null ? new com.yandex.fintechsdk.core.analytics.impl.internal.rum.a(a) : null;
        sjh sjhVar = uyj.a;
        this.e = bvf0.a(mdh.b.plus(jl40.a()));
    }

    public final void a(keo keoVar) {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.putAll(this.a.getParams());
        mapBuilder.putAll(keoVar.b);
        MapBuilder j = mapBuilder.j();
        String str = keoVar.a;
        this.c.reportEvent(str, j);
        tje.N(this.e, null, null, new AnalyticsImpl$reportProductEvent$1(this, keoVar, j, null), 3);
        Optional optional = this.b;
        if (optional.isPresent() && ((w870) optional.get()).isEnabled()) {
            glt0 c = ((w870) optional.get()).c(str);
            ((LinkedHashMap) c.i).putAll(j);
            c.a = System.currentTimeMillis() * 1000000;
            c.a();
        }
    }

    public final void b(keo keoVar) {
        MapBuilder params = this.a.getParams();
        String o = g8e.o("[Technical Error] - ", keoVar.a);
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.putAll(params);
        mapBuilder.putAll(keoVar.b);
        this.c.reportRtmError(RtmErrorEvent.newBuilder(o).withAdditional(new JSONObject(mapBuilder.j()).toString()).build());
    }

    public final void c(String str, Throwable th) {
        this.c.reportRtmError(RtmErrorEvent.newBuilder("[Exception] - ".concat(str)).withAdditional(new JSONObject(this.a.getParams()).toString()).withStacktrace(ljo.b(th)).build());
    }
}
