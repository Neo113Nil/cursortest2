package defpackage;

import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class kf30 {
    public final r0 a;
    public final gci0 b;

    public kf30(jf30 jf30Var) {
        r0 c = bvf0.c(jf30Var);
        this.a = c;
        this.b = e.d(c);
    }

    public final void a(y540 y540Var) {
        r0 r0Var;
        Object value;
        bzy0 bzy0Var;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
            jf30 jf30Var = (jf30) value;
            if (jl40.l(jf30Var, gf30.a) || (jf30Var instanceof hf30)) {
                bzy0Var = null;
            } else {
                if (!(jf30Var instanceof if30)) {
                    w511.b();
                    return;
                }
                bzy0Var = ((if30) jf30Var).a;
            }
        } while (!r0Var.k(value, new hf30(y540Var, bzy0Var)));
    }
}
