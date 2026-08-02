package xsna;

import java.util.ArrayList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;

/* compiled from: ChannelFlow.kt */
/* loaded from: classes11.dex */
public abstract class sya<T> implements m0t<T> {
    public final kotlin.coroutines.d b;
    public final int c;
    public final BufferOverflow d;

    public sya(kotlin.coroutines.d dVar, int i, BufferOverflow bufferOverflow) {
        this.b = dVar;
        this.c = i;
        this.d = bufferOverflow;
    }

    @Override // xsna.m0t
    public final ksr<T> a(kotlin.coroutines.d dVar, int i, BufferOverflow bufferOverflow) {
        kotlin.coroutines.d dVar2 = this.b;
        kotlin.coroutines.d plus = dVar.plus(dVar2);
        BufferOverflow bufferOverflow2 = BufferOverflow.SUSPEND;
        BufferOverflow bufferOverflow3 = this.d;
        int i2 = this.c;
        if (bufferOverflow == bufferOverflow2) {
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2) {
                            i += i2;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i2;
            }
            bufferOverflow = bufferOverflow3;
        }
        return (epx.f(plus, dVar2) && i == i2 && bufferOverflow == bufferOverflow3) ? this : f(plus, i, bufferOverflow);
    }

    public String b() {
        return null;
    }

    public abstract Object c(zhd0<? super T> zhd0Var, spj<? super s3q0> spjVar);

    @Override // xsna.ksr
    public Object collect(lsr<? super T> lsrVar, spj<? super s3q0> spjVar) {
        Object d = zvj.d(new qya(lsrVar, this, null), spjVar);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : s3q0.a;
    }

    public abstract sya<T> f(kotlin.coroutines.d dVar, int i, BufferOverflow bufferOverflow);

    public ksr<T> h() {
        return null;
    }

    public b9f0<T> i(yvj yvjVar) {
        int i = this.c;
        if (i == -3) {
            i = -2;
        }
        CoroutineStart coroutineStart = CoroutineStart.ATOMIC;
        wzs ryaVar = new rya(this, null);
        whd0 whd0Var = new whd0(mvj.b(yvjVar, this.b), w0b.a(i, this.d, null, 4));
        whd0Var.w0(coroutineStart, whd0Var, ryaVar);
        return whd0Var;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String b = b();
        if (b != null) {
            arrayList.add(b);
        }
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.b;
        kotlin.coroutines.d dVar = this.b;
        if (dVar != emptyCoroutineContext) {
            arrayList.add("context=" + dVar);
        }
        int i = this.c;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
        BufferOverflow bufferOverflow2 = this.d;
        if (bufferOverflow2 != bufferOverflow) {
            arrayList.add("onBufferOverflow=" + bufferOverflow2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return ho8.a(sb, j5g.g0(arrayList, ", ", null, null, 0, null, 62), ']');
    }
}
