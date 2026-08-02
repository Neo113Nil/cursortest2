package xsna;

import com.vk.search.params.api.SearchParams;
import xsna.ksh0;

/* compiled from: SearchFeatureControllerFactoryImpl.kt */
/* loaded from: classes5.dex */
public final class brh0 implements arh0 {
    public final ywz a;

    public brh0(ywz ywzVar) {
        this.a = ywzVar;
    }

    @Override // xsna.arh0
    public final crh0 W(irh0 irh0Var) {
        return b(irh0Var, null);
    }

    @Override // xsna.arh0
    public final crh0 a(irh0 irh0Var, SearchParams searchParams) {
        return b(irh0Var, searchParams);
    }

    public final crh0 b(irh0 irh0Var, SearchParams searchParams) {
        vqh0 vqh0Var = new vqh0(new csh0(new ksh0(new ksh0.b(null, searchParams, 13), irh0Var, 26), this.a));
        vqh0Var.A();
        return new crh0(vqh0Var);
    }
}
