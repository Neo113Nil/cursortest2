package defpackage;

import android.view.View;
import com.yandex.go.superapp.discovery.map.impl.ui.main.SuperAppDiscoveryMapModalView;
import com.yandex.go.superapp.discovery.map.impl.ui.main.explorer.ExplorerButtonView;
import com.yandex.go.superapp.discovery.map.impl.ui.main.explorer.ExplorerDistrictCoverageProgressView;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.map_common.style.source.e;

/* loaded from: classes14.dex */
public final class gvv0 implements uvv0 {
    public final /* synthetic */ SuperAppDiscoveryMapModalView a;

    public gvv0(SuperAppDiscoveryMapModalView superAppDiscoveryMapModalView) {
        this.a = superAppDiscoveryMapModalView;
    }

    @Override // defpackage.uvv0
    public final void N9(boolean z) {
        h(true, z);
    }

    @Override // defpackage.uvv0
    public final void Z7(fto ftoVar) {
        pav pavVar;
        SuperAppDiscoveryMapModalView superAppDiscoveryMapModalView = this.a;
        ExplorerButtonView explorerButtonView = SuperAppDiscoveryMapModalView.access$getBinding(superAppDiscoveryMapModalView).f;
        pavVar = superAppDiscoveryMapModalView.imageLoader;
        explorerButtonView.render(ftoVar, pavVar);
    }

    @Override // defpackage.uvv0
    public final void b(float f, boolean z) {
        FloatButtonIconComponent floatButtonIconComponent = SuperAppDiscoveryMapModalView.access$getBinding(this.a).c;
        floatButtonIconComponent.setVisibility(z ? 0 : 8);
        floatButtonIconComponent.setRotation(f);
    }

    @Override // defpackage.uvv0
    public final void c(boolean z) {
        SuperAppDiscoveryMapModalView superAppDiscoveryMapModalView = this.a;
        SuperAppDiscoveryMapModalView.access$getBinding(superAppDiscoveryMapModalView).g.setIcon(vng.t(z ? f1h0.ic_location_fill_24 : i4h0.ic_compass_crossed, superAppDiscoveryMapModalView.getContext()));
    }

    @Override // defpackage.uvv0
    public final void cd() {
        h(false, false);
    }

    public final void h(boolean z, boolean z2) {
        boolean isSearchBarEnabled;
        SuperAppDiscoveryMapModalView superAppDiscoveryMapModalView = this.a;
        nvv0 access$getBinding = SuperAppDiscoveryMapModalView.access$getBinding(superAppDiscoveryMapModalView);
        isSearchBarEnabled = superAppDiscoveryMapModalView.isSearchBarEnabled();
        if (isSearchBarEnabled) {
            access$getBinding.l.setVisibility(z ? 0 : 8);
        } else {
            access$getBinding.b.setVisibility(z ? 0 : 8);
            access$getBinding.k.setVisibility(z ? 0 : 8);
        }
        access$getBinding.i.setVisibility(z ? 0 : 8);
        access$getBinding.j.setVisibility(z ? 0 : 8);
        access$getBinding.g.setVisibility(z ? 0 : 8);
        access$getBinding.c.setVisibility((z && z2) ? 0 : 8);
        access$getBinding.h.setVisibility(z ? 0 : 8);
    }

    @Override // defpackage.uvv0
    public final void m(String str, String str2) {
        bt00 bt00Var;
        bt00 bt00Var2;
        bt00 bt00Var3;
        SuperAppDiscoveryMapModalView superAppDiscoveryMapModalView = this.a;
        bt00Var = superAppDiscoveryMapModalView.mapStylesRepository;
        ((e) bt00Var).b();
        if (str != null && !evu0.J(str)) {
            bt00Var3 = superAppDiscoveryMapModalView.mapStylesRepository;
            ((e) bt00Var3).d(str);
        }
        bt00Var2 = superAppDiscoveryMapModalView.mapStylesRepository;
        ((e) bt00Var2).c(4, str2);
    }

    @Override // defpackage.uvv0
    public final void q1(qto qtoVar) {
        ExplorerDistrictCoverageProgressView coverageProgressView;
        bvo bvoVar;
        View view;
        ExplorerDistrictCoverageProgressView coverageProgressView2;
        ExplorerDistrictCoverageProgressView coverageProgressView3;
        bvo bvoVar2;
        ExplorerDistrictCoverageProgressView coverageProgressView4;
        pav pavVar;
        ExplorerDistrictCoverageProgressView coverageProgressView5;
        View view2;
        SuperAppDiscoveryMapModalView superAppDiscoveryMapModalView = this.a;
        if (qtoVar == null || !qtoVar.c) {
            coverageProgressView = superAppDiscoveryMapModalView.getCoverageProgressView();
            coverageProgressView.hide();
            SuperAppDiscoveryMapModalView.access$getBinding(superAppDiscoveryMapModalView).e.setText("");
            SuperAppDiscoveryMapModalView.access$getBinding(superAppDiscoveryMapModalView).e.setVisibility(4);
            bvoVar = superAppDiscoveryMapModalView.explorerTopFadeOverlay;
            if (bvoVar == null || (view = bvoVar.d) == null) {
                return;
            }
            cma1.L(view);
            return;
        }
        coverageProgressView2 = superAppDiscoveryMapModalView.getCoverageProgressView();
        coverageProgressView2.setCoverage(qtoVar.b);
        coverageProgressView3 = superAppDiscoveryMapModalView.getCoverageProgressView();
        coverageProgressView3.show();
        SuperAppDiscoveryMapModalView.access$getBinding(superAppDiscoveryMapModalView).e.setText(qtoVar.a);
        SuperAppDiscoveryMapModalView.access$getBinding(superAppDiscoveryMapModalView).e.setVisibility(0);
        bvoVar2 = superAppDiscoveryMapModalView.explorerTopFadeOverlay;
        if (bvoVar2 != null && (view2 = bvoVar2.d) != null) {
            view2.setBackground(bvoVar2.b());
            cma1.J(view2);
        }
        String str = qtoVar.d;
        if (str == null || evu0.J(str)) {
            coverageProgressView4 = superAppDiscoveryMapModalView.getCoverageProgressView();
            coverageProgressView4.setFinishedImage(null);
        } else {
            pavVar = superAppDiscoveryMapModalView.imageLoader;
            coverageProgressView5 = superAppDiscoveryMapModalView.getCoverageProgressView();
            ((nac) pavVar.f(new but0(7, superAppDiscoveryMapModalView), coverageProgressView5)).c(str);
        }
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        buv0 mapCategoryFiltersAdapter;
        mapCategoryFiltersAdapter = this.a.getMapCategoryFiltersAdapter();
        mapCategoryFiltersAdapter.submitList(((byv0) obj).a, null);
    }
}
