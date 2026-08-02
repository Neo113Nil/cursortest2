package defpackage;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class adw {
    public final n0 a;
    public final r0 b;
    public final eci0 c;
    public final gci0 d;

    public adw() {
        n0 b = ffx.b(1, 0, BufferOverflow.DROP_OLDEST);
        this.a = b;
        r0 c = bvf0.c(null);
        this.b = c;
        this.c = e.c(b);
        this.d = e.d(c);
    }
}
