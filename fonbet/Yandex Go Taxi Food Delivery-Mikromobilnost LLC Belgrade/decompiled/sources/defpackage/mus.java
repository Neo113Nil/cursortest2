package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.ViewGroup;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.design.divider.CardDivider;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.navigator.gas_stations.filters.GasStationsFiltersModalView;
import com.yandex.go.navigator.gas_stations.filters.SearchOnlyAlongRouteFilter;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes12.dex */
public final class mus implements pus {
    public final /* synthetic */ GasStationsFiltersModalView a;

    public mus(GasStationsFiltersModalView gasStationsFiltersModalView) {
        this.a = gasStationsFiltersModalView;
    }

    @Override // defpackage.pus
    public final void d(Drawable drawable) {
        cvs binding;
        int i = v2h0.bg_top_round;
        GasStationsFiltersModalView gasStationsFiltersModalView = this.a;
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, vng.t(i, gasStationsFiltersModalView.getContext())});
        binding = gasStationsFiltersModalView.getBinding();
        cvw.e0(binding.g, layerDrawable, null, Integer.valueOf(tje.u(8, gasStationsFiltersModalView.getContext())), 10);
    }

    public final void h() {
        cvs binding;
        GasStationsFiltersModalView gasStationsFiltersModalView = this.a;
        binding = gasStationsFiltersModalView.getBinding();
        GoLinearLayout goLinearLayout = binding.d;
        CardDivider cardDivider = new CardDivider(gasStationsFiltersModalView.getContext(), null, 0, 6, null);
        cardDivider.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        cardDivider.setType(CardDivider.Type.BOTH);
        cardDivider.setFocusable(false);
        goLinearLayout.addView(cardDivider);
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        cvs binding;
        SearchOnlyAlongRouteFilter searchOnlyOnTheRouteFilters;
        SearchOnlyAlongRouteFilter searchOnlyOnTheRouteFilters2;
        cvs binding2;
        SearchOnlyAlongRouteFilter searchOnlyOnTheRouteFilters3;
        cvs binding3;
        cvs binding4;
        cvs binding5;
        bvs bvsVar = (bvs) obj;
        if (!(bvsVar instanceof zus)) {
            if (jl40.l(bvsVar, avs.a)) {
                return;
            }
            w511.b();
            return;
        }
        zus zusVar = (zus) bvsVar;
        GasStationsFiltersModalView gasStationsFiltersModalView = this.a;
        binding = gasStationsFiltersModalView.getBinding();
        binding.d.removeAllViews();
        boolean z = zusVar.d;
        boolean z2 = zusVar.e;
        searchOnlyOnTheRouteFilters = gasStationsFiltersModalView.getSearchOnlyOnTheRouteFilters();
        searchOnlyOnTheRouteFilters.render(z, z2);
        searchOnlyOnTheRouteFilters2 = gasStationsFiltersModalView.getSearchOnlyOnTheRouteFilters();
        searchOnlyOnTheRouteFilters2.setDebounceClickListener(new zo1(gasStationsFiltersModalView, z, 9));
        binding2 = gasStationsFiltersModalView.getBinding();
        GoLinearLayout goLinearLayout = binding2.d;
        searchOnlyOnTheRouteFilters3 = gasStationsFiltersModalView.getSearchOnlyOnTheRouteFilters();
        goLinearLayout.addView(searchOnlyOnTheRouteFilters3);
        h();
        gasStationsFiltersModalView.renderServices(zusVar.a, zusVar.f, zusVar.g);
        h();
        gasStationsFiltersModalView.renderServicesWithFilters(zusVar.b);
        binding3 = gasStationsFiltersModalView.getBinding();
        ButtonComponent buttonComponent = binding3.b;
        boolean z3 = zusVar.c;
        buttonComponent.setVisibility(z3 ? 0 : 8);
        binding4 = gasStationsFiltersModalView.getBinding();
        binding4.c.setText(!z3 ? kyh0.common_done : kyh0.navigator_gas_stations_filters_show_result_title);
        binding5 = gasStationsFiltersModalView.getBinding();
        binding5.c.setDebounceClickListener(new qpo(18, zusVar, gasStationsFiltersModalView));
        OneShotPreDrawListener.add(gasStationsFiltersModalView, new i8m(16, gasStationsFiltersModalView));
    }
}
