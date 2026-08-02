package xsna;

import com.vk.catalog.mvi.block.CatalogBlockState;

/* compiled from: CatalogBlockInlineActorFactory.kt */
/* loaded from: classes.dex */
public final class us3<State extends CatalogBlockState> implements t1a {
    public final /* synthetic */ ps3 b;

    public us3(ps3 ps3Var) {
        this.b = ps3Var;
    }

    @Override // xsna.t1a
    public final s1a<State> a(b2a b2aVar) {
        return (s1a) this.b.invoke(b2aVar);
    }
}
