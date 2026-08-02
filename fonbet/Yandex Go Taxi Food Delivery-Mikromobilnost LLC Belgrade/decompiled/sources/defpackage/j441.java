package defpackage;

import androidx.lifecycle.Lifecycle;

/* loaded from: classes8.dex */
public final class j441 implements vw60 {
    public final Lifecycle a;
    public final k441 b;

    public j441(Lifecycle lifecycle, k441 k441Var) {
        this.a = lifecycle;
        this.b = k441Var;
    }

    @Override // defpackage.vw60
    public final void c() {
        cey.a(this.a, Lifecycle.Event.ON_RESUME, new ymp0(15, this));
    }

    @Override // defpackage.s150
    public final String getName() {
        return "WalkNavOnActivityCreateListener";
    }
}
