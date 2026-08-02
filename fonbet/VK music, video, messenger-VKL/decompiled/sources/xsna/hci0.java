package xsna;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: SelectionContainer.kt */
/* loaded from: classes11.dex */
public final class hci0 implements PointerInputEventHandler {
    public final /* synthetic */ zdo0 a;

    public hci0(zdo0 zdo0Var) {
        this.a = zdo0Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
        Object a = m500.a(dmb0Var, this.a, spjVar);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : s3q0.a;
    }
}
