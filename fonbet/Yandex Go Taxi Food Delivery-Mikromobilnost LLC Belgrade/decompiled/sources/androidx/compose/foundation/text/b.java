package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.j;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.bvf0;
import defpackage.hwd0;
import defpackage.yly0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class b implements PointerInputEventHandler {
    public final /* synthetic */ yly0 a;
    public final /* synthetic */ j b;

    public b(yly0 yly0Var, j jVar) {
        this.a = yly0Var;
        this.b = jVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hwd0 hwd0Var, Continuation continuation) {
        Object n = bvf0.n(new CoreTextFieldKt$TextFieldCursorHandle$2$1$1(hwd0Var, this.a, this.b, null), continuation);
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : zy11.a;
    }
}
