package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.ComposeView;
import com.google.common.collect.ImmutableList;
import com.yandex.go.payments.cards.nfc.experiments.NfcScanCardExperiment;
import com.yandex.go.pickup_from_photo.api.PickupFromPhotoTooltipContainer$TooltipPointerAlignment;
import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.xplat.common.PollingStep;
import com.yandex.xplat.common.YSError;
import com.yandex.xplat.payment.sdk.BillingServiceError;
import com.yandex.xplat.payment.sdk.ExternalErrorKind;
import com.yandex.xplat.payment.sdk.ExternalErrorTrigger;
import com.yandex.xplat.payment.sdk.NetworkServiceRetryingStrategy;
import com.yandex.xplat.payment.sdk.NspkMembersSource;
import com.yandex.xplat.payment.sdk.PaymentPollingResult;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.b;
import ru.yandex.taxi.activity.i;
import ru.yandex.taxi.design.bubble.BubbleComponent;
import ru.yandex.taxi.logistics.experiments.k;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes13.dex */
public final class dt20 implements rt41, wni, gpb0 {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;
    public Object w;
    public Object x;

    public dt20(ma1 ma1Var, lx4 lx4Var, dne0 dne0Var) {
        this.a = 7;
        this.b = lx4Var;
        this.c = dne0Var.a("navigator_adjust_event_tracker_preferences");
        this.w = b.i(new Pair("navigation.request_route.success", as6.q()), new Pair("navigation.route.start_navigation", as6.p()));
        this.x = new cm9(2, this);
    }

    public static lfr0 f(ggb ggbVar) {
        String str = ggbVar.a;
        if (!str.equals("success") && !str.equals("wait_for_payment_method") && !str.equals("in_progress") && !str.equals("challenge_in_progress")) {
            return zmx.c(new BillingServiceError(ExternalErrorKind.internal_error, ExternalErrorTrigger.internal_sdk, null, str, oyr.p("Unable to convert status ", str, " to PollingResult")));
        }
        return zmx.d(PaymentPollingResult.SUCCESS);
    }

    public void a(boolean z) {
        h().a.setVisibility(z ? 0 : 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tyj0 b(ggb ggbVar) {
        String str = ggbVar.b;
        String str2 = ggbVar.c;
        String str3 = ggbVar.a;
        if (str3.equals("wait_for_payment_method")) {
            return coa1.i(PollingStep.retry);
        }
        if (str3.equals("in_progress")) {
            n();
            return coa1.i(PollingStep.retry);
        }
        if (str3.equals("success")) {
            n();
            return coa1.i(PollingStep.done);
        }
        if (!str3.equals("challenge_in_progress")) {
            if (str3.equals("failed")) {
                n();
                ExternalErrorKind externalErrorKind = ExternalErrorKind.internal_error;
                ExternalErrorTrigger externalErrorTrigger = ExternalErrorTrigger.mobile_backend;
                String str4 = str == null ? "null" : str;
                String str5 = str2 == null ? "null" : str2;
                StringBuilder v = b64.v("<MobileBackendResponse: status - ", str3, ", code - ", str4, ", desc - ");
                v.append(str5);
                v.append(">");
                return coa1.h(new BillingServiceError(externalErrorKind, externalErrorTrigger, null, str3, "Challenge failed, response : ".concat(v.toString())));
            }
            if (str3.equals("repayment_allowed")) {
                n();
                return coa1.h(new BillingServiceError(ExternalErrorKind.payment_failed_but_new_attempt_allowed, ExternalErrorTrigger.mobile_backend, null, str3, "Payment failed but new attempt allowed"));
            }
            ExternalErrorKind externalErrorKind2 = ExternalErrorKind.internal_error;
            ExternalErrorTrigger externalErrorTrigger2 = ExternalErrorTrigger.mobile_backend;
            String str6 = str == null ? "null" : str;
            String str7 = str2 == null ? "null" : str2;
            StringBuilder v2 = b64.v("<MobileBackendResponse: status - ", str3, ", code - ", str6, ", desc - ");
            v2.append(str7);
            v2.append(">");
            return coa1.h(new BillingServiceError(externalErrorKind2, externalErrorTrigger2, null, str3, "Undefined check payment status: ".concat(v2.toString())));
        }
        rwo rwoVar = (rwo) this.w;
        try {
            ct20 ct20Var = ggbVar.d;
            if (ct20Var == null) {
                qv90.a.getClass();
                ((y22) rwoVar).a(sv90.d0("NO_CHALLENGE_INFO"));
                return coa1.h(new BillingServiceError(ExternalErrorKind.undefined_challenge, ExternalErrorTrigger.mobile_backend, null, str3, "Undefined challenge method: ".concat("<MobileBackendResponse: status - " + str3 + ", code - " + (str == null ? "null" : str) + ", desc - " + (str2 == null ? "null" : str2) + ">")));
            }
            String str8 = ct20Var.a;
            try {
                if (!jl40.l((String) this.x, str8)) {
                    n();
                    this.x = str8;
                    anh anhVar = null;
                    try {
                        if (ct20Var instanceof p89) {
                            try {
                                String str9 = ((p89) ct20Var).b;
                                qv90.a.getClass();
                                wj00 wj00Var = new wj00(0);
                                wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Получен 3DS Челлендж");
                                ((y22) rwoVar).a(y891.c("received_3ds_challenge", wj00Var));
                                try {
                                    anhVar = new anh(Uri.parse(new URI(str9).toString()));
                                } catch (Throwable unused) {
                                }
                                if (anhVar == null) {
                                    return coa1.h(c7b1.e(str9, "redirectURL", ggbVar));
                                }
                            } catch (RuntimeException e) {
                                e = e;
                                if (e instanceof YSError) {
                                }
                                if (str == null) {
                                }
                                return coa1.h(new BillingServiceError(ExternalErrorKind.internal_error, ExternalErrorTrigger.internal_sdk, null, str3, b64.l("Failed to handle challenge for response: ", oyr.t(b64.v("<MobileBackendResponse: status - ", str3, ", code - ", str == null ? "null" : str, ", desc - "), str2 == null ? "null" : str2, ">"), ", error: \"", e instanceof YSError ? ((YSError) e).getMessage() : String.valueOf(e))));
                            }
                        } else if (ct20Var instanceof u89) {
                            u89 u89Var = (u89) ct20Var;
                            sv90 sv90Var = qv90.a;
                            String str10 = u89Var.b;
                            String str11 = u89Var.c;
                            String str12 = u89Var.d;
                            sv90Var.getClass();
                            ((y22) rwoVar).a(sv90.c0(str10, str11, str12));
                        } else if (ct20Var instanceof x89) {
                            sv90 sv90Var2 = qv90.a;
                            String str13 = ((x89) ct20Var).b;
                            sv90Var2.getClass();
                            String concat = "Получен СМС Челлендж, verification_id = ".concat(str13);
                            wj00 wj00Var2 = new wj00(0);
                            wj00Var2.k("verification_id", str13);
                            wj00Var2.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat);
                            ((y22) rwoVar).a(y891.c("received_sms_challenge", wj00Var2));
                        } else {
                            if (ct20Var instanceof w89) {
                                w89 w89Var = (w89) ct20Var;
                                String str14 = w89Var.b;
                                sv90 sv90Var3 = qv90.a;
                                String str15 = w89Var.c;
                                sv90Var3.getClass();
                                String concat2 = "Получен СБП Челлендж, qrc_id = ".concat(str15);
                                wj00 wj00Var3 = new wj00(0);
                                wj00Var3.k("qrc_id", str15);
                                wj00Var3.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat2);
                                ((y22) rwoVar).a(y891.c("received_sbp_challenge", wj00Var3));
                                try {
                                    anhVar = new anh(Uri.parse(new URI(str14).toString()));
                                } catch (Throwable unused2) {
                                }
                                if (anhVar == null) {
                                    return coa1.h(c7b1.e(str14, "formUrl", ggbVar));
                                }
                            } else if (ct20Var instanceof s89) {
                                qv90.a.getClass();
                                wj00 wj00Var4 = new wj00(0);
                                wj00Var4.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Получен CVV Челлендж");
                                ((y22) rwoVar).a(y891.c("received_cvv_challenge", wj00Var4));
                            } else if (ct20Var instanceof y89) {
                                sv90 sv90Var4 = qv90.a;
                                String str16 = ((y89) ct20Var).a;
                                sv90Var4.getClass();
                                String concat3 = "Получен web Челлендж, метод: ".concat(str16);
                                wj00 wj00Var5 = new wj00(0);
                                wj00Var5.k("method", str16);
                                wj00Var5.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat3);
                                ((y22) rwoVar).a(y891.c("received_web_challenge", wj00Var5));
                            } else if (ct20Var instanceof v89) {
                                sv90 sv90Var5 = qv90.a;
                                String str17 = ((v89) ct20Var).a;
                                sv90Var5.getClass();
                                String concat4 = "Получен redirect Челлендж, метод: ".concat(str17);
                                wj00 wj00Var6 = new wj00(0);
                                wj00Var6.k("method", str17);
                                wj00Var6.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat4);
                                ((y22) rwoVar).a(y891.c("received_redirect_challenge", wj00Var6));
                            } else {
                                if (!(ct20Var instanceof daj)) {
                                    qv90.a.getClass();
                                    ((y22) rwoVar).a(sv90.d0(str8));
                                    return coa1.h(new BillingServiceError(ExternalErrorKind.undefined_challenge, ExternalErrorTrigger.mobile_backend, null, str3, "Undefined challenge method: ".concat("<MobileBackendResponse: status - " + str3 + ", code - " + (str == null ? "null" : str) + ", desc - " + (str2 == null ? "null" : str2) + ">")));
                                }
                                sv90 sv90Var6 = qv90.a;
                                String str18 = ((daj) ct20Var).a;
                                sv90Var6.getClass();
                                String concat5 = "Получен нативный челлендж, метод: ".concat(str18);
                                wj00 wj00Var7 = new wj00(0);
                                wj00Var7.k("method", str18);
                                wj00Var7.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat5);
                                ((y22) rwoVar).a(y891.c("received_device_challenge", wj00Var7));
                            }
                            ((tls) this.b).invoke(ct20Var);
                        }
                        ((tls) this.b).invoke(ct20Var);
                    } catch (RuntimeException e2) {
                        e = e2;
                        return coa1.h(new BillingServiceError(ExternalErrorKind.internal_error, ExternalErrorTrigger.internal_sdk, null, str3, b64.l("Failed to handle challenge for response: ", oyr.t(b64.v("<MobileBackendResponse: status - ", str3, ", code - ", str == null ? "null" : str, ", desc - "), str2 == null ? "null" : str2, ">"), ", error: \"", e instanceof YSError ? ((YSError) e).getMessage() : String.valueOf(e))));
                    }
                }
                return coa1.i(PollingStep.retry);
            } catch (RuntimeException e3) {
                e = e3;
                if (e instanceof YSError) {
                }
                if (str == null) {
                }
                return coa1.h(new BillingServiceError(ExternalErrorKind.internal_error, ExternalErrorTrigger.internal_sdk, null, str3, b64.l("Failed to handle challenge for response: ", oyr.t(b64.v("<MobileBackendResponse: status - ", str3, ", code - ", str == null ? "null" : str, ", desc - "), str2 == null ? "null" : str2, ">"), ", error: \"", e instanceof YSError ? ((YSError) e).getMessage() : String.valueOf(e))));
            }
        } catch (RuntimeException e4) {
            e = e4;
        }
    }

    public void c() {
        if (((ipb0) this.x) != null) {
            e();
            BubbleComponent.hide$default(h().a, false, 1, null);
        }
        this.x = null;
    }

    public s760 d() {
        NfcScanCardExperiment nfcScanCardExperiment = (NfcScanCardExperiment) ((t1b0) this.x).c();
        return !nfcScanCardExperiment.b ? new t760() : new com.yandex.go.payments.cards.nfc.data.b((ComponentActivity) this.b, (i) this.c, (q760) this.w, nfcScanCardExperiment);
    }

    public void e() {
        FrameLayout frameLayout = (FrameLayout) this.b;
        if (frameLayout.indexOfChild(h().a) != -1) {
            frameLayout.removeView(h().a);
        }
        ipb0 ipb0Var = (ipb0) this.x;
        if (ipb0Var != null) {
            View view = ipb0Var.a;
            view.removeOnAttachStateChangeListener(ipb0Var.h);
            yln ylnVar = ipb0Var.i;
            view.removeOnLayoutChangeListener(ylnVar);
            ipb0Var.f.removeOnLayoutChangeListener(ylnVar);
            ipb0Var.b.removeOnLayoutChangeListener(ylnVar);
        }
        BubbleComponent.hide$default(h().a, false, 1, null);
    }

    public String g() {
        return (String) this.b;
    }

    public fpb0 h() {
        return (fpb0) ((i3y) this.w).getValue();
    }

    public String i() {
        return (String) this.c;
    }

    public Bitmap j() {
        return (Bitmap) this.w;
    }

    public String k() {
        return (String) this.x;
    }

    @Override // defpackage.rt41
    public void l() {
        skd0.b(PlusLogTag.SDK, ((ul60) this.b).a + ".resolveSslError() error=" + ((SslError) this.c) + " proceeded");
        ((SslErrorHandler) this.w).proceed();
    }

    @Override // defpackage.wni
    public ComposeView m(uni uniVar, vni vniVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 18:
                ComposeView composeView = new ComposeView((Context) obj, null, 0, 6, null);
                composeView.setContent(new a(-100283771, new s990(this, (x990) uniVar, (q990) vniVar, 0), true));
                return composeView;
            default:
                ComposeView composeView2 = new ComposeView((Context) obj, null, 0, 6, null);
                composeView2.setContent(new a(-2081937297, new l7a0(this, (n7a0) uniVar, (eii) vniVar, 3), true));
                return composeView2;
        }
    }

    public void n() {
        String str = (String) this.x;
        if (str != null) {
            ((tls) this.c).invoke(str);
            this.x = null;
        }
    }

    public md51 o(NspkMembersSource nspkMembersSource) {
        ArrayList arrayList;
        int i = jl60.a[nspkMembersSource.ordinal()];
        if (i == 1) {
            arrayList = (ArrayList) this.c;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            arrayList = (ArrayList) this.x;
        }
        if (arrayList != null) {
            return zmx.d(arrayList);
        }
        nl60 nl60Var = new nl60(nspkMembersSource, 0);
        rwo rwoVar = (rwo) this.w;
        qv90.a.getClass();
        int i2 = rv90.h[nspkMembersSource.ordinal()];
        String concat = "Загрузка списка банковских приложений: ".concat(i2 != 1 ? i2 != 2 ? "" : "получить список приложений, поддерживающих привязку счета через СБП" : "получить все возможные приложения, поддерживающие Систему Быстрых Платежей");
        wj00 wj00Var = new wj00(0);
        wj00Var.k("kind", nspkMembersSource.getValue());
        wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat);
        iho c = y891.c("sbp_bank_load_list", wj00Var);
        md51 h = ((kl60) this.b).a.f(nl60Var, new fd60(7), NetworkServiceRetryingStrategy.noRetry).h(new zl50(6, this, nspkMembersSource));
        ((y22) rwoVar).b(c, h);
        return h;
    }

    @Override // defpackage.rt41
    public void onCanceled() {
        PlusLogTag plusLogTag = PlusLogTag.SDK;
        StringBuilder sb = new StringBuilder();
        sb.append(((ul60) this.b).a);
        sb.append(".resolveSslError() error=");
        SslError sslError = (SslError) this.c;
        sb.append(sslError);
        sb.append(" canceled");
        skd0.c(plusLogTag, sb.toString(), null);
        ((SslErrorHandler) this.w).cancel();
        ((th40) this.x).invoke(sslError);
    }

    public void p(View view, String str) {
        h().a.setImportantForAccessibility(2);
        h().b.setImportantForAccessibility(2);
        h().b.setTextColor(new bdc(xng0.textInvert));
        StaticLayout build = StaticLayout.Builder.obtain(str, 0, str.length(), h().b.getPaint(), tje.u(100, view.getContext())).build();
        int lineCount = build.getLineCount();
        float f = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            f = Math.max(f, build.getLineWidth(i) + 1.0f);
        }
        int i2 = (int) f;
        h().b.setMaxWidth(i2);
        h().b.setLayoutParams(new ViewGroup.LayoutParams(i2, -2));
        h().b.setText(str);
        ipb0 ipb0Var = (ipb0) this.x;
        if (view == (ipb0Var != null ? ipb0Var.a : null) && h().a.getVisibility() == 0) {
            return;
        }
        e();
        BubbleComponent bubbleComponent = h().a;
        if (bubbleComponent.getParent() == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((tje.u(12, view.getContext()) * 2) + i2, -2);
            layoutParams.leftMargin = tje.r(mrg0.go_design_m_space, view.getContext());
            layoutParams.rightMargin = tje.r(mrg0.go_design_m_space, view.getContext());
            layoutParams.gravity = 8388611;
            bubbleComponent.setBubbleColor(new bdc(xng0.bgInvert));
            ((FrameLayout) this.b).addView(bubbleComponent, layoutParams);
        }
        ipb0 ipb0Var2 = new ipb0(view, bubbleComponent, (rju) this.c, PickupFromPhotoTooltipContainer$TooltipPointerAlignment.END);
        this.x = ipb0Var2;
        view.addOnAttachStateChangeListener(ipb0Var2.h);
        yln ylnVar = ipb0Var2.i;
        view.addOnLayoutChangeListener(ylnVar);
        ipb0Var2.f.addOnLayoutChangeListener(ylnVar);
        bubbleComponent.addOnLayoutChangeListener(ylnVar);
        BubbleComponent.show$default(h().a, false, 1, null);
    }

    public dt20(String str, String str2, String str3, Bitmap bitmap) {
        this.a = 29;
        this.x = str;
        this.b = str2;
        this.c = str3;
        this.w = bitmap;
    }

    public dt20(kl60 kl60Var, rwo rwoVar) {
        this.a = 11;
        this.b = kl60Var;
        this.w = rwoVar;
    }

    public dt20(zg50 zg50Var, k kVar, wiq0 wiq0Var, ji50 ji50Var) {
        this.a = 8;
        this.b = zg50Var;
        this.c = kVar;
        this.w = wiq0Var;
        this.x = ji50Var.c();
    }

    public dt20(tls tlsVar, tls tlsVar2, rwo rwoVar) {
        this.a = 0;
        this.b = tlsVar;
        this.c = tlsVar2;
        this.w = rwoVar;
    }

    public dt20(ComponentActivity componentActivity, i iVar, q760 q760Var, rqo rqoVar) {
        this.a = 9;
        this.b = componentActivity;
        this.c = iVar;
        this.w = q760Var;
        this.x = ((jbh) rqoVar).e(NfcScanCardExperiment.f);
    }

    public /* synthetic */ dt20(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
    }

    public dt20(Context context, qcp0 qcp0Var, hwy0 hwy0Var, dci dciVar, jwh jwhVar) {
        this.a = 19;
        this.b = context;
        this.c = hwy0Var;
        this.w = dciVar;
        this.x = jwhVar;
    }

    public dt20(com.yandex.go.route.interactor.b bVar, i9c0 i9c0Var) {
        this.a = 27;
        this.b = bVar;
        this.c = i9c0Var;
    }

    public dt20(FrameLayout frameLayout) {
        this.a = 26;
        this.b = frameLayout;
        rju rjuVar = new rju(frameLayout.getContext());
        rjuVar.E = tje.y(dzg0.bubble_default_frame, frameLayout.getContext()).mutate();
        rjuVar.f();
        this.c = rjuVar;
        this.w = kotlin.a.a(new t9b0(6, this));
    }

    public dt20(List list, f150 f150Var, at20 at20Var, f150 f150Var2) {
        this.a = 5;
        this.b = list != null ? ImmutableList.l(list) : ImmutableList.p();
        this.c = f150Var;
        this.w = at20Var;
        this.x = f150Var2;
    }
}
