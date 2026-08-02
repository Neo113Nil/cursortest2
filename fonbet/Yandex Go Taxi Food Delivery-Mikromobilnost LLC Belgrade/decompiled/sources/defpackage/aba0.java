package defpackage;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class aba0 {
    public final as21 a;
    public final r0 b = bvf0.c(Boolean.valueOf(a()));
    public final n0 c = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public aba0(as21 as21Var) {
        this.a = as21Var;
    }

    public final boolean a() {
        return this.a.a("FIELD_HIDE_BALANCE", false);
    }

    public final void b(boolean z) {
        this.c.g(Boolean.valueOf(z));
        this.a.e("FIELD_IS_BALANCE_HIDED", z);
    }
}
