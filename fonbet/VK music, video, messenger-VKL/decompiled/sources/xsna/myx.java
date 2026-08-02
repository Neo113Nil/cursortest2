package xsna;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: JobScheduler.java */
/* loaded from: classes12.dex */
public final class myx {
    public final Executor a;
    public final b b;
    public final kyx c = new kyx(this);
    public final lyx d = new lyx(this);
    public rip e = null;
    public int f = 0;
    public d g = d.IDLE;
    public long h = 0;
    public long i = 0;

    /* compiled from: JobScheduler.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.values().length];
            a = iArr;
            try {
                iArr[d.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.QUEUED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[d.RUNNING_AND_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: JobScheduler.java */
    public interface b {
        void a(rip ripVar, int i);
    }

    /* compiled from: JobScheduler.java */
    public static class c {
        public static ScheduledExecutorService a;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: JobScheduler.java */
    public static final class d {
        private static final /* synthetic */ d[] $VALUES;
        public static final d IDLE;
        public static final d QUEUED;
        public static final d RUNNING;
        public static final d RUNNING_AND_PENDING;

        static {
            d dVar = new d("IDLE", 0);
            IDLE = dVar;
            d dVar2 = new d("QUEUED", 1);
            QUEUED = dVar2;
            d dVar3 = new d("RUNNING", 2);
            RUNNING = dVar3;
            d dVar4 = new d("RUNNING_AND_PENDING", 3);
            RUNNING_AND_PENDING = dVar4;
            $VALUES = new d[]{dVar, dVar2, dVar3, dVar4};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    public myx(Executor executor, b bVar) {
        this.a = executor;
        this.b = bVar;
    }

    public static boolean e(rip ripVar, int i) {
        return ac6.d(i) || ac6.k(i, 4) || rip.x(ripVar);
    }

    public final void a() {
        rip ripVar;
        synchronized (this) {
            ripVar = this.e;
            this.e = null;
            this.f = 0;
        }
        rip.c(ripVar);
    }

    public final void b(long j) {
        lyx lyxVar = this.d;
        if (j <= 0) {
            lyxVar.run();
            return;
        }
        if (c.a == null) {
            c.a = Executors.newSingleThreadScheduledExecutor();
        }
        c.a.schedule(lyxVar, j, TimeUnit.MILLISECONDS);
    }

    public final void c() {
        long j;
        boolean z;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                if (this.g == d.RUNNING_AND_PENDING) {
                    j = Math.max(this.i + 100, uptimeMillis);
                    this.h = uptimeMillis;
                    this.g = d.QUEUED;
                    z = true;
                } else {
                    this.g = d.IDLE;
                    j = 0;
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            b(j - uptimeMillis);
        }
    }

    public final void d() {
        boolean z;
        long j;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                if (e(this.e, this.f)) {
                    int i = a.a[this.g.ordinal()];
                    if (i != 1) {
                        if (i == 3) {
                            this.g = d.RUNNING_AND_PENDING;
                        }
                        j = 0;
                        z = false;
                    } else {
                        long max = Math.max(this.i + 100, uptimeMillis);
                        this.h = uptimeMillis;
                        this.g = d.QUEUED;
                        z = true;
                        j = max;
                    }
                    if (z) {
                        b(j - uptimeMillis);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean f(rip ripVar, int i) {
        rip ripVar2;
        if (!e(ripVar, i)) {
            return false;
        }
        synchronized (this) {
            ripVar2 = this.e;
            this.e = rip.b(ripVar);
            this.f = i;
        }
        rip.c(ripVar2);
        return true;
    }
}
