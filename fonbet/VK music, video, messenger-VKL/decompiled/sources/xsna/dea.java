package xsna;

import com.vk.catalog.mvi.section.api.CatalogSearchStatInfo;
import com.vk.catalog.mvi.section.api.CatalogSectionParams;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import java.util.List;
import java.util.Map;

/* compiled from: CatalogSectionFactoryImpl.kt */
/* loaded from: classes16.dex */
public final class dea implements cea {
    public final cg50 a;
    public final m7a b;
    public final g7s0 c;
    public final b25 d;
    public final maz e;
    public final com.vk.catalog.mvi.section.screen.api.a f;
    public final fba g;
    public final p1e h;
    public final List<qmk> i;

    /* JADX WARN: Multi-variable type inference failed */
    public dea(cg50 cg50Var, m7a m7aVar, g7s0 g7s0Var, b25 b25Var, maz mazVar, com.vk.catalog.mvi.section.screen.api.a aVar, fba fbaVar, p1e p1eVar, List<? extends qmk> list) {
        this.a = cg50Var;
        this.b = m7aVar;
        this.c = g7s0Var;
        this.d = b25Var;
        this.e = mazVar;
        this.f = aVar;
        this.g = fbaVar;
        this.h = p1eVar;
        this.i = list;
    }

    @Override // xsna.cea
    public final mm50<CatalogSectionState, yda, bea> b(final CatalogSectionParams catalogSectionParams, s0a s0aVar, gzs<CatalogSectionState> gzsVar) {
        if (s0aVar == null) {
            s0aVar = e(null);
        }
        final s0a s0aVar2 = s0aVar;
        final zea zeaVar = new zea(d());
        final Map f = this.a.f();
        i5 i5Var = new i5(5, gzsVar, catalogSectionParams);
        final m7a m7aVar = this.b;
        return up2.d(i5Var, new wb0() { // from class: xsna.aga
            @Override // xsna.izs
            /* renamed from: j */
            public final qj50 invoke(sj50 sj50Var) {
                return new eea(CatalogSectionParams.this, f, s0aVar2, zeaVar, m7aVar, sj50Var);
            }
        }, svj.b);
    }

    @Override // xsna.cea
    public final uga c() {
        return new uga(this.a.d());
    }

    @Override // xsna.cea
    public final rga createView() {
        return new rga(this.a.e());
    }

    @Override // xsna.cea
    public final q4a d() {
        return new q4a(this.a.b());
    }

    @Override // xsna.cea
    public final v0a e(tda tdaVar) {
        if (tdaVar == null) {
            tdaVar = cea.a(this, null, 7);
        }
        return new v0a(this.i, tdaVar);
    }

    @Override // xsna.cea
    public final uda f(CatalogSearchStatInfo catalogSearchStatInfo, boolean z) {
        return new uda(catalogSearchStatInfo, z);
    }

    @Override // xsna.cea
    public final dga g(tda tdaVar) {
        if (tdaVar == null) {
            tdaVar = cea.a(this, null, 7);
        }
        return new dga(tdaVar, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}
