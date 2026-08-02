package defpackage;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes9.dex */
public final class pte0 {
    public final dqe0 a;
    public final n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public pte0(dqe0 dqe0Var) {
        this.a = dqe0Var;
    }

    public final void a(String str) {
        this.a.a.Q = str;
        this.b.g(zy11.a);
    }

    public final String b() {
        return this.a.a.Q;
    }
}
