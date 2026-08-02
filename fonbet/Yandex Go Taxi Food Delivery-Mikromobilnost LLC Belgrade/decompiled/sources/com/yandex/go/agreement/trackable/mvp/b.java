package com.yandex.go.agreement.trackable.mvp;

import com.yandex.go.agreement.api.trackable.network.TrackableAcceptanceActionParam;
import com.yandex.go.agreement.trackable.analitycs.EULAAnalytics$AcceptanceCloseReason;
import com.yandex.go.agreement.trackable.analitycs.EULAAnalytics$AcceptanceTapAction;
import defpackage.a101;
import defpackage.ad5;
import defpackage.b101;
import defpackage.bk1;
import defpackage.bvf0;
import defpackage.c101;
import defpackage.d101;
import defpackage.da0;
import defpackage.e101;
import defpackage.f101;
import defpackage.g101;
import defpackage.gf41;
import defpackage.h101;
import defpackage.i101;
import defpackage.jtq0;
import defpackage.pwy0;
import defpackage.qu;
import defpackage.r101;
import defpackage.t101;
import defpackage.tan;
import defpackage.u101;
import defpackage.vf41;
import defpackage.w030;
import defpackage.w511;
import defpackage.yqg;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes12.dex */
public final class b extends ad5 {
    public final pwy0 A;
    public final com.yandex.go.agreement.trackable.mapper.a B;
    public final com.yandex.go.agreement.trackable.repository.a C;
    public final com.yandex.go.agreement.trackable.repository.b D;
    public final jtq0 E;
    public final yqg F;
    public final tan G;
    public boolean H;
    public boolean I;
    public final r0 J;
    public final r0 K;
    public final u101 x;
    public final t101 y;
    public final bk1 z;

    public b(u101 u101Var, t101 t101Var, bk1 bk1Var, pwy0 pwy0Var, com.yandex.go.agreement.trackable.mapper.a aVar, com.yandex.go.agreement.trackable.repository.a aVar2, com.yandex.go.agreement.trackable.repository.b bVar, jtq0 jtq0Var, yqg yqgVar, tan tanVar) {
        super(r101.class);
        this.x = u101Var;
        this.y = t101Var;
        this.z = bk1Var;
        this.A = pwy0Var;
        this.B = aVar;
        this.C = aVar2;
        this.D = bVar;
        this.E = jtq0Var;
        this.F = yqgVar;
        this.G = tanVar;
        Boolean bool = Boolean.FALSE;
        this.J = bvf0.c(bool);
        this.K = bvf0.c(bool);
    }

    public final void Kg(EULAAnalytics$AcceptanceCloseReason eULAAnalytics$AcceptanceCloseReason) {
        u101 u101Var = this.x;
        this.G.a(u101Var.a.a, eULAAnalytics$AcceptanceCloseReason);
        ((com.yandex.go.agreement.interactor.a) this.z).d(u101Var.a);
        Mg(this.H ? TrackableAcceptanceActionParam.Status.REJECTED : TrackableAcceptanceActionParam.Status.VIEWED);
        this.y.a.r(new qu(9));
    }

    public final void Lg(i101 i101Var) {
        boolean z = i101Var instanceof a101;
        t101 t101Var = this.y;
        u101 u101Var = this.x;
        tan tanVar = this.G;
        if (z) {
            tanVar.a(u101Var.a.a, EULAAnalytics$AcceptanceCloseReason.AcceptButton);
            ((com.yandex.go.agreement.interactor.a) this.z).d(u101Var.a);
            Mg(TrackableAcceptanceActionParam.Status.ACCEPTED);
            t101Var.a.r(new qu(9));
            return;
        }
        if (i101Var instanceof d101) {
            Kg(EULAAnalytics$AcceptanceCloseReason.RejectButton);
            return;
        }
        if (i101Var instanceof b101) {
            Kg(EULAAnalytics$AcceptanceCloseReason.CloseButton);
            return;
        }
        if (i101Var instanceof e101) {
            Kg(EULAAnalytics$AcceptanceCloseReason.Swipe);
            return;
        }
        if (i101Var instanceof f101) {
            Kg(EULAAnalytics$AcceptanceCloseReason.SystemBack);
            return;
        }
        if (i101Var instanceof g101) {
            Kg(EULAAnalytics$AcceptanceCloseReason.TapOutside);
            return;
        }
        if (!(i101Var instanceof h101)) {
            if ((i101Var instanceof c101) || i101Var == null) {
                return;
            }
            w511.b();
            return;
        }
        String str = ((h101) i101Var).a;
        tanVar.b(u101Var.a.a, EULAAnalytics$AcceptanceTapAction.Deeplink, str);
        t101Var.getClass();
        CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
        aVar.b = str;
        UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar.a(), null, true, false, false, false, null, true, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194170, null);
        da0 da0Var = t101Var.a;
        ((w030) da0Var.F).s(vf41.a(((gf41) da0Var.H).a().c(), uiWebViewConfig, null, null, null, 254), true);
    }

    public final void Mg(TrackableAcceptanceActionParam.Status status) {
        u101 u101Var = this.x;
        this.C.a(new TrackableAcceptanceActionParam(u101Var.a.a, u101Var.a.h, status, 2), new TrackableAcceptancePresenter$saveStatus$1(this, status, null));
    }
}
