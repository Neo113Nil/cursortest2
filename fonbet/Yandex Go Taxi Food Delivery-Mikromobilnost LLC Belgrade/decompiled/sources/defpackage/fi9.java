package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.a;

/* loaded from: classes9.dex */
public class fi9 extends a {
    public final wls w;

    public fi9(wls wlsVar, fse fseVar, int i, BufferOverflow bufferOverflow) {
        super(fseVar, i, bufferOverflow);
        this.w = wlsVar;
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public Object e(y6f0 y6f0Var, Continuation continuation) {
        Object invoke = this.w.invoke(y6f0Var, continuation);
        return invoke == CoroutineSingletons.COROUTINE_SUSPENDED ? invoke : zy11.a;
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public a h(fse fseVar, int i, BufferOverflow bufferOverflow) {
        return new fi9(this.w, fseVar, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final String toString() {
        return "block[" + this.w + "] -> " + super.toString();
    }
}
