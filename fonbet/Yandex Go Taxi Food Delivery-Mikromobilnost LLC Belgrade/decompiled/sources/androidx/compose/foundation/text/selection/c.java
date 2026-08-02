package androidx.compose.foundation.text.selection;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.hwd0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class c implements PointerInputEventHandler {
    public final /* synthetic */ tls a;

    public c(tls tlsVar) {
        this.a = tlsVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hwd0 hwd0Var, Continuation continuation) {
        Object E0 = ((androidx.compose.ui.input.pointer.g) hwd0Var).E0(new SelectionGesturesKt$updateSelectionTouchMode$1$1(this.a, null), continuation);
        return E0 == CoroutineSingletons.COROUTINE_SUSPENDED ? E0 : zy11.a;
    }
}
