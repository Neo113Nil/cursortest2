package xsna;

import com.vk.ecomm.categories.api.MarketBridgeCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.ev00;
import xsna.lv00;
import xsna.nv00;

/* compiled from: MarketCategoriesFilterFeature.kt */
/* loaded from: classes18.dex */
public final class mv00 extends wk50<sv00, rv00, ev00, nv00> {
    public final MarketBridgeCategory f;
    public final ArrayList g;
    public final f4z h;

    public mv00(List<MarketBridgeCategory> list, MarketBridgeCategory marketBridgeCategory, ev00 ev00Var, qv00 qv00Var) {
        super(ev00Var, qv00Var);
        this.f = marketBridgeCategory;
        List<MarketBridgeCategory> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(V((MarketBridgeCategory) it.next(), 0));
        }
        this.g = arrayList;
        this.h = new f4z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object] */
    @Override // xsna.wk50
    public final void N(rv00 rv00Var, ev00 ev00Var) {
        Object obj;
        MarketBridgeCategory marketBridgeCategory;
        MarketBridgeCategory marketBridgeCategory2;
        rv00 rv00Var2 = rv00Var;
        ev00 ev00Var2 = ev00Var;
        List<vv00> list = rv00Var2.b;
        boolean z = ev00Var2 instanceof ev00.b;
        MarketBridgeCategory marketBridgeCategory3 = this.f;
        MarketBridgeCategory marketBridgeCategory4 = null;
        vv00 vv00Var = null;
        if (z) {
            if (marketBridgeCategory3 != null && marketBridgeCategory3.g == null) {
                Iterator it = marketBridgeCategory3.e.iterator();
                while (true) {
                    if (it.hasNext()) {
                        marketBridgeCategory2 = it.next();
                        if (((MarketBridgeCategory) marketBridgeCategory2).b == marketBridgeCategory3.b) {
                            break;
                        }
                    } else {
                        marketBridgeCategory2 = 0;
                        break;
                    }
                }
                marketBridgeCategory3 = marketBridgeCategory2;
            }
            if (marketBridgeCategory3 != null) {
                MarketBridgeCategory marketBridgeCategory5 = marketBridgeCategory3;
                int i = 0;
                while (true) {
                    if ((marketBridgeCategory5 != null ? marketBridgeCategory5.g : null) == null) {
                        break;
                    }
                    marketBridgeCategory5 = marketBridgeCategory5.g;
                    i++;
                }
                vv00Var = V(marketBridgeCategory3, i - 1);
            }
            if (vv00Var != null) {
                T(new nv00.a(vv00Var, true));
            }
            C(ev00.d.b);
            return;
        }
        if (!(ev00Var2 instanceof ev00.d)) {
            if (ev00Var2 instanceof ev00.c) {
                vv00 vv00Var2 = ((ev00.c) ev00Var2).b;
                T(new nv00.a(vv00Var2, marketBridgeCategory3 != null && vv00Var2.h.b == marketBridgeCategory3.b));
                C(ev00.d.b);
                return;
            }
            if (!(ev00Var2 instanceof ev00.a)) {
                throw new NoWhenBranchMatchedException();
            }
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (((vv00) obj).f) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            vv00 vv00Var3 = (vv00) obj;
            if (vv00Var3 == null || (marketBridgeCategory = vv00Var3.h) == null) {
                vv00 vv00Var4 = (vv00) j5g.a0(list);
                if (vv00Var4 != null) {
                    marketBridgeCategory4 = vv00Var4.h;
                }
            } else {
                marketBridgeCategory4 = marketBridgeCategory;
            }
            this.h.b(new lv00.a(marketBridgeCategory4));
            return;
        }
        vv00 vv00Var5 = rv00Var2.c;
        ArrayList arrayList = this.g;
        if (vv00Var5 != null) {
            LinkedList linkedList = new LinkedList();
            MarketBridgeCategory marketBridgeCategory6 = vv00Var5.h;
            for (int i2 = vv00Var5.e; marketBridgeCategory6 != null && i2 >= 0; i2--) {
                linkedList.push(V(marketBridgeCategory6, i2));
                marketBridgeCategory6 = marketBridgeCategory6.g;
            }
            vv00 vv00Var6 = (vv00) j5g.k0(linkedList);
            if (vv00Var6 != null) {
                MarketBridgeCategory marketBridgeCategory7 = vv00Var6.h;
                if (marketBridgeCategory7.e.isEmpty()) {
                    linkedList.removeLast();
                    vv00 vv00Var7 = (vv00) j5g.k0(linkedList);
                    if (vv00Var7 != null) {
                        linkedList.addAll(U(vv00Var7.h, vv00Var7.e + 1));
                    }
                } else {
                    linkedList.addAll(U(marketBridgeCategory7, vv00Var6.e + 1));
                }
            }
            vv00 vv00Var8 = (vv00) linkedList.peek();
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                vv00 vv00Var9 = (vv00) it3.next();
                if (vv00Var8 == null || vv00Var9.b != vv00Var8.b) {
                    arrayList2.add(vv00Var9);
                } else {
                    arrayList2.addAll(linkedList);
                }
            }
            arrayList = new ArrayList(c5g.u(arrayList2, 10));
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                vv00 vv00Var10 = (vv00) it4.next();
                int i3 = vv00Var10.b;
                arrayList.add(new vv00(i3, vv00Var10.c, vv00Var10.d, vv00Var10.e, i3 == vv00Var5.b, vv00Var10.g, vv00Var10.h));
            }
        }
        T(new nv00.b(arrayList));
    }

    public final ArrayList U(MarketBridgeCategory marketBridgeCategory, int i) {
        List<MarketBridgeCategory> list = marketBridgeCategory.e;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(V((MarketBridgeCategory) it.next(), i));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((vv00) next).b != marketBridgeCategory.b) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public final vv00 V(MarketBridgeCategory marketBridgeCategory, int i) {
        return new vv00(marketBridgeCategory.b, marketBridgeCategory.c, marketBridgeCategory.d, i, false, new r3h(this, 22), marketBridgeCategory);
    }
}
