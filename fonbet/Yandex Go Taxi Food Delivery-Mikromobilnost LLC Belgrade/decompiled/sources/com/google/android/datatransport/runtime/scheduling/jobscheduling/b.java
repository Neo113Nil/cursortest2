package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import defpackage.ny61;
import java.util.Set;

/* loaded from: classes.dex */
public final class b extends SchedulerConfig.b.a {
    public Long a;
    public Long b;
    public Set c;

    public final c a() {
        String str = this.a == null ? " delta" : "";
        if (this.b == null) {
            str = str.concat(" maxAllowedDelay");
        }
        if (this.c == null) {
            str = str.concat(" flags");
        }
        if (str.isEmpty()) {
            return new c(this.a.longValue(), this.b.longValue(), this.c);
        }
        ny61.r("Missing required properties:".concat(str));
        return null;
    }
}
