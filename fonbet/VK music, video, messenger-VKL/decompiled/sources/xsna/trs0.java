package xsna;

import com.vk.catalog.mvi.block.CatalogBlockState;

/* compiled from: CatalogBlockInlineActorFactory.kt */
/* loaded from: classes.dex */
public final class trs0<State extends CatalogBlockState> implements t1a {
    public final /* synthetic */ jrs0 b;

    public trs0(jrs0 jrs0Var) {
        this.b = jrs0Var;
    }

    @Override // xsna.t1a
    public final s1a<State> a(b2a b2aVar) {
        return (s1a) this.b.invoke(b2aVar);
    }
}
