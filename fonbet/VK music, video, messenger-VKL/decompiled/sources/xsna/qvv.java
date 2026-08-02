package xsna;

import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class qvv implements Runnable {
    public final /* synthetic */ rvv b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ qvv(rvv rvvVar, Runnable runnable) {
        this.b = rvvVar;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rvv rvvVar = this.b;
        LinkedBlockingDeque linkedBlockingDeque = rvvVar.d;
        Runnable runnable = this.c;
        if (linkedBlockingDeque.contains(runnable)) {
            runnable.run();
            linkedBlockingDeque.remove(runnable);
            rvvVar.c.removeCallbacksAndMessages(runnable);
        }
    }
}
