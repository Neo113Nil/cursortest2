package defpackage;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes8.dex */
public final class k3s0 {
    public final n0 a;
    public final tpr b;
    public int c;

    public k3s0() {
        n0 b = ffx.b(1, 1, BufferOverflow.DROP_OLDEST);
        this.a = b;
        this.b = e.p(b, 1000L);
    }
}
