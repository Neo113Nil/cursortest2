package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import java.util.ArrayDeque;
import java.util.Iterator;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.order.OrderFragment;
import ru.yandex.taxi.order.f;

/* loaded from: classes14.dex */
public final /* synthetic */ class nit implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ o2y0 b;

    public /* synthetic */ nit(int i, o2y0 o2y0Var) {
        this.a = i;
        this.b = o2y0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        o2y0 o2y0Var = this.b;
        switch (i) {
            case 0:
                o2y0Var.g((TaxiOrder) obj);
                return zy11.a;
            case 1:
                ((h5y0) obj).n1(rzx0.a, o2y0Var.b().W());
                return zy11.a;
            case 2:
                ((h5y0) obj).n1(new tzx0(null), o2y0Var.b().W());
                return zy11.a;
            case 3:
                dfk0 dfk0Var = (dfk0) obj;
                switch (dfk0Var.a) {
                    case 0:
                        f fVar = (f) ((k2y0) ((ifk0) dfk0Var.b).S.get()).a;
                        apf apfVar = fVar.C1.c;
                        bub bubVar = new bub(2);
                        Iterator it = ((ArrayDeque) apfVar.c).iterator();
                        while (it.hasNext()) {
                            if (apf.r((tdj) it.next(), pp70.class, bubVar)) {
                                it.remove();
                            }
                        }
                        tdj tdjVar = (tdj) apfVar.w;
                        if (tdjVar != null ? apf.r(tdjVar, pp70.class, bubVar) : false) {
                            apfVar.k();
                        }
                        if (o2y0Var.b().V().R) {
                            fVar.x0(o2y0Var);
                            OrderFragment orderFragment = fVar.p1;
                            if (orderFragment != null) {
                                orderFragment.showChat(o2y0Var, true);
                                break;
                            }
                        }
                        break;
                    default:
                        f9a f9aVar = (f9a) dfk0Var.b;
                        f9aVar.r(new qu(9));
                        ((oiw0) f9aVar.J).invoke(o2y0Var);
                        break;
                }
                return zy11.a;
            case 4:
                dfk0 dfk0Var2 = (dfk0) obj;
                switch (dfk0Var2.a) {
                    case 0:
                        ((f) ((x1y0) ((ifk0) dfk0Var2.b).Q.get()).a).s0(o2y0Var);
                        break;
                    default:
                        f9a f9aVar2 = (f9a) dfk0Var2.b;
                        f9aVar2.r(new qu(9));
                        ((oiw0) f9aVar2.L).invoke(o2y0Var);
                        break;
                }
                return zy11.a;
            case 5:
                dfk0 dfk0Var3 = (dfk0) obj;
                switch (dfk0Var3.a) {
                    case 0:
                        ((f) ((z1y0) ((ifk0) dfk0Var3.b).P.get()).a).X(o2y0Var);
                        break;
                    default:
                        f9a f9aVar3 = (f9a) dfk0Var3.b;
                        f9aVar3.r(new qu(9));
                        ((oiw0) f9aVar3.K).invoke(o2y0Var);
                        break;
                }
                return zy11.a;
            default:
                TaxiOrder b = o2y0Var.b();
                boolean z = b.h.b == DriveState.WAITING;
                boolean H = b.H();
                boolean z2 = b.V().R;
                double d = b.V().N;
                wf7.b.c(b.V().O);
                return bvf0.c(Boolean.valueOf(!H && z));
        }
    }
}
