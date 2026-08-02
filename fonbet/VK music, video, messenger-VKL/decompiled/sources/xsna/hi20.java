package xsna;

import java.time.Instant;

/* compiled from: Metadata.kt */
/* loaded from: classes12.dex */
public final class hi20 {
    public final int a;
    public final String b;
    public final luk c;
    public final Instant d;
    public final String e;
    public final long f;
    public final u5m g;

    public hi20(int i, String str, luk lukVar, Instant instant, String str2, long j, u5m u5mVar) {
        this.a = i;
        this.b = str;
        this.c = lukVar;
        this.d = instant;
        this.e = str2;
        this.f = j;
        this.g = u5mVar;
    }

    public final String a() {
        return this.e;
    }

    public final luk b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final int d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi20)) {
            return false;
        }
        hi20 hi20Var = (hi20) obj;
        return epx.f(this.b, hi20Var.b) && epx.f(this.c, hi20Var.c) && epx.f(this.d, hi20Var.d) && epx.f(this.e, hi20Var.e) && this.f == hi20Var.f && epx.f(this.g, hi20Var.g) && this.a == hi20Var.a;
    }

    public final int hashCode() {
        int c = w11.c(this.d, urd0.a(this.b.hashCode() * 31, 31, this.c.a), 31);
        String str = this.e;
        int a = bh10.a((c + (str != null ? str.hashCode() : 0)) * 31, 31, this.f);
        u5m u5mVar = this.g;
        return Integer.hashCode(this.a) + ((a + (u5mVar != null ? u5mVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(id='");
        sb.append(this.b);
        sb.append("', dataOrigin=");
        sb.append(this.c);
        sb.append(", lastModifiedTime=");
        sb.append(this.d);
        sb.append(", clientRecordId=");
        sb.append(this.e);
        sb.append(", clientRecordVersion=");
        sb.append(this.f);
        sb.append(", device=");
        sb.append(this.g);
        sb.append(", recordingMethod=");
        return vu5.b(sb, this.a, ')');
    }
}
