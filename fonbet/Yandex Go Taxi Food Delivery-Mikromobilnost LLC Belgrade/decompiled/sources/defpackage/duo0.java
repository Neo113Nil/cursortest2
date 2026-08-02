package defpackage;

import java.util.HashMap;
import ru.yandex.taxi.scooters.presentation.route_navigation.ScootersRouteNavigationAnalytics$Button;
import ru.yandex.taxi.scooters.presentation.route_navigation.b;

/* loaded from: classes6.dex */
public final /* synthetic */ class duo0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ duo0(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                cjm0 cjm0Var = bVar.L;
                if (cjm0Var != null) {
                    ScootersRouteNavigationAnalytics$Button scootersRouteNavigationAnalytics$Button = ScootersRouteNavigationAnalytics$Button.CLOSE;
                    co40 co40Var = (co40) cjm0Var.b;
                    String str = (String) cjm0Var.c;
                    String buttonName = scootersRouteNavigationAnalytics$Button.getButtonName();
                    co40Var.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("order_id", str);
                    hashMap.put("button_name", buttonName);
                    co40Var.a.a("ScootersNavigator.Tapped", hashMap, 1, new HashMap());
                    break;
                }
                break;
            default:
                bVar.r(new qu(9));
                break;
        }
        return zy11Var;
    }
}
