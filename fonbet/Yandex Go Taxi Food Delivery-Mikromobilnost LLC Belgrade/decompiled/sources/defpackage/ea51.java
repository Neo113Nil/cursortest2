package defpackage;

import androidx.work.BackoffPolicy;
import androidx.work.WorkInfo$State;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public final class ea51 {
    public final String a;
    public final WorkInfo$State b;
    public final ong c;
    public final long d;
    public final long e;
    public final long f;
    public final k8e g;
    public final int h;
    public final BackoffPolicy i;
    public final long j;
    public final long k;
    public final int l;
    public final int m;
    public final long n;
    public final int o;
    public final List p;
    public final List q;

    public ea51(String str, WorkInfo$State workInfo$State, ong ongVar, long j, long j2, long j3, k8e k8eVar, int i, BackoffPolicy backoffPolicy, long j4, long j5, int i2, int i3, long j6, int i4, List list, List list2) {
        this.a = str;
        this.b = workInfo$State;
        this.c = ongVar;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = k8eVar;
        this.h = i;
        this.i = backoffPolicy;
        this.j = j4;
        this.k = j5;
        this.l = i2;
        this.m = i3;
        this.n = j6;
        this.o = i4;
        this.p = list;
        this.q = list2;
    }

    public final p951 a() {
        int i;
        long j;
        long j2;
        List list = this.q;
        ong ongVar = !list.isEmpty() ? (ong) list.get(0) : ong.b;
        UUID fromString = UUID.fromString(this.a);
        HashSet hashSet = new HashSet(this.p);
        long j3 = this.e;
        o951 o951Var = j3 != 0 ? new o951(j3, this.f) : null;
        WorkInfo$State workInfo$State = WorkInfo$State.ENQUEUED;
        int i2 = this.h;
        long j4 = this.d;
        WorkInfo$State workInfo$State2 = this.b;
        if (workInfo$State2 == workInfo$State) {
            w511 w511Var = fa51.z;
            j = j4;
            j2 = gwk0.k(workInfo$State2 == workInfo$State && i2 > 0, i2, this.i, this.j, this.k, this.l, j3 != 0, j, this.f, j3, this.n);
            i = i2;
        } else {
            i = i2;
            j = j4;
            j2 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        }
        return new p951(fromString, this.b, hashSet, this.c, ongVar, i, this.m, this.g, j, o951Var, j2, this.o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea51)) {
            return false;
        }
        ea51 ea51Var = (ea51) obj;
        return jl40.l(this.a, ea51Var.a) && this.b == ea51Var.b && jl40.l(this.c, ea51Var.c) && this.d == ea51Var.d && this.e == ea51Var.e && this.f == ea51Var.f && this.g.equals(ea51Var.g) && this.h == ea51Var.h && this.i == ea51Var.i && this.j == ea51Var.j && this.k == ea51Var.k && this.l == ea51Var.l && this.m == ea51Var.m && this.n == ea51Var.n && this.o == ea51Var.o && this.p.equals(ea51Var.p) && this.q.equals(ea51Var.q);
    }

    public final int hashCode() {
        return this.q.hashCode() + unr0.c(oyr.b(this.o, qv10.c(oyr.b(this.m, oyr.b(this.l, qv10.c(qv10.c((this.i.hashCode() + oyr.b(this.h, (this.g.hashCode() + qv10.c(qv10.c(qv10.c((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31, 31)) * 31, 31, this.j), 31, this.k), 31), 31), 31, this.n), 31), 31, this.p);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkInfoPojo(id=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", output=");
        sb.append(this.c);
        sb.append(", initialDelay=");
        sb.append(this.d);
        sb.append(", intervalDuration=");
        sb.append(this.e);
        sb.append(", flexDuration=");
        sb.append(this.f);
        sb.append(", constraints=");
        sb.append(this.g);
        sb.append(", runAttemptCount=");
        sb.append(this.h);
        sb.append(", backoffPolicy=");
        sb.append(this.i);
        sb.append(", backoffDelayDuration=");
        sb.append(this.j);
        sb.append(", lastEnqueueTime=");
        sb.append(this.k);
        sb.append(", periodCount=");
        sb.append(this.l);
        sb.append(", generation=");
        sb.append(this.m);
        sb.append(", nextScheduleTimeOverride=");
        sb.append(this.n);
        sb.append(", stopReason=");
        sb.append(this.o);
        sb.append(", tags=");
        sb.append(this.p);
        sb.append(", progress=");
        return unr0.t(sb, this.q, ')');
    }
}
