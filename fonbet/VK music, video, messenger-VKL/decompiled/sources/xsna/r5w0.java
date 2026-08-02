package xsna;

import com.vk.push.common.Logger;
import com.vk.push.core.utils.StringExtensionsKt;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VkpnsTokenInvalidator.kt */
/* loaded from: classes5.dex */
public final class r5w0 implements a2p0 {

    @Deprecated
    public static final long h = TimeUnit.DAYS.toMillis(1);
    public static final /* synthetic */ int i = 0;
    public final ske0 a;
    public final g790 b;
    public final Logger d;
    public final long c = h;
    public final ConcurrentHashMap<String, a> e = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Long> f = new ConcurrentHashMap<>();
    public final wi50 g = bay.a();

    /* compiled from: VkpnsTokenInvalidator.kt */
    public static final class a {
        public final long a;
        public final int b;

        public a(long j, int i) {
            this.a = j;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InvalidationStatus(firstInvalidationTime=");
            sb.append(this.a);
            sb.append(", invalidationsCount=");
            return vu5.b(sb, this.b, ')');
        }
    }

    public r5w0(ske0 ske0Var, g790 g790Var, Logger logger) {
        this.a = ske0Var;
        this.b = g790Var;
        this.d = logger.createLogger("VkpnsTokenInvalidator");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a3, code lost:
    
        if (r10.e(r11, r0) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r11 != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // xsna.a2p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        t5w0 t5w0Var;
        int i2;
        String str2;
        r5w0 r5w0Var;
        if (continuationImpl instanceof t5w0) {
            t5w0Var = (t5w0) continuationImpl;
            int i3 = t5w0Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                t5w0Var.label = i3 - Integer.MIN_VALUE;
                Object obj = t5w0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = t5w0Var.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    Logger.DefaultImpls.warn$default(this.d, "Invalidation process has been started! Token: " + StringExtensionsKt.hideSensitive(str), null, 2, null);
                    t5w0Var.L$0 = this;
                    t5w0Var.L$1 = str;
                    t5w0Var.label = 1;
                    if (this.a.p(str, System.currentTimeMillis(), t5w0Var) != coroutineSingletons) {
                        str2 = str;
                        r5w0Var = this;
                    }
                    return coroutineSingletons;
                }
                if (i2 == 1) {
                    String str3 = (String) t5w0Var.L$1;
                    r5w0 r5w0Var2 = (r5w0) t5w0Var.L$0;
                    kotlin.a.a(obj);
                    str2 = str3;
                    r5w0Var = r5w0Var2;
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return s3q0.a;
                    }
                    r5w0Var = (r5w0) t5w0Var.L$0;
                    kotlin.a.a(obj);
                    e790 e790Var = (e790) obj;
                    if (e790Var == null) {
                        Logger.DefaultImpls.warn$default(r5w0Var.d, "There is no package info!", null, 2, null);
                        return s3q0.a;
                    }
                    String str4 = e790Var.b;
                    t5w0Var.L$0 = null;
                    t5w0Var.label = 3;
                }
                ske0 ske0Var = r5w0Var.a;
                t5w0Var.L$0 = r5w0Var;
                t5w0Var.L$1 = null;
                t5w0Var.label = 2;
                obj = ske0Var.h(str2, t5w0Var);
            }
        }
        t5w0Var = new t5w0(this, continuationImpl);
        Object obj2 = t5w0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = t5w0Var.label;
        if (i2 != 0) {
        }
        ske0 ske0Var2 = r5w0Var.a;
        t5w0Var.L$0 = r5w0Var;
        t5w0Var.L$1 = null;
        t5w0Var.label = 2;
        obj2 = ske0Var2.h(str2, t5w0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a6, code lost:
    
        if (r2.f(r13, r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        s5w0 s5w0Var;
        int i2;
        Object obj;
        String str2;
        r5w0 r5w0Var;
        e790 e790Var;
        if (continuationImpl instanceof s5w0) {
            s5w0Var = (s5w0) continuationImpl;
            int i3 = s5w0Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                s5w0Var.label = i3 - Integer.MIN_VALUE;
                Object obj2 = s5w0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = s5w0Var.label;
                if (i2 != 0) {
                    kotlin.a.a(obj2);
                    Logger.DefaultImpls.info$default(this.d, zr.a("Checking is package ", str, " should be removed from ban..."), null, 2, null);
                    s5w0Var.L$0 = this;
                    s5w0Var.L$1 = str;
                    s5w0Var.label = 1;
                    Object e = this.b.e(str, s5w0Var);
                    if (e != coroutineSingletons) {
                        obj = e;
                        str2 = str;
                        r5w0Var = this;
                    }
                    return coroutineSingletons;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r5w0Var = (r5w0) s5w0Var.L$0;
                    kotlin.a.a(obj2);
                    Logger.DefaultImpls.info$default(r5w0Var.d, "Unbanning client completed", null, 2, null);
                    return s3q0.a;
                }
                String str3 = (String) s5w0Var.L$1;
                r5w0 r5w0Var2 = (r5w0) s5w0Var.L$0;
                kotlin.a.a(obj2);
                str2 = str3;
                r5w0Var = r5w0Var2;
                obj = obj2;
                e790Var = (e790) obj;
                if ((e790Var == null ? e790Var.d : null) != null) {
                    return s3q0.a;
                }
                if (System.currentTimeMillis() - e790Var.d.longValue() > r5w0Var.c) {
                    Logger.DefaultImpls.info$default(r5w0Var.d, zr.a("Unbanning client ", str2, "..."), null, 2, null);
                    e790 a2 = e790.a(e790Var, null, 7);
                    g790 g790Var = r5w0Var.b;
                    s5w0Var.L$0 = r5w0Var;
                    s5w0Var.L$1 = null;
                    s5w0Var.label = 2;
                }
                return s3q0.a;
            }
        }
        s5w0Var = new s5w0(this, continuationImpl);
        Object obj22 = s5w0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = s5w0Var.label;
        if (i2 != 0) {
        }
        e790Var = (e790) obj;
        if ((e790Var == null ? e790Var.d : null) != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        u5w0 u5w0Var;
        int i2;
        r5w0 r5w0Var;
        boolean z;
        if (continuationImpl instanceof u5w0) {
            u5w0Var = (u5w0) continuationImpl;
            int i3 = u5w0Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                u5w0Var.label = i3 - Integer.MIN_VALUE;
                Object obj = u5w0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = u5w0Var.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    Logger logger = this.d;
                    Logger.DefaultImpls.warn$default(logger, "Calling invalidatePackage for " + str + "...", null, 2, null);
                    a aVar = new a(System.currentTimeMillis(), 0);
                    ConcurrentHashMap<String, a> concurrentHashMap = this.e;
                    a putIfAbsent = concurrentHashMap.putIfAbsent(str, aVar);
                    if (putIfAbsent != null) {
                        aVar = putIfAbsent;
                    }
                    a aVar2 = new a(aVar.a, aVar.b + 1);
                    Logger.DefaultImpls.info$default(logger, "New invalidation status for " + str + " is " + aVar2, null, 2, null);
                    concurrentHashMap.put(str, aVar2);
                    u5w0Var.L$0 = this;
                    u5w0Var.L$1 = str;
                    u5w0Var.label = 1;
                    if (b(str, u5w0Var) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    r5w0Var = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) u5w0Var.L$1;
                    r5w0Var = (r5w0) u5w0Var.L$0;
                    kotlin.a.a(obj);
                }
                ConcurrentHashMap<String, a> concurrentHashMap2 = r5w0Var.e;
                Logger logger2 = r5w0Var.d;
                z = System.currentTimeMillis() - ((a) pn00.h(str, concurrentHashMap2)).a <= 300000;
                Logger.DefaultImpls.info$default(logger2, "Are time boundaries passed for " + str + ": " + z, null, 2, null);
                if (!z) {
                    concurrentHashMap2.remove(str);
                    r5w0Var.f.put(str, new Long(System.currentTimeMillis()));
                    return s3q0.a;
                }
                boolean z2 = ((a) pn00.h(str, concurrentHashMap2)).b > 3;
                Logger.DefaultImpls.info$default(logger2, "Is limit exceeded for " + str + ": " + z2, null, 2, null);
                if (z2) {
                    concurrentHashMap2.remove(str);
                    Logger.DefaultImpls.info$default(logger2, "Package " + str + " has been marked as invalidated [but invalidation in database is disabled temporarily]", null, 2, null);
                }
                return s3q0.a;
            }
        }
        u5w0Var = new u5w0(this, continuationImpl);
        Object obj2 = u5w0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = u5w0Var.label;
        if (i2 != 0) {
        }
        ConcurrentHashMap<String, a> concurrentHashMap22 = r5w0Var.e;
        Logger logger22 = r5w0Var.d;
        if (System.currentTimeMillis() - ((a) pn00.h(str, concurrentHashMap22)).a <= 300000) {
        }
        Logger.DefaultImpls.info$default(logger22, "Are time boundaries passed for " + str + ": " + z, null, 2, null);
        if (!z) {
        }
    }

    public final boolean d(String str) {
        Long l = this.f.get(str);
        if (l == null) {
            l = 0L;
        }
        boolean z = System.currentTimeMillis() - l.longValue() > this.c;
        Logger.DefaultImpls.info$default(this.d, "shouldStartInvalidation result for " + str + ": " + z, null, 2, null);
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
    
        if (r3.c(r8, r0) == r1) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073 A[Catch: all -> 0x0087, TRY_LEAVE, TryCatch #0 {all -> 0x0087, blocks: (B:25:0x006d, B:27:0x0073), top: B:24:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r8v11, types: [xsna.ui50] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, ContinuationImpl continuationImpl) {
        v5w0 v5w0Var;
        int i2;
        wi50 wi50Var;
        r5w0 r5w0Var;
        Throwable th;
        ui50 ui50Var;
        try {
            if (continuationImpl instanceof v5w0) {
                v5w0Var = (v5w0) continuationImpl;
                int i3 = v5w0Var.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    v5w0Var.label = i3 - Integer.MIN_VALUE;
                    Object obj = v5w0Var.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = v5w0Var.label;
                    if (i2 != 0) {
                        kotlin.a.a(obj);
                        Logger.DefaultImpls.warn$default(this.d, zr.a("Try invalidate package ", str, " has started"), null, 2, null);
                        v5w0Var.L$0 = this;
                        v5w0Var.L$1 = str;
                        wi50Var = this.g;
                        v5w0Var.L$2 = wi50Var;
                        v5w0Var.label = 1;
                        if (wi50Var.b(v5w0Var) != coroutineSingletons) {
                            r5w0Var = this;
                        }
                        return coroutineSingletons;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ui50Var = (ui50) v5w0Var.L$0;
                        try {
                            kotlin.a.a(obj);
                            s3q0 s3q0Var = s3q0.a;
                            ui50Var.c(null);
                            return s3q0.a;
                        } catch (Throwable th2) {
                            th = th2;
                            ui50Var.c(null);
                            throw th;
                        }
                    }
                    ?? r8 = (ui50) v5w0Var.L$2;
                    String str2 = (String) v5w0Var.L$1;
                    r5w0Var = (r5w0) v5w0Var.L$0;
                    kotlin.a.a(obj);
                    wi50Var = r8;
                    str = str2;
                    if (r5w0Var.d(str)) {
                        r5w0Var.f.remove(str);
                        v5w0Var.L$0 = wi50Var;
                        v5w0Var.L$1 = null;
                        v5w0Var.L$2 = null;
                        v5w0Var.label = 2;
                    }
                    ui50Var = wi50Var;
                    s3q0 s3q0Var2 = s3q0.a;
                    ui50Var.c(null);
                    return s3q0.a;
                }
            }
            if (r5w0Var.d(str)) {
            }
            ui50Var = wi50Var;
            s3q0 s3q0Var22 = s3q0.a;
            ui50Var.c(null);
            return s3q0.a;
        } catch (Throwable th3) {
            wi50 wi50Var2 = wi50Var;
            th = th3;
            ui50Var = wi50Var2;
            ui50Var.c(null);
            throw th;
        }
        v5w0Var = new v5w0(this, continuationImpl);
        Object obj2 = v5w0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = v5w0Var.label;
        if (i2 != 0) {
        }
    }
}
