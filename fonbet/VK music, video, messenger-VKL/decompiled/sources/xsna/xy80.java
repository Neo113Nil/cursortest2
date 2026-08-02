package xsna;

import android.app.Activity;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.OrientationEventListener;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: OrientationListener.java */
/* loaded from: classes17.dex */
public final class xy80 extends OrientationEventListener {
    public final WeakReference<Activity> a;
    public final CopyOnWriteArraySet b;
    public int c;
    public int d;
    public int e;
    public long f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public final boolean l;
    public final a m;
    public final b n;

    /* compiled from: OrientationListener.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            xy80 xy80Var = xy80.this;
            Activity activity = xy80Var.a.get();
            if (activity != null) {
                try {
                    activity.setRequestedOrientation(xy80Var.d);
                } catch (Throwable th) {
                    com.vk.metrics.eventtracking.b.a.a(new IllegalStateException("" + activity.getLocalClassName(), th));
                }
            }
        }
    }

    /* compiled from: OrientationListener.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            xy80 xy80Var = xy80.this;
            Iterator it = xy80Var.b.iterator();
            while (it.hasNext()) {
                ((c) it.next()).a(xy80Var.e);
            }
        }
    }

    /* compiled from: OrientationListener.java */
    public interface c {
        void a(int i);
    }

    public xy80(Activity activity) {
        super(activity);
        this.b = new CopyOnWriteArraySet();
        this.c = -1;
        this.d = -1;
        this.f = 0L;
        this.m = new a();
        this.n = new b();
        this.a = new WeakReference<>(activity);
        boolean isInPictureInPictureMode = activity.isInPictureInPictureMode();
        c63 c63Var = c63.a;
        Activity b2 = c63.b();
        this.l = ((!isInPictureInPictureMode || b2 == null) ? iah0.d(activity) : iah0.d(b2)) == 2;
        this.e = activity.getResources().getConfiguration().orientation;
    }

    public final void a(c cVar) {
        this.b.add(cVar);
    }

    public final void b(int i) {
        Activity activity = this.a.get();
        if (activity != null) {
            this.c = activity.getRequestedOrientation();
            this.h = true;
            this.k = false;
            this.j = false;
            if (this.i && i == 0) {
                i = 8;
            }
            activity.setRequestedOrientation(i);
        }
    }

    public final boolean c() {
        return this.h || this.j || this.k;
    }

    public final boolean d(Activity activity) {
        if (SystemClock.elapsedRealtime() - this.f > 1000) {
            this.g = Settings.System.getInt(activity.getContentResolver(), "accelerometer_rotation", 1) == 0;
            this.f = SystemClock.elapsedRealtime();
        }
        return this.g;
    }

    public final void e() {
        Activity activity = this.a.get();
        if (activity != null) {
            this.c = activity.getRequestedOrientation();
            b(0);
            this.h = false;
            this.j = false;
            this.k = true;
        }
    }

    public final void f() {
        Activity activity = this.a.get();
        if (activity != null) {
            this.c = activity.getRequestedOrientation();
            b(1);
            this.h = false;
            this.k = false;
            this.j = true;
        }
    }

    public final void g() {
        this.a.get().setRequestedOrientation(this.c);
    }

    public final void h(int i) {
        if (this.d != i) {
            this.d = i;
            a aVar = this.m;
            pro0.d(aVar);
            i0q0.d(150L, aVar);
        }
    }

    public final void i() {
        this.h = false;
        this.k = false;
        this.j = false;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        int i2;
        if (i == -1) {
            return;
        }
        double radians = Math.toRadians(i - 45);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        boolean z = sin < ConnectivityTracker.DEFAULT_UPLINK_BITRATE && cos < ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        boolean z2 = sin > ConnectivityTracker.DEFAULT_UPLINK_BITRATE && cos < ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        boolean z3 = sin > ConnectivityTracker.DEFAULT_UPLINK_BITRATE && cos > ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        boolean z4 = sin < ConnectivityTracker.DEFAULT_UPLINK_BITRATE && cos > ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        if (this.l) {
            if (z4) {
                this.i = false;
                i2 = 0;
            } else if (z3) {
                this.i = false;
                i2 = 1;
            } else if (z2) {
                this.i = true;
                i2 = 8;
            } else {
                if (z) {
                    this.i = true;
                    i2 = 9;
                }
                i2 = -1;
            }
        } else if (z4) {
            this.i = false;
            i2 = 1;
        } else if (z) {
            this.i = false;
            i2 = 0;
        } else if (z3) {
            this.i = true;
            i2 = 8;
        } else {
            if (z2) {
                this.i = false;
                return;
            }
            i2 = -1;
        }
        Activity activity = this.a.get();
        if (activity != null) {
            if (this.k) {
                if (i2 == 0 || i2 == 8) {
                    h(i2);
                }
            } else if (!this.j) {
                boolean d = d(activity);
                if (i2 != this.c && !d) {
                    this.h = false;
                }
                if (!this.h) {
                    this.c = -1;
                    if (d) {
                        h(activity.getResources().getConfiguration().orientation);
                    } else {
                        h(i2);
                    }
                }
            } else if (i2 == 1 || i2 == 9) {
                h(i2);
            }
            if (this.e == i2 || d(activity)) {
                return;
            }
            this.e = i2;
            b bVar = this.n;
            pro0.d(bVar);
            i0q0.d(150L, bVar);
        }
    }
}
