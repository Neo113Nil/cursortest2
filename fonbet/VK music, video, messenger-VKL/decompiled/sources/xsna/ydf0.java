package xsna;

import com.vk.catalog.mvi.block.CatalogBlockState;

/* compiled from: CatalogBlockInlineActorFactory.kt */
/* loaded from: classes16.dex */
public final class ydf0<State extends CatalogBlockState> implements t1a {
    public final /* synthetic */ tdf0 b;

    public ydf0(tdf0 tdf0Var) {
        this.b = tdf0Var;
    }

    @Override // xsna.t1a
    public final s1a<State> a(b2a b2aVar) {
        return (s1a) this.b.invoke(b2aVar);
    }
}
