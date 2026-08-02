package xsna;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.vk.core.performance.score.PerformanceScoreEventType;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DefaultProductScoreSession.kt */
/* loaded from: classes17.dex */
public final class dll implements yw90 {
    public final PerformanceScoreProduct a;
    public final px30 b;
    public final gw90 c;
    public final urd0 d;
    public final a e = new a();
    public final a f = new a();
    public final a g = new a();
    public volatile long h = Long.MIN_VALUE;
    public volatile long i;
    public volatile boolean j;
    public volatile boolean k;
    public final AtomicInteger[] l;

    /* compiled from: DefaultProductScoreSession.kt */
    public static final class a {
        public volatile Long a = null;
    }

    /* compiled from: DefaultProductScoreSession.kt */
    public static final class b implements ViewTreeObserver.OnDrawListener {
        public boolean b;
        public final /* synthetic */ View d;

        public b(View view) {
            this.d = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            if (this.b) {
                return;
            }
            this.b = true;
            a aVar = dll.this.f;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (aVar.a == null) {
                aVar.a = Long.valueOf(elapsedRealtime);
            }
            View view = this.d;
            view.post(new c0(2, view, this));
        }
    }

    public dll(PerformanceScoreProduct performanceScoreProduct, px30 px30Var, ihl ihlVar, urd0 urd0Var) {
        this.a = performanceScoreProduct;
        this.b = px30Var;
        this.c = ihlVar;
        this.d = urd0Var;
        int size = PerformanceScoreEventType.h().size();
        AtomicInteger[] atomicIntegerArr = new AtomicInteger[size];
        for (int i = 0; i < size; i++) {
            atomicIntegerArr[i] = new AtomicInteger(0);
        }
        this.l = atomicIntegerArr;
    }

    public static long d(a aVar, a aVar2) {
        if (aVar2.a == null) {
            return -1L;
        }
        if (aVar2.a == null || aVar.a == null) {
            return Long.MAX_VALUE;
        }
        Long l = aVar.a;
        long longValue = l != null ? l.longValue() : Long.MAX_VALUE;
        Long l2 = aVar2.a;
        return longValue - (l2 != null ? l2.longValue() : Long.MAX_VALUE);
    }

    @Override // xsna.yw90
    public final void a() {
        a aVar = this.g;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (aVar.a != null) {
            return;
        }
        aVar.a = Long.valueOf(elapsedRealtime);
    }

    @Override // xsna.yw90
    public final void b(PerformanceScoreEventType performanceScoreEventType) {
        this.l[performanceScoreEventType.ordinal()].getAndIncrement();
        if (performanceScoreEventType.i()) {
            stop();
        }
    }

    @Override // xsna.yw90
    public final void c() {
        this.h = SystemClock.elapsedRealtime();
        this.b.invoke(this);
        gw90 gw90Var = this.c;
        if (gw90Var != null) {
            gw90Var.b();
        }
    }

    @Override // xsna.yw90
    public final void d3(View view) {
        view.getViewTreeObserver().addOnDrawListener(new b(view));
    }

    @Override // xsna.yw90
    public final void deactivate() {
        this.i = (SystemClock.elapsedRealtime() - this.h) + this.i;
        gw90 gw90Var = this.c;
        if (gw90Var != null) {
            gw90Var.c();
        }
    }

    @Override // xsna.yw90
    public final void init() {
        a aVar = this.e;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (aVar.a != null) {
            return;
        }
        aVar.a = Long.valueOf(elapsedRealtime);
    }

    @Override // xsna.yw90
    public final void stop() {
        int i;
        this.j = true;
        if (this.j) {
            if (this.k) {
                L l = L.a;
                l.getClass();
                if (L.m(LoggerOutputTarget.NONE)) {
                    return;
                }
                L.u(l, L.LogType.w, new Object[]{"Already sent report."});
                return;
            }
            if (this.d != null) {
                String h = this.a.h();
                String i2 = this.a.i();
                long d = d(this.f, this.e);
                long d2 = d(this.g, this.e);
                long j = this.i;
                int i3 = this.l[PerformanceScoreEventType.CRASH.ordinal()].get();
                int i4 = this.l[PerformanceScoreEventType.ANR.ordinal()].get();
                gw90 gw90Var = this.c;
                urd0.b(new xw90(h, i2, d, d2, j, i3, i4, gw90Var != null ? gw90Var.e : -1, (gw90Var == null || (i = gw90Var.f) == 0) ? -1.0f : gw90Var.g / i));
            }
            this.k = true;
        }
    }
}
