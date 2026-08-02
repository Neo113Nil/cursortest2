package xsna;

import com.vk.api.base.VkPaginationList;
import com.vk.dto.geo.GeoLocation;
import com.vk.lists.ListDataSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class p3m0 implements izs {
    public final /* synthetic */ r3m0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ p3m0(r3m0 r3m0Var, boolean z) {
        this.b = r3m0Var;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        VkPaginationList vkPaginationList = (VkPaginationList) obj;
        r3m0 r3m0Var = this.b;
        ListDataSet<zif0> listDataSet = r3m0Var.f;
        if (this.c) {
            listDataSet.B(1, listDataSet.d.size() - 1);
        }
        if (listDataSet.d.size() == 0) {
            listDataSet.s(new y3m0());
        }
        if (r3m0Var.c == null && r3m0Var.e.length() == 0 && !r3m0Var.d) {
            m3m0 m3m0Var = new m3m0();
            if (listDataSet.d.size() <= 1) {
                listDataSet.s(m3m0Var);
            } else {
                listDataSet.A(1);
                listDataSet.x(1, m3m0Var);
            }
        }
        com.vk.lists.c cVar = r3m0Var.g;
        int i = vkPaginationList.c;
        List<T> list = vkPaginationList.b;
        cVar.l(i);
        List<T> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new v3m0((GeoLocation) it.next()));
        }
        listDataSet.n0(arrayList);
        if (r3m0Var.e.length() > 0 && list.isEmpty()) {
            listDataSet.s(new k3m0());
        }
        return s3q0.a;
    }
}
