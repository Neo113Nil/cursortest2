package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import xsna.ltd0;

/* compiled from: ProductsSelectionReducer.kt */
/* loaded from: classes18.dex */
public final class mtd0 extends dm50<ptd0, ltd0, otd0> {
    @Override // xsna.dm50
    public final otd0 c(otd0 otd0Var, ltd0 ltd0Var) {
        otd0 otd0Var2 = otd0Var;
        ltd0 ltd0Var2 = ltd0Var;
        if (ltd0Var2 instanceof ltd0.d) {
            return otd0.a(otd0Var2, ((ltd0.d) ltd0Var2).b, 0, null, false, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
        }
        if (ltd0Var2 instanceof ltd0.c) {
            return otd0.a(otd0Var2, null, ((ltd0.c) ltd0Var2).b, null, false, 959);
        }
        if (ltd0Var2 instanceof ltd0.a) {
            return otd0.a(otd0Var2, null, 0, ((ltd0.a) ltd0Var2).b, false, 255);
        }
        if (ltd0Var2 instanceof ltd0.b) {
            return otd0.a(otd0Var2, null, 0, null, true, 255);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final ptd0 d() {
        return new ptd0(e(new qey(29)), e(new qcw(19)), e(new nc90(6)));
    }

    @Override // xsna.dm50
    public final void h(otd0 otd0Var, ptd0 ptd0Var) {
        otd0 otd0Var2 = otd0Var;
        ptd0 ptd0Var2 = ptd0Var;
        if (otd0Var2.k) {
            f(ptd0Var2.a, otd0Var2);
        } else if (otd0Var2.j != null) {
            f(ptd0Var2.b, otd0Var2);
        } else {
            f(ptd0Var2.c, otd0Var2);
        }
    }
}
