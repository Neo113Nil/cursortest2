package com.vungle.ads.internal;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes7.dex */
public final class a0 extends Lambda implements gzs {
    public final /* synthetic */ Sdk.SDKMetric.SDKMetricType a;
    public final /* synthetic */ long b;
    public final /* synthetic */ com.vungle.ads.internal.util.s c;
    public final /* synthetic */ Sdk.SDKMetric.Builder d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Sdk.SDKMetric.SDKMetricType sDKMetricType, long j, com.vungle.ads.internal.util.s sVar, Sdk.SDKMetric.Builder builder) {
        super(0);
        this.a = sDKMetricType;
        this.b = j;
        this.c = sVar;
        this.d = builder;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Logging Metric ");
        a.append(this.a);
        a.append(" with value ");
        a.append(this.b);
        a.append(" for placement ");
        com.vungle.ads.internal.util.s sVar = this.c;
        a.append(sVar != null ? sVar.a : null);
        a.append(" mediation:");
        a.append(this.d.getMediationName());
        return a.toString();
    }
}
