package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.navigator.gas_stations.filters.GasStationsFiltersListModalView;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class eus implements hus {
    public final /* synthetic */ GasStationsFiltersListModalView a;

    public eus(GasStationsFiltersListModalView gasStationsFiltersListModalView) {
        this.a = gasStationsFiltersListModalView;
    }

    @Override // defpackage.hus
    public final void d(Drawable drawable) {
        yus binding;
        int i = v2h0.bg_top_round;
        GasStationsFiltersListModalView gasStationsFiltersListModalView = this.a;
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, vng.t(i, gasStationsFiltersListModalView.getContext())});
        binding = gasStationsFiltersListModalView.getBinding();
        cvw.e0(binding.f, layerDrawable, null, Integer.valueOf(tje.u(8, gasStationsFiltersListModalView.getContext())), 10);
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        bys bysVar;
        lus lusVar = (lus) obj;
        GasStationsFiltersListModalView gasStationsFiltersListModalView = this.a;
        bysVar = gasStationsFiltersListModalView.adapter;
        ArrayList arrayList = lusVar.b;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new cus(lusVar.a, (wts) it.next()));
        }
        bysVar.submitList(arrayList2, null);
        OneShotPreDrawListener.add(gasStationsFiltersListModalView, new i8m(15, gasStationsFiltersListModalView));
    }
}
