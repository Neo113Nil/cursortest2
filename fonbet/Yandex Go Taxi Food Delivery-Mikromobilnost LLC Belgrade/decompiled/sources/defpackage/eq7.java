package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.t;

/* loaded from: classes2.dex */
public final class eq7 implements pey {
    public final t a;

    public eq7() {
        t tVar = new t(this, true);
        this.a = tVar;
        tVar.i(Lifecycle.State.CREATED);
    }

    @Override // defpackage.pey
    public final Lifecycle getLifecycle() {
        return this.a;
    }
}
