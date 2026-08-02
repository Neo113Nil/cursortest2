package defpackage;

import android.os.Process;
import java.util.ArrayDeque;
import java.util.Deque;

/* loaded from: classes10.dex */
public final class h30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ h30(int i, Runnable runnable) {
        this.a = i;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Runnable runnable = this.b;
        switch (i) {
            case 0:
                Process.setThreadPriority(10);
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                Deque deque = (Deque) sk20.b.get();
                cvw.l(deque);
                deque.add(runnable);
                if (deque.size() <= 1) {
                    do {
                        runnable.run();
                        deque.removeFirst();
                        runnable = (Runnable) deque.peekFirst();
                    } while (runnable != null);
                }
                break;
            default:
                sk20.b.set(new ArrayDeque());
                runnable.run();
                break;
        }
    }
}
