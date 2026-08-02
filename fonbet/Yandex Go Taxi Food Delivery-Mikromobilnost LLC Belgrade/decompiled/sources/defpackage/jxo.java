package defpackage;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes9.dex */
public final class jxo {
    public final n0 a;
    public final eci0 b;

    public jxo() {
        n0 c = ffx.c(0, 1, BufferOverflow.DROP_OLDEST, 1);
        this.a = c;
        this.b = e.c(c);
    }
}
