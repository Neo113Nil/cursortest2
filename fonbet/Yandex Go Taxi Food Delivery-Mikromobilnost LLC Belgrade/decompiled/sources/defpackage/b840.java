package defpackage;

import com.yandex.go.masstransit.sdk.order.impl.tickets.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class b840 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ b840(g gVar, int i) {
        this.a = i;
        this.b = gVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        ArrayList arrayList = null;
        g gVar = this.b;
        switch (i) {
            case 0:
                at20 at20Var = gVar.K;
                xl10 xl10Var = (xl10) at20Var.a;
                v740 v740Var = ((w740) at20Var.b).a;
                String str = v740Var.a;
                String str2 = v740Var.c;
                List list = v740Var.b;
                if (list.isEmpty()) {
                    list = null;
                }
                pj pjVar = (pj) xl10Var.a;
                if (list != null) {
                    List list2 = list;
                    arrayList = new ArrayList(tcc.n(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(xl10.f((r640) it.next()));
                    }
                }
                pjVar.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("order_id", str);
                if (str2 != null) {
                    hashMap.put("request_id", str2);
                }
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((v510) it2.next()).c);
                    }
                    hashMap.put("activation_type_list", arrayList2);
                }
                pjVar.a.a("MasstransitTickets.Order.FirstLoaded", hashMap, 1, new HashMap());
                break;
            default:
                at20 at20Var2 = gVar.K;
                xl10 xl10Var2 = (xl10) at20Var2.a;
                v740 v740Var2 = ((w740) at20Var2.b).a;
                String str3 = v740Var2.a;
                String str4 = v740Var2.c;
                List list3 = v740Var2.b;
                if (list3.isEmpty()) {
                    list3 = null;
                }
                pj pjVar2 = (pj) xl10Var2.a;
                if (list3 != null) {
                    List list4 = list3;
                    arrayList = new ArrayList(tcc.n(list4, 10));
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(xl10.f((r640) it3.next()));
                    }
                }
                pjVar2.getClass();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("order_id", str3);
                if (str4 != null) {
                    hashMap2.put("request_id", str4);
                }
                if (arrayList != null) {
                    ArrayList arrayList3 = new ArrayList(tcc.n(arrayList, 10));
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(((v510) it4.next()).c);
                    }
                    hashMap2.put("activation_type_list", arrayList3);
                }
                pjVar2.a.a("MasstransitTickets.Order.Error", hashMap2, 2, new HashMap());
                break;
        }
        return zy11Var;
    }
}
