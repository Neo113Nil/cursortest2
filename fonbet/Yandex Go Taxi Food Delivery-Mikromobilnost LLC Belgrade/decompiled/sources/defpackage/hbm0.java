package defpackage;

import com.ybsdk.feature.savings.internal.screens.dashboard.a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class hbm0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ hbm0(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        r0 r0Var;
        Object value;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                pzt0 pzt0Var = aVar.J;
                if (pzt0Var == null || !pzt0Var.isActive()) {
                    aVar.e0(false);
                    break;
                }
                break;
            default:
                iam0 iam0Var = (iam0) obj;
                pz40 Y = aVar.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, ebm0.a((ebm0) value, null, false, null, false, null, iam0Var, 0, false, false, null, 991)));
        }
        return zy11Var;
    }
}
