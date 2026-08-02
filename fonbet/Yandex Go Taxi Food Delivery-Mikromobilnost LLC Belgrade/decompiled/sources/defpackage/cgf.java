package defpackage;

import ru.yandex.taxi.analytics.LocationRequestAnalytics$Source;
import ru.yandex.taxi.interactors.a;
import ru.yandex.taxi.systemrequeirements.location.n;

/* loaded from: classes5.dex */
public final class cgf extends a {
    public final lcz h;

    public cgf(k7x0 k7x0Var, bgf bgfVar, po21 po21Var, atd0 atd0Var, n nVar, mob0 mob0Var, lcz lczVar) {
        super(k7x0Var, bgfVar, po21Var, atd0Var, nVar, mob0Var);
        this.h = lczVar;
    }

    @Override // ru.yandex.taxi.interactors.a
    public final void d(mo21 mo21Var) {
        this.h.a(LocationRequestAnalytics$Source.CURRENT_LOCATION_IN_FAVORITES, mo21Var);
    }
}
