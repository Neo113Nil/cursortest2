package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class fs5 implements j0g0, u7f0, is5 {
    public final /* synthetic */ fyc a;

    public /* synthetic */ fs5(fyc fycVar) {
        this.a = fycVar;
    }

    public void a(ns5 ns5Var) {
        this.a.T(ns5Var);
    }

    public void b(ns5 ns5Var, hs5 hs5Var) {
        this.a.T(new js5(ns5Var, hs5Var));
    }

    public void c(ns5 ns5Var) {
        this.a.T(ns5Var);
    }

    @Override // defpackage.u7f0
    public void onProductDetailsResponse(ns5 ns5Var, List list) {
        this.a.T(new v7f0(ns5Var, (ArrayList) list));
    }

    @Override // defpackage.j0g0
    public void onQueryPurchasesResponse(ns5 ns5Var, List list) {
        this.a.T(new k0g0(ns5Var, list));
    }
}
