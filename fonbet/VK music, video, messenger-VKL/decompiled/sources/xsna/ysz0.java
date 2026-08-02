package xsna;

import android.util.Log;
import java.util.Deque;

/* compiled from: com.google.android.gms:play-services-stats@@17.0.1 */
/* loaded from: classes13.dex */
public final /* synthetic */ class ysz0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ysz0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                l8x0 l8x0Var = (l8x0) this.c;
                synchronized (l8x0Var.a) {
                    try {
                        if (l8x0Var.b()) {
                            Log.e("WakeLock", String.valueOf(l8x0Var.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            l8x0Var.d();
                            if (l8x0Var.b()) {
                                l8x0Var.c = 1;
                                l8x0Var.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            default:
                Runnable runnable = (Runnable) this.c;
                Deque deque = (Deque) rt20.c.get();
                exc0.i(deque);
                deque.add(runnable);
                if (deque.size() <= 1) {
                    do {
                        runnable.run();
                        deque.removeFirst();
                        runnable = (Runnable) deque.peekFirst();
                    } while (runnable != null);
                    return;
                }
                return;
        }
    }
}
