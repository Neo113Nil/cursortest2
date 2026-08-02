package xsna;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: CropEditorScreen.kt */
/* loaded from: classes4.dex */
public final class sgk implements PointerInputEventHandler {
    public final /* synthetic */ ygk a;

    public sgk(ygk ygkVar) {
        this.a = ygkVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
        Object c = d7s.c(dmb0Var, new ekp0(false, new rgk(this.a, 0), null), spjVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (c != coroutineSingletons) {
            c = s3q0.a;
        }
        return c == coroutineSingletons ? c : s3q0.a;
    }
}
