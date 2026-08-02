package xsna;

import com.vk.catalog.mvi.block.CatalogBlockState;

/* compiled from: CatalogBlockInlineActorFactory.kt */
/* loaded from: classes.dex */
public final class bcq0<State extends CatalogBlockState> implements t1a {
    public final /* synthetic */ nu2 b;

    public bcq0(nu2 nu2Var) {
        this.b = nu2Var;
    }

    @Override // xsna.t1a
    public final s1a<State> a(b2a b2aVar) {
        return (s1a) this.b.invoke(b2aVar);
    }
}
