package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.b;
import com.yandex.go.scooters.offers.v2.ScootersCardV2ModalView;
import com.yandex.go.scooters.offers.v2.analytics.c;
import com.yandex.go.scooters.offers.v2.components.ScootersComponentsView;
import defpackage.r7p0;
import defpackage.tje;
import defpackage.zy11;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.scooters.presentation.common.ui.preview.ScootersVehiclePreviewView;
import ru.yandex.taxi.scooters.utils.ScootersGeoButtonIconComponent;
import ru.yandex.taxi.scooters.utils.ScootersVehicleActualPhotoButtonIconComponent;
import ru.yandex.taxi.scooters.utils.ScootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignment;

/* loaded from: classes13.dex */
public final class j6n0 implements m6n0 {
    public final /* synthetic */ ScootersCardV2ModalView a;

    public j6n0(ScootersCardV2ModalView scootersCardV2ModalView) {
        this.a = scootersCardV2ModalView;
    }

    @Override // defpackage.m6n0
    public final void C0() {
        ScootersVehicleActualPhotoButtonIconComponent scootersVehicleActualPhotoButtonIconComponent;
        scootersVehicleActualPhotoButtonIconComponent = this.a.vehicleActualPhotoButton;
        scootersVehicleActualPhotoButtonIconComponent.hide();
    }

    @Override // defpackage.m6n0
    public final void F0() {
        e7p0 e7p0Var;
        ScootersCardV2ModalView scootersCardV2ModalView = this.a;
        e7p0Var = scootersCardV2ModalView.vehicleActualPhotoTooltipContainer;
        if (e7p0Var != null) {
            e7p0Var.a(false);
        }
        scootersCardV2ModalView.cleanAndSetNullTooltipContainer();
    }

    @Override // defpackage.m6n0
    public final void S(CharSequence charSequence) {
        e7p0 e7p0Var;
        e7p0 e7p0Var2;
        e7p0 e7p0Var3;
        ScootersVehicleActualPhotoButtonIconComponent scootersVehicleActualPhotoButtonIconComponent;
        ScootersCardV2ModalView scootersCardV2ModalView = this.a;
        e7p0Var = scootersCardV2ModalView.vehicleActualPhotoTooltipContainer;
        if (e7p0Var == null) {
            scootersCardV2ModalView.vehicleActualPhotoTooltipContainer = new e7p0(scootersCardV2ModalView);
            e7p0Var2 = scootersCardV2ModalView.vehicleActualPhotoTooltipContainer;
            if (e7p0Var2 != null) {
                scootersVehicleActualPhotoButtonIconComponent = scootersCardV2ModalView.vehicleActualPhotoButton;
                e7p0Var2.d(scootersVehicleActualPhotoButtonIconComponent, charSequence.toString(), ScootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignment.END);
            }
            e7p0Var3 = scootersCardV2ModalView.vehicleActualPhotoTooltipContainer;
            if (e7p0Var3 != null) {
                e7p0Var3.a(true);
            }
        }
    }

    @Override // defpackage.m6n0
    public final void T(CharSequence charSequence, CharSequence charSequence2, String str, String str2) {
        ScootersVehicleActualPhotoButtonIconComponent scootersVehicleActualPhotoButtonIconComponent;
        pav pavVar;
        ScootersVehicleActualPhotoButtonIconComponent scootersVehicleActualPhotoButtonIconComponent2;
        ScootersVehicleActualPhotoButtonIconComponent scootersVehicleActualPhotoButtonIconComponent3;
        ScootersVehicleActualPhotoButtonIconComponent scootersVehicleActualPhotoButtonIconComponent4;
        ScootersCardV2ModalView scootersCardV2ModalView = this.a;
        scootersVehicleActualPhotoButtonIconComponent = scootersCardV2ModalView.vehicleActualPhotoButton;
        pavVar = scootersCardV2ModalView.imageLoader;
        scootersVehicleActualPhotoButtonIconComponent.init(pavVar);
        scootersVehicleActualPhotoButtonIconComponent2 = scootersCardV2ModalView.vehicleActualPhotoButton;
        scootersVehicleActualPhotoButtonIconComponent2.setIconByUrl(str2);
        scootersVehicleActualPhotoButtonIconComponent3 = scootersCardV2ModalView.vehicleActualPhotoButton;
        scootersVehicleActualPhotoButtonIconComponent3.setDebounceClickListener(new hek0(scootersCardV2ModalView, str, charSequence, charSequence2, 1));
        scootersVehicleActualPhotoButtonIconComponent4 = scootersCardV2ModalView.vehicleActualPhotoButton;
        scootersVehicleActualPhotoButtonIconComponent4.show();
    }

    @Override // defpackage.m6n0
    public final void W() {
        ScootersGeoButtonIconComponent scootersGeoButtonIconComponent;
        scootersGeoButtonIconComponent = this.a.geoButton;
        scootersGeoButtonIconComponent.switchToFocusOnRoute();
    }

    @Override // defpackage.m6n0
    public final void Ze() {
        f4p0 scootersRouteOverlay;
        scootersRouteOverlay = this.a.getScootersRouteOverlay();
        scootersRouteOverlay.getClass();
    }

    @Override // defpackage.m6n0
    public final ViewGroup getRootView() {
        int i = qfh0.scooters_attention;
        WeakHashMap weakHashMap = b.a;
        return (ViewGroup) ((View) rp31.d(this.a, i));
    }

    @Override // defpackage.m6n0
    public final void o6() {
        ScootersVehiclePreviewView scootersVehiclePreviewView;
        scootersVehiclePreviewView = this.a.alternativeOfferPreviewView;
        scootersVehiclePreviewView.setVisibility(8);
    }

    @Override // defpackage.m6n0
    public final void r0() {
        this.a.isDisabled = false;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, com.yandex.go.scooters.offers.v2.analytics.a] */
    @Override // defpackage.eyi0
    public final void render(Object obj) {
        ScootersComponentsView scootersComponentsView;
        ScootersVehiclePreviewView scootersVehiclePreviewView;
        s6n0 s6n0Var;
        FloatButtonIconComponent floatButtonIconComponent;
        s6n0 s6n0Var2;
        c cVar;
        z5n0 z5n0Var = (z5n0) obj;
        this.a.expandOnTouchExploration();
        scootersComponentsView = this.a.scootersComponentsView;
        scootersComponentsView.update(z5n0Var);
        boolean z = z5n0Var instanceof y5n0;
        ScootersCardV2ModalView scootersCardV2ModalView = this.a;
        if (!z) {
            scootersVehiclePreviewView = scootersCardV2ModalView.alternativeOfferPreviewView;
            scootersVehiclePreviewView.setVisibility(8);
            s6n0Var = this.a.scootersCardV2ProxyAnalytics;
            s6n0Var.d = null;
            return;
        }
        floatButtonIconComponent = scootersCardV2ModalView.supportButton;
        y5n0 y5n0Var = (y5n0) z5n0Var;
        floatButtonIconComponent.setVisibility(y5n0Var.e ? 0 : 8);
        s6n0Var2 = this.a.scootersCardV2ProxyAnalytics;
        s6n0Var2.d = y5n0Var;
        cVar = this.a.scootersOfferCardPerformanceAnalytics;
        ScootersCardV2ModalView scootersCardV2ModalView2 = this.a;
        cVar.getClass();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? r1 = cVar.c;
        if (r1 == 0) {
            return;
        }
        ref$ObjectRef.element = r1;
        OneShotPreDrawListener.add(scootersCardV2ModalView2, new com.yandex.go.scooters.offers.v2.analytics.b(scootersCardV2ModalView2, ref$ObjectRef, cVar));
    }

    @Override // defpackage.m6n0
    public final void vg(g5n0 g5n0Var) {
        AnchorBottomSheetBehavior bottomSheetBehavior;
        AnchorBottomSheetBehavior bottomSheetBehavior2;
        boolean z = g5n0Var instanceof f5n0;
        ScootersCardV2ModalView scootersCardV2ModalView = this.a;
        if (z) {
            f5n0 f5n0Var = (f5n0) g5n0Var;
            scootersCardV2ModalView.collapsedHeight = f5n0Var.b;
            scootersCardV2ModalView.anchorHeight = f5n0Var.a;
            bottomSheetBehavior2 = scootersCardV2ModalView.getBottomSheetBehavior();
            bottomSheetBehavior2.W = true;
            scootersCardV2ModalView.updateHeights();
            return;
        }
        if (!(g5n0Var instanceof e5n0)) {
            w511.b();
            return;
        }
        scootersCardV2ModalView.collapsedHeight = 0;
        scootersCardV2ModalView.anchorHeight = ((e5n0) g5n0Var).a;
        scootersCardV2ModalView.updateHeights();
        scootersCardV2ModalView.expand();
        bottomSheetBehavior = scootersCardV2ModalView.getBottomSheetBehavior();
        bottomSheetBehavior.W = false;
    }

    @Override // defpackage.m6n0
    public final void w() {
        ScootersGeoButtonIconComponent scootersGeoButtonIconComponent;
        scootersGeoButtonIconComponent = this.a.geoButton;
        scootersGeoButtonIconComponent.switchToFocusOnUser();
    }

    @Override // defpackage.m6n0
    public final void x5(final lxm0 lxm0Var, Drawable drawable) {
        ScootersVehiclePreviewView scootersVehiclePreviewView;
        ScootersVehiclePreviewView scootersVehiclePreviewView2;
        ScootersVehiclePreviewView scootersVehiclePreviewView3;
        ScootersVehiclePreviewView scootersVehiclePreviewView4;
        final ScootersCardV2ModalView scootersCardV2ModalView = this.a;
        scootersVehiclePreviewView = scootersCardV2ModalView.alternativeOfferPreviewView;
        scootersVehiclePreviewView.setBackground(drawable);
        scootersVehiclePreviewView2 = scootersCardV2ModalView.alternativeOfferPreviewView;
        scootersVehiclePreviewView2.alternativeOffer(lxm0Var.a, lxm0Var.b, lxm0Var.d, lxm0Var.e, lxm0Var.c, lxm0Var.f, lxm0Var.g, lxm0Var.h, lxm0Var.i);
        scootersVehiclePreviewView3 = scootersCardV2ModalView.alternativeOfferPreviewView;
        scootersVehiclePreviewView3.setOnAlternativeOfferClickListener(new sls() { // from class: com.yandex.go.scooters.offers.v2.a
            @Override // defpackage.sls
            public final Object invoke() {
                f fVar;
                fVar = ScootersCardV2ModalView.this.scootersCardV2Presenter;
                r7p0 r7p0Var = lxm0Var.a;
                fVar.Lg();
                tje.N(fVar.Jg(), null, null, new ScootersCardV2Presenter$alternativeOfferTapped$1(fVar, r7p0Var, null), 3);
                return zy11.a;
            }
        });
        scootersVehiclePreviewView4 = scootersCardV2ModalView.alternativeOfferPreviewView;
        scootersVehiclePreviewView4.setVisibility(0);
    }

    @Override // defpackage.m6n0
    public final void z0() {
        this.a.isDisabled = true;
    }
}
