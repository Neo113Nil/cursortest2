package xsna;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: DragAndDropReorder.kt */
/* loaded from: classes16.dex */
public final class rfo implements PointerInputEventHandler {
    public final /* synthetic */ nfu a;
    public final /* synthetic */ Object b;

    public rfo(nfu nfuVar, Object obj) {
        this.a = nfuVar;
        this.b = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
        nfu nfuVar = this.a;
        Object f = lgo.f(dmb0Var, new jp5(10, nfuVar, this.b), new xyh(nfuVar, 8), new mag(nfuVar, 17), new qw6(nfuVar, 4), spjVar);
        return f == CoroutineSingletons.COROUTINE_SUSPENDED ? f : s3q0.a;
    }
}
