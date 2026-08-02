package com.ybsdk.feature.qr.internal.screens.reader.presentation;

import android.content.SharedPreferences;
import android.net.Uri;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrAllowCameraInitiatedType;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrAllowCameraResultResult;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrCameraLightningClickedStatus;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrDeeplinkOpenResultResult;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrRecognizedSource;
import com.ybsdk.core.permissions.RequestPermissionResult;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import com.ybsdk.feature.qr.api.QrReaderContentInfo;
import com.ybsdk.feature.qr.api.QrReaderScreenType;
import com.ybsdk.rconfig.configs.QrErrorMessage;
import com.ybsdk.rconfig.configs.QrErrorMessagesConfig;
import com.ybsdk.rconfig.configs.QrRulesErrorContent;
import com.ybsdk.rconfig.model.ThemedImage;
import defpackage.a7g0;
import defpackage.dfr;
import defpackage.ds31;
import defpackage.dtj0;
import defpackage.evu0;
import defpackage.f7g0;
import defpackage.ffx;
import defpackage.fob1;
import defpackage.fu51;
import defpackage.fzw;
import defpackage.g7g0;
import defpackage.g8e;
import defpackage.gdf0;
import defpackage.i3y;
import defpackage.i5z0;
import defpackage.icg0;
import defpackage.jcg0;
import defpackage.jdg0;
import defpackage.jl40;
import defpackage.l7g0;
import defpackage.mcg0;
import defpackage.mth;
import defpackage.mv3;
import defpackage.ncg0;
import defpackage.ny61;
import defpackage.nzs;
import defpackage.odg0;
import defpackage.pcg0;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.qcg0;
import defpackage.qdg0;
import defpackage.qtc0;
import defpackage.qya0;
import defpackage.rcg0;
import defpackage.rt1;
import defpackage.scg0;
import defpackage.tcc;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.ubg0;
import defpackage.uc5;
import defpackage.ucg0;
import defpackage.vyf0;
import defpackage.w511;
import defpackage.xcg0;
import defpackage.y4a0;
import defpackage.y6g0;
import defpackage.z6g0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes3.dex */
public final class b extends uc5 implements qya0 {
    public final com.ybsdk.di.modules.mediators.a B;
    public final AppAnalyticsReporter C;
    public final tfl0 D;
    public final a7g0 E;
    public final l7g0 F;
    public final jdg0 G;
    public final QrReaderScreenParams H;
    public final ubg0 I;
    public final com.ybsdk.feature.qr.api.domain.a J;
    public final i3y K;
    public final boolean L;
    public final n0 M;
    public pzt0 N;

    public b(com.ybsdk.di.modules.mediators.a aVar, xcg0 xcg0Var, AppAnalyticsReporter appAnalyticsReporter, tfl0 tfl0Var, a7g0 a7g0Var, l7g0 l7g0Var, jdg0 jdg0Var, QrReaderScreenParams qrReaderScreenParams, ubg0 ubg0Var, com.ybsdk.feature.qr.api.domain.a aVar2) {
        super(new vyf0(4, jdg0Var), xcg0Var);
        this.B = aVar;
        this.C = appAnalyticsReporter;
        this.D = tfl0Var;
        this.E = a7g0Var;
        this.F = l7g0Var;
        this.G = jdg0Var;
        this.H = qrReaderScreenParams;
        this.I = ubg0Var;
        this.J = aVar2;
        this.K = kotlin.a.a(new ncg0(this, 0));
        this.L = qrReaderScreenParams.getRequestPermissionOnlyOnce();
        this.M = ffx.c(0, 1, BufferOverflow.DROP_OLDEST, 1);
        ((g7g0) l7g0Var).a.a(new mv3(DeeplinkHandleResult$DeeplinkType.SCREEN_OPEN, new ncg0(this, 1), 19));
    }

    public static final void b0(b bVar, odg0 odg0Var) {
        bVar.getClass();
        boolean booleanValue = ((Boolean) odg0Var.c.invoke()).booleanValue();
        if (!booleanValue) {
            bVar.r0(odg0Var);
        }
        rt1 rt1Var = bVar.C.Y;
        QrPaymentEvents$QrDeeplinkOpenResultResult qrPaymentEvents$QrDeeplinkOpenResultResult = booleanValue ? QrPaymentEvents$QrDeeplinkOpenResultResult.SUCCESS : QrPaymentEvents$QrDeeplinkOpenResultResult.ERROR;
        String str = odg0Var.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, qrPaymentEvents$QrDeeplinkOpenResultResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("action", str);
        }
        rt1Var.a.a("qr.deeplink.open.result", linkedHashMap);
    }

    @Override // defpackage.qya0
    public final void c(RequestPermissionResult requestPermissionResult) {
        boolean z;
        if (this.L) {
            int i = ucg0.a[requestPermissionResult.ordinal()];
            if (i == 1 || i == 2 || i == 3 || i == 4) {
                z = true;
            } else {
                if (i != 5) {
                    w511.b();
                    return;
                }
                z = false;
            }
            i3y i3yVar = this.K;
            SharedPreferences.Editor edit = ((SharedPreferences) i3yVar.getValue()).edit();
            edit.putBoolean("camera_permission_was_disallowed", z);
            edit.apply();
            if (!((SharedPreferences) i3yVar.getValue()).getBoolean("camera_permission_was_disallowed", false)) {
                Z(pcg0.a);
            }
        }
        rt1 rt1Var = this.C.Y;
        QrPaymentEvents$QrAllowCameraResultResult qrPaymentEvents$QrAllowCameraResultResult = requestPermissionResult.getIsGranted() ? QrPaymentEvents$QrAllowCameraResultResult.ALLOWED : QrPaymentEvents$QrAllowCameraResultResult.DENIED;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, qrPaymentEvents$QrAllowCameraResultResult.getOriginalValue());
        rt1Var.a.a("qr.allow_camera.result", linkedHashMap);
    }

    public final void c0() {
        this.C.Y.a.a("qr.resolving_rules.initiated", null);
        tje.N(ds31.a(this), null, null, new QrReaderViewModel$fetchQrResolvingRules$1(this, null), 3);
    }

    @Override // defpackage.qya0
    public final void d() {
        this.C.Y.v(QrPaymentEvents$QrAllowCameraInitiatedType.IN_APP_INFO);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d0(String str, dtj0 dtj0Var, ContinuationImpl continuationImpl) {
        QrReaderViewModel$handleCameraQr$1 qrReaderViewModel$handleCameraQr$1;
        int i;
        r0 r0Var;
        Object value;
        mcg0 mcg0Var;
        pz40 Y;
        r0 r0Var2;
        Object value2;
        if (continuationImpl instanceof QrReaderViewModel$handleCameraQr$1) {
            qrReaderViewModel$handleCameraQr$1 = (QrReaderViewModel$handleCameraQr$1) continuationImpl;
            int i2 = qrReaderViewModel$handleCameraQr$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qrReaderViewModel$handleCameraQr$1.label = i2 - Integer.MIN_VALUE;
                QrReaderViewModel$handleCameraQr$1 qrReaderViewModel$handleCameraQr$12 = qrReaderViewModel$handleCameraQr$1;
                Object obj = qrReaderViewModel$handleCameraQr$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qrReaderViewModel$handleCameraQr$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pz40 Y2 = Y();
                    do {
                        r0Var = (r0) Y2;
                        value = r0Var.getValue();
                        mcg0Var = (mcg0) value;
                    } while (!r0Var.k(value, mcg0.a(mcg0Var, false, false, mcg0Var.d + 1, false, null, 55)));
                    String obj2 = evu0.k0(str).toString();
                    QrReaderScreenParams qrReaderScreenParams = this.H;
                    String origin = qrReaderScreenParams.getOrigin();
                    String agreementId = qrReaderScreenParams.getAgreementId();
                    String autopaymentId = qrReaderScreenParams.getAutopaymentId();
                    QrPaymentEvents$QrRecognizedSource qrPaymentEvents$QrRecognizedSource = QrPaymentEvents$QrRecognizedSource.CAMERA;
                    qrReaderViewModel$handleCameraQr$12.label = 1;
                    obj = this.B.a(obj2, origin, dtj0Var, agreementId, autopaymentId, qrPaymentEvents$QrRecognizedSource, qrReaderViewModel$handleCameraQr$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                qdg0 qdg0Var = (qdg0) obj;
                Y = Y();
                do {
                    r0Var2 = (r0) Y;
                    value2 = r0Var2.getValue();
                } while (!r0Var2.k(value2, mcg0.a((mcg0) value2, false, false, r12.d - 1, false, null, 55)));
                return qdg0Var;
            }
        }
        qrReaderViewModel$handleCameraQr$1 = new QrReaderViewModel$handleCameraQr$1(this, continuationImpl);
        QrReaderViewModel$handleCameraQr$1 qrReaderViewModel$handleCameraQr$122 = qrReaderViewModel$handleCameraQr$1;
        Object obj3 = qrReaderViewModel$handleCameraQr$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qrReaderViewModel$handleCameraQr$122.label;
        if (i != 0) {
        }
        qdg0 qdg0Var2 = (qdg0) obj3;
        Y = Y();
        do {
            r0Var2 = (r0) Y;
            value2 = r0Var2.getValue();
        } while (!r0Var2.k(value2, mcg0.a((mcg0) value2, false, false, r12.d - 1, false, null, 55)));
        return qdg0Var2;
    }

    @Override // defpackage.qya0
    public final void e() {
        this.C.Y.v(QrPaymentEvents$QrAllowCameraInitiatedType.SYSTEM);
    }

    public final void e0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, mcg0.a((mcg0) value, false, false, 0, false, icg0.a, 31)));
        c0();
        Z(new qcg0(((QrRulesErrorContent) ((com.ybsdk.rconfig.b) ((y4a0) this.G).c).d(fu51.a).getData()).toEntity()));
    }

    @Override // defpackage.qya0
    public final void f() {
        this.C.Y.v(QrPaymentEvents$QrAllowCameraInitiatedType.IN_APP_SETTINGS);
    }

    public final void f0() {
        this.D.e();
    }

    public final void g0(QrReaderContentInfo qrReaderContentInfo) {
        String analyticsButtonClick;
        String action;
        if (qrReaderContentInfo != null && (action = qrReaderContentInfo.getAction()) != null) {
            ((g7g0) this.F).a.c(action);
        }
        if (qrReaderContentInfo == null || (analyticsButtonClick = qrReaderContentInfo.getAnalyticsButtonClick()) == null) {
            return;
        }
        if (jl40.l(this.H.getScreenType(), QrReaderScreenType.Old.INSTANCE)) {
            analyticsButtonClick = null;
        }
        if (analyticsButtonClick != null) {
            this.C.r0.a.a("transfers_dashboard.button.click", g8e.w(1, "button_name", analyticsButtonClick));
        }
    }

    public final void h0() {
        rt1 rt1Var = this.C.Y;
        String origin = this.H.getOrigin();
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        if (origin != null) {
            linkedHashMap.put("origin", origin);
        }
        rt1Var.a.a("qr.camera.closed", linkedHashMap);
        o0(false);
    }

    public final void i0(String str) {
        if (str != null) {
            ((g7g0) this.F).a.c(str);
        }
    }

    public final void j0(Uri uri) {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, mcg0.a((mcg0) value, false, false, 0, true, null, 47)));
        Z(new rcg0(uri));
    }

    public final void k0() {
        this.C.Y.a.a("qr.resolving_rules.load_failed_sheet.shown", null);
    }

    public final void l0() {
        this.C.Y.a.a("qr.resolving_rules.load_failed_sheet.button.clicked", null);
        ((QrRulesErrorContent) ((com.ybsdk.rconfig.b) ((y4a0) this.G).c).d(fu51.a).getData()).toEntity().getClass();
    }

    public final void m0() {
        if (((mcg0) X()).f instanceof jcg0) {
            return;
        }
        s0();
    }

    public final void n0() {
        c0();
    }

    public final void o0(boolean z) {
        if (z) {
            t0();
        } else {
            s0();
        }
        pz40 Y = Y();
        while (true) {
            r0 r0Var = (r0) Y;
            Object value = r0Var.getValue();
            boolean z2 = z;
            if (r0Var.k(value, mcg0.a((mcg0) value, false, z2, 0, false, null, 59))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    public final void p0() {
        rt1 rt1Var = this.C.Y;
        String origin = this.H.getOrigin();
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        if (origin != null) {
            linkedHashMap.put("origin", origin);
        }
        rt1Var.a.a("qr.camera.shown", linkedHashMap);
        pcg0 pcg0Var = pcg0.d;
        if (this.L && ((SharedPreferences) this.K.getValue()).getBoolean("camera_permission_was_disallowed", false)) {
            pcg0Var = pcg0.b;
        }
        Z(pcg0Var);
    }

    public final void q0(String str) {
        this.M.g(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r0(qdg0 qdg0Var) {
        f7g0 f7g0Var = (f7g0) this.E;
        com.ybsdk.rconfig.b bVar = f7g0Var.a;
        dfr dfrVar = z6g0.a;
        y6g0 y6g0Var = null;
        if (((QrErrorMessagesConfig) bVar.d(dfrVar).getData()).isEnabled()) {
            List<QrErrorMessage> messages = ((QrErrorMessagesConfig) f7g0Var.a.d(dfrVar).getData()).getMessages();
            ArrayList arrayList = new ArrayList(tcc.n(messages, 10));
            for (QrErrorMessage qrErrorMessage : messages) {
                List<String> categories = qrErrorMessage.getCategories();
                Text.Constant i = g8e.i(Text.Companion, qrErrorMessage.getErrorTitle());
                Text.Constant constant = new Text.Constant(qrErrorMessage.getErrorDescription());
                String buttonTitle = qrErrorMessage.getButtonTitle();
                Text.Constant constant2 = buttonTitle != null ? new Text.Constant(buttonTitle) : null;
                String buttonAction = qrErrorMessage.getButtonAction();
                ThemedImage image = qrErrorMessage.getImage();
                String light = image != null ? image.getLight() : null;
                ThemedImage image2 = qrErrorMessage.getImage();
                arrayList.add(new y6g0(categories, i, constant, fob1.c(light, image2 != null ? image2.getDark() : null, new gdf0(22)), constant2, buttonAction));
            }
            Iterator it = arrayList.iterator();
            loop1: while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                List list = ((y6g0) next).a;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (jl40.l((String) it2.next(), qdg0Var.a())) {
                            y6g0Var = next;
                            break loop1;
                        }
                    }
                }
            }
            y6g0Var = y6g0Var;
        }
        Z(new scg0(y6g0Var));
    }

    public final void s0() {
        t0();
        this.N = c.a(e.T(e.t(new mth(new fzw(20, this.M, this), 6)), 1), ds31.a(this), new qtc0(18, this));
    }

    public final void t0() {
        pzt0 pzt0Var = this.N;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.N = null;
    }

    public final void u0() {
        r0 r0Var;
        Object value;
        boolean z = ((mcg0) X()).b;
        boolean z2 = !z;
        rt1 rt1Var = this.C.Y;
        QrPaymentEvents$QrCameraLightningClickedStatus qrPaymentEvents$QrCameraLightningClickedStatus = !z ? QrPaymentEvents$QrCameraLightningClickedStatus.ON : QrPaymentEvents$QrCameraLightningClickedStatus.OFF;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put(ACSPConstants.STATUS, qrPaymentEvents$QrCameraLightningClickedStatus.getOriginalValue());
        rt1Var.a.a("qr.camera.lightning.clicked", linkedHashMap);
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, mcg0.a((mcg0) value, z2, false, 0, false, null, 61)));
        i5z0.a.a(nzs.b("Flashlight is in ", " state", z2), new Object[0]);
    }
}
