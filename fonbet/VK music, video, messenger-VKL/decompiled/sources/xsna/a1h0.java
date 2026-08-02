package xsna;

import com.vk.catalog.mvi.block.CatalogBlockState;

/* compiled from: CatalogBlockInlineActorFactory.kt */
/* loaded from: classes16.dex */
public final class a1h0<State extends CatalogBlockState> implements t1a {
    public final /* synthetic */ izs b;

    public a1h0(izs izsVar) {
        this.b = izsVar;
    }

    @Override // xsna.t1a
    public final s1a<State> a(b2a b2aVar) {
        return (s1a) this.b.invoke(b2aVar);
    }
}
