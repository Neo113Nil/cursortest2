package defpackage;

import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.routeselector.view.RouteSelectorModalView;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.search.view.AddressSearchModalView;
import ru.yandex.taxi.search.view.AddressSearchView;

/* loaded from: classes6.dex */
public final class myb implements RouteSelectorModalView.a {
    public final /* synthetic */ nyb a;
    public final /* synthetic */ SourcePicker b;
    public final /* synthetic */ gyb c;
    public final /* synthetic */ Runnable w;
    public final /* synthetic */ vbb x;

    public myb(nyb nybVar, SourcePicker sourcePicker, gyb gybVar, Runnable runnable, vbb vbbVar) {
        this.a = nybVar;
        this.b = sourcePicker;
        this.c = gybVar;
        this.w = runnable;
        this.x = vbbVar;
    }

    @Override // ru.yandex.taxi.routeselector.view.RouteSelectorModalView.a
    public final void K() {
        this.w.run();
    }

    @Override // ru.yandex.taxi.routeselector.view.RouteSelectorModalView.a
    public final void dismiss() {
        ((x880) this.x.a).o();
    }

    @Override // ru.yandex.taxi.routeselector.view.RouteSelectorModalView.a
    public final void o3(PointType pointType, qa0 qa0Var) {
        nyb nybVar = this.a;
        nybVar.h.getClass();
        c61 c61Var = AddressSearchView.Companion;
        ujt0 ujt0Var = new ujt0(false);
        int i = 1;
        ddf ddfVar = new ddf(RoutePointType.POINT_A, true);
        cag c = fh4.c(new r51(this.b), ddfVar, m3o.b, nybVar.c.a, new aye0(20, nybVar.g), ujt0Var);
        c61Var.getClass();
        b61 b61Var = new b61(c);
        b61Var.n = this.c.e;
        b61Var.p = pointType == PointType.SOURCE;
        AddressSearchModalView.Companion.getClass();
        AddressSearchModalView a = p51.a(b61Var);
        a.setOnAddressPickedListener(new x71(i, qa0Var));
        nybVar.a.a().k(a, 2.0f, true);
    }

    @Override // ru.yandex.taxi.routeselector.view.RouteSelectorModalView.a
    public final void showAddressAdjustment() {
    }
}
