package defpackage;

import androidx.compose.foundation.gestures.z;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class kx20 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ sls b;

    public /* synthetic */ kx20(int i, sls slsVar) {
        this.a = i;
        this.b = slsVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hwd0 hwd0Var, Continuation continuation) {
        int i = this.a;
        sls slsVar = this.b;
        switch (i) {
            case 0:
                return z.f(hwd0Var, null, null, new ic0(28, slsVar), continuation, 7);
            case 1:
                Object f = z.f(hwd0Var, null, null, new ic0(29, slsVar), continuation, 7);
                return f == CoroutineSingletons.COROUTINE_SUSPENDED ? f : zy11.a;
            default:
                return z.f(hwd0Var, null, null, new e350(1, slsVar), continuation, 7);
        }
    }
}
