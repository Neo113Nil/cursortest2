package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.x0;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.component.IntercityDashboardTariffView;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes14.dex */
public final class hkw extends dvy0 {
    public final pav c;
    public final k7x0 w;
    public final xen x;
    public List y = EmptyList.a;

    public hkw(pav pavVar, k7x0 k7x0Var, xen xenVar) {
        this.c = pavVar;
        this.w = k7x0Var;
        this.x = xenVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.y.size();
    }

    @Override // defpackage.dvy0, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(alw alwVar, int i) {
        super.onBindViewHolder(alwVar, i);
        pkw pkwVar = (pkw) this.y.get(i);
        IntercityDashboardTariffView intercityDashboardTariffView = alwVar.O;
        alwVar.W(intercityDashboardTariffView.getUnselectedTariffIconView(), pkwVar.d ? pkwVar.e.d : pkwVar.g.d);
        alwVar.W(intercityDashboardTariffView.getSelectedTariffIconView(), pkwVar.f.d);
        intercityDashboardTariffView.render(pkwVar);
        if (pkwVar.c || !pkwVar.d) {
            intercityDashboardTariffView.setOnClickListener(null);
        } else {
            c.z(new mqu(14, alwVar, pkwVar), intercityDashboardTariffView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(tkh0.intercity_dashboard_tariff_view_for_scroll, viewGroup, false);
        if (inflate == null) {
            ny61.t("rootView");
            return null;
        }
        return new alw((IntercityDashboardTariffView) inflate, this.c, this.w, this.x);
    }
}
