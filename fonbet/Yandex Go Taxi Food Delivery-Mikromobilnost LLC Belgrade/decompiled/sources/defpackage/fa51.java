package defpackage;

import androidx.work.BackoffPolicy;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.OverwritingInputMerger;
import androidx.work.WorkInfo$State;

/* loaded from: classes.dex */
public final class fa51 {
    public static final w511 z;
    public final String a;
    public WorkInfo$State b;
    public final String c;
    public final String d;
    public ong e;
    public final ong f;
    public long g;
    public long h;
    public long i;
    public k8e j;
    public final int k;
    public BackoffPolicy l;
    public long m;
    public long n;
    public final long o;
    public final long p;
    public boolean q;
    public OutOfQuotaPolicy r;
    public final int s;
    public final int t;
    public long u;
    public int v;
    public final int w;
    public String x;
    public final Boolean y;

    static {
        hgz.o("WorkSpec");
        z = new w511(13);
    }

    public /* synthetic */ fa51(String str, WorkInfo$State workInfo$State, String str2, String str3, ong ongVar, ong ongVar2, long j, long j2, long j3, k8e k8eVar, int i, BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z2, OutOfQuotaPolicy outOfQuotaPolicy, int i2, long j8, int i3, int i4, String str4, Boolean bool, int i5) {
        this(str, (i5 & 2) != 0 ? WorkInfo$State.ENQUEUED : workInfo$State, str2, (i5 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i5 & 16) != 0 ? ong.b : ongVar, (i5 & 32) != 0 ? ong.b : ongVar2, (i5 & 64) != 0 ? 0L : j, (i5 & 128) != 0 ? 0L : j2, (i5 & 256) != 0 ? 0L : j3, (i5 & 512) != 0 ? k8e.j : k8eVar, (i5 & 1024) != 0 ? 0 : i, (i5 & 2048) != 0 ? BackoffPolicy.EXPONENTIAL : backoffPolicy, (i5 & 4096) != 0 ? 30000L : j4, (i5 & 8192) != 0 ? -1L : j5, (i5 & 16384) == 0 ? j6 : 0L, (32768 & i5) != 0 ? -1L : j7, (65536 & i5) != 0 ? false : z2, (131072 & i5) != 0 ? OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST : outOfQuotaPolicy, (262144 & i5) != 0 ? 0 : i2, 0, (1048576 & i5) != 0 ? Long.MAX_VALUE : j8, (2097152 & i5) != 0 ? 0 : i3, (4194304 & i5) != 0 ? -256 : i4, (8388608 & i5) != 0 ? null : str4, (i5 & 16777216) != 0 ? Boolean.FALSE : bool);
    }

    public static fa51 b(fa51 fa51Var, String str, WorkInfo$State workInfo$State, ong ongVar, int i, long j, int i2, int i3, long j2, int i4, int i5) {
        String str2 = (i5 & 1) != 0 ? fa51Var.a : str;
        WorkInfo$State workInfo$State2 = (i5 & 2) != 0 ? fa51Var.b : workInfo$State;
        String str3 = (i5 & 4) != 0 ? fa51Var.c : "androidx.work.multiprocess.RemoteListenableDelegatingWorker";
        String str4 = fa51Var.d;
        ong ongVar2 = (i5 & 16) != 0 ? fa51Var.e : ongVar;
        ong ongVar3 = fa51Var.f;
        long j3 = fa51Var.g;
        long j4 = fa51Var.h;
        long j5 = fa51Var.i;
        k8e k8eVar = fa51Var.j;
        int i6 = (i5 & 1024) != 0 ? fa51Var.k : i;
        BackoffPolicy backoffPolicy = fa51Var.l;
        long j6 = fa51Var.m;
        long j7 = (i5 & 8192) != 0 ? fa51Var.n : j;
        long j8 = fa51Var.o;
        long j9 = fa51Var.p;
        boolean z2 = fa51Var.q;
        OutOfQuotaPolicy outOfQuotaPolicy = fa51Var.r;
        int i7 = (i5 & 262144) != 0 ? fa51Var.s : i2;
        int i8 = (i5 & 524288) != 0 ? fa51Var.t : i3;
        long j10 = (i5 & 1048576) != 0 ? fa51Var.u : j2;
        int i9 = (i5 & 2097152) != 0 ? fa51Var.v : i4;
        int i10 = fa51Var.w;
        String str5 = fa51Var.x;
        Boolean bool = fa51Var.y;
        fa51Var.getClass();
        return new fa51(str2, workInfo$State2, str3, str4, ongVar2, ongVar3, j3, j4, j5, k8eVar, i6, backoffPolicy, j6, j7, j8, j9, z2, outOfQuotaPolicy, i7, i8, j10, i9, i10, str5, bool);
    }

    public final long a() {
        return gwk0.k(this.b == WorkInfo$State.ENQUEUED && this.k > 0, this.k, this.l, this.m, this.n, this.s, c(), this.g, this.i, this.h, this.u);
    }

    public final boolean c() {
        return this.h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa51)) {
            return false;
        }
        fa51 fa51Var = (fa51) obj;
        return jl40.l(this.a, fa51Var.a) && this.b == fa51Var.b && jl40.l(this.c, fa51Var.c) && jl40.l(this.d, fa51Var.d) && jl40.l(this.e, fa51Var.e) && jl40.l(this.f, fa51Var.f) && this.g == fa51Var.g && this.h == fa51Var.h && this.i == fa51Var.i && jl40.l(this.j, fa51Var.j) && this.k == fa51Var.k && this.l == fa51Var.l && this.m == fa51Var.m && this.n == fa51Var.n && this.o == fa51Var.o && this.p == fa51Var.p && this.q == fa51Var.q && this.r == fa51Var.r && this.s == fa51Var.s && this.t == fa51Var.t && this.u == fa51Var.u && this.v == fa51Var.v && this.w == fa51Var.w && jl40.l(this.x, fa51Var.x) && jl40.l(this.y, fa51Var.y);
    }

    public final int hashCode() {
        int b = oyr.b(this.w, oyr.b(this.v, qv10.c(oyr.b(this.t, oyr.b(this.s, (this.r.hashCode() + unr0.e(qv10.c(qv10.c(qv10.c(qv10.c((this.l.hashCode() + oyr.b(this.k, (this.j.hashCode() + qv10.c(qv10.c(qv10.c((this.f.hashCode() + ((this.e.hashCode() + unr0.b(unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i)) * 31, 31)) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q)) * 31, 31), 31), 31, this.u), 31), 31);
        String str = this.x;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.y;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return b64.p(new StringBuilder("{WorkSpec: "), this.a, '}');
    }

    public fa51(String str, WorkInfo$State workInfo$State, String str2, String str3, ong ongVar, ong ongVar2, long j, long j2, long j3, k8e k8eVar, int i, BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z2, OutOfQuotaPolicy outOfQuotaPolicy, int i2, int i3, long j8, int i4, int i5, String str4, Boolean bool) {
        this.a = str;
        this.b = workInfo$State;
        this.c = str2;
        this.d = str3;
        this.e = ongVar;
        this.f = ongVar2;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = k8eVar;
        this.k = i;
        this.l = backoffPolicy;
        this.m = j4;
        this.n = j5;
        this.o = j6;
        this.p = j7;
        this.q = z2;
        this.r = outOfQuotaPolicy;
        this.s = i2;
        this.t = i3;
        this.u = j8;
        this.v = i4;
        this.w = i5;
        this.x = str4;
        this.y = bool;
    }
}
