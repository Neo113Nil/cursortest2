package defpackage;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes13.dex */
public final class ch80 {
    public final n0 a;
    public final n0 b;
    public final n0 c;

    public ch80() {
        n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        this.a = b;
        this.b = b;
        this.c = ffx.c(0, 0, null, 7);
    }
}
