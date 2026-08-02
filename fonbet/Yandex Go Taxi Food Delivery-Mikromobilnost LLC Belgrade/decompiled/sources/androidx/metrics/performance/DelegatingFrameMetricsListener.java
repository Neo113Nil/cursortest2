package androidx.metrics.performance;

import android.os.Handler;
import android.view.FrameMetrics;
import android.view.Window;
import defpackage.kqh;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0012\u0010\u0011R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Landroidx/metrics/performance/DelegatingFrameMetricsListener;", "Landroid/view/Window$OnFrameMetricsAvailableListener;", "", "delegates", "<init>", "(Ljava/util/List;)V", "Landroid/view/Window;", "window", "Landroid/view/FrameMetrics;", "frameMetrics", "", "dropCount", "Lzy11;", "onFrameMetricsAvailable", "(Landroid/view/Window;Landroid/view/FrameMetrics;I)V", "delegate", "add", "(Landroid/view/Window$OnFrameMetricsAvailableListener;)V", "remove", "Ljava/util/List;", "getDelegates", "()Ljava/util/List;", "Companion", "kqh", "metrics-performance_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class DelegatingFrameMetricsListener implements Window.OnFrameMetricsAvailableListener {
    public static final kqh Companion = new kqh();
    private static Handler frameMetricsHandler;
    private final List<Window.OnFrameMetricsAvailableListener> delegates;

    public DelegatingFrameMetricsListener(List<Window.OnFrameMetricsAvailableListener> list) {
        this.delegates = list;
    }

    public final void add(Window.OnFrameMetricsAvailableListener delegate) {
        synchronized (this) {
            this.delegates.add(delegate);
        }
    }

    public final List<Window.OnFrameMetricsAvailableListener> getDelegates() {
        return this.delegates;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int dropCount) {
        synchronized (this) {
            Iterator<Window.OnFrameMetricsAvailableListener> it = this.delegates.iterator();
            while (it.hasNext()) {
                it.next().onFrameMetricsAvailable(window, frameMetrics, dropCount);
            }
        }
    }

    public final void remove(Window.OnFrameMetricsAvailableListener delegate) {
        synchronized (this) {
            this.delegates.remove(delegate);
        }
    }
}
