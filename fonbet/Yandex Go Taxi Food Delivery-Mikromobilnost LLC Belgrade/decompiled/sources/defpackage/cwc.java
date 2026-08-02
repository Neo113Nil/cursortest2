package defpackage;

import android.net.Uri;
import android.text.Editable;
import com.yandex.go.delivery.tracking.l;
import com.yandex.go.overdraft.api.domain.model.OverdraftContext;
import com.yandex.go.overdraft.domain.i;
import com.yandex.go.payments.shared.wizard.welcome.CreateAccountView;
import com.yandex.go.payments.shared.wizard.welcome.a;
import com.yandex.messaging.contacts.PermissionState;
import com.yandex.messaging.domain.folders.c;
import com.yandex.messaging.domain.statuses.b;
import com.yandex.payment.divkit.challenger.DKChallengerFragment;
import com.yandex.payment.divkit.cvv_confirm.CvvScreenArguments;
import com.yandex.payment.divkit.exitscreen.DKExitFragment;
import com.yandex.payment.divkit.results.DKResultFragment;
import com.yandex.payment.divkit.sbp.DKSbpFragment;
import com.yandex.plus.core.debug.panel.internal.presentation.controller.DebugPanelViewControllerImpl;
import com.yandex.xplat.payment.sdk.PsdkScreen;
import com.ybsdk.feature.dashboard.internal.ui.dashboard3.DashboardV3Fragment;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.costcenters.input.CostCenterInputModalView;
import ru.yandex.taxi.logistics.safe_flow.DeliverySafeFlowNotification;
import ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.d;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

/* loaded from: classes13.dex */
public final class cwc implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cwc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        swe sweVar;
        a aVar;
        tc5 activityViewModel;
        String queryParameter;
        com.yandex.payment.divkit.sbp.a viewModel;
        Object obj2;
        tc5 activityViewModel2;
        boolean z;
        e7n widgetsAdapter;
        lig ligVar;
        e7n widgetsAdapter2;
        int i = this.a;
        Object[] objArr = 0;
        final int i2 = 1;
        Object obj3 = null;
        zy11 zy11Var = zy11.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((bwc) obj4).k((gwc) obj);
                break;
            case 1:
                ((kxc) ((nxc) obj4).Dg()).render((List) obj);
                break;
            case 2:
                List list = (List) obj;
                qsd qsdVar = (qsd) obj4;
                com.yandex.go.address.search.common.presenter.a aVar2 = qsdVar.d;
                if (!jl40.l(list, qsdVar.b)) {
                    qsdVar.b = list;
                    if (kotlin.collections.a.b0(list) == null) {
                        aVar2.W = null;
                    }
                    qsdVar.a = qsdVar.b.size() > 1;
                    aVar2.Bh();
                    break;
                }
                break;
            case 3:
                ((bjd) obj4).Oc((u0c0) obj);
                break;
            case 4:
                ((x2e) obj4).O6((s2e) obj);
                break;
            case 5:
                ((ru.yandex.taxi.altpins.confirmation_screen.a) obj4).c();
                break;
            case 6:
                ((x22) obj4).i("contacts permission", ((PermissionState) obj).getLoggingName());
                break;
            case 7:
                sweVar = ((CostCenterInputModalView) obj4).presenter;
                sweVar.A = ((Editable) obj).toString();
                ((ewe) sweVar.Dg()).enableDoneButton(sweVar.Mg());
                break;
            case 8:
                if (((o1f) obj) instanceof o1f) {
                    yur.b((yur) obj4);
                    break;
                }
                break;
            case 9:
                ((g2f) obj4).render((xfn) obj);
                break;
            case 10:
                aVar = ((CreateAccountView) obj4).presenter;
                String obj5 = ((Editable) obj).toString();
                aVar.F = "";
                aVar.x.c = obj5;
                aVar.Ng();
                break;
            case 11:
                ((Number) obj).longValue();
                r0 r0Var = ((c) obj4).a.a;
                rff rffVar = new rff();
                r0Var.getClass();
                r0Var.m(null, rffVar);
                break;
            case 12:
                ((bhf) obj4).Lg().x0(((qo21) obj).c());
                break;
            case 13:
                ((com.yandex.go.preorder.lifecycle.c) obj4).b.b(dai0.C());
                break;
            case 14:
                b bVar = (b) obj4;
                com.yandex.messaging.domain.statuses.a[] s = bVar.a.s();
                bVar.b.getClass();
                j73.L(s, null, null, new a5f(10), 31);
                r0 r0Var2 = (r0) ((pz40) bVar.e.getValue());
                r0Var2.getClass();
                r0Var2.m(null, s);
                break;
            case 15:
                boolean y = evu0.y(((Uri) obj).toString(), "apply_cvv", false);
                Boolean valueOf = Boolean.valueOf(y);
                if (!y) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    com.yandex.payment.divkit.cvv_confirm.b bVar2 = (com.yandex.payment.divkit.cvv_confirm.b) obj4;
                    bVar2.z.m(dof.c);
                    CvvScreenArguments cvvScreenArguments = bVar2.F;
                    if (cvvScreenArguments == null) {
                        cvvScreenArguments = null;
                    }
                    if (cvvScreenArguments instanceof CvvScreenArguments.Challenge) {
                        qwl qwlVar = bVar2.I;
                        if (qwlVar != null) {
                            qwlVar.setPaymentApi(bVar2.w);
                        }
                        qwl qwlVar2 = bVar2.I;
                        if (qwlVar2 != null) {
                            qwlVar2.provideCvnForChallenge();
                        }
                    } else if (cvvScreenArguments instanceof CvvScreenArguments.ForceCvv) {
                        bVar2.c.c(((CvvScreenArguments.ForceCvv) cvvScreenArguments).getMethod(), new dye(15, bVar2), null, new jof(bVar2));
                    } else if (!(cvvScreenArguments instanceof CvvScreenArguments.NoPaymentChallenge)) {
                        w511.b();
                        break;
                    } else {
                        qwl qwlVar3 = bVar2.I;
                        if (qwlVar3 != null) {
                            qwlVar3.setCvnProvider(bVar2);
                        }
                    }
                }
                break;
            case 16:
                ((DKChallengerFragment) obj4).observeDivData((cnk) obj);
                break;
            case 17:
                ((DKExitFragment) obj4).observeDivData((cnk) obj);
                break;
            case 18:
                ((DKResultFragment) obj4).observeDivData((cnk) obj);
                break;
            case 19:
                Uri uri = (Uri) obj;
                if (!jl40.l(uri.getScheme(), "payment-sdk")) {
                    uri = null;
                }
                if (uri != null) {
                    DKSbpFragment dKSbpFragment = (DKSbpFragment) obj4;
                    String host = uri.getHost();
                    if (host != null) {
                        switch (host.hashCode()) {
                            case 3015911:
                                if (host.equals("back")) {
                                    dKSbpFragment.requireActivity().onBackPressed();
                                    break;
                                }
                                break;
                            case 94756344:
                                if (host.equals("close")) {
                                    activityViewModel = dKSbpFragment.getActivityViewModel();
                                    activityViewModel.L();
                                    break;
                                }
                                break;
                            case 214910879:
                                if (host.equals("select_bank") && (queryParameter = uri.getQueryParameter("scheme")) != null) {
                                    viewModel = dKSbpFragment.getViewModel();
                                    rwo rwoVar = viewModel.B;
                                    viewModel.H = queryParameter;
                                    Iterator it = viewModel.E.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            obj2 = it.next();
                                            if (((fq4) obj2).c.equals(queryParameter)) {
                                            }
                                        } else {
                                            obj2 = null;
                                        }
                                    }
                                    fq4 fq4Var = (fq4) obj2;
                                    Boolean valueOf2 = fq4Var != null ? Boolean.valueOf(fq4Var.e) : null;
                                    if (jl40.l(valueOf2, Boolean.TRUE)) {
                                        qv90.a.getClass();
                                        ((y22) rwoVar).a(sv90.p0(queryParameter));
                                    } else if (jl40.l(valueOf2, Boolean.FALSE)) {
                                        qv90.a.getClass();
                                        ((y22) rwoVar).a(sv90.q0(queryParameter));
                                    } else if (valueOf2 != null) {
                                        w511.b();
                                        break;
                                    }
                                    viewModel.Y(queryParameter);
                                    break;
                                }
                                break;
                            case 1118875383:
                                if (host.equals("show_legal")) {
                                    activityViewModel2 = dKSbpFragment.getActivityViewModel();
                                    xc5 xc5Var = (xc5) activityViewModel2;
                                    rwo W = xc5Var.W();
                                    sv90 sv90Var = qv90.a;
                                    PsdkScreen psdkScreen = PsdkScreen.LEGAL_AGREEMENT;
                                    sv90Var.getClass();
                                    ((y22) W).a(sv90.w0(psdkScreen));
                                    xc5Var.c.l(c950.e);
                                    break;
                                }
                                break;
                        }
                    }
                }
                break;
            case 20:
                ((vjg) obj4).render((dkg) obj);
                break;
            case 21:
                final List list2 = (List) obj;
                final DashboardV3Fragment dashboardV3Fragment = (DashboardV3Fragment) obj4;
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        if (((gc5) next) instanceof yp8) {
                            obj3 = next;
                        }
                    }
                }
                Object[] objArr2 = obj3 != null;
                z = dashboardV3Fragment.initialDataComplete;
                if (z || !objArr2 == true) {
                    widgetsAdapter = dashboardV3Fragment.getWidgetsAdapter();
                    widgetsAdapter.h(list2, new Runnable() { // from class: fmg
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.ybsdk.feature.dashboard.internal.ui.dashboard3.a aVar3;
                            com.ybsdk.feature.dashboard.internal.ui.dashboard3.a aVar4;
                            switch (i2) {
                                case 0:
                                    DashboardV3Fragment dashboardV3Fragment2 = dashboardV3Fragment;
                                    dashboardV3Fragment2.requestFocusOnFirstItem();
                                    dashboardV3Fragment2.setWidgetsAnimator();
                                    aVar3 = dashboardV3Fragment2.transitionHelper;
                                    aVar3.b(list2);
                                    break;
                                default:
                                    DashboardV3Fragment dashboardV3Fragment3 = dashboardV3Fragment;
                                    dashboardV3Fragment3.setWidgetsAnimator();
                                    aVar4 = dashboardV3Fragment3.transitionHelper;
                                    aVar4.b(list2);
                                    break;
                            }
                        }
                    });
                } else {
                    widgetsAdapter2 = dashboardV3Fragment.getWidgetsAdapter();
                    final Object[] objArr3 = objArr == true ? 1 : 0;
                    widgetsAdapter2.h(list2, new Runnable() { // from class: fmg
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.ybsdk.feature.dashboard.internal.ui.dashboard3.a aVar3;
                            com.ybsdk.feature.dashboard.internal.ui.dashboard3.a aVar4;
                            switch (objArr3) {
                                case 0:
                                    DashboardV3Fragment dashboardV3Fragment2 = dashboardV3Fragment;
                                    dashboardV3Fragment2.requestFocusOnFirstItem();
                                    dashboardV3Fragment2.setWidgetsAnimator();
                                    aVar3 = dashboardV3Fragment2.transitionHelper;
                                    aVar3.b(list2);
                                    break;
                                default:
                                    DashboardV3Fragment dashboardV3Fragment3 = dashboardV3Fragment;
                                    dashboardV3Fragment3.setWidgetsAnimator();
                                    aVar4 = dashboardV3Fragment3.transitionHelper;
                                    aVar4.b(list2);
                                    break;
                            }
                        }
                    });
                    dashboardV3Fragment.initialDataComplete = true;
                }
                ligVar = dashboardV3Fragment.dashboardCollapsedAnimation;
                if (ligVar != null) {
                    ligVar.b();
                    break;
                }
                break;
            case 22:
                com.ybsdk.feature.dashboard.internal.ui.dashboard.b bVar3 = (com.ybsdk.feature.dashboard.internal.ui.dashboard.b) obj4;
                pzt0 pzt0Var = bVar3.N;
                if (pzt0Var == null || !pzt0Var.isActive()) {
                    bVar3.B0(false);
                    break;
                }
                break;
            case 23:
                ru.yandex.logistics.sdk.cargo_form.impl.domain.a aVar3 = (ru.yandex.logistics.sdk.cargo_form.impl.domain.a) obj4;
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    aVar3.a.c(entry.getValue(), (String) entry.getKey());
                }
                break;
            case 24:
                ttg ttgVar = (ttg) obj;
                dug dugVar = (dug) obj4;
                dugVar.getClass();
                if (jl40.l(ttgVar, ttg.i)) {
                    i iVar = (i) dugVar.y.get();
                    iVar.getClass();
                    iVar.e(pl21.d);
                    dugVar.x.c(az80.a);
                    break;
                } else {
                    ((utg) dugVar.Dg()).Ib(ttgVar);
                    if (!dugVar.G) {
                        yy80 yy80Var = dugVar.z;
                        OverdraftContext overdraftContext = dugVar.F;
                        rx2 rx2Var = yy80Var.d;
                        String b = yy80.b(overdraftContext);
                        boolean z2 = yy80Var.d().c;
                        boolean e = yy80Var.e();
                        boolean f = yy80Var.f();
                        double c = yy80Var.c();
                        rx2Var.getClass();
                        HashMap hashMap = new HashMap();
                        hashMap.put(MetaDataField.SCREEN_FIELD, b);
                        oo31.q(z2, hashMap, "has_overdraft", e, "is_card_available");
                        hashMap.put("is_cash_available", Boolean.valueOf(f));
                        hashMap.put("cumulative_debt", Double.valueOf(c));
                        rx2Var.a.a("DebtsInfoCard.Shown", hashMap, 1, new HashMap());
                        dugVar.G = true;
                        break;
                    }
                }
                break;
            case 25:
                ((DebugPanelViewControllerImpl) obj4).update((fwg) obj);
                break;
            case 26:
                ((d) obj4).y.l((qkg) obj);
                break;
            case 27:
                ((ru.yandex.taxi.logistics.safe_flow.a) obj4).a.c(DeliverySafeFlowNotification.NOTIFICATION_ID);
                break;
            case 28:
                if (((PriceUpdate$PriceLoadingState) obj) == PriceUpdate$PriceLoadingState.FAILED) {
                    goi goiVar = ((com.yandex.go.delivery.sdd_slots_selector.a) obj4).z.a;
                    goiVar.r(new bhh(25, goiVar));
                    break;
                }
                break;
            default:
                a7i a7iVar = (a7i) obj;
                a7iVar.getClass();
                if (!(a7iVar instanceof z6i)) {
                    ((l) obj4).J.a();
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
