package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.costcenters.api.CostCenterField;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes5.dex */
public final class lwe {
    public final zwe a;
    public final uxe b;
    public final zuj0 c;
    public final gyc d;
    public final List e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    public lwe(zwe zweVar, jve jveVar, uxe uxeVar, zuj0 zuj0Var, gyc gycVar) {
        ?? r4;
        this.a = zweVar;
        this.b = uxeVar;
        this.c = zuj0Var;
        this.d = gycVar;
        TariffOrderFlow tariffOrderFlow = uxeVar.get();
        if (tariffOrderFlow != null) {
            List list = jveVar.e;
            r4 = new ArrayList();
            for (Object obj : list) {
                if (this.a.a(((CostCenterField) obj).a, tariffOrderFlow)) {
                    r4.add(obj);
                }
            }
        } else {
            r4 = EmptyList.a;
        }
        this.e = r4;
    }

    public final ArrayList a(boolean z) {
        String str;
        List<CostCenterField> list = this.e;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (CostCenterField costCenterField : list) {
            String b = this.a.b(costCenterField.a);
            if (z) {
                String b2 = ((zwe) this.d.a).b(costCenterField.a);
                if (costCenterField.d && evu0.J(b2)) {
                    str = ((avj0) this.c).h(kyh0.cost_center_fields_field_not_filled_in);
                    arrayList.add(new jwe(costCenterField.a, costCenterField.b, b, costCenterField.e, str, costCenterField.d));
                }
            }
            str = null;
            arrayList.add(new jwe(costCenterField.a, costCenterField.b, b, costCenterField.e, str, costCenterField.d));
        }
        return arrayList;
    }
}
