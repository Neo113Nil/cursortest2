package defpackage;

import com.yandex.go.scooters.analytics.ScootersAnalytics$ScootersMosRuModalButtonName;
import com.yandex.go.scooters.analytics.ScootersAnalytics$ScootersMosRuModalFromScreen;
import com.yandex.go.scooters.analytics.ScootersAnalytics$ScootersMosRuModalOpenReason;
import com.yandex.go.scooters.analytics.ScootersAnalytics$ScootersMosRuWebViewAuthorizationStatus;
import com.yandex.go.scooters.analytics.ScootersAnalytics$ScootersMosRuWebViewOpenReason;
import com.yandex.go.scooters.analytics.ScootersAnalytics$ScootersTopBarReasonName;
import com.yandex.go.scooters.mosru.api.analytics.ScootersMosRuAnalyticsFromScreen;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.NoSuchElementException;
import kotlin.collections.a;

/* loaded from: classes13.dex */
public final class czn0 {
    public final qxm0 a;
    public final ArrayList b = new ArrayList();

    public czn0(qxm0 qxm0Var) {
        this.a = qxm0Var;
    }

    public final void a() {
        try {
            kp50.M(this.b);
        } catch (NoSuchElementException e) {
            jst.e.k(e, "Scooters.MosRu: tracking screens stack empty");
        }
    }

    public final void b(zyn0 zyn0Var) {
        ScootersAnalytics$ScootersMosRuWebViewAuthorizationStatus scootersAnalytics$ScootersMosRuWebViewAuthorizationStatus;
        ScootersAnalytics$ScootersMosRuWebViewOpenReason scootersAnalytics$ScootersMosRuWebViewOpenReason;
        ScootersAnalytics$ScootersMosRuModalButtonName scootersAnalytics$ScootersMosRuModalButtonName;
        ScootersAnalytics$ScootersMosRuModalFromScreen scootersAnalytics$ScootersMosRuModalFromScreen;
        ScootersAnalytics$ScootersMosRuModalOpenReason scootersAnalytics$ScootersMosRuModalOpenReason;
        boolean z = zyn0Var instanceof tyn0;
        qxm0 qxm0Var = this.a;
        if (z) {
            tyn0 tyn0Var = (tyn0) zyn0Var;
            ScootersMosRuAnalyticsFromScreen scootersMosRuAnalyticsFromScreen = tyn0Var.a;
            if (scootersMosRuAnalyticsFromScreen == null && (scootersMosRuAnalyticsFromScreen = (ScootersMosRuAnalyticsFromScreen) a.b0(this.b)) == null) {
                scootersMosRuAnalyticsFromScreen = ScootersMosRuAnalyticsFromScreen.DISCOVERY;
            }
            int i = bzn0.a[scootersMosRuAnalyticsFromScreen.ordinal()];
            if (i == 1) {
                scootersAnalytics$ScootersMosRuModalFromScreen = ScootersAnalytics$ScootersMosRuModalFromScreen.Finish;
            } else if (i == 2) {
                scootersAnalytics$ScootersMosRuModalFromScreen = ScootersAnalytics$ScootersMosRuModalFromScreen.Discovery;
            } else if (i == 3) {
                scootersAnalytics$ScootersMosRuModalFromScreen = ScootersAnalytics$ScootersMosRuModalFromScreen.Offer;
            } else {
                if (i != 4) {
                    w511.b();
                    return;
                }
                scootersAnalytics$ScootersMosRuModalFromScreen = ScootersAnalytics$ScootersMosRuModalFromScreen.ActiveRide;
            }
            int i2 = bzn0.b[tyn0Var.b.ordinal()];
            if (i2 == 1) {
                scootersAnalytics$ScootersMosRuModalOpenReason = ScootersAnalytics$ScootersMosRuModalOpenReason.Trigger;
            } else if (i2 == 2) {
                scootersAnalytics$ScootersMosRuModalOpenReason = ScootersAnalytics$ScootersMosRuModalOpenReason.TopBar;
            } else {
                if (i2 != 3) {
                    w511.b();
                    return;
                }
                scootersAnalytics$ScootersMosRuModalOpenReason = ScootersAnalytics$ScootersMosRuModalOpenReason.Shortcut;
            }
            HashMap p = tse0.p(qxm0Var);
            p.put("from_screen", scootersAnalytics$ScootersMosRuModalFromScreen.getEventValue());
            p.put("open_reason", scootersAnalytics$ScootersMosRuModalOpenReason.getEventValue());
            qxm0Var.a.a("Scooters.MosRuModal.Opened", p, 1, new HashMap());
            return;
        }
        if (zyn0Var.equals(qtb1.O)) {
            qxm0Var.a.a("Scooters.MosRuModal.Closed", tse0.p(qxm0Var), 1, new HashMap());
            return;
        }
        if (zyn0Var instanceof syn0) {
            int i3 = bzn0.c[((syn0) zyn0Var).a.ordinal()];
            if (i3 == 1) {
                scootersAnalytics$ScootersMosRuModalButtonName = ScootersAnalytics$ScootersMosRuModalButtonName.Authorize;
            } else {
                if (i3 != 2) {
                    w511.b();
                    return;
                }
                scootersAnalytics$ScootersMosRuModalButtonName = ScootersAnalytics$ScootersMosRuModalButtonName.Close;
            }
            HashMap p2 = tse0.p(qxm0Var);
            p2.put("button_name", scootersAnalytics$ScootersMosRuModalButtonName.getEventValue());
            qxm0Var.a.a("Scooters.MosRuModal.Tapped", p2, 1, new HashMap());
            return;
        }
        if (zyn0Var instanceof uyn0) {
            qxm0Var.a.a("Scooters.MosRuShortcut.Tapped", tse0.p(qxm0Var), 1, new HashMap());
            return;
        }
        if (zyn0Var instanceof yyn0) {
            int i4 = bzn0.e[((yyn0) zyn0Var).a.ordinal()];
            if (i4 == 1) {
                scootersAnalytics$ScootersMosRuWebViewOpenReason = ScootersAnalytics$ScootersMosRuWebViewOpenReason.Deeplink;
            } else {
                if (i4 != 2) {
                    w511.b();
                    return;
                }
                scootersAnalytics$ScootersMosRuWebViewOpenReason = ScootersAnalytics$ScootersMosRuWebViewOpenReason.Modal;
            }
            HashMap p3 = tse0.p(qxm0Var);
            p3.put("open_reason", scootersAnalytics$ScootersMosRuWebViewOpenReason.getEventValue());
            qxm0Var.a.a("Scooters.MosRuWebView.Opened", p3, 1, new HashMap());
            return;
        }
        if (zyn0Var instanceof xyn0) {
            int i5 = bzn0.d[((xyn0) zyn0Var).a.ordinal()];
            if (i5 == 1) {
                scootersAnalytics$ScootersMosRuWebViewAuthorizationStatus = ScootersAnalytics$ScootersMosRuWebViewAuthorizationStatus.Success;
            } else if (i5 == 2) {
                scootersAnalytics$ScootersMosRuWebViewAuthorizationStatus = ScootersAnalytics$ScootersMosRuWebViewAuthorizationStatus.Failure;
            } else {
                if (i5 != 3) {
                    w511.b();
                    return;
                }
                scootersAnalytics$ScootersMosRuWebViewAuthorizationStatus = ScootersAnalytics$ScootersMosRuWebViewAuthorizationStatus.Canceled;
            }
            HashMap p4 = tse0.p(qxm0Var);
            p4.put("authorization_status", scootersAnalytics$ScootersMosRuWebViewAuthorizationStatus.getEventValue());
            qxm0Var.a.a("Scooters.MosRuWebView.Closed", p4, 1, new HashMap());
            return;
        }
        if (zyn0Var instanceof wyn0) {
            ScootersAnalytics$ScootersTopBarReasonName scootersAnalytics$ScootersTopBarReasonName = ScootersAnalytics$ScootersTopBarReasonName.MosRu;
            HashMap p5 = tse0.p(qxm0Var);
            p5.put("reason_name", scootersAnalytics$ScootersTopBarReasonName.getEventValue());
            qxm0Var.a.a("Scooters.TopBar.Shown", p5, 1, new HashMap());
            return;
        }
        if (!(zyn0Var instanceof vyn0)) {
            w511.b();
            return;
        }
        ScootersAnalytics$ScootersTopBarReasonName scootersAnalytics$ScootersTopBarReasonName2 = ScootersAnalytics$ScootersTopBarReasonName.MosRu;
        HashMap p6 = tse0.p(qxm0Var);
        p6.put("reason_name", scootersAnalytics$ScootersTopBarReasonName2.getEventValue());
        qxm0Var.a.a("Scooters.TopBar.Tapped", p6, 1, new HashMap());
    }
}
