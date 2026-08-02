package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.mainscreen.superapp.impl.header.experiment.CurrentAddressModalExperiment;

/* loaded from: classes12.dex */
public final class gv0 {
    public final oep0 a;
    public final ee b;

    public gv0(oep0 oep0Var, ee eeVar) {
        this.a = oep0Var;
        this.b = eeVar;
    }

    public final void a(CurrentAddressModalExperiment.OnMapClickActionType onMapClickActionType, Address address) {
        int i = fv0.a[onMapClickActionType.ordinal()];
        if (i != 1) {
            ee eeVar = this.b;
            oep0 oep0Var = this.a;
            if (i == 2) {
                ((pep0) oep0Var).f((y4c0) eeVar.get(), bff.a, new ixx(true));
                return;
            }
            if (i != 3) {
                w511.b();
                return;
            }
            zzs B = address != null ? address.B() : null;
            if (B == null) {
                return;
            }
            ((pep0) oep0Var).f((y4c0) eeVar.get(), new aff(B), new ixx(true));
        }
    }
}
