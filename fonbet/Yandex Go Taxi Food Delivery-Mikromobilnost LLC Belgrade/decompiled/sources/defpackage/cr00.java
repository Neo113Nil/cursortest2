package defpackage;

import com.yandex.go.copter.experiment.CopterInfoExperiment;
import com.yandex.go.copter.experiment.CopterOrderFlowExperiment;
import com.yandex.go.taxi.order.models.api.TaxiOrder;

/* loaded from: classes14.dex */
public final class cr00 {
    public final o2y0 a;
    public final noe b;

    public cr00(o2y0 o2y0Var, noe noeVar) {
        this.a = o2y0Var;
        this.b = noeVar;
    }

    public final int a() {
        Integer num;
        o2y0 o2y0Var = this.a;
        TaxiOrder b = o2y0Var.b();
        noe noeVar = this.b;
        if (((ooe) noeVar).c(b)) {
            TaxiOrder b2 = o2y0Var.b();
            ooe ooeVar = (ooe) noeVar;
            ooeVar.getClass();
            CopterInfoExperiment copterInfoExperiment = (CopterInfoExperiment) b2.V().b(CopterInfoExperiment.class);
            CopterOrderFlowExperiment a = ooeVar.a.a();
            if (copterInfoExperiment != null && (num = copterInfoExperiment.d) != null) {
                return num.intValue();
            }
            Integer num2 = a.g;
            if (num2 != null) {
                return num2.intValue();
            }
        }
        return 0;
    }
}
