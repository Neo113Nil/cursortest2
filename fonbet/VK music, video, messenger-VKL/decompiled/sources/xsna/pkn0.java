package xsna;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: SuspendableMainExecutor.kt */
/* loaded from: classes16.dex */
public final class pkn0 implements Executor {
    public int c;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final ArrayList d = new ArrayList();

    public final void a() {
        this.d.clear();
        this.c = 0;
        this.b.removeCallbacksAndMessages(null);
    }

    public final void b() {
        this.c++;
    }

    public final void c() {
        int i = this.c - 1;
        if (i < 0) {
            i = 0;
        }
        this.c = i;
        if (i != 0) {
            return;
        }
        ArrayList arrayList = this.d;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.b.post((Runnable) it.next());
        }
        arrayList.clear();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        bpn0 bpn0Var = i0q0.a;
        if (this.c != 0) {
            this.d.add(runnable);
        } else {
            this.b.post(runnable);
        }
    }
}
