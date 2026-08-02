package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.collections.a;
import ru.yandex.taxi.design.BackButtonIconComponent;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.ScootersDetailedOrderV2ModalView;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.ScootersOrderSelectorView;
import ru.yandex.taxi.scooters.presentation.route_navigation.route_summary.ScootersRouteSummaryView;
import ru.yandex.taxi.scooters.utils.ScootersGeoButtonIconComponent;
import ru.yandex.taxi.scooters.utils.ScootersVehicleActualPhotoButtonIconComponent;
import ru.yandex.taxi.scooters.utils.ScootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignment;
import ru.yandex.taxi.widget.ArrowsView;

/* loaded from: classes6.dex */
public final class ghn0 implements nhn0 {
    public boolean a = true;
    public final /* synthetic */ ScootersDetailedOrderV2ModalView b;

    public ghn0(ScootersDetailedOrderV2ModalView scootersDetailedOrderV2ModalView) {
        this.b = scootersDetailedOrderV2ModalView;
    }

    @Override // defpackage.nhn0
    public final void C0() {
        ScootersVehicleActualPhotoButtonIconComponent scootersVehicleActualPhotoButtonIconComponent;
        scootersVehicleActualPhotoButtonIconComponent = this.b.vehicleActualPhotoButton;
        scootersVehicleActualPhotoButtonIconComponent.hide();
    }

    @Override // defpackage.nhn0
    public final void F0() {
        e7p0 e7p0Var;
        ScootersDetailedOrderV2ModalView scootersDetailedOrderV2ModalView = this.b;
        e7p0Var = scootersDetailedOrderV2ModalView.vehicleActualPhotoTooltipContainer;
        if (e7p0Var != null) {
            e7p0Var.a(false);
        }
        scootersDetailedOrderV2ModalView.cleanAndSetNullTooltipContainer();
    }

    @Override // defpackage.nhn0
    public final void H8() {
        zfn0 zfn0Var;
        zfn0Var = this.b.scootersDetailedOrderLocationOverlay;
        g641 g641Var = zfn0Var.d;
        if (g641Var != null) {
            g641Var.detach();
        }
        zfn0Var.d = null;
    }

    @Override // defpackage.nhn0
    public final void L2(ahn0 ahn0Var) {
        pfn0 pfn0Var;
        ihn0 binding;
        ihn0 binding2;
        ihn0 binding3;
        c4p0 c4p0Var;
        ihn0 binding4;
        ScootersOrderSelectorView scootersOrderSelectorView;
        fva0 fva0Var;
        ihn0 binding5;
        ScootersDetailedOrderV2ModalView scootersDetailedOrderV2ModalView = this.b;
        pfn0Var = scootersDetailedOrderV2ModalView.scootersDetailedOrderAnalytics;
        String m = ahn0Var.d.m();
        if (!jl40.l(pfn0Var.b, m)) {
            x770 x770Var = pfn0Var.a;
            String str = pfn0Var.b;
            x770Var.getClass();
            HashMap hashMap = new HashMap();
            if (str != null) {
                hashMap.put("order_id", str);
            }
            x770Var.a.a("ScootersRideDetails.Shown", hashMap, 1, new HashMap());
            pfn0Var.b = m;
        }
        binding = scootersDetailedOrderV2ModalView.getBinding();
        xw31.I(binding.e, null, null, null, Integer.valueOf(tje.u(8, scootersDetailedOrderV2ModalView.getContext())));
        binding2 = scootersDetailedOrderV2ModalView.getBinding();
        binding2.c.setVisibility(0);
        binding3 = scootersDetailedOrderV2ModalView.getBinding();
        binding3.c.updateState(ahn0Var);
        scootersDetailedOrderV2ModalView.bindStatusBar(ahn0Var.e);
        scootersDetailedOrderV2ModalView.bindHeader(ahn0Var);
        c4p0Var = scootersDetailedOrderV2ModalView.scootersTariffFixAreaOverlay;
        c4p0Var.Ig(ahn0Var.d.n());
        if (ahn0Var.a) {
            binding5 = scootersDetailedOrderV2ModalView.getBinding();
            Iterator h8Var = new h8(3, binding5.d);
            ArrayList arrayList = new ArrayList();
            while (h8Var.hasNext()) {
                Object next = h8Var.next();
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                h8 h8Var2 = viewGroup != null ? new h8(3, viewGroup) : null;
                if (h8Var2 == null || !h8Var2.hasNext()) {
                    while (!h8Var.hasNext() && !arrayList.isEmpty()) {
                        h8Var = (Iterator) a.Z(arrayList);
                        ycc.z(arrayList);
                    }
                } else {
                    arrayList.add(h8Var);
                    h8Var = h8Var2;
                }
                ((View) next).setEnabled(false);
            }
        } else {
            binding4 = scootersDetailedOrderV2ModalView.getBinding();
            Iterator h8Var3 = new h8(3, binding4.d);
            ArrayList arrayList2 = new ArrayList();
            while (h8Var3.hasNext()) {
                Object next2 = h8Var3.next();
                View view2 = (View) next2;
                ViewGroup viewGroup2 = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
                h8 h8Var4 = viewGroup2 != null ? new h8(3, viewGroup2) : null;
                if (h8Var4 == null || !h8Var4.hasNext()) {
                    while (!h8Var3.hasNext() && !arrayList2.isEmpty()) {
                        h8Var3 = (Iterator) a.Z(arrayList2);
                        ycc.z(arrayList2);
                    }
                } else {
                    arrayList2.add(h8Var3);
                    h8Var3 = h8Var4;
                }
                ((View) next2).setEnabled(true);
            }
        }
        scootersOrderSelectorView = scootersDetailedOrderV2ModalView.orderSelectorView;
        scootersOrderSelectorView.render(ahn0Var.g);
        if (this.a) {
            this.a = false;
            fva0Var = scootersDetailedOrderV2ModalView.performanceAnalytics;
            fva0.b(fva0Var, "ScootersDetailedOrder", PerformanceAnalytics$Type.Loading, null, 4);
        }
    }

    @Override // defpackage.nhn0
    public final void N7() {
        ScootersRouteSummaryView scootersRouteSummaryView;
        ArrowsView arrowsView;
        ScootersDetailedOrderV2ModalView scootersDetailedOrderV2ModalView = this.b;
        scootersDetailedOrderV2ModalView.routeSummaryIsVisible = true;
        scootersRouteSummaryView = scootersDetailedOrderV2ModalView.routeSummary;
        scootersRouteSummaryView.setVisibility(0);
        scootersDetailedOrderV2ModalView.updateArrow();
        arrowsView = scootersDetailedOrderV2ModalView.arrowsViewAboveRouteSummary;
        arrowsView.showArrowPlain();
    }

    @Override // defpackage.nhn0
    public final void S(CharSequence charSequence) {
        e7p0 e7p0Var;
        e7p0 e7p0Var2;
        e7p0 e7p0Var3;
        ScootersVehicleActualPhotoButtonIconComponent scootersVehicleActualPhotoButtonIconComponent;
        ScootersDetailedOrderV2ModalView scootersDetailedOrderV2ModalView = this.b;
        e7p0Var = scootersDetailedOrderV2ModalView.vehicleActualPhotoTooltipContainer;
        if (e7p0Var == null) {
            scootersDetailedOrderV2ModalView.vehicleActualPhotoTooltipContainer = new e7p0(scootersDetailedOrderV2ModalView);
            e7p0Var2 = scootersDetailedOrderV2ModalView.vehicleActualPhotoTooltipContainer;
            if (e7p0Var2 != null) {
                scootersVehicleActualPhotoButtonIconComponent = scootersDetailedOrderV2ModalView.vehicleActualPhotoButton;
                e7p0Var2.d(scootersVehicleActualPhotoButtonIconComponent, charSequence.toString(), ScootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignment.END);
            }
            e7p0Var3 = scootersDetailedOrderV2ModalView.vehicleActualPhotoTooltipContainer;
            if (e7p0Var3 != null) {
                e7p0Var3.a(true);
            }
        }
    }

    @Override // defpackage.nhn0
    public final void T(CharSequence charSequence, CharSequence charSequence2, String str, String str2) {
        ScootersVehicleActualPhotoButtonIconComponent scootersVehicleActualPhotoButtonIconComponent;
        pav pavVar;
        ScootersVehicleActualPhotoButtonIconComponent scootersVehicleActualPhotoButtonIconComponent2;
        ScootersVehicleActualPhotoButtonIconComponent scootersVehicleActualPhotoButtonIconComponent3;
        ScootersVehicleActualPhotoButtonIconComponent scootersVehicleActualPhotoButtonIconComponent4;
        ScootersDetailedOrderV2ModalView scootersDetailedOrderV2ModalView = this.b;
        scootersVehicleActualPhotoButtonIconComponent = scootersDetailedOrderV2ModalView.vehicleActualPhotoButton;
        pavVar = scootersDetailedOrderV2ModalView.imageLoader;
        scootersVehicleActualPhotoButtonIconComponent.init(pavVar);
        scootersVehicleActualPhotoButtonIconComponent2 = scootersDetailedOrderV2ModalView.vehicleActualPhotoButton;
        scootersVehicleActualPhotoButtonIconComponent2.setIconByUrl(str2);
        scootersVehicleActualPhotoButtonIconComponent3 = scootersDetailedOrderV2ModalView.vehicleActualPhotoButton;
        scootersVehicleActualPhotoButtonIconComponent3.setDebounceClickListener(new hek0(scootersDetailedOrderV2ModalView, str, charSequence, charSequence2, 2));
        scootersVehicleActualPhotoButtonIconComponent4 = scootersDetailedOrderV2ModalView.vehicleActualPhotoButton;
        scootersVehicleActualPhotoButtonIconComponent4.show();
    }

    @Override // defpackage.nhn0
    public final void W() {
        ScootersGeoButtonIconComponent scootersGeoButtonIconComponent;
        scootersGeoButtonIconComponent = this.b.geoButton;
        scootersGeoButtonIconComponent.switchToFocusOnRoute();
    }

    @Override // defpackage.nhn0
    public final void Y9(tto0 tto0Var) {
        ScootersRouteSummaryView scootersRouteSummaryView;
        ScootersRouteSummaryView scootersRouteSummaryView2;
        ScootersRouteSummaryView scootersRouteSummaryView3;
        ScootersRouteSummaryView scootersRouteSummaryView4;
        ScootersDetailedOrderV2ModalView scootersDetailedOrderV2ModalView = this.b;
        scootersRouteSummaryView = scootersDetailedOrderV2ModalView.routeSummary;
        scootersRouteSummaryView.setArrivalTime(tto0Var.e);
        scootersRouteSummaryView2 = scootersDetailedOrderV2ModalView.routeSummary;
        scootersRouteSummaryView2.setRemainingDistance(tto0Var.b);
        scootersRouteSummaryView3 = scootersDetailedOrderV2ModalView.routeSummary;
        scootersRouteSummaryView3.setRemainingTime(tto0Var.c);
        scootersRouteSummaryView4 = scootersDetailedOrderV2ModalView.routeSummary;
        double d = tto0Var.d;
        scootersRouteSummaryView4.setRouteProgress((float) ((d - tto0Var.a) / d));
    }

    @Override // defpackage.nhn0
    public final void Z9(r7p0 r7p0Var) {
        zfn0 zfn0Var;
        zfn0Var = this.b.scootersDetailedOrderLocationOverlay;
        g641 g641Var = zfn0Var.d;
        if (g641Var != null) {
            g641Var.detach();
        }
        g641 g641Var2 = (g641) i5m.a((xvf0) z0s.f(zfn0Var.a, zfn0Var.b).y).get();
        g641Var2.Hg(r7p0Var.a, null, zfn0Var.c);
        zfn0Var.d = g641Var2;
    }

    @Override // defpackage.nhn0
    public final void dismiss() {
        sls slsVar;
        slsVar = this.b.backPressedListener;
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    @Override // defpackage.nhn0
    public final void l9() {
        ScootersRouteSummaryView scootersRouteSummaryView;
        ArrowsView arrowsView;
        ScootersDetailedOrderV2ModalView scootersDetailedOrderV2ModalView = this.b;
        scootersDetailedOrderV2ModalView.routeSummaryIsVisible = false;
        scootersRouteSummaryView = scootersDetailedOrderV2ModalView.routeSummary;
        scootersRouteSummaryView.setVisibility(8);
        arrowsView = scootersDetailedOrderV2ModalView.arrowsViewAboveRouteSummary;
        arrowsView.setVisibility(8);
        scootersDetailedOrderV2ModalView.updateArrow();
    }

    @Override // defpackage.nhn0
    public final void updateBadgeText(String str) {
        vxm0 vxm0Var;
        BackButtonIconComponent backButtonIconComponent;
        ScootersDetailedOrderV2ModalView scootersDetailedOrderV2ModalView = this.b;
        vxm0Var = scootersDetailedOrderV2ModalView.scootersAppTypeInteractor;
        vxm0Var.a.getClass();
        backButtonIconComponent = scootersDetailedOrderV2ModalView.back;
        backButtonIconComponent.setBadgeText(str);
    }

    @Override // defpackage.nhn0
    public final void w() {
        ScootersGeoButtonIconComponent scootersGeoButtonIconComponent;
        scootersGeoButtonIconComponent = this.b.geoButton;
        scootersGeoButtonIconComponent.switchToFocusOnUser();
    }
}
