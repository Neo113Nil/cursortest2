package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import defpackage.aoe0;
import defpackage.eoe0;
import defpackage.j3f0;
import defpackage.jl40;
import defpackage.n3f0;
import defpackage.pne0;
import defpackage.wb2;
import defpackage.y60;
import defpackage.zne0;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 .2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002/0B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\tJ\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\tR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010&\u001a\n %*\u0004\u0018\u00010$0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010#R\u0016\u0010,\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u00061"}, d2 = {"Landroidx/compose/foundation/lazy/layout/AndroidPrefetchScheduler;", "Leoe0;", "Lj3f0;", "Landroid/view/View$OnAttachStateChangeListener;", "Ljava/lang/Runnable;", "Landroid/view/Choreographer$FrameCallback;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "", "runRequest", "()Z", "Lzy11;", "startExecution", "()V", "run", "", "frameTimeNanos", "doFrame", "(J)V", "Lzne0;", "prefetchRequest", "scheduleLowPriorityPrefetch", "(Lzne0;)V", "scheduleHighPriorityPrefetch", "v", "onViewAttachedToWindow", "onViewDetachedFromWindow", "Landroid/view/View;", "Ljava/util/PriorityQueue;", "Ln3f0;", "prefetchRequests", "Ljava/util/PriorityQueue;", "prefetchScheduled", "Z", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "choreographer", "Landroid/view/Choreographer;", "Landroidx/compose/foundation/lazy/layout/AndroidPrefetchScheduler$a;", "scope", "Landroidx/compose/foundation/lazy/layout/AndroidPrefetchScheduler$a;", "isActive", "frameStartTimeNanos", "J", "Companion", "a", "wb2", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AndroidPrefetchScheduler implements eoe0, j3f0, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
    public static final int $stable = 8;
    public static final wb2 Companion = new wb2();
    private static long frameIntervalNs;
    private long frameStartTimeNanos;
    private boolean isActive;
    private boolean prefetchScheduled;
    private final View view;
    private final PriorityQueue<n3f0> prefetchRequests = new PriorityQueue<>(11, new y60(2));
    private final Choreographer choreographer = Choreographer.getInstance();
    private final a scope = new a();

    public static final class a implements aoe0 {
        public boolean a;
        public long b;

        public final long a() {
            return this.a ? ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED : Math.max(0L, this.b - System.nanoTime());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0044, code lost:
    
        if (r0 >= 30.0f) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AndroidPrefetchScheduler(View view) {
        float f;
        this.view = view;
        Companion.getClass();
        if (frameIntervalNs == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                f = display.getRefreshRate();
            }
            f = 60.0f;
            frameIntervalNs = (long) (1.0E9f / f);
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            onViewAttachedToWindow(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int prefetchRequests$lambda$0(n3f0 n3f0Var, n3f0 n3f0Var2) {
        return jl40.q(n3f0Var2.a, n3f0Var.a);
    }

    private final boolean runRequest() {
        long a2 = this.scope.a();
        Trace.setCounter("compose:lazy:prefetch:available_time_nanos", a2);
        boolean z = true;
        if (a2 > 0) {
            if (!((pne0) this.prefetchRequests.peek().b).c(this.scope)) {
                this.prefetchRequests.poll();
                z = false;
            }
            this.scope.a = false;
        }
        return z;
    }

    private final void startExecution() {
        if (this.prefetchScheduled) {
            return;
        }
        this.prefetchScheduled = true;
        this.view.post(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long frameTimeNanos) {
        if (this.isActive) {
            this.frameStartTimeNanos = frameTimeNanos;
            this.view.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v) {
        this.isActive = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v) {
        this.isActive = false;
        this.view.removeCallbacks(this);
        this.choreographer.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.prefetchRequests.isEmpty() || !this.prefetchScheduled || !this.isActive || this.view.getWindowVisibility() != 0) {
            this.prefetchScheduled = false;
            return;
        }
        long nanos = TimeUnit.MILLISECONDS.toNanos(this.view.getDrawingTime());
        this.scope.a = System.nanoTime() > (2 * frameIntervalNs) + nanos;
        this.scope.b = Math.max(this.frameStartTimeNanos, nanos) + frameIntervalNs;
        boolean z = false;
        while (!this.prefetchRequests.isEmpty() && !z) {
            if (this.scope.a) {
                Trace.beginSection("compose:lazy:prefetch:idle_frame");
                try {
                    z = runRequest();
                } finally {
                    Trace.endSection();
                }
            } else {
                z = runRequest();
            }
        }
        if (z) {
            this.choreographer.postFrameCallback(this);
        } else {
            this.prefetchScheduled = false;
        }
        Trace.setCounter("compose:lazy:prefetch:available_time_nanos", 0L);
    }

    @Override // defpackage.j3f0
    public void scheduleHighPriorityPrefetch(zne0 prefetchRequest) {
        this.prefetchRequests.add(new n3f0(1, prefetchRequest));
        startExecution();
    }

    @Override // defpackage.j3f0
    public void scheduleLowPriorityPrefetch(zne0 prefetchRequest) {
        this.prefetchRequests.add(new n3f0(0, prefetchRequest));
        startExecution();
    }

    @Override // defpackage.eoe0
    public void schedulePrefetch(zne0 zne0Var) {
        scheduleHighPriorityPrefetch(zne0Var);
    }
}
