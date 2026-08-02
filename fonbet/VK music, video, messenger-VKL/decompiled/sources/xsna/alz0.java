package xsna;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;
import xsna.rd6;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public final class alz0 implements rd6.c {
    public final WeakReference a;
    public final com.google.android.gms.common.api.a b;
    public final boolean c;

    public alz0(jlz0 jlz0Var, com.google.android.gms.common.api.a aVar, boolean z) {
        this.a = new WeakReference(jlz0Var);
        this.b = aVar;
        this.c = z;
    }

    @Override // xsna.rd6.c
    public final void a(@NonNull ConnectionResult connectionResult) {
        jlz0 jlz0Var = (jlz0) this.a.get();
        if (jlz0Var == null) {
            return;
        }
        Lock lock = jlz0Var.b;
        exc0.k("onReportServiceBinding must be called on the GoogleApiClient handler thread", Looper.myLooper() == jlz0Var.a.p.h);
        lock.lock();
        try {
            if (jlz0Var.g(0)) {
                if (!connectionResult.j()) {
                    jlz0Var.c(connectionResult, this.b, this.c);
                }
                if (jlz0Var.h()) {
                    jlz0Var.a();
                }
            }
        } finally {
            lock.unlock();
        }
    }
}
