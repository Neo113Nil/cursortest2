package xsna;

import com.vk.catalog.mvi.block.CatalogBlockState;

/* compiled from: CatalogBlockInlineActorFactory.kt */
/* loaded from: classes.dex */
public final class ffv<State extends CatalogBlockState> implements t1a {
    public final /* synthetic */ faj b;

    public ffv(faj fajVar) {
        this.b = fajVar;
    }

    @Override // xsna.t1a
    public final s1a<State> a(b2a b2aVar) {
        return (s1a) this.b.invoke(b2aVar);
    }
}
