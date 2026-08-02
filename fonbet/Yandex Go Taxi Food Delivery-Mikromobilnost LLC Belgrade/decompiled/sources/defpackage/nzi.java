package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.destination_picker.ChooseAddressMode;
import com.yandex.go.mainscreen.superapp.impl.fragment.a;
import com.yandex.go.point_selection_settings.PointSelectionSettingsInteractor$PointType;
import com.yandex.go.point_selection_settings.d;
import com.yandex.go.preorder.mode.SourceAnalyticsMode;
import com.yandex.go.route.interactor.c;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.HashMap;
import ru.yandex.taxi.fragment.preorder.RouteSelectorDestinationFragment;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.routeselector.analytics.RouteSelectorOpenReason;

/* loaded from: classes5.dex */
public final class nzi {
    public final mzs a;
    public final wiq0 b;
    public final c c;
    public final l56 d;
    public final zuj0 e;
    public final rjt0 f;
    public final avd0 g;
    public final a h;
    public final oep0 i;

    public nzi(mzs mzsVar, wiq0 wiq0Var, c cVar, l56 l56Var, zuj0 zuj0Var, rjt0 rjt0Var, avd0 avd0Var, a aVar, oep0 oep0Var) {
        this.a = mzsVar;
        this.b = wiq0Var;
        this.c = cVar;
        this.d = l56Var;
        this.e = zuj0Var;
        this.f = rjt0Var;
        this.g = avd0Var;
        this.h = aVar;
        this.i = oep0Var;
    }

    public final RouteSelectorDestinationFragment a(ModalViewOrigin modalViewOrigin, l56 l56Var, u0j u0jVar, RouteSelectorOpenReason routeSelectorOpenReason) {
        String h;
        String h2;
        pex0 m = ((k) this.b).m();
        zud0 a = ((d) this.g).a(m != null ? m.b : null, PointSelectionSettingsInteractor$PointType.DESTINATION);
        zuj0 zuj0Var = this.e;
        if (a == null || (h = a.a) == null) {
            h = ((avj0) zuj0Var).h(kyh0.new_point_selection_screen_destination_point_title_statement);
        }
        String str = h;
        if (a == null || (h2 = a.c) == null) {
            h2 = ((avj0) zuj0Var).h(kyh0.new_point_selection_screen_confirm_button_title);
        }
        String str2 = h2;
        z8l0 z8l0Var = RouteSelectorDestinationFragment.Companion;
        b9l0 b9l0Var = new b9l0(modalViewOrigin, l56Var, str, u0jVar, routeSelectorOpenReason, a != null ? a.b : null, null, null, str2);
        z8l0Var.getClass();
        RouteSelectorDestinationFragment routeSelectorDestinationFragment = new RouteSelectorDestinationFragment();
        routeSelectorDestinationFragment.state = b9l0Var;
        return routeSelectorDestinationFragment;
    }

    public final x8e b(fzi fziVar, RouteSelectorDestinationFragment routeSelectorDestinationFragment) {
        mzs mzsVar = this.a;
        mzsVar.getClass();
        mzsVar.a.a("view.dest_location", new HashMap(), 1, new HashMap());
        j02 j02Var = new j02(this, routeSelectorDestinationFragment);
        routeSelectorDestinationFragment.setCallbackListener(new mzi(fziVar, j02Var));
        oep0.b(this.i, j02Var);
        return new x8e(24);
    }

    public final x8e c(fzi fziVar, u0j u0jVar, ChooseAddressMode chooseAddressMode, RouteSelectorDestinationFragment routeSelectorDestinationFragment) {
        this.f.o = SourceAnalyticsMode.EDIT_DESTINATION;
        routeSelectorDestinationFragment.setChooseAddressMode(chooseAddressMode);
        pex0 m = ((k) this.b).m();
        if (m != null) {
            routeSelectorDestinationFragment.setOrderPrice(m.e());
        }
        Address g = this.c.g();
        routeSelectorDestinationFragment.setSourceAddress((g == null || chooseAddressMode == ChooseAddressMode.STOP) ? null : new pv0(g, null, null, null, null, null, null, null, 1022));
        routeSelectorDestinationFragment.setMode(u0jVar);
        return b(fziVar, routeSelectorDestinationFragment);
    }
}
