package xsna;

import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: MutableCatalogBlockRegisterImpl.kt */
/* loaded from: classes.dex */
public final class dg50 implements cg50 {
    public final boolean a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;

    public /* synthetic */ dg50() {
        this(null, false);
    }

    @Override // xsna.cg50
    public final void a(CatalogBlockVariant catalogBlockVariant, f2a<?> f2aVar) {
        LinkedHashMap linkedHashMap = this.b;
        if (!linkedHashMap.containsKey(catalogBlockVariant) || this.a) {
            linkedHashMap.put(catalogBlockVariant, f2aVar);
            return;
        }
        throw new IllegalStateException(("duplicated mapper for variant " + catalogBlockVariant + ". Old: " + ((f2a) linkedHashMap.get(catalogBlockVariant)) + ", new: " + f2aVar).toString());
    }

    @Override // xsna.cg50
    public final Map<CatalogBlockVariant, f2a<?>> b() {
        return this.b;
    }

    @Override // xsna.cg50
    public final void c(Class<? extends CatalogBlockState> cls, t1a<? super CatalogBlockState> t1aVar) {
        LinkedHashMap linkedHashMap = this.c;
        if (!linkedHashMap.containsKey(cls) || this.a) {
            linkedHashMap.put(cls, t1aVar);
            return;
        }
        t1a t1aVar2 = (t1a) linkedHashMap.get(cls);
        throw new IllegalStateException(("duplicated inlineActorFactory for class " + cls.getCanonicalName() + ". Old: " + t1aVar2 + ", new: " + t1aVar).toString());
    }

    @Override // xsna.cg50
    public final Map<Class<? extends CatalogBlockState>, s2a<? super CatalogBlockState, ?>> d() {
        return this.d;
    }

    @Override // xsna.cg50
    public final Map<Class<? extends r2a>, k2a> e() {
        return this.e;
    }

    @Override // xsna.cg50
    public final Map<Class<? extends CatalogBlockState>, t1a<? super CatalogBlockState>> f() {
        return this.c;
    }

    @Override // xsna.cg50
    public final void g(Class cls, m2a m2aVar) {
        LinkedHashMap linkedHashMap = this.e;
        if (!linkedHashMap.containsKey(cls) || this.a) {
            linkedHashMap.put(cls, m2aVar);
            return;
        }
        throw new IllegalStateException(("duplicated view for class " + cls.getCanonicalName() + ". Old: " + ((k2a) linkedHashMap.get(cls)) + ", new: " + m2aVar).toString());
    }

    @Override // xsna.cg50
    public final void h(Class<? extends CatalogBlockState> cls, s2a<? super CatalogBlockState, ?> s2aVar) {
        LinkedHashMap linkedHashMap = this.d;
        if (!linkedHashMap.containsKey(cls) || this.a) {
            linkedHashMap.put(cls, s2aVar);
            return;
        }
        s2a s2aVar2 = (s2a) linkedHashMap.get(cls);
        throw new IllegalStateException(("duplicated viewStateMapper for class " + cls.getCanonicalName() + ". Old: " + s2aVar2 + ", new: " + s2aVar).toString());
    }

    public dg50(cg50 cg50Var, boolean z) {
        Map e;
        Map d;
        Map f;
        Map b;
        this.a = z;
        this.b = (cg50Var == null || (b = cg50Var.b()) == null) ? new LinkedHashMap() : new LinkedHashMap(b);
        this.c = (cg50Var == null || (f = cg50Var.f()) == null) ? new LinkedHashMap() : new LinkedHashMap(f);
        this.d = (cg50Var == null || (d = cg50Var.d()) == null) ? new LinkedHashMap() : new LinkedHashMap(d);
        this.e = (cg50Var == null || (e = cg50Var.e()) == null) ? new LinkedHashMap() : new LinkedHashMap(e);
    }
}
