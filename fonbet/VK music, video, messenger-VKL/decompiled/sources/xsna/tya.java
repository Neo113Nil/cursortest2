package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.BufferOverflow;

/* compiled from: Builders.kt */
/* loaded from: classes11.dex */
public class tya<T> extends sya<T> {
    public final SuspendLambda e;

    /* JADX WARN: Multi-variable type inference failed */
    public tya(wzs<? super zhd0<? super T>, ? super spj<? super s3q0>, ? extends Object> wzsVar, kotlin.coroutines.d dVar, int i, BufferOverflow bufferOverflow) {
        super(dVar, i, bufferOverflow);
        this.e = (SuspendLambda) wzsVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, xsna.wzs] */
    @Override // xsna.sya
    public Object c(zhd0<? super T> zhd0Var, spj<? super s3q0> spjVar) {
        Object invoke = this.e.invoke(zhd0Var, spjVar);
        return invoke == CoroutineSingletons.COROUTINE_SUSPENDED ? invoke : s3q0.a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, xsna.wzs] */
    @Override // xsna.sya
    public sya<T> f(kotlin.coroutines.d dVar, int i, BufferOverflow bufferOverflow) {
        return new tya(this.e, dVar, i, bufferOverflow);
    }

    @Override // xsna.sya
    public final String toString() {
        return "block[" + this.e + "] -> " + super.toString();
    }
}
