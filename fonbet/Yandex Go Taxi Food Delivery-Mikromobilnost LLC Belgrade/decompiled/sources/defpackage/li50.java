package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.route.interactor.c;
import defpackage.mi50;
import defpackage.pi50;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class li50 {
    public final Integer a;
    public final mi50 b;
    public final c c;
    public final pi50 d;

    public li50(Integer num, mi50 mi50Var, c cVar, pi50 pi50Var) {
        this.a = num;
        this.b = mi50Var;
        this.c = cVar;
        this.d = pi50Var;
    }

    public final void a(zzs zzsVar) {
        boolean z = false;
        pi50 pi50Var = this.d;
        if (zzsVar == null) {
            pi50Var.a(false);
            return;
        }
        if (jl40.l(((pi50.a) pi50Var.b.a.getValue()).c, zzsVar) && this.b.b()) {
            z = true;
        }
        pi50Var.a(z);
    }

    public final void b(Address address, zzs zzsVar) {
        Object value;
        mi50 mi50Var = this.b;
        r0 r0Var = mi50Var.a;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, mi50.a.a((mi50.a) value, address, false, null, 6)));
        boolean b = mi50Var.b();
        r0 r0Var2 = this.d.a;
        while (true) {
            Object value2 = r0Var2.getValue();
            zzs zzsVar2 = zzsVar;
            if (r0Var2.k(value2, pi50.a.a((pi50.a) value2, zzsVar2, false, null, b, 6))) {
                return;
            } else {
                zzsVar = zzsVar2;
            }
        }
    }
}
