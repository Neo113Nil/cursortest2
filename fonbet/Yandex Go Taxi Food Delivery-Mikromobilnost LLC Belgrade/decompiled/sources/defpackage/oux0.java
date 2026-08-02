package defpackage;

import com.yandex.go.chargers.payments.domain.c;
import com.yandex.go.scooters.domain.i;

/* loaded from: classes9.dex */
public final class oux0 implements p2c {
    public final cba0 a;
    public final alc0 b;
    public final c c;
    public final i d;

    public oux0(cba0 cba0Var, alc0 alc0Var, c cVar, i iVar) {
        this.a = cba0Var;
        this.b = alc0Var;
        this.c = cVar;
        this.d = iVar;
    }

    @Override // defpackage.p2c
    public final void a() {
        alc0 alc0Var = this.b;
        if (jl40.l(alc0Var.a(), "scooters_offer_card")) {
            this.d.a();
            return;
        }
        String a = alc0Var.a();
        if (jl40.l(a, "chargers_station") || jl40.l(a, "chargers_offer_card") || jl40.l(a, "chargers_discovery")) {
            this.c.c();
        } else {
            ((com.yandex.go.payments.paymentlist.domain.i) this.a).m(true);
        }
    }
}
