package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.yandex.go.benefits_center.activation.data.b;
import ru.yandex.taxi.activity.ContentContainer$ZOrder;
import ru.yandex.taxi.layers.LayersAnalyticEventEmmiter;
import ru.yandex.taxi.layers.source.factory.componentfactory.f;
import ru.yandex.taxi.layers.source.requesttrigger.g;
import ru.yandex.taxi.map_common.map.utils.a;
import ru.yandex.taxi.utils.c;

/* loaded from: classes.dex */
public final class gd implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ gd(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new fd((pj) ((njp) xvf0Var).get());
            case 1:
                return new bf0((ik0) ((id0) xvf0Var).get(), 1);
            case 2:
                return new ts0((bc) ((pw) xvf0Var).get());
            case 3:
                return new l01((rz0) ((qy0) xvf0Var).get());
            case 4:
                return new e41((wnt) ((d6g) xvf0Var).get(), 1);
            case 5:
                return new ea1(i5m.a((lf) xvf0Var));
            case 6:
                return new gd1(i5m.a((z2g) xvf0Var));
            case 7:
                return new f((a) ((n2g) xvf0Var).get());
            case 8:
                return new zj1((c) ((a4t) xvf0Var).get());
            case 9:
                uj1 uj1Var = (uj1) ((gp50) ((qy0) xvf0Var).get()).b;
                ffe ffeVar = uj1Var.b;
                if (ffeVar == null) {
                    ffe ffeVar2 = new ffe((ViewGroup) ((ViewStub) uj1Var.a.findViewById(ehh0.agreement_view_stub)).inflate());
                    uj1Var.b = ffeVar2;
                    ffeVar = ffeVar2;
                }
                return new d130(ffeVar, new hfh(), ContentContainer$ZOrder.MOST_IMPORTANT, new kk1());
            case 10:
                return new jo1((pw) xvf0Var);
            case 11:
                return new e02((t61) ((qy0) xvf0Var).get());
            case 12:
                return new k22((LayersAnalyticEventEmmiter) ((m2g) xvf0Var).get());
            case 13:
                ((mt2) xvf0Var).get();
                return new kl40(16);
            case 14:
                return new ea1((jv2) ((xv2) xvf0Var).get());
            case 15:
                return new dw2((ru.yandex.taxi.vendor_api.push.a) ((x4) xvf0Var).get());
            case 16:
                return new jw2((Activity) ((gcg) xvf0Var).get());
            case 17:
                return new ox2((rx2) ((xv2) xvf0Var).get());
            case 18:
                return new cot(7, (jc4) ((zd51) xvf0Var).get());
            case 19:
                return new ab4((ymu) ((sx2) xvf0Var).get());
            case 20:
                return new nc4((dy6) ((fn5) xvf0Var).get());
            case 21:
                return new mf5((lb7) ((nf) xvf0Var).get());
            case 22:
                return new b((com.yandex.go.benefits_center.activation.domain.a) ((aj0) xvf0Var).get());
            case 23:
                return new pm5(0, (b1) ((x) xvf0Var).get());
            case 24:
                return new xn5((aj0) xvf0Var);
            case 25:
                return new ao5((ln5) xvf0Var);
            case 26:
                return new sr4(11, (co40) ((zni0) xvf0Var).get());
            case 27:
                return new lr6((pr6) ((fn5) xvf0Var).get());
            case 28:
                return new mb7((u2x0) ((y2g) xvf0Var).get());
            default:
                return new g((lb7) ((nf) xvf0Var).get());
        }
    }
}
