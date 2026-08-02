package xsna;

import com.vk.instantjobs.InstantJob;

/* compiled from: InstantJobInfo.kt */
/* loaded from: classes2.dex */
public final class w6x {
    public final int a;
    public final String b;
    public final long c;
    public final Throwable d;
    public final InstantJob e;

    public w6x(int i, String str, long j, Throwable th, InstantJob instantJob) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = th;
        this.e = instantJob;
    }

    public final Throwable a() {
        return this.d;
    }

    public final int b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final InstantJob d() {
        return this.e;
    }

    public final long e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6x)) {
            return false;
        }
        w6x w6xVar = (w6x) obj;
        return this.a == w6xVar.a && epx.f(this.b, w6xVar.b) && this.c == w6xVar.c && epx.f(this.d, w6xVar.d) && epx.f(this.e, w6xVar.e);
    }

    public final int hashCode() {
        int a = bh10.a(urd0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        Throwable th = this.d;
        return this.e.hashCode() + ((a + (th == null ? 0 : th.hashCode())) * 31);
    }

    public final String toString() {
        return "InstantJobInfo(id=" + this.a + ", instanceId=" + this.b + ", submitTime=" + this.c + ", cause=" + this.d + ", job=" + this.e + ')';
    }
}
