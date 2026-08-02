package xsna;

import com.vk.dto.search.SearchQuickInnerFilterItem;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.rju0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class tdr implements rju0.a, yads.vq2 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tdr(Object obj, Object obj2, Object obj3) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // yads.vq2
    public void a(Object obj) {
        yads.qf1.a((yads.qf1) this.b, (String) this.c, (izs) this.d, (String) obj);
    }

    @Override // xsna.rju0.a
    public void b(boolean z) {
        Object obj;
        udr udrVar = (udr) this.b;
        SearchQuickInnerFilterItem searchQuickInnerFilterItem = (SearchQuickInnerFilterItem) this.c;
        rju0 rju0Var = (rju0) this.d;
        int i = udrVar.c;
        ArrayList arrayList = udrVar.b;
        int i2 = 0;
        int i3 = -1;
        if (i != -1 && ((rju0) arrayList.get(i)).t.isChecked()) {
            ((rju0) arrayList.get(udrVar.c)).setChecked(false);
            udrVar.c = -1;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (epx.f(((rju0) it.next()).getTitle(), rju0Var.getTitle())) {
                i3 = i2;
                break;
            }
            i2++;
        }
        ((rju0) arrayList.get(i3)).setChecked(z);
        udrVar.c = i3;
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it2.next();
                if (((rju0) obj).t.isChecked()) {
                    break;
                }
            }
        }
        if (obj == null) {
            ((rju0) arrayList.get(i3)).setChecked(true);
        }
        com.vk.catalog2.common.ui.holders.search.b bVar = com.vk.catalog2.common.ui.holders.search.b.a;
        com.vk.catalog2.common.ui.holders.search.b.c(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.TAP, searchQuickInnerFilterItem.d);
    }
}
