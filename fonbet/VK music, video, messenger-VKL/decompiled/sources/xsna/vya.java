package xsna;

import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;

/* compiled from: ChannelFlow.kt */
/* loaded from: classes11.dex */
public abstract class vya<S, T> extends sya<T> {
    public final ksr<S> e;

    public vya(int i, kotlin.coroutines.d dVar, BufferOverflow bufferOverflow, ksr ksrVar) {
        super(dVar, i, bufferOverflow);
        this.e = ksrVar;
    }

    @Override // xsna.sya
    public final Object c(zhd0<? super T> zhd0Var, spj<? super s3q0> spjVar) {
        Object j = j(new aki0(zhd0Var), spjVar);
        return j == CoroutineSingletons.COROUTINE_SUSPENDED ? j : s3q0.a;
    }

    @Override // xsna.sya, xsna.ksr
    public final Object collect(lsr<? super T> lsrVar, spj<? super s3q0> spjVar) {
        if (this.c == -3) {
            kotlin.coroutines.d context = spjVar.getContext();
            Boolean bool = Boolean.FALSE;
            jvj jvjVar = new jvj();
            kotlin.coroutines.d dVar = this.b;
            kotlin.coroutines.d plus = !((Boolean) dVar.fold(bool, jvjVar)).booleanValue() ? context.plus(dVar) : mvj.a(context, dVar, false);
            if (epx.f(plus, context)) {
                Object j = j(lsrVar, spjVar);
                return j == CoroutineSingletons.COROUTINE_SUSPENDED ? j : s3q0.a;
            }
            c.a aVar = c.a.b;
            if (epx.f(plus.get(aVar), context.get(aVar))) {
                Object y = ao8.y(plus, ao8.g(lsrVar, spjVar.getContext()), new uya(this, null), spjVar);
                return y == CoroutineSingletons.COROUTINE_SUSPENDED ? y : s3q0.a;
            }
        }
        Object collect = super.collect(lsrVar, spjVar);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
    }

    public abstract Object j(lsr<? super T> lsrVar, spj<? super s3q0> spjVar);

    @Override // xsna.sya
    public final String toString() {
        return this.e + " -> " + super.toString();
    }
}
