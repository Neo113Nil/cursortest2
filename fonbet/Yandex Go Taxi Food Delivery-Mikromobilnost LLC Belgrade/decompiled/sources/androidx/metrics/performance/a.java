package androidx.metrics.performance;

import android.os.Handler;
import android.os.HandlerThread;
import android.view.Window;
import defpackage.n4x;
import defpackage.o4x;
import defpackage.scc;
import defpackage.t9h0;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ o4x b;

    public /* synthetic */ a(boolean z, o4x o4xVar) {
        this.a = z;
        this.b = o4xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        o4x o4xVar = this.b;
        n4x n4xVar = o4xVar.o;
        Window window = o4xVar.j;
        if (!this.a) {
            DelegatingFrameMetricsListener.Companion.getClass();
            DelegatingFrameMetricsListener delegatingFrameMetricsListener = (DelegatingFrameMetricsListener) window.getDecorView().getTag(t9h0.metricsDelegator);
            if (delegatingFrameMetricsListener != null) {
                delegatingFrameMetricsListener.remove(n4xVar);
                if (delegatingFrameMetricsListener.getDelegates().isEmpty()) {
                    try {
                        window.removeOnFrameMetricsAvailableListener(delegatingFrameMetricsListener);
                    } catch (IllegalArgumentException unused) {
                    }
                    window.getDecorView().setTag(t9h0.metricsDelegator, null);
                }
            }
            o4xVar.l = 0L;
            return;
        }
        if (o4xVar.l == 0) {
            DelegatingFrameMetricsListener.Companion.getClass();
            if (window.getDecorView().isHardwareAccelerated()) {
                DelegatingFrameMetricsListener delegatingFrameMetricsListener2 = (DelegatingFrameMetricsListener) window.getDecorView().getTag(t9h0.metricsDelegator);
                if (delegatingFrameMetricsListener2 == null) {
                    DelegatingFrameMetricsListener delegatingFrameMetricsListener3 = new DelegatingFrameMetricsListener(scc.i(n4xVar));
                    handler = DelegatingFrameMetricsListener.frameMetricsHandler;
                    if (handler == null) {
                        HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                        handlerThread.start();
                        DelegatingFrameMetricsListener.frameMetricsHandler = new Handler(handlerThread.getLooper());
                    }
                    window.getDecorView().setTag(t9h0.metricsDelegator, delegatingFrameMetricsListener3);
                    handler2 = DelegatingFrameMetricsListener.frameMetricsHandler;
                    window.addOnFrameMetricsAvailableListener(delegatingFrameMetricsListener3, handler2);
                } else {
                    delegatingFrameMetricsListener2.add(n4xVar);
                }
                o4xVar.l = System.nanoTime();
            }
        }
    }
}
