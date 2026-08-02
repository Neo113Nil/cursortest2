package xsna;

import com.vk.catalog.mvi.block.CatalogBlockState;

/* compiled from: CatalogBlockInlineActorFactory.kt */
/* loaded from: classes16.dex */
public final class vs3<State extends CatalogBlockState> implements t1a {
    public final /* synthetic */ qs3 b;

    public vs3(qs3 qs3Var) {
        this.b = qs3Var;
    }

    @Override // xsna.t1a
    public final s1a<State> a(b2a b2aVar) {
        return (s1a) this.b.invoke(b2aVar);
    }
}
