package defpackage;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class b640 {
    public final n0 a;
    public final eci0 b;
    public final r0 c;
    public final gci0 d;

    public b640() {
        n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        this.a = b;
        this.b = e.c(b);
        r0 c = bvf0.c(new z540((tdu) null, (kne0) null, 7));
        this.c = c;
        this.d = e.d(c);
    }
}
