package defpackage;

import com.ybsdk.feature.dashboard.internal.ui.dashboard3.d;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class omg implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ omg(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        d dVar = this.b;
        switch (i) {
            case 0:
                pzt0 pzt0Var = dVar.M;
                if (pzt0Var == null || !pzt0Var.isActive()) {
                    d.g0(dVar);
                    break;
                }
                break;
            case 1:
                d.g0(dVar);
                break;
            default:
                pzt0 pzt0Var2 = dVar.M;
                if (pzt0Var2 == null || !pzt0Var2.isActive()) {
                    d.g0(dVar);
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
