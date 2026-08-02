package defpackage;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes14.dex */
public final class hi31 {
    public final n0 a;
    public final n0 b;

    public hi31() {
        n0 b = ffx.b(0, 1, BufferOverflow.SUSPEND);
        this.a = b;
        this.b = b;
    }
}
