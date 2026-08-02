package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import defpackage.bvf0;
import defpackage.jl40;
import defpackage.m9m;
import defpackage.nah;
import defpackage.tje;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes10.dex */
public final class m extends k {
    public n O;
    public Orientation P;
    public boolean Q;
    public zls R;
    public zls S;
    public boolean T;

    @Override // androidx.compose.foundation.gestures.k
    public final Object L0(wls wlsVar, Continuation continuation) {
        n nVar = this.O;
        MutatePriority mutatePriority = MutatePriority.UserInput;
        DraggableNode$drag$2 draggableNode$drag$2 = new DraggableNode$drag$2(wlsVar, this, null);
        nah nahVar = (nah) nVar;
        nahVar.getClass();
        Object n = bvf0.n(new DefaultDraggableState$drag$2(nahVar, mutatePriority, draggableNode$drag$2, null), continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        zy11 zy11Var = zy11.a;
        if (n != coroutineSingletons) {
            n = zy11Var;
        }
        return n == coroutineSingletons ? n : zy11Var;
    }

    @Override // androidx.compose.foundation.gestures.k
    public final void Q0(long j) {
        if (!isAttached() || jl40.l(this.R, l.a)) {
            return;
        }
        tje.N(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new DraggableNode$onDragStarted$1(this, j, null), 1);
    }

    @Override // androidx.compose.foundation.gestures.k
    public final void R0(m9m m9mVar) {
        if (!isAttached() || jl40.l(this.S, l.b)) {
            return;
        }
        tje.N(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new DraggableNode$onDragStopped$1(this, m9mVar, null), 1);
    }

    @Override // androidx.compose.foundation.gestures.k
    public final boolean W0() {
        return this.Q;
    }
}
