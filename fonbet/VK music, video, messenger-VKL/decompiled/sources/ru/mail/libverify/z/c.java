package ru.mail.libverify.z;

import xsna.epx;

/* loaded from: classes9.dex */
public final class c {
    private final boolean a;
    private final Long b;

    public c(boolean z, Long l) {
        this.a = z;
        this.b = l;
    }

    public final long a() {
        Long l = this.b;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final boolean b() {
        return this.b != null;
    }

    public final boolean c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && epx.f(this.b, cVar.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        Long l = this.b;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "";
    }
}
