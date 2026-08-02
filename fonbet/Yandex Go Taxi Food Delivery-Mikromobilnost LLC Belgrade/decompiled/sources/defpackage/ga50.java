package defpackage;

import android.content.Context;
import com.yandex.go.navigator.domain.v;
import com.yandex.mapkit.navigation.automotive.layer.styling.BalloonImageProvider;
import com.yandex.mapkit.navigation.automotive.layer.styling.HighlightStyleProvider;
import com.yandex.mapkit.navigation.automotive.layer.styling.NavigationStyleProvider;
import com.yandex.mapkit.navigation.automotive.layer.styling.RequestPointStyleProvider;
import com.yandex.mapkit.navigation.automotive.layer.styling.RoutePinsStyleProvider;
import com.yandex.mapkit.navigation.automotive.layer.styling.RouteViewStyleProvider;
import com.yandex.mapkit.navigation.automotive.layer.styling.UserPlacemarkStyleProvider;
import kotlin.a;

/* loaded from: classes12.dex */
public final class ga50 implements NavigationStyleProvider {
    public final Context a;
    public final m901 b;
    public final zuj0 c;
    public final oc50 d;
    public final UserPlacemarkStyleProvider e;
    public final v f;
    public final z950 g;
    public final i3y h = a.a(new ca50(this, 0));
    public final i3y i = a.a(new ca50(this, 1));
    public final i3y j = a.a(new ca50(this, 2));
    public final i3y k = a.a(new ca50(this, 3));

    public ga50(Context context, m901 m901Var, zuj0 zuj0Var, oc50 oc50Var, UserPlacemarkStyleProvider userPlacemarkStyleProvider, v vVar, z950 z950Var) {
        this.a = context;
        this.b = m901Var;
        this.c = zuj0Var;
        this.d = oc50Var;
        this.e = userPlacemarkStyleProvider;
        this.f = vVar;
        this.g = z950Var;
    }

    public final NavigationStyleProvider a() {
        return (NavigationStyleProvider) this.h.getValue();
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.NavigationStyleProvider
    public final BalloonImageProvider balloonImageProvider() {
        return (da50) this.k.getValue();
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.NavigationStyleProvider
    public final HighlightStyleProvider highlightStyleProvider() {
        return a().highlightStyleProvider();
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.NavigationStyleProvider
    public final RequestPointStyleProvider requestPointStyleProvider() {
        return (ea50) this.j.getValue();
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.NavigationStyleProvider
    public final RoutePinsStyleProvider routePinsStyleProvider() {
        return a().routePinsStyleProvider();
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.NavigationStyleProvider
    public final RouteViewStyleProvider routeViewStyleProvider() {
        return (fa50) this.i.getValue();
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.NavigationStyleProvider
    public final UserPlacemarkStyleProvider userPlacemarkStyleProvider() {
        return this.e;
    }
}
