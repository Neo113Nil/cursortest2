package xsna;

import com.vk.catalog.mvi.legacy.core.CatalogLegacyBlockImpl;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog2.common.ui.holders.CatalogMviVh;

/* compiled from: CatalogLegacyBlockRegisterImpl.kt */
/* loaded from: classes.dex */
public final class cp1 implements h8a {
    public final /* synthetic */ CatalogBlockVariant a;
    public final /* synthetic */ o8a b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ uo1 d;
    public final /* synthetic */ yo1 e;
    public final /* synthetic */ g8a f;

    public cp1(CatalogBlockVariant catalogBlockVariant, o8a o8aVar, izs izsVar, uo1 uo1Var, yo1 yo1Var, g8a g8aVar) {
        this.a = catalogBlockVariant;
        this.b = o8aVar;
        this.c = izsVar;
        this.d = uo1Var;
        this.e = yo1Var;
        this.f = g8aVar;
    }

    @Override // xsna.h8a
    public final CatalogLegacyBlockImpl a(CatalogMviVh.a aVar) {
        return new CatalogLegacyBlockImpl(this.a, aVar, this.b, new bp1(this.c), this.d, this.e, this.f);
    }
}
