package xsna;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import xsna.vzc0;

/* compiled from: PrefetchScheduler.android.kt */
/* loaded from: classes11.dex */
public final class ub2 implements g0d0, bcd0, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
    public static long i;
    public final View b;
    public boolean d;
    public boolean g;
    public long h;
    public final PriorityQueue<hcd0> c = new PriorityQueue<>(11, new tb2(0));
    public final Choreographer e = Choreographer.getInstance();
    public final a f = new a();

    /* compiled from: PrefetchScheduler.android.kt */
    public static final class a implements f0d0 {
        public boolean a;
        public long b;

        @Override // xsna.f0d0
        public final long a() {
            if (this.a) {
                return Long.MAX_VALUE;
            }
            return Math.max(0L, this.b - System.nanoTime());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
    
        if (r0 >= 30.0f) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ub2(View view) {
        float f;
        this.b = view;
        if (i == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                f = display.getRefreshRate();
            }
            f = 60.0f;
            i = (long) (1000000000 / f);
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.g = true;
        }
    }

    @Override // xsna.bcd0
    public final void b(vzc0.a aVar) {
        this.c.add(new hcd0(1, aVar));
        if (this.d) {
            return;
        }
        this.d = true;
        this.b.post(this);
    }

    @Override // xsna.bcd0
    public final void c(vzc0.a aVar) {
        this.c.add(new hcd0(0, aVar));
        if (this.d) {
            return;
        }
        this.d = true;
        this.b.post(this);
    }

    public final boolean d() {
        a aVar = this.f;
        long a2 = aVar.a();
        ld2.a(a2, "compose:lazy:prefetch:available_time_nanos");
        boolean z = true;
        if (a2 > 0) {
            PriorityQueue<hcd0> priorityQueue = this.c;
            if (!priorityQueue.peek().b.c(aVar)) {
                priorityQueue.poll();
                z = false;
            }
            aVar.a = false;
        }
        return z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.g) {
            this.h = j;
            this.b.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.g = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.g = false;
        this.b.removeCallbacks(this);
        this.e.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue<hcd0> priorityQueue = this.c;
        if (!priorityQueue.isEmpty() && this.d && this.g) {
            View view = this.b;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z = System.nanoTime() > (((long) 2) * i) + nanos;
                a aVar = this.f;
                aVar.a = z;
                aVar.b = Math.max(this.h, nanos) + i;
                boolean z2 = false;
                while (!priorityQueue.isEmpty() && !z2) {
                    if (aVar.a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            z2 = d();
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        z2 = d();
                    }
                }
                if (z2) {
                    this.e.postFrameCallback(this);
                } else {
                    this.d = false;
                }
                ld2.a(0L, "compose:lazy:prefetch:available_time_nanos");
                return;
            }
        }
        this.d = false;
    }
}
