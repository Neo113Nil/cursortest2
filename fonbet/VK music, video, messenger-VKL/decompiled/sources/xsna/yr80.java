package xsna;

import com.vk.catalog.mvi.block.impl.OpenSectionArrowButtonView;
import com.vk.catalog.mvi.legacy.core.CatalogLegacyBlockImpl;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog2.common.ui.holders.CatalogMviVh;

/* compiled from: CatalogLegacyBlockRegisterImpl.kt */
/* loaded from: classes.dex */
public final class yr80 implements h8a {
    public final /* synthetic */ CatalogBlockVariant a;
    public final /* synthetic */ o8a b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ com.vk.catalog.mvi.block.impl.u d;
    public final /* synthetic */ OpenSectionArrowButtonView.a e;
    public final /* synthetic */ g8a f;

    public yr80(CatalogBlockVariant catalogBlockVariant, o8a o8aVar, izs izsVar, com.vk.catalog.mvi.block.impl.u uVar, OpenSectionArrowButtonView.a aVar, g8a g8aVar) {
        this.a = catalogBlockVariant;
        this.b = o8aVar;
        this.c = izsVar;
        this.d = uVar;
        this.e = aVar;
        this.f = g8aVar;
    }

    @Override // xsna.h8a
    public final CatalogLegacyBlockImpl a(CatalogMviVh.a aVar) {
        return new CatalogLegacyBlockImpl(this.a, aVar, this.b, new xr80(this.c), this.d, this.e, this.f);
    }
}
