package androidx.compose.foundation.pager;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.bvf0;
import defpackage.hwd0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class a implements PointerInputEventHandler {
    public final /* synthetic */ d a;

    public a(d dVar) {
        this.a = dVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hwd0 hwd0Var, Continuation continuation) {
        Object n = bvf0.n(new LazyLayoutPagerKt$dragDirectionDetector$1$1(hwd0Var, this.a, null), continuation);
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : zy11.a;
    }
}
