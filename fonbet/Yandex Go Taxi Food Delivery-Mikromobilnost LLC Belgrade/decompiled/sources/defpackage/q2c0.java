package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class q2c0 {
    public final boolean a;
    public final long b;
    public final long c;
    public final int d;
    public final String e;
    public final long f;
    public final long g;
    public final int h;

    public q2c0(int i) {
        long j = (i & 2) != 0 ? 2000L : 10000L;
        long j2 = (i & 32) != 0 ? 60000L : 15000L;
        long j3 = (i & 64) == 0 ? 1000L : 2000L;
        this.a = true;
        this.b = j;
        this.c = 10000L;
        this.d = Integer.MAX_VALUE;
        this.e = "https://scbh.yandex.net/generate_204";
        this.f = j2;
        this.g = j3;
        this.h = 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2c0)) {
            return false;
        }
        q2c0 q2c0Var = (q2c0) obj;
        return this.a == q2c0Var.a && this.b == q2c0Var.b && this.c == q2c0Var.c && this.d == q2c0Var.d && jl40.l(this.e, q2c0Var.e) && this.f == q2c0Var.f && this.g == q2c0Var.g && this.h == q2c0Var.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + qv10.c(qv10.c(unr0.b(oyr.b(this.d, qv10.c(qv10.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PingNetworkMonitorConfig(enabled=");
        sb.append(this.a);
        sb.append(", pingInterval=");
        sb.append(this.b);
        x4e.A(this.c, ", pingTimeout=", ", pingCount=", sb);
        smw0.t(this.d, ", pingUrl=", this.e, ", maxPingInterval=", sb);
        sb.append(this.f);
        x4e.A(this.g, ", minPingInterval=", ", backoffFactor=", sb);
        return oyr.m(this.h, Extension.C_BRAKE, sb);
    }

    public q2c0() {
        this(255);
    }
}
