package xsna;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: ImageCropper.kt */
/* loaded from: classes5.dex */
public final class hiw implements PointerInputEventHandler {
    public final /* synthetic */ gzs<Boolean> a;
    public final /* synthetic */ gzs<Boolean> b;
    public final /* synthetic */ ajk c;

    public hiw(gzs<Boolean> gzsVar, gzs<Boolean> gzsVar2, ajk ajkVar) {
        this.a = gzsVar;
        this.b = gzsVar2;
        this.c = ajkVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
        Object g = lgo.g(dmb0Var, null, null, new mq0(this.a, this.b, this.c, 2), spjVar, 7);
        return g == CoroutineSingletons.COROUTINE_SUSPENDED ? g : s3q0.a;
    }
}
