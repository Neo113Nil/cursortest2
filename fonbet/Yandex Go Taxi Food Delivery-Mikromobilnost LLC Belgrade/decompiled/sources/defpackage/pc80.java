package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.superapp.order.multi.old.h;
import com.yandex.go.superapp.order.multi.old.view.OrdersListViewImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes14.dex */
public final class pc80 extends RecyclerView.g {
    public final /* synthetic */ OrdersListViewImpl a;

    public pc80(OrdersListViewImpl ordersListViewImpl) {
        this.a = ordersListViewImpl;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        h hVar;
        hVar = this.a.presenter;
        hc80 hc80Var = hVar.A;
        List list = (List) hVar.B.u.getValue();
        if (hc80Var.g) {
            boolean z = i2 > 0;
            Boolean bool = hc80Var.f;
            if (bool == null || !bool.equals(Boolean.valueOf(z))) {
                ArrayList a = hc80Var.a(list);
                String str = z ? "up" : "down";
                yxe0 yxe0Var = hc80Var.b;
                String alias = hc80Var.d.a.getAlias();
                ArrayList arrayList = new ArrayList(tcc.n(a, 10));
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    arrayList.add(((d380) it.next()).e());
                }
                String obj = arrayList.toString();
                yxe0Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("element_state", "list_preview_card");
                hashMap.put("scroll_direction", str);
                if (alias != null) {
                    hashMap.put("open_reason", alias);
                }
                if (obj != null) {
                    hashMap.put(ClidProvider.STATE, obj);
                }
                yxe0Var.a.a("PreviewOrderList.Scrolled", hashMap, 1, new HashMap());
                hc80Var.f = Boolean.valueOf(z);
            }
        }
    }
}
