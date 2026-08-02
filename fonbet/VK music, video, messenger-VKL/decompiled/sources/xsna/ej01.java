package xsna;

import android.app.ActivityManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zznw;
import com.google.android.gms.internal.measurement.zzpd;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class ej01 {
    public final /* synthetic */ fj01 a;

    public ej01(fj01 fj01Var) {
        this.a = fj01Var;
    }

    public final void a() {
        fj01 fj01Var = this.a;
        fj01Var.k();
        mb01 mb01Var = (mb01) fj01Var.b;
        x901 x901Var = mb01Var.i;
        mb01.i(x901Var);
        mb01Var.o.getClass();
        if (x901Var.r(System.currentTimeMillis())) {
            x901 x901Var2 = mb01Var.i;
            mb01.i(x901Var2);
            x901Var2.n.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                k901 k901Var = mb01Var.j;
                mb01.k(k901Var);
                k901Var.q.a("Detected application was in foreground");
                mb01Var.o.getClass();
                c(System.currentTimeMillis(), false);
            }
        }
    }

    public final void b(long j, boolean z) {
        fj01 fj01Var = this.a;
        fj01Var.k();
        fj01Var.o();
        mb01 mb01Var = (mb01) fj01Var.b;
        x901 x901Var = mb01Var.i;
        mb01.i(x901Var);
        if (x901Var.r(j)) {
            x901 x901Var2 = mb01Var.i;
            mb01.i(x901Var2);
            x901Var2.n.a(true);
            zzpd.zzc();
            if (mb01Var.h.t(null, s701.i0)) {
                mb01Var.o().q();
            }
        }
        x901 x901Var3 = mb01Var.i;
        mb01.i(x901Var3);
        x901Var3.q.b(j);
        x901 x901Var4 = mb01Var.i;
        mb01.i(x901Var4);
        if (x901Var4.n.b()) {
            c(j, z);
        }
    }

    @VisibleForTesting
    public final void c(long j, boolean z) {
        fj01 fj01Var = this.a;
        fj01Var.k();
        mb01 mb01Var = (mb01) fj01Var.b;
        if (mb01Var.b()) {
            x901 x901Var = mb01Var.i;
            mb01.i(x901Var);
            x901Var.q.b(j);
            mb01Var.o.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            k901 k901Var = mb01Var.j;
            mb01.k(k901Var);
            k901Var.q.b(Long.valueOf(elapsedRealtime), "Session started, time");
            long j2 = j / 1000;
            Long valueOf = Long.valueOf(j2);
            bf01 bf01Var = mb01Var.q;
            mb01.j(bf01Var);
            bf01Var.A(j, valueOf, "auto", "_sid");
            x901 x901Var2 = mb01Var.i;
            mb01.i(x901Var2);
            x901Var2.r.b(j2);
            x901 x901Var3 = mb01Var.i;
            mb01.i(x901Var3);
            x901Var3.n.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j2);
            if (mb01Var.h.t(null, s701.Z) && z) {
                bundle.putLong("_aib", 1L);
            }
            bf01 bf01Var2 = mb01Var.q;
            mb01.j(bf01Var2);
            bf01Var2.s("auto", "_s", bundle, j);
            zznw.zzc();
            if (mb01Var.h.t(null, s701.c0)) {
                x901 x901Var4 = mb01Var.i;
                mb01.i(x901Var4);
                String a = x901Var4.w.a();
                if (TextUtils.isEmpty(a)) {
                    return;
                }
                Bundle a2 = q9k.a("_ffr", a);
                bf01 bf01Var3 = mb01Var.q;
                mb01.j(bf01Var3);
                bf01Var3.s("auto", "_ssr", a2, j);
            }
        }
    }
}
