package defpackage;

import com.yandex.mapkit.directions.driving.ConditionsListener;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.navigation.automotive.layer.NavigationLayer;
import java.util.HashMap;
import ru.yandextaxi.flutter_yandex_mapkit.ReferenceType;

/* loaded from: classes7.dex */
public final class imj extends q35 {
    public final /* synthetic */ int c = 0;
    public final Object d;
    public Object e;

    public imj(ssr ssrVar, ini0 ini0Var) {
        super(ssrVar, "conditions_listener");
        this.d = ini0Var;
        this.e = new HashMap();
    }

    @Override // defpackage.q35
    public final void a(Object obj) {
        int i = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                hmj hmjVar = (hmj) this.e;
                if (hmjVar != null) {
                    ((NavigationLayer) ((gmj) obj2).a).removeListener(hmjVar);
                    this.e = null;
                    break;
                }
                break;
            default:
                if (obj != null) {
                    String str = (String) obj;
                    DrivingRoute drivingRoute = (DrivingRoute) ((ini0) obj2).c(str, ReferenceType.DRIVING_ROUTE);
                    ConditionsListener conditionsListener = (ConditionsListener) ((HashMap) this.e).remove(str);
                    if (conditionsListener != null) {
                        drivingRoute.removeConditionsListener(conditionsListener);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.q35
    public final void b(Object obj) {
        int i = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                hmj hmjVar = new hmj(this);
                ((NavigationLayer) ((gmj) obj2).a).addListener(hmjVar);
                this.e = hmjVar;
                break;
            default:
                String str = (String) obj;
                DrivingRoute drivingRoute = (DrivingRoute) ((ini0) obj2).c(str, ReferenceType.DRIVING_ROUTE);
                xyd xydVar = new xyd(this, str);
                ((HashMap) this.e).put(str, xydVar);
                drivingRoute.addConditionsListener(xydVar);
                break;
        }
    }

    public imj(ssr ssrVar, gmj gmjVar) {
        super(ssrVar, "directions_navigation_layer_listener");
        this.d = gmjVar;
    }
}
