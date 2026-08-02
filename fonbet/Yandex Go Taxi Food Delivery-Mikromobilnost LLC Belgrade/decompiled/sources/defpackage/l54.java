package defpackage;

import defpackage.c3f;

/* loaded from: classes.dex */
public final class l54 extends c3f.e.d.c {
    public final Double a;
    public final int b;
    public final boolean c;
    public final int d;
    public final long e;
    public final long f;

    public l54(Double d, int i, boolean z, int i2, long j, long j2) {
        this.a = d;
        this.b = i;
        this.c = z;
        this.d = i2;
        this.e = j;
        this.f = j2;
    }

    @Override // c3f.e.d.c
    public final Double a() {
        return this.a;
    }

    @Override // c3f.e.d.c
    public final int b() {
        return this.b;
    }

    @Override // c3f.e.d.c
    public final long c() {
        return this.f;
    }

    @Override // c3f.e.d.c
    public final int d() {
        return this.d;
    }

    @Override // c3f.e.d.c
    public final long e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c3f.e.d.c)) {
            return false;
        }
        c3f.e.d.c cVar = (c3f.e.d.c) obj;
        Double d = this.a;
        if (d == null) {
            if (cVar.a() != null) {
                return false;
            }
        } else if (!d.equals(cVar.a())) {
            return false;
        }
        return this.b == cVar.b() && this.c == cVar.f() && this.d == cVar.d() && this.e == cVar.e() && this.f == cVar.c();
    }

    @Override // c3f.e.d.c
    public final boolean f() {
        return this.c;
    }

    public final int hashCode() {
        Double d = this.a;
        int hashCode = ((((((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ this.d) * 1000003;
        long j = this.e;
        long j2 = this.f;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{batteryLevel=");
        sb.append(this.a);
        sb.append(", batteryVelocity=");
        sb.append(this.b);
        sb.append(", proximityOn=");
        sb.append(this.c);
        sb.append(", orientation=");
        sb.append(this.d);
        sb.append(", ramUsed=");
        sb.append(this.e);
        sb.append(", diskUsed=");
        return oyr.n(this.f, "}", sb);
    }
}
