package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: OOMPreventerStartTaskLogic.kt */
/* loaded from: classes11.dex */
public final class ro70 extends ParallelTaskRunner.d {

    /* compiled from: OOMPreventerStartTaskLogic.kt */
    public static final class a extends so70 {
        public final Executor b;
        public final String c = "allow_core_threads_timeout";
        public final float d = 0.8f;
        public final float e = 0.5f;
        public final ArrayList f = new ArrayList();

        /* compiled from: OOMPreventerStartTaskLogic.kt */
        /* renamed from: xsna.ro70$a$a, reason: collision with other inner class name */
        public static final class C3617a {
            public final ThreadPoolExecutor a;
            public final long b;

            public C3617a(ThreadPoolExecutor threadPoolExecutor, long j) {
                this.a = threadPoolExecutor;
                this.b = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3617a)) {
                    return false;
                }
                C3617a c3617a = (C3617a) obj;
                return epx.f(this.a, c3617a.a) && this.b == c3617a.b;
            }

            public final int hashCode() {
                return Long.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ThreadPoolExecutorConfig(executor=");
                sb.append(this.a);
                sb.append(", keepAliveNanos=");
                return vu5.a(')', this.b, sb);
            }
        }

        public a(ScheduledExecutorService scheduledExecutorService) {
            this.b = scheduledExecutorService;
        }

        @Override // xsna.so70
        public final void a() {
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            asu0.a.getClass();
            Iterator it = asu0.g().iterator();
            while (it.hasNext()) {
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) it.next();
                if (!epx.f(threadPoolExecutor, this.b) && !threadPoolExecutor.allowsCoreThreadTimeOut()) {
                    long keepAliveTime = threadPoolExecutor.getKeepAliveTime(TimeUnit.NANOSECONDS);
                    this.f.add(new WeakReference(new C3617a(threadPoolExecutor, keepAliveTime)));
                    if (keepAliveTime == 0) {
                        threadPoolExecutor.setKeepAliveTime(100L, TimeUnit.MILLISECONDS);
                    }
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    ref$IntRef.element = threadPoolExecutor.getCorePoolSize() + ref$IntRef.element;
                }
            }
            L l = L.a;
            l.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l, L.LogType.d, new Object[]{"OOMPreventer", h5s.c(ref$IntRef.element, " threads to timeout", new StringBuilder("allowed "))});
        }

        @Override // xsna.so70
        public final float b() {
            return this.d;
        }

        @Override // xsna.so70
        public final String c() {
            return this.c;
        }

        @Override // xsna.so70
        public final float d() {
            return this.e;
        }

        @Override // xsna.so70
        public final void e() {
            Object obj;
            asu0.a.getClass();
            Iterator it = asu0.g().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                ArrayList arrayList = this.f;
                if (!hasNext) {
                    arrayList.clear();
                    return;
                }
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) it.next();
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    C3617a c3617a = (C3617a) ((WeakReference) next).get();
                    if (epx.f(c3617a != null ? c3617a.a : null, threadPoolExecutor)) {
                        obj = next;
                        break;
                    }
                }
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference != null) {
                    threadPoolExecutor.setKeepAliveTime(((C3617a) weakReference.get()).b, TimeUnit.NANOSECONDS);
                    threadPoolExecutor.allowCoreThreadTimeOut(false);
                }
            }
        }
    }

    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "StartOOMPreventer";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        ScheduledExecutorService z = asu0.a.z(5, "oom-prevention-thread");
        z.scheduleWithFixedDelay(new fd00(e43.l(b.b, new c(z), new a(z)), 1), 3L, 3L, TimeUnit.SECONDS);
        return s3q0.a;
    }

    /* compiled from: OOMPreventerStartTaskLogic.kt */
    public static final class b extends so70 {
        public static final b b = new b();
        public static final String c = "clear_caches";
        public static final float d = 0.9f;

        @Override // xsna.so70
        public final void a() {
            mcr0.b();
            wgn0.a();
        }

        @Override // xsna.so70
        public final float b() {
            return d;
        }

        @Override // xsna.so70
        public final String c() {
            return c;
        }

        @Override // xsna.so70
        public final float d() {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        @Override // xsna.so70
        public final void e() {
        }
    }

    /* compiled from: OOMPreventerStartTaskLogic.kt */
    public static final class c extends so70 {
        public final Executor b;
        public final String c = "purge_idle_workers";
        public final float d = 0.7f;

        public c(ScheduledExecutorService scheduledExecutorService) {
            this.b = scheduledExecutorService;
        }

        @Override // xsna.so70
        public final void a() {
            asu0.a.getClass();
            Iterator it = asu0.g().iterator();
            while (it.hasNext()) {
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) it.next();
                if (!epx.f(threadPoolExecutor, this.b)) {
                    threadPoolExecutor.purge();
                }
            }
        }

        @Override // xsna.so70
        public final float b() {
            return this.d;
        }

        @Override // xsna.so70
        public final String c() {
            return this.c;
        }

        @Override // xsna.so70
        public final float d() {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        @Override // xsna.so70
        public final void e() {
        }
    }
}
