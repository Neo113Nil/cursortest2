package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.t;

/* loaded from: classes12.dex */
public final class fr7 implements pey {
    public final t a;

    public fr7() {
        t tVar = new t(this, true);
        this.a = tVar;
        tVar.i(Lifecycle.State.CREATED);
    }

    @Override // defpackage.pey
    public final Lifecycle getLifecycle() {
        return this.a;
    }
}
