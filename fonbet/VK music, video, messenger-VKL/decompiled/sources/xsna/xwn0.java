package xsna;

import com.vk.api.generated.tabbar.dto.TabbarItemSuggestDto;
import com.vk.tabbar.core.api.domain.TabbarItem;
import com.vk.tabbar.core.api.domain.TabbarState;
import com.vk.tabbar.core.api.domain.TabbarSuggest;
import com.vk.tabbar.core.api.domain.TabbarSuggestState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: TabbarSuggestInteractorImpl.kt */
/* loaded from: classes6.dex */
public final class xwn0 implements wwn0 {
    public final k820 a;

    public xwn0(k820 k820Var) {
        this.a = k820Var;
    }

    @Override // xsna.wwn0
    public final d3n0 a(int i, TabbarState tabbarState) {
        Object obj;
        k820 k820Var;
        if (tabbarState != null) {
            List<TabbarItem> d = tabbarState.d();
            Iterator<T> it = tabbarState.d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((TabbarItem) obj).b != null) {
                    break;
                }
            }
            TabbarItem tabbarItem = (TabbarItem) obj;
            TabbarSuggest tabbarSuggest = tabbarItem != null ? tabbarItem.b : null;
            TabbarItem tabbarItem2 = tabbarSuggest != null ? tabbarSuggest.d : null;
            if (tabbarItem != null && tabbarSuggest != null && tabbarItem2 != null) {
                String str = tabbarSuggest.c;
                TabbarSuggestState tabbarSuggestState = tabbarSuggest.b.equals(TabbarItemSuggestDto.TypeDto.ADD.i()) ? TabbarSuggestState.ADD : TabbarSuggestState.REMOVE;
                List<TabbarItem> d2 = tabbarState.d();
                TabbarItem tabbarItem3 = tabbarItem2;
                ArrayList arrayList = new ArrayList(c5g.u(d2, 10));
                for (TabbarItem tabbarItem4 : d2) {
                    if (tabbarItem.equals(tabbarItem4)) {
                        tabbarItem4 = tabbarItem3;
                    }
                    arrayList.add(tabbarItem4);
                }
                List<TabbarItem> d3 = tabbarState.d();
                ArrayList arrayList2 = new ArrayList(c5g.u(d3, 10));
                for (TabbarItem tabbarItem5 : d3) {
                    if (tabbarItem.equals(tabbarItem5) && tabbarSuggestState == TabbarSuggestState.ADD) {
                        tabbarItem5 = tabbarItem3;
                    }
                    arrayList2.add(tabbarItem5);
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    k820Var = this.a;
                    if (!hasNext) {
                        break;
                    }
                    Integer e = k820Var.e(((TabbarItem) it2.next()).d());
                    if (e != null) {
                        arrayList3.add(e);
                    }
                }
                String d4 = tabbarSuggestState == TabbarSuggestState.ADD ? tabbarItem3.d() : tabbarItem.d();
                Integer e2 = k820Var.e(d4);
                if (e2 != null) {
                    int intValue = e2.intValue();
                    int indexOf = arrayList3.indexOf(e2);
                    int f = k820Var.f(intValue);
                    ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(Integer.valueOf(k820Var.c(((Number) it3.next()).intValue())));
                    }
                    return new d3n0(tabbarSuggestState, arrayList, d, i, indexOf, f, d4, str, arrayList4);
                }
            }
        }
        return null;
    }

    @Override // xsna.wwn0
    public final void b() {
        dz2 x = yfb.x(new tfx("tabbar.markSuggestAsShown", new thl0(4), new qjk0(5)));
        x.q = 1;
        itg0.n(rsg0.W(x, 7));
    }
}
