package defpackage;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.navigation.automotive.NavigationListener;
import com.yandex.runtime.Error;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class jes0 implements NavigationListener {
    @Override // com.yandex.mapkit.navigation.automotive.NavigationListener
    public final void onAlternativesRequested(DrivingRoute drivingRoute) {
    }

    @Override // com.yandex.mapkit.navigation.automotive.NavigationListener
    public final void onParkingRoutesRequested() {
    }

    @Override // com.yandex.mapkit.navigation.automotive.NavigationListener
    public final void onResetRoutes() {
    }

    @Override // com.yandex.mapkit.navigation.automotive.NavigationListener
    public void onRoutesBuilt() {
    }

    @Override // com.yandex.mapkit.navigation.automotive.NavigationListener
    public void onRoutesRequestError(Error error) {
    }

    @Override // com.yandex.mapkit.navigation.automotive.NavigationListener
    public void onRoutesRequested(List list) {
    }

    @Override // com.yandex.mapkit.navigation.automotive.NavigationListener
    public final void onUriResolvingRequested(String str) {
    }
}
