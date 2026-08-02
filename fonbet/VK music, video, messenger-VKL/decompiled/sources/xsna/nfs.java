package xsna;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: FrameMetricsAggregator.java */
/* loaded from: classes11.dex */
public class nfs {
    public final a a = new a();

    /* compiled from: FrameMetricsAggregator.java */
    public static class a extends b {
        public static HandlerThread e;
        public static Handler f;
        public SparseIntArray[] b = new SparseIntArray[9];
        public final ArrayList<WeakReference<Activity>> c = new ArrayList<>();
        public final WindowOnFrameMetricsAvailableListenerC3399a d = new WindowOnFrameMetricsAvailableListenerC3399a();
        public final int a = 1;

        /* compiled from: FrameMetricsAggregator.java */
        /* renamed from: xsna.nfs$a$a, reason: collision with other inner class name */
        public class WindowOnFrameMetricsAvailableListenerC3399a implements Window.OnFrameMetricsAvailableListener {
            public WindowOnFrameMetricsAvailableListenerC3399a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                a aVar = a.this;
                if ((aVar.a & 1) != 0) {
                    SparseIntArray sparseIntArray = aVar.b[0];
                    long metric = frameMetrics.getMetric(8);
                    if (sparseIntArray != null) {
                        int i2 = (int) ((500000 + metric) / 1000000);
                        if (metric >= 0) {
                            sparseIntArray.put(i2, sparseIntArray.get(i2) + 1);
                        }
                    }
                }
            }
        }
    }

    /* compiled from: FrameMetricsAggregator.java */
    public static class b {
    }

    public final void a(Activity activity) {
        a aVar = this.a;
        ArrayList<WeakReference<Activity>> arrayList = aVar.c;
        Iterator<WeakReference<Activity>> it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            WeakReference<Activity> next = it.next();
            if (next.get() == activity) {
                arrayList.remove(next);
                break;
            }
        }
        activity.getWindow().removeOnFrameMetricsAvailableListener(aVar.d);
    }
}
