package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes10.dex */
public final class ay40 implements zx40 {
    public final n0 a = ffx.c(0, 16, BufferOverflow.DROP_OLDEST, 1);

    public final Object a(g8w g8wVar, Continuation continuation) {
        Object emit = this.a.emit(g8wVar, continuation);
        return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : zy11.a;
    }

    public final boolean b(g8w g8wVar) {
        return this.a.g(g8wVar);
    }
}
