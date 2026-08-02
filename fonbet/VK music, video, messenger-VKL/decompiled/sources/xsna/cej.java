package xsna;

import android.os.SystemClock;
import java.util.concurrent.Future;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class cej implements io.reactivex.rxjava3.functions.f {
    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        pro0.b();
        w12 w12Var = com.vk.contacts.e.m;
        if (w12Var == null) {
            w12Var = null;
        }
        synchronized (w12Var) {
            try {
                if (!w12Var.c().isEmpty()) {
                    Future<?> future = w12Var.g;
                    if (future != null) {
                        future.cancel(true);
                    }
                    w12Var.g = w12Var.d.submit(new u12(w12Var, 0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.vk.contacts.e.h.set(SystemClock.elapsedRealtime());
    }
}
