package defpackage;

import android.content.Context;
import android.view.View;
import com.yandex.go.scooters.domain.d;
import com.yandex.go.scooters.domain.e;
import com.yandex.go.scooters.domain.w;
import com.yandex.go.scooters.tariff_fix.selection.ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason;
import com.yandex.go.scooters.tariff_fix.selection.ScootersTariffFixSelectionModalView;
import defpackage.t9h0;
import defpackage.xva0;
import defpackage.yuf0;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.common_models.net.map_object.f0;
import ru.yandex.taxi.map_common.b;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;

/* loaded from: classes13.dex */
public final class b5p0 extends m230 {
    public final w030 E;
    public final fva0 F;
    public final ysd0 G;
    public final yvf0 H;
    public final yvf0 I;
    public final s4p0 J;
    public final v4p0 K;
    public final fon0 L;
    public final o4p0 M;
    public final n0 N;
    public final enw O;

    public b5p0(w030 w030Var, fva0 fva0Var, ysd0 ysd0Var, yvf0 yvf0Var, yvf0 yvf0Var2, s4p0 s4p0Var, v4p0 v4p0Var, fon0 fon0Var, o4p0 o4p0Var) {
        super(null);
        this.E = w030Var;
        this.F = fva0Var;
        this.G = ysd0Var;
        this.H = yvf0Var;
        this.I = yvf0Var2;
        this.J = s4p0Var;
        this.K = v4p0Var;
        this.L = fon0Var;
        this.M = o4p0Var;
        this.N = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        this.O = new enw(1, this);
    }

    @Override // defpackage.m230, defpackage.h55
    public final void G(Object obj) {
        super.G((e4p0) obj);
        ((b) this.G).a(f0.class, this.O);
    }

    @Override // defpackage.m230, defpackage.h55
    public final void H(Object obj) {
        super.H((e4p0) obj);
        j(dpb.a);
        this.N.g(zy11.a);
        ((b) this.G).b(f0.class);
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21, types: [T, android.view.View$OnAttachStateChangeListener, com.yandex.go.scooters.tariff_fix.selection.ScootersTariffFixSelectionRouter$provideModalView$$inlined$wrapJankStats$1] */
    @Override // defpackage.m230
    public final u45 S(Object obj) {
        e4p0 e4p0Var = (e4p0) obj;
        fcj0 fcj0Var = e4p0Var.a;
        ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason scootersTariffFixSelectionAnalytics$FixSelectionOpenReason = (ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason) fcj0Var.c;
        eer eerVar = (eer) fcj0Var.a;
        final String str = "ScootersTariffFixView";
        fva0.f(this.F, "ScootersTariffFixView", PerformanceAnalytics$Type.Inflate, 0L, 4);
        c1p0 c1p0Var = new c1p0(2, this, eerVar);
        ehn0 ehn0Var = new ehn0(28, this);
        a5p0 a5p0Var = new a5p0(0, this, scootersTariffFixSelectionAnalytics$FixSelectionOpenReason);
        fcj0 fcj0Var2 = e4p0Var.a;
        qgn0 qgn0Var = new qgn0(8, this);
        st0 st0Var = this.K.a;
        com.yandex.go.scooters.tariff_fix.selection.b bVar = new com.yandex.go.scooters.tariff_fix.selection.b((wnt) ((xvf0) st0Var.a).get(), (ah00) ((xvf0) st0Var.b).get(), (qwc) ((xvf0) st0Var.c).get(), (atd0) ((xvf0) st0Var.w).get(), (po21) ((xvf0) st0Var.x).get(), (d) ((xvf0) st0Var.y).get(), (cyx) ((xvf0) st0Var.z).get(), (w) ((xvf0) st0Var.A).get(), (com.yandex.go.scooters.domain.f0) ((r5n0) st0Var.B).get(), (e) ((p8k0) st0Var.C).get(), (fon0) ((xvf0) st0Var.D).get(), fcj0Var2, qgn0Var);
        cjm0 cjm0Var = this.M.a;
        n4p0 n4p0Var = new n4p0((lx4) ((xvf0) cjm0Var.b).get(), (u8w) ((mbo0) cjm0Var.c).get(), scootersTariffFixSelectionAnalytics$FixSelectionOpenReason);
        fcj0 fcj0Var3 = this.J.a;
        final ScootersTariffFixSelectionModalView scootersTariffFixSelectionModalView = new ScootersTariffFixSelectionModalView((Context) ((xvf0) fcj0Var3.a).get(), (g8n0) ((xvf0) fcj0Var3.b).get(), (gzx) ((k7g) fcj0Var3.c).get(), (c4p0) ((oto0) fcj0Var3.d).get(), (x4p0) ((z8n0) fcj0Var3.e).get(), c1p0Var, ehn0Var, a5p0Var, bVar, n4p0Var);
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? r1 = new View.OnAttachStateChangeListener() { // from class: com.yandex.go.scooters.tariff_fix.selection.ScootersTariffFixSelectionRouter$provideModalView$$inlined$wrapJankStats$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                View rootView = scootersTariffFixSelectionModalView.getRootView();
                Object tag = rootView.getTag(t9h0.metricsStateHolder);
                if (tag == null) {
                    tag = new xva0();
                    rootView.setTag(t9h0.metricsStateHolder, tag);
                }
                yuf0 yuf0Var = ((xva0) tag).a;
                if (yuf0Var != null) {
                    yuf0Var.I(str);
                }
                View view = scootersTariffFixSelectionModalView;
                T t = ref$ObjectRef.element;
                view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
            }
        };
        ref$ObjectRef.element = r1;
        scootersTariffFixSelectionModalView.addOnAttachStateChangeListener(r1);
        return scootersTariffFixSelectionModalView;
    }
}
