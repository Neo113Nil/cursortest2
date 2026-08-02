package xsna;

import android.content.Context;
import android.view.ViewConfiguration;
import com.vkontakte.android.VKApplication;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class twv implements Runnable {
    public final /* synthetic */ int b;

    public /* synthetic */ twv(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                vwv.b.getClass();
                ((xal) vwv.g.getValue()).d();
                return;
            case 1:
                q6r0.j();
                return;
            default:
                VKApplication.a aVar = VKApplication.c;
                d58 d58Var = d58.a;
                if (d58.b) {
                    return;
                }
                d58.c = true;
                dhr0.a.getClass();
                Context E = dhr0.E();
                ViewConfiguration.get(E);
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < 6; i++) {
                    if (d58.c) {
                        arrayList.add(new j58(E));
                        d58 d58Var2 = d58.a;
                    }
                }
                Iterator it = j5g.y0(arrayList).iterator();
                while (it.hasNext()) {
                    d58.f.a((j58) it.next());
                }
                ReentrantLock reentrantLock = d58.d;
                reentrantLock.lock();
                try {
                    d58.c = false;
                    d58.e.signalAll();
                    s3q0 s3q0Var = s3q0.a;
                    return;
                } finally {
                    reentrantLock.unlock();
                }
        }
    }
}
