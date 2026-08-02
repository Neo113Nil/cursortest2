package com.ybsdk.feature.dashboard.internal.ui.dashboard;

import android.content.SharedPreferences;
import android.net.Uri;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.HomeScreenEvents$HomeScreenLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrIconClickedSource;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.di.modules.features.e;
import com.ybsdk.di.modules.features.g;
import com.ybsdk.feature.dashboard.api.DashboardScreenParams;
import com.ybsdk.feature.dashboard.api.DashboardUserIdentificationStatusEntity;
import com.ybsdk.feature.dashboard.api.model.ProductId;
import com.ybsdk.feature.dashboard.api.model.SupportState;
import com.ybsdk.feature.dashboard.internal.domain.entities.NextPageLoadingStatus;
import com.ybsdk.feature.dashboard.internal.domain.entities.TopButtonTag;
import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.feature.transfer.version2.api.TransferDirection;
import com.ybsdk.feature.transfer.version2.api.TransferMainScreenArguments;
import com.ybsdk.rconfig.YbCommonUrlsImpl;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.screens.menu.presentation.MenuFragment;
import defpackage.ajg;
import defpackage.awa0;
import defpackage.bwz0;
import defpackage.clg;
import defpackage.cwc;
import defpackage.djg;
import defpackage.dlg;
import defpackage.dng;
import defpackage.ds31;
import defpackage.em3;
import defpackage.g8e;
import defpackage.gly0;
import defpackage.h791;
import defpackage.hh5;
import defpackage.hz91;
import defpackage.j3h;
import defpackage.ju01;
import defpackage.kq51;
import defpackage.l3h;
import defpackage.lq51;
import defpackage.mq51;
import defpackage.nq51;
import defpackage.ny61;
import defpackage.oq51;
import defpackage.ov3;
import defpackage.phg;
import defpackage.pig;
import defpackage.plg;
import defpackage.ppc;
import defpackage.ppp0;
import defpackage.pq51;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.qis;
import defpackage.qoi0;
import defpackage.r8j0;
import defpackage.rkg;
import defpackage.s8j0;
import defpackage.sb0;
import defpackage.skw0;
import defpackage.tfl0;
import defpackage.thg;
import defpackage.tje;
import defpackage.u8j0;
import defpackage.uc5;
import defpackage.v0h;
import defpackage.v8e;
import defpackage.vhg;
import defpackage.w511;
import defpackage.x4c;
import defpackage.x5t;
import defpackage.xj1;
import defpackage.yig;
import defpackage.zva0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class b extends uc5 {
    public final com.ybsdk.feature.dashboard.internal.domain.interactors.b B;
    public final hh5 C;
    public final AppAnalyticsReporter D;
    public final awa0 E;
    public final tfl0 F;
    public final DashboardScreenParams G;
    public final j3h H;
    public final com.ybsdk.feature.banners.impl.domain.interactors.a I;
    public final yig J;
    public final g K;
    public final com.ybsdk.feature.dashboard.internal.domain.interactors.a L;
    public final rkg M;
    public pzt0 N;
    public pzt0 O;
    public pzt0 P;
    public pzt0 Q;
    public pzt0 R;
    public pzt0 S;

    public b(com.ybsdk.feature.dashboard.internal.domain.interactors.b bVar, hh5 hh5Var, dlg dlgVar, AppAnalyticsReporter appAnalyticsReporter, awa0 awa0Var, ppp0 ppp0Var, tfl0 tfl0Var, DashboardScreenParams dashboardScreenParams, j3h j3hVar, com.ybsdk.feature.banners.impl.domain.interactors.a aVar, yig yigVar, gly0 gly0Var, g gVar, com.ybsdk.feature.dashboard.internal.domain.interactors.a aVar2, rkg rkgVar, djg djgVar, clg clgVar) {
        super(new sb0(24, dashboardScreenParams, dlgVar, djgVar), new v8e(9, dlgVar));
        this.B = bVar;
        this.C = hh5Var;
        this.D = appAnalyticsReporter;
        this.E = awa0Var;
        this.F = tfl0Var;
        this.G = dashboardScreenParams;
        this.H = j3hVar;
        this.I = aVar;
        this.J = yigVar;
        this.K = gVar;
        this.L = aVar2;
        this.M = rkgVar;
        ajg ajgVar = (ajg) clgVar;
        ajgVar.a();
        c.a(ajgVar.c.a, ds31.a(this), new cwc(22, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b0(b bVar, ContinuationImpl continuationImpl) {
        DashboardViewModel$updateSupportMessagesState$1 dashboardViewModel$updateSupportMessagesState$1;
        int i;
        SupportState supportState;
        pz40 Y;
        r0 r0Var;
        Object value;
        bVar.getClass();
        if (continuationImpl instanceof DashboardViewModel$updateSupportMessagesState$1) {
            dashboardViewModel$updateSupportMessagesState$1 = (DashboardViewModel$updateSupportMessagesState$1) continuationImpl;
            int i2 = dashboardViewModel$updateSupportMessagesState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dashboardViewModel$updateSupportMessagesState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dashboardViewModel$updateSupportMessagesState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dashboardViewModel$updateSupportMessagesState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    g gVar = bVar.K;
                    dashboardViewModel$updateSupportMessagesState$1.label = 1;
                    obj = gVar.a(dashboardViewModel$updateSupportMessagesState$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                supportState = (SupportState) obj;
                Y = bVar.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, plg.a((plg) value, null, supportState, null, null, 2031)));
                bVar.F0();
                return zy11.a;
            }
        }
        dashboardViewModel$updateSupportMessagesState$1 = new DashboardViewModel$updateSupportMessagesState$1(bVar, continuationImpl);
        Object obj3 = dashboardViewModel$updateSupportMessagesState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dashboardViewModel$updateSupportMessagesState$1.label;
        if (i != 0) {
        }
        supportState = (SupportState) obj3;
        Y = bVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, plg.a((plg) value, null, supportState, null, null, 2031)));
        bVar.F0();
        return zy11.a;
    }

    public final void A0() {
        xj1 xj1Var;
        pig pigVar = (pig) ((plg) X()).d.a();
        String str = (pigVar == null || (xj1Var = pigVar.c) == null) ? null : xj1Var.a;
        ProductId f0 = f0();
        pzt0 pzt0Var = this.R;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.R = tje.N(ds31.a(this), null, null, new DashboardViewModel$reloadCardState$1(this, f0, str, null), 3);
    }

    public final void B0(boolean z) {
        this.D.D.a.a("home_screen.initiated", null);
        String e0 = e0("Dashboard.Data");
        awa0 awa0Var = this.E;
        zva0 b = awa0Var.b(e0);
        zva0 b2 = awa0Var.b(e0("Dashboard.Data.Fail"));
        zva0 b3 = awa0Var.b(e0("Dashboard.Data.Success"));
        pzt0 pzt0Var = this.N;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.N = tje.N(ds31.a(this), null, null, new DashboardViewModel$requestData$1(this, b, b3, z, b2, null), 3);
    }

    public final boolean C0(Uri uri) {
        return h791.d(this.H, uri, 14) instanceof v0h;
    }

    public final void D0() {
        this.J.a.a.edit().putBoolean("need_show_auto_topup_tooltip", false).apply();
    }

    public final void E0(qis qisVar) {
        tje.N(ds31.a(this), null, null, new DashboardViewModel$showFullscreen$1(this, qisVar, null), 3);
    }

    public final void F0() {
        x5t x5tVar;
        r0 r0Var;
        Object value;
        pig pigVar = (pig) ((plg) X()).d.a();
        if (pigVar == null || (x5tVar = pigVar.d) == null) {
            return;
        }
        List list = x5tVar.f;
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            bwz0 bwz0Var = (bwz0) it.next();
            if (bwz0Var.c == TopButtonTag.SUPPORT_URL && !bwz0Var.b.equals(skw0.a(((plg) X()).e))) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            ArrayList arrayList = new ArrayList(list);
            bwz0 bwz0Var2 = (bwz0) list.get(i);
            arrayList.set(i, new bwz0(bwz0Var2.a, skw0.a(((plg) X()).e), bwz0Var2.c, bwz0Var2.d));
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, plg.a((plg) value, new r8j0(pig.a(pigVar, x5t.a(x5tVar, null, arrayList, null, 991)), null, 14), null, null, null, 2039)));
        }
    }

    @Override // defpackage.yr31
    public final void V() {
        pzt0 pzt0Var = this.N;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = this.Q;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
    }

    public final void c0() {
        pzt0 pzt0Var = this.N;
        if (pzt0Var != null && !pzt0Var.isActive()) {
            this.D.D.f("show only", HomeScreenEvents$HomeScreenLoadedResult.OK, null);
        }
        this.P = tje.N(ds31.a(this), null, null, new DashboardViewModel$attachView$1(this, null), 3);
    }

    public final void d0() {
        pzt0 pzt0Var = this.P;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.P = null;
    }

    public final String e0(String str) {
        return str + Extension.DOT_CHAR + this.G.getProductId();
    }

    public final ProductId f0() {
        ProductId productId;
        DashboardScreenParams dashboardScreenParams = this.G;
        if (dashboardScreenParams == null) {
            dashboardScreenParams = null;
        }
        return (dashboardScreenParams == null || (productId = dashboardScreenParams.getProductId()) == null) ? ProductId.WALLET : productId;
    }

    public final void g0() {
        r0 r0Var;
        Object value;
        pig pigVar = (pig) ((plg) X()).d.a();
        if (pigVar == null) {
            return;
        }
        x5t x5tVar = pigVar.d;
        if ((x5tVar != null ? x5tVar.g : null) != null) {
            NextPageLoadingStatus nextPageLoadingStatus = x5tVar.h;
            NextPageLoadingStatus nextPageLoadingStatus2 = NextPageLoadingStatus.IN_PROGRESS;
            if (nextPageLoadingStatus == nextPageLoadingStatus2) {
                return;
            }
            r8j0 r8j0Var = new r8j0(pig.a(pigVar, x5t.a(x5tVar, null, null, nextPageLoadingStatus2, 895)), null, 14);
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, plg.a((plg) value, r8j0Var, null, null, null, 2039)));
            pzt0 pzt0Var = this.O;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            this.O = tje.N(ds31.a(this), null, null, new DashboardViewModel$loadNextDivKitListPage$2(this, null), 3);
        }
    }

    public final void h0() {
        x5t x5tVar;
        pig pigVar = (pig) ((plg) X()).d.a();
        phg phgVar = (pigVar == null || (x5tVar = pigVar.d) == null) ? null : x5tVar.j;
        if (phgVar == null) {
            x4c.g("Bottom button clicked, but action is absent", null, null, null, 14);
            return;
        }
        String str = phgVar.c;
        this.D.s.a.a("dashboard.bottom_button_clicked", g8e.w(1, "action", str));
        h791.e(this.H, str, false, null, 14);
    }

    public final void i0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, plg.a((plg) value, null, null, null, null, 1983)));
    }

    public final void j0() {
        r0 r0Var;
        Object value;
        DashboardBottomSheetType dashboardBottomSheetType = ((plg) X()).g;
        int i = dashboardBottomSheetType == null ? -1 : dng.b[dashboardBottomSheetType.ordinal()];
        if (i != -1 && i != 1 && i != 2) {
            w511.b();
            return;
        }
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, plg.a((plg) value, null, null, null, null, 1983)));
    }

    public final void k0() {
        r0 r0Var;
        Object value;
        DashboardBottomSheetType dashboardBottomSheetType = ((plg) X()).g;
        int i = dashboardBottomSheetType == null ? -1 : dng.b[dashboardBottomSheetType.ordinal()];
        if (i != -1 && i != 1 && i != 2) {
            w511.b();
            return;
        }
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, plg.a((plg) value, null, null, null, null, 1983)));
    }

    public final void l0() {
        vhg vhgVar = ((plg) X()).k;
        thg thgVar = vhgVar instanceof thg ? (thg) vhgVar : null;
        String str = thgVar != null ? thgVar.b : null;
        vhg vhgVar2 = ((plg) X()).k;
        thg thgVar2 = vhgVar2 instanceof thg ? (thg) vhgVar2 : null;
        hz91 hz91Var = thgVar2 != null ? thgVar2.a : null;
        boolean z = hz91Var instanceof kq51;
        j3h j3hVar = this.H;
        if (z) {
            if (str != null) {
                h791.e(j3hVar, str, false, null, 14);
                return;
            }
            return;
        }
        if (hz91Var instanceof nq51) {
            if (str != null) {
                h791.e(j3hVar, str, false, null, 14);
                return;
            }
            return;
        }
        if (hz91Var instanceof mq51) {
            y0();
            return;
        }
        if (hz91Var instanceof pq51) {
            y0();
            return;
        }
        if (hz91Var instanceof oq51) {
            y0();
        } else if (hz91Var instanceof lq51) {
            A0();
        } else {
            if (hz91Var == null) {
                return;
            }
            w511.b();
        }
    }

    public final void m0() {
        String supportUrl;
        u8j0 u8j0Var = ((plg) X()).d;
        s8j0 s8j0Var = u8j0Var instanceof s8j0 ? (s8j0) u8j0Var : null;
        Throwable th = s8j0Var != null ? s8j0Var.a : null;
        FailDataException failDataException = th instanceof FailDataException ? (FailDataException) th : null;
        if (failDataException == null || (supportUrl = failDataException.getSupportUrl()) == null) {
            return;
        }
        h791.f(this.H, supportUrl, com.ybsdk.feature.webview.api.a.b(((e) this.M).b, supportUrl, null, null, 6));
    }

    public final void n0() {
        x5t x5tVar;
        pig pigVar = (pig) ((plg) X()).d.a();
        if (((pigVar == null || (x5tVar = pigVar.d) == null) ? null : x5tVar.h) != NextPageLoadingStatus.ERROR) {
            g0();
        }
    }

    public final void o0() {
        this.D.D.a.a("home_screen.menu.click", null);
        ((e) this.M).getClass();
        this.F.h(new FragmentScreen("MenuScreen", false, null, TransitionPolicyType.POPUP, qoi0.a(MenuFragment.class), OpenScreenRequirement.WithYbSession.INSTANCE, 6, null));
    }

    public final void p0() {
        pzt0 pzt0Var = this.S;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
    }

    public final void q0() {
        xj1 xj1Var;
        this.D.Y.x(QrPaymentEvents$QrIconClickedSource.DASHBOARD);
        pig pigVar = (pig) ((plg) X()).d.a();
        ((e) this.M).a(((plg) X()).a, (pigVar == null || (xj1Var = pigVar.c) == null) ? null : xj1Var.a);
    }

    public final void r0() {
        xj1 xj1Var;
        pig pigVar = (pig) ((plg) X()).d.a();
        String str = (pigVar == null || (xj1Var = pigVar.c) == null) ? null : xj1Var.a;
        ju01 ju01Var = ((e) this.M).c;
        this.F.h(com.ybsdk.feature.transfer.version2.internal.screens.a.f(new TransferMainScreenArguments(TransferDirection.TOPUP, str, null, null, false, false, null, null, null, null, null, 1984, null)));
    }

    public final void s0() {
        pzt0 pzt0Var = this.N;
        if (pzt0Var == null || !pzt0Var.isActive()) {
            A0();
        }
        pzt0 pzt0Var2 = this.Q;
        if (pzt0Var2 == null || !pzt0Var2.isActive()) {
            pzt0 pzt0Var3 = this.Q;
            if (pzt0Var3 != null) {
                pzt0Var3.a(null);
            }
            this.Q = tje.N(ds31.a(this), null, null, new DashboardViewModel$subscribeToCardStatus$1(this, null), 3);
        }
    }

    public final void t0() {
        B0(false);
    }

    public final void u0() {
        em3 em3Var = this.D.s;
        String name = f0().name();
        String productType = this.G.getProductType();
        LinkedHashMap w = g8e.w(2, "product_id", name);
        if (productType != null) {
            w.put("product_type", productType);
        }
        em3Var.a.a("dashboard.support.clicked", w);
        e eVar = (e) this.M;
        com.ybsdk.rconfig.b bVar = eVar.d;
        com.ybsdk.rconfig.a aVar = bVar.i;
        YbCommonUrlsImpl ybCommonUrlsImpl = (YbCommonUrlsImpl) bVar.d(aVar.e).getData();
        YbCommonUrlsImpl ybCommonUrlsImpl2 = (YbCommonUrlsImpl) aVar.e.c.getData();
        String helpCenterPlusCard = ybCommonUrlsImpl.getHelpCenterPlusCard();
        if (helpCenterPlusCard.length() == 0) {
            helpCenterPlusCard = ybCommonUrlsImpl2.getHelpCenterPlusCard();
        }
        h791.f(eVar.a, helpCenterPlusCard, ((com.ybsdk.feature.webview.internal.a) eVar.b).f(helpCenterPlusCard));
    }

    public final void v0(String str, TopButtonTag topButtonTag) {
        if (topButtonTag == TopButtonTag.SUPPORT_URL) {
            em3 em3Var = this.D.s;
            String name = f0().name();
            String productType = this.G.getProductType();
            LinkedHashMap w = g8e.w(2, "product_id", name);
            if (productType != null) {
                w.put("product_type", productType);
            }
            em3Var.a.a("dashboard.support.clicked", w);
        }
        h791.e(this.H, str, false, null, 14);
    }

    public final void w0() {
        r0 r0Var;
        Object value;
        xj1 xj1Var;
        String str = null;
        this.D.D.a.a("home_screen.transfer.click", null);
        pig pigVar = (pig) ((plg) X()).d.a();
        DashboardUserIdentificationStatusEntity dashboardUserIdentificationStatusEntity = pigVar != null ? pigVar.b : null;
        int i = dashboardUserIdentificationStatusEntity == null ? -1 : dng.a[dashboardUserIdentificationStatusEntity.ordinal()];
        if (i != -1) {
            rkg rkgVar = this.M;
            if (i == 1) {
                pz40 Y = Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, plg.a((plg) value, null, null, null, null, 1983)));
                ((l3h) ((e) rkgVar).a).d(new Deeplink(DeeplinkAction.SimplifiedIdInfo.INSTANCE, null, null, null, null, null, false, false, 254, null));
                return;
            }
            if (i == 2 || i == 3 || i == 4) {
                pig pigVar2 = (pig) ((plg) X()).d.a();
                if (pigVar2 != null && (xj1Var = pigVar2.c) != null) {
                    str = xj1Var.a;
                }
                ju01 ju01Var = ((e) rkgVar).c;
                this.F.h(com.ybsdk.feature.transfer.version2.internal.screens.a.f(new TransferMainScreenArguments(TransferDirection.TRANSFER, str, null, null, false, false, null, null, null, null, null, 1984, null)));
                return;
            }
            if (i != 5) {
                w511.b();
                return;
            }
        }
        x4c.g("Transfer button clicked in wrong state", null, null, null, 14);
    }

    public final void x0() {
        ((e) this.M).getClass();
        this.F.h(new FragmentScreen("MenuScreen", false, null, TransitionPolicyType.POPUP, qoi0.a(MenuFragment.class), OpenScreenRequirement.WithYbSession.INSTANCE, 6, null));
    }

    public final void y0() {
        xj1 xj1Var;
        pig pigVar = (pig) ((plg) X()).d.a();
        String str = (pigVar == null || (xj1Var = pigVar.c) == null) ? null : xj1Var.a;
        vhg vhgVar = ((plg) X()).k;
        thg thgVar = vhgVar instanceof thg ? (thg) vhgVar : null;
        if ((thgVar != null ? thgVar.b : null) != null) {
            if (str != null) {
                hz91 hz91Var = thgVar.a;
                hh5 hh5Var = this.C;
                hh5Var.getClass();
                if (hz91Var != null) {
                    ppc ppcVar = ((ov3) hh5Var.b).a;
                    SharedPreferences sharedPreferences = ppcVar.a;
                    if ((hz91Var instanceof mq51) && ((mq51) hz91Var).e) {
                        sharedPreferences.edit().putInt("card_interactions_count_".concat(str), ppcVar.a.getInt("card_interactions_count_".concat(str), 0) + 1).apply();
                    }
                    if ((hz91Var instanceof pq51) && ((pq51) hz91Var).d) {
                        sharedPreferences.edit().putInt("card_plastic_suggest_interactions_count_".concat(str), ppcVar.a.getInt("card_plastic_suggest_interactions_count_".concat(str), 0) + 1).apply();
                    }
                }
            }
            h791.e(this.H, thgVar.b, false, null, 14);
        }
    }

    public final void z0() {
        B0(false);
    }
}
