package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import defpackage.b64;
import defpackage.ny61;
import defpackage.s3c;
import java.util.Map;

/* loaded from: classes.dex */
public final class a extends SchedulerConfig {
    public final s3c a;
    public final Map b;

    public a(s3c s3cVar, Map map) {
        if (s3cVar == null) {
            ny61.t("Null clock");
            throw null;
        }
        this.a = s3cVar;
        if (map != null) {
            this.b = map;
        } else {
            ny61.t("Null values");
            throw null;
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public final s3c a() {
        return this.a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public final Map c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig)) {
            return false;
        }
        SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
        return this.a.equals(schedulerConfig.a()) && this.b.equals(schedulerConfig.c());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SchedulerConfig{clock=");
        sb.append(this.a);
        sb.append(", values=");
        return b64.r(sb, this.b, "}");
    }
}
