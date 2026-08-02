package defpackage;

import com.yandex.go.scooters.tariff_fix.selection.ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason;

/* loaded from: classes13.dex */
public final class f7n0 implements f0p0 {
    public final /* synthetic */ h7n0 a;
    public final /* synthetic */ eer b;
    public final /* synthetic */ vbn0 c;

    public f7n0(h7n0 h7n0Var, eer eerVar, vbn0 vbn0Var) {
        this.a = h7n0Var;
        this.b = eerVar;
        this.c = vbn0Var;
    }

    @Override // defpackage.f0p0
    public final void N0() {
        this.a.e(this.b, this.c, ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason.SELECT_ON_MAP, null);
    }

    @Override // defpackage.f0p0
    public final void d0(k7n0 k7n0Var) {
        this.a.e(this.b, this.c, ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason.ADDRESS_SELECTION, k7n0Var.a);
    }
}
