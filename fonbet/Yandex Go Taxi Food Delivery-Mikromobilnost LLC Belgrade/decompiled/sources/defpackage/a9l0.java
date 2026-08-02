package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import com.yandex.go.address.models.Address;
import com.yandex.go.route.interactor.c;
import com.yandex.go.search.model.DecideLaterConfig;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.collections.a;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.fragment.preorder.RouteSelectorDestinationFragment;
import ru.yandex.taxi.routeselector.view.RouteSelectorModalView;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.search.view.AddressSearchModalView;
import ru.yandex.taxi.search.view.AddressSearchView;
import ru.yandex.taxi.widget.floatbuttonholder.RotatableFloatButton;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes5.dex */
public final class a9l0 implements RouteSelectorModalView.a {
    public final /* synthetic */ RouteSelectorDestinationFragment a;

    public a9l0(RouteSelectorDestinationFragment routeSelectorDestinationFragment) {
        this.a = routeSelectorDestinationFragment;
    }

    @Override // ru.yandex.taxi.routeselector.view.RouteSelectorModalView.a
    public final void K() {
        this.a.addressConfirmed();
    }

    @Override // ru.yandex.taxi.routeselector.view.RouteSelectorModalView.a
    public final void dismiss() {
        this.a.onBackPressed();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b1, code lost:
    
        if (r2 == null) goto L29;
     */
    @Override // ru.yandex.taxi.routeselector.view.RouteSelectorModalView.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o3(PointType pointType, final qa0 qa0Var) {
        Address address;
        String str;
        float f;
        View view;
        yzi yziVar = this.a.destinationPickerRouter;
        if (yziVar != null) {
            c cVar = yziVar.b;
            RouteSelectorDestinationFragment routeSelectorDestinationFragment = yziVar.c;
            if (routeSelectorDestinationFragment == null) {
                ny61.g("Required value was null.");
                return;
            }
            pv0 addressInfo = routeSelectorDestinationFragment.getAddressInfo();
            Address h = cVar.c().h();
            if (addressInfo == null || (address = addressInfo.a) == null) {
                address = h;
            }
            if (yziVar.d != -1) {
                List list = cVar.c().b;
                address = list != null ? (Address) a.S(yziVar.d, list) : null;
            }
            if (h == null) {
                jst.e.s(new IllegalStateException("Source address is null, unable to show destination picker"));
                return;
            }
            Address address2 = address;
            final RouteSelectorDestinationFragment routeSelectorDestinationFragment2 = yziVar.c;
            if (routeSelectorDestinationFragment2 == null) {
                return;
            }
            uio0 uio0Var = yziVar.a;
            u0j mode = routeSelectorDestinationFragment2.getMode();
            wyf a = ((g0j) uio0Var.f).a(new h0j(mode, address2, "dest_location", false, false), new ddf(uio0Var.c(mode, address2), mode instanceof ezi), new r51(SourcePicker.DESTINATION_FROM_ROUTE_SELECTOR, DecideLaterConfig.a, null), m3o.b, (y9y0) uio0Var.c);
            p51 p51Var = AddressSearchModalView.Companion;
            AddressSearchView.Companion.getClass();
            b61 b61Var = new b61(a);
            b61Var.j = wch0.suggested_destinations;
            b61Var.p = false;
            b61Var.u = PointType.DESTINATION;
            RouteSelectorDestinationFragment routeSelectorDestinationFragment3 = yziVar.c;
            if (routeSelectorDestinationFragment3 != null && (view = routeSelectorDestinationFragment3.getView()) != null) {
                str = view.getContext().getString(kyh0.search_destination_address_hint);
            }
            str = "";
            b61Var.n = str;
            b61Var.q = new v8e(17, yziVar);
            p51Var.getClass();
            AddressSearchModalView a2 = p51.a(b61Var);
            routeSelectorDestinationFragment2.getMode();
            a2.setTag(dih0.destination_picker_tag_launching_params, new p41(PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC));
            a2.setOnAddressPickedListener(new ax4() { // from class: xzi
                @Override // defpackage.ax4
                public final void t(pv0 pv0Var) {
                    qa0.this.accept(pv0Var);
                    routeSelectorDestinationFragment2.addressPicked(pv0Var);
                }
            });
            a2.setAnimateOnAppearing(true);
            ViewGroup viewGroup = (ViewGroup) routeSelectorDestinationFragment2.getRootView().findViewById(udh0.modal_view_container);
            if (viewGroup != null) {
                RotatableFloatButton autoLocation = routeSelectorDestinationFragment2.getAutoLocation();
                if (autoLocation != null) {
                    WeakHashMap weakHashMap = b.a;
                    f = ViewCompat$Api21Impl.i(autoLocation);
                } else {
                    f = 0.0f;
                }
                a2.show(viewGroup, f + 2.0f);
            }
        }
    }

    @Override // ru.yandex.taxi.routeselector.view.RouteSelectorModalView.a
    public final tls t2() {
        return new x8l0(this.a, 2);
    }
}
