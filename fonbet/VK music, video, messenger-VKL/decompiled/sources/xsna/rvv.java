package xsna;

import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: IdleTaskHandler.kt */
/* loaded from: classes.dex */
public final class rvv implements MessageQueue.IdleHandler {
    public static final Set<tvv> f = Collections.newSetFromMap(Collections.synchronizedMap(new WeakHashMap()));
    public final long b;
    public final Handler c;
    public final LinkedBlockingDeque d;
    public boolean e;

    public /* synthetic */ rvv() {
        this(400L);
    }

    public final void a() {
        LinkedBlockingDeque linkedBlockingDeque = this.d;
        new ArrayList(linkedBlockingDeque);
        linkedBlockingDeque.clear();
        this.c.removeCallbacksAndMessages(null);
    }

    public final void b(long j, Runnable runnable) {
        long uptimeMillis = SystemClock.uptimeMillis() + j;
        ovv ovvVar = new ovv(this, runnable);
        Handler handler = this.c;
        handler.postAtTime(ovvVar, runnable, uptimeMillis);
        handler.postAtTime(new qvv(this, runnable), runnable, uptimeMillis + this.b);
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        boolean z;
        Runnable runnable;
        Set<tvv> set = f;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                if (!((tvv) it.next()).isIdle()) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        LinkedBlockingDeque linkedBlockingDeque = this.d;
        if (!linkedBlockingDeque.isEmpty() && z && (runnable = (Runnable) linkedBlockingDeque.poll()) != null) {
            this.c.removeCallbacksAndMessages(runnable);
            runnable.run();
        }
        boolean z2 = !linkedBlockingDeque.isEmpty();
        this.e = z2;
        return z2;
    }

    public rvv(long j) {
        this.b = j;
        this.c = new Handler(Looper.getMainLooper());
        this.d = new LinkedBlockingDeque();
    }
}
