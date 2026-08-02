package androidx.compose.material3.internal;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.bvf0;
import defpackage.hwd0;
import defpackage.svz0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class d implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ svz0 b;

    public /* synthetic */ d(svz0 svz0Var, int i) {
        this.a = i;
        this.b = svz0Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hwd0 hwd0Var, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        svz0 svz0Var = this.b;
        switch (i) {
            case 0:
                Object n = bvf0.n(new BasicTooltipKt$handleGestures$1$1(hwd0Var, svz0Var, null), continuation);
                return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : zy11Var;
            default:
                Object n2 = bvf0.n(new BasicTooltipKt$handleGestures$2$1(hwd0Var, svz0Var, null), continuation);
                return n2 == CoroutineSingletons.COROUTINE_SUSPENDED ? n2 : zy11Var;
        }
    }
}
