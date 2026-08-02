package xsna;

import com.vk.search.integration.api.SearchDelegate;
import xsna.iqh0;

/* compiled from: SearchDelegateFactoryImpl.kt */
/* loaded from: classes5.dex */
public final class lqh0 implements kqh0 {
    public final arh0 b;

    public lqh0(arh0 arh0Var) {
        this.b = arh0Var;
    }

    @Override // xsna.kqh0
    public final SearchDelegate a(iqh0 iqh0Var) {
        return iqh0Var instanceof iqh0.b ? new n620(iqh0Var, new hyh0(), new zwh0(new mv90(((iqh0.b) iqh0Var).f))) : iqh0Var instanceof iqh0.d ? new mqh0(iqh0Var, new mo8(((iqh0.d) iqh0Var).e, 2), new hyh0()) : iqh0Var instanceof iqh0.a ? new mqh0(iqh0Var, new mo8(((iqh0.a) iqh0Var).d, 2), new hyh0()) : iqh0Var instanceof iqh0.c ? new mqh0(iqh0Var, new mo8(((iqh0.c) iqh0Var).d, 2), new hyh0()) : new mqh0(iqh0Var, new mo8(null, 3), new hyh0());
    }

    @Override // xsna.kqh0
    public final iax b(iqh0.e eVar) {
        return new jax(eVar, new hyh0(), this.b);
    }
}
