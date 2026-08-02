package xsna;

import androidx.work.BackoffPolicy;
import androidx.work.Data;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.OverwritingInputMerger;
import androidx.work.WorkInfo;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;

/* compiled from: WorkSpec.kt */
/* loaded from: classes.dex */
public final class fxx0 {
    public static final /* synthetic */ int y = 0;
    public final String a;
    public WorkInfo.State b;
    public final String c;
    public final String d;
    public Data e;
    public final Data f;
    public long g;
    public long h;
    public long i;
    public p6j j;
    public final int k;
    public BackoffPolicy l;
    public long m;
    public long n;
    public final long o;
    public final long p;
    public boolean q;
    public final OutOfQuotaPolicy r;
    public final int s;
    public final int t;
    public long u;
    public int v;
    public final int w;
    public String x;

    /* compiled from: WorkSpec.kt */
    public static final class a {
        public static long a(boolean z, int i, BackoffPolicy backoffPolicy, long j, long j2, int i2, boolean z2, long j3, long j4, long j5, long j6) {
            if (j6 != Long.MAX_VALUE && z2) {
                if (i2 != 0) {
                    long j7 = j2 + 900000;
                    if (j6 < j7) {
                        return j7;
                    }
                }
                return j6;
            }
            if (z) {
                long scalb = backoffPolicy == BackoffPolicy.LINEAR ? j * i : (long) Math.scalb(j, i - 1);
                if (scalb > 18000000) {
                    scalb = 18000000;
                }
                return j2 + scalb;
            }
            if (z2) {
                long j8 = i2 == 0 ? j2 + j3 : j2 + j5;
                return (j4 == j5 || i2 != 0) ? j8 : (j5 - j4) + j8;
            }
            if (j2 == -1) {
                return Long.MAX_VALUE;
            }
            return j2 + j3;
        }
    }

    /* compiled from: WorkSpec.kt */
    public static final class b {
        public String a;
        public WorkInfo.State b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "IdAndState(id=" + this.a + ", state=" + this.b + ')';
        }
    }

    /* compiled from: WorkSpec.kt */
    public static final class c {
        public final String a;
        public final WorkInfo.State b;
        public final Data c;
        public final long d;
        public final long e;
        public final long f;
        public final p6j g;
        public final int h;
        public final BackoffPolicy i;
        public final long j;
        public final long k;
        public final int l;
        public final int m;
        public final long n;
        public final int o;
        public final List<String> p;
        public final List<Data> q;

        public c(String str, WorkInfo.State state, Data data, long j, long j2, long j3, p6j p6jVar, int i, BackoffPolicy backoffPolicy, long j4, long j5, int i2, int i3, long j6, int i4, ArrayList arrayList, ArrayList arrayList2) {
            this.a = str;
            this.b = state;
            this.c = data;
            this.d = j;
            this.e = j2;
            this.f = j3;
            this.g = p6jVar;
            this.h = i;
            this.i = backoffPolicy;
            this.j = j4;
            this.k = j5;
            this.l = i2;
            this.m = i3;
            this.n = j6;
            this.o = i4;
            this.p = arrayList;
            this.q = arrayList2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b && epx.f(this.c, cVar.c) && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f && epx.f(this.g, cVar.g) && this.h == cVar.h && this.i == cVar.i && this.j == cVar.j && this.k == cVar.k && this.l == cVar.l && this.m == cVar.m && this.n == cVar.n && this.o == cVar.o && epx.f(this.p, cVar.p) && epx.f(this.q, cVar.q);
        }

        public final int hashCode() {
            return this.q.hashCode() + fw3.a(shy.a(this.o, bh10.a(shy.a(this.m, shy.a(this.l, bh10.a(bh10.a((this.i.hashCode() + shy.a(this.h, (this.g.hashCode() + bh10.a(bh10.a(bh10.a((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31, 31)) * 31, 31, this.j), 31, this.k), 31), 31), 31, this.n), 31), 31, this.p);
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
            return ms9.a(')', sb, this.q);
        }
    }

    static {
        m100.d("WorkSpec");
    }

    public fxx0(String str, WorkInfo.State state, String str2, String str3, Data data, Data data2, long j, long j2, long j3, p6j p6jVar, int i, BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z, OutOfQuotaPolicy outOfQuotaPolicy, int i2, int i3, long j8, int i4, int i5, String str4) {
        this.a = str;
        this.b = state;
        this.c = str2;
        this.d = str3;
        this.e = data;
        this.f = data2;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = p6jVar;
        this.k = i;
        this.l = backoffPolicy;
        this.m = j4;
        this.n = j5;
        this.o = j6;
        this.p = j7;
        this.q = z;
        this.r = outOfQuotaPolicy;
        this.s = i2;
        this.t = i3;
        this.u = j8;
        this.v = i4;
        this.w = i5;
        this.x = str4;
    }

    public static fxx0 b(fxx0 fxx0Var, String str, WorkInfo.State state, String str2, Data data, int i, long j, int i2, int i3, long j2, int i4, int i5) {
        String str3 = (i5 & 1) != 0 ? fxx0Var.a : str;
        WorkInfo.State state2 = (i5 & 2) != 0 ? fxx0Var.b : state;
        String str4 = (i5 & 4) != 0 ? fxx0Var.c : str2;
        String str5 = fxx0Var.d;
        Data data2 = (i5 & 16) != 0 ? fxx0Var.e : data;
        Data data3 = fxx0Var.f;
        long j3 = fxx0Var.g;
        long j4 = fxx0Var.h;
        long j5 = fxx0Var.i;
        p6j p6jVar = fxx0Var.j;
        int i6 = (i5 & 1024) != 0 ? fxx0Var.k : i;
        BackoffPolicy backoffPolicy = fxx0Var.l;
        long j6 = fxx0Var.m;
        long j7 = (i5 & 8192) != 0 ? fxx0Var.n : j;
        long j8 = fxx0Var.o;
        long j9 = fxx0Var.p;
        boolean z = fxx0Var.q;
        OutOfQuotaPolicy outOfQuotaPolicy = fxx0Var.r;
        int i7 = (i5 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? fxx0Var.s : i2;
        int i8 = (i5 & 524288) != 0 ? fxx0Var.t : i3;
        long j10 = (i5 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? fxx0Var.u : j2;
        int i9 = (i5 & 2097152) != 0 ? fxx0Var.v : i4;
        int i10 = fxx0Var.w;
        String str6 = fxx0Var.x;
        fxx0Var.getClass();
        return new fxx0(str3, state2, str4, str5, data2, data3, j3, j4, j5, p6jVar, i6, backoffPolicy, j6, j7, j8, j9, z, outOfQuotaPolicy, i7, i8, j10, i9, i10, str6);
    }

    public final long a() {
        return a.a(this.b == WorkInfo.State.ENQUEUED && this.k > 0, this.k, this.l, this.m, this.n, this.s, d(), this.g, this.i, this.h, this.u);
    }

    public final boolean c() {
        return !epx.f(p6j.j, this.j);
    }

    public final boolean d() {
        return this.h != 0;
    }

    public final void e(long j) {
        if (j < 900000) {
            m100.c().getClass();
        }
        long j2 = j < 900000 ? 900000L : j;
        long j3 = j < 900000 ? 900000L : j;
        if (j2 < 900000) {
            m100.c().getClass();
        }
        this.h = j2 >= 900000 ? j2 : 900000L;
        if (j3 < 300000) {
            m100.c().getClass();
        }
        if (j3 > this.h) {
            m100.c().getClass();
        }
        this.i = swe0.i(j3, 300000L, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxx0)) {
            return false;
        }
        fxx0 fxx0Var = (fxx0) obj;
        return epx.f(this.a, fxx0Var.a) && this.b == fxx0Var.b && epx.f(this.c, fxx0Var.c) && epx.f(this.d, fxx0Var.d) && epx.f(this.e, fxx0Var.e) && epx.f(this.f, fxx0Var.f) && this.g == fxx0Var.g && this.h == fxx0Var.h && this.i == fxx0Var.i && epx.f(this.j, fxx0Var.j) && this.k == fxx0Var.k && this.l == fxx0Var.l && this.m == fxx0Var.m && this.n == fxx0Var.n && this.o == fxx0Var.o && this.p == fxx0Var.p && this.q == fxx0Var.q && this.r == fxx0Var.r && this.s == fxx0Var.s && this.t == fxx0Var.t && this.u == fxx0Var.u && this.v == fxx0Var.v && this.w == fxx0Var.w && epx.f(this.x, fxx0Var.x);
    }

    public final int hashCode() {
        int a2 = shy.a(this.w, shy.a(this.v, bh10.a(shy.a(this.t, shy.a(this.s, (this.r.hashCode() + qoy.b(bh10.a(bh10.a(bh10.a(bh10.a((this.l.hashCode() + shy.a(this.k, (this.j.hashCode() + bh10.a(bh10.a(bh10.a((this.f.hashCode() + ((this.e.hashCode() + urd0.a(urd0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i)) * 31, 31)) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q)) * 31, 31), 31), 31, this.u), 31), 31);
        String str = this.x;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ho8.a(new StringBuilder("{WorkSpec: "), this.a, '}');
    }

    public /* synthetic */ fxx0(String str, WorkInfo.State state, String str2, String str3, Data data, Data data2, long j, long j2, long j3, p6j p6jVar, int i, BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z, OutOfQuotaPolicy outOfQuotaPolicy, int i2, long j8, int i3, int i4, String str4, int i5) {
        this(str, (i5 & 2) != 0 ? WorkInfo.State.ENQUEUED : state, str2, (i5 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i5 & 16) != 0 ? Data.b : data, (i5 & 32) != 0 ? Data.b : data2, (i5 & 64) != 0 ? 0L : j, (i5 & 128) != 0 ? 0L : j2, (i5 & 256) != 0 ? 0L : j3, (i5 & 512) != 0 ? p6j.j : p6jVar, (i5 & 1024) != 0 ? 0 : i, (i5 & 2048) != 0 ? BackoffPolicy.EXPONENTIAL : backoffPolicy, (i5 & 4096) != 0 ? ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS : j4, (i5 & 8192) != 0 ? -1L : j5, (i5 & 16384) == 0 ? j6 : 0L, (32768 & i5) != 0 ? -1L : j7, (65536 & i5) != 0 ? false : z, (131072 & i5) != 0 ? OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST : outOfQuotaPolicy, (262144 & i5) != 0 ? 0 : i2, 0, (1048576 & i5) != 0 ? Long.MAX_VALUE : j8, (2097152 & i5) != 0 ? 0 : i3, (4194304 & i5) != 0 ? -256 : i4, (i5 & 8388608) != 0 ? null : str4);
    }
}
