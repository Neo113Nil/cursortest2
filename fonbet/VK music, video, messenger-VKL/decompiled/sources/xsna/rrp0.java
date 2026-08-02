package xsna;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Trimmer.kt */
/* loaded from: classes2.dex */
public final class rrp0 implements PointerInputEventHandler {
    public final /* synthetic */ lrp0 a;
    public final /* synthetic */ krp0 b;
    public final /* synthetic */ gzs<s3q0> c;

    public rrp0(lrp0 lrp0Var, krp0 krp0Var, gzs<s3q0> gzsVar) {
        this.a = lrp0Var;
        this.b = krp0Var;
        this.c = gzsVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
        lrp0 lrp0Var = this.a;
        if (lrp0Var == null) {
            return s3q0.a;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Object g = lgo.g(dmb0Var, new eb50(lrp0Var, ref$ObjectRef, this.c, dmb0Var, 1), new i66(ref$ObjectRef, this.b, lrp0Var, 4), new wn7(16, ref$ObjectRef, lrp0Var), spjVar, 4);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (g != coroutineSingletons) {
            g = s3q0.a;
        }
        return g == coroutineSingletons ? g : s3q0.a;
    }
}
