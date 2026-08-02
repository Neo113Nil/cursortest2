package xsna;

import com.vk.catalog.mvi.legacy.core.CatalogLegacyBlockImpl;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog2.common.ui.holders.CatalogMviVh;

/* compiled from: CatalogLegacyBlockRegisterImpl.kt */
/* loaded from: classes.dex */
public final class cr1 implements h8a {
    public final /* synthetic */ CatalogBlockVariant a;
    public final /* synthetic */ o8a b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ tq1 d;
    public final /* synthetic */ ar1 e;
    public final /* synthetic */ g8a f;

    public cr1(CatalogBlockVariant catalogBlockVariant, o8a o8aVar, izs izsVar, tq1 tq1Var, ar1 ar1Var, g8a g8aVar) {
        this.a = catalogBlockVariant;
        this.b = o8aVar;
        this.c = izsVar;
        this.d = tq1Var;
        this.e = ar1Var;
        this.f = g8aVar;
    }

    @Override // xsna.h8a
    public final CatalogLegacyBlockImpl a(CatalogMviVh.a aVar) {
        return new CatalogLegacyBlockImpl(this.a, aVar, this.b, new br1(this.c), this.d, this.e, this.f);
    }
}
