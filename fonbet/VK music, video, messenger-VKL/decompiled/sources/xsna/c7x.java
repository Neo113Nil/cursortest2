package xsna;

import android.content.Context;
import com.huawei.hms.hihealth.data.DeviceInfo;
import com.vk.instantjobs.InstantJob;
import com.vk.instantjobs.components.appstate.AppState;
import com.vk.instantjobs.exceptions.JobCauseException;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import xsna.r93;

/* compiled from: InstantJobManagerImpl.kt */
/* loaded from: classes.dex */
public final class c7x {
    public final Context a;
    public final oal b;
    public final String c;
    public final String d;
    public final pla e;
    public final uml g;
    public r6x m;
    public Object n;
    public boolean o;
    public boolean p;
    public final jml f = new jml();
    public final p7i h = new p7i();
    public final a i = new a();
    public final bpn0 j = new bpn0(new gb3(this, 5));
    public final bpn0 k = new bpn0(new g3o(this, 2));
    public final bpn0 l = new bpn0(new hy6(this, 6));
    public String q = DeviceInfo.STR_TYPE_UNKNOWN;
    public final CountDownLatch r = new CountDownLatch(1);

    /* compiled from: InstantJobManagerImpl.kt */
    public final class a implements r93.a {
        public a() {
        }

        @Override // xsna.r93.a
        public final void a(AppState appState) {
            c7x c7xVar = c7x.this;
            synchronized (c7xVar) {
                try {
                    if (c7xVar.p) {
                        return;
                    }
                    JobCauseException jobCauseException = prw.c ? null : new JobCauseException("by appState: " + appState);
                    int i = b.$EnumSwitchMapping$0[appState.ordinal()];
                    if (i == 1) {
                        c7xVar.h(jobCauseException);
                    } else if (i == 2) {
                        c7xVar.h(jobCauseException);
                    } else if (i == 3) {
                        synchronized (c7xVar) {
                            c7xVar.b();
                            if (c7xVar.o) {
                                c7xVar.j(new bih(c7xVar, 22));
                            }
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* compiled from: InstantJobManagerImpl.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppState.values().length];
            try {
                iArr[AppState.FOREGROUND_UI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppState.FOREGROUND_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppState.IDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public c7x(Context context, oal oalVar, String str, String str2, pla plaVar) {
        this.a = context;
        this.b = oalVar;
        this.c = str;
        this.d = str2;
        this.e = plaVar;
        this.g = new uml(context, str);
    }

    public final void a(String str, Throwable th, izs<? super InstantJob, Boolean> izsVar) {
        synchronized (this) {
            try {
                c();
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                Iterator it = ((Iterable) j(new dwm(this, th, str, izsVar, 1)).get()).iterator();
                while (it.hasNext()) {
                    ((CountDownLatch) it.next()).await();
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    public final synchronized void b() {
        if (this.p) {
            throw new IllegalStateException("Instance is released, reason: " + this.q);
        }
    }

    public final synchronized void c() {
        try {
            if (this.p) {
                throw new IllegalStateException("Instance is released: " + this.q);
            }
            if (!this.o) {
                throw new IllegalStateException("Instance is not started");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized r6x d() {
        return new r6x(this.a, this.c, this.f, this.b, this.g, (sal) this.l.getValue(), (ExecutorService) this.k.getValue(), this.h, this.e, this.n);
    }

    public final r6x e(Throwable th) {
        boolean z;
        r6x r6xVar;
        synchronized (this) {
            try {
                if (this.m == null) {
                    this.m = d();
                    z = true;
                } else {
                    z = false;
                }
                r6xVar = this.m;
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z) {
            return r6xVar;
        }
        r6xVar.c("startAndRestoreJobs begin");
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (r6xVar) {
            if (r6xVar.j) {
                throw new IllegalStateException("Instance already released");
            }
            if (r6xVar.i) {
                throw new IllegalStateException("Instance already started");
            }
            r6xVar.i = true;
            r6xVar.d(th);
        }
        r6xVar.c("startAndRestoreJobs end (" + (System.currentTimeMillis() - currentTimeMillis) + "ms)");
        return r6xVar;
    }

    public final void f(Throwable th) {
        oal oalVar = this.b;
        synchronized (oalVar) {
            try {
                AppState appState = oalVar.h;
                if (appState != AppState.SUSPENDING) {
                    if (appState == AppState.IDLE) {
                    }
                }
                oalVar.g(appState, th);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004e A[LOOP:0: B:27:0x0048->B:29:0x004e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        r6x r6xVar;
        Iterator it;
        r7x r7xVar;
        CountDownLatch countDownLatch;
        synchronized (this) {
            r6xVar = this.m;
            this.m = null;
            s3q0 s3q0Var = s3q0.a;
        }
        if (r6xVar == null) {
            return;
        }
        r6xVar.c("releaseAndAwait begin");
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (r6xVar) {
            if (!r6xVar.j) {
                r6xVar.j = true;
            }
        }
        u6x u6xVar = r6xVar.g;
        synchronized (u6xVar) {
            synchronized (u6xVar) {
                if (!u6xVar.i) {
                    u6xVar.h.addAll(u6xVar.b("terminate", true, new kz0(23)));
                    u6xVar.i = true;
                }
            }
            it = u6xVar.h.iterator();
            while (it.hasNext()) {
                ((CountDownLatch) it.next()).await();
            }
            r7xVar = r6xVar.h;
            synchronized (r7xVar) {
                r7xVar.d();
                r7xVar.k = true;
                r7xVar.b.a(r7xVar.i);
                countDownLatch = new CountDownLatch(1);
                r7xVar.c.submit(new o4(countDownLatch, 12));
            }
            countDownLatch.await();
            r6xVar.c("releaseAndAwait end (" + (System.currentTimeMillis() - currentTimeMillis) + "ms)");
            return;
        }
        it = u6xVar.h.iterator();
        while (it.hasNext()) {
        }
        r7xVar = r6xVar.h;
        synchronized (r7xVar) {
        }
    }

    public final synchronized void h(JobCauseException jobCauseException) {
        b();
        if (this.o) {
            j(new b7x(0, this, jobCauseException));
        }
    }

    public final Future<CountDownLatch> i(InstantJob instantJob, Throwable th) {
        Future<CountDownLatch> j;
        synchronized (this) {
            c();
            j = j(new j5q(this, th, instantJob, 3));
        }
        return j;
    }

    public final synchronized <T> Future<T> j(gzs<? extends T> gzsVar) {
        return ((ExecutorService) this.j.getValue()).submit(new lfl(gzsVar, 1));
    }
}
