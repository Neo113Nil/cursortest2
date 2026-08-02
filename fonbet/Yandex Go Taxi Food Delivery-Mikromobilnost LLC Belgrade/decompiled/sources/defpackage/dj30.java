package defpackage;

import java.util.ArrayList;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardOrigin;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardSource;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardType;

/* loaded from: classes6.dex */
public final class dj30 {
    public final b611 a;
    public boolean b;

    public dj30(b611 b611Var) {
        this.a = b611Var;
    }

    public final void a(boolean z, TransportRouteAnalytics$DetailCardOrigin transportRouteAnalytics$DetailCardOrigin, TransportRouteAnalytics$DetailCardSource transportRouteAnalytics$DetailCardSource, ArrayList arrayList) {
        if (transportRouteAnalytics$DetailCardOrigin == TransportRouteAnalytics$DetailCardOrigin.Pull && this.b) {
            return;
        }
        this.a.f(z, transportRouteAnalytics$DetailCardOrigin, transportRouteAnalytics$DetailCardSource, TransportRouteAnalytics$DetailCardType.Horizontal, arrayList);
    }
}
