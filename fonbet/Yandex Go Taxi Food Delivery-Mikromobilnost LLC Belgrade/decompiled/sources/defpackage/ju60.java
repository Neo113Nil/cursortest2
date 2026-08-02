package defpackage;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes9.dex */
public final class ju60 {
    public final j63 a = new j63(0);
    public final n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public final void a() {
        j63 j63Var;
        synchronized (this.a) {
            j63Var = new j63(this.a);
            this.a.clear();
        }
        r53 r53Var = new r53(j63Var);
        while (r53Var.hasNext()) {
            is60 is60Var = (is60) r53Var.next();
            if (is60Var instanceof is60) {
                is60Var.b = false;
            }
        }
        this.b.g(zy11.a);
    }
}
