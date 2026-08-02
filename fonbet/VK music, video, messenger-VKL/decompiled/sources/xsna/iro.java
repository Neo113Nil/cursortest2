package xsna;

import com.vk.dzenarticle.impl.ui.entity.DzenArticleState;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DzenArticleFragment.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class iro implements xy, g0t {
    public final /* synthetic */ bn50<DzenArticleState, DzenArticleState, cro, fro> b;

    public iro(bn50<DzenArticleState, DzenArticleState, cro, fro> bn50Var) {
        this.b = bn50Var;
    }

    @Override // xsna.xy
    public final void a(lj50 lj50Var) {
        this.b.b((cro) lj50Var);
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
