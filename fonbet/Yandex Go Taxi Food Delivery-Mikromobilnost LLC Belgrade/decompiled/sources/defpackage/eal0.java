package defpackage;

import com.yandex.go.pin.repository.o;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.routeselector.presentation.d;
import ru.yandex.taxi.routeselector.presentation.l;
import ru.yandex.taxi.routeselector.presentation.s;

/* loaded from: classes6.dex */
public final /* synthetic */ class eal0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ s b;

    public /* synthetic */ eal0(s sVar, int i) {
        this.a = i;
        this.b = sVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        s sVar = this.b;
        switch (i) {
            case 0:
                ((m9l0) sVar.Dg()).confirmRoute();
                return zy11.a;
            case 1:
                aal0 aal0Var = sVar.I;
                r0 r0Var = sVar.j0;
                kdd0 kdd0Var = aal0Var.a;
                return new z9l0(r0Var, (AddressResolveRepository) ((n3w) kdd0Var.a).a, (o) ((a7g) kdd0Var.b).get(), (x9l0) ((xvf0) kdd0Var.c).get(), (p2c0) ((a7g) kdd0Var.d).get());
            default:
                bal0 bal0Var = sVar.J;
                r0 r0Var2 = sVar.j0;
                fcj0 fcj0Var = bal0Var.a;
                return new d((x9l0) ((xvf0) fcj0Var.a).get(), (l) ((wi7) fcj0Var.b).get(), (AddressResolveRepository) ((xvf0) fcj0Var.c).get(), (o) ((xvf0) fcj0Var.d).get(), r0Var2, (p2c0) ((xvf0) fcj0Var.e).get());
        }
    }
}
