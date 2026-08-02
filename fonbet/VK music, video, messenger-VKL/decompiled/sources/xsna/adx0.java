package xsna;

import java.util.Collection;
import java.util.List;

/* compiled from: WatchdogTask.kt */
/* loaded from: classes17.dex */
public final class adx0 {
    public final String a;
    public final long b;
    public final long c;
    public final Thread d;
    public final List<StackTraceElement> e;

    public adx0(String str, long j, long j2, Thread thread, List<StackTraceElement> list) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = thread;
        this.e = list;
    }

    public static adx0 a(adx0 adx0Var, long j, Thread thread, int i) {
        String str = adx0Var.a;
        long j2 = adx0Var.b;
        if ((i & 4) != 0) {
            j = adx0Var.c;
        }
        long j3 = j;
        if ((i & 8) != 0) {
            thread = adx0Var.d;
        }
        return new adx0(str, j2, j3, thread, adx0Var.e);
    }

    public static List b(Collection collection) {
        return rli0.A(rli0.l(rli0.l(rli0.l(rli0.l(rli0.l(rli0.l(rli0.l(rli0.l(new i5g(collection), new wvw0(2)), new m0m0(13)), new j6e0(25)), new t9o0(10)), new lcq0(11)), new pmp0(10)), new wep0(11)), new hxm0(15)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adx0)) {
            return false;
        }
        adx0 adx0Var = (adx0) obj;
        return epx.f(this.a, adx0Var.a) && this.b == adx0Var.b && this.c == adx0Var.c && epx.f(this.d, adx0Var.d) && epx.f(this.e, adx0Var.e);
    }

    public final int hashCode() {
        int a = bh10.a(bh10.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Thread thread = this.d;
        return this.e.hashCode() + ((a + (thread == null ? 0 : thread.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WatchdogTask(submitThread=");
        sb.append(this.a);
        sb.append(", submitTime=");
        sb.append(this.b);
        sb.append(", startTime=");
        sb.append(this.c);
        sb.append(", runningThread=");
        sb.append(this.d);
        sb.append(", stacktrace=");
        return ms9.a(')', sb, this.e);
    }
}
