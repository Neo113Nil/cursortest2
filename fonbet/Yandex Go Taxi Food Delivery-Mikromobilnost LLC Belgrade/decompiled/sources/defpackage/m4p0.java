package defpackage;

import com.yandex.go.scooters.tariff_fix.selection.ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason;

/* loaded from: classes13.dex */
public final class m4p0 extends h55 {
    public final zuj0 D;
    public final a3v E;
    public final yvf0 F;
    public final yvf0 G;
    public final qg60 H;

    public m4p0(zuj0 zuj0Var, a3v a3vVar, yvf0 yvf0Var, yvf0 yvf0Var2, qg60 qg60Var) {
        super(null);
        this.D = zuj0Var;
        this.E = a3vVar;
        this.F = yvf0Var;
        this.G = yvf0Var2;
        this.H = qg60Var;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        e4p0 e4p0Var = (e4p0) obj;
        int i = msg0.scooters_top_notification_focus_rect_margin;
        avj0 avj0Var = (avj0) this.D;
        this.E.q3(m4p0.class, 0, avj0Var.c(i), 0, avj0Var.c(msg0.scooters_fix_tariff_selection_anchor));
        fcj0 fcj0Var = e4p0Var.a;
        P(e4p0Var, (zzs) fcj0Var.b, (ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason) fcj0Var.c);
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        j(dpb.a);
        this.E.Lc(m4p0.class, null);
    }

    public final void P(e4p0 e4p0Var, zzs zzsVar, ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason scootersTariffFixSelectionAnalytics$FixSelectionOpenReason) {
        m950 m950Var = (m950) this.H.get();
        fcj0 fcj0Var = e4p0Var.a;
        eer eerVar = (eer) fcj0Var.a;
        if (scootersTariffFixSelectionAnalytics$FixSelectionOpenReason == null) {
            scootersTariffFixSelectionAnalytics$FixSelectionOpenReason = (ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason) fcj0Var.c;
        }
        D(m950Var, new e4p0(new fcj0(eerVar, zzsVar, scootersTariffFixSelectionAnalytics$FixSelectionOpenReason, (pxm0) fcj0Var.d, (vbn0) fcj0Var.e)), new l4p0(this, e4p0Var));
    }
}
