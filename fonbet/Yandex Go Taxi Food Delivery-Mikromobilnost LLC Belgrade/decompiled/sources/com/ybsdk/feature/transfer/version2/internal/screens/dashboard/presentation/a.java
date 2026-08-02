package com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation;

import android.net.Uri;
import com.ybsdk.core.analytics.generated.delegates.BottomNavigationEvents$BottomNavigationClickButtonVersion;
import com.ybsdk.core.analytics.generated.delegates.TransfersDashboardEvents$TransfersDashboardNfcButtonClickSource;
import com.ybsdk.core.analytics.generated.delegates.TransfersDashboardEvents$TransfersDashboardNfcButtonClickTarget;
import com.ybsdk.core.analytics.generated.delegates.TransfersDashboardEvents$TransfersDashboardNfcButtonShowSource;
import com.ybsdk.core.analytics.generated.delegates.TransfersDashboardEvents$TransfersDashboardNfcButtonShowTarget;
import com.ybsdk.core.common.domain.entities.BottomBarItemId;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.qr.api.QrReaderContentInfo;
import com.ybsdk.feature.qr.api.QrReaderLogoImage;
import com.ybsdk.feature.transfer.version2.api.TransferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics;
import com.ybsdk.rconfig.configs.QrReaderDescription;
import com.ybsdk.widgets.common.YbButtonView;
import defpackage.bv01;
import defpackage.c06;
import defpackage.cv01;
import defpackage.ds31;
import defpackage.e960;
import defpackage.g8e;
import defpackage.h791;
import defpackage.j3h;
import defpackage.jo01;
import defpackage.ko01;
import defpackage.mjt0;
import defpackage.mv01;
import defpackage.orp0;
import defpackage.ph6;
import defpackage.qu01;
import defpackage.r3k0;
import defpackage.ro01;
import defpackage.rt1;
import defpackage.sh6;
import defpackage.tb6;
import defpackage.tje;
import defpackage.uc5;
import defpackage.v0h;
import defpackage.w4x0;
import defpackage.w511;
import defpackage.wbg0;
import defpackage.x0h;
import defpackage.x4c;
import defpackage.x4e;
import defpackage.x4x0;
import defpackage.y0h;
import defpackage.zjy0;
import defpackage.zr01;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final ro01 B;
    public final j3h C;
    public final com.ybsdk.feature.transfer.version2.internal.screens.dashboard.domain.a D;
    public final cv01 E;
    public final w4x0 F;
    public final c06 G;
    public final TransfersDashboardScreenParams H;
    public boolean I;

    public a(ro01 ro01Var, j3h j3hVar, com.ybsdk.feature.transfer.version2.internal.screens.dashboard.domain.a aVar, cv01 cv01Var, w4x0 w4x0Var, mjt0 mjt0Var, c06 c06Var, TransfersDashboardScreenParams transfersDashboardScreenParams) {
        super(new zr01(3, ro01Var, c06Var), new r3k0(ro01Var, mjt0Var, transfersDashboardScreenParams));
        this.B = ro01Var;
        this.C = j3hVar;
        this.D = aVar;
        this.E = cv01Var;
        this.F = w4x0Var;
        this.G = c06Var;
        this.H = transfersDashboardScreenParams;
    }

    public final Text b0() {
        Map map;
        ko01 entity = ((QrReaderDescription) ((qu01) this.B).b.d(wbg0.a).getData()).toEntity();
        if (this.G.p() || !entity.a || (map = entity.b) == null) {
            return null;
        }
        return (Text) map.get(this.H.getOrigin());
    }

    public final boolean c0(Uri uri, Text text) {
        cv01 cv01Var = this.E;
        cv01Var.getClass();
        if (text != null && d.b(text)) {
            rt1 rt1Var = cv01Var.a.r0;
            rt1Var.a.a("transfers_dashboard.button.click", g8e.w(1, "button_name", d.a(cv01Var.d, text).toString()));
        }
        y0h e = h791.e(this.C, uri.toString(), false, null, 14);
        if (e instanceof x0h) {
            x4c.g("[transfers-dashboard] Can't handle action", null, uri, null, 10);
        }
        return e instanceof v0h;
    }

    public final void d0(tb6 tb6Var) {
        this.E.b.a(tb6Var.a, BottomBarItemId.PAY.getId(), BottomNavigationEvents$BottomNavigationClickButtonVersion.SCREEN_BUTTON);
        sh6 sh6Var = tb6Var.e;
        if (sh6Var instanceof ph6) {
            Z(new mv01());
        } else {
            ((x4x0) this.F).b(sh6Var);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void e0(jo01 jo01Var) {
        TransfersDashboardEvents$TransfersDashboardNfcButtonClickSource transfersDashboardEvents$TransfersDashboardNfcButtonClickSource;
        TransfersDashboardEvents$TransfersDashboardNfcButtonClickTarget transfersDashboardEvents$TransfersDashboardNfcButtonClickTarget;
        TransferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics transferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics = jo01Var.d;
        TransfersDashboardScreenParams transfersDashboardScreenParams = this.H;
        if (transferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics == null) {
            x4c.g("NFC button clicked, but tokenizationProductId or targetNfcScreenAnalytics are null", null, "target=" + transferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics + "; productId=" + transfersDashboardScreenParams.getTokenizationProductId(), Collections.singletonList(orp0.f), 2);
            return;
        }
        String tokenizationProductId = transfersDashboardScreenParams.getTokenizationProductId();
        rt1 rt1Var = this.E.a.r0;
        switch (tokenizationProductId.hashCode()) {
            case -1272463739:
                if (tokenizationProductId.equals("corp_card")) {
                    transfersDashboardEvents$TransfersDashboardNfcButtonClickSource = TransfersDashboardEvents$TransfersDashboardNfcButtonClickSource.CORP_CARD;
                    break;
                }
                transfersDashboardEvents$TransfersDashboardNfcButtonClickSource = TransfersDashboardEvents$TransfersDashboardNfcButtonClickSource.UNKNOWN;
                break;
            case -819102987:
                if (tokenizationProductId.equals("credit_limit")) {
                    transfersDashboardEvents$TransfersDashboardNfcButtonClickSource = TransfersDashboardEvents$TransfersDashboardNfcButtonClickSource.CREDIT_LIMIT;
                    break;
                }
                transfersDashboardEvents$TransfersDashboardNfcButtonClickSource = TransfersDashboardEvents$TransfersDashboardNfcButtonClickSource.UNKNOWN;
                break;
            case -795192327:
                if (tokenizationProductId.equals("wallet")) {
                    transfersDashboardEvents$TransfersDashboardNfcButtonClickSource = TransfersDashboardEvents$TransfersDashboardNfcButtonClickSource.WALLET;
                    break;
                }
                transfersDashboardEvents$TransfersDashboardNfcButtonClickSource = TransfersDashboardEvents$TransfersDashboardNfcButtonClickSource.UNKNOWN;
                break;
            case 111277:
                if (tokenizationProductId.equals("pro")) {
                    transfersDashboardEvents$TransfersDashboardNfcButtonClickSource = TransfersDashboardEvents$TransfersDashboardNfcButtonClickSource.PRO;
                    break;
                }
                transfersDashboardEvents$TransfersDashboardNfcButtonClickSource = TransfersDashboardEvents$TransfersDashboardNfcButtonClickSource.UNKNOWN;
                break;
            case 109648666:
                if (tokenizationProductId.equals("split")) {
                    transfersDashboardEvents$TransfersDashboardNfcButtonClickSource = TransfersDashboardEvents$TransfersDashboardNfcButtonClickSource.UNKNOWN;
                    break;
                }
                transfersDashboardEvents$TransfersDashboardNfcButtonClickSource = TransfersDashboardEvents$TransfersDashboardNfcButtonClickSource.UNKNOWN;
                break;
            default:
                transfersDashboardEvents$TransfersDashboardNfcButtonClickSource = TransfersDashboardEvents$TransfersDashboardNfcButtonClickSource.UNKNOWN;
                break;
        }
        int i = bv01.a[transferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics.ordinal()];
        if (i == 1) {
            transfersDashboardEvents$TransfersDashboardNfcButtonClickTarget = TransfersDashboardEvents$TransfersDashboardNfcButtonClickTarget.PAYMENT;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            transfersDashboardEvents$TransfersDashboardNfcButtonClickTarget = TransfersDashboardEvents$TransfersDashboardNfcButtonClickTarget.TOKENIZATION;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put("source", transfersDashboardEvents$TransfersDashboardNfcButtonClickSource.getOriginalValue());
        linkedHashMap.put("target", transfersDashboardEvents$TransfersDashboardNfcButtonClickTarget.getOriginalValue());
        rt1Var.a.a("transfers_dashboard.nfc_button.click", linkedHashMap);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void f0(jo01 jo01Var) {
        TransfersDashboardEvents$TransfersDashboardNfcButtonShowSource transfersDashboardEvents$TransfersDashboardNfcButtonShowSource;
        TransfersDashboardEvents$TransfersDashboardNfcButtonShowTarget transfersDashboardEvents$TransfersDashboardNfcButtonShowTarget;
        if (jo01Var == null || this.I) {
            return;
        }
        TransferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics transferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics = jo01Var.d;
        TransfersDashboardScreenParams transfersDashboardScreenParams = this.H;
        if (transferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics == null) {
            x4c.g("NFC button shown, but tokenizationProductId or targetNfcScreenAnalytics are null", null, "target=" + transferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics + "; productId=" + transfersDashboardScreenParams.getTokenizationProductId(), Collections.singletonList(orp0.f), 2);
            return;
        }
        String tokenizationProductId = transfersDashboardScreenParams.getTokenizationProductId();
        rt1 rt1Var = this.E.a.r0;
        switch (tokenizationProductId.hashCode()) {
            case -1272463739:
                if (tokenizationProductId.equals("corp_card")) {
                    transfersDashboardEvents$TransfersDashboardNfcButtonShowSource = TransfersDashboardEvents$TransfersDashboardNfcButtonShowSource.CORP_CARD;
                    break;
                }
                transfersDashboardEvents$TransfersDashboardNfcButtonShowSource = TransfersDashboardEvents$TransfersDashboardNfcButtonShowSource.UNKNOWN;
                break;
            case -819102987:
                if (tokenizationProductId.equals("credit_limit")) {
                    transfersDashboardEvents$TransfersDashboardNfcButtonShowSource = TransfersDashboardEvents$TransfersDashboardNfcButtonShowSource.CREDIT_LIMIT;
                    break;
                }
                transfersDashboardEvents$TransfersDashboardNfcButtonShowSource = TransfersDashboardEvents$TransfersDashboardNfcButtonShowSource.UNKNOWN;
                break;
            case -795192327:
                if (tokenizationProductId.equals("wallet")) {
                    transfersDashboardEvents$TransfersDashboardNfcButtonShowSource = TransfersDashboardEvents$TransfersDashboardNfcButtonShowSource.WALLET;
                    break;
                }
                transfersDashboardEvents$TransfersDashboardNfcButtonShowSource = TransfersDashboardEvents$TransfersDashboardNfcButtonShowSource.UNKNOWN;
                break;
            case 111277:
                if (tokenizationProductId.equals("pro")) {
                    transfersDashboardEvents$TransfersDashboardNfcButtonShowSource = TransfersDashboardEvents$TransfersDashboardNfcButtonShowSource.PRO;
                    break;
                }
                transfersDashboardEvents$TransfersDashboardNfcButtonShowSource = TransfersDashboardEvents$TransfersDashboardNfcButtonShowSource.UNKNOWN;
                break;
            case 109648666:
                if (tokenizationProductId.equals("split")) {
                    transfersDashboardEvents$TransfersDashboardNfcButtonShowSource = TransfersDashboardEvents$TransfersDashboardNfcButtonShowSource.UNKNOWN;
                    break;
                }
                transfersDashboardEvents$TransfersDashboardNfcButtonShowSource = TransfersDashboardEvents$TransfersDashboardNfcButtonShowSource.UNKNOWN;
                break;
            default:
                transfersDashboardEvents$TransfersDashboardNfcButtonShowSource = TransfersDashboardEvents$TransfersDashboardNfcButtonShowSource.UNKNOWN;
                break;
        }
        int i = bv01.a[transferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics.ordinal()];
        if (i == 1) {
            transfersDashboardEvents$TransfersDashboardNfcButtonShowTarget = TransfersDashboardEvents$TransfersDashboardNfcButtonShowTarget.PAYMENT;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            transfersDashboardEvents$TransfersDashboardNfcButtonShowTarget = TransfersDashboardEvents$TransfersDashboardNfcButtonShowTarget.TOKENIZATION;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put("source", transfersDashboardEvents$TransfersDashboardNfcButtonShowSource.getOriginalValue());
        linkedHashMap.put("target", transfersDashboardEvents$TransfersDashboardNfcButtonShowTarget.getOriginalValue());
        rt1Var.a.a("transfers_dashboard.nfc_button.show", linkedHashMap);
        this.I = true;
    }

    public final void g0() {
        Text text;
        CharSequence a;
        QrReaderLogoImage image;
        String origin = this.H.getOrigin();
        cv01 cv01Var = this.E;
        cv01Var.getClass();
        ArrayList arrayList = new ArrayList();
        qu01 qu01Var = (qu01) cv01Var.c;
        QrReaderContentInfo info = qu01Var.b.h().getInfo();
        if (((info == null || (image = info.getImage()) == null) ? null : image.toImageModel()) != null) {
            arrayList.add("info");
        }
        Iterator it = qu01Var.a().iterator();
        while (it.hasNext()) {
            YbButtonView.a aVar = ((jo01) it.next()).a;
            if (aVar == null) {
                aVar = null;
            }
            if (aVar != null && (text = aVar.a) != null && (a = d.a(cv01Var.d, text)) != null) {
                arrayList.add(a.toString());
            }
        }
        cv01Var.a.r0.a.a("transfers_dashboard.screen.opened", x4e.t(2, "buttons_shown", kotlin.collections.a.X(arrayList, ",", null, null, null, 62), "origin", origin));
        tje.N(ds31.a(this), null, null, new TransfersDashboardViewModel$onRequestDashboardData$1(this, null), 3);
    }

    public final void h0(List list, e960 e960Var) {
        a0(new zjy0(10, list, e960Var, this));
    }
}
