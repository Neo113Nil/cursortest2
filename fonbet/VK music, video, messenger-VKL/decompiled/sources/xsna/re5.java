package xsna;

import com.vk.catalog.mvi.block.CatalogBlockState;

/* compiled from: CatalogBlockInlineActorFactory.kt */
/* loaded from: classes.dex */
public final class re5<State extends CatalogBlockState> implements t1a {
    public final /* synthetic */ je5 b;

    public re5(je5 je5Var) {
        this.b = je5Var;
    }

    @Override // xsna.t1a
    public final s1a<State> a(b2a b2aVar) {
        return (s1a) this.b.invoke(b2aVar);
    }
}
