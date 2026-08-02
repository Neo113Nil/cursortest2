package defpackage;

import androidx.compose.foundation.text.c;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class ikq0 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ yly0 b;

    public /* synthetic */ ikq0(yly0 yly0Var, int i) {
        this.a = i;
        this.b = yly0Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hwd0 hwd0Var, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        yly0 yly0Var = this.b;
        switch (i) {
            case 0:
                Object e = c.e(hwd0Var, yly0Var, continuation);
                return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : zy11Var;
            default:
                Object e2 = c.e(hwd0Var, yly0Var, continuation);
                return e2 == CoroutineSingletons.COROUTINE_SUSPENDED ? e2 : zy11Var;
        }
    }
}
