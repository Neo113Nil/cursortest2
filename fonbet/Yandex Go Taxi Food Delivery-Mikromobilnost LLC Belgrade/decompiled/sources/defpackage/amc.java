package defpackage;

import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.costcenters.api.CostCenterField;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes8.dex */
public final class amc implements zwe {
    public final dqe0 a;
    public final wiq0 b;
    public final n0 c;
    public final n0 d;
    public final zlc e;

    public amc(dqe0 dqe0Var, wiq0 wiq0Var) {
        this.a = dqe0Var;
        this.b = wiq0Var;
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        this.c = ffx.b(0, 1, bufferOverflow);
        this.d = ffx.b(0, 1, bufferOverflow);
        this.e = new zlc(this);
    }

    @Override // defpackage.zwe
    public final boolean a(String str, TariffOrderFlow tariffOrderFlow) {
        Set set = (Set) this.e.b.get(str);
        if (set == null) {
            return false;
        }
        return set.contains(tariffOrderFlow);
    }

    @Override // defpackage.zwe
    public final String b(String str) {
        String f = this.a.a.f(str);
        return f == null ? "" : f;
    }

    @Override // defpackage.zwe
    public final n0 c() {
        return this.d;
    }

    @Override // defpackage.zwe
    public final void d(String str, String str2) {
        this.a.a.B.put(str, str2);
        this.d.g(zy11.a);
        if (this.e.b.keySet().contains(str)) {
            return;
        }
        jst.e.r(String.format("CostCenter. inconsistency detected. fieldId %s set but not found", Arrays.copyOf(new Object[]{str}, 1)), new IllegalStateException());
    }

    @Override // defpackage.zwe
    public final boolean e(TariffOrderFlow tariffOrderFlow) {
        Collection values = this.e.b.values();
        if ((values instanceof Collection) && values.isEmpty()) {
            return false;
        }
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (((Set) it.next()).contains(tariffOrderFlow)) {
                return true;
            }
        }
        return false;
    }

    public final void f(bl21 bl21Var) {
        Preorder preorder = this.a.a;
        preorder.z = bl21Var.a();
        preorder.A = null;
        this.c.g(bl21Var);
    }

    public final String g() {
        return this.a.a.d();
    }

    public final void h(String str, List list) {
        zlc zlcVar = this.e;
        if (jl40.l(zlcVar.c, str) && zlcVar.a.size() == list.size()) {
            Iterable e = scc.e(zlcVar.a);
            if ((e instanceof Collection) && ((Collection) e).isEmpty()) {
                return;
            }
            c6w it = e.iterator();
            while (it.c) {
                int nextInt = it.nextInt();
                if (!jl40.l(((CostCenterField) zlcVar.a.get(nextInt)).getA(), ((CostCenterField) list.get(nextInt)).getA())) {
                }
            }
            return;
        }
        zlcVar.c = str;
        zlcVar.a.clear();
        zlcVar.b.clear();
        zlcVar.a.addAll(list);
        Preorder preorder = zlcVar.d.a.a;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            CostCenterField costCenterField = (CostCenterField) it2.next();
            preorder.B.put(costCenterField.getA(), null);
            Map map = zlcVar.b;
            String a = costCenterField.getA();
            List c = costCenterField.getC();
            ArrayList arrayList = new ArrayList();
            Iterator it3 = c.iterator();
            while (it3.hasNext()) {
                TariffOrderFlow g = ksb1.g((String) it3.next());
                if (g != null) {
                    arrayList.add(g);
                }
            }
            map.put(a, a.N0(arrayList));
        }
        zlcVar.d.d.g(zy11.a);
    }
}
