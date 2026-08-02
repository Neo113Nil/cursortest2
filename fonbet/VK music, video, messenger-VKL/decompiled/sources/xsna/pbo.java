package xsna;

import com.vk.catalog.mvi.block.CatalogBlockState;

/* compiled from: CatalogBlockInlineActorFactory.kt */
/* loaded from: classes.dex */
public final class pbo<State extends CatalogBlockState> implements t1a {
    public final /* synthetic */ zdf b;

    public pbo(zdf zdfVar) {
        this.b = zdfVar;
    }

    @Override // xsna.t1a
    public final s1a<State> a(b2a b2aVar) {
        return (s1a) this.b.invoke(b2aVar);
    }
}
