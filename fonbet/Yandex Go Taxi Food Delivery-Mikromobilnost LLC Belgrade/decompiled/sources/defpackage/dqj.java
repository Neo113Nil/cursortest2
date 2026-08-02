package defpackage;

import com.yandex.go.promocodes.base.impl.discounts.domain.analytics.ItemType;
import com.yandex.go.promocodes.base.impl.discounts.presentation.ui.main.a;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes13.dex */
public final /* synthetic */ class dqj implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ eqj b;

    public /* synthetic */ dqj(eqj eqjVar, int i) {
        this.a = i;
        this.b = eqjVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        eqj eqjVar = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                a aVar = eqjVar.b;
                wlf0 a = aVar.z.a(str, aVar.G);
                if (a == null) {
                    jst.e.u("No matching promo code by value '" + str + "' in cache during click handing");
                    break;
                } else {
                    prj prjVar = aVar.H;
                    rrj.U(prjVar.b, a, prjVar.a);
                    tpj tpjVar = aVar.y;
                    ItemType itemType = ItemType.DETAIL;
                    tpjVar.getClass();
                    tpjVar.c(itemType, a.e, a.f);
                    break;
                }
            case 1:
                eqjVar.b.Kg((String) obj);
                break;
            default:
                prj prjVar2 = eqjVar.b.H;
                prjVar2.getClass();
                ((ft41) ((dt41) ((yvf0) prjVar2.b.G).get())).Q(new UiWebViewConfig(new CoreWebViewConfig((String) obj, null, null, false, false, false, false, false, false, false, false, false, false, null, null, null, false, 131070, null), null, true, false, false, false, null, true, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194170, null));
                break;
        }
        return zy11Var;
    }
}
