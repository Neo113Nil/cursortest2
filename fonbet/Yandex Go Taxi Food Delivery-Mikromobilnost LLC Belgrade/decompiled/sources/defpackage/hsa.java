package defpackage;

import android.content.Context;
import android.view.View;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersLocationCardCloseReason;
import com.yandex.go.chargers.analytics.ChargersPerfEvent;
import com.yandex.go.chargers.data.j;
import com.yandex.go.chargers.domain.b;
import com.yandex.go.chargers.station.api.ChargersStationOpenReason;
import com.yandex.go.chargers.station.domain.c;
import com.yandex.go.chargers.station.presentation.details.ChargersStationDetailsModalView;
import defpackage.t9h0;
import defpackage.xva0;
import defpackage.yuf0;
import java.util.HashMap;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;

/* loaded from: classes12.dex */
public final class hsa extends m230 {
    public final fva0 E;
    public final w030 F;
    public final jra G;
    public final qra H;
    public final tra I;
    public final yvf0 J;
    public final xma K;
    public final awa L;
    public final gss M;
    public final yvf0 N;
    public final yvf0 O;
    public final yvf0 P;
    public final yvf0 Q;
    public final yvf0 R;
    public final vu S;
    public final r1s T;

    public hsa(fva0 fva0Var, w030 w030Var, jra jraVar, qra qraVar, tra traVar, yvf0 yvf0Var, xma xmaVar, awa awaVar, gss gssVar, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6, vu vuVar) {
        super(null);
        this.E = fva0Var;
        this.F = w030Var;
        this.G = jraVar;
        this.H = qraVar;
        this.I = traVar;
        this.J = yvf0Var;
        this.K = xmaVar;
        this.L = awaVar;
        this.M = gssVar;
        this.N = yvf0Var2;
        this.O = yvf0Var3;
        this.P = yvf0Var4;
        this.Q = yvf0Var5;
        this.R = yvf0Var6;
        this.S = vuVar;
        this.T = new r1s(3, new dsa(this, 0), new dsa(this, 1), new dsa(this, 2));
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        jra jraVar = this.G;
        em9 em9Var = jraVar.a;
        ChargersAnalytics$ChargersLocationCardCloseReason chargersAnalytics$ChargersLocationCardCloseReason = jraVar.b;
        if (chargersAnalytics$ChargersLocationCardCloseReason == null) {
            chargersAnalytics$ChargersLocationCardCloseReason = ChargersAnalytics$ChargersLocationCardCloseReason.SelectAnotherCharger;
        }
        HashMap w = b64.w(em9Var);
        w.put("close_reason", chargersAnalytics$ChargersLocationCardCloseReason.getEventValue());
        em9Var.a.a("Chargers.LocationCard.Closed", w, 1, new HashMap());
        jraVar.b = null;
        jraVar.c = null;
        jraVar.d = false;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.F;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [T, android.view.View$OnAttachStateChangeListener, com.yandex.go.chargers.station.presentation.details.ChargersStationDetailsRouter$provideModalView$$inlined$wrapJankStats$1] */
    @Override // defpackage.m230
    public final u45 S(Object obj) {
        gr9 gr9Var = (gr9) obj;
        final String key = ChargersPerfEvent.STATION_CARD.getKey();
        fva0.f(this.E, key, PerformanceAnalytics$Type.Inflate, 0L, 4);
        String str = gr9Var.a;
        tsa tsaVar = gr9Var.b;
        ChargersStationOpenReason chargersStationOpenReason = gr9Var.c;
        io9 io9Var = new io9(this);
        j4n j4nVar = this.I.a;
        sra sraVar = new sra((c) ((xea) j4nVar.a).get(), (b) ((xvf0) j4nVar.b).get(), (jra) ((xvf0) j4nVar.c).get(), (yfa) ((ba9) j4nVar.x).get(), (g6a) ((xvf0) j4nVar.y).get(), (j) ((xvf0) j4nVar.z).get(), (saa) ((xvf0) j4nVar.w).get(), tsaVar, str, chargersStationOpenReason, io9Var);
        vx0 vx0Var = this.H.a;
        final ChargersStationDetailsModalView chargersStationDetailsModalView = new ChargersStationDetailsModalView((Context) vx0Var.a.get(), (pav) vx0Var.b.get(), (a3v) vx0Var.c.get(), sraVar, this.T);
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? r2 = new View.OnAttachStateChangeListener() { // from class: com.yandex.go.chargers.station.presentation.details.ChargersStationDetailsRouter$provideModalView$$inlined$wrapJankStats$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                View rootView = chargersStationDetailsModalView.getRootView();
                Object tag = rootView.getTag(t9h0.metricsStateHolder);
                if (tag == null) {
                    tag = new xva0();
                    rootView.setTag(t9h0.metricsStateHolder, tag);
                }
                yuf0 yuf0Var = ((xva0) tag).a;
                if (yuf0Var != null) {
                    yuf0Var.I(key);
                }
                View view = chargersStationDetailsModalView;
                T t = ref$ObjectRef.element;
                view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
            }
        };
        ref$ObjectRef.element = r2;
        chargersStationDetailsModalView.addOnAttachStateChangeListener(r2);
        return chargersStationDetailsModalView;
    }
}
