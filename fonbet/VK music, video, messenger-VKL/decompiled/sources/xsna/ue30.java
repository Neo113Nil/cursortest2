package xsna;

import com.vk.catalog.mvi.legacy.core.CatalogLegacyBlockImpl;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog2.common.ui.holders.CatalogMviVh;

/* compiled from: CatalogLegacyBlockRegisterImpl.kt */
/* loaded from: classes.dex */
public final class ue30 implements h8a {
    public final /* synthetic */ CatalogBlockVariant a;
    public final /* synthetic */ me30 b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ cf30 d;
    public final /* synthetic */ re30 e;
    public final /* synthetic */ g8a f;

    public ue30(CatalogBlockVariant catalogBlockVariant, me30 me30Var, izs izsVar, cf30 cf30Var, re30 re30Var, g8a g8aVar) {
        this.a = catalogBlockVariant;
        this.b = me30Var;
        this.c = izsVar;
        this.d = cf30Var;
        this.e = re30Var;
        this.f = g8aVar;
    }

    @Override // xsna.h8a
    public final CatalogLegacyBlockImpl a(CatalogMviVh.a aVar) {
        return new CatalogLegacyBlockImpl(this.a, aVar, this.b, new te30(this.c), this.d, this.e, this.f);
    }
}
