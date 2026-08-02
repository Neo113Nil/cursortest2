package defpackage;

import com.yandex.mapkit.navigation.automotive.layer.RouteView;
import com.yandex.mapkit.navigation.automotive.layer.RouteViewListener;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes7.dex */
public final class nmj implements RouteViewListener {
    public final /* synthetic */ omj a;

    public nmj(omj omjVar) {
        this.a = omjVar;
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.RouteViewListener
    public final void onRouteViewTap(RouteView routeView) {
        omj omjVar = this.a;
        omjVar.c(new bmh(29, omjVar, routeView));
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.RouteViewListener
    public final void onRouteViewsChanged() {
        yeo yeoVar;
        omj omjVar = this.a;
        try {
            Map e = gw00.e(new Pair("type", "onRouteViewsChanged"));
            if ((e instanceof zy11) || (yeoVar = omjVar.b) == null) {
                return;
            }
            yeoVar.success(e);
        } catch (Throwable th) {
            yeo yeoVar2 = omjVar.b;
            if (yeoVar2 != null) {
                yeoVar2.error(omj.class.getSimpleName(), ljo.b(th), null);
            }
        }
    }
}
