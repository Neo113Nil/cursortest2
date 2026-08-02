package xsna;

import com.vk.catalog.mvi.block.CatalogBlockState;

/* compiled from: CatalogBlockInlineActorFactory.kt */
/* loaded from: classes6.dex */
public final class eab0<State extends CatalogBlockState> implements t1a {
    public final /* synthetic */ izs b;

    public eab0(izs izsVar) {
        this.b = izsVar;
    }

    @Override // xsna.t1a
    public final s1a<State> a(b2a b2aVar) {
        return (s1a) this.b.invoke(b2aVar);
    }
}
