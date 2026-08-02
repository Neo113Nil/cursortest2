package defpackage;

import ru.yandex.taxi.masstransit.geopayment.adapter.a;
import ru.yandex.taxi.masstransit.geopayment.domain.c;
import ru.yandex.taxi.masstransit.geopayment.modal.e;
import ru.yandex.taxi.masstransit.geopayment.modal.f;
import ru.yandex.taxi.masstransit.geopayment.modal.g;

/* loaded from: classes6.dex */
public final /* synthetic */ class e010 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ e010(e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        e eVar = this.b;
        switch (i) {
            case 0:
                eVar.i();
                return zy11.a;
            case 1:
                n26 n26Var = ((zk30) eVar.n()).a;
                s14 s14Var = eVar.H;
                return new g(n26Var, (fl10) s14Var.d, (xl10) s14Var.g, (ol30) s14Var.a, (nw8) s14Var.f, (jse) s14Var.o);
            case 2:
                s14 s14Var2 = eVar.H;
                return new f((c) s14Var2.e, (ol30) s14Var2.a, (z26) s14Var2.i, (ek30) s14Var2.j, (xk30) s14Var2.c, (a) s14Var2.h, (sr4) s14Var2.l, (j26) s14Var2.n);
            default:
                s14 s14Var3 = eVar.H;
                return new uk30((u16) s14Var3.k, (a) s14Var3.h, (fl10) s14Var3.d, (z26) s14Var3.i, (xl10) s14Var3.g, eVar.I, (c) s14Var3.e, (fl10) s14Var3.b, (ol30) s14Var3.a);
        }
    }
}
