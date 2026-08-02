package xsna;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: TextFieldPointerModifier.common.kt */
/* loaded from: classes11.dex */
public final class pgo0 implements PointerInputEventHandler {
    public final /* synthetic */ gho0 a;

    public pgo0(gho0 gho0Var) {
        this.a = gho0Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
        gho0 gho0Var = this.a;
        Object c = d7s.c(dmb0Var, new zci0(new ykc(dmb0Var.getViewConfiguration()), gho0Var.B, gho0Var.A, null), spjVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (c != coroutineSingletons) {
            c = s3q0.a;
        }
        return c == coroutineSingletons ? c : s3q0.a;
    }
}
