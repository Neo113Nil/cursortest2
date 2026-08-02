package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.repository.o;
import defpackage.mi50;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class ch50 {
    public final ji50 a;
    public final ih50 b;
    public final mi50 c;
    public final w4l0 d;
    public final o e;
    public final xl10 f;
    public final jei g;

    public ch50(ji50 ji50Var, ih50 ih50Var, mi50 mi50Var, w4l0 w4l0Var, o oVar, xl10 xl10Var, jei jeiVar) {
        this.a = ji50Var;
        this.b = ih50Var;
        this.c = mi50Var;
        this.d = w4l0Var;
        this.e = oVar;
        this.f = xl10Var;
        this.g = jeiVar;
    }

    public final void a(boolean z, Address address, mi50.a aVar) {
        Object value;
        d51 b = this.a.b();
        if (jl40.l(b, b51.a)) {
            Integer num = aVar.c;
            oo0 k = qha1.k(address, z);
            jei jeiVar = this.g;
            if (!z) {
                jeiVar.a.a(num != null ? num.intValue() - 1 : 0, k);
                return;
            }
            r0 r0Var = jeiVar.a.a;
            do {
                value = r0Var.getValue();
            } while (!r0Var.k(value, kei.a((kei) value, k, null, null, 13)));
            return;
        }
        if (b != null && !b.equals(c51.a)) {
            w511.b();
            return;
        }
        w4l0 w4l0Var = this.d;
        if (z) {
            w4l0Var.i(new ZoneAddress(address, this.e.f(address.getZoneName())));
        } else {
            p7b1.d(kzi.a, w4l0Var).I(address);
        }
    }
}
