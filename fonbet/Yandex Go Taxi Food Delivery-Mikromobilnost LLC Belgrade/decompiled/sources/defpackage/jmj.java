package defpackage;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.navigation.automotive.NavigationListener;
import com.yandex.runtime.Error;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes7.dex */
public final class jmj implements NavigationListener {
    public final /* synthetic */ kmj a;

    public jmj(kmj kmjVar) {
        this.a = kmjVar;
    }

    @Override // com.yandex.mapkit.navigation.automotive.NavigationListener
    public final void onAlternativesRequested(DrivingRoute drivingRoute) {
        this.a.c(new amh(22, drivingRoute));
    }

    @Override // com.yandex.mapkit.navigation.automotive.NavigationListener
    public final void onMatchRouteResolvingRequested() {
    }

    @Override // com.yandex.mapkit.navigation.automotive.NavigationListener
    public final void onParkingRoutesRequested() {
    }

    @Override // com.yandex.mapkit.navigation.automotive.NavigationListener
    public final void onResetRoutes() {
        yeo yeoVar;
        kmj kmjVar = this.a;
        try {
            Map e = gw00.e(new Pair("type", "onResetRoutes"));
            if ((e instanceof zy11) || (yeoVar = kmjVar.b) == null) {
                return;
            }
            yeoVar.success(e);
        } catch (Throwable th) {
            yeo yeoVar2 = kmjVar.b;
            if (yeoVar2 != null) {
                yeoVar2.error(kmj.class.getSimpleName(), ljo.b(th), null);
            }
        }
    }

    @Override // com.yandex.mapkit.navigation.automotive.NavigationListener
    public final void onRoutesBuilt() {
        yeo yeoVar;
        kmj kmjVar = this.a;
        try {
            Map e = gw00.e(new Pair("type", "onRoutesBuilt"));
            if ((e instanceof zy11) || (yeoVar = kmjVar.b) == null) {
                return;
            }
            yeoVar.success(e);
        } catch (Throwable th) {
            yeo yeoVar2 = kmjVar.b;
            if (yeoVar2 != null) {
                yeoVar2.error(kmj.class.getSimpleName(), ljo.b(th), null);
            }
        }
    }

    @Override // com.yandex.mapkit.navigation.automotive.NavigationListener
    public final void onRoutesRequestError(Error error) {
        yeo yeoVar;
        kmj kmjVar = this.a;
        try {
            Map e = gw00.e(new Pair("type", "onRoutesRequestError"));
            if ((e instanceof zy11) || (yeoVar = kmjVar.b) == null) {
                return;
            }
            yeoVar.success(e);
        } catch (Throwable th) {
            yeo yeoVar2 = kmjVar.b;
            if (yeoVar2 != null) {
                yeoVar2.error(kmj.class.getSimpleName(), ljo.b(th), null);
            }
        }
    }

    @Override // com.yandex.mapkit.navigation.automotive.NavigationListener
    public final void onRoutesRequested(List list) {
        this.a.c(new oc0(list, 2));
    }

    @Override // com.yandex.mapkit.navigation.automotive.NavigationListener
    public final void onUriResolvingRequested(String str) {
    }
}
