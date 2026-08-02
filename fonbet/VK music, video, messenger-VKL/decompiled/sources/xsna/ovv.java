package xsna;

import android.os.Looper;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ovv implements Runnable {
    public final /* synthetic */ rvv b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ ovv(rvv rvvVar, Runnable runnable) {
        this.b = rvvVar;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rvv rvvVar = this.b;
        boolean z = rvvVar.e;
        LinkedBlockingDeque linkedBlockingDeque = rvvVar.d;
        if (!z) {
            rvvVar.e = true;
            Looper.myQueue().addIdleHandler(rvvVar);
        }
        linkedBlockingDeque.offer(this.c);
    }
}
