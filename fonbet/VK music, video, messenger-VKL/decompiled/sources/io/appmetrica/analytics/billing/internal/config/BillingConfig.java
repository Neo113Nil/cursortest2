package io.appmetrica.analytics.billing.internal.config;

import io.appmetrica.analytics.billing.impl.s;
import xsna.vu5;

/* loaded from: classes8.dex */
public final class BillingConfig {
    private final int a;
    private final int b;

    public BillingConfig(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int getFirstCollectingInappMaxAgeSeconds() {
        return this.b;
    }

    public final int getSendFrequencySeconds() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BillingConfig(sendFrequencySeconds=");
        sb.append(this.a);
        sb.append(", firstCollectingInappMaxAgeSeconds=");
        return vu5.b(sb, this.b, ')');
    }

    public BillingConfig() {
        this(new s().a, new s().b);
    }
}
