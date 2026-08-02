package xsna;

import com.vk.catalog.mvi.block.CatalogBlockState;

/* compiled from: CatalogBlockInlineActorFactory.kt */
/* loaded from: classes16.dex */
public final class u950<State extends CatalogBlockState> implements t1a {
    public final /* synthetic */ s950 b;

    public u950(s950 s950Var) {
        this.b = s950Var;
    }

    @Override // xsna.t1a
    public final s1a<State> a(b2a b2aVar) {
        return (s1a) this.b.invoke(b2aVar);
    }
}
