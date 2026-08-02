package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class c9z {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final boolean e;

    public c9z(long j, long j2, long j3, boolean z, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = z2;
    }

    public final long a() {
        return this.c;
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9z)) {
            return false;
        }
        c9z c9zVar = (c9z) obj;
        return this.a == c9zVar.a && this.b == c9zVar.b && this.c == c9zVar.c && this.d == c9zVar.d && this.e == c9zVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + unr0.e(qv10.c(qv10.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder w = unr0.w(this.a, "LocationInfoPollingData(pollingTimeoutMillis=", ", pollingIntervalMillis=");
        w.append(this.b);
        x4e.A(this.c, ", maxCountCoordinates=", ", requestPollingFinalSuggest=", w);
        return smw0.k(", restartRequestPollingFinalSuggestWhenExpandApp=", Extension.C_BRAKE, w, this.d, this.e);
    }
}
