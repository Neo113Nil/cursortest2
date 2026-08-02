package defpackage;

import com.yandex.go.address.models.Address;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes13.dex */
public final class n3o {
    public final y9y0 a;
    public final tft0 b;

    public n3o(y9y0 y9y0Var, tft0 tft0Var) {
        this.a = y9y0Var;
        this.b = tft0Var;
    }

    public final void a(String str) {
        Address h = this.a.h();
        if (h == null) {
            return;
        }
        String J1 = h.J1();
        if ((evu0.J(str) && (J1 == null || evu0.J(J1))) || cvu0.t(J1, evu0.k0(str).toString(), true)) {
            return;
        }
        n5v0 a = this.b.a(true);
        zzs B = h.B();
        wit0 wit0Var = (wit0) a;
        wit0Var.a(true);
        wit0Var.b(B);
        ((i) wit0Var.b).f(B, str, RoutePointType.POINT_A, "");
    }
}
