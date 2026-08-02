package defpackage;

import android.os.Handler;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.route.analytics.e;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.clarifypoint.a;
import ru.yandex.taxi.clarifypoint.b;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes6.dex */
public final class kyb implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ kyb(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                Screen screen = (Screen) obj;
                a aVar = bVar.j;
                Handler handler = bVar.k;
                if (screen != Screen.SUMMARY) {
                    pzt0 pzt0Var = bVar.m;
                    if (pzt0Var != null) {
                        pzt0Var.a(null);
                        break;
                    }
                } else {
                    handler.removeCallbacks(aVar);
                    handler.post(aVar);
                    break;
                }
                break;
            default:
                e eVar = (e) bVar.e;
                eVar.p = false;
                eVar.q = false;
                Iterator it = ((vyb) obj).a.iterator();
                while (it.hasNext()) {
                    RoutePointType routePointType = ((gyb) it.next()).a;
                    if (routePointType == RoutePointType.POINT_A) {
                        eVar.p = true;
                    } else if (routePointType == RoutePointType.POINT_B) {
                        eVar.q = true;
                    }
                }
                break;
        }
        return zy11Var;
    }
}
