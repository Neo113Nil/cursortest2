package defpackage;

import com.yandex.go.search.model.DecideLaterConfig;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes6.dex */
public final class g51 {
    public final y9y0 a;
    public final g0j b;
    public final dsd c;
    public final tjt0 d;
    public final l3o e;

    public g51(y9y0 y9y0Var, g0j g0jVar, dsd dsdVar, tjt0 tjt0Var, l3o l3oVar, zuj0 zuj0Var) {
        this.a = y9y0Var;
        this.b = g0jVar;
        this.c = dsdVar;
        this.d = tjt0Var;
        this.e = l3oVar;
    }

    public final wyf a(String str, SourcePicker sourcePicker, boolean z) {
        tyi tyiVar = tyi.a;
        return this.b.a(new h0j(tyiVar, null, str, z, false), new ddf(b(tyiVar, 0), false), new r51(sourcePicker, DecideLaterConfig.a, null), m3o.b, this.a);
    }

    public final RoutePointType b(u0j u0jVar, int i) {
        return ((u0jVar instanceof dzi) || (u0jVar instanceof ezi)) ? this.a.e().size() + (-1) == i ? RoutePointType.POINT_B : RoutePointType.POINT_MID : u0jVar instanceof lzi ? RoutePointType.FAVORITE : RoutePointType.POINT_B;
    }
}
