package defpackage;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class js1 implements hs1 {
    public final r0 a;
    public final gci0 b;
    public final n0 c;
    public final r0 w;

    public js1() {
        r0 c = bvf0.c(at1.a);
        this.a = c;
        this.b = e.d(c);
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        this.c = ffx.c(0, Integer.MAX_VALUE, bufferOverflow, 1);
        this.w = bvf0.c(Boolean.FALSE);
        ffx.c(0, 1, bufferOverflow, 1);
        ffx.c(0, 1, bufferOverflow, 1);
        ffx.c(0, 1, bufferOverflow, 1);
    }

    @Override // defpackage.hs1
    public final void b(gs1 gs1Var) {
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        if (gs1Var instanceof fs1) {
            n0 n0Var = this.c;
            at1 at1Var = at1.a;
            n0Var.g(at1Var);
            do {
                r0Var2 = this.a;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, at1Var));
            return;
        }
        if (!(gs1Var instanceof es1)) {
            w511.b();
            return;
        }
        do {
            r0Var = this.w;
            value = r0Var.getValue();
            ((Boolean) value).getClass();
        } while (!r0Var.k(value, Boolean.TRUE));
    }
}
