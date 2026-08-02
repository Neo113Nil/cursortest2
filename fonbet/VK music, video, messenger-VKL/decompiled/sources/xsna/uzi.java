package xsna;

import com.vk.ecomm.configureitemlist.api.model.ConfigureItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.izi;
import xsna.tzi;
import xsna.zzi;

/* compiled from: ConfigureItemListFeature.kt */
/* loaded from: classes18.dex */
public final class uzi extends wk50<e0j, d0j, izi, zzi> {
    public final f4z f;

    public uzi(List<ConfigureItem> list, a0j a0jVar) {
        super(new izi.a(list), a0jVar);
        this.f = new f4z();
    }

    @Override // xsna.wk50
    public final void N(d0j d0jVar, izi iziVar) {
        d0j d0jVar2 = d0jVar;
        izi iziVar2 = iziVar;
        List<yzi> list = d0jVar2.c;
        if (iziVar2 instanceof izi.a) {
            List<ConfigureItem> list2 = ((izi.a) iziVar2).b;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new yzi((ConfigureItem) it.next(), false));
            }
            T(new zzi.a(arrayList));
            return;
        }
        boolean z = iziVar2 instanceof izi.b;
        f4z f4zVar = this.f;
        if (z) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (!((yzi) obj).b) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((yzi) it2.next()).a);
            }
            if (arrayList3.size() >= d0jVar2.b) {
                f4zVar.b(tzi.a.a);
                return;
            } else {
                f4zVar.b(new tzi.b(arrayList3));
                return;
            }
        }
        if (iziVar2 instanceof izi.c) {
            izi.c cVar = (izi.c) iziVar2;
            List<yzi> list3 = list;
            ArrayList arrayList4 = new ArrayList(c5g.u(list3, 10));
            for (yzi yziVar : list3) {
                ConfigureItem configureItem = yziVar.a;
                boolean z2 = yziVar.b;
                arrayList4.add(configureItem.b.b == cVar.b ? new yzi(configureItem, !z2) : new yzi(configureItem, z2));
            }
            T(new zzi.a(arrayList4));
            return;
        }
        if (!(iziVar2 instanceof izi.d)) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : list) {
            if (!((yzi) obj2).b) {
                arrayList5.add(obj2);
            }
        }
        ArrayList arrayList6 = new ArrayList(c5g.u(arrayList5, 10));
        Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            arrayList6.add(((yzi) it3.next()).a);
        }
        f4zVar.b(new tzi.c(arrayList6));
    }

    public final wj50<tzi> U() {
        return this.f;
    }
}
