package xsna;

import com.vk.dto.stories.model.LiveFinishedStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.lists.ListDataSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: StoriesUtilImpl.kt */
/* loaded from: classes6.dex */
public final class yvl0 implements wvl0 {
    public final bsl0 b;
    public final lrl0 c;

    public yvl0(bsl0 bsl0Var, lrl0 lrl0Var) {
        this.b = bsl0Var;
        this.c = lrl0Var;
    }

    @Override // xsna.wvl0
    public final int a(StoriesContainer storiesContainer, int i) {
        int size = storiesContainer.g.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (storiesContainer.g.get(i2).c == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // xsna.wvl0
    public final ArrayList<StoriesContainer> b(List<? extends StoriesContainer> list) {
        if (list == null) {
            list = EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((StoriesContainer) obj).Cb()) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            list = arrayList;
        }
        return p4g.q(list);
    }

    @Override // xsna.wvl0
    public final ArrayList<StoriesContainer> c(List<? extends StoriesContainer> list) {
        if (list == null) {
            list = EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((StoriesContainer) obj).Eb()) {
                arrayList.add(obj);
            }
        }
        return p4g.q(arrayList);
    }

    @Override // xsna.wvl0
    public final void d() {
        itg0.i(4, this.c.d().U(new pi40(new xvl0(this, 0), 11)), null, new rxz(this, 29), new pf40(this, 25));
    }

    @Override // xsna.wvl0
    public final StoriesContainer e(String str, List list) {
        int i;
        Iterator it = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            StoriesContainer storiesContainer = (StoriesContainer) it.next();
            if (epx.f(storiesContainer.Ob(), str)) {
                break;
            }
            if (storiesContainer.j) {
                bpn0 bpn0Var = cqm0.a;
                try {
                    i = Integer.parseInt(str);
                } catch (Throwable unused) {
                    i = 0;
                }
                if (a(storiesContainer, i) != -1) {
                    break;
                }
            }
            i2++;
        }
        return (StoriesContainer) j5g.b0(i2, list);
    }

    @Override // xsna.wvl0
    public final ArrayList f(StoriesContainer storiesContainer, ListDataSet.ArrayListImpl arrayListImpl) {
        return fsk.A(storiesContainer) ? c(arrayListImpl) : storiesContainer instanceof LiveFinishedStoriesContainer ? c(arrayListImpl) : storiesContainer.Cb() ? b(arrayListImpl) : c(arrayListImpl);
    }
}
