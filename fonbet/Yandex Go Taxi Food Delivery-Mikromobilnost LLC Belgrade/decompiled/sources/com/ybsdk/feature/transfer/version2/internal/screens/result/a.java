package com.ybsdk.feature.transfer.version2.internal.screens.result;

import android.net.Uri;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.TopupFragment;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.TemplatePaymentTypeTransfers;
import com.ybsdk.core.analytics.generated.delegates.GovServicesEvents$PaymentGovSuccessScreenLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.InternetServicesEvents$PaymentInternetTvSuccessScreenLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.InternetServicesEvents$PaymentInternetTvSuccessScreenShownResult;
import com.ybsdk.core.analytics.generated.delegates.MobileServicesEvents$PaymentMobileServicesSuccessScreenLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.MobileServicesEvents$PaymentMobileServicesSuccessScreenShownResult;
import com.ybsdk.core.analytics.generated.delegates.TemplateTransferEvents$TemplateTransferSuccessScreenLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferPaymentInitiatedChosenMethod;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferPaymentResultChosenMethod;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferScenarioCloseStatus;
import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.navigation.cicerone.Screen;
import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.core.transfer.utils.domain.AnalyticsPaymentStatus;
import com.ybsdk.core.transfer.utils.domain.entities.AnalyticsSourceScreen;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.rateapp.api.RateAppFeature$Source;
import com.ybsdk.feature.transfer.version2.api.TransferDirection;
import com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams;
import com.ybsdk.feature.transfer.version2.api.TransferTwoFactorScreenProvider$Request;
import com.ybsdk.feature.transfer.version2.api.entities.TransferHeaderEntity;
import com.ybsdk.feature.transfer.version2.api.entities.TransferResultPageEntity;
import com.ybsdk.feature.transfer.version2.internal.domain.b;
import com.ybsdk.feature.transfer.version2.internal.entities.ResultStatus;
import com.ybsdk.navigation.ScenarioResultReceiver$TransferResult;
import com.ybsdk.network.dto.CreateApplicationWithProductJsonAdapter;
import defpackage.ah01;
import defpackage.b8g0;
import defpackage.c1x0;
import defpackage.ds31;
import defpackage.dzh0;
import defpackage.eh51;
import defpackage.em3;
import defpackage.g8e;
import defpackage.gs01;
import defpackage.h791;
import defpackage.hs01;
import defpackage.hu01;
import defpackage.hwo0;
import defpackage.i3y;
import defpackage.i5y0;
import defpackage.ih51;
import defpackage.is01;
import defpackage.j3h;
import defpackage.jh51;
import defpackage.ji01;
import defpackage.jk01;
import defpackage.job1;
import defpackage.js01;
import defpackage.kk01;
import defpackage.ku01;
import defpackage.l0p;
import defpackage.m501;
import defpackage.mjt0;
import defpackage.mk01;
import defpackage.nh01;
import defpackage.nvd;
import defpackage.ny61;
import defpackage.ou01;
import defpackage.p39;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.qq7;
import defpackage.rbv;
import defpackage.ri01;
import defpackage.rm01;
import defpackage.rr01;
import defpackage.ssa1;
import defpackage.tfl0;
import defpackage.tfy0;
import defpackage.tg01;
import defpackage.tje;
import defpackage.tr01;
import defpackage.tu01;
import defpackage.uc5;
import defpackage.ur01;
import defpackage.us3;
import defpackage.v0h;
import defpackage.w0h;
import defpackage.w511;
import defpackage.wbz0;
import defpackage.wsb1;
import defpackage.wva1;
import defpackage.x0h;
import defpackage.y0h;
import defpackage.ye0;
import defpackage.z94;
import defpackage.zgz0;
import defpackage.zr51;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final TransferMainResultScreenParams B;
    public final tfl0 C;
    public final ji01 D;
    public final hu01 E;
    public final rm01 F;
    public final c1x0 G;
    public final j3h H;
    public final mjt0 I;
    public final ku01 J;
    public final b8g0 K;
    public pzt0 L;
    public pzt0 M;
    public final b N;
    public final i3y O;
    public final boolean P;

    public a(jk01 jk01Var, TransferMainResultScreenParams transferMainResultScreenParams, tfl0 tfl0Var, ji01 ji01Var, hu01 hu01Var, rm01 rm01Var, tg01 tg01Var, ur01 ur01Var, c1x0 c1x0Var, j3h j3hVar, mjt0 mjt0Var, ku01 ku01Var, b8g0 b8g0Var) {
        super(new zgz0(21, transferMainResultScreenParams), jk01Var);
        this.B = transferMainResultScreenParams;
        this.C = tfl0Var;
        this.D = ji01Var;
        this.E = hu01Var;
        this.F = rm01Var;
        this.G = c1x0Var;
        this.H = j3hVar;
        this.I = mjt0Var;
        this.J = ku01Var;
        this.K = b8g0Var;
        this.N = tg01Var.a(transferMainResultScreenParams.getScenario());
        this.O = kotlin.a.a(new i5y0(25, ur01Var, this));
        this.P = transferMainResultScreenParams instanceof TransferMainResultScreenParams.AftTopupParams;
        q0(null);
    }

    public static final String b0(a aVar, nh01 nh01Var) {
        String str;
        aVar.getClass();
        int i = mk01.a[nh01Var.a.ordinal()];
        if (i == 5) {
            return "timeout";
        }
        if (i == 6) {
            return "confirmError";
        }
        if (i == 7 && (str = nh01Var.b) != null) {
            return aVar.B instanceof TransferMainResultScreenParams.C2gTransferParams ? "failedStatus" : str;
        }
        return null;
    }

    public static final void c0(a aVar, c1x0 c1x0Var, js01 js01Var) {
        ScenarioResultReceiver$TransferResult scenarioResultReceiver$TransferResult;
        jh51 jh51Var;
        TransferDirection direction = aVar.B.getDirection();
        nvd nvdVar = (nvd) c1x0Var.a;
        boolean z = js01Var instanceof is01;
        hs01 hs01Var = hs01.a;
        gs01 gs01Var = gs01.a;
        if (z) {
            RateAppFeature$Source rateAppFeature$Source = RateAppFeature$Source.None;
            scenarioResultReceiver$TransferResult = ScenarioResultReceiver$TransferResult.SUCCESS;
        } else if (js01Var.equals(gs01Var)) {
            scenarioResultReceiver$TransferResult = ScenarioResultReceiver$TransferResult.FAIL;
        } else {
            if (!js01Var.equals(hs01Var)) {
                w511.b();
                return;
            }
            scenarioResultReceiver$TransferResult = ScenarioResultReceiver$TransferResult.PENDING;
        }
        nvdVar.l(scenarioResultReceiver$TransferResult);
        if (direction == TransferDirection.TOPUP) {
            if (z) {
                jh51Var = new ih51(((is01) js01Var).a);
            } else if (js01Var.equals(gs01Var)) {
                jh51Var = wbz0.w;
            } else {
                if (!js01Var.equals(hs01Var)) {
                    w511.b();
                    return;
                }
                jh51Var = m501.x;
            }
            nvdVar.a(jh51Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d0(a aVar, String str, ContinuationImpl continuationImpl) {
        TransferMainResultViewModel$twoFactorScreenNavigate$1 transferMainResultViewModel$twoFactorScreenNavigate$1;
        int i;
        ThemedImageUrlEntity image;
        String title;
        aVar.getClass();
        if (continuationImpl instanceof TransferMainResultViewModel$twoFactorScreenNavigate$1) {
            transferMainResultViewModel$twoFactorScreenNavigate$1 = (TransferMainResultViewModel$twoFactorScreenNavigate$1) continuationImpl;
            int i2 = transferMainResultViewModel$twoFactorScreenNavigate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transferMainResultViewModel$twoFactorScreenNavigate$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transferMainResultViewModel$twoFactorScreenNavigate$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferMainResultViewModel$twoFactorScreenNavigate$1.label;
                rbv rbvVar = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    hu01 hu01Var = aVar.E;
                    TransferHeaderEntity header = ((kk01) aVar.X()).a.getHeader();
                    if (header == null || (title = header.getTitle()) == null) {
                        Text.Empty empty = Text.Empty.INSTANCE;
                    } else {
                        Text.Companion.getClass();
                        new Text.Constant(title);
                    }
                    TransferHeaderEntity header2 = ((kk01) aVar.X()).a.getHeader();
                    if (header2 != null && (image = header2.getImage()) != null) {
                        rbvVar = job1.f(image, new ri01(6));
                    }
                    TransferTwoFactorScreenProvider$Request transferTwoFactorScreenProvider$Request = TransferTwoFactorScreenProvider$Request.CONFIRM_TRANSFER;
                    TransferScenario scenario = aVar.B.getScenario();
                    transferMainResultViewModel$twoFactorScreenNavigate$1.label = 1;
                    obj = ((tu01) hu01Var).b(rbvVar, null, str, transferTwoFactorScreenProvider$Request, scenario);
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
                aVar.C.h((Screen) obj);
                return zy11.a;
            }
        }
        transferMainResultViewModel$twoFactorScreenNavigate$1 = new TransferMainResultViewModel$twoFactorScreenNavigate$1(aVar, continuationImpl);
        Object obj3 = transferMainResultViewModel$twoFactorScreenNavigate$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferMainResultViewModel$twoFactorScreenNavigate$1.label;
        rbv rbvVar2 = null;
        if (i != 0) {
        }
        aVar.C.h((Screen) obj3);
        return zy11.a;
    }

    public static kk01 f0(kk01 kk01Var, TransferResultPageEntity transferResultPageEntity) {
        return transferResultPageEntity != null ? kk01.a(kk01Var, transferResultPageEntity, null, null, null, g8e.i(Text.Companion, transferResultPageEntity.getTitle()), new Text.Constant(transferResultPageEntity.getDescription()), null, null, null, null, null, 8094) : kk01Var;
    }

    public final void e0(ResultStatus resultStatus, p39 p39Var, String str) {
        TransferEvents$TransferPaymentResultChosenMethod transferEvents$TransferPaymentResultChosenMethod;
        TemplateTransferEvents$TemplateTransferSuccessScreenLoadedResult templateTransferEvents$TemplateTransferSuccessScreenLoadedResult;
        String str2 = str;
        tr01 g0 = g0();
        AppAnalyticsReporter appAnalyticsReporter = g0.b;
        String str3 = g0.i;
        TransferMainResultScreenParams transferMainResultScreenParams = g0.c;
        hwo0 hwo0Var = g0.d;
        if (hwo0Var != null) {
            if (resultStatus == ResultStatus.PROCESSING) {
                return;
            }
            switch (tfy0.a[resultStatus.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    templateTransferEvents$TemplateTransferSuccessScreenLoadedResult = TemplateTransferEvents$TemplateTransferSuccessScreenLoadedResult.OK;
                    break;
                case 4:
                    templateTransferEvents$TemplateTransferSuccessScreenLoadedResult = TemplateTransferEvents$TemplateTransferSuccessScreenLoadedResult.OK;
                    break;
                case 5:
                case 6:
                case 7:
                    templateTransferEvents$TemplateTransferSuccessScreenLoadedResult = TemplateTransferEvents$TemplateTransferSuccessScreenLoadedResult.ERROR;
                    break;
                default:
                    w511.b();
                    return;
            }
            if (templateTransferEvents$TemplateTransferSuccessScreenLoadedResult != TemplateTransferEvents$TemplateTransferSuccessScreenLoadedResult.ERROR) {
                str2 = null;
            }
            z94 z94Var = ((AppAnalyticsReporter) hwo0Var.c).n0;
            TemplatePaymentTypeTransfers templatePaymentTypeTransfers = (TemplatePaymentTypeTransfers) hwo0Var.w;
            LinkedHashMap linkedHashMap = new LinkedHashMap(4);
            linkedHashMap.put("type", templatePaymentTypeTransfers.getOriginalValue());
            linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, templateTransferEvents$TemplateTransferSuccessScreenLoadedResult.getOriginalValue());
            if (str2 != null) {
                linkedHashMap.put("error", str2);
            }
            if (str3 != null) {
                linkedHashMap.put("transfer_id", str3);
            }
            z94Var.a.a("template_transfer.success_screen_loaded", linkedHashMap);
            return;
        }
        if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.PhoneTransferParams) {
            TransferMainResultScreenParams.PhoneTransferParams phoneTransferParams = (TransferMainResultScreenParams.PhoneTransferParams) transferMainResultScreenParams;
            g0.a.b(g0.e, tr01.a(resultStatus), AnalyticsSourceScreen.TRANSFER, (r41 & 8) != 0 ? null : phoneTransferParams.getSourceAgreementId(), (r41 & 16) != 0 ? null : null, (r41 & 32) != 0 ? null : phoneTransferParams.getPhone(), (r41 & 64) != 0 ? null : phoneTransferParams.getPartnerId(), (r41 & 128) != 0 ? null : null, (r41 & 256) != 0 ? null : null, TransferEvents$TransferPaymentResultChosenMethod.PHONE, g0.f, g0.g, g0.h, g0.i, (r41 & 16384) != 0 ? null : null, (32768 & r41) != 0 ? null : null, (65536 & r41) != 0 ? null : null, (r41 & 131072) != 0 ? null : null);
            return;
        }
        if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.SelfTransferParams) {
            TransferMainResultScreenParams.SelfTransferParams selfTransferParams = (TransferMainResultScreenParams.SelfTransferParams) transferMainResultScreenParams;
            g0.a.b(g0.e, tr01.a(resultStatus), AnalyticsSourceScreen.TRANSFER, (r41 & 8) != 0 ? null : selfTransferParams.getSourceAgreementId(), (r41 & 16) != 0 ? null : selfTransferParams.getTargetAgreementId(), (r41 & 32) != 0 ? null : null, (r41 & 64) != 0 ? null : null, (r41 & 128) != 0 ? null : null, (r41 & 256) != 0 ? null : null, TransferEvents$TransferPaymentResultChosenMethod.SELF_TRANSFER, g0.f, g0.g, g0.h, g0.i, (r41 & 16384) != 0 ? null : null, (32768 & r41) != 0 ? null : null, (65536 & r41) != 0 ? null : null, (r41 & 131072) != 0 ? null : null);
            return;
        }
        if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.SelfTopupParams) {
            TransferMainResultScreenParams.SelfTopupParams selfTopupParams = (TransferMainResultScreenParams.SelfTopupParams) transferMainResultScreenParams;
            g0.a.b(g0.e, tr01.a(resultStatus), AnalyticsSourceScreen.TRANSFER, (r41 & 8) != 0 ? null : selfTopupParams.getTargetId(), (r41 & 16) != 0 ? null : selfTopupParams.getSourceAgreementId(), (r41 & 32) != 0 ? null : null, (r41 & 64) != 0 ? null : null, (r41 & 128) != 0 ? null : null, (r41 & 256) != 0 ? null : null, TransferEvents$TransferPaymentResultChosenMethod.SELF_TOPUP, g0.f, g0.g, g0.h, g0.i, (r41 & 16384) != 0 ? null : null, (32768 & r41) != 0 ? null : null, (65536 & r41) != 0 ? null : null, (r41 & 131072) != 0 ? null : null);
            return;
        }
        if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.TransferRequisiteParams) {
            TransferMainResultScreenParams.TransferRequisiteParams transferRequisiteParams = (TransferMainResultScreenParams.TransferRequisiteParams) transferMainResultScreenParams;
            if (transferRequisiteParams instanceof TransferMainResultScreenParams.TransferRequisiteParams.RequisitesHcsTransferParams) {
                transferEvents$TransferPaymentResultChosenMethod = TransferEvents$TransferPaymentResultChosenMethod.REQUISITES_HCS;
            } else if (transferRequisiteParams instanceof TransferMainResultScreenParams.TransferRequisiteParams.RequisitesLegalTransferParams) {
                transferEvents$TransferPaymentResultChosenMethod = TransferEvents$TransferPaymentResultChosenMethod.REQUISITES_LEGAL;
            } else {
                if (!(transferRequisiteParams instanceof TransferMainResultScreenParams.TransferRequisiteParams.RequisitesPersonTransferParams)) {
                    w511.b();
                    return;
                }
                transferEvents$TransferPaymentResultChosenMethod = TransferEvents$TransferPaymentResultChosenMethod.REQUISITES_PERSON;
            }
            g0.a.b(g0.e, tr01.a(resultStatus), AnalyticsSourceScreen.TRANSFER, (r41 & 8) != 0 ? null : transferRequisiteParams.getSourceAgreementId(), (r41 & 16) != 0 ? null : transferRequisiteParams.getAccountNumber(), (r41 & 32) != 0 ? null : null, (r41 & 64) != 0 ? null : transferRequisiteParams.getYbLabel(), (r41 & 128) != 0 ? null : null, (r41 & 256) != 0 ? null : null, transferEvents$TransferPaymentResultChosenMethod, g0.f, g0.g, g0.h, g0.i, (r41 & 16384) != 0 ? null : null, (32768 & r41) != 0 ? null : null, (65536 & r41) != 0 ? null : null, (r41 & 131072) != 0 ? null : null);
            return;
        }
        if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.Me2MeTopupParams) {
            TransferMainResultScreenParams.Me2MeTopupParams me2MeTopupParams = (TransferMainResultScreenParams.Me2MeTopupParams) transferMainResultScreenParams;
            g0.a.b(g0.e, tr01.a(resultStatus), AnalyticsSourceScreen.TRANSFER, (r41 & 8) != 0 ? null : null, (r41 & 16) != 0 ? null : me2MeTopupParams.getTargetAgreementId(), (r41 & 32) != 0 ? null : null, (r41 & 64) != 0 ? null : null, (r41 & 128) != 0 ? null : me2MeTopupParams.getPartnerId(), (r41 & 256) != 0 ? null : null, TransferEvents$TransferPaymentResultChosenMethod.ME2ME_TOPUP, g0.f, g0.g, g0.h, g0.i, (r41 & 16384) != 0 ? null : null, (32768 & r41) != 0 ? null : null, (65536 & r41) != 0 ? null : null, (r41 & 131072) != 0 ? null : null);
            return;
        }
        if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.AftTopupParams) {
            TransferMainResultScreenParams.AftTopupParams aftTopupParams = (TransferMainResultScreenParams.AftTopupParams) transferMainResultScreenParams;
            g0.a.b(g0.e, tr01.a(resultStatus), AnalyticsSourceScreen.TRANSFER, (r41 & 8) != 0 ? null : null, (r41 & 16) != 0 ? null : aftTopupParams.getTargetAgreementId(), (r41 & 32) != 0 ? null : null, (r41 & 64) != 0 ? null : null, (r41 & 128) != 0 ? null : null, (r41 & 256) != 0 ? null : aftTopupParams.getCardId(), TransferEvents$TransferPaymentResultChosenMethod.AFT_TOPUP, g0.f, g0.g, g0.h, g0.i, (r41 & 16384) != 0 ? null : null, (32768 & r41) != 0 ? null : null, (65536 & r41) != 0 ? null : null, (r41 & 131072) != 0 ? null : null);
            return;
        }
        if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.MkkCashoutParams) {
            g0.a.b(g0.e, tr01.a(resultStatus), AnalyticsSourceScreen.TRANSFER, (r41 & 8) != 0 ? null : null, (r41 & 16) != 0 ? null : null, (r41 & 32) != 0 ? null : null, (r41 & 64) != 0 ? null : null, (r41 & 128) != 0 ? null : null, (r41 & 256) != 0 ? null : null, TransferEvents$TransferPaymentResultChosenMethod.SELF_TRANSFER, g0.f, g0.g, g0.h, g0.i, (r41 & 16384) != 0 ? null : null, (32768 & r41) != 0 ? null : null, (65536 & r41) != 0 ? null : null, (r41 & 131072) != 0 ? null : null);
            return;
        }
        if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.B2cTransferParams) {
            TransferMainResultScreenParams.B2cTransferParams b2cTransferParams = (TransferMainResultScreenParams.B2cTransferParams) transferMainResultScreenParams;
            g0.a.b(g0.e, tr01.a(resultStatus), AnalyticsSourceScreen.TRANSFER, (r41 & 8) != 0 ? null : b2cTransferParams.getSourceAgreementId(), (r41 & 16) != 0 ? null : null, (r41 & 32) != 0 ? null : b2cTransferParams.getTargetPhone(), (r41 & 64) != 0 ? null : b2cTransferParams.getTargetPartnerId(), (r41 & 128) != 0 ? null : null, (r41 & 256) != 0 ? null : null, TransferEvents$TransferPaymentResultChosenMethod.B2C_TRANSFER, g0.f, g0.g, g0.h, g0.i, (r41 & 16384) != 0 ? null : null, (32768 & r41) != 0 ? null : null, (65536 & r41) != 0 ? null : null, (r41 & 131072) != 0 ? null : null);
            return;
        }
        if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.MobilePaymentParams) {
            switch (rr01.a[resultStatus.ordinal()]) {
                case 1:
                case 3:
                    appAnalyticsReporter.L.h(MobileServicesEvents$PaymentMobileServicesSuccessScreenLoadedResult.ERROR, str2, str3);
                    appAnalyticsReporter.L.i(MobileServicesEvents$PaymentMobileServicesSuccessScreenShownResult.PENDING, p39Var != null ? wsb1.c(p39Var) : null, str3);
                    break;
                case 2:
                    appAnalyticsReporter.L.h(MobileServicesEvents$PaymentMobileServicesSuccessScreenLoadedResult.ERROR, str2, str3);
                    appAnalyticsReporter.L.i(MobileServicesEvents$PaymentMobileServicesSuccessScreenShownResult.ERROR, p39Var != null ? wsb1.c(p39Var) : null, str3);
                    break;
                case 4:
                case 5:
                case 6:
                    appAnalyticsReporter.L.h(MobileServicesEvents$PaymentMobileServicesSuccessScreenLoadedResult.OK, null, str3);
                    appAnalyticsReporter.L.i(MobileServicesEvents$PaymentMobileServicesSuccessScreenShownResult.SUCCESS, p39Var != null ? wsb1.c(p39Var) : null, str3);
                    break;
                case 7:
                    break;
                default:
                    w511.b();
                    break;
            }
            return;
        }
        if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.InternetPaymentParams) {
            switch (rr01.a[resultStatus.ordinal()]) {
                case 1:
                case 3:
                    appAnalyticsReporter.E.d(InternetServicesEvents$PaymentInternetTvSuccessScreenLoadedResult.ERROR, str2, str3);
                    appAnalyticsReporter.E.e(InternetServicesEvents$PaymentInternetTvSuccessScreenShownResult.PENDING, p39Var != null ? wsb1.c(p39Var) : null, str3);
                    break;
                case 2:
                    appAnalyticsReporter.E.d(InternetServicesEvents$PaymentInternetTvSuccessScreenLoadedResult.ERROR, str2, str3);
                    appAnalyticsReporter.E.e(InternetServicesEvents$PaymentInternetTvSuccessScreenShownResult.ERROR, p39Var != null ? wsb1.c(p39Var) : null, str3);
                    break;
                case 4:
                case 5:
                case 6:
                    appAnalyticsReporter.E.d(InternetServicesEvents$PaymentInternetTvSuccessScreenLoadedResult.OK, null, str3);
                    appAnalyticsReporter.E.e(InternetServicesEvents$PaymentInternetTvSuccessScreenShownResult.SUCCESS, p39Var != null ? wsb1.c(p39Var) : null, str3);
                    break;
                case 7:
                    break;
                default:
                    w511.b();
                    break;
            }
            return;
        }
        if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.C2gTransferParams) {
            switch (rr01.a[resultStatus.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    appAnalyticsReporter.B.r(GovServicesEvents$PaymentGovSuccessScreenLoadedResult.ERROR, str2);
                    break;
                case 4:
                case 5:
                case 6:
                    appAnalyticsReporter.B.r(GovServicesEvents$PaymentGovSuccessScreenLoadedResult.OK, null);
                    break;
                case 7:
                    break;
                default:
                    w511.b();
                    break;
            }
            return;
        }
        if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.HcsInvoiceTransferParams) {
            return;
        }
        if (!(transferMainResultScreenParams instanceof TransferMainResultScreenParams.CrossBorderByPhoneParams)) {
            w511.b();
            return;
        }
        us3 us3Var = g0.a;
        String str4 = g0.e;
        AnalyticsPaymentStatus a = tr01.a(resultStatus);
        AnalyticsSourceScreen analyticsSourceScreen = AnalyticsSourceScreen.TRANSFER;
        TransferMainResultScreenParams.CrossBorderByPhoneParams crossBorderByPhoneParams = (TransferMainResultScreenParams.CrossBorderByPhoneParams) transferMainResultScreenParams;
        String sourceAgreementId = crossBorderByPhoneParams.getSourceAgreementId();
        String phone = crossBorderByPhoneParams.getPhone();
        String partnerId = crossBorderByPhoneParams.getPartnerId();
        TransferEvents$TransferPaymentResultChosenMethod transferEvents$TransferPaymentResultChosenMethod2 = TransferEvents$TransferPaymentResultChosenMethod.CROSS_BORDER;
        String str5 = g0.f;
        String str6 = g0.g;
        String str7 = g0.h;
        String str8 = g0.i;
        String plainString = crossBorderByPhoneParams.getMoney().getAmount().toPlainString();
        String plainString2 = crossBorderByPhoneParams.getCreditMoney().getAmount().toPlainString();
        String currency = crossBorderByPhoneParams.getCreditMoney().getCurrency();
        TransferMainResultScreenParams.CurrencyRateEntity currencyRate = crossBorderByPhoneParams.getCurrencyRate();
        us3Var.b(str4, a, analyticsSourceScreen, (r41 & 8) != 0 ? null : sourceAgreementId, (r41 & 16) != 0 ? null : null, (r41 & 32) != 0 ? null : phone, (r41 & 64) != 0 ? null : partnerId, (r41 & 128) != 0 ? null : null, (r41 & 256) != 0 ? null : null, transferEvents$TransferPaymentResultChosenMethod2, str5, str6, str7, str8, (r41 & 16384) != 0 ? null : plainString, (32768 & r41) != 0 ? null : plainString2, (65536 & r41) != 0 ? null : currency, (r41 & 131072) != 0 ? null : currencyRate != null ? currencyRate.getRate() : null);
    }

    public final tr01 g0() {
        return (tr01) this.O.getValue();
    }

    public final void h0() {
        r0 r0Var;
        Object value;
        pzt0 pzt0Var = this.L;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.L = null;
        pzt0 pzt0Var2 = this.M;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.M = null;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, kk01.a((kk01) value, null, ResultStatus.FAILED, null, null, new Text.Resource(dzh0.ybsdk_transfer_transfer_3ds_error_title), new Text.Resource(dzh0.ybsdk_transfer_transfer_3ds_error_subtitle), null, null, null, null, Required3dsPageState.PAGE_FAILURE, 3995)));
    }

    public final void i0() {
        tr01 g0 = g0();
        em3 em3Var = g0.b.q0;
        em3Var.a.a("transfer.3ds_required", g8e.w(1, "transfer_session_id", g0.f));
    }

    public final void j0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, kk01.a((kk01) value, null, null, null, null, null, null, null, null, null, null, Required3dsPageState.PAGE_SUCCESS, 4095)));
    }

    public final void k0(String str, boolean z) {
        String action;
        if (z) {
            ActionButtonEntity primaryButton = ((kk01) X()).a.getPrimaryButton();
            if (primaryButton != null) {
                action = primaryButton.getAction();
            }
            action = null;
        } else {
            ActionButtonEntity secondaryButton = ((kk01) X()).a.getSecondaryButton();
            if (secondaryButton != null) {
                action = secondaryButton.getAction();
            }
            action = null;
        }
        tr01 g0 = g0();
        AppAnalyticsReporter appAnalyticsReporter = g0.b;
        hwo0 hwo0Var = g0.d;
        if (hwo0Var != null) {
            z94 z94Var = ((AppAnalyticsReporter) hwo0Var.c).n0;
            TemplatePaymentTypeTransfers templatePaymentTypeTransfers = (TemplatePaymentTypeTransfers) hwo0Var.w;
            LinkedHashMap linkedHashMap = new LinkedHashMap(2);
            linkedHashMap.put("type", templatePaymentTypeTransfers.getOriginalValue());
            linkedHashMap.put("button", str);
            z94Var.a.a("template_transfer.success_screen_click", linkedHashMap);
        } else {
            TransferMainResultScreenParams transferMainResultScreenParams = g0.c;
            if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.MobilePaymentParams) {
                appAnalyticsReporter.L.a.a("payment.mobile_services.success_screen_click", g8e.w(1, "button", str));
            } else if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.InternetPaymentParams) {
                appAnalyticsReporter.E.a.a("payment.internet_tv.success_screen_click", g8e.w(1, "button", str));
            } else if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.C2gTransferParams) {
                appAnalyticsReporter.B.a.a("payment.gov.payment_screen.pay_button.click", null);
            } else if ((transferMainResultScreenParams instanceof TransferMainResultScreenParams.Me2MeTopupParams) || (transferMainResultScreenParams instanceof TransferMainResultScreenParams.AftTopupParams) || (transferMainResultScreenParams instanceof TransferMainResultScreenParams.PhoneTransferParams) || (transferMainResultScreenParams instanceof TransferMainResultScreenParams.B2cTransferParams) || (transferMainResultScreenParams instanceof TransferMainResultScreenParams.SelfTopupParams) || (transferMainResultScreenParams instanceof TransferMainResultScreenParams.SelfTransferParams) || (transferMainResultScreenParams instanceof TransferMainResultScreenParams.MkkCashoutParams) || (transferMainResultScreenParams instanceof TransferMainResultScreenParams.TransferRequisiteParams.RequisitesHcsTransferParams) || (transferMainResultScreenParams instanceof TransferMainResultScreenParams.TransferRequisiteParams.RequisitesLegalTransferParams) || (transferMainResultScreenParams instanceof TransferMainResultScreenParams.TransferRequisiteParams.RequisitesPersonTransferParams) || (transferMainResultScreenParams instanceof TransferMainResultScreenParams.CrossBorderByPhoneParams)) {
                em3 em3Var = appAnalyticsReporter.q0;
                String str2 = g0.e;
                String str3 = g0.f;
                String str4 = g0.g;
                String str5 = g0.h;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(5);
                if (action != null) {
                    linkedHashMap2.put("action", action);
                }
                if (str2 != null) {
                    linkedHashMap2.put(CreateApplicationWithProductJsonAdapter.productKey, str2);
                }
                if (str3 != null) {
                    linkedHashMap2.put("transfer_session_id", str3);
                }
                if (str4 != null) {
                    linkedHashMap2.put("transfer_direction", str4);
                }
                if (str5 != null) {
                    linkedHashMap2.put("transfer_scenario", str5);
                }
                em3Var.a.a("transfer.result_screen.primary_button.click", linkedHashMap2);
            } else if (!(transferMainResultScreenParams instanceof TransferMainResultScreenParams.HcsInvoiceTransferParams)) {
                w511.b();
                return;
            }
        }
        rm01 rm01Var = this.F;
        y0h e = action != null ? h791.e(((ou01) rm01Var).a, action, false, null, 14) : null;
        if ((e instanceof v0h) || (e instanceof w0h)) {
            return;
        }
        if (!(e instanceof x0h) && e != null) {
            w511.b();
            return;
        }
        String str6 = ((kk01) X()).h;
        if (str6 != null) {
            ((ou01) rm01Var).a(str6);
        } else {
            this.C.e();
        }
    }

    public final boolean l0(Uri uri) {
        return h791.e(this.H, uri.toString(), false, null, 14) instanceof v0h;
    }

    public final void m0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h791.e(((ou01) this.F).a, (String) it.next(), false, null, 14);
        }
    }

    public final void n0() {
        tr01 g0 = g0();
        TransferMainResultScreenParams transferMainResultScreenParams = g0.c;
        if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.C2gTransferParams) {
            g0.b.B.a.a("payment.gov.success_screen.click", null);
        } else if (!(transferMainResultScreenParams instanceof TransferMainResultScreenParams.AftTopupParams) && !(transferMainResultScreenParams instanceof TransferMainResultScreenParams.B2cTransferParams) && !(transferMainResultScreenParams instanceof TransferMainResultScreenParams.InternetPaymentParams) && !(transferMainResultScreenParams instanceof TransferMainResultScreenParams.Me2MeTopupParams) && !(transferMainResultScreenParams instanceof TransferMainResultScreenParams.MobilePaymentParams) && !(transferMainResultScreenParams instanceof TransferMainResultScreenParams.PhoneTransferParams) && !(transferMainResultScreenParams instanceof TransferMainResultScreenParams.SelfTopupParams) && !(transferMainResultScreenParams instanceof TransferMainResultScreenParams.SelfTransferParams) && !(transferMainResultScreenParams instanceof TransferMainResultScreenParams.MkkCashoutParams) && !(transferMainResultScreenParams instanceof TransferMainResultScreenParams.TransferRequisiteParams.RequisitesHcsTransferParams) && !(transferMainResultScreenParams instanceof TransferMainResultScreenParams.TransferRequisiteParams.RequisitesLegalTransferParams) && !(transferMainResultScreenParams instanceof TransferMainResultScreenParams.TransferRequisiteParams.RequisitesPersonTransferParams) && !(transferMainResultScreenParams instanceof TransferMainResultScreenParams.HcsInvoiceTransferParams) && !(transferMainResultScreenParams instanceof TransferMainResultScreenParams.CrossBorderByPhoneParams)) {
            w511.b();
            return;
        }
        o0();
    }

    public final void o0() {
        TransferEvents$TransferScenarioCloseStatus transferEvents$TransferScenarioCloseStatus;
        tr01 g0 = g0();
        kk01 kk01Var = (kk01) X();
        g0.getClass();
        switch (rr01.a[kk01Var.c.ordinal()]) {
            case 1:
                transferEvents$TransferScenarioCloseStatus = TransferEvents$TransferScenarioCloseStatus.PROCESSING;
                break;
            case 2:
            case 3:
                transferEvents$TransferScenarioCloseStatus = TransferEvents$TransferScenarioCloseStatus.ERROR;
                break;
            case 4:
            case 5:
            case 6:
                transferEvents$TransferScenarioCloseStatus = TransferEvents$TransferScenarioCloseStatus.SUCCESS;
                break;
            case 7:
                if (kk01Var.k != null && kk01Var.l == Required3dsPageState.PAGE_SUCCESS) {
                    transferEvents$TransferScenarioCloseStatus = TransferEvents$TransferScenarioCloseStatus.CHALLENGE;
                    break;
                } else {
                    transferEvents$TransferScenarioCloseStatus = TransferEvents$TransferScenarioCloseStatus.PROCESSING;
                    break;
                }
                break;
            default:
                w511.b();
                return;
        }
        g0.b.q0.I(transferEvents$TransferScenarioCloseStatus, g0.f, g0.g, g0.h);
        p0(ah01.b);
        String closeAction = ((kk01) X()).a.getCloseAction();
        y0h e = closeAction != null ? h791.e(((ou01) this.F).a, closeAction, false, null, 14) : null;
        if ((e instanceof v0h) || (e instanceof w0h)) {
            return;
        }
        if ((e instanceof x0h) || e == null) {
            this.C.e();
        } else {
            w511.b();
        }
    }

    public final void p0(ye0 ye0Var) {
        String str;
        Object obj = ((c1x0) this.I).a;
        int i = zr51.a[this.B.getDirection().ordinal()];
        if (i == 1) {
            str = "transfer";
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            str = TopupFragment.WEBVIEW_NAME;
        }
        this.J.a.f(new eh51(g8e.p(str, "_section.", ye0Var.a)));
    }

    public final void q0(String str) {
        TransferEvents$TransferPaymentInitiatedChosenMethod transferEvents$TransferPaymentInitiatedChosenMethod;
        tr01 g0 = g0();
        AppAnalyticsReporter appAnalyticsReporter = g0.b;
        TransferMainResultScreenParams transferMainResultScreenParams = g0.c;
        String str2 = g0.i;
        hwo0 hwo0Var = g0.d;
        if (hwo0Var != null) {
            z94 z94Var = ((AppAnalyticsReporter) hwo0Var.c).n0;
            TemplatePaymentTypeTransfers templatePaymentTypeTransfers = (TemplatePaymentTypeTransfers) hwo0Var.w;
            LinkedHashMap linkedHashMap = new LinkedHashMap(2);
            linkedHashMap.put("type", templatePaymentTypeTransfers.getOriginalValue());
            if (str2 != null) {
                linkedHashMap.put("transfer_id", str2);
            }
            z94Var.a.a("template_transfer.success_screen_initiated", linkedHashMap);
        } else if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.PhoneTransferParams) {
            wva1.e(g0.a, g0.e, AnalyticsSourceScreen.TRANSFER, TransferEvents$TransferPaymentInitiatedChosenMethod.PHONE, ((TransferMainResultScreenParams.PhoneTransferParams) transferMainResultScreenParams).getPartnerId(), g0.f, g0.g, g0.h, g0.i, 256);
        } else if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.B2cTransferParams) {
            TransferMainResultScreenParams.B2cTransferParams b2cTransferParams = (TransferMainResultScreenParams.B2cTransferParams) transferMainResultScreenParams;
            wva1.e(g0.a, g0.e, AnalyticsSourceScreen.TRANSFER, TransferEvents$TransferPaymentInitiatedChosenMethod.PHONE, b2cTransferParams.getTargetPartnerId(), g0.f, g0.g, g0.h, b2cTransferParams.getTransferId(), 256);
        } else if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.SelfTransferParams) {
            wva1.e(g0.a, g0.e, AnalyticsSourceScreen.TRANSFER, TransferEvents$TransferPaymentInitiatedChosenMethod.SELF_TRANSFER, null, g0.f, g0.g, g0.h, str2, 256);
        } else if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.SelfTopupParams) {
            wva1.e(g0.a, g0.e, AnalyticsSourceScreen.TRANSFER, TransferEvents$TransferPaymentInitiatedChosenMethod.SELF_TOPUP, null, g0.f, g0.g, g0.h, str2, 256);
        } else if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.TransferRequisiteParams) {
            TransferMainResultScreenParams.TransferRequisiteParams transferRequisiteParams = (TransferMainResultScreenParams.TransferRequisiteParams) transferMainResultScreenParams;
            if (transferRequisiteParams instanceof TransferMainResultScreenParams.TransferRequisiteParams.RequisitesHcsTransferParams) {
                transferEvents$TransferPaymentInitiatedChosenMethod = TransferEvents$TransferPaymentInitiatedChosenMethod.REQUISITES_HCS;
            } else if (transferRequisiteParams instanceof TransferMainResultScreenParams.TransferRequisiteParams.RequisitesLegalTransferParams) {
                transferEvents$TransferPaymentInitiatedChosenMethod = TransferEvents$TransferPaymentInitiatedChosenMethod.REQUISITES_LEGAL;
            } else {
                if (!(transferRequisiteParams instanceof TransferMainResultScreenParams.TransferRequisiteParams.RequisitesPersonTransferParams)) {
                    w511.b();
                    return;
                }
                transferEvents$TransferPaymentInitiatedChosenMethod = TransferEvents$TransferPaymentInitiatedChosenMethod.REQUISITES_PERSON;
            }
            wva1.e(g0.a, g0.e, AnalyticsSourceScreen.TRANSFER, transferEvents$TransferPaymentInitiatedChosenMethod, transferRequisiteParams.getYbLabel(), g0.f, g0.g, g0.h, g0.i, 256);
        } else if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.Me2MeTopupParams) {
            wva1.e(g0.a, g0.e, AnalyticsSourceScreen.TRANSFER, TransferEvents$TransferPaymentInitiatedChosenMethod.ME2ME_TOPUP, ssa1.b(((TransferMainResultScreenParams.Me2MeTopupParams) transferMainResultScreenParams).getPartnerId()), g0.f, g0.g, g0.h, g0.i, 256);
        } else if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.AftTopupParams) {
            us3 us3Var = g0.a;
            String str3 = g0.e;
            AnalyticsSourceScreen analyticsSourceScreen = AnalyticsSourceScreen.TRANSFER;
            String partnerId = ((TransferMainResultScreenParams.AftTopupParams) transferMainResultScreenParams).getPartnerId();
            wva1.e(us3Var, str3, analyticsSourceScreen, TransferEvents$TransferPaymentInitiatedChosenMethod.AFT_TOPUP, partnerId != null ? ssa1.b(partnerId) : null, g0.f, g0.g, g0.h, g0.i, 256);
        } else if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.MkkCashoutParams) {
            wva1.e(g0.a, g0.e, AnalyticsSourceScreen.TRANSFER, TransferEvents$TransferPaymentInitiatedChosenMethod.SELF_TRANSFER, null, g0.f, g0.g, g0.h, str2, 256);
        } else if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.MobilePaymentParams) {
            qq7 qq7Var = appAnalyticsReporter.L;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(1);
            if (str2 != null) {
                linkedHashMap2.put("transfer_id", str2);
            }
            qq7Var.a.a("payment.mobile_services.success_screen_initiated", linkedHashMap2);
        } else if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.InternetPaymentParams) {
            l0p l0pVar = appAnalyticsReporter.E;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(1);
            if (str2 != null) {
                linkedHashMap3.put("transfer_id", str2);
            }
            l0pVar.a.a("payment.internet_tv.success_screen_initiated", linkedHashMap3);
        } else if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.C2gTransferParams) {
            appAnalyticsReporter.B.a.a("payment.gov.success_screen.initiated", null);
        } else if (!(transferMainResultScreenParams instanceof TransferMainResultScreenParams.HcsInvoiceTransferParams)) {
            if (!(transferMainResultScreenParams instanceof TransferMainResultScreenParams.CrossBorderByPhoneParams)) {
                w511.b();
                return;
            } else {
                TransferMainResultScreenParams.CrossBorderByPhoneParams crossBorderByPhoneParams = (TransferMainResultScreenParams.CrossBorderByPhoneParams) transferMainResultScreenParams;
                g0.a.a(g0.e, AnalyticsSourceScreen.TRANSFER, TransferEvents$TransferPaymentInitiatedChosenMethod.CROSS_BORDER, crossBorderByPhoneParams.getPartnerId(), g0.f, g0.g, g0.h, g0.i, crossBorderByPhoneParams.getPartnerId());
            }
        }
        String str4 = ((kk01) X()).e;
        if (str == null || str4 == null || ((kk01) X()).b.getScenario() != TransferScenario.MKK_CASHOUT) {
            pzt0 pzt0Var = this.L;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            this.L = tje.N(ds31.a(this), null, null, new TransferMainResultViewModel$callConfirm$1(this, str, null), 3);
            return;
        }
        pzt0 pzt0Var2 = this.M;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.M = tje.N(ds31.a(this), null, null, new TransferMainResultViewModel$callGetResult$1(this, str4, null), 3);
    }
}
