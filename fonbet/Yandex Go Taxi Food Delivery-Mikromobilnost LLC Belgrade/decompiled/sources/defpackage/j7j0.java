package defpackage;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class j7j0 {
    public final z9s0 a;
    public final r0 b;
    public final n0 c;

    public j7j0(z9s0 z9s0Var, dne0 dne0Var) {
        boolean z;
        this.a = z9s0Var;
        if (dne0Var.a("location_permission_request").f("was_shown")) {
            z9s0Var.a(1);
        }
        z9s0Var.getClass();
        String[] b = jx81.b(1);
        int length = b.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = true;
                break;
            }
            String str = b[i];
            if (!z9s0Var.a.g("was_" + str + "_dialog_shown", false)) {
                z = false;
                break;
            }
            i++;
        }
        this.b = bvf0.c(Boolean.valueOf(z));
        this.c = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    }
}
