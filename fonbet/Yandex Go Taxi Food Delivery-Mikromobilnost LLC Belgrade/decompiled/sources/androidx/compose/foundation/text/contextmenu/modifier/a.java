package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.ely0;
import defpackage.hwd0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class a implements PointerInputEventHandler {
    public final /* synthetic */ ely0 a;

    public a(ely0 ely0Var) {
        this.a = ely0Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hwd0 hwd0Var, Continuation continuation) {
        Object b = androidx.compose.foundation.text.contextmenu.gestures.a.b(hwd0Var, new TextContextMenuGestureNode$1$1(1, this.a, ely0.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0), continuation);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : zy11.a;
    }
}
