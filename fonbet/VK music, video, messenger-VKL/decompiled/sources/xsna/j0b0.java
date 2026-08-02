package xsna;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: PlayerContentView.kt */
/* loaded from: classes3.dex */
public final class j0b0 implements PointerInputEventHandler {
    public final /* synthetic */ kg50 a;
    public final /* synthetic */ izs<sx40, s3q0> b;

    /* JADX WARN: Multi-variable type inference failed */
    public j0b0(kg50 kg50Var, izs<? super sx40, s3q0> izsVar) {
        this.a = kg50Var;
        this.b = izsVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
        kg50 kg50Var = this.a;
        i0b0 i0b0Var = new i0b0(kg50Var, 0);
        mk mkVar = new mk(19, this.b, kg50Var);
        hvz hvzVar = new hvz(kg50Var, 24);
        k87 k87Var = new k87(kg50Var, 10);
        float f = lgo.a;
        Object c = d7s.c(dmb0Var, new hgo(null, mkVar, hvzVar, i0b0Var, k87Var), spjVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (c != coroutineSingletons) {
            c = s3q0.a;
        }
        return c == coroutineSingletons ? c : s3q0.a;
    }
}
