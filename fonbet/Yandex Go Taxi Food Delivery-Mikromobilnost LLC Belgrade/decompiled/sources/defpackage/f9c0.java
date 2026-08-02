package defpackage;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes13.dex */
public final class f9c0 implements f8c0 {
    public final n0 a = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    @Override // defpackage.f8c0
    public final tpr a() {
        return this.a;
    }

    @Override // defpackage.f8c0
    public final void handleAction(kr krVar) {
        this.a.g(krVar);
    }
}
