package defpackage;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes14.dex */
public final class hpi0 {
    public final n0 a;
    public final eci0 b;
    public final n0 c;
    public final eci0 d;

    public hpi0() {
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        n0 b = ffx.b(0, 1, bufferOverflow);
        this.a = b;
        this.b = e.c(b);
        n0 b2 = ffx.b(0, 1, bufferOverflow);
        this.c = b2;
        this.d = e.c(b2);
    }
}
