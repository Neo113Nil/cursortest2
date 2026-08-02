package xsna;

import com.unity3d.ads.BuildConfig;
import com.vk.core.apps.BuildInfo;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.toggle.data.RateMode;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.text.Regex;
import okhttp3.Interceptor;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.k8g0;

/* compiled from: RateLimitInterceptor.kt */
/* loaded from: classes2.dex */
public final class ywe0 implements Interceptor, uz80 {
    public static final a i = new a();
    public final com.vk.toggle.data.b a;
    public final dgc0 b;
    public final e6g c;
    public final String d;
    public final ConcurrentHashMap<String, e2k0> e;
    public final ConcurrentHashMap<String, zyy> f;
    public final ConcurrentHashMap<String, azy> g;
    public final ConcurrentHashMap<String, t1p0> h;

    /* compiled from: RateLimitInterceptor.kt */
    public static final class a {
        public static String a(okhttp3.p pVar) {
            String failure;
            Object obj = BuildConfig.FLAVOR;
            try {
                if (pVar.c(k8g0.a.class) != null) {
                    failure = "api";
                } else if (pVar.c(k8g0.d.class) != null) {
                    failure = "music";
                } else {
                    failure = pVar.c(k8g0.c.class) != null ? "longpoll" : BuildConfig.FLAVOR;
                }
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (Result.a(failure) == null) {
                obj = failure;
            }
            return (String) obj;
        }
    }

    /* compiled from: RateLimitInterceptor.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RateMode.values().length];
            try {
                iArr[RateMode.SLIDING_WINDOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RateMode.LEAKY_BUCKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RateMode.LEAKY_BUCKET_BURST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RateMode.TOKEN_BUCKET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ywe0(com.vk.toggle.data.b bVar) {
        dgc0 dgc0Var = new dgc0(3);
        e6g e6gVar = new e6g(6);
        this.a = bVar;
        this.b = dgc0Var;
        this.c = e6gVar;
        this.d = "RateLimiter";
        this.e = new ConcurrentHashMap<>();
        this.f = new ConcurrentHashMap<>();
        this.g = new ConcurrentHashMap<>();
        this.h = new ConcurrentHashMap<>();
    }

    @Override // xsna.uz80
    public final String getTag() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03c3  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List] */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final okhttp3.u intercept(Interceptor.a aVar) {
        Object obj;
        boolean z;
        Iterator it;
        long j;
        long j2;
        e2k0 putIfAbsent;
        long j3;
        zyy putIfAbsent2;
        azy putIfAbsent3;
        t1p0 putIfAbsent4;
        com.vk.toggle.data.b bVar = this.a;
        boolean z2 = bVar.a;
        boolean z3 = bVar.b;
        if (!z2) {
            return aVar.a(aVar.request());
        }
        okhttp3.p request = aVar.request();
        okhttp3.l lVar = request.a;
        i.getClass();
        String a2 = a.a(request);
        String str = lVar.d;
        String b2 = lVar.b();
        Iterator<T> it2 = bVar.d.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            axe0 axe0Var = ((xwe0) obj).a;
            Set<String> set = axe0Var.a;
            if (set == null || set.contains(a2)) {
                Regex regex = axe0Var.b;
                if (regex == null || regex.f(str)) {
                    Regex regex2 = axe0Var.c;
                    if (regex2 == null || regex2.f(b2)) {
                        break;
                    }
                }
            }
        }
        xwe0 xwe0Var = (xwe0) obj;
        if (xwe0Var == null) {
            return aVar.a(request);
        }
        Iterator it3 = xwe0Var.b.iterator();
        while (it3.hasNext()) {
            String str2 = (String) it3.next();
            zwe0 zwe0Var = bVar.c.get(str2);
            if (zwe0Var != null) {
                RateMode rateMode = zwe0Var.c;
                long j4 = zwe0Var.b;
                int i2 = zwe0Var.a;
                int i3 = b.$EnumSwitchMapping$0[rateMode.ordinal()];
                dgc0 dgc0Var = this.b;
                if (i3 == 1) {
                    z = z3;
                    it = it3;
                    j = 0;
                    ConcurrentHashMap<String, e2k0> concurrentHashMap = this.e;
                    e2k0 e2k0Var = concurrentHashMap.get(str2);
                    if (e2k0Var == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str2, (e2k0Var = new e2k0(i2, j4, dgc0Var)))) != null) {
                        e2k0Var = putIfAbsent;
                    }
                    e2k0 e2k0Var2 = e2k0Var;
                    int i4 = e2k0Var2.a;
                    long j5 = e2k0Var2.b;
                    ArrayDeque<Long> arrayDeque = e2k0Var2.d;
                    ReentrantLock reentrantLock = e2k0Var2.e;
                    reentrantLock.lockInterruptibly();
                    if (i4 > 0 && j5 > 0) {
                        try {
                            long longValue = e2k0Var2.c.invoke().longValue();
                            while (!arrayDeque.isEmpty() && longValue - ((Number) j5g.X(arrayDeque)).longValue() >= j5) {
                                arrayDeque.removeFirst();
                            }
                            arrayDeque.addLast(Long.valueOf(longValue));
                            if (arrayDeque.size() > i4) {
                                long longValue2 = j5 - (longValue - arrayDeque.removeFirst().longValue());
                                if (longValue2 < 0) {
                                    longValue2 = 0;
                                }
                                j2 = longValue2;
                            } else {
                                j2 = 0;
                            }
                            reentrantLock.unlock();
                            if (z) {
                            }
                            if (j2 > j) {
                            }
                            z3 = z;
                            it3 = it;
                        } finally {
                        }
                    } else {
                        if (BuildInfo.h()) {
                            throw new IllegalStateException(("SlidingWindow misconfigured: capacity=" + i4 + " windowMs=" + j5).toString());
                        }
                        L l = L.a;
                        l.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l, L.LogType.w, new Object[]{"SlidingWindow misconfigured: capacity=" + i4 + " windowMs=" + j5});
                        }
                        j2 = j;
                        if (z) {
                        }
                        if (j2 > j) {
                        }
                        z3 = z;
                        it3 = it;
                    }
                    reentrantLock.unlock();
                }
                if (i3 != 2) {
                    if (i3 == 3) {
                        z = z3;
                        it = it3;
                        j = 0;
                        ConcurrentHashMap<String, azy> concurrentHashMap2 = this.g;
                        azy azyVar = concurrentHashMap2.get(str2);
                        if (azyVar == null && (putIfAbsent3 = concurrentHashMap2.putIfAbsent(str2, (azyVar = new azy(i2, j4, dgc0Var)))) != null) {
                            azyVar = putIfAbsent3;
                        }
                        azy azyVar2 = azyVar;
                        long j6 = azyVar2.b;
                        int i5 = azyVar2.a;
                        long j7 = azyVar2.d;
                        ReentrantLock reentrantLock2 = azyVar2.g;
                        reentrantLock2.lockInterruptibly();
                        if (j7 <= 0) {
                            try {
                                if (BuildInfo.h()) {
                                    throw new IllegalStateException(("LeakyBurstBucket misconfigured: maxRequests=" + i5 + " windowMs=" + j6).toString());
                                }
                                L l2 = L.a;
                                l2.getClass();
                                if (!L.m(LoggerOutputTarget.NONE)) {
                                    L.u(l2, L.LogType.w, new Object[]{"LeakyBurstBucket misconfigured: maxRequests=" + i5 + " windowMs=" + j6});
                                }
                            } finally {
                                reentrantLock2.unlock();
                            }
                        } else {
                            long longValue3 = azyVar2.c.invoke().longValue();
                            if (longValue3 >= azyVar2.e) {
                                azyVar2.e = longValue3;
                                azyVar2.f = i5;
                            }
                            int i6 = azyVar2.f;
                            if (i6 > 0) {
                                azyVar2.f = i6 - 1;
                                azyVar2.e += j7;
                            } else {
                                long j8 = azyVar2.e;
                                j3 = j8 - longValue3;
                                if (j3 < 0) {
                                    j3 = 0;
                                }
                                azyVar2.e = j8 + j7;
                                reentrantLock2.unlock();
                                j2 = j3;
                            }
                        }
                    } else {
                        if (i3 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ConcurrentHashMap<String, t1p0> concurrentHashMap3 = this.h;
                        t1p0 t1p0Var = concurrentHashMap3.get(str2);
                        if (t1p0Var == null && (putIfAbsent4 = concurrentHashMap3.putIfAbsent(str2, (t1p0Var = new t1p0(i2, j4, dgc0Var)))) != null) {
                            t1p0Var = putIfAbsent4;
                        }
                        t1p0 t1p0Var2 = t1p0Var;
                        long j9 = t1p0Var2.b;
                        int i7 = t1p0Var2.a;
                        ReentrantLock reentrantLock3 = t1p0Var2.e;
                        reentrantLock3.lockInterruptibly();
                        if (i7 <= 0 || j9 <= 0) {
                            z = z3;
                            it = it3;
                            j = 0;
                            if (BuildInfo.h()) {
                                throw new IllegalStateException(("TokenBucket misconfigured: maxRequests=" + i7 + " windowMs=" + j9).toString());
                            }
                            L l3 = L.a;
                            l3.getClass();
                            if (!L.m(LoggerOutputTarget.NONE)) {
                                L.u(l3, L.LogType.w, new Object[]{"TokenBucket misconfigured: maxRequests=" + i7 + " windowMs=" + j9});
                            }
                        } else {
                            try {
                                long longValue4 = t1p0Var2.c.invoke().longValue();
                                long j10 = longValue4 - t1p0Var2.h;
                                if (j10 < 0) {
                                    j10 = 0;
                                    j = 0;
                                } else {
                                    j = 0;
                                }
                                z = z3;
                                it = it3;
                                double min = Math.min(t1p0Var2.d, t1p0Var2.g + j10);
                                t1p0Var2.h = longValue4;
                                double d = t1p0Var2.f;
                                double d2 = min - d;
                                t1p0Var2.g = d2;
                                if (d2 < ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                                    j2 = an10.c(Math.ceil(d - d2));
                                }
                            } finally {
                                reentrantLock3.unlock();
                            }
                        }
                    }
                    j2 = j;
                } else {
                    z = z3;
                    it = it3;
                    j = 0;
                    ConcurrentHashMap<String, zyy> concurrentHashMap4 = this.f;
                    zyy zyyVar = concurrentHashMap4.get(str2);
                    if (zyyVar == null && (putIfAbsent2 = concurrentHashMap4.putIfAbsent(str2, (zyyVar = new zyy(i2, j4, dgc0Var)))) != null) {
                        zyyVar = putIfAbsent2;
                    }
                    zyy zyyVar2 = zyyVar;
                    long j11 = zyyVar2.b;
                    int i8 = zyyVar2.a;
                    long j12 = zyyVar2.d;
                    ReentrantLock reentrantLock4 = zyyVar2.f;
                    reentrantLock4.lockInterruptibly();
                    if (j12 <= 0) {
                        try {
                            if (BuildInfo.h()) {
                                throw new IllegalStateException(("LeakyBucket misconfigured: maxRequests=" + i8 + " windowMs=" + j11).toString());
                            }
                            L l4 = L.a;
                            l4.getClass();
                            if (!L.m(LoggerOutputTarget.NONE)) {
                                L.u(l4, L.LogType.w, new Object[]{"LeakyBucket misconfigured: maxRequests=" + i8 + " windowMs=" + j11});
                            }
                            j2 = j;
                        } finally {
                            reentrantLock4.unlock();
                        }
                    } else {
                        long longValue5 = zyyVar2.c.invoke().longValue();
                        if (longValue5 >= zyyVar2.e) {
                            zyyVar2.e = longValue5;
                        }
                        long j13 = zyyVar2.e;
                        j3 = j13 - longValue5;
                        if (j3 < 0) {
                            j3 = 0;
                        }
                        zyyVar2.e = j13 + j12;
                        reentrantLock4.unlock();
                        j2 = j3;
                    }
                }
                if (z) {
                    StringBuilder d3 = rqi.d(j2, "RateLimiter ", str2, " +");
                    d3.append(UcumUtils.UCUM_MILLISECODS);
                    L.e(d3.toString());
                }
                if (j2 > j) {
                    m63.a(m63.c(), "ratelimit.triggered", new Pair("ratelimit.wait_ms", Long.valueOf(j2)), new Pair("ratelimit.tag", a.a(request)));
                    this.c.invoke(Long.valueOf(j2), request);
                }
                z3 = z;
                it3 = it;
            } else if (z3) {
                L.e(zr.a("RateLimiter   skip ", str2, " (unknown)"));
            }
        }
        if (z3) {
            L.e("RateLimiter funnel done");
        }
        return aVar.a(request);
    }
}
