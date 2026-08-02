package com.ybsdk.feature.autotopup.internal.presentation.result;

import android.content.Context;
import com.adjust.sdk.Constants;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsResultScreenShownResult;
import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.CommonSheetButtonEntity;
import com.ybsdk.core.common.domain.entities.CommonSheetEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.autotopup.internal.domain.analytics.data.ClickEvent;
import com.ybsdk.feature.autotopup.internal.domain.c;
import com.ybsdk.feature.autotopup.internal.domain.e;
import com.ybsdk.feature.autotopup.internal.presentation.result.AutoTopupResultParams;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import defpackage.aa4;
import defpackage.b3z;
import defpackage.ba4;
import defpackage.ds31;
import defpackage.dzh0;
import defpackage.e2b1;
import defpackage.ez3;
import defpackage.f02;
import defpackage.g8e;
import defpackage.jw3;
import defpackage.l04;
import defpackage.mv3;
import defpackage.nv3;
import defpackage.ov3;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.uc5;
import defpackage.unr0;
import defpackage.w511;
import defpackage.wy3;
import defpackage.x0h;
import defpackage.z94;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class b extends uc5 {
    public final AutoTopupResultParams B;
    public final jw3 C;
    public final tfl0 D;
    public final ov3 E;
    public final l04 F;
    public final Context G;
    public final e H;
    public final c I;
    public pzt0 J;
    public pzt0 K;
    public pzt0 L;
    public boolean M;

    public b(AutoTopupResultParams autoTopupResultParams, jw3 jw3Var, tfl0 tfl0Var, ov3 ov3Var, l04 l04Var, Context context, e eVar, c cVar, ez3 ez3Var) {
        super(new f02(10, autoTopupResultParams), ez3Var);
        r0 r0Var;
        Object value;
        String agreementId;
        AutoTopupResultParams.ShowPaymentInfo showPaymentInfo;
        this.B = autoTopupResultParams;
        this.C = jw3Var;
        this.D = tfl0Var;
        this.E = ov3Var;
        this.F = l04Var;
        this.G = context;
        this.H = eVar;
        this.I = cVar;
        int i = 0;
        a aVar = new a(this, i);
        b3z b3zVar = ((nv3) jw3Var).a;
        DeeplinkHandleResult$DeeplinkType deeplinkHandleResult$DeeplinkType = DeeplinkHandleResult$DeeplinkType.SCREEN_OPEN;
        b3zVar.a(new mv3(deeplinkHandleResult$DeeplinkType, aVar, i));
        int i2 = 1;
        b3zVar.a(new mv3(deeplinkHandleResult$DeeplinkType, new a(this, i2), i2));
        if (autoTopupResultParams instanceof AutoTopupResultParams.NoPolling) {
            l04Var.d(((wy3) X()).k);
        } else if (autoTopupResultParams instanceof AutoTopupResultParams.Polling) {
            AutoTopupResultParams.Polling polling = (AutoTopupResultParams.Polling) autoTopupResultParams;
            tje.N(ds31.a(this), null, null, new AutoTopupResultViewModel$callRequestStatus$1(this, polling.getRequestId(), polling.isV2RequestStatusEnabled(), null), 3);
        } else {
            if (!(autoTopupResultParams instanceof AutoTopupResultParams.ShowPaymentInfo)) {
                w511.b();
                throw null;
            }
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
                AutoTopupResultParams autoTopupResultParams2 = this.B;
                agreementId = ((AutoTopupResultParams.ShowPaymentInfo) autoTopupResultParams2).getAgreementId();
                showPaymentInfo = (AutoTopupResultParams.ShowPaymentInfo) autoTopupResultParams2;
            } while (!r0Var.k(value, wy3.a((wy3) value, null, null, null, null, null, null, null, true, new ba4(agreementId, showPaymentInfo.getSource(), showPaymentInfo.getType(), null, null, null, null), null, 1663)));
            AutoTopupResultParams.ShowPaymentInfo showPaymentInfo2 = (AutoTopupResultParams.ShowPaymentInfo) autoTopupResultParams;
            String agreementId2 = showPaymentInfo2.getAgreementId();
            String source = showPaymentInfo2.getSource();
            String type = showPaymentInfo2.getType();
            pzt0 pzt0Var = this.K;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            this.K = tje.N(ds31.a(this), null, null, new AutoTopupResultViewModel$getPaymentStatus$1(this, agreementId2, source, type, null), 3);
        }
        b3zVar.a(new mv3(deeplinkHandleResult$DeeplinkType, this, 9));
    }

    public static final void b0(b bVar) {
        r0 r0Var;
        Object value;
        bVar.getClass();
        Text.Resource h = unr0.h(Text.Companion, dzh0.ybsdk_auto_topup_result_screen_fail_title);
        pz40 Y = bVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, wy3.a((wy3) value, null, h, unr0.h(Text.Companion, dzh0.ybsdk_auto_topup_result_screen_fail_description), new ActionButtonEntity(new Text.Resource(dzh0.ybsdk_auto_topup_result_screen_fail_button_text), null, false, null, 12, null), null, null, AutoTopupLogoResultStatus.FAILED, false, null, null, 1841)));
        l04 l04Var = bVar.F;
        l04Var.a.e.d(AutotopupEvents$AutoTopupSettingsResultScreenShownResult.ERROR, d.a(bVar.G, h).toString(), ((wy3) bVar.X()).k);
    }

    public final void c0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, wy3.a((wy3) value, null, null, null, null, null, null, null, false, null, null, 2015)));
    }

    public final void d0() {
        if (((wy3) X()).f != null) {
            this.F.a(ClickEvent.EXIT);
        }
        c0();
    }

    public final void e0() {
        CommonSheetButtonEntity primaryButton;
        CommonSheetEntity commonSheetEntity = ((wy3) X()).f;
        String deeplink = (commonSheetEntity == null || (primaryButton = commonSheetEntity.getPrimaryButton()) == null) ? null : primaryButton.getDeeplink();
        if (((wy3) X()).f != null) {
            this.F.a(ClickEvent.CLICK_BUTTON);
        }
        if (deeplink == null) {
            c0();
        } else {
            e2b1.b(this.C, deeplink);
        }
    }

    public final void f0(ActionButtonEntity actionButtonEntity) {
        String action;
        if (actionButtonEntity == null || (action = actionButtonEntity.getAction()) == null) {
            this.D.e();
            return;
        }
        boolean isSupportButton = actionButtonEntity.isSupportButton();
        jw3 jw3Var = this.C;
        if (!isSupportButton) {
            e2b1.b(jw3Var, action);
            return;
        }
        nv3 nv3Var = (nv3) jw3Var;
        if (nv3Var.a.c(action).a instanceof x0h) {
            nv3Var.b.h(com.ybsdk.feature.webview.api.a.b(nv3Var.d, action, null, null, 6));
        }
    }

    public final void g0() {
        this.F.c(((wy3) X()).g, ClickEvent.EXIT, String.valueOf(((wy3) X()).b), ((wy3) X()).k);
        this.D.e();
    }

    public final void h0() {
        ActionButtonEntity actionButtonEntity = ((wy3) X()).d;
        j0(actionButtonEntity != null ? actionButtonEntity.getAction() : null);
        f0(((wy3) X()).d);
    }

    public final void i0() {
        ActionButtonEntity actionButtonEntity = ((wy3) X()).e;
        j0(actionButtonEntity != null ? actionButtonEntity.getAction() : null);
        f0(((wy3) X()).e);
    }

    public final void j0(String str) {
        boolean z = this.B instanceof AutoTopupResultParams.ShowPaymentInfo;
        l04 l04Var = this.F;
        if (z) {
            if (str == null) {
                str = "";
            }
            z94 z94Var = l04Var.a.e;
            z94Var.a.a("auto_topup.settings.result_screen_info.click", g8e.w(1, Constants.DEEPLINK, str));
        }
        l04Var.c(((wy3) X()).g, ClickEvent.CLICK_BUTTON, String.valueOf(((wy3) X()).b), ((wy3) X()).k);
    }

    public final void k0() {
        r0 r0Var;
        Object value;
        wy3 wy3Var;
        String str;
        Text.Constant g;
        aa4 aa4Var;
        aa4 aa4Var2;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
            wy3Var = (wy3) value;
            ba4 ba4Var = wy3Var.i;
            str = null;
            g = d.g((ba4Var == null || (aa4Var2 = ba4Var.e) == null) ? null : aa4Var2.a);
            if (ba4Var != null && (aa4Var = ba4Var.e) != null) {
                str = aa4Var.b;
            }
        } while (!r0Var.k(value, wy3.a(wy3Var, null, g, d.g(str), null, null, null, AutoTopupLogoResultStatus.BIG_LOGO_PROCESSING, false, null, null, 1313)));
    }
}
