package defpackage;

import android.location.Location;

/* loaded from: classes6.dex */
public final class ftt extends ett {
    public final y6f0 b;

    public ftt(y6f0 y6f0Var) {
        this.b = y6f0Var;
    }

    @Override // defpackage.ett
    public final void a(Location location) {
        ((x6f0) this.b).d(location);
    }

    @Override // defpackage.ett
    public final void b(Exception exc) {
        bvf0.i(this.b, "Google fused location updates failed with exception", exc);
    }
}
