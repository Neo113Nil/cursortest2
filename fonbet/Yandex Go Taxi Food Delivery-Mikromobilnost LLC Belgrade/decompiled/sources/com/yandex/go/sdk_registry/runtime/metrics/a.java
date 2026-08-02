package com.yandex.go.sdk_registry.runtime.metrics;

import com.yandex.go.sdk_registry.api.metrics.SdkInitMetric$Phase;
import com.yandex.go.sdk_registry.api.metrics.SdkMetricResult;
import defpackage.h33;
import defpackage.ike;
import defpackage.mop0;
import defpackage.tje;

/* loaded from: classes13.dex */
public final class a {
    public final String a;
    public final ike b;
    public final h33 c;
    public final Object d = new Object();
    public boolean e;
    public Long f;
    public boolean g;
    public Long h;
    public boolean i;

    public a(String str, ike ikeVar, h33 h33Var) {
        this.a = str;
        this.b = ikeVar;
        this.c = h33Var;
    }

    public final mop0 a(SdkInitMetric$Phase sdkInitMetric$Phase, SdkMetricResult sdkMetricResult, long j) {
        long nanoTime = System.nanoTime() / 1000000;
        long j2 = nanoTime - j;
        return new mop0(this.a, nanoTime, j2 < 0 ? 0L : j2, sdkInitMetric$Phase, sdkMetricResult);
    }

    public final void b() {
        synchronized (this.d) {
            if (this.i) {
                return;
            }
            Long l = this.h;
            if (l != null) {
                long longValue = l.longValue();
                this.i = true;
                g(a(SdkInitMetric$Phase.FULL, SdkMetricResult.SUCCESS, longValue));
            }
        }
    }

    public final void c() {
        synchronized (this.d) {
            if (!this.i && this.h == null) {
                this.h = Long.valueOf(System.nanoTime() / 1000000);
            }
        }
    }

    public final void d() {
        mop0 a;
        synchronized (this.d) {
            try {
                Long l = this.h;
                if (l == null || this.i) {
                    Long l2 = this.f;
                    if (l2 == null || this.g) {
                        return;
                    }
                    long longValue = l2.longValue();
                    this.g = true;
                    a = a(SdkInitMetric$Phase.LIGHTWEIGHT, SdkMetricResult.FAILURE, longValue);
                } else {
                    long longValue2 = l.longValue();
                    this.i = true;
                    a = a(SdkInitMetric$Phase.FULL, SdkMetricResult.FAILURE, longValue2);
                }
                g(a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.d) {
            if (this.g) {
                return;
            }
            Long l = this.f;
            if (l != null) {
                long longValue = l.longValue();
                this.g = true;
                g(a(SdkInitMetric$Phase.LIGHTWEIGHT, SdkMetricResult.SUCCESS, longValue));
            }
        }
    }

    public final void f() {
        synchronized (this.d) {
            if (!this.g && this.f == null) {
                this.f = Long.valueOf(System.nanoTime() / 1000000);
            }
        }
    }

    public final void g(mop0 mop0Var) {
        if (this.c == null) {
            return;
        }
        tje.N(this.b, null, null, new MetricSinkSdkInitTracker$report$1(this, mop0Var, null), 3);
    }
}
