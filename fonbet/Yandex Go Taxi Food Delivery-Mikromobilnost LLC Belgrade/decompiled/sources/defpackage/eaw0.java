package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes14.dex */
public final class eaw0 implements wgr {
    public final n0 a = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    @Override // defpackage.wgr
    public final Object a(kr krVar, Continuation continuation) {
        return this.a.emit(krVar, continuation);
    }

    @Override // defpackage.wgr
    public final tpr b() {
        return this.a;
    }
}
