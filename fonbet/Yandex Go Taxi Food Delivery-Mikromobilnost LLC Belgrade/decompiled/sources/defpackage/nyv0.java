package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.places.common.ui.ControlButtonView;
import com.yandex.go.superapp.discovery.map.impl.ui.main.searchbar.views.SuperAppMapSearchbarView;
import com.yandex.go.superapp.discovery.map.impl.ui.main.v2.SuperAppDiscoveryMapV2ModalView;
import com.yandex.go.superapp.discovery.map.impl.ui.main.v2.header.DiscoveryMapFloatingHeader;
import com.yandex.go.superapp.discovery.map.impl.ui.model.v2.SuperAppDiscoveryMapFlexContainerState;
import ru.yandex.taxi.map_common.style.source.e;

/* loaded from: classes14.dex */
public final class nyv0 implements qyv0 {
    public final /* synthetic */ SuperAppDiscoveryMapV2ModalView a;

    public nyv0(SuperAppDiscoveryMapV2ModalView superAppDiscoveryMapV2ModalView) {
        this.a = superAppDiscoveryMapV2ModalView;
    }

    @Override // defpackage.qyv0
    public final void b(float f, boolean z) {
        ControlButtonView controlButtonView = SuperAppDiscoveryMapV2ModalView.access$getBinding(this.a).c;
        controlButtonView.setVisibility(z ? 0 : 8);
        controlButtonView.setRotation(f);
    }

    @Override // defpackage.qyv0
    public final void c(boolean z) {
        SuperAppDiscoveryMapV2ModalView superAppDiscoveryMapV2ModalView = this.a;
        SuperAppDiscoveryMapV2ModalView.access$getBinding(superAppDiscoveryMapV2ModalView).k.setImageDrawable(vng.t(z ? f1h0.ic_location_fill_24 : i4h0.ic_compass_crossed, superAppDiscoveryMapV2ModalView.getContext()));
    }

    @Override // defpackage.qyv0
    public final void m(String str, String str2) {
        bt00 bt00Var;
        bt00 bt00Var2;
        bt00 bt00Var3;
        SuperAppDiscoveryMapV2ModalView superAppDiscoveryMapV2ModalView = this.a;
        bt00Var = superAppDiscoveryMapV2ModalView.mapStylesRepository;
        ((e) bt00Var).b();
        if (str != null && !evu0.J(str)) {
            bt00Var3 = superAppDiscoveryMapV2ModalView.mapStylesRepository;
            ((e) bt00Var3).d(str);
        }
        bt00Var2 = superAppDiscoveryMapV2ModalView.mapStylesRepository;
        ((e) bt00Var2).c(4, str2);
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        DiscoveryMapFloatingHeader discoveryMapFloatingHeader;
        Boolean bool;
        vxp0 searchbarController;
        kuv0 kuv0Var;
        uh00 uh00Var;
        hzv0 hzv0Var = (hzv0) obj;
        SuperAppDiscoveryMapV2ModalView superAppDiscoveryMapV2ModalView = this.a;
        pyv0 access$getBinding = SuperAppDiscoveryMapV2ModalView.access$getBinding(superAppDiscoveryMapV2ModalView);
        View view = access$getBinding.e;
        SuperAppDiscoveryMapFlexContainerState superAppDiscoveryMapFlexContainerState = hzv0Var.a;
        boolean z = hzv0Var.b;
        boolean z2 = hzv0Var.d;
        view.setVisibility(superAppDiscoveryMapFlexContainerState == SuperAppDiscoveryMapFlexContainerState.LOADING ? 0 : 8);
        access$getBinding.d.setVisibility(hzv0Var.e ? 0 : 8);
        access$getBinding.b.setVisibility(z2 ? 0 : 8);
        if (z2 || z) {
            discoveryMapFloatingHeader = superAppDiscoveryMapV2ModalView.floatingHeader;
            discoveryMapFloatingHeader.setVisibility(hzv0Var.c ? 0 : 8);
        }
        bool = superAppDiscoveryMapV2ModalView.lastFlexVisible;
        if (!jl40.l(bool, Boolean.valueOf(z))) {
            superAppDiscoveryMapV2ModalView.lastFlexVisible = Boolean.valueOf(z);
            float f = z ? 1.0f : 0.0f;
            kuv0Var = superAppDiscoveryMapV2ModalView.flexContentContainer;
            for (ViewGroup viewGroup : scc.g(kuv0Var.a, SuperAppDiscoveryMapV2ModalView.access$getBinding(superAppDiscoveryMapV2ModalView).i, SuperAppDiscoveryMapV2ModalView.access$getBinding(superAppDiscoveryMapV2ModalView).n)) {
                viewGroup.animate().cancel();
                ViewPropertyAnimator alpha = viewGroup.animate().alpha(f);
                uh00Var = superAppDiscoveryMapV2ModalView.explorationConfig;
                alpha.setDuration(uh00Var.d).withStartAction(new myv0(z, viewGroup)).withEndAction(new uf4(z, viewGroup, superAppDiscoveryMapV2ModalView)).start();
            }
            superAppDiscoveryMapV2ModalView.updateMapViewportInsets();
        }
        searchbarController = superAppDiscoveryMapV2ModalView.getSearchbarController();
        searchbarController.b(hzv0Var.f);
        superAppDiscoveryMapV2ModalView.renderGamificationButton(hzv0Var.i);
        superAppDiscoveryMapV2ModalView.renderGamificationHeader(hzv0Var.j);
        superAppDiscoveryMapV2ModalView.updateStatusBarBlur();
        superAppDiscoveryMapV2ModalView.updateMapViewportInsets();
    }

    @Override // defpackage.qyv0
    public final void wg(c5w0 c5w0Var) {
        vxp0 searchbarController;
        vxp0 searchbarController2;
        wyv0 wyv0Var;
        SuperAppDiscoveryMapV2ModalView superAppDiscoveryMapV2ModalView = this.a;
        searchbarController = superAppDiscoveryMapV2ModalView.getSearchbarController();
        c5w0 c5w0Var2 = searchbarController.i;
        if (c5w0Var == null) {
            if (c5w0Var2 != null) {
                searchbarController.i = null;
                searchbarController.a();
            }
        } else if (!c5w0Var.equals(c5w0Var2) || searchbarController.h == null) {
            searchbarController.i = c5w0Var;
            krl0 krl0Var = searchbarController.h;
            if (krl0Var == null) {
                SuperAppMapSearchbarView superAppMapSearchbarView = new SuperAppMapSearchbarView(searchbarController.a, searchbarController.c, searchbarController.d);
                GoFrameLayout goFrameLayout = searchbarController.b;
                goFrameLayout.addView(superAppMapSearchbarView, new ViewGroup.LayoutParams(-1, -2));
                superAppMapSearchbarView.applyBottomInset(searchbarController.k);
                krl0 krl0Var2 = new krl0(superAppMapSearchbarView, new zxv0(goFrameLayout, new nao0(18, superAppMapSearchbarView, searchbarController), new uyo0(15, searchbarController)));
                searchbarController.h = krl0Var2;
                krl0Var = krl0Var2;
            }
            ((SuperAppMapSearchbarView) krl0Var.a).render(c5w0Var, searchbarController.e);
        }
        searchbarController2 = superAppDiscoveryMapV2ModalView.getSearchbarController();
        wyv0Var = superAppDiscoveryMapV2ModalView.discoveryMapV2Presenter;
        searchbarController2.b(wyv0Var.Lg().f);
        superAppDiscoveryMapV2ModalView.updateMapViewportInsets();
    }
}
