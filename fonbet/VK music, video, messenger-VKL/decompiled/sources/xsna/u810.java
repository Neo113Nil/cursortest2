package xsna;

import com.vk.ecomm.products_multipicker.api.model.MultipickerProduct;
import com.vk.ecomm.products_multipicker.api.model.MultipickerProductId;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.p810;
import xsna.q810;
import xsna.tlo0;

/* compiled from: MarketMultiPickerReducer.kt */
/* loaded from: classes18.dex */
public final class u810 extends dm50<c910, p810, y810> {
    public static q810 i(y810 y810Var) {
        Object obj;
        nlu nluVar;
        if (y810Var.p) {
            Iterator<T> it = y810Var.f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((glu) obj).e) {
                    break;
                }
            }
            glu gluVar = (glu) obj;
            if (gluVar != null && (nluVar = gluVar.g) != null) {
                boolean z = nluVar.a;
                boolean z2 = nluVar.b;
                boolean z3 = nluVar.c;
                q810 q810Var = !z2 ? q810.c.a : (z || !z3) ? (z || z3) ? null : q810.b.a : q810.a.a;
                if (q810Var != null) {
                    return q810Var;
                }
                if (y810Var.g.isEmpty()) {
                    return q810.c.a;
                }
            }
        }
        return null;
    }

    public static tlo0.f j(y810 y810Var) {
        tlo0.a aVar;
        int i;
        if (y810Var.y == 1) {
            aVar = tlo0.Companion;
            i = R.string.attach_multipicker_only_fave_goods_title;
        } else {
            aVar = tlo0.Companion;
            i = R.string.attach_multipicker_goods_title;
        }
        return tq.h(aVar, i);
    }

    public static ArrayList k(List list, y810 y810Var) {
        List<ha10> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (ha10 ha10Var : list2) {
            MultipickerProduct multipickerProduct = ha10Var.a;
            MultipickerProductId multipickerProductId = multipickerProduct.b;
            Set<MultipickerProduct> set = y810Var.e;
            boolean z = false;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((MultipickerProduct) it.next()).b.equals(ha10Var.a.b)) {
                        z = true;
                        break;
                    }
                }
            }
            arrayList.add(new g810(multipickerProductId, z, y810Var.E, multipickerProduct));
        }
        return arrayList;
    }

    @Override // xsna.dm50
    public final y810 c(y810 y810Var, p810 p810Var) {
        y810 y810Var2 = y810Var;
        p810 p810Var2 = p810Var;
        if (p810Var2 instanceof p810.f) {
            return y810.a(y810Var2, 0, true, null, null, null, null, 0, 0, null, false, false, null, null, false, null, null, false, null, null, 0, 16777213);
        }
        if (p810Var2 instanceof p810.k) {
            p810.k kVar = (p810.k) p810Var2;
            List<glu> list = kVar.b;
            int i = kVar.d;
            int i2 = kVar.e;
            List<ha10> list2 = kVar.c;
            List<ha10> list3 = kVar.f;
            Integer num = kVar.g;
            return y810.a(y810Var2, kVar.i, false, null, j5g.S0(kVar.h), list, list2, i, i2, null, false, false, null, null, true, list3, num, false, null, null, 0, 16662272);
        }
        if (p810Var2 instanceof p810.j) {
            return y810.a(y810Var2, 0, false, ((p810.j) p810Var2).b, null, null, null, 0, 0, null, false, false, null, null, false, null, null, false, null, null, 0, 16777209);
        }
        if (p810Var2 instanceof p810.s) {
            return y810.a(y810Var2, 0, false, null, ((p810.s) p810Var2).b, null, null, 0, 0, null, false, false, null, null, false, null, null, false, null, null, 0, 16777207);
        }
        if (p810Var2 instanceof p810.r) {
            return y810.a(y810Var2, 0, false, null, null, ((p810.r) p810Var2).b, null, 0, 0, null, false, false, null, null, false, null, null, false, null, null, 0, 16777199);
        }
        if (p810Var2 instanceof p810.g) {
            return y810.a(y810Var2, 0, false, null, null, null, null, 0, 0, null, true, false, null, null, false, null, null, false, null, null, 0, 16772095);
        }
        if (p810Var2 instanceof p810.q) {
            p810.q qVar = (p810.q) p810Var2;
            return y810.a(y810Var2, 0, false, null, null, null, qVar.c, qVar.d, qVar.b, null, false, false, null, null, true, null, null, false, null, null, 0, 16745247);
        }
        if (p810Var2 instanceof p810.o) {
            p810.o oVar = (p810.o) p810Var2;
            return y810.a(y810Var2, 0, false, null, null, null, null, 0, 0, null, false, false, null, null, false, oVar.b, oVar.c, false, null, null, 0, 12746751);
        }
        if (p810Var2 instanceof p810.p) {
            return y810.a(y810Var2, 0, false, null, null, null, null, 0, 0, null, false, false, ((p810.p) p810Var2).b, null, false, null, null, false, null, null, 0, 16772095);
        }
        if (p810Var2 instanceof p810.i) {
            return y810.a(y810Var2, 0, false, null, null, null, null, 0, 0, null, false, true, null, null, false, null, null, false, null, null, 0, 16766975);
        }
        if (p810Var2 instanceof p810.e) {
            return y810.a(y810Var2, 0, false, null, null, null, null, 0, 0, null, false, false, null, null, false, null, null, true, null, null, 0, 15204351);
        }
        if (p810Var2 instanceof p810.d) {
            return y810.a(y810Var2, 0, false, null, null, null, null, 0, 0, null, false, false, null, null, false, null, null, false, ((p810.d) p810Var2).b, null, 0, 15204351);
        }
        if (p810Var2 instanceof p810.h) {
            return y810.a(y810Var2, 0, false, null, null, null, null, 0, 0, null, false, false, null, ((p810.h) p810Var2).b, false, null, null, false, null, null, 0, 16766975);
        }
        if (p810Var2 instanceof p810.n) {
            p810.n nVar = (p810.n) p810Var2;
            if (epx.f(nVar, p810.n.a.b)) {
                return y810.a(y810Var2, 0, false, null, null, null, null, 0, 0, null, false, false, null, null, false, null, null, false, null, a910.a(y810Var2.x, null, null, 13), 0, 12582911);
            }
            if (nVar instanceof p810.n.b) {
                return y810.a(y810Var2, 0, false, null, null, null, null, 0, 0, null, false, false, null, null, false, null, null, false, null, a910.a(y810Var2.x, Long.valueOf(((p810.n.b) nVar).b), null, 11), 0, 12582911);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (p810Var2 instanceof p810.c) {
            p810.c cVar = (p810.c) p810Var2;
            return y810.a(y810Var2, 0, false, null, null, cVar.e, cVar.b, cVar.c, cVar.d, null, false, false, null, null, true, null, null, false, null, null, 0, 16760591);
        }
        if (p810Var2 instanceof p810.m) {
            return y810.a(y810Var2, 0, false, null, null, null, null, 0, 0, null, false, false, null, null, false, null, null, false, null, null, ((p810.m) p810Var2).b, 8388607);
        }
        if (p810Var2 instanceof p810.l) {
            return y810.a(y810Var2, 0, false, null, null, null, null, 0, 0, ((p810.l) p810Var2).b, false, false, null, null, false, null, null, false, null, null, 0, 16776703);
        }
        if (p810Var2 instanceof p810.b) {
            return y810.a(y810Var2, 0, false, null, null, null, null, 0, 0, "", false, false, null, null, false, null, null, false, null, null, 0, 16776703);
        }
        if (p810Var2.equals(p810.a.b)) {
            return y810.a(y810Var2, 0, false, null, null, null, EmptyList.b, 0, 0, null, false, false, null, null, false, null, null, false, null, null, 0, 16760799);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final c910 d() {
        fi50 e = e(new srg(this, 27));
        return new c910(e(new x90(29)), e, e(new vfk(this, 23)), e(new udo(this, 27)));
    }

    @Override // xsna.dm50
    public final void h(y810 y810Var, c910 c910Var) {
        y810 y810Var2 = y810Var;
        c910 c910Var2 = c910Var;
        if (y810Var2.c) {
            f(c910Var2.a, y810Var2);
        } else if (y810Var2.B) {
            f(c910Var2.d, y810Var2);
        } else {
            f(c910Var2.b, y810Var2);
        }
    }
}
