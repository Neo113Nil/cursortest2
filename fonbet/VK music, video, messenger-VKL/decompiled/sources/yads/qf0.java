package yads;

import android.content.Intent;
import xsna.epx;
import xsna.gzs;
import xsna.izs;

/* loaded from: classes10.dex */
public final class qf0 {
    public final Intent a;
    public final gzs b;
    public final izs c;

    public qf0(Intent intent, sf0 sf0Var, tf0 tf0Var) {
        this.a = intent;
        this.b = sf0Var;
        this.c = tf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf0)) {
            return false;
        }
        qf0 qf0Var = (qf0) obj;
        return epx.f(this.a, qf0Var.a) && epx.f(this.b, qf0Var.b) && epx.f(this.c, qf0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xsna.sf3.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "DelegatedActivityLaunchInfo(pendingIntent=" + this.a + ", onLaunchSucceed=" + this.b + ", onLaunchFailed=" + this.c + ")";
    }
}
