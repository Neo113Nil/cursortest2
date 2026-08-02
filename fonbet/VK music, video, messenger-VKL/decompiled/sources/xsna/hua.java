package xsna;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;

/* compiled from: Channels.kt */
/* loaded from: classes8.dex */
public final class hua<T> extends sya<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(hua.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;
    public final b9f0<T> e;
    public final boolean f;

    public /* synthetic */ hua(b9f0 b9f0Var, boolean z) {
        this(b9f0Var, z, EmptyCoroutineContext.b, -3, BufferOverflow.SUSPEND);
    }

    @Override // xsna.sya
    public final String b() {
        return "channel=" + this.e;
    }

    @Override // xsna.sya
    public final Object c(zhd0<? super T> zhd0Var, spj<? super s3q0> spjVar) {
        Object a = tsr.a(new aki0(zhd0Var), this.e, this.f, spjVar);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : s3q0.a;
    }

    @Override // xsna.sya, xsna.ksr
    public final Object collect(lsr<? super T> lsrVar, spj<? super s3q0> spjVar) {
        if (this.c != -3) {
            Object collect = super.collect(lsrVar, spjVar);
            return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
        }
        boolean z = this.f;
        if (z && g.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
        Object a = tsr.a(lsrVar, this.e, z, spjVar);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : s3q0.a;
    }

    @Override // xsna.sya
    public final sya<T> f(kotlin.coroutines.d dVar, int i, BufferOverflow bufferOverflow) {
        return new hua(this.e, this.f, dVar, i, bufferOverflow);
    }

    @Override // xsna.sya
    public final ksr<T> h() {
        return new hua(this.e, this.f);
    }

    @Override // xsna.sya
    public final b9f0<T> i(yvj yvjVar) {
        if (this.f && g.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
        return this.c == -3 ? this.e : super.i(yvjVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public hua(b9f0<? extends T> b9f0Var, boolean z, kotlin.coroutines.d dVar, int i, BufferOverflow bufferOverflow) {
        super(dVar, i, bufferOverflow);
        this.e = b9f0Var;
        this.f = z;
    }
}
