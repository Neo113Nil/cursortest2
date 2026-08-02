package defpackage;

import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.routeselector.view.RouteSelectorModalView;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes6.dex */
public final class nmp0 implements RouteSelectorModalView.a {
    public final /* synthetic */ pmp0 a;

    public nmp0(pmp0 pmp0Var) {
        this.a = pmp0Var;
    }

    @Override // ru.yandex.taxi.routeselector.view.RouteSelectorModalView.a
    public final void K() {
        this.a.r(new tyo0(11));
    }

    @Override // ru.yandex.taxi.routeselector.view.RouteSelectorModalView.a
    public final void dismiss() {
        this.a.r(new qu(9));
    }

    @Override // ru.yandex.taxi.routeselector.view.RouteSelectorModalView.a
    public final void o3(PointType pointType, qa0 qa0Var) {
        pmp0 pmp0Var = this.a;
        pmp0Var.A((m950) pmp0Var.L.get(), new oal0(SourcePicker.A_FROM_SUMMARY, pointType), new omp0(qa0Var));
    }
}
