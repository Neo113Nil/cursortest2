package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.jc5;

/* compiled from: AuthorSelectionReducer.kt */
/* loaded from: classes4.dex */
public final class mc5 extends dm50<zc5, jc5, oc5> {
    @Override // xsna.dm50
    public final oc5 c(oc5 oc5Var, jc5 jc5Var) {
        jc5 jc5Var2 = jc5Var;
        if (!(jc5Var2 instanceof jc5.a)) {
            throw new NoWhenBranchMatchedException();
        }
        jc5.a aVar = (jc5.a) jc5Var2;
        return new oc5(aVar.b, aVar.c);
    }

    @Override // xsna.dm50
    public final zc5 d() {
        return new zc5(e(new com.vk.movika.sdk.base.observable.u(4)), e(new rd1(2)));
    }

    @Override // xsna.dm50
    public final void h(oc5 oc5Var, zc5 zc5Var) {
        f(zc5Var.a, oc5Var);
    }
}
