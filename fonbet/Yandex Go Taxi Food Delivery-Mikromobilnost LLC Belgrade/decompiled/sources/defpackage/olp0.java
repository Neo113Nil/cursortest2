package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.destination_picker.ChooseAddressMode;
import com.yandex.go.point_selection_settings.PointSelectionSettingsInteractor$PointType;
import com.yandex.go.point_selection_settings.d;
import com.yandex.go.route.interactor.c;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import ru.yandex.taxi.fragment.preorder.RouteSelectorDestinationFragment;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.routeselector.analytics.RouteSelectorOpenReason;

/* loaded from: classes12.dex */
public final class olp0 extends h55 {
    public final nzi D;
    public final jgq0 E;
    public final c F;

    public olp0(nzi nziVar, jgq0 jgq0Var, c cVar) {
        super(null);
        this.D = nziVar;
        this.E = jgq0Var;
        this.F = cVar;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        String str;
        String str2;
        String str3;
        plp0 plp0Var = (plp0) obj;
        c cVar = this.F;
        Address d = cVar.d();
        if (d == null) {
            xby.t(jst.e, "DESTINATION_PICKER:NO_DESTINATION_ADDRESS", new IllegalStateException("Source and destination addresses should be already defined!"), null, 10);
            d = cVar.g();
        }
        Address address = d;
        if (address == null) {
            r(new qu(9));
            return;
        }
        int indexOf = cVar.c().b.indexOf(address);
        pzi pziVar = new pzi(p7b1.d(new dzi(indexOf), this.E.a), this, 1);
        pv0 pv0Var = new pv0(address, null, null, null, null, null, null, null, 1022);
        dzi dziVar = new dzi(indexOf);
        ChooseAddressMode chooseAddressMode = ChooseAddressMode.DESTINATION;
        String str4 = plp0Var.a;
        String str5 = plp0Var.b;
        String str6 = plp0Var.c;
        bj70 bj70Var = plp0Var.d;
        String str7 = plp0Var.e;
        RouteSelectorOpenReason routeSelectorOpenReason = RouteSelectorOpenReason.OTHER;
        nzi nziVar = this.D;
        avd0 avd0Var = nziVar.g;
        pex0 m = ((k) nziVar.b).m();
        zud0 a = ((d) avd0Var).a(m != null ? m.b : null, PointSelectionSettingsInteractor$PointType.DESTINATION);
        z8l0 z8l0Var = RouteSelectorDestinationFragment.Companion;
        b9l0 b9l0Var = new b9l0(ModalViewOrigin.SUMMARY, nziVar.d, (a == null || (str3 = a.a) == null) ? str4 : str3, dziVar, routeSelectorOpenReason, (a == null || (str = a.b) == null) ? str5 : str, bj70Var, str7, (a == null || (str2 = a.c) == null) ? str6 : str2);
        z8l0Var.getClass();
        RouteSelectorDestinationFragment routeSelectorDestinationFragment = new RouteSelectorDestinationFragment();
        routeSelectorDestinationFragment.state = b9l0Var;
        routeSelectorDestinationFragment.setInitialAddress(pv0Var);
        nziVar.c(pziVar, dziVar, chooseAddressMode, routeSelectorDestinationFragment);
    }
}
