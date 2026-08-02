package xsna;

import com.vk.music.screens.about.entity.CommunityProfileLinksState;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CommunityProfileLinksFragment.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class rqh implements xy, g0t {
    public final /* synthetic */ bn50<CommunityProfileLinksState, CommunityProfileLinksState, iqh, qqh> b;

    public rqh(bn50<CommunityProfileLinksState, CommunityProfileLinksState, iqh, qqh> bn50Var) {
        this.b = bn50Var;
    }

    @Override // xsna.xy
    public final void a(lj50 lj50Var) {
        this.b.b((iqh) lj50Var);
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
