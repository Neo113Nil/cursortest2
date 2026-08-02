package com.yandex.go.summary.navigation;

import android.net.Uri;
import com.yandex.go.address.models.Address;
import com.yandex.go.due.api.analytics.model.DueAnalyticDisplayContext;
import com.yandex.go.requirements.comment.api.summary.data.models.CommentViewSource;
import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.yb.api.domain.model.YbScreenSource;
import defpackage.a60;
import defpackage.ahi;
import defpackage.arb1;
import defpackage.d49;
import defpackage.e48;
import defpackage.efx0;
import defpackage.epj0;
import defpackage.evu0;
import defpackage.fit0;
import defpackage.gdv0;
import defpackage.gmw0;
import defpackage.h3y;
import defpackage.hoi;
import defpackage.i4u;
import defpackage.jhd;
import defpackage.jmw0;
import defpackage.kdr;
import defpackage.khd;
import defpackage.lg21;
import defpackage.lhd;
import defpackage.m950;
import defpackage.mg21;
import defpackage.mi31;
import defpackage.ny61;
import defpackage.oiv0;
import defpackage.ooe;
import defpackage.pev0;
import defpackage.pex0;
import defpackage.qht0;
import defpackage.qpt0;
import defpackage.qvm;
import defpackage.r8i;
import defpackage.rft0;
import defpackage.rgt0;
import defpackage.rpt0;
import defpackage.set0;
import defpackage.suh;
import defpackage.sy60;
import defpackage.tuh;
import defpackage.uet0;
import defpackage.v770;
import defpackage.vqb;
import defpackage.wud;
import defpackage.x5t0;
import defpackage.xbx0;
import defpackage.xmw;
import defpackage.ylj0;
import defpackage.z;
import defpackage.zjj0;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.cashback.analytics.CashbackCardContext;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.delivery.api.routers.PaidInsuranceScreenSource;
import ru.yandex.taxi.intercity.analytics.IntercityPhoneSelectOrigin;
import ru.yandex.taxi.logistics.explicit_comment_courier.comment.DeliveryExplicitCommentCourierFlowType;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.preorder.summary.requirements.sole.SoleRequirementModalView;

/* loaded from: classes14.dex */
public final class c implements oiv0 {
    public final /* synthetic */ e a;

    public c(e eVar) {
        this.a = eVar;
    }

    @Override // defpackage.oiv0
    public final void A(CommentViewSource commentViewSource) {
        e eVar = this.a;
        eVar.A((m950) eVar.j0.get(), new z(commentViewSource), new b(eVar));
    }

    @Override // defpackage.oiv0
    public final void a() {
        this.a.r0.a();
    }

    @Override // defpackage.oiv0
    public final void b(jmw0 jmw0Var) {
        e eVar = this.a;
        epj0 epj0Var = eVar.k0;
        ru.yandex.taxi.requirements.repository.a a = eVar.l0.a();
        epj0Var.getClass();
        eVar.G.a().s(new SoleRequirementModalView(epj0Var.a, (x5t0) epj0Var.b.get(), jmw0Var, a), true);
    }

    @Override // defpackage.oiv0
    public final void c() {
        d49 d49Var = (d49) this.a.q0.get();
        d49Var.getClass();
        d49.d(d49Var, CashbackCardContext.TARIFF_CARD);
    }

    @Override // defpackage.oiv0
    public final void close() {
        e eVar = this.a;
        if (((uet0) eVar.m0.get()).c(eVar.h0.a())) {
            return;
        }
        arb1.d(eVar.F).onBackPressed();
    }

    @Override // defpackage.oiv0
    public final void d() {
        e eVar = this.a;
        pex0 m = ((k) eVar.W).m();
        if (m == null) {
            return;
        }
        eVar.A((m950) eVar.c0.get(), new efx0(((k) eVar.Z).j().c, m), sy60.Q2);
    }

    @Override // defpackage.oiv0
    public final void e(String str) {
        e eVar = this.a;
        eVar.A((m950) eVar.a0.get(), str, sy60.Q2);
    }

    @Override // defpackage.oiv0
    public final void f(String str) {
        ((mg21) ((lg21) this.a.v0.get())).a(str);
    }

    @Override // defpackage.oiv0
    public final void g() {
        qvm qvmVar = new qvm(DueAnalyticDisplayContext.SUMMARY);
        e eVar = this.a;
        eVar.A((m950) eVar.f0.get(), qvmVar, new lhd(eVar, 0));
    }

    @Override // defpackage.oiv0
    public final void h() {
        i4u i4uVar = new i4u("SummaryMapOverlayInteractor");
        e eVar = this.a;
        boolean isEnabled = eVar.G0.isEnabled();
        h3y h3yVar = eVar.M;
        if (!isEnabled) {
            ((qht0) ((rft0) h3yVar.get())).f(false);
            return;
        }
        ((qht0) ((rft0) h3yVar.get())).g(false, ((fit0) eVar.H0).a(i4uVar), (com.yandex.go.taxi.summary.routestops.e) eVar.I0.get());
    }

    @Override // defpackage.oiv0
    public final void i() {
        e eVar = this.a;
        if (eVar.G0.isEnabled()) {
            h();
            return;
        }
        Address g = eVar.Q.g();
        if (g != null) {
            if (((ooe) eVar.U).b(((k) eVar.W).m())) {
                eVar.V.a(g);
                return;
            }
        }
        ((tuh) ((suh) eVar.R.get())).a(new jhd(0, g, eVar));
    }

    @Override // defpackage.oiv0
    public final void j() {
        ((set0) this.a.L.get()).b(SourcePicker.B_FROM_SUMMARY, ModalViewOrigin.SUMMARY, true);
    }

    @Override // defpackage.oiv0
    public final void k(String str) {
        this.a.b0.a(Uri.parse(str), DeeplinkSource.UNSPECIFIED);
    }

    @Override // defpackage.oiv0
    public final void l(String str) {
        e eVar = this.a;
        eVar.A((m950) eVar.y0.get(), new r8i(str, DeliveryExplicitCommentCourierFlowType.REGULAR, null), new khd(0));
    }

    @Override // defpackage.oiv0
    public final void m() {
        e eVar = this.a;
        rft0 rft0Var = (rft0) eVar.M.get();
        Address e = eVar.P.e();
        ((qht0) rft0Var).e(e != null ? e.J1() : null, new ComposeSummaryRouter$InnerNavigator$showPorchSelector$1(0, eVar.N, rgt0.class, "hideNotifications", "hideNotifications()V", 0), new vqb(13, eVar));
    }

    @Override // defpackage.oiv0
    public final void n() {
        e eVar = this.a;
        eVar.z((m950) eVar.A0.get(), sy60.Q2);
    }

    @Override // defpackage.oiv0
    public final void o(int i, String str) {
        e eVar = this.a;
        pex0 m = ((k) eVar.W).m();
        Object g = m != null ? ru.yandex.taxi.tariffs.model.b.g(m, str) : null;
        gmw0 gmw0Var = g instanceof gmw0 ? (gmw0) g : null;
        if (gmw0Var != null) {
            ((kdr) eVar.d0.get()).a(gmw0Var, i);
        }
    }

    @Override // defpackage.oiv0
    public final void p(String str) {
        ((a60) this.a.w0).c(str, v770.c);
    }

    @Override // defpackage.oiv0
    public final void q() {
        ((xmw) this.a.e0.get()).T(IntercityPhoneSelectOrigin.BUBBLE);
    }

    @Override // defpackage.oiv0
    public final void r() {
        ((set0) this.a.L.get()).c(SourcePicker.A_FROM_SUMMARY, ModalViewOrigin.SUMMARY);
    }

    @Override // defpackage.oiv0
    public final void s() {
        e eVar = this.a;
        eVar.D0.a(YbScreenSource.SUMMARY, null, new e48(29, eVar));
    }

    @Override // defpackage.oiv0
    public final void t(mi31 mi31Var, gmw0 gmw0Var, List list, int i) {
        e eVar = this.a;
        eVar.A((m950) eVar.u0.get(), new wud(mi31Var, gmw0Var, list, i), sy60.Q2);
    }

    @Override // defpackage.oiv0
    public final void u() {
        e eVar = this.a;
        eVar.A((m950) eVar.B0.get(), zy11.a, sy60.Q2);
    }

    @Override // defpackage.oiv0
    public final void v() {
        ((rpt0) ((qpt0) this.a.K.get())).b(null, null);
    }

    @Override // defpackage.oiv0
    public final Object w(Runnable runnable, Continuation continuation) {
        return this.a.x0.b(runnable, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ab, code lost:
    
        if (r10.b(r9, r8, r2) != r11) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007b, code lost:
    
        if (r1.a(r8, r2) == r11) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.oiv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(SummaryExpandReason summaryExpandReason, zjj0 zjj0Var, ContinuationImpl continuationImpl) {
        ComposeSummaryRouter$InnerNavigator$openCardAndScrollToRequirement$1 composeSummaryRouter$InnerNavigator$openCardAndScrollToRequirement$1;
        int i;
        String str;
        String str2;
        e eVar = this.a;
        pev0 pev0Var = eVar.J;
        if (continuationImpl instanceof ComposeSummaryRouter$InnerNavigator$openCardAndScrollToRequirement$1) {
            composeSummaryRouter$InnerNavigator$openCardAndScrollToRequirement$1 = (ComposeSummaryRouter$InnerNavigator$openCardAndScrollToRequirement$1) continuationImpl;
            int i2 = composeSummaryRouter$InnerNavigator$openCardAndScrollToRequirement$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                composeSummaryRouter$InnerNavigator$openCardAndScrollToRequirement$1.label = i2 - Integer.MIN_VALUE;
                Object obj = composeSummaryRouter$InnerNavigator$openCardAndScrollToRequirement$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = composeSummaryRouter$InnerNavigator$openCardAndScrollToRequirement$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    gdv0 gdv0Var = new gdv0(summaryExpandReason);
                    composeSummaryRouter$InnerNavigator$openCardAndScrollToRequirement$1.L$0 = null;
                    composeSummaryRouter$InnerNavigator$openCardAndScrollToRequirement$1.L$1 = zjj0Var;
                    composeSummaryRouter$InnerNavigator$openCardAndScrollToRequirement$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return obj;
                        }
                        str = (String) composeSummaryRouter$InnerNavigator$openCardAndScrollToRequirement$1.L$2;
                        kotlin.b.b(obj);
                        if (str != null) {
                            return zy11.a;
                        }
                        xbx0 xbx0Var = new xbx0(str);
                        composeSummaryRouter$InnerNavigator$openCardAndScrollToRequirement$1.L$0 = null;
                        composeSummaryRouter$InnerNavigator$openCardAndScrollToRequirement$1.L$1 = null;
                        composeSummaryRouter$InnerNavigator$openCardAndScrollToRequirement$1.L$2 = null;
                        composeSummaryRouter$InnerNavigator$openCardAndScrollToRequirement$1.L$3 = null;
                        composeSummaryRouter$InnerNavigator$openCardAndScrollToRequirement$1.label = 3;
                        Object a = pev0Var.a(xbx0Var, composeSummaryRouter$InnerNavigator$openCardAndScrollToRequirement$1);
                        return a == coroutineSingletons ? coroutineSingletons : a;
                    }
                    zjj0Var = (zjj0) composeSummaryRouter$InnerNavigator$openCardAndScrollToRequirement$1.L$1;
                    kotlin.b.b(obj);
                }
                String str3 = zjj0Var.b;
                str = (str3 != null || evu0.J(str3)) ? null : str3;
                str2 = zjj0Var.a;
                if (str2 != null || evu0.J(str2)) {
                    str2 = null;
                }
                if (str == null || str2 != null) {
                    com.yandex.go.summary.interactor.core.b bVar = eVar.p0;
                    composeSummaryRouter$InnerNavigator$openCardAndScrollToRequirement$1.L$0 = null;
                    composeSummaryRouter$InnerNavigator$openCardAndScrollToRequirement$1.L$1 = null;
                    composeSummaryRouter$InnerNavigator$openCardAndScrollToRequirement$1.L$2 = str;
                    composeSummaryRouter$InnerNavigator$openCardAndScrollToRequirement$1.L$3 = null;
                    composeSummaryRouter$InnerNavigator$openCardAndScrollToRequirement$1.label = 2;
                }
                if (str != null) {
                }
            }
        }
        composeSummaryRouter$InnerNavigator$openCardAndScrollToRequirement$1 = new ComposeSummaryRouter$InnerNavigator$openCardAndScrollToRequirement$1(this, continuationImpl);
        Object obj2 = composeSummaryRouter$InnerNavigator$openCardAndScrollToRequirement$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = composeSummaryRouter$InnerNavigator$openCardAndScrollToRequirement$1.label;
        if (i != 0) {
        }
        String str32 = zjj0Var.b;
        if (str32 != null) {
        }
        str2 = zjj0Var.a;
        if (str2 != null) {
        }
        str2 = null;
        if (str == null) {
        }
        com.yandex.go.summary.interactor.core.b bVar2 = eVar.p0;
        composeSummaryRouter$InnerNavigator$openCardAndScrollToRequirement$1.L$0 = null;
        composeSummaryRouter$InnerNavigator$openCardAndScrollToRequirement$1.L$1 = null;
        composeSummaryRouter$InnerNavigator$openCardAndScrollToRequirement$1.L$2 = str;
        composeSummaryRouter$InnerNavigator$openCardAndScrollToRequirement$1.L$3 = null;
        composeSummaryRouter$InnerNavigator$openCardAndScrollToRequirement$1.label = 2;
    }

    @Override // defpackage.oiv0
    public final void y(hoi hoiVar, ylj0 ylj0Var) {
        e eVar = this.a;
        eVar.A((m950) eVar.z0.get(), hoiVar, ylj0Var);
    }

    @Override // defpackage.oiv0
    public final void z() {
        ahi ahiVar = new ahi(PaidInsuranceScreenSource.REQUIREMENT);
        e eVar = this.a;
        eVar.A((m950) eVar.C0.get(), ahiVar, sy60.Q2);
    }
}
