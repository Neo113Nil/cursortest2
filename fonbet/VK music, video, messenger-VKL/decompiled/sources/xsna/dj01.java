package xsna;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzof;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class dj01 {

    @VisibleForTesting
    public long a;

    @VisibleForTesting
    public long b;
    public final ki01 c;
    public final /* synthetic */ fj01 d;

    public dj01(fj01 fj01Var) {
        this.d = fj01Var;
        mb01 mb01Var = (mb01) fj01Var.b;
        this.c = new ki01(this, mb01Var);
        mb01Var.o.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.a = elapsedRealtime;
        this.b = elapsedRealtime;
    }

    public final boolean a(long j, boolean z, boolean z2) {
        fj01 fj01Var = this.d;
        fj01Var.k();
        fj01Var.l();
        zzof.zzc();
        mb01 mb01Var = (mb01) fj01Var.b;
        if (!mb01Var.h.t(null, s701.d0)) {
            x901 x901Var = mb01Var.i;
            mb01.i(x901Var);
            u901 u901Var = x901Var.q;
            mb01Var.o.getClass();
            u901Var.b(System.currentTimeMillis());
        } else if (mb01Var.b()) {
            x901 x901Var2 = mb01Var.i;
            mb01.i(x901Var2);
            u901 u901Var2 = x901Var2.q;
            mb01Var.o.getClass();
            u901Var2.b(System.currentTimeMillis());
        }
        long j2 = j - this.a;
        if (!z && j2 < 1000) {
            k901 k901Var = mb01Var.j;
            mb01.k(k901Var);
            k901Var.q.b(Long.valueOf(j2), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z2) {
            j2 = j - this.b;
            this.b = j;
        }
        k901 k901Var2 = mb01Var.j;
        mb01.k(k901Var2);
        k901Var2.q.b(Long.valueOf(j2), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        boolean v = mb01Var.h.v();
        kg01 kg01Var = mb01Var.p;
        mb01.j(kg01Var);
        sk01.w(kg01Var.q(!v), bundle, true);
        if (!z2) {
            bf01 bf01Var = mb01Var.q;
            mb01.j(bf01Var);
            bf01Var.r("auto", "_e", bundle);
        }
        this.a = j;
        ki01 ki01Var = this.c;
        ki01Var.a();
        ki01Var.c(3600000L);
        return true;
    }
}
