package xsna;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: SelectionController.kt */
/* loaded from: classes11.dex */
public final class kci0 implements PointerInputEventHandler {
    public final /* synthetic */ mci0 a;
    public final /* synthetic */ lci0 b;

    public kci0(mci0 mci0Var, lci0 lci0Var) {
        this.a = mci0Var;
        this.b = lci0Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
        Object c = d7s.c(dmb0Var, new zci0(new ykc(dmb0Var.getViewConfiguration()), this.a, this.b, null), spjVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (c != coroutineSingletons) {
            c = s3q0.a;
        }
        return c == coroutineSingletons ? c : s3q0.a;
    }
}
