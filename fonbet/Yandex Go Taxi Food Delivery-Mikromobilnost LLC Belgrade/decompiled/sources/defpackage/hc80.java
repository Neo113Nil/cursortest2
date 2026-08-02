package defpackage;

import com.yandex.go.superapp.order.multi.old.OrdersListAnalytics$ListCloseReason;
import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class hc80 {
    public final lx4 a;
    public final yxe0 b;
    public final the c;
    public final uy70 d;
    public final gc80 e;
    public Boolean f;
    public boolean g;
    public int h;
    public boolean i;
    public ArrayList j;

    public hc80(lx4 lx4Var, yxe0 yxe0Var, the theVar, uy70 uy70Var, n17 n17Var, gc80 gc80Var) {
        this.a = lx4Var;
        this.b = yxe0Var;
        this.c = theVar;
        this.d = uy70Var;
        this.e = gc80Var;
    }

    public final ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d380 a = this.e.a((w201) it.next());
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    public final void b(DetailsOpenReason detailsOpenReason, DriveState driveState) {
        if (detailsOpenReason == null) {
            return;
        }
        String d = cta1.d(driveState);
        String str = detailsOpenReason.alias;
        the theVar = this.c;
        theVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("element_state", "card");
        if (str != null) {
            hashMap.put("open_reason", str);
        }
        theVar.a.a("ContentTaxi.Shown", hashMap, 1, tse0.r("order_status", hashMap, d));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i, boolean z) {
        String str;
        this.g = i == 3 || i == 7;
        if (this.h == i) {
            return;
        }
        if (i != 3) {
            if (i == 4) {
                str = "collapsed";
            } else if (i == 6) {
                str = "default";
            } else if (i != 7) {
                str = "";
            }
            if (str.length() <= 0) {
                i d = ((j) this.a).d(z ? "PreviewOrderList.MovedToState" : "PreviewOrderList.AutoMovedToState");
                d.a.put(ClidProvider.STATE, str);
                d.m();
                this.h = i;
                return;
            }
            return;
        }
        str = "fullscreen";
        if (str.length() <= 0) {
        }
    }

    public final void d(OrdersListAnalytics$ListCloseReason ordersListAnalytics$ListCloseReason) {
        String str;
        this.i = false;
        String alias = ordersListAnalytics$ListCloseReason.getAlias();
        String alias2 = this.d.a.getAlias();
        ArrayList arrayList = this.j;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((d380) it.next()).e());
            }
            str = arrayList2.toString();
        } else {
            str = null;
        }
        yxe0 yxe0Var = this.b;
        yxe0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("element_state", "list_preview_card");
        if (alias != null) {
            hashMap.put("close_reason", alias);
        }
        if (alias2 != null) {
            hashMap.put("open_reason", alias2);
        }
        if (str != null) {
            hashMap.put(ClidProvider.STATE, str);
        }
        yxe0Var.a.a("PreviewOrderList.Closed", hashMap, 1, new HashMap());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.j;
        if (arrayList2 != null) {
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            if (arrayList2 != null) {
                ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((d380) it.next()).e());
                }
                arrayList = arrayList3;
                yxe0.a(this.b, null, arrayList != null ? this.d.a.getAlias() : null, arrayList, null, 18);
            }
        }
        arrayList = null;
        if (arrayList != null) {
        }
        yxe0.a(this.b, null, arrayList != null ? this.d.a.getAlias() : null, arrayList, null, 18);
    }
}
