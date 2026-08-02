package xsna;

import android.app.Activity;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import xsna.xhl0;
import xsna.xhl0.a;
import xsna.ycq0;

/* compiled from: TaskListenerImpl.java */
/* loaded from: classes13.dex */
public final class k6o0<ListenerTypeT, ResultT extends xhl0.a> {
    public final ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();
    public final HashMap<ListenerTypeT, s5k0> b = new HashMap<>();
    public final xhl0<ResultT> c;
    public final int d;
    public final a<ListenerTypeT, ResultT> e;

    /* compiled from: TaskListenerImpl.java */
    public interface a<ListenerTypeT, ResultT> {
        void b(@NonNull ListenerTypeT listenertypet, @NonNull ResultT resultt);
    }

    public k6o0(@NonNull xhl0<ResultT> xhl0Var, int i, @NonNull a<ListenerTypeT, ResultT> aVar) {
        this.c = xhl0Var;
        this.d = i;
        this.e = aVar;
    }

    public final void a(@Nullable Activity activity, @Nullable Executor executor, @NonNull ListenerTypeT listenertypet) {
        boolean z;
        s5k0 s5k0Var;
        ycq0.b e;
        exc0.i(listenertypet);
        synchronized (this.c.a) {
            try {
                z = (this.c.h & this.d) != 0;
                this.a.add(listenertypet);
                s5k0Var = new s5k0(executor);
                this.b.put(listenertypet, s5k0Var);
                if (activity != null) {
                    exc0.a("Activity is already destroyed!", true ^ activity.isDestroyed());
                    ia0.c.b(activity, listenertypet, new e6(8, this, listenertypet));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            xhl0<ResultT> xhl0Var = this.c;
            synchronized (xhl0Var.a) {
                e = xhl0Var.e();
            }
            boy0 boy0Var = new boy0(this, listenertypet, e, 5);
            Handler handler = s5k0Var.a;
            if (handler != null) {
                handler.post(boy0Var);
            } else if (executor != null) {
                executor.execute(boy0Var);
            } else {
                zhl0.d.execute(boy0Var);
            }
        }
    }

    public final void b() {
        ycq0.b e;
        if ((this.c.h & this.d) != 0) {
            xhl0<ResultT> xhl0Var = this.c;
            synchronized (xhl0Var.a) {
                e = xhl0Var.e();
            }
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                s5k0 s5k0Var = this.b.get(next);
                if (s5k0Var != null) {
                    j6o0 j6o0Var = new j6o0(this, next, e, 0);
                    Handler handler = s5k0Var.a;
                    if (handler == null) {
                        Executor executor = s5k0Var.b;
                        if (executor != null) {
                            executor.execute(j6o0Var);
                        } else {
                            zhl0.d.execute(j6o0Var);
                        }
                    } else {
                        handler.post(j6o0Var);
                    }
                }
            }
        }
    }
}
