package defpackage;

import androidx.work.WorkInfo$State;
import java.util.HashSet;
import java.util.UUID;

/* loaded from: classes10.dex */
public final class p951 {
    public final UUID a;
    public final WorkInfo$State b;
    public final HashSet c;
    public final ong d;
    public final ong e;
    public final int f;
    public final int g;
    public final k8e h;
    public final long i;
    public final o951 j;
    public final long k;
    public final int l;

    public p951(UUID uuid, WorkInfo$State workInfo$State, HashSet hashSet, ong ongVar, ong ongVar2, int i, int i2, k8e k8eVar, long j, o951 o951Var, long j2, int i3) {
        this.a = uuid;
        this.b = workInfo$State;
        this.c = hashSet;
        this.d = ongVar;
        this.e = ongVar2;
        this.f = i;
        this.g = i2;
        this.h = k8eVar;
        this.i = j;
        this.j = o951Var;
        this.k = j2;
        this.l = i3;
    }

    public final WorkInfo$State a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p951.class.equals(obj.getClass())) {
            return false;
        }
        p951 p951Var = (p951) obj;
        if (this.f == p951Var.f && this.g == p951Var.g && this.a.equals(p951Var.a) && this.b == p951Var.b && jl40.l(this.d, p951Var.d) && this.h.equals(p951Var.h) && this.i == p951Var.i && jl40.l(this.j, p951Var.j) && this.k == p951Var.k && this.l == p951Var.l && this.c.equals(p951Var.c)) {
            return jl40.l(this.e, p951Var.e);
        }
        return false;
    }

    public final int hashCode() {
        int c = qv10.c((this.h.hashCode() + ((((((this.e.hashCode() + ((this.c.hashCode() + ((this.d.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f) * 31) + this.g) * 31)) * 31, 31, this.i);
        o951 o951Var = this.j;
        return Integer.hashCode(this.l) + qv10.c((c + (o951Var != null ? o951Var.hashCode() : 0)) * 31, 31, this.k);
    }

    public final String toString() {
        return "WorkInfo{id='" + this.a + "', state=" + this.b + ", outputData=" + this.d + ", tags=" + this.c + ", progress=" + this.e + ", runAttemptCount=" + this.f + ", generation=" + this.g + ", constraints=" + this.h + ", initialDelayMillis=" + this.i + ", periodicityInfo=" + this.j + ", nextScheduleTimeMillis=" + this.k + "}, stopReason=" + this.l;
    }
}
