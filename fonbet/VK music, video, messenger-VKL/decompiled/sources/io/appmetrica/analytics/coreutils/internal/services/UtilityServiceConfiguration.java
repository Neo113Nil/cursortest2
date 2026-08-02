package io.appmetrica.analytics.coreutils.internal.services;

import xsna.vu5;
import xsna.zcl;

/* loaded from: classes8.dex */
public final class UtilityServiceConfiguration {
    private final long a;
    private final long b;

    public UtilityServiceConfiguration() {
        this(0L, 0L, 3, null);
    }

    public static /* synthetic */ UtilityServiceConfiguration copy$default(UtilityServiceConfiguration utilityServiceConfiguration, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = utilityServiceConfiguration.a;
        }
        if ((i & 2) != 0) {
            j2 = utilityServiceConfiguration.b;
        }
        return utilityServiceConfiguration.copy(j, j2);
    }

    public final long component1() {
        return this.a;
    }

    public final long component2() {
        return this.b;
    }

    public final UtilityServiceConfiguration copy(long j, long j2) {
        return new UtilityServiceConfiguration(j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilityServiceConfiguration)) {
            return false;
        }
        UtilityServiceConfiguration utilityServiceConfiguration = (UtilityServiceConfiguration) obj;
        return this.a == utilityServiceConfiguration.a && this.b == utilityServiceConfiguration.b;
    }

    public final long getInitialConfigTime() {
        return this.a;
    }

    public final long getLastUpdateConfigTime() {
        return this.b;
    }

    public int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UtilityServiceConfiguration(initialConfigTime=");
        sb.append(this.a);
        sb.append(", lastUpdateConfigTime=");
        return vu5.a(')', this.b, sb);
    }

    public UtilityServiceConfiguration(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public /* synthetic */ UtilityServiceConfiguration(long j, long j2, int i, zcl zclVar) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2);
    }
}
