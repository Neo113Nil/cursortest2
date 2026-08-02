package xsna;

import android.util.ArraySet;

/* compiled from: UserOnlineInvalidateLpTask.kt */
/* loaded from: classes2.dex */
public final class flq0 extends e500 {
    public final elq0 c;

    public flq0(elq0 elq0Var) {
        super("UserOnlineInvalidateLpTask");
        this.c = elq0Var;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        long j = this.c.a.b;
        if (z300Var.p == null) {
            z300Var.p = new ArraySet();
        }
        z300Var.p.add(Long.valueOf(j));
    }
}
