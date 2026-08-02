package xsna;

import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ClipControlsHiderDelegator.kt */
/* loaded from: classes17.dex */
public final class soc implements roc {
    public final ConcurrentHashMap.KeySetView<roc, Boolean> b = ConcurrentHashMap.newKeySet();
    public final bpn0 c = new bpn0(new l9(6));
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final a e = new a();

    /* compiled from: ClipControlsHiderDelegator.kt */
    public final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            soc socVar = soc.this;
            Iterator<roc> it = socVar.b.iterator();
            while (it.hasNext()) {
                roc next = it.next();
                if (socVar.d.get()) {
                    next.M7();
                } else {
                    next.p5();
                }
            }
        }
    }

    @Override // xsna.roc
    public final void M7() {
        if (this.d.getAndSet(true)) {
            return;
        }
        boolean f = epx.f(Looper.myLooper(), Looper.getMainLooper());
        a aVar = this.e;
        if (f) {
            aVar.run();
        } else {
            ((Handler) this.c.getValue()).post(aVar);
        }
    }

    public final void a(roc rocVar) {
        ConcurrentHashMap.KeySetView<roc, Boolean> keySetView = this.b;
        if (keySetView.contains(rocVar)) {
            return;
        }
        keySetView.add(rocVar);
        if (this.d.get()) {
            rocVar.M7();
        } else {
            rocVar.p5();
        }
    }

    public final void b(roc rocVar) {
        this.b.remove(rocVar);
    }

    @Override // xsna.roc
    public final void p5() {
        if (this.d.getAndSet(false)) {
            boolean f = epx.f(Looper.myLooper(), Looper.getMainLooper());
            a aVar = this.e;
            if (f) {
                aVar.run();
            } else {
                ((Handler) this.c.getValue()).post(aVar);
            }
        }
    }
}
