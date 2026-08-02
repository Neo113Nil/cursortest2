package defpackage;

import android.content.Context;
import com.yandex.mapkit.navigation.transport.layer.ConstructionStyleProvider;
import com.yandex.mapkit.navigation.transport.layer.RequestPointStyleProvider;
import com.yandex.mapkit.navigation.transport.layer.RouteViewStyleProvider;
import com.yandex.mapkit.navigation.transport.layer.StyleProvider;
import com.yandex.mapkit.navigation.transport.layer.UserLocationStyleProvider;
import com.yandex.mapkit.navigation.transport.layer.balloons.BalloonImageProvider;
import com.yandex.mapkit.styling.transportnavigation.TransportNavigationStyleProvider;
import kotlin.a;

/* loaded from: classes14.dex */
public final class h441 implements StyleProvider {
    public final Context a;
    public final i3y b = a.a(new ec31(11, this));

    public h441(Context context) {
        this.a = context;
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.StyleProvider
    public final BalloonImageProvider balloonImageProvider() {
        return ((TransportNavigationStyleProvider) this.b.getValue()).balloonImageProvider();
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.StyleProvider
    public final ConstructionStyleProvider constructionStyleProvider() {
        return ((TransportNavigationStyleProvider) this.b.getValue()).constructionStyleProvider();
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.StyleProvider
    public final RequestPointStyleProvider requestPointStyleProvider() {
        return new dy31(2);
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.StyleProvider
    public final RouteViewStyleProvider routeViewStyleProvider() {
        return new r541(this.a, (TransportNavigationStyleProvider) this.b.getValue());
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.StyleProvider
    public final UserLocationStyleProvider userLocationStyleProvider() {
        return ((TransportNavigationStyleProvider) this.b.getValue()).userLocationStyleProvider();
    }
}
