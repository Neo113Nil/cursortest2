package io.appmetrica.analytics.idsync.impl;

import xsna.bh10;
import xsna.epx;

/* loaded from: classes8.dex */
public final class E {
    public final String a;
    public final long b;
    public final int c;

    public E(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e = (E) obj;
        return epx.f(this.a, e.a) && this.b == e.b && this.c == e.c;
    }

    public final int hashCode() {
        return A.a(this.c) + bh10.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "RequestState(type=" + this.a + ", lastAttempt=" + this.b + ", lastAttemptResult=" + z.b(this.c) + ')';
    }
}
