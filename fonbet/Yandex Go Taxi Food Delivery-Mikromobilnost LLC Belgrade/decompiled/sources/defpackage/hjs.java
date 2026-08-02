package defpackage;

import com.yandex.go.navigation.screen.c;
import com.yandex.go.search.model.DecideLaterConfig;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes6.dex */
public final class hjs {
    public final y9y0 a;
    public final c b;
    public final aw8 c;
    public final ev8 d;

    public hjs(y9y0 y9y0Var, c cVar, aw8 aw8Var, ev8 ev8Var) {
        this.a = y9y0Var;
        this.b = cVar;
        this.c = aw8Var;
        this.d = ev8Var;
    }

    public final h6g a() {
        ujt0 ujt0Var = new ujt0(false);
        ddf ddfVar = new ddf(RoutePointType.POINT_A);
        r51 r51Var = new r51(SourcePicker.NONE, DecideLaterConfig.a, null);
        m3o m3oVar = m3o.b;
        i6r i6rVar = this.c.a;
        i6rVar.getClass();
        m3oVar.getClass();
        y9y0 y9y0Var = this.a;
        y9y0Var.getClass();
        return new h6g(ujt0Var, ddfVar, r51Var, m3oVar, i6rVar, y9y0Var);
    }
}
