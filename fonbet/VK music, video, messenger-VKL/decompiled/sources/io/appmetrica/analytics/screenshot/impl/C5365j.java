package io.appmetrica.analytics.screenshot.impl;

import defpackage.q0;

/* renamed from: io.appmetrica.analytics.screenshot.impl.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5365j {
    public final boolean a;

    public C5365j(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5365j.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return this.a == ((C5365j) obj).a;
        }
        throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideApiCaptorConfig");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return q0.a(new StringBuilder("ClientSideApiCaptorConfig(enabled="), this.a, ')');
    }

    public C5365j(C5380z c5380z) {
        this(c5380z.a());
    }
}
