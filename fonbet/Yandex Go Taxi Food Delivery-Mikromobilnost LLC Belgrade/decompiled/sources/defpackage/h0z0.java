package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes7.dex */
public final class h0z0 {
    public long a;
    public final i3y b;
    public sls c;
    public long d;

    public h0z0(int i) {
        this.a = 300L;
        this.b = a.b(LazyThreadSafetyMode.NONE, new y6y0(28));
    }

    public final void a(sls slsVar, boolean z) {
        i3y i3yVar = this.b;
        if (z) {
            this.c = null;
            slsVar.invoke();
            this.d = SystemClock.uptimeMillis();
            ((Handler) i3yVar.getValue()).removeCallbacksAndMessages(null);
            return;
        }
        boolean z2 = this.c != null;
        this.c = slsVar;
        if (z2) {
            return;
        }
        long max = Math.max(0L, (this.d + this.a) - SystemClock.uptimeMillis());
        if (max != 0) {
            ((Handler) i3yVar.getValue()).postDelayed(new kux0(9, this), max);
            return;
        }
        sls slsVar2 = this.c;
        this.c = null;
        if (slsVar2 != null) {
            slsVar2.invoke();
            this.d = SystemClock.uptimeMillis();
        }
    }

    public h0z0() {
        this(0);
    }
}
