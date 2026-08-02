package com.vungle.ads.internal;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public final class t1 extends n2 {
    public boolean e;

    public t1(Sdk.SDKMetric.SDKMetricType sDKMetricType) {
        super(sDKMetricType);
    }

    @Override // com.vungle.ads.internal.n2
    public final void d() {
        if (this.d == null) {
            super.d();
        }
    }

    @Override // com.vungle.ads.internal.n2
    public final void e() {
        if (this.c == null) {
            super.e();
        }
    }

    public final boolean f() {
        return this.e;
    }

    public final void g() {
        this.e = true;
    }
}
