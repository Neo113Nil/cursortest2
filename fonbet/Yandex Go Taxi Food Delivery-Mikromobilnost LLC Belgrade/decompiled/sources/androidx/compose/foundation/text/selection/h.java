package androidx.compose.foundation.text.selection;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.fkq0;
import defpackage.hwd0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class h implements PointerInputEventHandler {
    public final /* synthetic */ i a;
    public final /* synthetic */ fkq0 b;

    public h(i iVar, fkq0 fkq0Var) {
        this.a = iVar;
        this.b = fkq0Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hwd0 hwd0Var, Continuation continuation) {
        Object l = androidx.compose.foundation.gestures.c.l(hwd0Var, new SelectionManager$onClearSelectionRequested$1$1(this.a, this.b, null), continuation);
        return l == CoroutineSingletons.COROUTINE_SUSPENDED ? l : zy11.a;
    }
}
