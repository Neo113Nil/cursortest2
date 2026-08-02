package xsna;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: VkClickableText.kt */
/* loaded from: classes17.dex */
public final class uku0 implements PointerInputEventHandler {
    public final /* synthetic */ wh50<ljo0> a;
    public final /* synthetic */ izs<Integer, s3q0> b;
    public final /* synthetic */ izs<Integer, s3q0> c;

    /* JADX WARN: Multi-variable type inference failed */
    public uku0(wh50<ljo0> wh50Var, izs<? super Integer, s3q0> izsVar, izs<? super Integer, s3q0> izsVar2) {
        this.a = wh50Var;
        this.b = izsVar;
        this.c = izsVar2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
        wh50<ljo0> wh50Var = this.a;
        Object e = z2o0.e(dmb0Var, new m4t0(2, wh50Var, this.b), null, new cpo0(5, wh50Var, this.c), spjVar, 5);
        return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : s3q0.a;
    }
}
