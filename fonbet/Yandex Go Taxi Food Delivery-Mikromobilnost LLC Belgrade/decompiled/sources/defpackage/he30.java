package defpackage;

import ru.yandex.taxi.masstransit.geopayment.checkout.u;
import ru.yandex.taxi.masstransit.geopayment.linkcard.a;
import ru.yandex.taxi.masstransit.geopayment.linkcard.b;

/* loaded from: classes6.dex */
public final /* synthetic */ class he30 implements sy60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ je30 b;

    public /* synthetic */ he30(je30 je30Var, int i) {
        this.a = i;
        this.b = je30Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        je30 je30Var = this.b;
        switch (i) {
            case 0:
                je30Var.V = null;
                break;
            default:
                je30Var.W = null;
                a aVar = je30Var.O;
                in30 in30Var = aVar.c;
                if (in30Var != null) {
                    aVar.c = null;
                    aVar.f();
                    je30 je30Var2 = ((u) in30Var).a;
                    je30Var2.S.f(false);
                    b bVar = je30Var2.W;
                    if (bVar != null) {
                        bVar.i();
                    }
                    je30Var2.W = null;
                    break;
                }
                break;
        }
    }
}
