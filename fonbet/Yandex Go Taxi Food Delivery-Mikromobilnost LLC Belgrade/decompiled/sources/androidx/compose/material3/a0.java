package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import defpackage.j18;
import defpackage.svz0;
import defpackage.sz40;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes10.dex */
public final class a0 implements svz0 {
    public final androidx.compose.foundation.j a;
    public final sz40 b = new sz40(Boolean.FALSE);
    public j18 c;

    public a0(androidx.compose.foundation.j jVar) {
        this.a = jVar;
    }

    public final void a() {
        this.b.b(Boolean.FALSE);
    }

    public final boolean b() {
        sz40 sz40Var = this.b;
        return ((Boolean) sz40Var.b.getValue()).booleanValue() || ((Boolean) sz40Var.c.getValue()).booleanValue();
    }

    public final Object c(MutatePriority mutatePriority, SuspendLambda suspendLambda) {
        Object b = this.a.b(mutatePriority, new TooltipStateImpl$show$2(this, mutatePriority, new TooltipStateImpl$show$cancellableShow$1(this, null), null), suspendLambda);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : zy11.a;
    }
}
