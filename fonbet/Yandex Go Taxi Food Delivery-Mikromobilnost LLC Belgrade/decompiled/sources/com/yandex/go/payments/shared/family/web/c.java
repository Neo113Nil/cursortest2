package com.yandex.go.payments.shared.family.web;

import com.yandex.go.account.api.family.SharedPaymentContext;
import com.yandex.go.modals.progress.api.CircularProgressRouter$Payload;
import com.yandex.go.payments.data.model.response.SharedAccount;
import com.yandex.go.payments.shared.details.experiments.ForceZaloginForFamilyExperiment;
import com.yandex.go.payments.shared.details.experiments.d;
import com.yandex.go.payments.shared.family.experiments.FamilyGroupV2Experiment;
import com.yandex.go.payments.shared.family.web.nativeapi.FamilyJsNativeApi;
import defpackage.brb;
import defpackage.cap;
import defpackage.cda0;
import defpackage.eap;
import defpackage.ee;
import defpackage.evu0;
import defpackage.fap;
import defpackage.fn21;
import defpackage.gap;
import defpackage.gf41;
import defpackage.h3y;
import defpackage.h55;
import defpackage.hap;
import defpackage.i3y;
import defpackage.j5z;
import defpackage.jln;
import defpackage.jst;
import defpackage.kp50;
import defpackage.kxa0;
import defpackage.lbp;
import defpackage.m2s;
import defpackage.m950;
import defpackage.mbp;
import defpackage.oo2;
import defpackage.pzt0;
import defpackage.qu;
import defpackage.snr0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tt2;
import defpackage.tvb;
import defpackage.uap;
import defpackage.wfe0;
import defpackage.wnt;
import defpackage.xbp;
import defpackage.xf41;
import defpackage.xvf0;
import defpackage.yvf0;
import defpackage.z9p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CoroutineStart;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.am.o;
import ru.yandex.taxi.gopayments.dto.SharedAccountType;
import ru.yandex.taxi.gopayments.family.repository.FamilyUiStateRepository$Screen;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes13.dex */
public final class c extends h55 {
    public final gf41 D;
    public final fn21 E;
    public final g F;
    public final ru.yandex.taxi.am.token.a G;
    public final ru.yandex.taxi.sharedpayments.c H;
    public final tt2 I;
    public final cda0 J;
    public final xbp K;
    public final o L;
    public final yvf0 M;
    public final m2s N;
    public final z9p O;
    public final j5z P;
    public final h3y Q;
    public pzt0 R;
    public pzt0 S;
    public final FamilyJsNativeApi T;
    public tvb U;
    public final i3y V;
    public final i3y W;
    public final hap Z;

    public c(gf41 gf41Var, fn21 fn21Var, g gVar, ru.yandex.taxi.am.token.a aVar, ru.yandex.taxi.sharedpayments.c cVar, tt2 tt2Var, cda0 cda0Var, xbp xbpVar, o oVar, xvf0 xvf0Var, m2s m2sVar, z9p z9pVar, lbp lbpVar, j5z j5zVar, h3y h3yVar) {
        super(null);
        this.D = gf41Var;
        this.E = fn21Var;
        this.F = gVar;
        this.G = aVar;
        this.H = cVar;
        this.I = tt2Var;
        this.J = cda0Var;
        this.K = xbpVar;
        this.L = oVar;
        this.M = xvf0Var;
        this.N = m2sVar;
        this.O = z9pVar;
        this.P = j5zVar;
        this.Q = h3yVar;
        jln jlnVar = new jln(15, this);
        oo2 oo2Var = lbpVar.a;
        this.T = new FamilyJsNativeApi((wnt) ((xvf0) oo2Var.a).get(), (tt2) ((xvf0) oo2Var.b).get(), (brb) ((ee) oo2Var.c).get(), (wfe0) ((kxa0) oo2Var.w).get(), jlnVar, (z9p) ((xvf0) oo2Var.x).get());
        this.V = kotlin.a.a(new eap(this, 0));
        this.W = kotlin.a.a(new eap(this, 1));
        this.Z = new hap(0, this);
    }

    public static final UiWebViewConfig P(c cVar, String str) {
        FamilyJsNativeApi familyJsNativeApi = cVar.T;
        familyJsNativeApi.setOnWebViewReadyAction(new eap(cVar, 2));
        familyJsNativeApi.setShowLoadingAction(new eap(cVar, 3));
        familyJsNativeApi.setHideLoadingAction(new eap(cVar, 4));
        String c = cVar.G.c();
        CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
        aVar.b = str;
        aVar.c = c;
        aVar.b("Authorization", kp50.h(c));
        String Hg = ((h) cVar.E).Hg();
        if (Hg == null) {
            Hg = "";
        }
        aVar.b("X-YaTaxi-UserId", Hg);
        aVar.b("Accept-Language", cVar.P.d());
        aVar.k = familyJsNativeApi;
        aVar.h = true;
        UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
        uiWebViewConfig.setShouldShowToolbar(true);
        uiWebViewConfig.setBackStackAware(true);
        uiWebViewConfig.setSignalForLoaded(UiWebViewConfig.SignalForLoaded.External.INSTANCE);
        uiWebViewConfig.setModalViewMode(UiWebViewConfig.Fullscreen.INSTANCE);
        uiWebViewConfig.setAnimateOnAppearing(false);
        return uiWebViewConfig;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        final String str = ((cap) obj).a;
        if (str == null) {
            str = ((FamilyGroupV2Experiment) ((uap) this.Q.get()).a.b()).e;
        }
        if (evu0.J(str)) {
            jst.e.q("Family web view url is blank!");
            r(new qu(9));
            return;
        }
        if (this.F.a.Mg()) {
            d dVar = (d) this.N;
            if (dVar.a().b) {
                ForceZaloginForFamilyExperiment a = dVar.a();
                ForceZaloginForFamilyExperiment.Screen c = a.c(a.d.b);
                mbp b = c == null ? null : dVar.b(c);
                if (b == null) {
                    return;
                }
                com.yandex.go.payments.paymentlist.data.c cVar = (com.yandex.go.payments.paymentlist.data.c) this.J;
                List list = cVar.g.b.g().f.b;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(cVar.o.l((SharedAccount) it.next()));
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (((snr0) next).c == SharedAccountType.FAMILY) {
                        arrayList2.add(next);
                    }
                }
                ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((snr0) it3.next()).a);
                }
                final String str2 = (String) kotlin.collections.a.R(arrayList3);
                this.H.c(SharedPaymentContext.CREATE_ACCOUNT, b, new Runnable() { // from class: com.yandex.go.payments.shared.family.web.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str3 = str2;
                        c cVar2 = this;
                        if (str3 != null && !evu0.J(str3)) {
                            cVar2.H.b(str3, SharedPaymentContext.INVITE_CARD);
                        }
                        fap fapVar = new fap(cVar2, str, 0);
                        cVar2.S();
                        pzt0 pzt0Var = cVar2.S;
                        if (pzt0Var != null) {
                            pzt0Var.a(null);
                        }
                        cVar2.S = tje.N(cVar2.o(), null, null, new FamilyAccountWebViewRouterImpl$refreshToken$1(cVar2, fapVar, null, null), 3);
                    }
                });
                return;
            }
        }
        R(str);
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        pzt0 pzt0Var = this.R;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.R = null;
        pzt0 pzt0Var2 = this.S;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.S = null;
        m950 m950Var = this.U;
        if (m950Var != null) {
            ((h55) m950Var).i();
        }
        this.U = null;
    }

    public final xf41 Q() {
        return (xf41) this.W.getValue();
    }

    public final void R(String str) {
        this.K.b(FamilyUiStateRepository$Screen.FAMILY_WEB_VIEW);
        pzt0 pzt0Var = this.R;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.R = com.yandex.go.coroutines.b.g(o(), null, CoroutineStart.UNDISPATCHED, new FamilyAccountWebViewRouterImpl$showInternal$1(this, str, null), 1);
    }

    public final void S() {
        if (this.U != null) {
            return;
        }
        tvb tvbVar = (tvb) this.M.get();
        new FamilyAccountWebViewRouterImpl$showProgress$router$1$1(this, c.class, "progressRouter", "getProgressRouter()Lcom/yandex/go/modals/progress/api/CircularProgressRouter;", 0).i(tvbVar);
        D(tvbVar, new CircularProgressRouter$Payload(null, false, 7), new gap(this, 0));
    }
}
