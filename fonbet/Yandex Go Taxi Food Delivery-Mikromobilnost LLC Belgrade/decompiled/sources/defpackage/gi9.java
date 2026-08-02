package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.a;
import kotlinx.coroutines.flow.internal.e;

/* loaded from: classes9.dex */
public final class gi9 extends e {
    public gi9(int i, int i2, fse fseVar, tpr tprVar, BufferOverflow bufferOverflow) {
        super((i2 & 4) != 0 ? -3 : i, (i2 & 2) != 0 ? EmptyCoroutineContext.a : fseVar, tprVar, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final a h(fse fseVar, int i, BufferOverflow bufferOverflow) {
        return new gi9(i, fseVar, this.w, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final tpr i() {
        return this.w;
    }

    @Override // kotlinx.coroutines.flow.internal.e
    public final Object k(vpr vprVar, Continuation continuation) {
        Object collect = this.w.collect(vprVar, continuation);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11.a;
    }
}
