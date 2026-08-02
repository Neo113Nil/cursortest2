package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billing.internal.config.BillingConfig;
import xsna.vu5;

/* loaded from: classes8.dex */
public final class A {
    public final int a;
    public final int b;

    public A(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceSideBillingConfig(sendFrequencySeconds=");
        sb.append(this.a);
        sb.append(", firstCollectingInappMaxAgeSeconds=");
        return vu5.b(sb, this.b, ')');
    }

    public A(BillingConfig billingConfig) {
        this(billingConfig.getSendFrequencySeconds(), billingConfig.getFirstCollectingInappMaxAgeSeconds());
    }
}
