package defpackage;

import java.util.Arrays;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes12.dex */
public final class a830 implements wgr {
    public final wgr a;
    public final n0 b = ffx.b(0, 1, BufferOverflow.SUSPEND);

    public a830(wgr wgrVar) {
        this.a = wgrVar;
    }

    @Override // defpackage.wgr
    public final Object a(kr krVar, Continuation continuation) {
        return this.b.emit(krVar, continuation);
    }

    @Override // defpackage.wgr
    public final tpr b() {
        return e.K((tpr[]) Arrays.copyOf(new tpr[]{this.b, this.a.b()}, 2));
    }
}
