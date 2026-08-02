package xsna;

import com.vk.catalog.mvi.legacy.core.CatalogLegacyBlockImpl;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog2.common.ui.holders.CatalogMviVh;

/* compiled from: CatalogLegacyBlockRegisterImpl.kt */
/* loaded from: classes.dex */
public final class iqt0 implements h8a {
    public final /* synthetic */ CatalogBlockVariant a;
    public final /* synthetic */ o8a b;
    public final /* synthetic */ rpt0 c;
    public final /* synthetic */ ert0 d;
    public final /* synthetic */ cqt0 e;
    public final /* synthetic */ g8a f;

    public iqt0(CatalogBlockVariant catalogBlockVariant, o8a o8aVar, rpt0 rpt0Var, ert0 ert0Var, cqt0 cqt0Var, g8a g8aVar) {
        this.a = catalogBlockVariant;
        this.b = o8aVar;
        this.c = rpt0Var;
        this.d = ert0Var;
        this.e = cqt0Var;
        this.f = g8aVar;
    }

    @Override // xsna.h8a
    public final CatalogLegacyBlockImpl a(CatalogMviVh.a aVar) {
        return new CatalogLegacyBlockImpl(this.a, aVar, this.b, new hqt0(this.c), this.d, this.e, this.f);
    }
}
