package defpackage;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes14.dex */
public final class huv0 implements g8c0 {
    public final n0 a = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    @Override // defpackage.g8c0
    public final n0 a() {
        return this.a;
    }

    @Override // defpackage.g8c0
    public final void reloadDocument() {
        this.a.g(zy11.a);
    }
}
