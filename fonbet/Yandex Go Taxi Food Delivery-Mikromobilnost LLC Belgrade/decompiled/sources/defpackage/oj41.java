package defpackage;

import com.yandex.quark.js.event.h;
import com.yandex.quark.js.event.i;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes8.dex */
public final class oj41 implements ifo {
    public final n0 a;
    public final eci0 b;

    public oj41() {
        n0 c = ffx.c(0, 0, null, 7);
        this.a = c;
        this.b = e.c(c);
    }

    @Override // defpackage.ifo
    public final boolean c(i iVar) {
        return iVar instanceof h;
    }

    @Override // defpackage.ifo
    public final Object g(i iVar, ContinuationImpl continuationImpl) {
        n0 n0Var = this.a;
        zy11 zy11Var = zy11.a;
        Object emit = n0Var.emit(zy11Var, continuationImpl);
        return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : zy11Var;
    }
}
