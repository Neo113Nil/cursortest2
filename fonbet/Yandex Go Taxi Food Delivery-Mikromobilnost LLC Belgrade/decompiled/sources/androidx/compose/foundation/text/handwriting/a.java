package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.gestures.c;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.gyu0;
import defpackage.hwd0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class a implements PointerInputEventHandler {
    public final /* synthetic */ gyu0 a;

    public a(gyu0 gyu0Var) {
        this.a = gyu0Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hwd0 hwd0Var, Continuation continuation) {
        Object l = c.l(hwd0Var, new StylusHandwritingNode$suspendingPointerInputModifierNode$1$1(this.a, null), continuation);
        return l == CoroutineSingletons.COROUTINE_SUSPENDED ? l : zy11.a;
    }
}
