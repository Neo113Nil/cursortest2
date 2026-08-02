package xsna;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FreshPostsTask.kt */
/* loaded from: classes4.dex */
public final class yhs implements Runnable {
    public final WeakReference<izs<gzs<s3q0>, io.reactivex.rxjava3.disposables.c>> b;
    public final Object c;
    public final ag20 d;
    public final ts60 e;
    public final AtomicReference<io.reactivex.rxjava3.disposables.c> f = new AtomicReference<>(null);
    public final AtomicBoolean g = new AtomicBoolean(false);

    public yhs(WeakReference weakReference, Object obj, ag20 ag20Var, ts60 ts60Var) {
        this.b = weakReference;
        this.c = obj;
        this.d = ag20Var;
        this.e = ts60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.g.get()) {
            return;
        }
        synchronized (this.c) {
            izs<gzs<s3q0>, io.reactivex.rxjava3.disposables.c> izsVar = this.b.get();
            if (izsVar != null) {
                this.f.set(izsVar.invoke(this.d));
            }
            s3q0 s3q0Var = s3q0.a;
        }
    }
}
