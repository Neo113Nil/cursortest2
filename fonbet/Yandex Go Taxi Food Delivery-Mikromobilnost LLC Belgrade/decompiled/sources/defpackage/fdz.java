package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class fdz {
    public final ibw0 a;
    public volatile long b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean(false);

    public fdz(ibw0 ibw0Var) {
        this.a = ibw0Var;
    }

    public final gbw0 a(mo21 mo21Var) {
        String str = mo21Var.h;
        long j = mo21Var.f;
        return new gbw0(str, j, j > 0 ? System.currentTimeMillis() - mo21Var.f : 0L, mo21Var.c, mo21Var.a, mo21Var.b, SystemClock.elapsedRealtime() - this.b, mo21Var.j);
    }
}
