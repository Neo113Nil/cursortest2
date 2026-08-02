package defpackage;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes9.dex */
public final class kt00 {
    public final as21 a;
    public final n0 b = ffx.c(1, 0, BufferOverflow.DROP_OLDEST, 2);
    public boolean c;
    public boolean d;

    public kt00(as21 as21Var) {
        this.a = as21Var;
        a();
    }

    public final void a() {
        this.b.g(Boolean.valueOf(this.a.a("FIELD_TRAFFICS_ON", false) && !(this.c && this.d)));
    }
}
