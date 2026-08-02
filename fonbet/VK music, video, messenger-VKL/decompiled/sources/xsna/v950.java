package xsna;

import com.vk.catalog.mvi.block.music.impl.filters.MusicTabsFiltersView;
import com.vk.catalog.mvi.legacy.core.CatalogLegacyBlockImpl;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog2.common.ui.holders.CatalogMviVh;

/* compiled from: CatalogLegacyBlockRegisterImpl.kt */
/* loaded from: classes.dex */
public final class v950 implements h8a {
    public final /* synthetic */ CatalogBlockVariant a;
    public final /* synthetic */ o8a b;
    public final /* synthetic */ s950 c;
    public final /* synthetic */ com.vk.catalog.mvi.block.music.impl.filters.a d;
    public final /* synthetic */ MusicTabsFiltersView.a e;
    public final /* synthetic */ g8a f;

    public v950(CatalogBlockVariant catalogBlockVariant, o8a o8aVar, s950 s950Var, com.vk.catalog.mvi.block.music.impl.filters.a aVar, MusicTabsFiltersView.a aVar2, g8a g8aVar) {
        this.a = catalogBlockVariant;
        this.b = o8aVar;
        this.c = s950Var;
        this.d = aVar;
        this.e = aVar2;
        this.f = g8aVar;
    }

    @Override // xsna.h8a
    public final CatalogLegacyBlockImpl a(CatalogMviVh.a aVar) {
        return new CatalogLegacyBlockImpl(this.a, aVar, this.b, new u950(this.c), this.d, this.e, this.f);
    }
}
