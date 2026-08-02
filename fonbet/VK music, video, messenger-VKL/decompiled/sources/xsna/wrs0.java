package xsna;

import com.vk.catalog.mvi.legacy.core.CatalogLegacyBlockImpl;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog2.common.ui.holders.CatalogMviVh;

/* compiled from: CatalogLegacyBlockRegisterImpl.kt */
/* loaded from: classes.dex */
public final class wrs0 implements h8a {
    public final /* synthetic */ CatalogBlockVariant a;
    public final /* synthetic */ o8a b;
    public final /* synthetic */ irs0 c;
    public final /* synthetic */ yrs0 d;
    public final /* synthetic */ srs0 e;
    public final /* synthetic */ g8a f;

    public wrs0(CatalogBlockVariant catalogBlockVariant, o8a o8aVar, irs0 irs0Var, yrs0 yrs0Var, srs0 srs0Var, g8a g8aVar) {
        this.a = catalogBlockVariant;
        this.b = o8aVar;
        this.c = irs0Var;
        this.d = yrs0Var;
        this.e = srs0Var;
        this.f = g8aVar;
    }

    @Override // xsna.h8a
    public final CatalogLegacyBlockImpl a(CatalogMviVh.a aVar) {
        return new CatalogLegacyBlockImpl(this.a, aVar, this.b, new vrs0(this.c), this.d, this.e, this.f);
    }
}
