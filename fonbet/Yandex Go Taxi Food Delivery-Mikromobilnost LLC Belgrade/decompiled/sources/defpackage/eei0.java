package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class eei0 {
    public final boolean a;
    public final long b;
    public final int c;
    public final boolean d;
    public final float e;
    public final long f;
    public final String g;

    public eei0(boolean z, long j, int i, boolean z2, float f, long j2, String str) {
        this.a = z;
        this.b = j;
        this.c = i;
        this.d = z2;
        this.e = f;
        this.f = j2;
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eei0)) {
            return false;
        }
        eei0 eei0Var = (eei0) obj;
        return this.a == eei0Var.a && e3n.d(this.b, eei0Var.b) && this.c == eei0Var.c && this.d == eei0Var.d && Float.compare(this.e, eei0Var.e) == 0 && e3n.d(this.f, eei0Var.f) && jl40.l(this.g, eei0Var.g);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        o430 o430Var = e3n.b;
        return this.g.hashCode() + qv10.c(g8e.c(this.e, unr0.e(oyr.b(this.c, qv10.c(hashCode, 31, this.b), 31), 31, this.d), 31), 31, this.f);
    }

    public final String toString() {
        String p = e3n.p(this.b);
        String p2 = e3n.p(this.f);
        StringBuilder v = ly3.v("RealtimeAnalyticsConfig(enabled=", ", commitInterval=", p, ", maxBufferSize=", this.a);
        tse0.z(v, this.c, ", shouldDuplicateAsPlainEvents=", this.d, ", viewVisibilityThreshold=");
        v.append(this.e);
        v.append(", viewVisibilityTimeout=");
        v.append(p2);
        v.append(", appMetricaApiKey=");
        return oyr.t(v, this.g, Extension.C_BRAKE);
    }
}
