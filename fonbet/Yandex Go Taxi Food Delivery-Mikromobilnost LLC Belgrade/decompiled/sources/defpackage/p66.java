package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class p66 implements Runnable {
    public final long a = SystemClock.elapsedRealtime();
    public long b;
    public final /* synthetic */ n15 c;

    public p66(n15 n15Var) {
        this.c = n15Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.b;
        n15 n15Var = this.c;
        if (j < 5000) {
            n15Var.j();
            this.b = SystemClock.elapsedRealtime() - this.a;
            ((Handler) n15Var.w).postDelayed(this, 500L);
        } else {
            ogz ogzVar = (ogz) n15Var.c;
            TimeoutException timeoutException = new TimeoutException();
            if (((n9f0) ogzVar).a) {
                Log.e("AS/".concat("BluetoothScoJob"), "Bluetooth sco job timed out", timeoutException);
            }
            n15Var.k();
            n15Var.b();
        }
    }
}
