package defpackage;

import com.yandex.go.taxi.order.models.api.cost_center.CostCenterParam;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.costcenters.api.CostCenterField;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes5.dex */
public final class fxe implements zwe {
    public final jve a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final n0 c = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public fxe(jve jveVar, List list) {
        this.a = jveVar;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CostCenterParam costCenterParam = (CostCenterParam) it.next();
            this.b.put(costCenterParam.a, costCenterParam.c);
        }
    }

    @Override // defpackage.zwe
    public final boolean a(String str, TariffOrderFlow tariffOrderFlow) {
        Object obj;
        List list;
        Iterator it = this.a.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((CostCenterField) obj).a, str)) {
                break;
            }
        }
        CostCenterField costCenterField = (CostCenterField) obj;
        if (costCenterField == null || (list = costCenterField.c) == null) {
            return false;
        }
        List<String> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (String str2 : list2) {
            TariffOrderFlow.Companion.getClass();
            if (ijx0.a(str2) == tariffOrderFlow) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.zwe
    public final String b(String str) {
        String str2 = (String) this.b.get(str);
        return str2 == null ? "" : str2;
    }

    @Override // defpackage.zwe
    public final n0 c() {
        return this.c;
    }

    @Override // defpackage.zwe
    public final void d(String str, String str2) {
        this.b.put(str, str2);
        this.c.g(zy11.a);
    }

    @Override // defpackage.zwe
    public final boolean e(TariffOrderFlow tariffOrderFlow) {
        List list = this.a.e;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List<String> list2 = ((CostCenterField) it.next()).c;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (String str : list2) {
                    TariffOrderFlow.Companion.getClass();
                    if (ijx0.a(str) == tariffOrderFlow) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
