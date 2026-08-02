package xsna;

import com.vk.catalog.mvi.block.music.impl.buttons.SavePlaylistByFilterButton;
import com.vk.catalog.mvi.legacy.core.CatalogLegacyBlockImpl;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog2.common.ui.holders.CatalogMviVh;

/* compiled from: CatalogLegacyBlockRegisterImpl.kt */
/* loaded from: classes.dex */
public final class b1h0 implements h8a {
    public final /* synthetic */ CatalogBlockVariant a;
    public final /* synthetic */ o8a b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ com.vk.catalog.mvi.block.music.impl.buttons.b d;
    public final /* synthetic */ SavePlaylistByFilterButton.a e;
    public final /* synthetic */ g8a f;

    public b1h0(CatalogBlockVariant catalogBlockVariant, o8a o8aVar, izs izsVar, com.vk.catalog.mvi.block.music.impl.buttons.b bVar, SavePlaylistByFilterButton.a aVar, g8a g8aVar) {
        this.a = catalogBlockVariant;
        this.b = o8aVar;
        this.c = izsVar;
        this.d = bVar;
        this.e = aVar;
        this.f = g8aVar;
    }

    @Override // xsna.h8a
    public final CatalogLegacyBlockImpl a(CatalogMviVh.a aVar) {
        return new CatalogLegacyBlockImpl(this.a, aVar, this.b, new a1h0(this.c), this.d, this.e, this.f);
    }
}
