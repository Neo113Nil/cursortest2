package defpackage;

import com.yandex.go.scooters.tariff_fix.selection.ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason;

/* loaded from: classes13.dex */
public final class hym0 implements f0p0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h55 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hym0(h55 h55Var, Object obj, int i) {
        this.a = i;
        this.b = h55Var;
        this.c = obj;
    }

    @Override // defpackage.f0p0
    public final void N0() {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                ((iym0) h55Var).P(null);
                break;
            default:
                ((m4p0) h55Var).P((e4p0) this.c, null, ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason.SELECT_ON_MAP);
                break;
        }
    }

    @Override // defpackage.f0p0, defpackage.sy60
    public final void a() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((sls) obj).invoke();
                break;
            default:
                ((m4p0) this.b).P((e4p0) obj, null, ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason.SELECT_ON_MAP);
                break;
        }
    }

    @Override // defpackage.f0p0
    public final void d0(k7n0 k7n0Var) {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                ((iym0) h55Var).P(k7n0Var.a);
                break;
            default:
                ((m4p0) h55Var).P((e4p0) this.c, k7n0Var.a, ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason.ADDRESS_SELECTION);
                break;
        }
    }
}
