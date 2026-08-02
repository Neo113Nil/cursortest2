package xsna;

import com.vk.catalog.mvi.legacy.core.CatalogLegacyBlockImpl;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog2.common.ui.holders.CatalogMviVh;

/* compiled from: CatalogLegacyBlockRegisterImpl.kt */
/* loaded from: classes.dex */
public final class dcq0 implements h8a {
    public final /* synthetic */ CatalogBlockVariant a;
    public final /* synthetic */ o8a b;
    public final /* synthetic */ ubq0 c;
    public final /* synthetic */ vbq0 d;
    public final /* synthetic */ zbq0 e;
    public final /* synthetic */ g8a f;

    public dcq0(CatalogBlockVariant catalogBlockVariant, o8a o8aVar, ubq0 ubq0Var, vbq0 vbq0Var, zbq0 zbq0Var, g8a g8aVar) {
        this.a = catalogBlockVariant;
        this.b = o8aVar;
        this.c = ubq0Var;
        this.d = vbq0Var;
        this.e = zbq0Var;
        this.f = g8aVar;
    }

    @Override // xsna.h8a
    public final CatalogLegacyBlockImpl a(CatalogMviVh.a aVar) {
        return new CatalogLegacyBlockImpl(this.a, aVar, this.b, new ccq0(this.c), this.d, this.e, this.f);
    }
}
