package defpackage;

import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import androidx.metrics.performance.DelegatingOnPreDrawListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class o4x extends udq0 {
    public final WeakReference f;
    public final xva0 g;
    public final ArrayList h;
    public final mes i;
    public final Window j;
    public long k;
    public long l;
    public long m;
    public final nes n;
    public final n4x o;

    /* JADX WARN: Type inference failed for: r4v3, types: [n4x] */
    public o4x(final l4x l4xVar, View view, Window window) {
        this.f = new WeakReference(view);
        Choreographer.getInstance();
        View rootView = view.getRootView();
        Object tag = rootView.getTag(t9h0.metricsStateHolder);
        if (tag == null) {
            tag = new xva0();
            rootView.setTag(t9h0.metricsStateHolder, tag);
        }
        this.g = (xva0) tag;
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        this.i = new mes(arrayList);
        new m4x(l4xVar, this);
        this.j = window;
        this.n = new nes(arrayList);
        this.o = new Window.OnFrameMetricsAvailableListener() { // from class: n4x
            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public final void onFrameMetricsAvailable(Window window2, FrameMetrics frameMetrics, int i) {
                long metric = frameMetrics.getMetric(10);
                o4x o4xVar = this;
                long max = Math.max(metric, o4xVar.m);
                if (max < o4xVar.l || max == o4xVar.k) {
                    return;
                }
                float a0 = o4xVar.a0(frameMetrics);
                l4x l4xVar2 = l4xVar;
                l4xVar2.a.b(o4xVar.b0(max, (long) (a0 * l4xVar2.d), frameMetrics));
                o4xVar.k = max;
            }
        };
    }

    public long a0(FrameMetrics frameMetrics) {
        View view = (View) this.f.get();
        DelegatingOnPreDrawListener.Companion.getClass();
        return mqh.a(view);
    }

    public nes b0(long j, long j2, FrameMetrics frameMetrics) {
        long metric = frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
        long j3 = j + metric;
        this.m = j3;
        yuf0 yuf0Var = this.g.a;
        if (yuf0Var != null) {
            yuf0Var.x(j, j3, this.h);
        }
        boolean z = metric > j2;
        long metric2 = frameMetrics.getMetric(8);
        nes nesVar = this.n;
        nesVar.b = j;
        nesVar.c = metric;
        nesVar.d = z;
        nesVar.e = metric2;
        return nesVar;
    }
}
