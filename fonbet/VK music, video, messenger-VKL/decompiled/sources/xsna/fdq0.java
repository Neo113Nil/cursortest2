package xsna;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.Objects;
import xsna.uon0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class fdq0 implements Runnable {
    public final /* synthetic */ qdq0 b;
    public final /* synthetic */ eo5 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Runnable e;

    public /* synthetic */ fdq0(qdq0 qdq0Var, eo5 eo5Var, int i, Runnable runnable) {
        this.b = qdq0Var;
        this.c = eo5Var;
        this.d = i;
        this.e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final eo5 eo5Var = this.c;
        final int i = this.d;
        Runnable runnable = this.e;
        final qdq0 qdq0Var = this.b;
        uon0 uon0Var = qdq0Var.f;
        try {
            try {
                n0q n0qVar = qdq0Var.c;
                Objects.requireNonNull(n0qVar);
                uon0Var.b(new d810(n0qVar, 12));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) qdq0Var.a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    uon0Var.b(new uon0.a() { // from class: xsna.gdq0
                        @Override // xsna.uon0.a
                        public final Object execute() {
                            qdq0.this.d.b(eo5Var, i + 1);
                            return null;
                        }
                    });
                } else {
                    qdq0Var.a(eo5Var, i);
                }
                runnable.run();
            } catch (SynchronizationException unused) {
                qdq0Var.d.b(eo5Var, i + 1);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
