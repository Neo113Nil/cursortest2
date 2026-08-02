package com.yandex.passport.internal.config;

import defpackage.b64;
import defpackage.qv10;

/* loaded from: classes15.dex */
public final class g {
    public final String a;
    public final long b;

    public g(long j) {
        this.a = qv10.j(j, "location_backend_host_");
        this.b = j;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.b == ((g) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return b64.o(new StringBuilder("Backend(locationId="), this.b, ')');
    }
}
