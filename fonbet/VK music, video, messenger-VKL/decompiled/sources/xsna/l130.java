package xsna;

import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import xsna.j130;
import xsna.p130;

/* compiled from: ModalPostReactionsFeature.kt */
/* loaded from: classes4.dex */
public final class l130 extends wk50<b230, s130, j130, p130> {
    public final Bundle f;
    public final tst g;

    public l130(r130 r130Var, Bundle bundle, tst tstVar) {
        super(j130.a.b, r130Var);
        this.f = bundle;
        this.g = tstVar;
    }

    @Override // xsna.wk50
    public final void N(s130 s130Var, j130 j130Var) {
        j130 j130Var2 = j130Var;
        if (!j130Var2.equals(j130.a.b) && !j130Var2.equals(j130.b.b)) {
            if (!(j130Var2 instanceof j130.c)) {
                throw new NoWhenBranchMatchedException();
            }
            j130.c cVar = (j130.c) j130Var2;
            T(new p130.c(cVar.b, cVar.c));
            return;
        }
        T(p130.b.b);
        tst tstVar = this.g;
        att attVar = tstVar.a;
        Bundle bundle = this.f;
        this.e.b(new io.reactivex.rxjava3.internal.operators.single.r(attVar.a(bundle), new com.vk.movika.sdk.base.hooks.k(new z5a(11, bundle, tstVar), 28)).l(new mj1(new ozh(tstVar, 18), 23)).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new k130(new eiz(this, 7), 0), new f5y(new fju(this, 8), 3)));
    }
}
