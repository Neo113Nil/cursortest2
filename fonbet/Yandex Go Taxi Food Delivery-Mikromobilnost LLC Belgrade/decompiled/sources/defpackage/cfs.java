package defpackage;

import android.app.Activity;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Display;
import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import defpackage.cfs;
import ru.yandex.taxi.perf.FrameMetricsListenerImpl$displayListener$1;

/* loaded from: classes9.dex */
public final class cfs implements zes {
    public final Activity a;
    public final HandlerThread b;
    public final Handler c;
    public final Handler d;
    public float e;
    public final DisplayManager f;
    public final boolean g;
    public long h;
    public long i;
    public int j;
    public int k;
    public long l;
    public volatile boolean m;
    public boolean n;
    public final afs o;
    public final bfs p;
    public final FrameMetricsListenerImpl$displayListener$1 q;

    /* JADX WARN: Type inference failed for: r3v7, types: [bfs] */
    /* JADX WARN: Type inference failed for: r3v8, types: [ru.yandex.taxi.perf.FrameMetricsListenerImpl$displayListener$1] */
    public cfs(Activity activity) {
        View decorView;
        Display display;
        this.a = activity;
        HandlerThread handlerThread = new HandlerThread("FrameMetricsThread");
        handlerThread.start();
        this.b = handlerThread;
        this.c = new Handler(handlerThread.getLooper());
        this.d = new Handler(Looper.getMainLooper());
        Window window = activity.getWindow();
        this.e = (window == null || (decorView = window.getDecorView()) == null || (display = decorView.getDisplay()) == null) ? 60.0f : display.getRefreshRate();
        this.f = (DisplayManager) activity.getSystemService(DisplayManager.class);
        this.g = Build.VERSION.SDK_INT >= 31;
        this.o = new afs(this, 2);
        this.p = new Window.OnFrameMetricsAvailableListener() { // from class: bfs
            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public final void onFrameMetricsAvailable(Window window2, FrameMetrics frameMetrics, int i) {
                FrameMetrics frameMetrics2 = new FrameMetrics(frameMetrics);
                long metric = frameMetrics2.getMetric(8);
                cfs cfsVar = cfs.this;
                long metric2 = cfsVar.g ? frameMetrics2.getMetric(13) : (long) (1.0E9d / cfsVar.e);
                if (metric2 >= 1.0E9d) {
                    metric2 = metric2 > 0 ? metric2 - frameMetrics2.getMetric(10) : -1L;
                }
                long j = metric - metric2;
                if (metric2 > 0 && j > 0) {
                    cfsVar.h += j;
                }
                if (metric > cfsVar.i) {
                    cfsVar.i = metric;
                }
                cfsVar.j += i;
                cfsVar.k = i + 1 + cfsVar.k;
            }
        };
        this.q = new DisplayManager.DisplayListener() { // from class: ru.yandex.taxi.perf.FrameMetricsListenerImpl$displayListener$1
            @Override // android.hardware.display.DisplayManager.DisplayListener
            public void onDisplayAdded(int displayId) {
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public void onDisplayChanged(int displayId) {
                View decorView2;
                Display display2;
                Window window2 = cfs.this.a.getWindow();
                if (window2 == null || (decorView2 = window2.getDecorView()) == null || (display2 = decorView2.getDisplay()) == null) {
                    return;
                }
                if (display2.getDisplayId() != displayId) {
                    display2 = null;
                }
                if (display2 == null) {
                    return;
                }
                cfs.this.e = display2.getRefreshRate();
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public void onDisplayRemoved(int displayId) {
            }
        };
    }

    public final void a() {
        this.c.post(new afs(this, 1));
    }

    public final void b(tls tlsVar) {
        if (this.m) {
            this.c.post(new iy2(15, tlsVar, this));
        } else {
            tlsVar.invoke(null);
        }
    }

    public final yes c() {
        if (!this.m) {
            return null;
        }
        this.m = false;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.c.removeCallbacks(this.o);
        DisplayManager displayManager = this.f;
        if (displayManager != null) {
            displayManager.unregisterDisplayListener(this.q);
        }
        if (this.n) {
            this.d.post(new ejp(12, this));
        }
        int i = this.k;
        double d = 0.0d;
        double d2 = i > 0 ? this.j / i : 0.0d;
        if (d2 <= 0.05000000074505806d) {
            double d3 = (elapsedRealtime - this.l) / 1000.0d;
            if (this.g && d3 > 1.0d) {
                d = (this.h / 1000000.0d) / d3;
            }
            return new yes(d, (int) (this.i / 1000000.0d));
        }
        xby.l(jst.e, "FrameMeasurement.DropRatioExceeded", null, null, "Drop ratio has been exceeded " + d2 + ", but max is 0.05", 6);
        return null;
    }
}
