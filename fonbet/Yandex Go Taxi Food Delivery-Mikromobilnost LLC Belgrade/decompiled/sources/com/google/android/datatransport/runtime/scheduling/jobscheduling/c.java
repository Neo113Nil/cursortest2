package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import defpackage.vfc;
import java.util.Set;

/* loaded from: classes.dex */
public final class c extends SchedulerConfig.b {
    public final long a;
    public final long b;
    public final Set c;

    public c(long j, long j2, Set set) {
        this.a = j;
        this.b = j2;
        this.c = set;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.b
    public final long a() {
        return this.a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.b
    public final Set b() {
        return this.c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.b
    public final long c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig.b)) {
            return false;
        }
        SchedulerConfig.b bVar = (SchedulerConfig.b) obj;
        return this.a == bVar.a() && this.b == bVar.c() && this.c.equals(bVar.b());
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.b;
        return this.c.hashCode() ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfigValue{delta=");
        sb.append(this.a);
        sb.append(", maxAllowedDelay=");
        sb.append(this.b);
        sb.append(", flags=");
        return vfc.q(sb, this.c, "}");
    }
}
