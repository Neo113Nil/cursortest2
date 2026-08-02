package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: CatalogExtensions.kt */
/* loaded from: classes16.dex */
public final class k5a {
    public static final List<tca> a(RecyclerView recyclerView) {
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return EmptyList.b;
        }
        k9x k9xVar = new k9x(linearLayoutManager.v(), linearLayoutManager.x(), 1);
        ArrayList arrayList = new ArrayList();
        j9x it = k9xVar.iterator();
        while (it.d) {
            RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(it.nextInt());
            tca tcaVar = findViewHolderForAdapterPosition instanceof tca ? (tca) findViewHolderForAdapterPosition : null;
            if (tcaVar != null) {
                arrayList.add(tcaVar);
            }
        }
        return arrayList;
    }

    public static final boolean b(UIBlock uIBlock, izs<? super UIBlock, Boolean> izsVar) {
        if (!(uIBlock instanceof UIBlockList)) {
            return izsVar.invoke(uIBlock).booleanValue();
        }
        if (izsVar.invoke(uIBlock).booleanValue()) {
            return true;
        }
        ArrayList<UIBlock> arrayList = ((UIBlockList) uIBlock).y;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            if (b((UIBlock) it.next(), izsVar)) {
                return true;
            }
        }
        return false;
    }

    public static final ArrayList c(UIBlockList uIBlockList, ma maVar) {
        ArrayList arrayList = new ArrayList();
        for (UIBlock uIBlock : uIBlockList.y) {
            if (uIBlock instanceof UIBlockList) {
                arrayList.addAll(c((UIBlockList) uIBlock, maVar));
            } else if (((Boolean) maVar.invoke(uIBlock)).booleanValue()) {
                arrayList.add(uIBlock);
            }
        }
        return arrayList;
    }

    public static final void d(String str, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CatalogFilterData catalogFilterData = (CatalogFilterData) it.next();
            arrayList2.add(CatalogFilterData.zb(catalogFilterData, null, null, epx.f(catalogFilterData.b, str), 503));
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
    }
}
