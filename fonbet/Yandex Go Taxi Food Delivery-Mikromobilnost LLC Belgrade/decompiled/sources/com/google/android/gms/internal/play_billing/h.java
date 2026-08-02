package com.google.android.gms.internal.play_billing;

import defpackage.dl91;
import defpackage.gl91;
import defpackage.ms91;
import defpackage.ql91;
import defpackage.wp91;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class h implements Runnable {
    public ms91 a;

    @Override // java.lang.Runnable
    public final void run() {
        wp91 wp91Var;
        f fVar;
        ms91 ms91Var = this.a;
        if (ms91Var == null || (wp91Var = ms91Var.A) == null) {
            return;
        }
        this.a = null;
        if (wp91Var.isDone()) {
            Object obj = ms91Var.a;
            if (obj == null) {
                if (wp91Var.isDone()) {
                    if (ql91.y.k(ms91Var, null, ql91.f(wp91Var))) {
                        ql91.h(ms91Var);
                        return;
                    }
                    return;
                }
                gl91 gl91Var = new gl91(ms91Var, wp91Var);
                if (ql91.y.k(ms91Var, null, gl91Var)) {
                    try {
                        wp91Var.d(gl91Var, zzed.zza);
                        return;
                    } catch (Throwable th) {
                        try {
                            fVar = new f(th);
                        } catch (Error | Exception unused) {
                            fVar = f.b;
                        }
                        ql91.y.k(ms91Var, gl91Var, fVar);
                        return;
                    }
                }
                obj = ms91Var.a;
            }
            if (obj instanceof dl91) {
                wp91Var.cancel(((dl91) obj).a);
                return;
            }
            return;
        }
        try {
            ScheduledFuture scheduledFuture = ms91Var.B;
            ms91Var.B = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                    }
                } catch (Throwable th2) {
                    ms91Var.e(new zzfd(str));
                    throw th2;
                }
            }
            ms91Var.e(new zzfd(str + Extension.COLON_SPACE + wp91Var.toString()));
        } finally {
            wp91Var.cancel(true);
        }
    }
}
