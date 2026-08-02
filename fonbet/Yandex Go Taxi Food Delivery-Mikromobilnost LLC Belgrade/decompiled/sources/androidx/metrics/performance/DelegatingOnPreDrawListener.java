package androidx.metrics.performance;

import android.os.Handler;
import android.os.Message;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewTreeObserver;
import defpackage.kx6;
import defpackage.ky60;
import defpackage.mqh;
import defpackage.t9h0;
import defpackage.xva0;
import defpackage.yuf0;
import defpackage.yva0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u0000 &2\u00020\u0001:\u0001'B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Landroidx/metrics/performance/DelegatingOnPreDrawListener;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "Landroid/view/View;", "decorView", "Landroid/view/Choreographer;", "choreographer", "", "Lky60;", "delegates", "<init>", "(Landroid/view/View;Landroid/view/Choreographer;Ljava/util/List;)V", "", "getFrameStartTime", "()J", "", "onPreDraw", "()Z", "delegate", "Lzy11;", "add", "(Lky60;)V", "remove", "Landroid/view/Choreographer;", "getChoreographer", "()Landroid/view/Choreographer;", "Ljava/util/List;", "getDelegates", "()Ljava/util/List;", "Ljava/lang/ref/WeakReference;", "decorViewRef", "Ljava/lang/ref/WeakReference;", "getDecorViewRef", "()Ljava/lang/ref/WeakReference;", "Lxva0;", "metricsStateHolder", "Lxva0;", "getMetricsStateHolder", "()Lxva0;", "Companion", "mqh", "metrics-performance_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public class DelegatingOnPreDrawListener implements ViewTreeObserver.OnPreDrawListener {
    public static final mqh Companion = new mqh();
    private static final Field choreographerLastFrameTimeField;
    private final Choreographer choreographer;
    private final WeakReference<View> decorViewRef;
    private final List<ky60> delegates;
    private final xva0 metricsStateHolder;

    static {
        Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
        choreographerLastFrameTimeField = declaredField;
        declaredField.setAccessible(true);
    }

    public DelegatingOnPreDrawListener(View view, Choreographer choreographer, List<ky60> list) {
        this.choreographer = choreographer;
        this.delegates = list;
        this.decorViewRef = new WeakReference<>(view);
        View rootView = view.getRootView();
        Object tag = rootView.getTag(t9h0.metricsStateHolder);
        if (tag == null) {
            tag = new xva0();
            rootView.setTag(t9h0.metricsStateHolder, tag);
        }
        this.metricsStateHolder = (xva0) tag;
    }

    private final long getFrameStartTime() {
        return ((Long) choreographerLastFrameTimeField.get(this.choreographer)).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPreDraw$lambda$4$lambda$3$lambda$1(View view, DelegatingOnPreDrawListener delegatingOnPreDrawListener, long j) {
        long nanoTime = System.nanoTime();
        Companion.getClass();
        long a = mqh.a(view);
        synchronized (delegatingOnPreDrawListener) {
            Iterator<ky60> it = delegatingOnPreDrawListener.delegates.iterator();
            while (it.hasNext()) {
                long j2 = j;
                it.next().a(j2, nanoTime - j, a);
                j = j2;
            }
        }
        yuf0 yuf0Var = delegatingOnPreDrawListener.metricsStateHolder.a;
        if (yuf0Var != null) {
            synchronized (((ArrayList) yuf0Var.b)) {
                int size = ((ArrayList) yuf0Var.b).size();
                while (true) {
                    size--;
                    if (-1 < size) {
                        if (((yva0) ((ArrayList) yuf0Var.b).get(size)).b != -1) {
                            yuf0Var.L((yva0) ((ArrayList) yuf0Var.b).remove(size));
                        }
                    }
                }
            }
        }
    }

    public final void add(ky60 delegate) {
        synchronized (this) {
            this.delegates.add(delegate);
        }
    }

    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    public final WeakReference<View> getDecorViewRef() {
        return this.decorViewRef;
    }

    public final List<ky60> getDelegates() {
        return this.delegates;
    }

    public final xva0 getMetricsStateHolder() {
        return this.metricsStateHolder;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        View view = this.decorViewRef.get();
        if (view != null) {
            long frameStartTime = getFrameStartTime();
            Handler handler = view.getHandler();
            Message obtain = Message.obtain(view.getHandler(), new kx6(view, this, frameStartTime, 3));
            obtain.setAsynchronous(true);
            handler.sendMessageAtFrontOfQueue(obtain);
        }
        return true;
    }

    public final void remove(ky60 delegate) {
        synchronized (this) {
            this.delegates.remove(delegate);
        }
    }
}
