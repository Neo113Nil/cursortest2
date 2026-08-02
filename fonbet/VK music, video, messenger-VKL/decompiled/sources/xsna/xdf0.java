package xsna;

import com.vk.catalog.mvi.block.CatalogBlockState;

/* compiled from: CatalogBlockInlineActorFactory.kt */
/* loaded from: classes.dex */
public final class xdf0<State extends CatalogBlockState> implements t1a {
    public final /* synthetic */ udf0 b;

    public xdf0(udf0 udf0Var) {
        this.b = udf0Var;
    }

    @Override // xsna.t1a
    public final s1a<State> a(b2a b2aVar) {
        return (s1a) this.b.invoke(b2aVar);
    }
}
