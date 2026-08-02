package xsna;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import com.vk.metrics.performance.animation.motionlayout.MotionLayoutScreenType;
import com.vk.metrics.performance.scroll.ScrollScreenType;
import com.vk.stat.scheme.SchemeStat$TypeAppStarts;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;

/* compiled from: PerformanceStorage.kt */
/* loaded from: classes.dex */
public final class dx90 {
    public static final long S;
    public static final long T;
    public static final long U;
    public static final long V;
    public static final /* synthetic */ int W = 0;
    public volatile boolean J;
    public volatile boolean K;
    public volatile boolean L;
    public boolean M;
    public boolean O;
    public volatile long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public SchemeStat$TypeAppStarts.StartType t;
    public SchemeStat$TypeAppStarts.StartMethod u;
    public String v;
    public final AtomicLong w = new AtomicLong();
    public final AtomicLong x = new AtomicLong();
    public final AtomicInteger y = new AtomicInteger();
    public final AtomicLong z = new AtomicLong();
    public final AtomicInteger A = new AtomicInteger();
    public final AtomicLong B = new AtomicLong();
    public final AtomicInteger C = new AtomicInteger();
    public final AtomicLong D = new AtomicLong();
    public final AtomicLong E = new AtomicLong();
    public final AtomicLong F = new AtomicLong();
    public final AtomicInteger G = new AtomicInteger();
    public final AtomicLong H = new AtomicLong();
    public final AtomicLong I = new AtomicLong();
    public final ReentrantLock N = new ReentrantLock();
    public final ReentrantLock P = new ReentrantLock();
    public gzs<Boolean> Q = new q57(9);
    public final bpn0 R = new bpn0(new xu2(8));

    /* compiled from: PerformanceStorage.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;

        public a(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.c;
        }

        public final String c() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnrInfo(id=");
            sb.append(this.a);
            sb.append(", screenName=");
            sb.append(this.b);
            sb.append(", processImportance=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: PerformanceStorage.kt */
    public static final class b {
        public static final void a(String str) {
            int i = dx90.W;
            if (Build.VERSION.SDK_INT >= 29) {
                Trace.beginAsyncSection(str, 0);
            }
        }

        public static final void b(String str) {
            int i = dx90.W;
            if (Build.VERSION.SDK_INT >= 29) {
                Trace.endAsyncSection(str, 0);
            }
        }

        public static final String c(ScrollScreenType scrollScreenType) {
            int i = dx90.W;
            return String.format("__app_frame_freeze_time_%s__", Arrays.copyOf(new Object[]{scrollScreenType.name().toLowerCase(Locale.ROOT)}, 1));
        }

        public static final String d(ScrollScreenType scrollScreenType) {
            int i = dx90.W;
            return String.format("__app_frame_total_time_%s__", Arrays.copyOf(new Object[]{scrollScreenType.name().toLowerCase(Locale.ROOT)}, 1));
        }

        public static final String e(ScrollScreenType scrollScreenType, boolean z) {
            int i = dx90.W;
            return String.format(z ? "__app_delayed_scroll_frames_%s__" : "__app_scroll_frames_%s__", Arrays.copyOf(new Object[]{scrollScreenType.name().toLowerCase(Locale.ROOT)}, 1));
        }

        public static final String f(ScrollScreenType scrollScreenType, boolean z) {
            int i = dx90.W;
            return String.format(z ? "__app_delayed_scroll_freeze_frames_%s__" : "__app_scroll_freeze_frames_%s__", Arrays.copyOf(new Object[]{scrollScreenType.name().toLowerCase(Locale.ROOT)}, 1));
        }

        public static final String g(ScrollScreenType scrollScreenType, boolean z) {
            int i = dx90.W;
            return String.format(z ? "__app__delayed_scroll_freeze_time_%s__" : "__app_scroll_freeze_time_%s__", Arrays.copyOf(new Object[]{scrollScreenType.name().toLowerCase(Locale.ROOT)}, 1));
        }

        public static final String h(ScrollScreenType scrollScreenType, boolean z) {
            int i = dx90.W;
            return String.format(z ? "__app_delayed_scroll_time_%s__" : "__app_scroll_time_%s__", Arrays.copyOf(new Object[]{scrollScreenType.name().toLowerCase(Locale.ROOT)}, 1));
        }
    }

    /* compiled from: PerformanceStorage.kt */
    /* loaded from: classes3.dex */
    public static final class c {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final long g;

        public c(long j, String str, String str2, String str3, String str4, String str5, String str6) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = j;
        }

        public final String a() {
            return this.d;
        }

        public final String b() {
            return this.f;
        }

        public final long c() {
            return this.g;
        }

        public final String d() {
            return this.a;
        }

        public final String e() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e) && epx.f(this.f, cVar.f) && this.g == cVar.g;
        }

        public final String f() {
            return this.b;
        }

        public final String g() {
            return this.e;
        }

        public final int hashCode() {
            return Long.hashCode(this.g) + urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CrashInfo(id=");
            sb.append(this.a);
            sb.append(", stackTraceHash=");
            sb.append(this.b);
            sb.append(", screenName=");
            sb.append(this.c);
            sb.append(", className=");
            sb.append(this.d);
            sb.append(", threadName=");
            sb.append(this.e);
            sb.append(", codeOwner=");
            sb.append(this.f);
            sb.append(", codeOwnerExtractionTime=");
            return vu5.a(')', this.g, sb);
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        S = timeUnit.toMillis(2L);
        T = timeUnit.toMillis(2L);
        U = timeUnit.toMillis(30L);
        V = timeUnit.toMillis(30L);
    }

    public static void a(Context context, String str) {
        if (context.deleteFile(str)) {
            return;
        }
        String a2 = zr.a("Can't delete performance info file '", str, "'.");
        L.l("PerformanceStorage", a2);
        com.vk.metrics.eventtracking.b.a.a(new IOException(a2));
    }

    public static long b(String str) {
        long m = Preference.m(0L, "performance", str);
        Preference.C("performance", str);
        return m;
    }

    public static String c(String str) {
        String s = Preference.s("performance", str, "");
        Preference.C("performance", str);
        return s;
    }

    public static Long d(String str) {
        long b2 = b(str);
        if (b2 > 0) {
            return Long.valueOf(b2);
        }
        return null;
    }

    public static ra30 e(MotionLayoutScreenType motionLayoutScreenType) {
        long m = Preference.m(-1L, "performance", motionLayoutScreenType.l());
        int m2 = (int) Preference.m(-1L, "performance", motionLayoutScreenType.i());
        if (m == -1 || m2 == -1) {
            return null;
        }
        return new ra30(m, m2);
    }

    public static ra30 f(MotionLayoutScreenType motionLayoutScreenType) {
        long m = Preference.m(-1L, "performance", motionLayoutScreenType.k());
        int m2 = (int) Preference.m(-1L, "performance", motionLayoutScreenType.j());
        if (m == -1 || m2 == -1) {
            return null;
        }
        return new ra30(m, m2);
    }

    public static Integer g(MotionLayoutScreenType motionLayoutScreenType) {
        ra30 f;
        ra30 e = e(motionLayoutScreenType);
        if (e == null) {
            return null;
        }
        long a2 = e.a();
        if (a2 >= S && (f = f(motionLayoutScreenType)) != null) {
            return Integer.valueOf((int) ((f.a() * 100.0f) / a2));
        }
        return null;
    }

    public static Pair h(ScrollScreenType scrollScreenType) {
        long m = Preference.m(-1L, "performance", b.d(scrollScreenType));
        long m2 = Preference.m(-1L, "performance", b.c(scrollScreenType));
        if (m == -1 || m2 == -1) {
            return null;
        }
        return new Pair(Long.valueOf(m), Long.valueOf(m2));
    }

    public static Integer i(ScrollScreenType scrollScreenType) {
        Pair h = h(scrollScreenType);
        if (h == null) {
            return null;
        }
        long longValue = ((Number) h.d()).longValue();
        long longValue2 = ((Number) h.g()).longValue();
        if (longValue < U) {
            return null;
        }
        return Integer.valueOf((int) ((longValue2 * 100.0f) / longValue));
    }

    public static Pair j(ScrollScreenType scrollScreenType, boolean z) {
        long m = Preference.m(-1L, "performance", b.h(scrollScreenType, z));
        int m2 = (int) Preference.m(-1L, "performance", b.e(scrollScreenType, z));
        if (m == -1 || m2 == -1) {
            return null;
        }
        return new Pair(Long.valueOf(m), Integer.valueOf(m2));
    }

    public static Pair k(ScrollScreenType scrollScreenType, boolean z) {
        long m = Preference.m(-1L, "performance", b.g(scrollScreenType, z));
        int m2 = (int) Preference.m(-1L, "performance", b.f(scrollScreenType, z));
        if (m == -1 || m2 == -1) {
            return null;
        }
        return new Pair(Long.valueOf(m), Integer.valueOf(m2));
    }

    public static Integer l(ScrollScreenType scrollScreenType, boolean z) {
        Pair k;
        Pair j = j(scrollScreenType, z);
        if (j == null) {
            return null;
        }
        long longValue = ((Number) j.i()).longValue();
        if (longValue >= (z ? U : T) && (k = k(scrollScreenType, z)) != null) {
            return Integer.valueOf((int) ((((Number) k.i()).longValue() * 100.0f) / longValue));
        }
        return null;
    }

    public static /* synthetic */ Integer m(dx90 dx90Var, ScrollScreenType scrollScreenType) {
        dx90Var.getClass();
        return l(scrollScreenType, false);
    }

    public static void n(long j, String str) {
        long m = Preference.m(-1L, "performance", str);
        long j2 = 0;
        if (m == -1 && j != 0) {
            j2 = 1;
        }
        Preference.F(m + j + j2, "performance", str);
    }

    public static Object q(Context context, String str, izs izsVar) {
        try {
            if (!new File(context.getFilesDir(), str).exists()) {
                return null;
            }
            ObjectInputStream objectInputStream = new ObjectInputStream(context.openFileInput(str));
            try {
                Object invoke = izsVar.invoke(objectInputStream);
                objectInputStream.close();
                a(context, str);
                return invoke;
            } finally {
            }
        } catch (Exception e) {
            L.j(e, "PerformanceStorage", zr.a("Can't read performance info file '", str, "'."));
            com.vk.metrics.eventtracking.b.a.a(e);
            a(context, str);
            return null;
        }
    }

    public static void s() {
        Preference.F(0L, "performance", "__app_performance_was_anr_or_crashed__");
        Preference.F(SystemClock.elapsedRealtime(), "performance", "__app_performance_anr_or_crashed_time__");
    }

    public static void v(ScrollScreenType scrollScreenType, long j, int i, long j2, int i2, boolean z) {
        Preference.F(j, "performance", b.h(scrollScreenType, z));
        Preference.F(i, "performance", b.e(scrollScreenType, z));
        Preference.F(j2, "performance", b.g(scrollScreenType, z));
        Preference.F(i2, "performance", b.f(scrollScreenType, z));
    }

    public static void z(Context context, String str, izs izsVar) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(context.openFileOutput(str, 0));
            try {
                izsVar.invoke(objectOutputStream);
                objectOutputStream.flush();
                s3q0 s3q0Var = s3q0.a;
                objectOutputStream.close();
            } finally {
            }
        } catch (Exception e) {
            L.j(e, "PerformanceStorage", zr.a("Can't save performance info to the file '", str, "'."));
            com.vk.metrics.eventtracking.b.a.a(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0098, code lost:
    
        if (com.vk.core.apps.BuildInfo.u() == false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o() {
        boolean z;
        boolean z2 = ((this.b > 0L ? 1 : (this.b == 0L ? 0 : -1)) > 0 && (this.c > 0L ? 1 : (this.c == 0L ? 0 : -1)) > 0 && (this.e > 0L ? 1 : (this.e == 0L ? 0 : -1)) > 0 && (this.g > 0L ? 1 : (this.g == 0L ? 0 : -1)) > 0 && (this.h > 0L ? 1 : (this.h == 0L ? 0 : -1)) > 0 && (this.f > 0L ? 1 : (this.f == 0L ? 0 : -1)) > 0) && ((this.n > 0L ? 1 : (this.n == 0L ? 0 : -1)) > 0 || this.Q.invoke().booleanValue()) && ((this.q > 0L ? 1 : (this.q == 0L ? 0 : -1)) > 0);
        if (this.i > 0 && this.j > 0 && this.k > 0) {
            long j = this.m;
            if (j <= 0) {
                j = 0;
            }
            if (j > 0) {
                z = true;
                if (BuildInfo.s()) {
                    if (!BuildInfo.q()) {
                        if (BuildInfo.a != BuildInfo.Client.VK_TV) {
                        }
                    }
                    z2 = false;
                } else {
                    if (z2 && z) {
                        z2 = true;
                    }
                    z2 = false;
                }
                return !z2 && this.O;
            }
        }
        z = false;
        if (BuildInfo.s()) {
        }
        if (z2) {
        }
    }

    public final boolean p() {
        return ((Boolean) this.R.getValue()).booleanValue();
    }

    public final void r() {
        if (o()) {
            ReentrantLock reentrantLock = this.P;
            reentrantLock.lock();
            try {
                if (o()) {
                    Preference.F(this.r, "performance", "__system_bind_app_performance_init_time__");
                    Preference.F(this.s, "performance", "__system_prefork_performance_init_time__");
                    Preference.F(this.j - this.b, "performance", "__app_performance_cold_feed_time__");
                    Preference.F(this.c, "performance", "__app_performance_init_time__");
                    Preference.F(this.b, "performance", "__app_performance_loading_time__");
                    Preference.F(this.e, "performance", "__app_performance_content_providers_time__");
                    Preference.F(this.j, "performance", "__app_performance_first_screen_data_loading_start_time__");
                    Preference.F(this.k, "performance", "__app_performance_first_screen_data_loaded_time__");
                    Preference.F(this.l, "performance", "__app_performance_first_screen_data_loaded_from_cache_time__");
                    Preference.F(this.m, "performance", "__app_performance_first_screen_content_appeared_time__");
                    Preference.F(0L, "performance", "__app_performance_on_menu_loaded_time__");
                    Preference.F(0L, "performance", "__app_performance_first_screen_content_appeared_from_cache_time__");
                    Preference.F(this.n, "performance", "__app_performance_first_longpoll_connection__");
                    Preference.F(this.f, "performance", "__app_performance_first_screen_time__");
                    Preference.F(0L, "performance", "__app_performance_first_frame_time__");
                    Preference.F(this.q, "performance", "__app_performance_toggles_init_time__");
                    Preference.F(this.g, "performance", "__app_performance_main_activity_created_time__");
                    Preference.F(0L, "performance", "__app_performance_main_activity_on_resume_time__");
                    Preference.F(this.h, "performance", "__app_performance_home_fragment_created_time__");
                    Preference.F(this.i, "performance", "__app_performance_newsfeed_fragment_on_create_time__");
                    Preference.F(this.f - this.b, "performance", "__acs_cold_start_time__");
                    Preference.F(this.j - this.b, "performance", "__acs_cold_feed_time__");
                    Preference.F(this.f - this.c, "performance", "__acs_cold_inflate_time__");
                    Preference.F(this.e - this.b, "performance", "__acs_cold_content_providers_time__");
                    Preference.F(0L, "performance", "__app_performance_average_bandwidth_bytes_per_second");
                    Preference.F(0L, "performance", "__app_performance_app_complete_data_loading_start_time");
                    Preference.F(0L, "performance", "__app_performance_app_complete_data_loading_end_time");
                    this.c = 0L;
                    this.b = 0L;
                    this.e = 0L;
                    this.f = 0L;
                    this.j = 0L;
                    this.k = 0L;
                    this.l = 0L;
                    this.m = 0L;
                    this.n = 0L;
                    this.q = 0L;
                    this.g = 0L;
                    this.h = 0L;
                    this.i = 0L;
                    w();
                    L.p("performance: storage=" + Preference.f("performance").getAll());
                    s3q0 s3q0Var = s3q0.a;
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void t() {
        n(this.H.getAndSet(0L), "__app_performance_net_usage_start__");
        n(this.I.getAndSet(0L), "__app_performance_net_usage__");
        n(this.G.getAndSet(0), "__app_performance_net_load_api_count__");
        n(this.w.getAndSet(0L), "__app_performance_net_background_traffic__");
        n(this.E.getAndSet(0L), "__app_performance_net_errors_count__");
        n(this.F.getAndSet(0L), "__app_performance_net_4xx_errors_count__");
        this.M = true;
    }

    public final void u() {
        if (this.o != 0) {
            long j = this.p;
            if (j == 0) {
                return;
            }
            Preference.F(j, "performance", "__app_performance_first_longpoll_end_connection__");
            Preference.F(this.o, "performance", "__app_performance_first_longpoll_open__");
            this.o = 0L;
            this.p = 0L;
            L.p("longpoll timings: storage=" + Preference.f("performance").getAll());
        }
    }

    public final void w() {
        SchemeStat$TypeAppStarts.StartMethod startMethod = this.u;
        SchemeStat$TypeAppStarts.StartType startType = this.t;
        String str = this.v;
        boolean z = startMethod == SchemeStat$TypeAppStarts.StartMethod.COMPANION || startMethod == SchemeStat$TypeAppStarts.StartMethod.PUSH;
        if (startMethod == null || startType == null) {
            return;
        }
        if (z && (str == null || str.length() == 0)) {
            return;
        }
        Preference.G("performance", "__app_performance_start_method__", SchemeStat$TypeAppStarts.StartMethod.class, startMethod);
        Preference.G("performance", "__app_performance_start_type__", SchemeStat$TypeAppStarts.StartType.class, startType);
        if (z) {
            Preference.H("performance", "__app_performance_start_method_payload__", str);
        }
        this.u = null;
        this.t = null;
        this.v = null;
        L.p("start params: storage=" + Preference.f("performance").getAll());
    }

    public final void x() {
        ReentrantLock reentrantLock = this.N;
        reentrantLock.lock();
        try {
            if (!this.M) {
                if (!Preference.v("performance", "__app_performance_net_usage_start__") && !Preference.v("performance", "__app_performance_net_usage__") && !Preference.v("performance", "__app_performance_net_background_traffic__") && !Preference.v("performance", "__app_performance_net_errors_count__") && !Preference.v("performance", "__app_performance_net_4xx_errors_count__") && !Preference.v("performance", "__app_performance_net_load_api_count__")) {
                }
                reentrantLock.unlock();
            }
            t();
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void y(long j) {
        AtomicLong atomicLong = this.D;
        long j2 = atomicLong.get();
        if (j2 >= j) {
            j = j2;
        }
        atomicLong.set(j);
        Preference.F(j, "performance", "__app_performance_ram_memory_max__");
    }
}
