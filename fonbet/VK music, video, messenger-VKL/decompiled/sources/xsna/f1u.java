package xsna;

import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import java.util.Map;

/* compiled from: GlobalCatalogBlockRegister.kt */
/* loaded from: classes.dex */
public final class f1u implements cg50 {
    public final /* synthetic */ dg50 a = new dg50();

    @Override // xsna.cg50
    public final void a(CatalogBlockVariant catalogBlockVariant, f2a<?> f2aVar) {
        this.a.a(catalogBlockVariant, f2aVar);
    }

    @Override // xsna.cg50
    public final Map<CatalogBlockVariant, f2a<?>> b() {
        return this.a.b;
    }

    @Override // xsna.cg50
    public final void c(Class<? extends CatalogBlockState> cls, t1a<? super CatalogBlockState> t1aVar) {
        this.a.c(cls, t1aVar);
    }

    @Override // xsna.cg50
    public final Map<Class<? extends CatalogBlockState>, s2a<? super CatalogBlockState, ?>> d() {
        return this.a.d;
    }

    @Override // xsna.cg50
    public final Map<Class<? extends r2a>, k2a> e() {
        return this.a.e;
    }

    @Override // xsna.cg50
    public final Map<Class<? extends CatalogBlockState>, t1a<? super CatalogBlockState>> f() {
        return this.a.c;
    }

    @Override // xsna.cg50
    public final void g(Class cls, m2a m2aVar) {
        this.a.g(cls, m2aVar);
    }

    @Override // xsna.cg50
    public final void h(Class<? extends CatalogBlockState> cls, s2a<? super CatalogBlockState, ?> s2aVar) {
        this.a.h(cls, s2aVar);
    }
}
