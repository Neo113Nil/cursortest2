package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.a;

/* loaded from: classes9.dex */
public final class di9 extends a {
    private volatile /* synthetic */ int consumed$volatile;
    public final tfi0 w;

    static {
        AtomicIntegerFieldUpdater.newUpdater(di9.class, "consumed$volatile");
    }

    public /* synthetic */ di9(tfi0 tfi0Var) {
        this(tfi0Var, EmptyCoroutineContext.a, -3, BufferOverflow.SUSPEND);
    }

    @Override // kotlinx.coroutines.flow.internal.a, defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        if (this.b == -3) {
            Object v = e.v(vprVar, this.w, false, continuation);
            if (v == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return v;
            }
        } else {
            Object collect = super.collect(vprVar, continuation);
            if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return collect;
            }
        }
        return zy11.a;
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final String d() {
        return "channel=" + this.w;
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final Object e(y6f0 y6f0Var, Continuation continuation) {
        Object v = e.v(new mqq0(y6f0Var), this.w, false, continuation);
        return v == CoroutineSingletons.COROUTINE_SUSPENDED ? v : zy11.a;
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final a h(fse fseVar, int i, BufferOverflow bufferOverflow) {
        return new di9(this.w, fseVar, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final tpr i() {
        return new di9(this.w);
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final tfi0 j(tse tseVar) {
        return this.b == -3 ? this.w : super.j(tseVar);
    }

    public di9(tfi0 tfi0Var, fse fseVar, int i, BufferOverflow bufferOverflow) {
        super(fseVar, i, bufferOverflow);
        this.w = tfi0Var;
    }
}
