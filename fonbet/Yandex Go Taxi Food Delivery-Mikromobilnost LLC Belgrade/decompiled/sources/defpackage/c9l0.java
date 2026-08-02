package defpackage;

import ru.yandex.taxi.routeselector.view.RouteSelectorModalView;

/* loaded from: classes6.dex */
public final class c9l0 {
    public final i130 a;
    public final h3y b;

    public c9l0(h3y h3yVar, i130 i130Var) {
        this.a = i130Var;
        this.b = h3yVar;
    }

    public final boolean a() {
        RouteSelectorModalView routeSelectorModalView = (RouteSelectorModalView) this.a.a().r(true, RouteSelectorModalView.class);
        if (routeSelectorModalView == null) {
            return false;
        }
        return routeSelectorModalView.isClarifyMode();
    }

    public final boolean b() {
        return this.a.a().r(true, RouteSelectorModalView.class) != null;
    }
}
