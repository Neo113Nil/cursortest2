package xsna;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: DragAndDropReorder.kt */
/* loaded from: classes16.dex */
public final class qfo implements PointerInputEventHandler {
    public final /* synthetic */ wfo a;
    public final /* synthetic */ Object b;

    public qfo(wfo wfoVar, Object obj) {
        this.a = wfoVar;
        this.b = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
        wfo wfoVar = this.a;
        Object f = lgo.f(dmb0Var, new u9(14, wfoVar, this.b), new ozf(wfoVar, 21), new gbh(wfoVar, 12), new v95(wfoVar, 4), spjVar);
        return f == CoroutineSingletons.COROUTINE_SUSPENDED ? f : s3q0.a;
    }
}
