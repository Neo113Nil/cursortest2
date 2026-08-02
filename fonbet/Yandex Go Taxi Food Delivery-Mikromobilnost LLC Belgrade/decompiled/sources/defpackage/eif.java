package defpackage;

import com.yandex.plus.core.debug.panel.internal.presentation.viewModel.a;
import com.ybsdk.common.repositiories.auth.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class eif implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;

    public /* synthetic */ eif(r0 r0Var, int i) {
        this.a = i;
        this.b = r0Var;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        r0 r0Var = this.b;
        switch (i) {
            case 0:
                Object collect = r0Var.collect(new d(vprVar), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            default:
                Object collect2 = r0Var.collect(new a(vprVar), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
        }
    }
}
