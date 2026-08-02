package xsna;

import com.vk.catalog.mvi.block.impl.HeaderView;
import com.vk.catalog.mvi.legacy.core.CatalogLegacyBlockImpl;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog2.common.ui.holders.CatalogMviVh;

/* compiled from: CatalogLegacyBlockRegisterImpl.kt */
/* loaded from: classes.dex */
public final class jyu implements h8a {
    public final /* synthetic */ CatalogBlockVariant a;
    public final /* synthetic */ o8a b;
    public final /* synthetic */ gyu c;
    public final /* synthetic */ HeaderView.e d;
    public final /* synthetic */ HeaderView.a e;
    public final /* synthetic */ g8a f;

    public jyu(CatalogBlockVariant catalogBlockVariant, o8a o8aVar, gyu gyuVar, HeaderView.e eVar, HeaderView.a aVar, g8a g8aVar) {
        this.a = catalogBlockVariant;
        this.b = o8aVar;
        this.c = gyuVar;
        this.d = eVar;
        this.e = aVar;
        this.f = g8aVar;
    }

    @Override // xsna.h8a
    public final CatalogLegacyBlockImpl a(CatalogMviVh.a aVar) {
        return new CatalogLegacyBlockImpl(this.a, aVar, this.b, new iyu(this.c), this.d, this.e, this.f);
    }
}
