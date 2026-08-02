package defpackage;

import android.location.Location;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes9.dex */
public final class acz {
    public final r0 a;
    public final gci0 b;

    public acz() {
        r0 c = bvf0.c(null);
        this.a = c;
        this.b = e.d(c);
    }

    public final Location a() {
        return (Location) this.a.getValue();
    }

    public final void b(mo21 mo21Var) {
        Location b = mo21Var.b();
        r0 r0Var = this.a;
        r0Var.getClass();
        r0Var.m(null, b);
    }
}
