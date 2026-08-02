package xsna;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.vk.profile.design.compose.header.sink.AuthorHeaderEvent;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: PictureClickModifier.kt */
/* loaded from: classes5.dex */
public final class nja0 implements PointerInputEventHandler {
    public final /* synthetic */ lja0 a;
    public final /* synthetic */ izs<AuthorHeaderEvent, s3q0> b;
    public final /* synthetic */ kja0 c;
    public final /* synthetic */ wh50<zhf0> d;

    /* JADX WARN: Multi-variable type inference failed */
    public nja0(lja0 lja0Var, izs<? super AuthorHeaderEvent, s3q0> izsVar, kja0 kja0Var, wh50<zhf0> wh50Var) {
        this.a = lja0Var;
        this.b = izsVar;
        this.c = kja0Var;
        this.d = wh50Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
        Object e = z2o0.e(dmb0Var, null, null, new p2e(this.a, dmb0Var, this.b, this.c, this.d, 1), spjVar, 7);
        return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : s3q0.a;
    }
}
