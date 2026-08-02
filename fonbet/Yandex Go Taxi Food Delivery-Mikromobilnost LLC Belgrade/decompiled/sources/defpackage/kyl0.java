package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes.dex */
public final class kyl0 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final n0 b;
    public final eci0 c;

    public kyl0() {
        n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        this.b = b;
        this.c = e.c(b);
    }
}
