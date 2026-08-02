package xsna;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;

/* compiled from: ChannelFlow.kt */
/* loaded from: classes11.dex */
public final class wya<T> extends vya<T, T> {
    public wya(ksr ksrVar, kotlin.coroutines.d dVar, int i, BufferOverflow bufferOverflow, int i2) {
        super((i2 & 4) != 0 ? -3 : i, (i2 & 2) != 0 ? EmptyCoroutineContext.b : dVar, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow, ksrVar);
    }

    @Override // xsna.sya
    public final sya<T> f(kotlin.coroutines.d dVar, int i, BufferOverflow bufferOverflow) {
        return new wya(i, dVar, bufferOverflow, this.e);
    }

    @Override // xsna.sya
    public final ksr<T> h() {
        return (ksr<T>) this.e;
    }

    @Override // xsna.vya
    public final Object j(lsr<? super T> lsrVar, spj<? super s3q0> spjVar) {
        Object collect = this.e.collect(lsrVar, spjVar);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
    }
}
