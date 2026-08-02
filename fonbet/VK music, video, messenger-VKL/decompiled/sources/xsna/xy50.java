package xsna;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.vk.core.performance.score.PerformanceScoreEventType;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: NavigationPerformanceSession.kt */
/* loaded from: classes17.dex */
public final class xy50 implements yw90 {
    public final pb00 a;
    public final urd0 b;
    public final gw90 c;
    public final a d = new a();
    public final a e = new a();
    public final a f = new a();
    public volatile long g = Long.MIN_VALUE;
    public volatile long h;
    public volatile boolean i;
    public final AtomicInteger[] j;
    public volatile String k;

    /* compiled from: NavigationPerformanceSession.kt */
    public static final class a {
        public volatile Long a = null;
    }

    /* compiled from: NavigationPerformanceSession.kt */
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
            a aVar = xy50.this.e;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (aVar.a == null) {
                aVar.a = Long.valueOf(elapsedRealtime);
            }
            View view = this.d;
            view.post(new aaq(4, view, this));
        }
    }

    public xy50(pb00 pb00Var, urd0 urd0Var, ihl ihlVar) {
        this.a = pb00Var;
        this.b = urd0Var;
        this.c = ihlVar;
        int size = PerformanceScoreEventType.h().size();
        AtomicInteger[] atomicIntegerArr = new AtomicInteger[size];
        for (int i = 0; i < size; i++) {
            atomicIntegerArr[i] = new AtomicInteger(0);
        }
        this.j = atomicIntegerArr;
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
        a aVar = this.f;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (aVar.a != null) {
            return;
        }
        aVar.a = Long.valueOf(elapsedRealtime);
    }

    @Override // xsna.yw90
    public final void b(PerformanceScoreEventType performanceScoreEventType) {
        this.j[performanceScoreEventType.ordinal()].getAndIncrement();
        if (performanceScoreEventType.i()) {
            stop();
        }
    }

    @Override // xsna.yw90
    public final void c() {
        this.g = SystemClock.elapsedRealtime();
        this.a.invoke(this);
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
        this.h = (SystemClock.elapsedRealtime() - this.g) + this.h;
        gw90 gw90Var = this.c;
        if (gw90Var != null) {
            gw90Var.c();
        }
    }

    public final void e() {
        int i;
        if (this.i) {
            L l = L.a;
            l.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l, L.LogType.d, new Object[]{"Already sent report"});
            return;
        }
        if (this.b != null) {
            String str = this.k;
            if (str == null) {
                return;
            }
            long d = d(this.e, this.d);
            long d2 = d(this.f, this.d);
            long j = this.h;
            int i2 = this.j[PerformanceScoreEventType.CRASH.ordinal()].get();
            int i3 = this.j[PerformanceScoreEventType.ANR.ordinal()].get();
            gw90 gw90Var = this.c;
            int i4 = gw90Var != null ? gw90Var.e : -1;
            float f = -1.0f;
            if (gw90Var != null && (i = gw90Var.f) != 0) {
                f = gw90Var.g / i;
            }
            urd0.b(new xw90("", str, d, d2, j, i2, i3, i4, f));
        }
        this.i = true;
    }

    @Override // xsna.yw90
    public final void init() {
        a aVar = this.d;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (aVar.a != null) {
            return;
        }
        aVar.a = Long.valueOf(elapsedRealtime);
    }

    @Override // xsna.yw90
    public final synchronized void stop() {
        e();
    }
}
