package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.yandex.go.beginners.flow.PreGeoAuthOnboardingModalView;
import com.yandex.go.beginners.presentation.BeginnersOnboardingModalView;
import com.yandex.go.lifecycle.a;
import com.yandex.go.navigator.domain.e;
import com.yandex.go.navigator.driving.top_view.DrivingTopView;
import com.yandex.go.navigator.incidents.dashboard.DashboardEventsModalView;
import com.yandex.go.navigator.repository.o;
import com.yandex.go.transfer_requirement.mvp.TransferRequirementModalView;
import defpackage.t9h0;
import defpackage.xva0;
import defpackage.yuf0;
import java.util.HashMap;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.layers.presentation.mapnotification.MapNotificationsMuteRepository;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.completion_acceptance.ScootersCompletionAcceptanceModalView;
import ru.yandex.taxi.scooters.presentation.ontheway.damage.ScootersDamageView;
import ru.yandex.taxi.scooters.presentation.ontheway.damage.d;

/* loaded from: classes12.dex */
public final class fl5 extends m230 {
    public final /* synthetic */ int E = 5;
    public final Object F;
    public final Object G;
    public boolean H;
    public final Object I;
    public final Object J;
    public final Object K;
    public final Object L;

    public fl5(w030 w030Var, Activity activity, wge0 wge0Var, yge0 yge0Var, gf41 gf41Var) {
        super(null);
        this.F = w030Var;
        this.I = activity;
        this.J = wge0Var;
        this.K = yge0Var;
        this.G = gf41Var;
        this.L = new qc(16, this);
        this.H = true;
    }

    @Override // defpackage.m230, defpackage.h55
    public void G(Object obj) {
        switch (this.E) {
            case 0:
                super.G((bl5) obj);
                tje.a0((Activity) this.I, (qc) this.L);
                break;
            case 1:
            default:
                super.G(obj);
                break;
            case 2:
                super.G((ahe0) obj);
                tje.a0((Activity) this.I, (qc) this.L);
                break;
        }
    }

    @Override // defpackage.m230, defpackage.h55
    public void H(Object obj) {
        switch (this.E) {
            case 0:
                super.H((bl5) obj);
                ((qc) this.L).g();
                break;
            case 1:
            default:
                super.H(obj);
                break;
            case 2:
                super.H((ahe0) obj);
                ((qc) this.L).g();
                break;
        }
    }

    @Override // defpackage.h55
    public void I(Object obj) {
        switch (this.E) {
            case 4:
                if (this.H) {
                    ((MapNotificationsMuteRepository) this.L).b();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.h55
    public void J(Object obj) {
        switch (this.E) {
            case 1:
                i650 i650Var = ((tjg) this.L).a;
                i650Var.a.a("navigation.reports.road_events.add_event.click", n.u(i650Var), 1, new HashMap());
                break;
            case 4:
                ((zbn0) obj).getClass();
                this.H = false;
                break;
        }
    }

    @Override // defpackage.m230
    public final w030 P() {
        switch (this.E) {
            case 0:
                return (w030) this.F;
            case 1:
                return (w030) this.F;
            case 2:
                return (w030) this.F;
            case 3:
                return (w030) this.F;
            case 4:
                return (w030) this.F;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v56, types: [T, android.view.View$OnAttachStateChangeListener, ru.yandex.taxi.scooters.presentation.ontheway.completion.completion_acceptance.ScootersCompletionAcceptanceRouter$provideModalView$$inlined$wrapJankStats$1] */
    /* JADX WARN: Type inference failed for: r1v72, types: [T, android.view.View$OnAttachStateChangeListener, ru.yandex.taxi.scooters.presentation.ontheway.damage.ScootersDamageRouter$provideModalView$$inlined$wrapJankStats$1] */
    @Override // defpackage.m230
    public final u45 S(Object obj) {
        int i = this.E;
        Object obj2 = this.I;
        Object obj3 = this.K;
        Object obj4 = this.J;
        switch (i) {
            case 0:
                hh5 hh5Var = new hh5(2, this);
                nfh nfhVar = ((el5) obj3).a;
                dl5 dl5Var = new dl5(hh5Var, (bl5) obj, (v7j0) ((xvf0) nfhVar.a).get(), (mrj) ((aj0) nfhVar.b).get(), (a) ((xvf0) nfhVar.c).get());
                ig0 ig0Var = ((yk5) obj4).a;
                return new BeginnersOnboardingModalView((Context) ig0Var.a.get(), dl5Var, (pwy0) ig0Var.b.get(), (f0w0) ig0Var.c.get(), (ip11) ig0Var.d.get(), (ipc) ig0Var.e.a);
            case 1:
                wjg wjgVar = (wjg) obj;
                xjg xjgVar = new xjg(0, this, wjgVar);
                w3i w3iVar = ((tig) obj2).a;
                sig sigVar = new sig((Context) ((xvf0) w3iVar.b).get(), xjgVar, wjgVar, (com.yandex.go.navigator.incidents.dashboard.a) ((fwc) w3iVar.c).get(), (apv) ((xvf0) w3iVar.w).get(), (gpv) ((xvf0) w3iVar.x).get(), (ah00) ((xvf0) w3iVar.y).get(), (com.yandex.go.navigator.a) ((xvf0) w3iVar.z).get(), (tjg) ((p6f) w3iVar.A).get(), (vxr) ((xvf0) w3iVar.B).get());
                gv1 gv1Var = ((ujg) obj4).a;
                return new DashboardEventsModalView((Context) gv1Var.a.get(), sigVar, (DrivingTopView) gv1Var.b.get(), (ru.yandex.taxi.discovery.a) gv1Var.c.get(), (ah00) gv1Var.d.get(), (wb50) gv1Var.e.get(), (o) gv1Var.f.get(), (e) gv1Var.g.get(), (ewc) gv1Var.h.get(), (com.yandex.go.navigator.analitycs.a) gv1Var.i.get());
            case 2:
                zge0 zge0Var = new zge0(this);
                ofa0 ofa0Var = ((yge0) obj3).a;
                com.yandex.go.beginners.presentation.a aVar = new com.yandex.go.beginners.presentation.a(zge0Var, (ahe0) obj, (a) ((xvf0) ofa0Var.a).get(), (gym) ((gw7) ofa0Var.b).get(), (ed) ((xvf0) ofa0Var.c).get(), (bk1) ((xvf0) ofa0Var.w).get());
                zh0 zh0Var = ((wge0) obj4).a;
                return new PreGeoAuthOnboardingModalView((Context) zh0Var.a.get(), aVar, (pwy0) zh0Var.b.get(), (f0w0) zh0Var.c.get(), (ip11) zh0Var.d.get());
            case 3:
                q8n0 q8n0Var = (q8n0) obj;
                zuo0 zuo0Var = q8n0Var.a;
                d9n0 d9n0Var = q8n0Var.b;
                final String str = "ScootersCancelRidingView";
                fva0.f((fva0) obj2, "ScootersCancelRidingView", PerformanceAnalytics$Type.Inflate, 0L, 4);
                String m = zuo0Var.m();
                r7p0 number = zuo0Var.getNumber();
                j6m0 j6m0Var = new j6m0(22, this);
                s8n0 s8n0Var = (s8n0) this.L;
                vam0 vam0Var = new vam0(17, this, zuo0Var);
                krl0 krl0Var = s8n0Var.a;
                r8n0 r8n0Var = new r8n0((nqm0) ((xvf0) krl0Var.a).get(), (y8n0) ((z8n0) krl0Var.b).get(), vam0Var, zuo0Var, d9n0Var);
                kdd0 kdd0Var = ((o8n0) obj3).a;
                final ScootersCompletionAcceptanceModalView scootersCompletionAcceptanceModalView = new ScootersCompletionAcceptanceModalView((Context) ((xvf0) kdd0Var.a).get(), (pav) ((xvf0) kdd0Var.b).get(), (p5o0) ((bwn0) kdd0Var.c).get(), (jho0) ((xvf0) kdd0Var.d).get(), m, j6m0Var, number, r8n0Var);
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ?? r1 = new View.OnAttachStateChangeListener() { // from class: ru.yandex.taxi.scooters.presentation.ontheway.completion.completion_acceptance.ScootersCompletionAcceptanceRouter$provideModalView$$inlined$wrapJankStats$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View v) {
                        View rootView = scootersCompletionAcceptanceModalView.getRootView();
                        Object tag = rootView.getTag(t9h0.metricsStateHolder);
                        if (tag == null) {
                            tag = new xva0();
                            rootView.setTag(t9h0.metricsStateHolder, tag);
                        }
                        yuf0 yuf0Var = ((xva0) tag).a;
                        if (yuf0Var != null) {
                            yuf0Var.I(str);
                        }
                        View view = scootersCompletionAcceptanceModalView;
                        T t = ref$ObjectRef.element;
                        view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View v) {
                    }
                };
                ref$ObjectRef.element = r1;
                scootersCompletionAcceptanceModalView.addOnAttachStateChangeListener(r1);
                return scootersCompletionAcceptanceModalView;
            case 4:
                zbn0 zbn0Var = (zbn0) obj;
                zuo0 zuo0Var2 = zbn0Var.a;
                final String str2 = "ScootersDamageView";
                fva0.f((fva0) obj2, "ScootersDamageView", PerformanceAnalytics$Type.Inflate, 0L, 4);
                String m2 = zuo0Var2.m();
                boolean z = zbn0Var.b;
                r7p0 number2 = zuo0Var2.getNumber();
                j6m0 j6m0Var2 = new j6m0(27, this);
                vam0 vam0Var2 = new vam0(19, this, zuo0Var2);
                boolean z2 = zbn0Var.b;
                String sessionId = zuo0Var2.getSessionId();
                boj0 boj0Var = ((dcn0) obj3).a;
                d dVar = new d((p8k0) boj0Var.b, (z8n0) boj0Var.c, (y50) ((xvf0) boj0Var.w).get(), (ney) ((xvf0) boj0Var.x).get(), (ukn0) ((xvf0) boj0Var.y).get(), (ru.yandex.taxi.scooters.domain.o) ((xvf0) boj0Var.z).get(), z2, sessionId);
                kdd0 kdd0Var2 = ((hcn0) obj4).a;
                final ScootersDamageView scootersDamageView = new ScootersDamageView((Context) ((xvf0) kdd0Var2.a).get(), (pav) ((xvf0) kdd0Var2.b).get(), (uq1) ((e7g) kdd0Var2.c).get(), (jho0) ((mbo0) kdd0Var2.d).get(), m2, z, j6m0Var2, number2, vam0Var2, dVar);
                final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                ?? r12 = new View.OnAttachStateChangeListener() { // from class: ru.yandex.taxi.scooters.presentation.ontheway.damage.ScootersDamageRouter$provideModalView$$inlined$wrapJankStats$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View v) {
                        View rootView = scootersDamageView.getRootView();
                        Object tag = rootView.getTag(t9h0.metricsStateHolder);
                        if (tag == null) {
                            tag = new xva0();
                            rootView.setTag(t9h0.metricsStateHolder, tag);
                        }
                        yuf0 yuf0Var = ((xva0) tag).a;
                        if (yuf0Var != null) {
                            yuf0Var.I(str2);
                        }
                        View view = scootersDamageView;
                        T t = ref$ObjectRef2.element;
                        view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View v) {
                    }
                };
                ref$ObjectRef2.element = r12;
                scootersDamageView.addOnAttachStateChangeListener(r12);
                return scootersDamageView;
            default:
                tp01 tp01Var = (tp01) this.G;
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper((Context) obj2, ((exu0) obj4).a(((pwy0) obj3).getThemeType()).b);
                wpy0 wpy0Var = new wpy0(11, this);
                hwo0 hwo0Var = tp01Var.a;
                return new TransferRequirementModalView(contextThemeWrapper, wpy0Var, (lp01) ((n3w) hwo0Var.b).a, (exu0) ((pbg) hwo0Var.c).get(), (pwy0) ((pbg) hwo0Var.w).get(), (gvz0) ((pbg) hwo0Var.x).get());
        }
    }

    public fl5(w030 w030Var, fva0 fva0Var, yvf0 yvf0Var, yvf0 yvf0Var2, o8n0 o8n0Var, s8n0 s8n0Var) {
        super(null);
        this.F = w030Var;
        this.I = fva0Var;
        this.G = yvf0Var;
        this.J = yvf0Var2;
        this.K = o8n0Var;
        this.L = s8n0Var;
        this.H = true;
    }

    public fl5(w030 w030Var, fva0 fva0Var, hcn0 hcn0Var, dcn0 dcn0Var, MapNotificationsMuteRepository mapNotificationsMuteRepository, yvf0 yvf0Var) {
        super(null);
        this.F = w030Var;
        this.I = fva0Var;
        this.J = hcn0Var;
        this.K = dcn0Var;
        this.L = mapNotificationsMuteRepository;
        this.G = yvf0Var;
        this.H = true;
    }

    public fl5(w030 w030Var, Activity activity, yk5 yk5Var, el5 el5Var, yvf0 yvf0Var) {
        super(null);
        this.F = w030Var;
        this.I = activity;
        this.J = yk5Var;
        this.K = el5Var;
        this.G = yvf0Var;
        this.L = new qc(7, this);
        this.H = true;
    }

    public fl5(tig tigVar, ujg ujgVar, w030 w030Var, yvf0 yvf0Var, ipv ipvVar, tjg tjgVar) {
        super(null);
        this.I = tigVar;
        this.J = ujgVar;
        this.F = w030Var;
        this.G = yvf0Var;
        this.K = ipvVar;
        this.L = tjgVar;
        this.H = true;
    }

    public fl5(i130 i130Var, Context context, exu0 exu0Var, pwy0 pwy0Var, tp01 tp01Var, pbg pbgVar) {
        super(null);
        this.F = i130Var;
        this.I = context;
        this.J = exu0Var;
        this.K = pwy0Var;
        this.G = tp01Var;
        this.L = pbgVar;
        this.H = true;
    }
}
