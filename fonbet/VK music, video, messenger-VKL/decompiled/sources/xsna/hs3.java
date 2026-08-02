package xsna;

import com.vk.catalog.mvi.block.CatalogBlockState;

/* compiled from: CatalogBlockInlineActorFactory.kt */
/* loaded from: classes16.dex */
public final class hs3<State extends CatalogBlockState> implements t1a {
    public final /* synthetic */ zr3 b;

    public hs3(zr3 zr3Var) {
        this.b = zr3Var;
    }

    @Override // xsna.t1a
    public final s1a<State> a(b2a b2aVar) {
        return (s1a) this.b.invoke(b2aVar);
    }
}
