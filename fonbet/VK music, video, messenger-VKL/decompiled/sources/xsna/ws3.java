package xsna;

import com.vk.catalog.mvi.legacy.core.CatalogLegacyBlockImpl;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog2.common.ui.holders.CatalogMviVh;

/* compiled from: CatalogLegacyBlockRegisterImpl.kt */
/* loaded from: classes.dex */
public final class ws3 implements h8a {
    public final /* synthetic */ CatalogBlockVariant a;
    public final /* synthetic */ o8a b;
    public final /* synthetic */ qs3 c;
    public final /* synthetic */ kt3 d;
    public final /* synthetic */ ts3 e;
    public final /* synthetic */ g8a f;

    public ws3(CatalogBlockVariant catalogBlockVariant, o8a o8aVar, qs3 qs3Var, kt3 kt3Var, ts3 ts3Var, g8a g8aVar) {
        this.a = catalogBlockVariant;
        this.b = o8aVar;
        this.c = qs3Var;
        this.d = kt3Var;
        this.e = ts3Var;
        this.f = g8aVar;
    }

    @Override // xsna.h8a
    public final CatalogLegacyBlockImpl a(CatalogMviVh.a aVar) {
        return new CatalogLegacyBlockImpl(this.a, aVar, this.b, new vs3(this.c), this.d, this.e, this.f);
    }
}
