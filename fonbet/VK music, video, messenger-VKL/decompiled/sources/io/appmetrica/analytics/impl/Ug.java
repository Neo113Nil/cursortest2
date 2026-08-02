package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;
import xsna.vu5;

/* loaded from: classes8.dex */
public final class Ug implements RemoteConfigMetaInfo {
    public final long a;
    public final long b;

    public Ug(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final Ug a(long j, long j2) {
        return new Ug(j, j2);
    }

    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ug)) {
            return false;
        }
        Ug ug = (Ug) obj;
        return this.a == ug.a && this.b == ug.b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getFirstSendTime() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getLastUpdateTime() {
        return this.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RemoteConfigMetaInfoModel(firstSendTime=");
        sb.append(this.a);
        sb.append(", lastUpdateTime=");
        return vu5.a(')', this.b, sb);
    }

    public final long a() {
        return this.a;
    }

    public static Ug a(Ug ug, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = ug.a;
        }
        if ((i & 2) != 0) {
            j2 = ug.b;
        }
        ug.getClass();
        return new Ug(j, j2);
    }
}
