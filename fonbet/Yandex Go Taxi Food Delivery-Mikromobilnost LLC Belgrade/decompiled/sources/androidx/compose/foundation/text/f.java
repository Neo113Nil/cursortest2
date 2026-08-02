package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.z;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.hwd0;
import defpackage.oz40;
import defpackage.tse;
import defpackage.uny0;
import defpackage.zx40;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class f implements PointerInputEventHandler {
    public final /* synthetic */ tse a;
    public final /* synthetic */ oz40 b;
    public final /* synthetic */ zx40 c;
    public final /* synthetic */ oz40 d;

    public f(tse tseVar, oz40 oz40Var, zx40 zx40Var, oz40 oz40Var2) {
        this.a = tseVar;
        this.b = oz40Var;
        this.c = zx40Var;
        this.d = oz40Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hwd0 hwd0Var, Continuation continuation) {
        Object e = z.e(hwd0Var, new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1(this.a, this.b, this.c, null), new uny0(0, this.d), continuation);
        return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : zy11.a;
    }
}
