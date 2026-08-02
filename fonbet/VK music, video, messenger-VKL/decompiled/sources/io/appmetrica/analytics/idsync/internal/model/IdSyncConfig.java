package io.appmetrica.analytics.idsync.internal.model;

import java.util.List;
import xsna.bh10;
import xsna.epx;
import xsna.ms9;

/* loaded from: classes8.dex */
public final class IdSyncConfig {
    private final boolean a;
    private final long b;
    private final List c;

    public IdSyncConfig(boolean z, long j, List<RequestConfig> list) {
        this.a = z;
        this.b = j;
        this.c = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!IdSyncConfig.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.idsync.internal.model.IdSyncConfig");
        }
        IdSyncConfig idSyncConfig = (IdSyncConfig) obj;
        return this.a == idSyncConfig.a && this.b == idSyncConfig.b && epx.f(this.c, idSyncConfig.c);
    }

    public final boolean getEnabled() {
        return this.a;
    }

    public final long getLaunchDelay() {
        return this.b;
    }

    public final List<RequestConfig> getRequests() {
        return this.c;
    }

    public int hashCode() {
        return this.c.hashCode() + bh10.a(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdSyncConfig(enabled=");
        sb.append(this.a);
        sb.append(", launchDelay=");
        sb.append(this.b);
        sb.append(", requests=");
        return ms9.a(')', sb, this.c);
    }
}
