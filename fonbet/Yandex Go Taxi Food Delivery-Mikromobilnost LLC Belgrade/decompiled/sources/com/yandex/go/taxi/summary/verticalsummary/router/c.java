package com.yandex.go.taxi.summary.verticalsummary.router;

import android.net.Uri;
import com.yandex.go.address.models.Address;
import com.yandex.go.due.api.analytics.model.DueAnalyticDisplayContext;
import com.yandex.go.requirements.comment.api.summary.data.models.CommentViewSource;
import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;
import com.yandex.go.taxi.summary.routestops.e;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.yb.api.domain.model.YbScreenSource;
import defpackage.a60;
import defpackage.ahi;
import defpackage.arb1;
import defpackage.d49;
import defpackage.efx0;
import defpackage.el11;
import defpackage.epj0;
import defpackage.fh31;
import defpackage.fit0;
import defpackage.gmw0;
import defpackage.hh31;
import defpackage.hoi;
import defpackage.i4u;
import defpackage.jmw0;
import defpackage.khd;
import defpackage.lg21;
import defpackage.lhd;
import defpackage.lmw0;
import defpackage.m950;
import defpackage.mg21;
import defpackage.mi31;
import defpackage.o400;
import defpackage.ooe;
import defpackage.pex0;
import defpackage.ph31;
import defpackage.qht0;
import defpackage.qvm;
import defpackage.r8i;
import defpackage.rft0;
import defpackage.rgt0;
import defpackage.rpt0;
import defpackage.sjh;
import defpackage.sy60;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.tuh;
import defpackage.uyj;
import defpackage.v770;
import defpackage.wud;
import defpackage.x5t0;
import defpackage.xmw;
import defpackage.ylj0;
import defpackage.z;
import defpackage.zix0;
import defpackage.zjj0;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
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
public final class c implements ph31 {
    public final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    @Override // defpackage.oiv0
    public final void A(CommentViewSource commentViewSource) {
        d dVar = this.a;
        dVar.A((m950) dVar.l0.get(), new z(commentViewSource), new b(dVar));
    }

    public final void B(zix0 zix0Var, tls tlsVar) {
        d dVar = this.a;
        tse o = dVar.o();
        dVar.K.getClass();
        sjh sjhVar = uyj.a;
        tje.N(o, o400.a, null, new VerticalSummaryComposeRouter$InnerNavigator$launchOptionsDetails$1(dVar, zix0Var, tlsVar, null), 2);
    }

    @Override // defpackage.oiv0
    public final void a() {
        this.a.v0.a();
    }

    @Override // defpackage.oiv0
    public final void b(jmw0 jmw0Var) {
        d dVar = this.a;
        epj0 epj0Var = dVar.g0;
        ru.yandex.taxi.requirements.repository.a a = dVar.n0.a();
        epj0Var.getClass();
        dVar.h0.a().s(new SoleRequirementModalView(epj0Var.a, (x5t0) epj0Var.b.get(), jmw0Var, a), true);
    }

    @Override // defpackage.oiv0
    public final void c() {
        d49 d49Var = this.a.u0;
        d49Var.getClass();
        d49.d(d49Var, CashbackCardContext.TARIFF_CARD);
    }

    @Override // defpackage.oiv0
    public final void close() {
        d dVar = this.a;
        if (dVar.p0.c(dVar.d0.a())) {
            return;
        }
        arb1.d(dVar.F).onBackPressed();
    }

    @Override // defpackage.oiv0
    public final void d() {
        d dVar = this.a;
        pex0 m = ((k) dVar.S).m();
        if (m == null) {
            return;
        }
        dVar.A((m950) dVar.R.get(), new efx0(((k) dVar.N).j().c, m), sy60.Q2);
    }

    @Override // defpackage.oiv0
    public final void e(String str) {
        d dVar = this.a;
        dVar.A((m950) dVar.M.get(), str, sy60.Q2);
    }

    @Override // defpackage.oiv0
    public final void f(String str) {
        ((mg21) ((lg21) this.a.x0.get())).a(str);
    }

    @Override // defpackage.oiv0
    public final void g() {
        qvm qvmVar = new qvm(DueAnalyticDisplayContext.SUMMARY);
        d dVar = this.a;
        dVar.A((m950) dVar.J.get(), qvmVar, new lhd(dVar, 6));
    }

    @Override // defpackage.oiv0
    public final void h() {
        i4u i4uVar = new i4u("VerticalSummaryOverlay");
        d dVar = this.a;
        boolean isEnabled = dVar.G0.isEnabled();
        rft0 rft0Var = dVar.f0;
        if (!isEnabled) {
            ((qht0) rft0Var).f(false);
        } else {
            ((qht0) rft0Var).g(false, ((fit0) dVar.H0).a(i4uVar), (e) dVar.I0.get());
        }
    }

    @Override // defpackage.oiv0
    public final void i() {
        d dVar = this.a;
        if (dVar.G0.isEnabled()) {
            h();
            return;
        }
        Address g = dVar.T.g();
        if (g != null) {
            if (((ooe) dVar.O).b(((k) dVar.S).m())) {
                dVar.W.a(g);
                return;
            }
        }
        ((tuh) dVar.e0).a(new hh31(0, g, dVar));
    }

    @Override // defpackage.oiv0
    public final void j() {
        this.a.r0.b(SourcePicker.B_FROM_SUMMARY, ModalViewOrigin.SUMMARY, true);
    }

    @Override // defpackage.oiv0
    public final void k(String str) {
        this.a.H.a(Uri.parse(str), DeeplinkSource.UNSPECIFIED);
    }

    @Override // defpackage.oiv0
    public final void l(String str) {
        d dVar = this.a;
        dVar.A((m950) dVar.y0.get(), new r8i(str, DeliveryExplicitCommentCourierFlowType.REGULAR, null), new khd(1));
    }

    @Override // defpackage.oiv0
    public final void m() {
        d dVar = this.a;
        rft0 rft0Var = dVar.f0;
        Address e = dVar.I.e();
        ((qht0) rft0Var).e(e != null ? e.J1() : null, new VerticalSummaryComposeRouter$InnerNavigator$showPorchSelector$1(0, dVar.q0, rgt0.class, "hideNotifications", "hideNotifications()V", 0), new fh31(dVar, 1));
    }

    @Override // defpackage.oiv0
    public final void n() {
        d dVar = this.a;
        dVar.z((m950) dVar.A0.get(), sy60.Q2);
    }

    @Override // defpackage.oiv0
    public final void o(int i, String str) {
        d dVar = this.a;
        pex0 m = ((k) dVar.S).m();
        lmw0 g = m != null ? ru.yandex.taxi.tariffs.model.b.g(m, str) : null;
        if (g instanceof gmw0) {
            dVar.k0.a((gmw0) g, i);
        }
    }

    @Override // defpackage.oiv0
    public final void p(String str) {
        ((a60) this.a.L).c(str, v770.c);
    }

    @Override // defpackage.oiv0
    public final void q() {
        ((xmw) this.a.i0.get()).T(IntercityPhoneSelectOrigin.BUBBLE);
    }

    @Override // defpackage.oiv0
    public final void r() {
        this.a.r0.c(SourcePicker.A_FROM_SUMMARY, ModalViewOrigin.SUMMARY);
    }

    @Override // defpackage.oiv0
    public final void s() {
        d dVar = this.a;
        dVar.D0.a(YbScreenSource.SUMMARY, null, new el11(12, dVar));
    }

    @Override // defpackage.oiv0
    public final void t(mi31 mi31Var, gmw0 gmw0Var, List list, int i) {
        d dVar = this.a;
        dVar.A((m950) dVar.w0.get(), new wud(mi31Var, gmw0Var, list, i), sy60.Q2);
    }

    @Override // defpackage.oiv0
    public final void u() {
        d dVar = this.a;
        dVar.A((m950) dVar.C0.get(), zy11.a, sy60.Q2);
    }

    @Override // defpackage.oiv0
    public final void v() {
        ((rpt0) this.a.s0).b(null, null);
    }

    @Override // defpackage.oiv0
    public final Object w(Runnable runnable, Continuation continuation) {
        runnable.run();
        return zy11.a;
    }

    @Override // defpackage.oiv0
    public final Object x(SummaryExpandReason summaryExpandReason, zjj0 zjj0Var, ContinuationImpl continuationImpl) {
        B(new zix0(zjj0Var), new fh31(this.a, 2));
        return zy11.a;
    }

    @Override // defpackage.oiv0
    public final void y(hoi hoiVar, ylj0 ylj0Var) {
        d dVar = this.a;
        dVar.A((m950) dVar.z0.get(), hoiVar, ylj0Var);
    }

    @Override // defpackage.oiv0
    public final void z() {
        ahi ahiVar = new ahi(PaidInsuranceScreenSource.REQUIREMENT);
        d dVar = this.a;
        dVar.A((m950) dVar.B0.get(), ahiVar, sy60.Q2);
    }
}
