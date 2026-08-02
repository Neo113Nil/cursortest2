package xsna;

import com.vk.catalog.mvi.section.screen.impl.ui.entity.CatalogSectionScreenState;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CatalogSectionScreenFragment.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class gfa implements xy, g0t {
    public final /* synthetic */ bn50<CatalogSectionScreenState, CatalogSectionScreenState, bfa, dfa> b;

    public gfa(bn50<CatalogSectionScreenState, CatalogSectionScreenState, bfa, dfa> bn50Var) {
        this.b = bn50Var;
    }

    @Override // xsna.xy
    public final void a(lj50 lj50Var) {
        this.b.b((bfa) lj50Var);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof xy) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.b, bn50.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
