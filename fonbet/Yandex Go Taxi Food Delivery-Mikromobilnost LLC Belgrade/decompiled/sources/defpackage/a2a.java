package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes12.dex */
public final class a2a implements wgr {
    public final n0 a = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    @Override // defpackage.wgr
    public final Object a(kr krVar, Continuation continuation) {
        this.a.g(krVar);
        return zy11.a;
    }

    @Override // defpackage.wgr
    public final tpr b() {
        return e.c(this.a);
    }
}
