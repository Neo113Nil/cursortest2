package xsna;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import xsna.jmk;

/* compiled from: CustomAggregator.kt */
/* loaded from: classes3.dex */
public final class jmk {
    public static HandlerThread b;
    public static Handler c;
    public final a a = new a();

    /* compiled from: CustomAggregator.kt */
    public static final class a extends b {
        public final int a = 1;
        public SparseIntArray[] b = new SparseIntArray[9];
        public final ArrayList<WeakReference<Window>> c = new ArrayList<>();
        public final imk d = new Window.OnFrameMetricsAvailableListener() { // from class: xsna.imk
            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                jmk.a aVar = jmk.a.this;
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
        };
    }

    /* compiled from: CustomAggregator.kt */
    public static class b {
    }
}
