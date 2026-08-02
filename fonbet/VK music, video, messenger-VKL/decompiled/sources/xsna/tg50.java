package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;

/* compiled from: InteractionSource.kt */
/* loaded from: classes11.dex */
public final class tg50 implements sg50 {
    public final caj0 a = lyd.b(0, 16, BufferOverflow.DROP_OLDEST, 1);

    @Override // xsna.sg50
    public final Object a(vax vaxVar, spj<? super s3q0> spjVar) {
        Object emit = this.a.emit(vaxVar, spjVar);
        return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : s3q0.a;
    }

    @Override // xsna.wax
    public final caj0 b() {
        return this.a;
    }

    @Override // xsna.sg50
    public final boolean c(vax vaxVar) {
        return this.a.e(vaxVar);
    }
}
