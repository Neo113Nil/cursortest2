package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes2.dex */
public final class nop0 implements q {
    public final n0 a = ffx.b(1, 1, BufferOverflow.DROP_OLDEST);

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        this.a.g(peyVar);
    }
}
