package defpackage;

import android.view.View;
import java.util.List;
import ru.yandex.taxi.delivery.ui.setuprequierements.DeliverySetupRequirementsModalView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;

/* loaded from: classes5.dex */
public final class kpi implements lpi {
    public final /* synthetic */ DeliverySetupRequirementsModalView a;

    public kpi(DeliverySetupRequirementsModalView deliverySetupRequirementsModalView) {
        this.a = deliverySetupRequirementsModalView;
    }

    @Override // defpackage.lpi
    public final void Pe(List list) {
        ipi ipiVar;
        ipiVar = this.a.adapter;
        if (ipiVar.c.size() == list.size()) {
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                hpi hpiVar = (hpi) obj;
                View v = uh6.v(ipiVar.a, i);
                if ((hpiVar instanceof fpi) && (v instanceof ListItemSwitchComponent)) {
                    ipiVar.b((ListItemSwitchComponent) v, (fpi) hpiVar, true);
                } else {
                    if (!(hpiVar instanceof gpi) || !(v instanceof ListItemComponent)) {
                        ipiVar.a(list);
                        break;
                    }
                    ListItemComponent listItemComponent = (ListItemComponent) v;
                    gpi gpiVar = (gpi) hpiVar;
                    listItemComponent.setTitle(gpiVar.a);
                    listItemComponent.setSubtitle(gpiVar.b);
                    listItemComponent.setTrailImage(dzg0.chevron_next);
                    listItemComponent.setDebounceClickListener(new zvg(21, ipiVar, gpiVar));
                }
                i = i2;
            }
        } else {
            ipiVar.a(list);
        }
        ipiVar.c = list;
    }
}
