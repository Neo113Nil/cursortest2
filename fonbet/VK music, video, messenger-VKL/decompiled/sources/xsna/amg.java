package xsna;

import android.view.View;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionResetSearchFilter;
import com.vk.catalog2.common.ui.holders.search.FiltersWithSearchResultVh;
import com.vk.dto.profile.Address;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class amg implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ amg(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((bmg) obj2).l.invoke((wpe0) obj);
                break;
            case 1:
                ((tch) obj2).h.invoke((Address) obj, Boolean.FALSE);
                break;
            case 2:
                FiltersWithSearchResultVh filtersWithSearchResultVh = (FiltersWithSearchResultVh) obj;
                com.vk.catalog2.common.ui.holders.search.b bVar = com.vk.catalog2.common.ui.holders.search.b.a;
                com.vk.catalog2.common.ui.holders.search.b.c(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.RESET_FILTERS, ((UIBlockActionResetSearchFilter) ((UIBlockAction) obj2)).A);
                filtersWithSearchResultVh.a();
                filtersWithSearchResultVh.b.q7("reset", null, filtersWithSearchResultVh.e);
                break;
            default:
                vw4 vw4Var = (vw4) obj;
                kzp0 kzp0Var = ((mf10) obj2).m;
                if (kzp0Var != null) {
                    vw4Var.invoke(kzp0Var);
                    break;
                }
                break;
        }
    }
}
