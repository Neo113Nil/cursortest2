package com.vungle.ads.internal.downloader;

import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.n2;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.s;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.dez0;
import xsna.j5g;

/* loaded from: classes7.dex */
public final class k {
    public final j a;
    public final com.vungle.ads.internal.model.b b;
    public final s c;
    public final int d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicInteger f = new AtomicInteger(0);
    public final List g = dez0.b();
    public n2 h;
    public n2 i;

    public k(j jVar, com.vungle.ads.internal.model.b bVar, s sVar, int i) {
        this.a = jVar;
        this.b = bVar;
        this.c = sVar;
        this.d = i;
    }

    public final com.vungle.ads.internal.model.b a() {
        return this.b;
    }

    public final int b() {
        return this.f.get();
    }

    public final s c() {
        return this.c;
    }

    public final List d() {
        return j5g.O0(this.g);
    }

    public final boolean e() {
        return this.e.get();
    }

    public final void f() {
        if (this.i != null) {
            return;
        }
        n2 n2Var = new n2(Sdk.SDKMetric.SDKMetricType.ASSET_PARTIAL_DOWNLOAD_DURATION_MS);
        this.i = n2Var;
        n2Var.e();
    }

    public final void g() {
        n2 n2Var = new n2(Sdk.SDKMetric.SDKMetricType.TEMPLATE_DOWNLOAD_DURATION_MS);
        this.h = n2Var;
        n2Var.e();
    }

    public final void h() {
        n2 n2Var = this.i;
        if (n2Var != null) {
            n2Var.d();
            AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
            s sVar = this.c;
            StringBuilder a = com.iab.omid.library.vungle.internal.l.a("percentage=");
            a.append(this.b.e);
            a.append(" url=");
            a.append(this.b.b);
            analyticsClient.a(n2Var, sVar, a.toString());
        }
    }

    public final void i() {
        n2 n2Var = this.h;
        if (n2Var != null) {
            n2Var.d();
            AnalyticsClient.INSTANCE.a(n2Var, this.c, this.b.b);
        }
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("DownloadRequest{priority=");
        a.append(this.a);
        a.append(", url='");
        a.append(this.b.b);
        a.append("', path='");
        a.append(this.b.c);
        a.append("', cancelled=");
        a.append(this.e);
        a.append(", retryAttempt=");
        a.append(this.f.get());
        a.append(", maxRetries=");
        a.append(this.d);
        a.append(", logEntry=");
        a.append(this.c);
        a.append('}');
        return a.toString();
    }

    public final void a(String str) {
        this.g.add(str);
    }
}
