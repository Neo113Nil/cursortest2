package xsna;

import android.view.View;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSearchFilter;
import com.vk.catalog2.common.ui.holders.search.FiltersWithSearchResultVh;
import com.vk.dto.profile.Address;
import com.vk.profile.questions.impl.d;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$TypeQuestionItem;
import xsna.ec40;
import xsna.m5u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class sch implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sch(int i, Object obj, Object obj2) {
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
                ((tch) obj2).h.invoke((Address) obj, Boolean.TRUE);
                break;
            case 1:
                com.vk.catalog2.common.ui.holders.search.b bVar = com.vk.catalog2.common.ui.holders.search.b.a;
                com.vk.catalog2.common.ui.holders.search.b.c(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_FILTERS, ((UIBlockActionOpenSearchFilter) ((UIBlockAction) obj2)).A);
                ((FiltersWithSearchResultVh) obj).d.invoke();
                break;
            case 2:
                ((mns) obj2).m.a(new bos(((ens) obj).b));
                break;
            case 3:
                sop sopVar = (sop) obj2;
                o6u o6uVar = ((q6u) obj).w;
                if (o6uVar == null) {
                    o6uVar = null;
                }
                sopVar.invoke(new m5u.p(o6uVar.b, -1));
                break;
            case 4:
                p830 p830Var = (p830) obj2;
                p830Var.l.performHapticFeedback(0);
                ((whe) obj).invoke(Integer.valueOf(p830Var.getLayoutPosition()));
                break;
            case 5:
                ((ec40.a) obj2).b((ec40) obj);
                break;
            default:
                d.a aVar = (d.a) obj;
                ((com.vk.profile.questions.impl.i) obj2).l.d(aVar);
                iqe0.a(aVar, SchemeStat$TypeQuestionItem.Type.DELETE_ALL_QUESTIONS);
                break;
        }
    }
}
