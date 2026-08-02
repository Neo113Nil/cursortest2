package defpackage;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersQrScanOpenReason;
import com.yandex.go.chargers.analytics.ChargersPerfEvent;
import com.yandex.go.chargers.order.completion.pre_finish.ChargersFinishModalView;
import com.yandex.go.chargers.order.completion.pre_finish.domain.a;
import com.yandex.go.chargers.order.completion.pre_finish.domain.b;
import com.yandex.go.chargers.qr.ChargersQrModalView;
import com.yandex.go.chargers.qr.f;
import com.yandex.go.navigator.domain.e;
import com.yandex.go.navigator.events.g;
import com.yandex.go.navigator.incidents.IncidentType;
import com.yandex.go.navigator.incidents.overview.OverviewIncidentsModalView;
import com.yandex.go.navigator.repository.o;
import com.yandex.go.scooters.data.model.ScootersOnboardingExperiment;
import com.yandex.go.scooters.onboarding.agreement.ScootersAgreementModalView;
import com.yandex.go.taxi.order.comment.FeedbackCommentModalView;
import com.yandex.mapkit.road_events_layer.RoadEvent;
import defpackage.t9h0;
import defpackage.xva0;
import defpackage.yuf0;
import java.util.HashMap;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.due_selector.impl.time.TimePickerModalView;
import ru.yandex.taxi.layers.presentation.mapnotification.MapNotificationsMuteRepository;
import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$VehicleType;
import ru.yandex.taxi.masstransit.geopayment.stopselector.MtStopSelectorModalView;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.search.view.AddressSearchModalView;
import ru.yandex.taxi.search.view.AddressSearchView;
import ru.yandex.taxi.styling.c;

/* loaded from: classes12.dex */
public final class k1a extends m230 {
    public final /* synthetic */ int E;
    public final Object F;
    public final Object G;
    public final boolean H;
    public final Object I;
    public final Object J;
    public Object K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1a(fva0 fva0Var, w030 w030Var, d1a d1aVar, i1a i1aVar) {
        super(null);
        this.E = 0;
        this.F = fva0Var;
        this.G = w030Var;
        this.I = d1aVar;
        this.J = i1aVar;
        this.K = new io9(this);
        this.H = true;
    }

    @Override // defpackage.m230, defpackage.h55
    public void H(Object obj) {
        switch (this.E) {
            case 4:
                super.H((q440) obj);
                break;
            default:
                super.H(obj);
                break;
        }
    }

    @Override // defpackage.h55
    public void I(Object obj) {
        Object value;
        RoadEvent roadEvent;
        switch (this.E) {
            case 5:
                y290 y290Var = (y290) obj;
                r0 r0Var = (r0) ((hiq0) this.K).a;
                do {
                    value = r0Var.getValue();
                    roadEvent = (RoadEvent) value;
                    if (roadEvent == null || jl40.l(roadEvent.getId(), y290Var.a)) {
                        roadEvent = null;
                    }
                } while (!r0Var.k(value, roadEvent));
                break;
            case 6:
                ((MapNotificationsMuteRepository) this.J).b();
                break;
        }
    }

    @Override // defpackage.h55
    public void J(Object obj) {
        int i = this.E;
        Object obj2 = this.J;
        switch (i) {
            case 5:
                IncidentType incidentType = ((y290) obj).c;
                i650 i650Var = ((q290) obj2).a;
                String type = m5b1.g(incidentType).getType();
                i650Var.getClass();
                i650Var.a.a("navigation.on_map_interactions.road_events.event_icon.click", x4e.p("event_type", type), 1, new HashMap());
                break;
            case 6:
                ((MapNotificationsMuteRepository) obj2).a();
                break;
        }
    }

    @Override // defpackage.m230
    public final w030 P() {
        switch (this.E) {
            case 0:
                return (w030) this.G;
            case 1:
                return (w030) this.G;
            case 2:
                return (w030) this.G;
            case 3:
                return (w030) this.G;
            case 4:
                return (w030) this.G;
            case 5:
                return (w030) this.G;
            case 6:
                return (w030) this.G;
            default:
                return ((i130) this.F).a();
        }
    }

    @Override // defpackage.m230
    public final boolean Q() {
        switch (this.E) {
        }
        return this.H;
    }

    @Override // defpackage.m230
    public void R(u45 u45Var) {
        switch (this.E) {
            case 4:
                this.K = u45Var;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v89, types: [T, android.view.View$OnAttachStateChangeListener, com.yandex.go.scooters.onboarding.ScootersAgreementRouter$provideModalView$$inlined$wrapJankStats$1] */
    /* JADX WARN: Type inference failed for: r2v16, types: [T, android.view.View$OnAttachStateChangeListener, com.yandex.go.chargers.qr.ChargersQrRouterImpl$provideModalView$$inlined$wrapJankStats$1] */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, android.view.View$OnAttachStateChangeListener, com.yandex.go.chargers.order.completion.pre_finish.ChargersFinishRouter$provideModalView$$inlined$wrapJankStats$1] */
    @Override // defpackage.m230
    public final u45 S(Object obj) {
        ChargersAnalytics$ChargersQrScanOpenReason chargersAnalytics$ChargersQrScanOpenReason;
        int i = this.E;
        int i2 = 3;
        int i3 = 2;
        Object obj2 = this.J;
        Object obj3 = this.F;
        Object obj4 = this.I;
        switch (i) {
            case 0:
                g1a g1aVar = (g1a) obj;
                final String key = ChargersPerfEvent.PRE_FINISH_CARD.getKey();
                fva0.f((fva0) obj3, key, PerformanceAnalytics$Type.Inflate, 0L, 4);
                String str = g1aVar.a;
                tsa tsaVar = g1aVar.b;
                io9 io9Var = (io9) this.K;
                an8 an8Var = ((i1a) obj2).a;
                h1a h1aVar = new h1a((em9) ((xvf0) an8Var.c).get(), (a) ((xvf0) an8Var.w).get(), (com.yandex.go.chargers.error.data.a) ((xvf0) an8Var.x).get(), (b) ((bo2) an8Var.b).get(), str, tsaVar, io9Var);
                io9 io9Var2 = (io9) this.K;
                sk7 sk7Var = ((d1a) obj4).a;
                final ChargersFinishModalView chargersFinishModalView = new ChargersFinishModalView((Context) ((xvf0) sk7Var.b).get(), (pav) ((pxf) sk7Var.c).get(), io9Var2, h1aVar, (pya) ((xvf0) sk7Var.w).get());
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ?? r2 = new View.OnAttachStateChangeListener() { // from class: com.yandex.go.chargers.order.completion.pre_finish.ChargersFinishRouter$provideModalView$$inlined$wrapJankStats$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View v) {
                        View rootView = chargersFinishModalView.getRootView();
                        Object tag = rootView.getTag(t9h0.metricsStateHolder);
                        if (tag == null) {
                            tag = new xva0();
                            rootView.setTag(t9h0.metricsStateHolder, tag);
                        }
                        yuf0 yuf0Var = ((xva0) tag).a;
                        if (yuf0Var != null) {
                            yuf0Var.I(key);
                        }
                        View view = chargersFinishModalView;
                        T t = ref$ObjectRef.element;
                        view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View v) {
                    }
                };
                ref$ObjectRef.element = r2;
                chargersFinishModalView.addOnAttachStateChangeListener(r2);
                return chargersFinishModalView;
            case 1:
                aoa aoaVar = (aoa) this.K;
                int i4 = yna.a[((noa) obj).a.ordinal()];
                if (i4 == 1) {
                    chargersAnalytics$ChargersQrScanOpenReason = ChargersAnalytics$ChargersQrScanOpenReason.Discovery;
                } else if (i4 == 2) {
                    chargersAnalytics$ChargersQrScanOpenReason = ChargersAnalytics$ChargersQrScanOpenReason.StationCard;
                } else if (i4 == 3) {
                    chargersAnalytics$ChargersQrScanOpenReason = ChargersAnalytics$ChargersQrScanOpenReason.ReturnCharger;
                } else {
                    if (i4 != 4) {
                        w511.b();
                        return null;
                    }
                    chargersAnalytics$ChargersQrScanOpenReason = ChargersAnalytics$ChargersQrScanOpenReason.ActiveOrderCard;
                }
                zna znaVar = new zna((em9) ((lxf) aoaVar.a.b).get(), chargersAnalytics$ChargersQrScanOpenReason);
                final String key2 = ChargersPerfEvent.QR_SCAN.getKey();
                fva0.f((fva0) obj3, key2, PerformanceAnalytics$Type.Inflate, 0L, 4);
                yfa yfaVar = new yfa(this);
                w3i w3iVar = ((qoa) obj4).a;
                poa poaVar = new poa((Context) ((xvf0) w3iVar.b).get(), (y50) ((xvf0) w3iVar.c).get(), (ney) ((xvf0) w3iVar.w).get(), (qya) ((xvf0) w3iVar.x).get(), (v7j0) ((xvf0) w3iVar.y).get(), (joa) ((xvf0) w3iVar.z).get(), (f) ((xvf0) w3iVar.A).get(), (com.yandex.go.chargers.qr.domain.a) ((yc) w3iVar.B).get(), yfaVar, znaVar);
                hoa hoaVar = ((ioa) obj2).a;
                final ChargersQrModalView chargersQrModalView = new ChargersQrModalView((Context) hoaVar.a.get(), (tse) hoaVar.b.get(), (pya) hoaVar.c.get(), (coa) hoaVar.d.a, znaVar, jpa.a, poaVar);
                final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                ?? r22 = new View.OnAttachStateChangeListener() { // from class: com.yandex.go.chargers.qr.ChargersQrRouterImpl$provideModalView$$inlined$wrapJankStats$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View v) {
                        View rootView = chargersQrModalView.getRootView();
                        Object tag = rootView.getTag(t9h0.metricsStateHolder);
                        if (tag == null) {
                            tag = new xva0();
                            rootView.setTag(t9h0.metricsStateHolder, tag);
                        }
                        yuf0 yuf0Var = ((xva0) tag).a;
                        if (yuf0Var != null) {
                            yuf0Var.I(key2);
                        }
                        View view = chargersQrModalView;
                        T t = ref$ObjectRef2.element;
                        view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View v) {
                    }
                };
                ref$ObjectRef2.element = r22;
                chargersQrModalView.addOnAttachStateChangeListener(r22);
                return chargersQrModalView;
            case 2:
                p51 p51Var = AddressSearchModalView.Companion;
                c61 c61Var = AddressSearchView.Companion;
                cag j = ((apf) obj3).j();
                c61Var.getClass();
                b61 b61Var = new b61(j);
                b61Var.p = true;
                b61Var.n = ((avj0) ((zuj0) obj4)).h(kyh0.summary_source_address_delivery_hint);
                b61Var.q = new v8e(14, this);
                p51Var.getClass();
                AddressSearchModalView a = p51.a(b61Var);
                a.setOnAppearingListener(new ou4(i3, this));
                a.setOnKeyboardListener(new o51(a, 4));
                a.setOnAddressPickedListener(new x71(i2, this));
                return a;
            case 3:
                csq csqVar = (csq) obj;
                return new FeedbackCommentModalView((Context) ((zrq) obj3).a.a.get(), new dsq((u1n) ((g3p) ((esq) obj4).a.b).get(), csqVar.a, new jln(16, this)), csqVar.b);
            case 4:
                q440 q440Var = (q440) obj;
                fl10 fl10Var = new fl10(this);
                String str2 = q440Var.a;
                String str3 = q440Var.b;
                TransportPaymentAnalytics$VehicleType transportPaymentAnalytics$VehicleType = q440Var.c;
                String str4 = q440Var.d;
                String str5 = q440Var.e;
                xv10 xv10Var = ((t340) obj2).a;
                return new MtStopSelectorModalView((Context) obj3, new s340(fl10Var, str2, str3, transportPaymentAnalytics$VehicleType, str4, str5, (pwy0) ((xvf0) xv10Var.a).get(), (tiu0) ((y2s0) xv10Var.b).get(), (d411) ((xvf0) xv10Var.c).get(), (wu30) ((xvf0) xv10Var.w).get(), (zuj0) ((xvf0) xv10Var.x).get()), (c2x0) ((p340) obj4).a.a.get());
            case 5:
                yj70 yj70Var = new yj70(this);
                bu0 bu0Var = ((x290) obj3).a;
                w290 w290Var = new w290(yj70Var, (y290) obj, (zuj0) ((xvf0) bu0Var.a).get(), (g) ((xvf0) bu0Var.b).get(), (Context) ((xvf0) bu0Var.c).get(), (nf7) ((h4g) bu0Var.d).get(), (ah00) ((xvf0) bu0Var.e).get(), (yov) ((xvf0) bu0Var.f).get(), (q290) ((xvf0) bu0Var.g).get(), (vff) ((xvf0) bu0Var.h).get(), (liq0) ((xvf0) bu0Var.i).get());
                v31 v31Var = ((s290) obj4).a;
                return new OverviewIncidentsModalView((Context) v31Var.a.get(), w290Var, (ru.yandex.taxi.discovery.a) v31Var.b.get(), (ah00) v31Var.c.get(), (wb50) v31Var.d.get(), (o) v31Var.e.get(), (e) v31Var.f.get(), (ewc) v31Var.g.get(), (com.yandex.go.navigator.analitycs.a) v31Var.h.get());
            case 6:
                gxm0 gxm0Var = (gxm0) obj;
                final String str6 = "ScootersAgreement";
                fva0.f((fva0) obj3, "ScootersAgreement", PerformanceAnalytics$Type.Inflate, 0L, 4);
                dxm0 dxm0Var = (dxm0) this.K;
                String str7 = gxm0Var.a;
                CharSequence charSequence = gxm0Var.b;
                ScootersOnboardingExperiment scootersOnboardingExperiment = gxm0Var.c;
                ixm0 ixm0Var = new ixm0(this);
                s6k0 s6k0Var = dxm0Var.a;
                final ScootersAgreementModalView scootersAgreementModalView = new ScootersAgreementModalView((Context) ((xvf0) s6k0Var.a).get(), (xro0) ((mbo0) s6k0Var.b).get(), (hxm0) ((jzi0) s6k0Var.c).get(), str7, charSequence, scootersOnboardingExperiment, ixm0Var);
                final Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
                ?? r1 = new View.OnAttachStateChangeListener() { // from class: com.yandex.go.scooters.onboarding.ScootersAgreementRouter$provideModalView$$inlined$wrapJankStats$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View v) {
                        View rootView = scootersAgreementModalView.getRootView();
                        Object tag = rootView.getTag(t9h0.metricsStateHolder);
                        if (tag == null) {
                            tag = new xva0();
                            rootView.setTag(t9h0.metricsStateHolder, tag);
                        }
                        yuf0 yuf0Var = ((xva0) tag).a;
                        if (yuf0Var != null) {
                            yuf0Var.I(str6);
                        }
                        View view = scootersAgreementModalView;
                        T t = ref$ObjectRef3.element;
                        view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View v) {
                    }
                };
                ref$ObjectRef3.element = r1;
                scootersAgreementModalView.addOnAttachStateChangeListener(r1);
                return scootersAgreementModalView;
            default:
                exu0 exu0Var = (exu0) obj4;
                pwy0 pwy0Var = (pwy0) obj2;
                return new TimePickerModalView(new ContextThemeWrapper((Context) this.G, exu0Var.a(pwy0Var.getThemeType()).b), ((w6z0) obj).a, new wpy0(i3, this), new u6z0(exu0Var, (c) this.K, pwy0Var));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        super(null);
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.I = obj3;
        this.J = obj4;
        this.K = obj5;
        this.H = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1a(w030 w030Var, Context context, p340 p340Var, t340 t340Var) {
        super(null);
        this.E = 4;
        this.G = w030Var;
        this.F = context;
        this.I = p340Var;
        this.J = t340Var;
        this.H = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1a(x290 x290Var, s290 s290Var, w030 w030Var, q290 q290Var, hiq0 hiq0Var) {
        super(null);
        this.E = 5;
        this.F = x290Var;
        this.I = s290Var;
        this.G = w030Var;
        this.J = q290Var;
        this.K = hiq0Var;
        this.H = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1a(w030 w030Var, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(null);
        this.E = i;
        this.G = w030Var;
        this.F = obj;
        this.I = obj2;
        this.J = obj3;
        this.K = obj4;
        this.H = true;
    }
}
