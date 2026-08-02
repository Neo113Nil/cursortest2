package com.ybsdk.feature.transfer.version2.internal.screens.main.presentation;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.TopupFragment;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.ResultCommon;
import com.ybsdk.core.analytics.generated.TemplatePaymentTypeTransfers;
import com.ybsdk.core.analytics.generated.delegates.GovServicesEvents$PaymentGovPaymentScreenLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.InternetServicesEvents$PaymentInternetTvPaymentLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.MobileServicesEvents$PaymentMobileServicesPaymentLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.TemplateTransferEvents$TemplateTransferLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferByDetailsLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferLoadedPrerequisites;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferScenarioCloseStatus;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferToggleSwitchClickedAction;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.core.transfer.utils.TransferDeeplink;
import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.core.transfer.utils.domain.entities.PartnerEntity;
import com.ybsdk.core.utils.coroutines.DebounceRequestRunner$PreviousRequestStrategy;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.di.modules.features.v;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import com.ybsdk.feature.partnerselection.api.CrossBorderCheckResult$PriorityMoneyType;
import com.ybsdk.feature.partnerselection.api.SelectedPartner;
import com.ybsdk.feature.partnerselection.api.SelectedPartnerCrossBorderData;
import com.ybsdk.feature.transfer.version2.api.CrossBorderScenario;
import com.ybsdk.feature.transfer.version2.api.PhoneInputSource;
import com.ybsdk.feature.transfer.version2.api.TransferDirection;
import com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams;
import com.ybsdk.feature.transfer.version2.api.TransferMainScreenArguments;
import com.ybsdk.feature.transfer.version2.api.TransferPrerequisites;
import com.ybsdk.feature.transfer.version2.api.entities.AutoFundPayloadEntity;
import com.ybsdk.feature.transfer.version2.api.entities.MiddleNameEntity;
import com.ybsdk.feature.transfer.version2.api.entities.TransferResultPageEntity;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.ButtonTransferType;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.PaymentProviderEntity;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.RequisitesHcsTransferPayloadEntity;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.RequisitesLegalTransferPayloadEntity;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.RequisitesPersonTransferPayloadEntity;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.RequisitesTarget;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType;
import com.ybsdk.feature.transfer.version2.internal.entities.ControlState;
import com.ybsdk.feature.transfer.version2.internal.network.dto.PrerequisiteParam;
import com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.forminput.presentation.InternetPaymentFormInputScreenParams;
import com.ybsdk.feature.transfer.version2.internal.screens.main.domain.Toggles;
import com.ybsdk.feature.transfer.version2.internal.screens.main.domain.TransferMainAnalyticsInteractor$Companion$LogType;
import com.ybsdk.feature.transfer.version2.internal.screens.main.domain.b;
import com.ybsdk.feature.transfer.version2.internal.screens.main.domain.entities.RequisitesTransferPayloadEntity;
import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.TransferMainState$Success$OpenScenario;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.TransferPhoneInputFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.receivername.TransferReceiverNameFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.RequisiteTarget;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteResultEntity;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteScreenParams;
import com.ybsdk.network.dto.CreateApplicationWithProductJsonAdapter;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import com.ybsdk.rconfig.configs.TopupOpenKycEds;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.widgets.common.StadiumButtonView;
import com.ybsdk.widgets.common.o;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import defpackage.a201;
import defpackage.af6;
import defpackage.ai90;
import defpackage.ajq0;
import defpackage.ak1;
import defpackage.al01;
import defpackage.avu0;
import defpackage.b041;
import defpackage.b3z;
import defpackage.bf6;
import defpackage.bjq0;
import defpackage.bob1;
import defpackage.c1x0;
import defpackage.ccf;
import defpackage.cf6;
import defpackage.cjq0;
import defpackage.dj01;
import defpackage.djq0;
import defpackage.dl01;
import defpackage.ds31;
import defpackage.dzh0;
import defpackage.dzw0;
import defpackage.e3n;
import defpackage.eg01;
import defpackage.eh01;
import defpackage.eh51;
import defpackage.ejq0;
import defpackage.el0;
import defpackage.el01;
import defpackage.em3;
import defpackage.evu0;
import defpackage.fjq0;
import defpackage.fl01;
import defpackage.g8e;
import defpackage.g8r0;
import defpackage.gao;
import defpackage.gf91;
import defpackage.gjq0;
import defpackage.gl01;
import defpackage.gtu0;
import defpackage.hag;
import defpackage.hg6;
import defpackage.hjq0;
import defpackage.hl01;
import defpackage.hwo0;
import defpackage.i3y;
import defpackage.ig6;
import defpackage.ijq0;
import defpackage.il01;
import defpackage.jjq0;
import defpackage.jkc;
import defpackage.jl01;
import defpackage.jl40;
import defpackage.k5c;
import defpackage.kj01;
import defpackage.kjq0;
import defpackage.kp50;
import defpackage.ku01;
import defpackage.l0p;
import defpackage.lfq0;
import defpackage.ljq0;
import defpackage.ll01;
import defpackage.lrp0;
import defpackage.m031;
import defpackage.mfq0;
import defpackage.mj01;
import defpackage.mjq0;
import defpackage.mjt0;
import defpackage.mu01;
import defpackage.n0t0;
import defpackage.n3w;
import defpackage.njq0;
import defpackage.nl01;
import defpackage.nu01;
import defpackage.o430;
import defpackage.ojq0;
import defpackage.ol01;
import defpackage.orp0;
import defpackage.ou01;
import defpackage.p031;
import defpackage.phq0;
import defpackage.pjq0;
import defpackage.pl01;
import defpackage.pv3;
import defpackage.px11;
import defpackage.pxy0;
import defpackage.pz40;
import defpackage.qj01;
import defpackage.qjq0;
import defpackage.qoi0;
import defpackage.qq7;
import defpackage.qu01;
import defpackage.r501;
import defpackage.r6q0;
import defpackage.rbv;
import defpackage.ri01;
import defpackage.rj01;
import defpackage.rjq0;
import defpackage.rl01;
import defpackage.rm01;
import defpackage.rmy0;
import defpackage.ro01;
import defpackage.rt1;
import defpackage.rv3;
import defpackage.rvz0;
import defpackage.s031;
import defpackage.sfy0;
import defpackage.sjq0;
import defpackage.sl;
import defpackage.ssa1;
import defpackage.t031;
import defpackage.t451;
import defpackage.t910;
import defpackage.tc01;
import defpackage.tcc;
import defpackage.tfl0;
import defpackage.tfq0;
import defpackage.tg01;
import defpackage.tg6;
import defpackage.tjc;
import defpackage.tje;
import defpackage.tjq0;
import defpackage.tls;
import defpackage.tm60;
import defpackage.u031;
import defpackage.uc5;
import defpackage.ujq0;
import defpackage.uk01;
import defpackage.unq;
import defpackage.unr0;
import defpackage.uza;
import defpackage.v0h;
import defpackage.v24;
import defpackage.vfy0;
import defpackage.vg6;
import defpackage.vjq0;
import defpackage.vk01;
import defpackage.vm01;
import defpackage.w511;
import defpackage.w530;
import defpackage.wgk;
import defpackage.wjq0;
import defpackage.wk01;
import defpackage.wlp;
import defpackage.x0h;
import defpackage.x4c;
import defpackage.x4e;
import defpackage.xgk;
import defpackage.xk01;
import defpackage.xk1;
import defpackage.xmq0;
import defpackage.yi1;
import defpackage.yk01;
import defpackage.yl01;
import defpackage.ymq0;
import defpackage.z94;
import defpackage.zk01;
import defpackage.zr51;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.r0;
import org.json.JSONArray;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public static final long Z;
    public static final /* synthetic */ int a0 = 0;
    public final com.ybsdk.feature.transfer.version2.internal.screens.a B;
    public final tfl0 C;
    public final rm01 D;
    public final v E;
    public final ro01 F;
    public final dj01 G;
    public final ccf H;
    public final b I;
    public final eg01 J;
    public final mjt0 K;
    public final ku01 L;
    public final ai90 M;
    public final w530 N;
    public final TransferMainScreenArguments O;
    public boolean P;
    public final com.ybsdk.core.utils.coroutines.a Q;
    public final TransferDirection R;
    public final boolean S;
    public final i3y T;
    public final TransferPrerequisites.Template U;
    public final qj01 V;
    public final com.ybsdk.feature.transfer.version2.internal.domain.b W;

    static {
        o430 o430Var = e3n.b;
        Z = kp50.U(500, DurationUnit.MILLISECONDS);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(yl01 yl01Var, com.ybsdk.feature.transfer.version2.internal.screens.a aVar, tfl0 tfl0Var, TransferMainScreenParams transferMainScreenParams, rm01 rm01Var, tg01 tg01Var, rj01 rj01Var, v vVar, ro01 ro01Var, dj01 dj01Var, ccf ccfVar, b bVar, eg01 eg01Var, mjt0 mjt0Var, ku01 ku01Var, ai90 ai90Var, w530 w530Var) {
        super(new tc01(8), yl01Var);
        TemplatePaymentTypeTransfers templatePaymentTypeTransfers;
        TransferMainAnalyticsInteractor$Companion$LogType transferMainAnalyticsInteractor$Companion$LogType;
        this.B = aVar;
        this.C = tfl0Var;
        this.D = rm01Var;
        this.E = vVar;
        this.F = ro01Var;
        this.G = dj01Var;
        this.H = ccfVar;
        this.I = bVar;
        this.J = eg01Var;
        this.K = mjt0Var;
        this.L = ku01Var;
        this.M = ai90Var;
        this.N = w530Var;
        TransferMainScreenArguments args = transferMainScreenParams.getArgs();
        this.O = args;
        k5c a = ds31.a(this);
        com.ybsdk.rconfig.b bVar2 = ((qu01) ro01Var).b;
        this.Q = new com.ybsdk.core.utils.coroutines.a(a, ((CommonFeatureFlag) bVar2.d(wlp.r0).getData()).isEnabled() ? DebounceRequestRunner$PreviousRequestStrategy.KeepRunning : DebounceRequestRunner$PreviousRequestStrategy.CancelPrevious);
        this.R = args.getDirection();
        this.S = args.getScenario() != null;
        this.T = kotlin.a.a(new tc01(9));
        TransferPrerequisites prerequisites = args.getPrerequisites();
        TransferPrerequisites.Template template = prerequisites instanceof TransferPrerequisites.Template ? (TransferPrerequisites.Template) prerequisites : null;
        this.U = template;
        if (template != null) {
            String type = template.getType();
            com.ybsdk.feature.transfer.version2.internal.network.dto.a aVar2 = PrerequisiteParam.TransfersPagePrerequisiteType.Companion;
            type = type == null ? "" : type;
            aVar2.getClass();
            PrerequisiteParam.TransfersPagePrerequisiteType a2 = com.ybsdk.feature.transfer.version2.internal.network.dto.a.a(type);
            int i = a2 == null ? -1 : sfy0.b[a2.ordinal()];
            templatePaymentTypeTransfers = i != 1 ? i != 2 ? i != 3 ? null : TemplatePaymentTypeTransfers.TELECOM : TemplatePaymentTypeTransfers.MOBILE : TemplatePaymentTypeTransfers.PHONE;
        } else {
            templatePaymentTypeTransfers = null;
        }
        TransferPrerequisites prerequisites2 = args.getPrerequisites();
        TransferPrerequisites.Template template2 = prerequisites2 instanceof TransferPrerequisites.Template ? (TransferPrerequisites.Template) prerequisites2 : null;
        if (template2 != null) {
            String type2 = template2.getType();
            com.ybsdk.feature.transfer.version2.internal.network.dto.a aVar3 = PrerequisiteParam.TransfersPagePrerequisiteType.Companion;
            String str = type2 != null ? type2 : "";
            aVar3.getClass();
            PrerequisiteParam.TransfersPagePrerequisiteType a3 = com.ybsdk.feature.transfer.version2.internal.network.dto.a.a(str);
            int i2 = a3 == null ? -1 : sfy0.b[a3.ordinal()];
            if ((i2 != 1 ? i2 != 2 ? i2 != 3 ? null : TemplatePaymentTypeTransfers.TELECOM : TemplatePaymentTypeTransfers.MOBILE : TemplatePaymentTypeTransfers.PHONE) != null) {
                transferMainAnalyticsInteractor$Companion$LogType = TransferMainAnalyticsInteractor$Companion$LogType.TEMPLATE;
                TransferMainAnalyticsInteractor$Companion$LogType transferMainAnalyticsInteractor$Companion$LogType2 = transferMainAnalyticsInteractor$Companion$LogType;
                String h0 = h0();
                String name = args.getDirection().name();
                TransferScenario scenario = args.getScenario();
                String name2 = scenario == null ? scenario.name() : null;
                String templateId = template == null ? template.getTemplateId() : null;
                String templateType = template == null ? template.getTemplateType() : null;
                a201 a201Var = rj01Var.a;
                this.V = new qj01((AppAnalyticsReporter) ((hag) a201Var.b).get(), (vfy0) ((n3w) a201Var.c).a, h0, name, name2, transferMainAnalyticsInteractor$Companion$LogType2, templatePaymentTypeTransfers, templateId, templateType);
                this.W = tg01Var.a(args.getScenario());
                tje.N(ds31.a(this), null, null, new TransferMainViewModel$collectWidgetAppearanceData$1(this, null), 3);
                T0();
                if (args.getOpenKycEds() && args.getDirection() == TransferDirection.TOPUP) {
                    String esiaStartDeeplink = ((TopupOpenKycEds) bVar2.d(bVar2.i.t).getData()).getEsiaStartDeeplink();
                    ((nu01) dj01Var).a(esiaStartDeeplink == null ? new DeeplinkAction.OpenEsia(null, null, false, 7, null).getDeeplinkUri().toString() : esiaStartDeeplink);
                }
                k5c a4 = ds31.a(this);
                tje.N(a4, null, null, new TransferMainViewModel$2$1(this, null), 3);
                tje.N(a4, null, null, new TransferMainViewModel$2$2(this, null), 3);
                tje.N(a4, null, null, new TransferMainViewModel$2$3(this, null), 3);
                tje.N(a4, null, null, new TransferMainViewModel$2$4(this, null), 3);
                fl01 fl01Var = new fl01(this, 0);
                b3z b3zVar = ((nu01) dj01Var).a;
                DeeplinkHandleResult$DeeplinkType deeplinkHandleResult$DeeplinkType = DeeplinkHandleResult$DeeplinkType.SCREEN_OPEN;
                b3zVar.a(new mu01(deeplinkHandleResult$DeeplinkType, fl01Var, 2));
                fl01 fl01Var2 = new fl01(this, 1);
                DeeplinkHandleResult$DeeplinkType deeplinkHandleResult$DeeplinkType2 = DeeplinkHandleResult$DeeplinkType.ACTION;
                b3zVar.a(new rv3(deeplinkHandleResult$DeeplinkType2, fl01Var2, 6));
                b3zVar.a(new mu01(deeplinkHandleResult$DeeplinkType2, new fl01(this, 2), 3));
                b3zVar.a(new mu01(deeplinkHandleResult$DeeplinkType, new fl01(this, 3), 0));
                b3zVar.a(new mu01(deeplinkHandleResult$DeeplinkType, new gl01(this, 1), 1));
            }
        }
        TransferScenario scenario2 = args.getScenario();
        switch (scenario2 != null ? sfy0.a[scenario2.ordinal()] : -1) {
            case -1:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                transferMainAnalyticsInteractor$Companion$LogType = TransferMainAnalyticsInteractor$Companion$LogType.TRANSFER;
                break;
            case 0:
            default:
                w511.b();
                throw null;
            case 1:
                transferMainAnalyticsInteractor$Companion$LogType = TransferMainAnalyticsInteractor$Companion$LogType.MOBILE_PAYMENT;
                break;
            case 2:
                transferMainAnalyticsInteractor$Companion$LogType = TransferMainAnalyticsInteractor$Companion$LogType.INTERNET_PAYMENT;
                break;
            case 3:
                transferMainAnalyticsInteractor$Companion$LogType = TransferMainAnalyticsInteractor$Companion$LogType.C2G;
                break;
        }
        TransferMainAnalyticsInteractor$Companion$LogType transferMainAnalyticsInteractor$Companion$LogType22 = transferMainAnalyticsInteractor$Companion$LogType;
        String h02 = h0();
        String name3 = args.getDirection().name();
        TransferScenario scenario3 = args.getScenario();
        if (scenario3 == null) {
        }
        if (template == null) {
        }
        if (template == null) {
        }
        a201 a201Var2 = rj01Var.a;
        this.V = new qj01((AppAnalyticsReporter) ((hag) a201Var2.b).get(), (vfy0) ((n3w) a201Var2.c).a, h02, name3, name2, transferMainAnalyticsInteractor$Companion$LogType22, templatePaymentTypeTransfers, templateId, templateType);
        this.W = tg01Var.a(args.getScenario());
        tje.N(ds31.a(this), null, null, new TransferMainViewModel$collectWidgetAppearanceData$1(this, null), 3);
        T0();
        if (args.getOpenKycEds()) {
            String esiaStartDeeplink2 = ((TopupOpenKycEds) bVar2.d(bVar2.i.t).getData()).getEsiaStartDeeplink();
            ((nu01) dj01Var).a(esiaStartDeeplink2 == null ? new DeeplinkAction.OpenEsia(null, null, false, 7, null).getDeeplinkUri().toString() : esiaStartDeeplink2);
        }
        k5c a42 = ds31.a(this);
        tje.N(a42, null, null, new TransferMainViewModel$2$1(this, null), 3);
        tje.N(a42, null, null, new TransferMainViewModel$2$2(this, null), 3);
        tje.N(a42, null, null, new TransferMainViewModel$2$3(this, null), 3);
        tje.N(a42, null, null, new TransferMainViewModel$2$4(this, null), 3);
        fl01 fl01Var3 = new fl01(this, 0);
        b3z b3zVar2 = ((nu01) dj01Var).a;
        DeeplinkHandleResult$DeeplinkType deeplinkHandleResult$DeeplinkType3 = DeeplinkHandleResult$DeeplinkType.SCREEN_OPEN;
        b3zVar2.a(new mu01(deeplinkHandleResult$DeeplinkType3, fl01Var3, 2));
        fl01 fl01Var22 = new fl01(this, 1);
        DeeplinkHandleResult$DeeplinkType deeplinkHandleResult$DeeplinkType22 = DeeplinkHandleResult$DeeplinkType.ACTION;
        b3zVar2.a(new rv3(deeplinkHandleResult$DeeplinkType22, fl01Var22, 6));
        b3zVar2.a(new mu01(deeplinkHandleResult$DeeplinkType22, new fl01(this, 2), 3));
        b3zVar2.a(new mu01(deeplinkHandleResult$DeeplinkType3, new fl01(this, 3), 0));
        b3zVar2.a(new mu01(deeplinkHandleResult$DeeplinkType3, new gl01(this, 1), 1));
    }

    public static final void b0(a aVar, xk01 xk01Var) {
        ArrayList<lfq0> arrayList;
        ArrayList arrayList2;
        eh01 b;
        hg6 hg6Var;
        String str;
        TransferEvents$TransferLoadedPrerequisites transferEvents$TransferLoadedPrerequisites;
        TransferEvents$TransferLoadedPrerequisites transferEvents$TransferLoadedPrerequisites2;
        String str2;
        eh01 b2;
        hg6 hg6Var2;
        String message;
        qj01 qj01Var = aVar.V;
        TransferMainScreenArguments transferMainScreenArguments = aVar.O;
        AppAnalyticsReporter appAnalyticsReporter = qj01Var.a;
        int i = mj01.c[qj01Var.e.ordinal()];
        if (i != 1) {
            if (i == 2) {
                boolean z = xk01Var instanceof uk01;
                qq7 qq7Var = appAnalyticsReporter.L;
                MobileServicesEvents$PaymentMobileServicesPaymentLoadedResult mobileServicesEvents$PaymentMobileServicesPaymentLoadedResult = z ? MobileServicesEvents$PaymentMobileServicesPaymentLoadedResult.ERROR : MobileServicesEvents$PaymentMobileServicesPaymentLoadedResult.OK;
                uk01 uk01Var = z ? (uk01) xk01Var : null;
                message = uk01Var != null ? uk01Var.a.getMessage() : null;
                LinkedHashMap linkedHashMap = new LinkedHashMap(2);
                linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, mobileServicesEvents$PaymentMobileServicesPaymentLoadedResult.getOriginalValue());
                if (message != null) {
                    linkedHashMap.put("error", message);
                }
                qq7Var.a.a("payment.mobile_services.payment_loaded", linkedHashMap);
                return;
            }
            if (i == 3) {
                boolean z2 = xk01Var instanceof uk01;
                l0p l0pVar = appAnalyticsReporter.E;
                InternetServicesEvents$PaymentInternetTvPaymentLoadedResult internetServicesEvents$PaymentInternetTvPaymentLoadedResult = z2 ? InternetServicesEvents$PaymentInternetTvPaymentLoadedResult.ERROR : InternetServicesEvents$PaymentInternetTvPaymentLoadedResult.OK;
                uk01 uk01Var2 = z2 ? (uk01) xk01Var : null;
                message = uk01Var2 != null ? uk01Var2.a.getMessage() : null;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(2);
                linkedHashMap2.put(TarifficatorScenarioActivity.RESULT_KEY, internetServicesEvents$PaymentInternetTvPaymentLoadedResult.getOriginalValue());
                if (message != null) {
                    linkedHashMap2.put("error", message);
                }
                l0pVar.a.a("payment.internet_tv.payment_loaded", linkedHashMap2);
                return;
            }
            if (i == 4) {
                boolean z3 = xk01Var instanceof uk01;
                rt1 rt1Var = appAnalyticsReporter.B;
                GovServicesEvents$PaymentGovPaymentScreenLoadedResult govServicesEvents$PaymentGovPaymentScreenLoadedResult = z3 ? GovServicesEvents$PaymentGovPaymentScreenLoadedResult.ERROR : GovServicesEvents$PaymentGovPaymentScreenLoadedResult.OK;
                uk01 uk01Var3 = z3 ? (uk01) xk01Var : null;
                message = uk01Var3 != null ? uk01Var3.a.getMessage() : null;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(2);
                linkedHashMap3.put(TarifficatorScenarioActivity.RESULT_KEY, govServicesEvents$PaymentGovPaymentScreenLoadedResult.getOriginalValue());
                if (message != null) {
                    linkedHashMap3.put("error", message);
                }
                rt1Var.a.a("payment.gov.payment_screen.loaded", linkedHashMap3);
                return;
            }
            if (i != 5) {
                w511.b();
                return;
            }
            hwo0 hwo0Var = qj01Var.f;
            if (hwo0Var != null) {
                String str3 = (String) hwo0Var.b;
                String str4 = (String) hwo0Var.x;
                AppAnalyticsReporter appAnalyticsReporter2 = (AppAnalyticsReporter) hwo0Var.c;
                if (xk01Var instanceof vk01) {
                    return;
                }
                if (xk01Var instanceof uk01) {
                    z94.y(appAnalyticsReporter2.n0, (TemplatePaymentTypeTransfers) hwo0Var.w, TemplateTransferEvents$TemplateTransferLoadedResult.ERROR, ((uk01) xk01Var).a.getMessage(), str4 == null ? "" : str4, str3, null, 32);
                    return;
                } else if (xk01Var instanceof wk01) {
                    z94.y(appAnalyticsReporter2.n0, (TemplatePaymentTypeTransfers) hwo0Var.w, TemplateTransferEvents$TemplateTransferLoadedResult.OK, null, str4 == null ? "" : str4, str3, ((wk01) xk01Var).d.toPlainString(), 4);
                    return;
                } else {
                    w511.b();
                    return;
                }
            }
            return;
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() - qj01Var.k);
        TransferPrerequisites prerequisites = transferMainScreenArguments.getPrerequisites();
        Pair pair = prerequisites instanceof TransferPrerequisites.Phone ? new Pair(Boolean.TRUE, ((TransferPrerequisites.Phone) prerequisites).getPartnerId()) : prerequisites instanceof TransferPrerequisites.CrossBorder ? new Pair(Boolean.TRUE, ((TransferPrerequisites.CrossBorder) prerequisites).getPartnerId()) : new Pair(Boolean.FALSE, null);
        boolean booleanValue = ((Boolean) pair.getFirst()).booleanValue();
        String str5 = (String) pair.getSecond();
        if (xk01Var instanceof uk01) {
            em3.A(appAnalyticsReporter.q0, Integer.valueOf(currentTimeMillis), null, null, booleanValue, str5 != null ? ssa1.b(str5) : null, "", "", qj01Var.b, null, qj01Var.c, qj01Var.d, null, ResultCommon.ERROR, ((uk01) xk01Var).a.getMessage(), 4742);
            return;
        }
        if (!(xk01Var instanceof wk01)) {
            if (xk01Var instanceof vk01) {
                return;
            }
            w511.b();
            return;
        }
        wk01 wk01Var = (wk01) xk01Var;
        ak1 ak1Var = wk01Var.g;
        List list = wk01Var.m;
        xk1 xk1Var = ak1Var.h;
        TransferDirection direction = transferMainScreenArguments.getDirection();
        wjq0 wjq0Var = wk01Var.i;
        int i2 = mj01.b[direction.ordinal()];
        if (i2 == 1) {
            List list2 = list;
            arrayList = new ArrayList(tcc.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(zk01.g((ak1) it.next()));
            }
        } else {
            if (i2 != 2) {
                w511.b();
                return;
            }
            if (wjq0Var == null || (b2 = wjq0Var.b()) == null || (hg6Var2 = b2.h) == null) {
                arrayList = null;
            } else {
                List list3 = hg6Var2.d;
                arrayList = new ArrayList();
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    lfq0 h = zk01.h((ig6) it2.next());
                    if (h != null) {
                        arrayList.add(h);
                    }
                }
            }
        }
        int i3 = mj01.b[transferMainScreenArguments.getDirection().ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                w511.b();
                return;
            }
            List list4 = list;
            arrayList2 = new ArrayList(tcc.n(list4, 10));
            Iterator it3 = list4.iterator();
            while (it3.hasNext()) {
                arrayList2.add(zk01.g((ak1) it3.next()));
            }
        } else if (wjq0Var == null || (b = wjq0Var.b()) == null || (hg6Var = b.h) == null) {
            arrayList2 = null;
        } else {
            List list5 = hg6Var.d;
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = list5.iterator();
            while (it4.hasNext()) {
                lfq0 h2 = zk01.h((ig6) it4.next());
                if (h2 != null) {
                    arrayList3.add(h2);
                }
            }
            arrayList2 = arrayList3;
        }
        em3 em3Var = appAnalyticsReporter.q0;
        String str6 = ak1Var.b;
        String str7 = ak1Var.a;
        TransferDirection direction2 = transferMainScreenArguments.getDirection();
        int[] iArr = mj01.b;
        int i4 = iArr[direction2.ordinal()];
        if (i4 == 1) {
            str = str7;
        } else {
            if (i4 != 2) {
                w511.b();
                return;
            }
            if (wjq0Var instanceof jjq0) {
                str = ((jjq0) wjq0Var).b;
            } else if (wjq0Var instanceof ajq0) {
                str = ((ajq0) wjq0Var).b;
            } else if (wjq0Var instanceof ujq0) {
                str = ((ujq0) wjq0Var).b;
            } else {
                if (!(wjq0Var instanceof njq0) && !(wjq0Var instanceof vjq0) && !(wjq0Var instanceof pjq0) && !(wjq0Var instanceof rjq0) && !(wjq0Var instanceof ojq0) && !(wjq0Var instanceof ljq0) && !(wjq0Var instanceof ijq0) && !(wjq0Var instanceof tjq0) && !(wjq0Var instanceof djq0) && !(wjq0Var instanceof cjq0) && !(wjq0Var instanceof hjq0) && !(wjq0Var instanceof gjq0) && !(wjq0Var instanceof kjq0) && wjq0Var != null) {
                    w511.b();
                    return;
                }
                str = null;
            }
        }
        String b3 = str != null ? ssa1.b(str) : null;
        int i5 = iArr[transferMainScreenArguments.getDirection().ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                w511.b();
                return;
            }
        } else if (wjq0Var instanceof vjq0) {
            str7 = ((vjq0) wjq0Var).b;
        } else {
            if (!(wjq0Var instanceof jjq0) && !(wjq0Var instanceof ajq0) && !(wjq0Var instanceof njq0) && !(wjq0Var instanceof pjq0) && !(wjq0Var instanceof rjq0) && !(wjq0Var instanceof ojq0) && !(wjq0Var instanceof ujq0) && !(wjq0Var instanceof ljq0) && !(wjq0Var instanceof ijq0) && !(wjq0Var instanceof tjq0) && !(wjq0Var instanceof djq0) && !(wjq0Var instanceof cjq0) && !(wjq0Var instanceof hjq0) && !(wjq0Var instanceof gjq0) && !(wjq0Var instanceof kjq0) && wjq0Var != null) {
                w511.b();
                return;
            }
            str7 = null;
        }
        String b4 = str7 != null ? ssa1.b(str7) : null;
        JSONArray jSONArray = new JSONArray();
        if (arrayList != null) {
            for (lfq0 lfq0Var : arrayList) {
                if (lfq0Var instanceof mfq0) {
                    str2 = ((mfq0) lfq0Var).a;
                } else if (lfq0Var instanceof phq0) {
                    str2 = ((phq0) lfq0Var).a;
                } else {
                    if (!(lfq0Var instanceof tfq0)) {
                        w511.b();
                        return;
                    }
                    str2 = ((tfq0) lfq0Var).a;
                }
                jSONArray.put(ssa1.b(str2));
            }
        }
        String jSONArray2 = jSONArray.toString();
        JSONArray jSONArray3 = new JSONArray();
        if (arrayList2 != null) {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : arrayList2) {
                if (obj instanceof mfq0) {
                    arrayList4.add(obj);
                }
            }
            Iterator it5 = arrayList4.iterator();
            while (it5.hasNext()) {
                jSONArray3.put(ssa1.b(((mfq0) it5.next()).a));
            }
        }
        String jSONArray4 = jSONArray3.toString();
        String b5 = str5 != null ? ssa1.b(str5) : null;
        String str8 = qj01Var.b;
        String str9 = qj01Var.c;
        String str10 = qj01Var.d;
        if (xk1Var != null) {
            wjq0 wjq0Var2 = xk1Var.b;
            if (wjq0Var2 instanceof vjq0) {
                transferEvents$TransferLoadedPrerequisites2 = jl40.l(str10, "FUND") ? TransferEvents$TransferLoadedPrerequisites.FUND_TRANSFER : TransferEvents$TransferLoadedPrerequisites.SELF_TRANSFER;
            } else if (wjq0Var2 instanceof ujq0) {
                transferEvents$TransferLoadedPrerequisites2 = jl40.l(str10, "FUND") ? TransferEvents$TransferLoadedPrerequisites.FUND_TOPUP : TransferEvents$TransferLoadedPrerequisites.SELF_TOPUP;
            } else if (wjq0Var2 instanceof njq0) {
                transferEvents$TransferLoadedPrerequisites2 = TransferEvents$TransferLoadedPrerequisites.PHONE_TRANSFER;
            } else if ((wjq0Var2 instanceof hjq0) || (wjq0Var2 instanceof ojq0)) {
                transferEvents$TransferLoadedPrerequisites2 = TransferEvents$TransferLoadedPrerequisites.REQUISITES_HCS;
            } else if ((wjq0Var2 instanceof pjq0) || (wjq0Var2 instanceof rjq0)) {
                transferEvents$TransferLoadedPrerequisites2 = TransferEvents$TransferLoadedPrerequisites.REQUISITES_LEGAL;
            } else if (wjq0Var2 instanceof jjq0) {
                transferEvents$TransferLoadedPrerequisites2 = TransferEvents$TransferLoadedPrerequisites.ME2ME_TOPUP;
            } else if (wjq0Var2 instanceof ajq0) {
                transferEvents$TransferLoadedPrerequisites2 = TransferEvents$TransferLoadedPrerequisites.AFT_TOPUP;
            } else if (wjq0Var2 instanceof djq0) {
                transferEvents$TransferLoadedPrerequisites2 = TransferEvents$TransferLoadedPrerequisites.COMMON_TOPUP_PAYLOAD;
            } else if (wjq0Var2 instanceof cjq0) {
                transferEvents$TransferLoadedPrerequisites2 = TransferEvents$TransferLoadedPrerequisites.B2C_TRANSFER_PAYLOAD;
            } else if (wjq0Var2 instanceof ljq0) {
                transferEvents$TransferLoadedPrerequisites2 = TransferEvents$TransferLoadedPrerequisites.MOBILE_PAYMENT;
            } else if (wjq0Var2 instanceof ijq0) {
                transferEvents$TransferLoadedPrerequisites2 = TransferEvents$TransferLoadedPrerequisites.INTERNET_PAYMENT;
            } else if (wjq0Var2 instanceof tjq0) {
                transferEvents$TransferLoadedPrerequisites2 = TransferEvents$TransferLoadedPrerequisites.SBP_C2G_PAYLOAD;
            } else if (wjq0Var2 instanceof gjq0) {
                transferEvents$TransferLoadedPrerequisites2 = TransferEvents$TransferLoadedPrerequisites.CROSS_BORDER;
            } else {
                if (!(wjq0Var2 instanceof kjq0)) {
                    w511.b();
                    return;
                }
                transferEvents$TransferLoadedPrerequisites2 = TransferEvents$TransferLoadedPrerequisites.MKK_CASHOUT_PAYLOAD;
            }
            transferEvents$TransferLoadedPrerequisites = transferEvents$TransferLoadedPrerequisites2;
        } else {
            transferEvents$TransferLoadedPrerequisites = null;
        }
        em3.A(em3Var, Integer.valueOf(currentTimeMillis), b3, b4, booleanValue, b5, jSONArray2, jSONArray4, str8, transferEvents$TransferLoadedPrerequisites, str9, str10, str6, ResultCommon.OK, null, 128);
    }

    public static void b1(a aVar, wk01 wk01Var, String str, TransferScenario transferScenario, CrossBorderScenario crossBorderScenario, String str2, int i) {
        String str3;
        String preselectedPhone;
        String str4;
        wjq0 wjq0Var = wk01Var.i;
        PhoneInputSource phoneInputSource = null;
        if ((i & 2) != 0) {
            eh01 eh01Var = wk01Var.p;
            str3 = eh01Var != null ? eh01Var.a : null;
        } else {
            str3 = str;
        }
        TransferScenario transferScenario2 = (i & 4) != 0 ? wk01Var.a : transferScenario;
        CrossBorderScenario crossBorderScenario2 = (i & 8) != 0 ? aVar.O.getCrossBorderScenario() : crossBorderScenario;
        String title = (i & 16) != 0 ? aVar.O.getTitle() : str2;
        boolean z = (i & 32) == 0;
        boolean z2 = (i & 64) == 0;
        tfl0 tfl0Var = aVar.C;
        com.ybsdk.feature.transfer.version2.internal.screens.a aVar2 = aVar.B;
        String str5 = wk01Var.c;
        BigDecimal bigDecimal = wk01Var.d;
        ak1 ak1Var = wk01Var.g;
        if (wjq0Var instanceof njq0) {
            preselectedPhone = ((njq0) wjq0Var).a.b;
        } else if (wjq0Var instanceof cjq0) {
            bjq0 bjq0Var = ((cjq0) wjq0Var).e;
            preselectedPhone = bjq0Var != null ? bjq0Var.b : null;
        } else {
            preselectedPhone = aVar.O.getPreselectedPhone();
        }
        if (crossBorderScenario2 == CrossBorderScenario.PHONE_WITH_NAME && preselectedPhone != null && !evu0.J(preselectedPhone) && (str4 = wk01Var.J) != null && !evu0.J(str4)) {
            SelectedPartner.Companion.getClass();
            SelectedPartner selectedPartner = new SelectedPartner(new PartnerEntity("", "", null, null), null, null, preselectedPhone, null, null, null, 66, null);
            PhoneInputSource phoneInputSource2 = PhoneInputSource.PREDEFINED;
            String str6 = ak1Var.a;
            MoneyEntity moneyEntity = new MoneyEntity(bigDecimal, str5, "");
            String str7 = wk01Var.e;
            String h0 = aVar.h0();
            String str8 = wk01Var.J;
            aVar2.getClass();
            FragmentScreen fragmentScreen = new FragmentScreen("TransferReceiverNameScreen", false, new TransferReceiverNameFragment.Arguments(selectedPartner, phoneInputSource2, str6, moneyEntity, str7, h0, transferScenario2, str8), TransitionPolicyType.POPUP, qoi0.a(TransferReceiverNameFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 2, null);
            if (z) {
                tfl0Var.l(fragmentScreen);
                return;
            } else {
                tfl0Var.h(fragmentScreen);
                return;
            }
        }
        String str9 = ak1Var.a;
        String str10 = wk01Var.J;
        MoneyEntity moneyEntity2 = new MoneyEntity(bigDecimal, str5, "");
        String str11 = wk01Var.e;
        String h02 = aVar.h0();
        if (wjq0Var instanceof njq0) {
            phoneInputSource = ((njq0) wjq0Var).c;
        } else if (wjq0Var instanceof cjq0) {
            phoneInputSource = ((cjq0) wjq0Var).f;
        }
        TransferPhoneInputFragment.Arguments arguments = new TransferPhoneInputFragment.Arguments(str9, transferScenario2, moneyEntity2, str11, preselectedPhone, str3, h02, phoneInputSource, str10, title, crossBorderScenario2, z2);
        aVar2.getClass();
        FragmentScreen fragmentScreen2 = new FragmentScreen("Transfer2PhoneInputScreen", false, arguments, TransitionPolicyType.POPUP, qoi0.a(TransferPhoneInputFragment.class), com.ybsdk.feature.transfer.version2.internal.screens.a.c(arguments.getScenario()), 2, null);
        if (z) {
            tfl0Var.l(fragmentScreen2);
        } else {
            tfl0Var.h(fragmentScreen2);
        }
    }

    public static BigDecimal c0(BigDecimal bigDecimal, String str, String str2, String str3, String str4) {
        BigDecimal h;
        BigDecimal h2;
        if (str3 == null || str == null || (h = avu0.h(str)) == null || str2 == null || (h2 = avu0.h(str2)) == null || h2.compareTo(BigDecimal.ZERO) == 0) {
            return null;
        }
        BigDecimal bigDecimal2 = BigDecimal.ONE;
        BigDecimal bigDecimal3 = new BigDecimal(100);
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        BigDecimal multiply = bigDecimal.multiply(bigDecimal2.subtract(h.divide(bigDecimal3, 10, roundingMode)));
        return (str3.equals(str4) ? multiply.divide(h2, 10, roundingMode) : multiply.multiply(h2)).setScale(2, roundingMode);
    }

    public static void d0(a aVar, boolean z, boolean z2, int i) {
        u031 u031Var;
        wjq0 wjq0Var;
        pz40 Y;
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        r501 r501Var = r501.c;
        com.ybsdk.core.utils.coroutines.a aVar2 = aVar.Q;
        String uuid = UUID.randomUUID().toString();
        wk01 b = zk01.b((xk01) aVar.X());
        if (b == null) {
            aVar2.a();
            return;
        }
        u031 u031Var2 = b.q;
        if (u031Var2 instanceof p031) {
            u031Var = ((p031) u031Var2).a;
        } else {
            if (!jl40.l(u031Var2, r501Var) && !(u031Var2 instanceof m031) && !(u031Var2 instanceof s031) && !jl40.l(u031Var2, t031.a)) {
                w511.b();
                return;
            }
            u031Var = u031Var2;
        }
        wjq0 wjq0Var2 = b.i;
        if (wjq0Var2 != null) {
            if (!wjq0Var2.a() && !(wjq0Var2 instanceof cjq0)) {
                wjq0Var2 = null;
            }
            if (wjq0Var2 != null) {
                wjq0Var = wjq0Var2;
                boolean z3 = b.a != TransferScenario.B2C_TRANSFER || (wjq0Var instanceof cjq0);
                if (!z2 || b.d.compareTo(BigDecimal.ZERO) != 0 || z3) {
                    Y = aVar.Y();
                    do {
                        r0Var = (r0) Y;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, zk01.c((xk01) value, new hl01(u031Var, 0))));
                    aVar2.b(Z, new TransferMainViewModel$checkTransferData$3(wjq0Var, b, aVar, uuid, null), new TransferMainViewModel$checkTransferData$4(aVar, z, u031Var, null));
                }
                if (!jl40.l(u031Var2, r501Var)) {
                    pz40 Y2 = aVar.Y();
                    do {
                        r0Var2 = (r0) Y2;
                        value2 = r0Var2.getValue();
                    } while (!r0Var2.k(value2, zk01.c((xk01) value2, new ri01(9))));
                }
                aVar2.a();
                if (z) {
                    aVar.Z(pl01.a);
                    return;
                }
                return;
            }
        }
        if (!z2) {
            aVar2.a();
            return;
        }
        wjq0Var = null;
        if (b.a != TransferScenario.B2C_TRANSFER) {
        }
        if (!z2) {
        }
        Y = aVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, zk01.c((xk01) value, new hl01(u031Var, 0))));
        aVar2.b(Z, new TransferMainViewModel$checkTransferData$3(wjq0Var, b, aVar, uuid, null), new TransferMainViewModel$checkTransferData$4(aVar, z, u031Var, null));
    }

    public final void A0(PaymentProviderEntity paymentProviderEntity, String str) {
        lrp0 lrp0Var = lrp0.n;
        wk01 b = zk01.b((xk01) X());
        if (b == null) {
            x4c.g("Wrong state in onInternetProviderSelected", null, X(), Collections.singletonList(lrp0Var), 2);
            return;
        }
        eh01 eh01Var = b.p;
        if (eh01Var == null) {
            x4c.g("Wrong lastSelectedCircleButton in onInternetProviderSelected", null, null, Collections.singletonList(lrp0Var), 6);
        } else {
            W0(new ijq0(eh01Var, paymentProviderEntity, str));
            this.V.c(paymentProviderEntity.getName());
        }
    }

    public final void B0(PaymentProviderEntity paymentProviderEntity) {
        eh01 b;
        lrp0 lrp0Var = lrp0.r;
        wk01 b2 = zk01.b((xk01) X());
        if (b2 == null) {
            x4c.g("Wrong state in onMobileProviderSelected", null, X(), Collections.singletonList(lrp0Var), 2);
            return;
        }
        wjq0 wjq0Var = b2.i;
        ljq0 ljq0Var = wjq0Var instanceof ljq0 ? (ljq0) wjq0Var : null;
        if (ljq0Var == null) {
            x4c.g("Wrong selected subject in onMobileProviderSelected", null, g8e.o("Button: ", (wjq0Var == null || (b = wjq0Var.b()) == null) ? null : b.a), Collections.singletonList(lrp0Var), 2);
            return;
        }
        eh01 eh01Var = b2.p;
        if (eh01Var == null) {
            x4c.g("Wrong lastSelectedCircleButton in onMobileProviderSelected", null, null, Collections.singletonList(lrp0Var), 6);
        } else {
            W0(new ljq0(eh01Var, paymentProviderEntity, ljq0Var.c));
            this.V.c(paymentProviderEntity.getName());
        }
    }

    public final void C0(final SelectedPartner selectedPartner, Context context) {
        String str;
        r0 r0Var;
        Object value;
        final int i;
        String str2;
        pz40 Y;
        r0 r0Var2;
        Object value2;
        final int i2;
        orp0 orp0Var = orp0.e;
        String str3 = null;
        if (!k0()) {
            wk01 b = zk01.b((xk01) X());
            if (b == null) {
                return;
            }
            v24 v24Var = new v24(((CommonFeatureFlag) ((qu01) this.F).b.d(wlp.s0).getData()).isEnabled());
            String str4 = b.g.m;
            String partnerId = selectedPartner.getPartnerEntity().getPartnerId();
            String title = selectedPartner.getPartnerEntity().getTitle();
            String string = context.getString(dzh0.ybsdk_transfer_me2me_topup_pill_description);
            ThemedImageUrlEntity themedImage = selectedPartner.getPartnerEntity().getThemedImage();
            rbv j = themedImage != null ? com.ybsdk.feature.transfer.version2.api.mappers.a.j(themedImage) : null;
            byte[] bArr = gf91.a;
            if (str4 != null) {
                byte[] bArr2 = new byte[7];
                int i3 = 0;
                for (int i4 = 7; i3 < i4; i4 = 7) {
                    bArr2[i3] = (byte) (gf91.h[i3] ^ bArr[i3 % 8]);
                    i3++;
                }
                str = gtu0.c(str4, new String(bArr2, uza.a), selectedPartner.getPartnerEntity().getPartnerId());
            } else {
                str = null;
            }
            phq0 phq0Var = new phq0(partnerId, title, string, false, j, v24Var, str);
            eh01 eh01Var = b.p;
            if (eh01Var == null) {
                byte[] bArr3 = new byte[24];
                for (int i5 = 0; i5 < 24; i5++) {
                    bArr3[i5] = (byte) (gf91.e[i5] ^ bArr[i5 % 8]);
                }
                x4c.g("unexpected state in ".concat(new String(bArr3, uza.a)), null, null, Collections.singletonList(orp0Var), 6);
                return;
            }
            jjq0 jjq0Var = new jjq0(eh01Var, null, phq0Var);
            pz40 Y2 = Y();
            do {
                r0Var = (r0) Y2;
                value = r0Var.getValue();
                i = 0;
            } while (!r0Var.k(value, zk01.c((xk01) value, new tls() { // from class: cl01
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    int i6 = i;
                    SelectedPartner selectedPartner2 = selectedPartner;
                    switch (i6) {
                        case 0:
                            return wk01.b((wk01) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, selectedPartner2.getTransferId(), null, false, null, false, null, null, null, null, null, null, null, -1048577, 15);
                        default:
                            return wk01.b((wk01) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, selectedPartner2.getTransferId(), TransferMainState$Success$OpenScenario.NONE, false, null, false, null, null, null, null, null, null, null, -3145729, 15);
                    }
                }
            })));
            W0(jjq0Var);
            U0(str, partnerId);
            return;
        }
        wk01 b2 = zk01.b((xk01) X());
        if (b2 == null) {
            return;
        }
        wjq0 wjq0Var = b2.i;
        cjq0 cjq0Var = wjq0Var instanceof cjq0 ? (cjq0) wjq0Var : null;
        if (cjq0Var == null) {
            return;
        }
        eh01 eh01Var2 = b2.p;
        if (eh01Var2 == null) {
            x4c.g("unexpected state in onB2cTransferPartnerSelected", null, null, Collections.singletonList(orp0Var), 6);
            return;
        }
        String partnerId2 = selectedPartner.getPartnerEntity().getPartnerId();
        String receiverPhone = selectedPartner.getReceiverPhone();
        String receiverName = selectedPartner.getReceiverName();
        if (receiverName == null || receiverName.length() == 0) {
            receiverName = null;
        }
        if (receiverName == null) {
            String description = selectedPartner.getPartnerEntity().getDescription();
            if (description != null && description.length() != 0) {
                str3 = description;
            }
            if (str3 != null) {
                str2 = str3;
                cjq0 cjq0Var2 = new cjq0(eh01Var2, cjq0Var.b, cjq0Var.c, cjq0Var.d, new bjq0(partnerId2, receiverPhone, selectedPartner.getPartnerEntity().getThemedImage(), str2, selectedPartner.getReceiverPhone(), selectedPartner.getRequestId()), PhoneInputSource.PREDEFINED, cjq0Var.g);
                Y = Y();
                do {
                    r0Var2 = (r0) Y;
                    value2 = r0Var2.getValue();
                    i2 = 1;
                } while (!r0Var2.k(value2, zk01.c((xk01) value2, new tls() { // from class: cl01
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        int i6 = i2;
                        SelectedPartner selectedPartner2 = selectedPartner;
                        switch (i6) {
                            case 0:
                                return wk01.b((wk01) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, selectedPartner2.getTransferId(), null, false, null, false, null, null, null, null, null, null, null, -1048577, 15);
                            default:
                                return wk01.b((wk01) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, selectedPartner2.getTransferId(), TransferMainState$Success$OpenScenario.NONE, false, null, false, null, null, null, null, null, null, null, -3145729, 15);
                        }
                    }
                })));
                W0(cjq0Var2);
            }
            receiverName = selectedPartner.getPartnerEntity().getTitle();
        }
        str2 = receiverName;
        cjq0 cjq0Var22 = new cjq0(eh01Var2, cjq0Var.b, cjq0Var.c, cjq0Var.d, new bjq0(partnerId2, receiverPhone, selectedPartner.getPartnerEntity().getThemedImage(), str2, selectedPartner.getReceiverPhone(), selectedPartner.getRequestId()), PhoneInputSource.PREDEFINED, cjq0Var.g);
        Y = Y();
        do {
            r0Var2 = (r0) Y;
            value2 = r0Var2.getValue();
            i2 = 1;
        } while (!r0Var2.k(value2, zk01.c((xk01) value2, new tls() { // from class: cl01
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i6 = i2;
                SelectedPartner selectedPartner2 = selectedPartner;
                switch (i6) {
                    case 0:
                        return wk01.b((wk01) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, selectedPartner2.getTransferId(), null, false, null, false, null, null, null, null, null, null, null, -1048577, 15);
                    default:
                        return wk01.b((wk01) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, selectedPartner2.getTransferId(), TransferMainState$Success$OpenScenario.NONE, false, null, false, null, null, null, null, null, null, null, -3145729, 15);
                }
            }
        })));
        W0(cjq0Var22);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D0(SelectedPartner selectedPartner, PhoneInputSource phoneInputSource) {
        BigDecimal bigDecimal;
        String str;
        SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType selectedTransferSubject$CrossBorderByPhone$PriorityMoneyType;
        String str2;
        wjq0 gjq0Var;
        String currency;
        r0 r0Var;
        Object value;
        BigDecimal bigDecimal2;
        wk01 b = zk01.b((xk01) X());
        if (b == null) {
            return;
        }
        String str3 = b.c;
        eh01 eh01Var = b.p;
        if (eh01Var == null) {
            byte[] bArr = new byte[27];
            for (int i = 0; i < 27; i++) {
                bArr[i] = (byte) (gf91.b[i] ^ gf91.a[i % 8]);
            }
            x4c.g("unexpected state in ".concat(new String(bArr, uza.a)), null, null, Collections.singletonList(orp0.e), 6);
            return;
        }
        SelectedPartnerCrossBorderData crossBorderData = selectedPartner.getCrossBorderData();
        if (crossBorderData == null) {
            String partnerId = selectedPartner.getPartnerEntity().getPartnerId();
            String receiverPhone = selectedPartner.getReceiverPhone();
            String receiverName = selectedPartner.getReceiverName();
            if (receiverName == null || receiverName.length() == 0) {
                receiverName = null;
            }
            if (receiverName == null) {
                receiverName = selectedPartner.getPartnerEntity().getDescription();
                if (receiverName == null || receiverName.length() == 0) {
                    receiverName = null;
                }
                if (receiverName == null) {
                    receiverName = selectedPartner.getPartnerEntity().getTitle();
                }
            }
            gjq0Var = new njq0(new mjq0(partnerId, receiverPhone, receiverName, selectedPartner.getReceiverPhone(), selectedPartner.getRequestId(), null, selectedPartner.getPartnerEntity().getThemedImage()), eh01Var, phoneInputSource);
            str2 = null;
        } else {
            MoneyEntity debitMoney = crossBorderData.getDebitMoney();
            if (debitMoney == null || (bigDecimal = debitMoney.getAmount()) == null) {
                bigDecimal = b.d;
            }
            SelectedPartnerCrossBorderData.CurrencyRate currencyRate = crossBorderData.getCurrencyRate();
            String fee = crossBorderData.getFee();
            String rate = currencyRate != null ? currencyRate.getRate() : null;
            String currency2 = currencyRate != null ? currencyRate.getCurrency() : null;
            MoneyEntity debitMoney2 = crossBorderData.getDebitMoney();
            if (debitMoney2 == null || (str = debitMoney2.getCurrency()) == null) {
                str = str3;
            }
            BigDecimal c0 = c0(bigDecimal, fee, rate, currency2, str);
            fjq0 fjq0Var = new fjq0(selectedPartner.getReceiverPhone(), selectedPartner.getPartnerEntity().getPartnerId(), selectedPartner.getReceiverName());
            MoneyEntity debitMoney3 = crossBorderData.getDebitMoney();
            if (debitMoney3 != null && (currency = debitMoney3.getCurrency()) != null) {
                str3 = currency;
            }
            if (c0 == null) {
                MoneyEntity creditMoney = crossBorderData.getCreditMoney();
                c0 = creditMoney != null ? creditMoney.getAmount() : null;
                if (c0 == null) {
                    c0 = BigDecimal.ZERO;
                }
            }
            MoneyEntity creditMoney2 = crossBorderData.getCreditMoney();
            String currency3 = creditMoney2 != null ? creditMoney2.getCurrency() : null;
            if (currency3 == null) {
                currency3 = "";
            }
            CrossBorderCheckResult$PriorityMoneyType priorityMoneyType = crossBorderData.getPriorityMoneyType();
            int i2 = priorityMoneyType == null ? -1 : rl01.h[priorityMoneyType.ordinal()];
            if (i2 == -1) {
                selectedTransferSubject$CrossBorderByPhone$PriorityMoneyType = SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType.DEBIT;
            } else if (i2 == 1) {
                selectedTransferSubject$CrossBorderByPhone$PriorityMoneyType = SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType.DEBIT;
            } else {
                if (i2 != 2) {
                    w511.b();
                    return;
                }
                selectedTransferSubject$CrossBorderByPhone$PriorityMoneyType = SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType.CREDIT;
            }
            ejq0 ejq0Var = currencyRate != null ? new ejq0(currencyRate.getRate(), currencyRate.getCurrency()) : null;
            str2 = null;
            gjq0Var = new gjq0(eh01Var, fjq0Var, bigDecimal, str3, c0, currency3, selectedTransferSubject$CrossBorderByPhone$PriorityMoneyType, ejq0Var, crossBorderData.getConvertationTemplate(), phoneInputSource, fee, selectedPartner.getPartnerEntity().getThemedImage(), 256);
        }
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, zk01.c((xk01) value, new rmy0(29, selectedPartner, gjq0Var))));
        W0(gjq0Var);
        String partnerId2 = selectedPartner.getPartnerEntity().getPartnerId();
        qj01 qj01Var = this.V;
        qj01Var.c(partnerId2);
        gjq0 gjq0Var2 = gjq0Var instanceof gjq0 ? (gjq0) gjq0Var : str2;
        if (gjq0Var2 != 0 && (bigDecimal2 = gjq0Var2.c) != null) {
            str2 = bigDecimal2.toPlainString();
        }
        if (str2 == null) {
            str2 = "";
        }
        qj01Var.e(gjq0Var, str2);
    }

    public final void E0() {
        String str;
        wk01 b = zk01.b((xk01) X());
        wjq0 wjq0Var = b != null ? b.i : null;
        if (wjq0Var instanceof ijq0) {
            str = ((ijq0) wjq0Var).b.getName();
        } else if (wjq0Var instanceof ljq0) {
            str = ((ljq0) wjq0Var).b.getName();
        } else if (!(wjq0Var instanceof njq0)) {
            return;
        } else {
            str = ((njq0) wjq0Var).a.a;
        }
        qj01 qj01Var = this.V;
        AppAnalyticsReporter appAnalyticsReporter = qj01Var.a;
        int i = mj01.c[qj01Var.e.ordinal()];
        if (i != 1) {
            if (i == 2) {
                appAnalyticsReporter.L.a.a("payment.mobile_services.payment_provider_shown", g8e.w(1, "provider", str));
                return;
            }
            if (i == 3) {
                appAnalyticsReporter.E.a.a("payment.internet_tv.payment_provider_shown", g8e.w(1, "provider", str));
                return;
            }
            if (i != 4) {
                if (i != 5) {
                    w511.b();
                    return;
                }
                hwo0 hwo0Var = qj01Var.f;
                if (hwo0Var != null) {
                    z94 z94Var = ((AppAnalyticsReporter) hwo0Var.c).n0;
                    TemplatePaymentTypeTransfers templatePaymentTypeTransfers = (TemplatePaymentTypeTransfers) hwo0Var.w;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(2);
                    linkedHashMap.put("type", templatePaymentTypeTransfers.getOriginalValue());
                    linkedHashMap.put("value", str);
                    z94Var.a.a("template_transfer.pill_shown", linkedHashMap);
                }
            }
        }
    }

    public final void F0(TransferRequisiteResultEntity transferRequisiteResultEntity) {
        wjq0 ojq0Var;
        r0 r0Var;
        Object value;
        orp0 orp0Var = orp0.e;
        wk01 b = zk01.b((xk01) X());
        if (b == null) {
            return;
        }
        eh01 eh01Var = b.p;
        RequisiteTarget target = transferRequisiteResultEntity.getTarget();
        if (target == null) {
            return;
        }
        if (transferRequisiteResultEntity instanceof TransferRequisiteResultEntity.Legal) {
            TransferRequisiteResultEntity.Legal legal = (TransferRequisiteResultEntity.Legal) transferRequisiteResultEntity;
            String accountNumber = legal.getAccountNumber();
            String inn = legal.getInn();
            String beneficiaryName = legal.getBeneficiaryName();
            boolean vatIncluded = legal.getVatIncluded();
            String paymentPurpose = legal.getPaymentPurpose();
            String bic = legal.getBic();
            RequisitesTarget requisitesTarget = new RequisitesTarget(target.getTitle(), target.getThemedImage());
            if (eh01Var == null) {
                x4c.g("unexpected state for legal requisite result", null, null, Collections.singletonList(orp0Var), 2);
                return;
            }
            ojq0Var = new pjq0(accountNumber, requisitesTarget, beneficiaryName, inn, vatIncluded, paymentPurpose, bic, eh01Var, legal.getDivkitWidget());
        } else if (transferRequisiteResultEntity instanceof TransferRequisiteResultEntity.Person) {
            TransferRequisiteResultEntity.Person person = (TransferRequisiteResultEntity.Person) transferRequisiteResultEntity;
            String accountNumber2 = person.getAccountNumber();
            String firstName = person.getFirstName();
            String lastName = person.getLastName();
            qjq0 qjq0Var = new qjq0(person.getMiddleName().getName(), person.getMiddleName().getNoMiddleNameSelected());
            String paymentPurpose2 = person.getPaymentPurpose();
            String bic2 = person.getBic();
            RequisitesTarget requisitesTarget2 = new RequisitesTarget(target.getTitle(), target.getThemedImage());
            if (eh01Var == null) {
                x4c.g("unexpected state for hcs requisite result", null, null, Collections.singletonList(orp0Var), 2);
                return;
            }
            ojq0Var = new rjq0(accountNumber2, requisitesTarget2, firstName, lastName, qjq0Var, paymentPurpose2, bic2, eh01Var, person.getDivkitWidget());
        } else {
            if (!(transferRequisiteResultEntity instanceof TransferRequisiteResultEntity.Hcs)) {
                w511.b();
                return;
            }
            TransferRequisiteResultEntity.Hcs hcs = (TransferRequisiteResultEntity.Hcs) transferRequisiteResultEntity;
            String accountNumber3 = hcs.getAccountNumber();
            String bic3 = hcs.getBic();
            String inn2 = hcs.getInn();
            String beneficiaryName2 = hcs.getBeneficiaryName();
            String hcsPersonalAccount = hcs.getHcsPersonalAccount();
            String paymentPeriod = hcs.getPaymentPeriod();
            String paymentPurpose3 = hcs.getPaymentPurpose();
            boolean vatIncluded2 = hcs.getVatIncluded();
            RequisitesTarget requisitesTarget3 = new RequisitesTarget(target.getTitle(), target.getThemedImage());
            if (eh01Var == null) {
                x4c.g("unexpected state for person requisite result", null, null, Collections.singletonList(orp0Var), 2);
                return;
            }
            ojq0Var = new ojq0(accountNumber3, bic3, beneficiaryName2, inn2, hcsPersonalAccount, paymentPeriod, paymentPurpose3, vatIncluded2, requisitesTarget3, eh01Var, hcs.getDivkitWidget());
        }
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, zk01.c((xk01) value, new ri01(11))));
        W0(ojq0Var);
    }

    public final void G0() {
        wk01 b;
        r0 r0Var;
        Object value;
        this.P = true;
        wk01 b2 = zk01.b((xk01) X());
        boolean z = false;
        if (b2 != null && b2.s && ((b = zk01.b((xk01) X())) == null || !b.z)) {
            wk01 b3 = zk01.b((xk01) X());
            boolean z2 = b3 != null && b3.t;
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, zk01.c((xk01) value, new el01(false, false))));
            d0(this, false, z2, 1);
        }
        if (this.O.getDirection() == TransferDirection.TOPUP) {
            Text.Resource h = unr0.h(Text.Companion, dzh0.ybsdk_topup_vpn_snackbar_title);
            b041 b041Var = (b041) this.J.a;
            if (!((CommonFeatureFlag) b041Var.b.d(wlp.S).getData()).isEnabled() || b041Var.e) {
                return;
            }
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) b041Var.d.a.getSystemService(ConnectivityManager.class);
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities != null) {
                    z = networkCapabilities.hasTransport(4);
                }
            } catch (Throwable th) {
                x4c.g("Error in VpnConnectionInfoHelper", th, null, Collections.singletonList(orp0.g), 4);
            }
            if (z) {
                com.ybsdk.widgets.common.snackbar.a.a(Snackbar.Companion, b041Var.a, new n0t0(h), null, 12);
                b041Var.c.o0.a.a("topup.vpn_snackbar.shown", null);
                b041Var.e = true;
            }
        }
    }

    public final void H0() {
        TransferMainState$Success$OpenScenario transferMainState$Success$OpenScenario;
        wk01 b = zk01.b((xk01) X());
        if (b == null || (transferMainState$Success$OpenScenario = b.v) == null || !transferMainState$Success$OpenScenario.getRequireNavigation()) {
            return;
        }
        S0();
    }

    public final void I0(sl slVar) {
        r0 r0Var;
        Object value;
        BottomSheetViewState$SelectAccount$Type bottomSheetViewState$SelectAccount$Type;
        r0 r0Var2;
        Object value2;
        orp0 orp0Var = orp0.e;
        wk01 b = zk01.b((xk01) X());
        vg6 vg6Var = b != null ? b.h : null;
        tg6 tg6Var = vg6Var instanceof tg6 ? (tg6) vg6Var : null;
        if (tg6Var == null) {
            x4c.g("onSelectedAccountChanged null bottomSheetState", null, null, Collections.singletonList(orp0Var), 6);
            return;
        }
        String str = slVar.f;
        if (str != null && !evu0.J(str)) {
            if (((nu01) this.G).a.c(str).a instanceof x0h) {
                x4c.g("Couldn't resolve deeplink on account click", null, slVar.e, Collections.singletonList(orp0Var), 2);
                return;
            }
            pz40 Y = Y();
            do {
                r0Var2 = (r0) Y;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, zk01.c((xk01) value2, new el01(true, true))));
            return;
        }
        pz40 Y2 = Y();
        do {
            r0Var = (r0) Y2;
            value = r0Var.getValue();
        } while (!r0Var.k(value, zk01.c((xk01) value, new dl01(1, tg6Var, slVar))));
        int i = rl01.c[tg6Var.x.ordinal()];
        if (i == 1) {
            bottomSheetViewState$SelectAccount$Type = BottomSheetViewState$SelectAccount$Type.MAIN;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            bottomSheetViewState$SelectAccount$Type = BottomSheetViewState$SelectAccount$Type.SUBJECT;
        }
        p0(bottomSheetViewState$SelectAccount$Type);
        U0(slVar.g, slVar.a);
    }

    public final void J0(StadiumButtonView.ClickedPart clickedPart) {
        eh01 b;
        bjq0 bjq0Var;
        r0 r0Var;
        Object value;
        orp0 orp0Var = orp0.e;
        wk01 b2 = zk01.b((xk01) X());
        String str = null;
        str = null;
        if (b2 == null) {
            x4c.g("onCircleButtonClicked null bottomSheetState", null, null, Collections.singletonList(orp0Var), 6);
            return;
        }
        wjq0 wjq0Var = b2.i;
        String str2 = b2.g.b;
        if (wjq0Var == null || (b = wjq0Var.b()) == null) {
            x4c.g("currentState.selectedTransferSubject?.fromCircleButton is null onStadiumButtonClicked", null, null, Collections.singletonList(orp0Var), 6);
            return;
        }
        TransferDeeplink transferDeeplink = b.f;
        ButtonTransferType buttonTransferType = b.q;
        int i = rl01.e[clickedPart.ordinal()];
        if (i == 1) {
            boolean l = jl40.l(transferDeeplink, TransferDeeplink.Self.ItemsSheet.INSTANCE);
            TransferDirection transferDirection = this.R;
            qj01 qj01Var = this.V;
            if (l) {
                qj01Var.f(str2, transferDirection, buttonTransferType);
                hg6 hg6Var = b.h;
                Z0(hg6Var != null ? new af6(hg6Var) : null, buttonTransferType);
            } else if (jl40.l(transferDeeplink, TransferDeeplink.Self.SectionsSheet.INSTANCE)) {
                qj01Var.f(str2, transferDirection, buttonTransferType);
                r6q0 r6q0Var = b.i;
                Z0(r6q0Var != null ? new bf6(r6q0Var) : null, buttonTransferType);
            } else if (jl40.l(transferDeeplink, TransferDeeplink.PhoneTransfer.INSTANCE)) {
                if (wjq0Var instanceof njq0) {
                    str = ((njq0) wjq0Var).a.a;
                } else if ((wjq0Var instanceof cjq0) && (bjq0Var = ((cjq0) wjq0Var).e) != null) {
                    str = bjq0Var.a;
                }
                if (str == null) {
                    str = "";
                }
                qj01Var.d(str);
                b1(this, b2, null, TransferScenario.PHONE, null, null, 122);
            } else if (jl40.l(transferDeeplink, TransferDeeplink.CrossBorderTransfer.INSTANCE)) {
                if (((qu01) this.F).e()) {
                    R0();
                } else {
                    b1(this, b2, null, TransferScenario.CROSS_BORDER, null, null, 122);
                }
            } else if (jl40.l(transferDeeplink, TransferDeeplink.RequisitesTransfer.INSTANCE)) {
                if (!(wjq0Var instanceof njq0) && !(wjq0Var instanceof ujq0) && !(wjq0Var instanceof vjq0) && !(wjq0Var instanceof jjq0) && !(wjq0Var instanceof ajq0) && !(wjq0Var instanceof ljq0) && !(wjq0Var instanceof ijq0) && !(wjq0Var instanceof tjq0) && !(wjq0Var instanceof djq0) && !(wjq0Var instanceof cjq0) && !(wjq0Var instanceof hjq0) && !(wjq0Var instanceof gjq0) && !(wjq0Var instanceof kjq0)) {
                    if (!(wjq0Var instanceof sjq0)) {
                        w511.b();
                        return;
                    }
                    c1(b.l, b.m, b.n, (sjq0) wjq0Var);
                }
            } else if (transferDeeplink instanceof TransferDeeplink.RawAction) {
                if (!(wjq0Var instanceof jjq0) && !(wjq0Var instanceof ajq0) && !(wjq0Var instanceof njq0) && !(wjq0Var instanceof pjq0) && !(wjq0Var instanceof rjq0) && !(wjq0Var instanceof ojq0) && !(wjq0Var instanceof ujq0) && !(wjq0Var instanceof vjq0) && !(wjq0Var instanceof tjq0) && !(wjq0Var instanceof djq0) && !(wjq0Var instanceof cjq0) && !(wjq0Var instanceof hjq0) && !(wjq0Var instanceof gjq0) && !(wjq0Var instanceof kjq0)) {
                    if (!(wjq0Var instanceof ljq0)) {
                        if (!(wjq0Var instanceof ijq0)) {
                            w511.b();
                            return;
                        }
                        ijq0 ijq0Var = (ijq0) wjq0Var;
                        PaymentProviderEntity paymentProviderEntity = ijq0Var.b;
                        qj01Var.d(paymentProviderEntity.getName());
                        InternetPaymentFormInputScreenParams internetPaymentFormInputScreenParams = new InternetPaymentFormInputScreenParams(paymentProviderEntity.getId(), true, ijq0Var.c, null);
                        this.B.getClass();
                        this.C.h(com.ybsdk.feature.transfer.version2.internal.screens.a.b(internetPaymentFormInputScreenParams));
                        return;
                    }
                    qj01Var.d(((ljq0) wjq0Var).b.getName());
                }
                String action = ((TransferDeeplink.RawAction) transferDeeplink).getAction();
                if (action == null) {
                    x4c.g("action is not TransferDeeplink.RawAction in TransferMainViewModel", null, null, null, 14);
                } else {
                    ((nu01) this.G).a(action);
                }
            } else if (!jl40.l(transferDeeplink, TransferDeeplink.AllTargets.INSTANCE) && !jl40.l(transferDeeplink, TransferDeeplink.Me2MeTopup.INSTANCE) && !jl40.l(transferDeeplink, TransferDeeplink.AftTopup.INSTANCE) && !(transferDeeplink instanceof TransferDeeplink.SelectTarget) && !jl40.l(transferDeeplink, TransferDeeplink.Self.Topup.INSTANCE) && !jl40.l(transferDeeplink, TransferDeeplink.Self.Transfer.INSTANCE) && transferDeeplink != null) {
                w511.b();
                return;
            }
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            t0();
        }
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, zk01.c((xk01) value, new al01(b, 1))));
    }

    public final void K0() {
        wk01 b = zk01.b((xk01) X());
        if (b == null) {
            return;
        }
        ak1 ak1Var = b.g;
        String str = ak1Var.b;
        List list = ak1Var.i;
        qj01 qj01Var = this.V;
        AppAnalyticsReporter appAnalyticsReporter = qj01Var.a;
        String X = kotlin.collections.a.X(list, Extension.FIX_SPACE, null, null, new ri01(2), 30);
        int i = mj01.c[qj01Var.e.ordinal()];
        if (i == 1) {
            em3 em3Var = appAnalyticsReporter.q0;
            String str2 = qj01Var.b;
            String str3 = qj01Var.c;
            String str4 = qj01Var.d;
            LinkedHashMap t = x4e.t(5, "suggests", X, "transfer_session_id", str2);
            if (str3 != null) {
                t.put("transfer_direction", str3);
            }
            if (str4 != null) {
                t.put("transfer_scenario", str4);
            }
            t.put(CreateApplicationWithProductJsonAdapter.productKey, str);
            em3Var.a.a("transfer.suggests_shown", t);
            return;
        }
        if (i == 2) {
            qq7 qq7Var = appAnalyticsReporter.L;
            qq7Var.a.a("payment.mobile_services.payment_suggests_shown", g8e.w(1, "suggests", X));
            return;
        }
        if (i == 3) {
            l0p l0pVar = appAnalyticsReporter.E;
            l0pVar.a.a("payment.internet_tv.payment_suggests_shown", g8e.w(1, "suggests", X));
            return;
        }
        if (i != 4) {
            if (i != 5) {
                w511.b();
                return;
            }
            hwo0 hwo0Var = qj01Var.f;
            if (hwo0Var != null) {
                z94 z94Var = ((AppAnalyticsReporter) hwo0Var.c).n0;
                TemplatePaymentTypeTransfers templatePaymentTypeTransfers = (TemplatePaymentTypeTransfers) hwo0Var.w;
                String str5 = (String) hwo0Var.b;
                LinkedHashMap linkedHashMap = new LinkedHashMap(3);
                linkedHashMap.put("type", templatePaymentTypeTransfers.getOriginalValue());
                linkedHashMap.put("suggests", X);
                linkedHashMap.put("scenario_hash", str5);
                z94Var.a.a("template_transfer.suggests_shown", linkedHashMap);
            }
        }
    }

    public final void L0() {
        wk01 b = zk01.b((xk01) X());
        if (b == null) {
            x4c.g("onToolbarSubtitleClick null state", null, null, Collections.singletonList(orp0.e), 6);
            return;
        }
        String str = b.g.b;
        qj01 qj01Var = this.V;
        qj01Var.getClass();
        int i = mj01.b[this.R.ordinal()];
        if (i == 1) {
            qj01Var.j(str, null);
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            qj01Var.g(str, null);
        }
        if (b.o) {
            Y0();
        }
    }

    public final void M0() {
        u031 u031Var;
        rvz0 rvz0Var;
        r0 r0Var;
        Object value;
        wk01 b = zk01.b((xk01) X());
        if (b == null || (u031Var = b.q) == null) {
            return;
        }
        if (u031Var instanceof m031) {
            rvz0Var = ((m031) u031Var).a;
        } else if (u031Var instanceof s031) {
            rvz0Var = ((s031) u031Var).a;
        } else if (!u031Var.equals(r501.c) && !(u031Var instanceof p031) && !u031Var.equals(t031.a)) {
            w511.b();
            return;
        } else {
            x4c.g("try to click on tooltip with invalid validation state", null, u031Var, Collections.singletonList(orp0.e), 2);
            rvz0Var = null;
        }
        if (rvz0Var == null) {
            return;
        }
        qj01 qj01Var = this.V;
        AppAnalyticsReporter appAnalyticsReporter = qj01Var.a;
        int i = mj01.c[qj01Var.e.ordinal()];
        if (i == 1) {
            em3 em3Var = appAnalyticsReporter.q0;
            String n = qj01.n(rvz0Var);
            String str = qj01Var.b;
            String str2 = qj01Var.c;
            String str3 = qj01Var.d;
            LinkedHashMap t = x4e.t(4, "text", n, "transfer_session_id", str);
            if (str2 != null) {
                t.put("transfer_direction", str2);
            }
            if (str3 != null) {
                t.put("transfer_scenario", str3);
            }
            em3Var.a.a("transfer.payment_amount_tooltip_click", t);
        } else if (i == 2) {
            appAnalyticsReporter.L.a.a("payment.mobile_services.payment_amount_tooltip_click", g8e.w(1, "text", qj01.n(rvz0Var)));
        } else if (i == 3) {
            appAnalyticsReporter.E.a.a("payment.internet_tv.payment_amount_tooltip_click", g8e.w(1, "text", qj01.n(rvz0Var)));
        } else if (i != 4) {
            if (i != 5) {
                w511.b();
                return;
            }
            hwo0 hwo0Var = qj01Var.f;
            if (hwo0Var != null) {
                String n2 = qj01.n(rvz0Var);
                z94 z94Var = ((AppAnalyticsReporter) hwo0Var.c).n0;
                TemplatePaymentTypeTransfers templatePaymentTypeTransfers = (TemplatePaymentTypeTransfers) hwo0Var.w;
                LinkedHashMap linkedHashMap = new LinkedHashMap(2);
                linkedHashMap.put("type", templatePaymentTypeTransfers.getOriginalValue());
                linkedHashMap.put("text", n2);
                z94Var.a.a("template_transfer.amount_tooltip_click", linkedHashMap);
            }
        }
        String str4 = rvz0Var.b;
        if (str4 != null) {
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, zk01.c((xk01) value, new el01(true, false))));
            ((nu01) this.G).a(str4);
        }
    }

    public final void N0(Lifecycle lifecycle) {
        String str;
        nu01 nu01Var = (nu01) this.G;
        xgk xgkVar = nu01Var.b;
        pv3 pv3Var = new pv3(nu01Var.a, 2);
        xgkVar.a.add(pv3Var);
        lifecycle.a(new wgk(0, xgkVar, pv3Var));
        Object obj = ((c1x0) this.K).a;
        int i = zr51.a[this.O.getDirection().ordinal()];
        if (i == 1) {
            str = "transfer";
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            str = TopupFragment.WEBVIEW_NAME;
        }
        this.L.a.f(new eh51(g8e.p(str, "_section.", "opened")));
    }

    public final void O0(px11 px11Var, Context context) {
        String obj = d.a(context, px11Var.a).toString();
        qj01 qj01Var = this.V;
        em3 em3Var = qj01Var.a.q0;
        String str = qj01Var.b;
        String str2 = qj01Var.c;
        String str3 = qj01Var.d;
        LinkedHashMap t = x4e.t(4, "text", obj, "transfer_session_id", str);
        if (str2 != null) {
            t.put("transfer_direction", str2);
        }
        if (str3 != null) {
            t.put("transfer_scenario", str3);
        }
        em3Var.a.a("transfer.widget.click", t);
        f0(px11Var.e);
    }

    public final void P0(t451 t451Var) {
        Toggles toggles = Toggles.AUTO_TOPUP;
        em3 em3Var = this.V.a.q0;
        em3Var.a.a("transfer.toggle.information.clicked", g8e.w(1, "toggle", toggles.getTitle()));
        f0(t451Var.d);
    }

    public final void Q0(o oVar) {
        ControlState controlState;
        TransferEvents$TransferToggleSwitchClickedAction transferEvents$TransferToggleSwitchClickedAction;
        r0 r0Var;
        Object value;
        int i = rl01.b[oVar.a.ordinal()];
        if (i == 1) {
            controlState = ControlState.OFF;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            controlState = ControlState.ON;
        }
        Toggles toggles = Toggles.AUTO_TOPUP;
        qj01 qj01Var = this.V;
        qj01Var.getClass();
        int i2 = mj01.a[controlState.ordinal()];
        if (i2 == 1) {
            transferEvents$TransferToggleSwitchClickedAction = TransferEvents$TransferToggleSwitchClickedAction.ON;
        } else {
            if (i2 != 2) {
                w511.b();
                return;
            }
            transferEvents$TransferToggleSwitchClickedAction = TransferEvents$TransferToggleSwitchClickedAction.OFF;
        }
        em3 em3Var = qj01Var.a.q0;
        String title = toggles.getTitle();
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put("action", transferEvents$TransferToggleSwitchClickedAction.getOriginalValue());
        linkedHashMap.put("toggle", title);
        em3Var.a.a("transfer.toggle.switch.clicked", linkedHashMap);
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, zk01.c((xk01) value, new pxy0(27, controlState))));
    }

    public final void R0() {
        gl01 gl01Var = new gl01(this, 0);
        ccf ccfVar = this.H;
        ccfVar.a = gl01Var;
        ccfVar.b = true;
        this.C.h(this.B.a());
    }

    public final void S0() {
        TransferEvents$TransferScenarioCloseStatus transferEvents$TransferScenarioCloseStatus;
        String str;
        xk01 xk01Var = (xk01) X();
        qj01 qj01Var = this.V;
        qj01Var.getClass();
        if ((xk01Var instanceof vk01) || (xk01Var instanceof wk01)) {
            transferEvents$TransferScenarioCloseStatus = TransferEvents$TransferScenarioCloseStatus.SETUP;
        } else {
            if (!(xk01Var instanceof uk01)) {
                w511.b();
                return;
            }
            transferEvents$TransferScenarioCloseStatus = TransferEvents$TransferScenarioCloseStatus.ERROR;
        }
        qj01Var.a.q0.I(transferEvents$TransferScenarioCloseStatus, qj01Var.b, qj01Var.c, qj01Var.d);
        Object obj = ((c1x0) this.K).a;
        int i = zr51.a[this.O.getDirection().ordinal()];
        if (i == 1) {
            str = "transfer";
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            str = TopupFragment.WEBVIEW_NAME;
        }
        this.L.a.f(new eh51(g8e.p(str, "_section.", "closed")));
        this.C.e();
    }

    public final void T0() {
        a0(new pxy0(29, this));
        tje.N(ds31.a(this), null, null, new TransferMainViewModel$requestData$2(this, tje.h(ds31.a(this), null, null, new TransferMainViewModel$requestData$phoneNumberDeferred$1(this, null), 3), null), 3);
    }

    public final void U0(String str, String str2) {
        r0 r0Var;
        Object value;
        if (str == null || str2 == null) {
            return;
        }
        Object X = X();
        wk01 wk01Var = X instanceof wk01 ? (wk01) X : null;
        if (wk01Var == null || ((xk01) X()).a().contains(str2)) {
            return;
        }
        List list = wk01Var.E;
        if (list == null || list.contains(str2)) {
            ((nu01) this.G).a(str);
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, zk01.c((xk01) value, new il01(str2, 0))));
        }
    }

    @Override // defpackage.yr31
    public final void V() {
        ccf ccfVar = this.H;
        ccfVar.a = null;
        ccfVar.b = false;
    }

    public final void V0(String str) {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, zk01.c((xk01) value, new g8r0(str, 29))));
    }

    public final void W0(wjq0 wjq0Var) {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, zk01.c((xk01) value, new jl01(0, wjq0Var))));
        d0(this, false, false, 3);
    }

    public final void X0() {
        r0 r0Var;
        Object value;
        wk01 b = zk01.b((xk01) X());
        if (b == null) {
            return;
        }
        Z(new nl01(b.x ? b.y : b.e));
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, zk01.c((xk01) value, new ri01(7))));
    }

    public final void Y0() {
        wk01 b = zk01.b((xk01) X());
        if (b == null) {
            return;
        }
        String str = b.g.b;
        List list = b.m;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zk01.g((ak1) it.next()));
        }
        qj01 qj01Var = this.V;
        qj01Var.getClass();
        int i = mj01.b[this.R.ordinal()];
        if (i == 1) {
            qj01Var.l(str, arrayList, null);
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            qj01Var.i(str, arrayList);
        }
        a0(new pxy0(28, b));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z0(cf6 cf6Var, ButtonTransferType buttonTransferType) {
        String str;
        r0 r0Var;
        Object value;
        eh01 b;
        r6q0 r6q0Var;
        Object obj;
        ig6 ig6Var;
        Object obj2;
        wk01 b2 = zk01.b((xk01) X());
        if (b2 == null) {
            return;
        }
        String str2 = b2.g.b;
        if (cf6Var == null) {
            return;
        }
        List items = cf6Var.getItems();
        ArrayList arrayList = new ArrayList();
        Iterator it = items.iterator();
        while (it.hasNext()) {
            lfq0 h = zk01.h((ig6) it.next());
            if (h != null) {
                arrayList.add(h);
            }
        }
        qj01 qj01Var = this.V;
        qj01Var.getClass();
        int i = mj01.b[this.R.ordinal()];
        if (i == 1) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (next instanceof mfq0) {
                    arrayList2.add(next);
                }
            }
            qj01Var.i(str2, arrayList2);
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            qj01Var.l(str2, arrayList, buttonTransferType);
        }
        wjq0 wjq0Var = b2.i;
        sl slVar = null;
        if (wjq0Var instanceof ujq0) {
            str = ((ujq0) wjq0Var).b;
        } else if (wjq0Var instanceof vjq0) {
            str = ((vjq0) wjq0Var).b;
        } else if (wjq0Var instanceof jjq0) {
            str = ((jjq0) wjq0Var).b;
        } else if (wjq0Var instanceof ajq0) {
            str = ((ajq0) wjq0Var).b;
        } else {
            if (!(wjq0Var instanceof sjq0) && !(wjq0Var instanceof njq0) && !(wjq0Var instanceof ljq0) && !(wjq0Var instanceof ijq0) && !(wjq0Var instanceof tjq0) && !(wjq0Var instanceof djq0) && !(wjq0Var instanceof cjq0) && !(wjq0Var instanceof hjq0) && !(wjq0Var instanceof gjq0) && !(wjq0Var instanceof kjq0) && wjq0Var != null) {
                w511.b();
                return;
            }
            str = null;
        }
        if (wjq0Var != null && (b = wjq0Var.b()) != null) {
            TransferDeeplink transferDeeplink = b.f;
            if (jl40.l(transferDeeplink, TransferDeeplink.Self.ItemsSheet.INSTANCE)) {
                hg6 hg6Var = b.h;
                if (hg6Var != null) {
                    Iterator it3 = hg6Var.d.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = it3.next();
                            if (jl40.l(((ig6) obj2).a, str)) {
                                break;
                            }
                        }
                    }
                    ig6Var = (ig6) obj2;
                    if (ig6Var != null) {
                        slVar = zk01.e(ig6Var);
                    }
                }
                ig6Var = null;
                if (ig6Var != null) {
                }
            } else {
                if (jl40.l(transferDeeplink, TransferDeeplink.Self.SectionsSheet.INSTANCE) && (r6q0Var = b.i) != null) {
                    Iterator it4 = r6q0Var.b().iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it4.next();
                            if (jl40.l(((ig6) obj).a, str)) {
                                break;
                            }
                        }
                    }
                    ig6Var = (ig6) obj;
                    if (ig6Var != null) {
                    }
                }
                ig6Var = null;
                if (ig6Var != null) {
                }
            }
        }
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, zk01.c((xk01) value, new dl01(2, cf6Var, slVar))));
    }

    public final void a1() {
        int i;
        com.ybsdk.core.utils.text.b bVar = Text.Companion;
        int i2 = rl01.f[this.R.ordinal()];
        if (i2 == 1) {
            i = dzh0.ybsdk_transfer_tooltip_select_transfer;
        } else {
            if (i2 != 2) {
                w511.b();
                return;
            }
            i = dzh0.ybsdk_transfer_tooltip_select_topup;
        }
        Z(new ll01(unr0.h(bVar, i)));
    }

    public final void c1(RequisitesPersonTransferPayloadEntity requisitesPersonTransferPayloadEntity, RequisitesLegalTransferPayloadEntity requisitesLegalTransferPayloadEntity, RequisitesHcsTransferPayloadEntity requisitesHcsTransferPayloadEntity, sjq0 sjq0Var) {
        TransferRequisiteResultEntity hcs;
        qj01 qj01Var = this.V;
        em3 em3Var = qj01Var.a.q0;
        String str = qj01Var.b;
        String str2 = qj01Var.c;
        String str3 = qj01Var.d;
        LinkedHashMap w = g8e.w(3, "transfer_session_id", str);
        if (str2 != null) {
            w.put("transfer_direction", str2);
        }
        if (str3 != null) {
            w.put("transfer_scenario", str3);
        }
        em3Var.a.a("transfer.by_details.click", w);
        TransferRequisiteResultEntity transferRequisiteResultEntity = null;
        if (requisitesPersonTransferPayloadEntity == null && requisitesHcsTransferPayloadEntity == null) {
            Z(new ol01(gao.e(null, null, null, 7)));
            x4c.g("Try to start requisite flow with only legalValidation", null, null, Collections.singletonList(orp0.e), 6);
            qj01Var.m(TransferEvents$TransferByDetailsLoadedResult.ERROR);
            return;
        }
        qj01Var.m(TransferEvents$TransferByDetailsLoadedResult.OK);
        if (sjq0Var != null) {
            if (sjq0Var instanceof pjq0) {
                pjq0 pjq0Var = (pjq0) sjq0Var;
                String str4 = pjq0Var.a;
                String str5 = pjq0Var.d;
                String str6 = pjq0Var.c;
                boolean z = pjq0Var.e;
                String str7 = pjq0Var.f;
                String str8 = pjq0Var.g;
                RequisitesTarget requisitesTarget = pjq0Var.b;
                hcs = new TransferRequisiteResultEntity.Legal(str5, str6, z, str4, str8, str7, requisitesTarget != null ? new RequisiteTarget(requisitesTarget.getTitle(), requisitesTarget.getImage()) : null, pjq0Var.i);
            } else if (sjq0Var instanceof rjq0) {
                rjq0 rjq0Var = (rjq0) sjq0Var;
                String str9 = rjq0Var.a;
                String str10 = rjq0Var.c;
                String str11 = rjq0Var.d;
                qjq0 qjq0Var = rjq0Var.e;
                MiddleNameEntity middleNameEntity = new MiddleNameEntity(qjq0Var.a, qjq0Var.b);
                String str12 = rjq0Var.f;
                String str13 = rjq0Var.g;
                RequisitesTarget requisitesTarget2 = rjq0Var.b;
                hcs = new TransferRequisiteResultEntity.Person(str10, str11, middleNameEntity, str9, str13, str12, requisitesTarget2 != null ? new RequisiteTarget(requisitesTarget2.getTitle(), requisitesTarget2.getImage()) : null, rjq0Var.i);
            } else {
                if (!(sjq0Var instanceof ojq0)) {
                    w511.b();
                    return;
                }
                ojq0 ojq0Var = (ojq0) sjq0Var;
                String str14 = ojq0Var.a;
                String str15 = ojq0Var.b;
                String str16 = ojq0Var.c;
                String str17 = ojq0Var.d;
                String str18 = ojq0Var.e;
                String str19 = ojq0Var.f;
                String str20 = ojq0Var.g;
                boolean z2 = ojq0Var.h;
                RequisitesTarget requisitesTarget3 = ojq0Var.i;
                hcs = new TransferRequisiteResultEntity.Hcs(str14, str15, str17, str16, str18, str19, z2, str20, requisitesTarget3 != null ? new RequisiteTarget(requisitesTarget3.getTitle(), requisitesTarget3.getImage()) : null, ojq0Var.k);
            }
            transferRequisiteResultEntity = hcs;
        }
        TransferRequisiteScreenParams transferRequisiteScreenParams = new TransferRequisiteScreenParams(new RequisitesTransferPayloadEntity(requisitesPersonTransferPayloadEntity, requisitesLegalTransferPayloadEntity, requisitesHcsTransferPayloadEntity), transferRequisiteResultEntity, h0());
        this.B.getClass();
        this.C.h(new FragmentScreen("TransferRequisiteScreen", false, transferRequisiteScreenParams, TransitionPolicyType.POPUP, qoi0.a(TransferRequisiteFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 2, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x06e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d1() {
        String action;
        TransferMainScreenArguments transferMainScreenArguments;
        boolean z;
        boolean z2;
        TransferMainResultScreenParams.CrossBorderPriorityMoneyType crossBorderPriorityMoneyType;
        TransferMainResultScreenParams crossBorderByPhoneParams;
        AutoFundPayloadEntity autoFundPayloadEntity;
        AutoFundPayloadEntity autoFundPayloadEntity2;
        boolean z3;
        com.ybsdk.feature.transfer.version2.internal.screens.a aVar;
        wk01 b = zk01.b((xk01) X());
        u031 u031Var = b != null ? b.q : null;
        if (!(u031Var instanceof s031)) {
            if (jl40.l(u031Var, t031.a)) {
                wk01 b2 = zk01.b((xk01) X());
                if (b2 != null && (b2.q instanceof t031)) {
                    ActionButtonEntity actionButtonEntity = b2.D;
                    f0((actionButtonEntity == null || (action = actionButtonEntity.getAction()) == null) ? null : gtu0.c(action, "amount", b2.d.toString()));
                    return;
                }
                return;
            }
            if ((u031Var instanceof m031) || jl40.l(u031Var, r501.c) || (u031Var instanceof p031) || u031Var == null) {
                Z(pl01.a);
                return;
            } else {
                w511.b();
                return;
            }
        }
        orp0 orp0Var = orp0.e;
        wk01 b3 = zk01.b((xk01) X());
        if (b3 == null) {
            return;
        }
        wjq0 wjq0Var = b3.i;
        vm01 vm01Var = b3.C;
        String str = b3.c;
        BigDecimal bigDecimal = b3.d;
        ak1 ak1Var = b3.g;
        u031 u031Var2 = b3.q;
        String str2 = ak1Var.b;
        if (!(u031Var2 instanceof s031)) {
            return;
        }
        boolean z4 = wjq0Var instanceof njq0;
        TransferPrerequisites.Template template = this.U;
        w530 w530Var = this.N;
        TransferMainScreenArguments transferMainScreenArguments2 = this.O;
        if (z4) {
            TransferDirection direction = transferMainScreenArguments2.getDirection();
            TransferScenario scenario = transferMainScreenArguments2.getScenario();
            s031 s031Var = (s031) u031Var2;
            TransferResultPageEntity transferResultPageEntity = s031Var.b;
            TransferResultPageEntity transferResultPageEntity2 = s031Var.c;
            njq0 njq0Var = (njq0) wjq0Var;
            mjq0 mjq0Var = njq0Var.a;
            transferMainScreenArguments = transferMainScreenArguments2;
            z = z4;
            crossBorderByPhoneParams = new TransferMainResultScreenParams.PhoneTransferParams(str2, null, direction, scenario, transferResultPageEntity, transferResultPageEntity2, mjq0Var.b, mjq0Var.a, b3.e, mjq0Var.e, njq0Var.c, mjq0Var.g, bob1.g(new Money(bigDecimal, str), w530Var), ak1Var.a, s031Var.x, b3.u, h0(), template != null ? template.getType() : null, 2, null);
        } else {
            transferMainScreenArguments = transferMainScreenArguments2;
            z = z4;
            if (!(wjq0Var instanceof vjq0)) {
                if (wjq0Var instanceof ujq0) {
                    mfq0 mfq0Var = ((ujq0) wjq0Var).a;
                    v24 v24Var = mfq0Var.b;
                    TransferDirection direction2 = transferMainScreenArguments.getDirection();
                    TransferScenario scenario2 = transferMainScreenArguments.getScenario();
                    s031 s031Var2 = (s031) u031Var2;
                    TransferResultPageEntity transferResultPageEntity3 = s031Var2.b;
                    z2 = z;
                    TransferResultPageEntity transferResultPageEntity4 = s031Var2.c;
                    String str3 = mfq0Var.a;
                    String str4 = ak1Var.a;
                    MoneyEntity g = bob1.g(new Money(bigDecimal, str), w530Var);
                    String str5 = s031Var2.x;
                    String str6 = b3.u;
                    String h0 = h0();
                    if (v24Var != null) {
                        if ((vm01Var != null ? vm01Var.d : null) == ControlState.ON && v24Var.a) {
                            autoFundPayloadEntity2 = new AutoFundPayloadEntity(vm01Var.g, vm01Var.h, vm01Var.i);
                            crossBorderByPhoneParams = new TransferMainResultScreenParams.SelfTopupParams(str2, null, str3, direction2, scenario2, transferResultPageEntity3, transferResultPageEntity4, str4, g, str5, str6, h0, autoFundPayloadEntity2, 2, null);
                        }
                    }
                    autoFundPayloadEntity2 = null;
                    crossBorderByPhoneParams = new TransferMainResultScreenParams.SelfTopupParams(str2, null, str3, direction2, scenario2, transferResultPageEntity3, transferResultPageEntity4, str4, g, str5, str6, h0, autoFundPayloadEntity2, 2, null);
                } else {
                    z2 = z;
                    if (wjq0Var instanceof rjq0) {
                        rjq0 rjq0Var = (rjq0) wjq0Var;
                        RequisitesTarget requisitesTarget = rjq0Var.b;
                        String title = requisitesTarget != null ? requisitesTarget.getTitle() : null;
                        if (title == null || evu0.J(title)) {
                            x4c.g("Can't show yb label", null, null, Collections.singletonList(orp0Var), 6);
                        }
                        TransferDirection direction3 = transferMainScreenArguments.getDirection();
                        TransferScenario scenario3 = transferMainScreenArguments.getScenario();
                        s031 s031Var3 = (s031) u031Var2;
                        TransferResultPageEntity transferResultPageEntity5 = s031Var3.b;
                        TransferResultPageEntity transferResultPageEntity6 = s031Var3.c;
                        String str7 = ak1Var.a;
                        String str8 = s031Var3.x;
                        MoneyEntity g2 = bob1.g(new Money(bigDecimal, str), w530Var);
                        String b4 = gtu0.b(rjq0Var.a);
                        String str9 = rjq0Var.g;
                        String str10 = rjq0Var.c;
                        String str11 = rjq0Var.d;
                        qjq0 qjq0Var = rjq0Var.e;
                        MiddleNameEntity middleNameEntity = new MiddleNameEntity(qjq0Var.a, qjq0Var.b);
                        String str12 = rjq0Var.f;
                        String title2 = requisitesTarget != null ? requisitesTarget.getTitle() : null;
                        crossBorderByPhoneParams = new TransferMainResultScreenParams.TransferRequisiteParams.RequisitesPersonTransferParams(str2, null, direction3, scenario3, transferResultPageEntity5, transferResultPageEntity6, b4, str9, str10, str11, middleNameEntity, title2 == null ? "" : title2, str12, g2, str7, str8, b3.u, h0(), 2, null);
                    } else if (wjq0Var instanceof pjq0) {
                        pjq0 pjq0Var = (pjq0) wjq0Var;
                        RequisitesTarget requisitesTarget2 = pjq0Var.b;
                        String title3 = requisitesTarget2 != null ? requisitesTarget2.getTitle() : null;
                        if (title3 == null || evu0.J(title3)) {
                            x4c.g("Can't show yb label", null, null, Collections.singletonList(orp0Var), 6);
                        }
                        TransferDirection direction4 = transferMainScreenArguments.getDirection();
                        TransferScenario scenario4 = transferMainScreenArguments.getScenario();
                        s031 s031Var4 = (s031) u031Var2;
                        TransferResultPageEntity transferResultPageEntity7 = s031Var4.b;
                        TransferResultPageEntity transferResultPageEntity8 = s031Var4.c;
                        String str13 = ak1Var.a;
                        String str14 = s031Var4.x;
                        MoneyEntity g3 = bob1.g(new Money(bigDecimal, str), w530Var);
                        String b5 = gtu0.b(pjq0Var.a);
                        String str15 = pjq0Var.g;
                        String str16 = pjq0Var.d;
                        String str17 = pjq0Var.c;
                        boolean z5 = pjq0Var.e;
                        String str18 = pjq0Var.f;
                        String title4 = requisitesTarget2 != null ? requisitesTarget2.getTitle() : null;
                        crossBorderByPhoneParams = new TransferMainResultScreenParams.TransferRequisiteParams.RequisitesLegalTransferParams(str2, null, direction4, scenario4, transferResultPageEntity7, transferResultPageEntity8, b5, str15, str16, str17, z5, title4 == null ? "" : title4, str18, g3, str13, str14, b3.u, h0(), 2, null);
                    } else if (wjq0Var instanceof ojq0) {
                        ojq0 ojq0Var = (ojq0) wjq0Var;
                        RequisitesTarget requisitesTarget3 = ojq0Var.i;
                        String title5 = requisitesTarget3 != null ? requisitesTarget3.getTitle() : null;
                        if (title5 == null || evu0.J(title5)) {
                            x4c.g("Can't show yb label", null, null, Collections.singletonList(orp0Var), 6);
                        }
                        TransferDirection direction5 = transferMainScreenArguments.getDirection();
                        TransferScenario scenario5 = transferMainScreenArguments.getScenario();
                        s031 s031Var5 = (s031) u031Var2;
                        TransferResultPageEntity transferResultPageEntity9 = s031Var5.b;
                        TransferResultPageEntity transferResultPageEntity10 = s031Var5.c;
                        String str19 = ak1Var.a;
                        String str20 = s031Var5.x;
                        MoneyEntity g4 = bob1.g(new Money(bigDecimal, str), w530Var);
                        String b6 = gtu0.b(ojq0Var.a);
                        String str21 = ojq0Var.b;
                        String str22 = ojq0Var.d;
                        String str23 = ojq0Var.f;
                        String str24 = ojq0Var.c;
                        String str25 = ojq0Var.e;
                        boolean z6 = ojq0Var.h;
                        String str26 = ojq0Var.g;
                        String title6 = requisitesTarget3 != null ? requisitesTarget3.getTitle() : null;
                        crossBorderByPhoneParams = new TransferMainResultScreenParams.TransferRequisiteParams.RequisitesHcsTransferParams(str2, null, direction5, scenario5, transferResultPageEntity9, transferResultPageEntity10, b6, str21, str22, str23, str24, str25, z6, title6 == null ? "" : title6, str26, g4, str19, str20, b3.u, h0(), 2, null);
                    } else if (wjq0Var instanceof jjq0) {
                        phq0 phq0Var = ((jjq0) wjq0Var).c;
                        v24 v24Var2 = phq0Var.f;
                        TransferDirection direction6 = transferMainScreenArguments.getDirection();
                        TransferScenario scenario6 = transferMainScreenArguments.getScenario();
                        s031 s031Var6 = (s031) u031Var2;
                        TransferResultPageEntity transferResultPageEntity11 = s031Var6.b;
                        TransferResultPageEntity transferResultPageEntity12 = s031Var6.c;
                        String str27 = ak1Var.a;
                        MoneyEntity g5 = bob1.g(new Money(bigDecimal, str), w530Var);
                        String str28 = s031Var6.x;
                        String str29 = b3.u;
                        String str30 = phq0Var.a;
                        String h02 = h0();
                        if (v24Var2 != null) {
                            if ((vm01Var != null ? vm01Var.d : null) == ControlState.ON && v24Var2.a) {
                                autoFundPayloadEntity = new AutoFundPayloadEntity(vm01Var.g, vm01Var.h, vm01Var.i);
                                crossBorderByPhoneParams = new TransferMainResultScreenParams.Me2MeTopupParams(str2, null, direction6, scenario6, transferResultPageEntity11, transferResultPageEntity12, g5, str28, str29, str27, str30, h02, autoFundPayloadEntity, 2, null);
                            }
                        }
                        autoFundPayloadEntity = null;
                        crossBorderByPhoneParams = new TransferMainResultScreenParams.Me2MeTopupParams(str2, null, direction6, scenario6, transferResultPageEntity11, transferResultPageEntity12, g5, str28, str29, str27, str30, h02, autoFundPayloadEntity, 2, null);
                    } else if (wjq0Var instanceof ajq0) {
                        TransferDirection direction7 = transferMainScreenArguments.getDirection();
                        TransferScenario scenario7 = transferMainScreenArguments.getScenario();
                        s031 s031Var7 = (s031) u031Var2;
                        TransferResultPageEntity transferResultPageEntity13 = s031Var7.b;
                        TransferResultPageEntity transferResultPageEntity14 = s031Var7.c;
                        String str31 = ak1Var.a;
                        MoneyEntity g6 = bob1.g(new Money(bigDecimal, str), w530Var);
                        String str32 = s031Var7.x;
                        String str33 = b3.u;
                        String h03 = h0();
                        tfq0 tfq0Var = ((ajq0) wjq0Var).c;
                        crossBorderByPhoneParams = new TransferMainResultScreenParams.AftTopupParams(str2, null, direction7, scenario7, transferResultPageEntity13, transferResultPageEntity14, g6, str32, str33, h03, str31, tfq0Var.a, tfq0Var.b, 2, null);
                    } else if (wjq0Var instanceof ljq0) {
                        s031 s031Var8 = (s031) u031Var2;
                        ljq0 ljq0Var = (ljq0) wjq0Var;
                        crossBorderByPhoneParams = new TransferMainResultScreenParams.MobilePaymentParams(str2, null, transferMainScreenArguments.getDirection(), transferMainScreenArguments.getScenario(), s031Var8.b, s031Var8.c, ljq0Var.c, ljq0Var.b.getId(), bob1.g(new Money(bigDecimal, str), w530Var), ak1Var.a, s031Var8.x, b3.u, h0(), template != null ? template.getType() : null, 2, null);
                    } else if (wjq0Var instanceof ijq0) {
                        TransferDirection direction8 = transferMainScreenArguments.getDirection();
                        TransferScenario scenario8 = transferMainScreenArguments.getScenario();
                        s031 s031Var9 = (s031) u031Var2;
                        TransferResultPageEntity transferResultPageEntity15 = s031Var9.b;
                        TransferResultPageEntity transferResultPageEntity16 = s031Var9.c;
                        String str34 = ak1Var.a;
                        String str35 = s031Var9.x;
                        ijq0 ijq0Var = (ijq0) wjq0Var;
                        crossBorderByPhoneParams = new TransferMainResultScreenParams.InternetPaymentParams(str2, null, direction8, scenario8, transferResultPageEntity15, transferResultPageEntity16, ijq0Var.c, ijq0Var.b.getId(), bob1.g(new Money(bigDecimal, str), w530Var), str34, str35, b3.u, h0(), template != null ? template.getType() : null, 2, null);
                    } else if (wjq0Var instanceof tjq0) {
                        s031 s031Var10 = (s031) u031Var2;
                        tjq0 tjq0Var = (tjq0) wjq0Var;
                        crossBorderByPhoneParams = new TransferMainResultScreenParams.C2gTransferParams(str2, null, transferMainScreenArguments.getDirection(), transferMainScreenArguments.getScenario(), s031Var10.b, s031Var10.c, bob1.g(new Money(bigDecimal, str), w530Var), s031Var10.x, b3.u, h0(), ak1Var.a, tjq0Var.b, tjq0Var.g, 2, null);
                    } else if (wjq0Var instanceof hjq0) {
                        s031 s031Var11 = (s031) u031Var2;
                        hjq0 hjq0Var = (hjq0) wjq0Var;
                        crossBorderByPhoneParams = new TransferMainResultScreenParams.HcsInvoiceTransferParams(str2, null, transferMainScreenArguments.getDirection(), transferMainScreenArguments.getScenario(), s031Var11.b, s031Var11.c, bob1.g(new Money(bigDecimal, str), w530Var), s031Var11.x, b3.u, h0(), ak1Var.a, hjq0Var.b, hjq0Var.g, 2, null);
                    } else {
                        if (wjq0Var instanceof kjq0) {
                            x4c.g("Opening result screen with MkkCashout", null, null, Collections.singletonList(orp0Var), 6);
                            return;
                        }
                        if (wjq0Var instanceof djq0) {
                            x4c.g("Opening result screen with UnifiedTransfer", null, null, Collections.singletonList(orp0Var), 6);
                            return;
                        }
                        if (wjq0Var instanceof cjq0) {
                            String str36 = b3.H;
                            if (str36 == null && (str36 = ((cjq0) wjq0Var).g) == null) {
                                x4c.g("Opening result screen with B2cTransfer without plan token", null, null, Collections.singletonList(orp0Var), 6);
                                return;
                            }
                            String str37 = str36;
                            cjq0 cjq0Var = (cjq0) wjq0Var;
                            bjq0 bjq0Var = cjq0Var.e;
                            if (bjq0Var == null) {
                                x4c.g("Opening result screen with B2cTransfer without transferTarget", null, null, Collections.singletonList(orp0Var), 6);
                                return;
                            }
                            TransferDirection direction9 = transferMainScreenArguments.getDirection();
                            String str38 = null;
                            TransferScenario scenario9 = transferMainScreenArguments.getScenario();
                            s031 s031Var12 = (s031) u031Var2;
                            TransferResultPageEntity transferResultPageEntity17 = s031Var12.b;
                            TransferResultPageEntity transferResultPageEntity18 = s031Var12.c;
                            MoneyEntity g7 = bob1.g(new Money(bigDecimal, str), w530Var);
                            String str39 = s031Var12.x;
                            String str40 = b3.u;
                            String h04 = h0();
                            String str41 = ak1Var.a;
                            String str42 = bjq0Var.b;
                            String str43 = bjq0Var.a;
                            String str44 = bjq0Var.c;
                            if (!evu0.J(str44)) {
                                str38 = str44;
                            }
                            String str45 = str38 == null ? "" : str38;
                            String str46 = b3.e;
                            PhoneInputSource phoneInputSource = cjq0Var.f;
                            if (phoneInputSource == null) {
                                phoneInputSource = PhoneInputSource.MANUALLY;
                            }
                            crossBorderByPhoneParams = new TransferMainResultScreenParams.B2cTransferParams(str2, null, direction9, scenario9, transferResultPageEntity17, transferResultPageEntity18, g7, str39, str40, h04, str41, str37, str42, str43, str45, str46, phoneInputSource, 2, null);
                        } else {
                            if (!(wjq0Var instanceof gjq0)) {
                                if (wjq0Var == null) {
                                    return;
                                }
                                w511.b();
                                return;
                            }
                            gjq0 gjq0Var = (gjq0) wjq0Var;
                            SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType selectedTransferSubject$CrossBorderByPhone$PriorityMoneyType = gjq0Var.g;
                            BigDecimal bigDecimal2 = selectedTransferSubject$CrossBorderByPhone$PriorityMoneyType == SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType.DEBIT ? bigDecimal : gjq0Var.c;
                            if (selectedTransferSubject$CrossBorderByPhone$PriorityMoneyType != SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType.CREDIT) {
                                bigDecimal = gjq0Var.e;
                            }
                            TransferDirection direction10 = transferMainScreenArguments.getDirection();
                            TransferScenario scenario10 = transferMainScreenArguments.getScenario();
                            s031 s031Var13 = (s031) u031Var2;
                            TransferResultPageEntity transferResultPageEntity19 = s031Var13.b;
                            TransferResultPageEntity transferResultPageEntity20 = s031Var13.c;
                            MoneyEntity moneyEntity = new MoneyEntity(bigDecimal2, gjq0Var.d, "");
                            String str47 = s031Var13.x;
                            String str48 = b3.u;
                            String h05 = h0();
                            String str49 = ak1Var.a;
                            fjq0 fjq0Var = gjq0Var.b;
                            String str50 = fjq0Var.a;
                            String str51 = fjq0Var.b;
                            String str52 = fjq0Var.c;
                            MoneyEntity moneyEntity2 = new MoneyEntity(bigDecimal, gjq0Var.f, "");
                            ejq0 ejq0Var = gjq0Var.h;
                            TransferMainResultScreenParams.CurrencyRateEntity currencyRateEntity = ejq0Var != null ? new TransferMainResultScreenParams.CurrencyRateEntity(ejq0Var.a, ejq0Var.b) : null;
                            int i = rl01.j[selectedTransferSubject$CrossBorderByPhone$PriorityMoneyType.ordinal()];
                            if (i == 1) {
                                crossBorderPriorityMoneyType = TransferMainResultScreenParams.CrossBorderPriorityMoneyType.DEBIT;
                            } else {
                                if (i != 2) {
                                    w511.b();
                                    return;
                                }
                                crossBorderPriorityMoneyType = TransferMainResultScreenParams.CrossBorderPriorityMoneyType.CREDIT;
                            }
                            crossBorderByPhoneParams = new TransferMainResultScreenParams.CrossBorderByPhoneParams(str2, null, direction10, scenario10, transferResultPageEntity19, transferResultPageEntity20, moneyEntity, str47, str48, h05, str49, str50, str51, str52, moneyEntity2, currencyRateEntity, crossBorderPriorityMoneyType, s031Var13.x, gjq0Var.k, b3.J, 2, null);
                        }
                    }
                }
                z3 = wjq0Var instanceof ljq0;
                aVar = this.B;
                tfl0 tfl0Var = this.C;
                if (!z3 || (wjq0Var instanceof tjq0) || (wjq0Var instanceof hjq0)) {
                    aVar.getClass();
                    FragmentScreen d = com.ybsdk.feature.transfer.version2.internal.screens.a.d(crossBorderByPhoneParams);
                    if (!(transferMainScreenArguments.getPrerequisites() instanceof TransferPrerequisites.Template)) {
                        tfl0Var.l(d);
                        return;
                    } else {
                        tfl0Var.getClass();
                        tfl0Var.a(tjc.a, new jkc(d));
                        return;
                    }
                }
                if ((wjq0Var instanceof jjq0) || (wjq0Var instanceof ajq0) || z2 || (wjq0Var instanceof cjq0) || (wjq0Var instanceof pjq0) || (wjq0Var instanceof rjq0) || (wjq0Var instanceof ojq0) || (wjq0Var instanceof ujq0) || (wjq0Var instanceof vjq0) || (wjq0Var instanceof ijq0) || (wjq0Var instanceof gjq0)) {
                    aVar.getClass();
                    tfl0Var.l(com.ybsdk.feature.transfer.version2.internal.screens.a.d(crossBorderByPhoneParams));
                    return;
                } else {
                    if ((wjq0Var instanceof kjq0) || (wjq0Var instanceof djq0)) {
                        return;
                    }
                    w511.b();
                    return;
                }
            }
            s031 s031Var14 = (s031) u031Var2;
            crossBorderByPhoneParams = new TransferMainResultScreenParams.SelfTransferParams(str2, null, transferMainScreenArguments.getDirection(), transferMainScreenArguments.getScenario(), s031Var14.b, s031Var14.c, ak1Var.a, ((vjq0) wjq0Var).a.a, bob1.g(new Money(bigDecimal, str), w530Var), s031Var14.x, b3.u, h0(), 2, null);
        }
        z2 = z;
        z3 = wjq0Var instanceof ljq0;
        aVar = this.B;
        tfl0 tfl0Var2 = this.C;
        if (z3) {
        }
        aVar.getClass();
        FragmentScreen d2 = com.ybsdk.feature.transfer.version2.internal.screens.a.d(crossBorderByPhoneParams);
        if (!(transferMainScreenArguments.getPrerequisites() instanceof TransferPrerequisites.Template)) {
        }
    }

    public final void e0(boolean z) {
        r0 r0Var;
        Object value;
        wk01 b = zk01.b((xk01) X());
        if (b == null) {
            return;
        }
        wjq0 wjq0Var = b.i;
        cjq0 cjq0Var = wjq0Var instanceof cjq0 ? (cjq0) wjq0Var : null;
        if (cjq0Var != null && cjq0Var.e == null) {
            a1();
            return;
        }
        String str = b.k;
        if (str != null && !z) {
            f0(str);
            if (jl40.l(b.l, Boolean.TRUE)) {
                pz40 Y = Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, zk01.c((xk01) value, new ri01(8))));
                return;
            }
            return;
        }
        u031 u031Var = b.q;
        if (u031Var instanceof m031) {
            d1();
            return;
        }
        if (jl40.l(u031Var, t031.a) || (u031Var instanceof s031)) {
            d1();
            return;
        }
        if (!jl40.l(u031Var, r501.c)) {
            if (u031Var instanceof p031) {
                d0(this, true, false, 2);
                return;
            } else {
                w511.b();
                return;
            }
        }
        if (wjq0Var == null || !wjq0Var.a()) {
            a1();
        } else {
            d0(this, true, false, 2);
        }
    }

    public final void f0(String str) {
        if (str != null) {
            ((nu01) this.G).a(str);
        }
    }

    public final void g0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, zk01.c((xk01) value, new ri01(12))));
        e0(true);
    }

    public final String h0() {
        return (String) this.T.getValue();
    }

    public final void i0(wk01 wk01Var, Throwable th) {
        Z(new ol01(gao.d(new Text.Resource(dzh0.ybsdk_topup_card_bind_failed), new Text.Resource(dzh0.ybsdk_topup_card_bind_try_again), th)));
        eh01 eh01Var = wk01Var.p;
        if (eh01Var != null) {
            TransferDeeplink transferDeeplink = eh01Var.f;
            ButtonTransferType buttonTransferType = eh01Var.q;
            int i = buttonTransferType == null ? -1 : yk01.c[buttonTransferType.ordinal()];
            if (!(i != 1 ? i != 2 ? false : jl40.l(transferDeeplink, TransferDeeplink.Self.SectionsSheet.INSTANCE) : jl40.l(transferDeeplink, TransferDeeplink.Self.ItemsSheet.INSTANCE))) {
                eh01Var = null;
            }
            if (eh01Var != null) {
                q0(eh01Var.a);
            }
        }
    }

    public final void j0(boolean z) {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, zk01.c((xk01) value, new dzw0(z, 4))));
    }

    public final boolean k0() {
        wk01 b = zk01.b((xk01) X());
        return b != null && (b.i instanceof cjq0);
    }

    public final void l0(String str) {
        if (str != null) {
            qj01 qj01Var = this.V;
            em3 em3Var = qj01Var.a.q0;
            String str2 = qj01Var.b;
            String str3 = qj01Var.c;
            String str4 = qj01Var.d;
            LinkedHashMap t = x4e.t(4, "text", str, "transfer_session_id", str2);
            if (str3 != null) {
                t.put("transfer_direction", str3);
            }
            if (str4 != null) {
                t.put("transfer_scenario", str4);
            }
            em3Var.a.a("transfer.widget.shown", t);
        }
    }

    public final void m0(el0 el0Var) {
        o0();
        ((nu01) this.G).a(el0Var.d);
    }

    public final void n0(String str) {
        wk01 b;
        r0 r0Var;
        Object value;
        if (str == null || evu0.J(str) || (b = zk01.b((xk01) X())) == null) {
            return;
        }
        wjq0 wjq0Var = b.i;
        Locale locale = tm60.a;
        BigDecimal g = tm60.g(str);
        gjq0 gjq0Var = null;
        if (g == null) {
            x4c.g("amount input formatting error", null, str, Collections.singletonList(orp0.e), 2);
            return;
        }
        String plainString = g.toPlainString();
        boolean a = wjq0Var != null ? wjq0Var.a() : false;
        qj01 qj01Var = this.V;
        r0 r0Var2 = qj01Var.g;
        kj01 kj01Var = new kj01(plainString, a);
        r0Var2.getClass();
        r0Var2.m(null, kj01Var);
        if (this.P && !b.d.equals(g)) {
            gjq0 gjq0Var2 = wjq0Var instanceof gjq0 ? (gjq0) wjq0Var : null;
            if (gjq0Var2 != null && gjq0Var2.g == SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType.DEBIT) {
                String str2 = gjq0Var2.l;
                ejq0 ejq0Var = gjq0Var2.h;
                BigDecimal c0 = c0(g, str2, ejq0Var != null ? ejq0Var.a : null, ejq0Var != null ? ejq0Var.b : null, gjq0Var2.d);
                if (c0 != null) {
                    gjq0Var = gjq0.c(gjq0Var2, null, c0, null, null, null, null, null, 8175);
                }
            }
            if (gjq0Var != null) {
                wjq0Var = gjq0Var;
            }
            qj01Var.e(wjq0Var, g.toPlainString());
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, zk01.c((xk01) value, new dl01(0, g, gjq0Var))));
            d0(this, false, false, 3);
        }
    }

    public final void o0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, zk01.c((xk01) value, new ri01(10))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x010d, code lost:
    
        if (r1 == null) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p0(BottomSheetViewState$SelectAccount$Type bottomSheetViewState$SelectAccount$Type) {
        Object obj;
        Triple triple;
        r0 r0Var;
        Object value;
        final int i;
        Object obj2;
        Triple triple2;
        hg6 hg6Var;
        ymq0 ymq0Var;
        hg6 hg6Var2;
        xmq0 xmq0Var;
        eh01 b;
        eh01 eh01Var;
        String str;
        orp0 orp0Var;
        ig6 ig6Var;
        List items;
        ig6 ig6Var2;
        ig6 ig6Var3;
        ig6 ig6Var4;
        Triple triple3;
        Object obj3;
        Object obj4;
        r0 r0Var2;
        Object value2;
        final int i2;
        Object obj5;
        Object obj6;
        List items2;
        ig6 ig6Var5;
        orp0 orp0Var2 = orp0.e;
        wk01 b2 = zk01.b((xk01) X());
        vg6 vg6Var = b2 != null ? b2.h : null;
        tg6 tg6Var = vg6Var instanceof tg6 ? (tg6) vg6Var : null;
        if (tg6Var == null) {
            x4c.g("onBottomSheetPrimaryAction null bottomSheetState", null, null, Collections.singletonList(orp0Var2), 6);
            return;
        }
        sl slVar = tg6Var.a;
        wk01 b3 = zk01.b((xk01) X());
        if (b3 == null) {
            x4c.g("onBottomSheetPrimaryAction null state", null, null, Collections.singletonList(orp0Var2), 6);
            return;
        }
        eh01 eh01Var2 = b3.p;
        List list = b3.m;
        cf6 cf6Var = b3.f;
        wjq0 wjq0Var = b3.i;
        final ak1 ak1Var = b3.g;
        String str2 = ak1Var.a;
        String str3 = ak1Var.b;
        int i3 = rl01.d[bottomSheetViewState$SelectAccount$Type.ordinal()];
        TransferDirection transferDirection = this.R;
        qj01 qj01Var = this.V;
        boolean z = this.S;
        if (i3 == 1) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (jl40.l(((ak1) obj).a, slVar != null ? slVar.a : null)) {
                        break;
                    }
                }
            }
            final ak1 ak1Var2 = (ak1) obj;
            if (ak1Var2 == null) {
                x4c.g("Couldn't find main account in available accounts", null, null, Collections.singletonList(orp0Var2), 6);
                return;
            }
            String str4 = ak1Var2.a;
            mfq0 g = zk01.g(ak1Var2);
            qj01Var.getClass();
            int i4 = mj01.b[transferDirection.ordinal()];
            if (i4 == 1) {
                qj01Var.k(str3, g, null);
            } else {
                if (i4 != 2) {
                    w511.b();
                    return;
                }
                qj01Var.h(str3, g);
            }
            if (z) {
                Iterator it2 = ak1Var2.f.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it2.next();
                        if (jl40.l(((eh01) obj2).f, (wjq0Var == null || (b = wjq0Var.b()) == null) ? null : b.f)) {
                            break;
                        }
                    }
                }
                eh01 eh01Var3 = (eh01) obj2;
                if (wjq0Var instanceof ujq0) {
                    ujq0 ujq0Var = (ujq0) wjq0Var;
                    if (jl40.l(str4, ujq0Var.a.a)) {
                        triple = new Triple((eh01Var3 == null || (xmq0Var = eh01Var3.k) == null) ? null : new ujq0(new mfq0(xmq0Var.a, xmq0Var.f, xmq0Var.b, xmq0Var.c, xmq0Var.d, com.ybsdk.feature.transfer.version2.api.mappers.a.j(xmq0Var.e)), null, eh01Var3), eh01Var3, (eh01Var3 == null || (hg6Var2 = eh01Var3.h) == null) ? null : new af6(hg6Var2));
                    } else {
                        triple2 = new Triple(eh01Var3 != null ? ujq0.c(ujq0Var, eh01Var3) : null, eh01Var3, null);
                        triple = triple2;
                    }
                } else if (wjq0Var instanceof vjq0) {
                    vjq0 vjq0Var = (vjq0) wjq0Var;
                    if (jl40.l(str4, vjq0Var.a.a)) {
                        triple = new Triple((eh01Var3 == null || (ymq0Var = eh01Var3.j) == null) ? null : new vjq0(new mfq0(ymq0Var.a, null, ymq0Var.b, ymq0Var.c, ymq0Var.d, com.ybsdk.feature.transfer.version2.api.mappers.a.j(ymq0Var.e)), null, eh01Var3), eh01Var3, (eh01Var3 == null || (hg6Var = eh01Var3.h) == null) ? null : new af6(hg6Var));
                    } else {
                        triple2 = new Triple(eh01Var3 != null ? vjq0.c(vjq0Var, eh01Var3) : null, eh01Var3, null);
                        triple = triple2;
                    }
                } else {
                    if (!(wjq0Var instanceof njq0) && !(wjq0Var instanceof pjq0) && !(wjq0Var instanceof rjq0) && !(wjq0Var instanceof jjq0) && !(wjq0Var instanceof ajq0) && !(wjq0Var instanceof ljq0) && !(wjq0Var instanceof ijq0) && !(wjq0Var instanceof tjq0) && !(wjq0Var instanceof djq0) && !(wjq0Var instanceof cjq0) && !(wjq0Var instanceof ojq0) && !(wjq0Var instanceof hjq0) && !(wjq0Var instanceof gjq0) && !(wjq0Var instanceof kjq0) && wjq0Var != null) {
                        w511.b();
                        return;
                    }
                    triple = new Triple(wjq0Var, eh01Var3, null);
                }
            } else {
                xk1 xk1Var = ak1Var2.h;
                triple = new Triple(xk1Var != null ? xk1Var.b : null, null, null);
            }
            final wjq0 wjq0Var2 = (wjq0) triple.getFirst();
            final eh01 eh01Var4 = (eh01) triple.getSecond();
            af6 af6Var = (af6) triple.getThird();
            boolean z2 = z && wjq0Var2 != null;
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
                i = 0;
            } while (!r0Var.k(value, zk01.c((xk01) value, new tls() { // from class: bl01
                @Override // defpackage.tls
                public final Object invoke(Object obj7) {
                    int i5 = i;
                    eh01 eh01Var5 = eh01Var4;
                    switch (i5) {
                        case 0:
                            wk01 wk01Var = (wk01) obj7;
                            r501 r501Var = r501.c;
                            ak1 ak1Var3 = ak1Var2;
                            unq unqVar = ak1Var3.n;
                            if (eh01Var5 == null) {
                                xk1 xk1Var2 = ak1Var3.h;
                                eh01Var5 = xk1Var2 != null ? xk1Var2.b.b() : null;
                            }
                            return wk01.b(wk01Var, null, null, null, null, ak1Var3, null, wjq0Var2, unqVar, null, null, null, eh01Var5, r501Var, false, false, null, null, false, null, false, null, null, null, null, null, null, null, -99137, 15);
                        default:
                            wk01 wk01Var2 = (wk01) obj7;
                            r501 r501Var2 = r501.c;
                            ak1 ak1Var4 = ak1Var2;
                            unq unqVar2 = ak1Var4.n;
                            if (eh01Var5 == null) {
                                eh01Var5 = wk01Var2.p;
                            }
                            return wk01.b(wk01Var2, null, null, null, null, ak1Var4, null, wjq0Var2, unqVar2, null, null, null, eh01Var5, r501Var2, false, false, null, null, false, null, false, null, null, null, null, null, null, null, -99137, 15);
                    }
                }
            })));
            if (z2) {
                d0(this, false, false, 2);
            }
            o0();
            if (af6Var != null) {
                Z0(af6Var, null);
                return;
            }
            return;
        }
        if (i3 != 2) {
            w511.b();
            return;
        }
        wk01 b4 = zk01.b((xk01) X());
        if (b4 == null || (eh01Var = b4.p) == null) {
            x4c.g("onBottomSheetPrimaryAction null lastSelectedCircleButton", null, null, Collections.singletonList(orp0Var2), 6);
            return;
        }
        if (wjq0Var instanceof ujq0) {
            str = ((ujq0) wjq0Var).b;
        } else if (wjq0Var instanceof vjq0) {
            str = ((vjq0) wjq0Var).b;
        } else if (wjq0Var instanceof jjq0) {
            str = ((jjq0) wjq0Var).b;
        } else if (wjq0Var instanceof ajq0) {
            str = ((ajq0) wjq0Var).b;
        } else {
            if (!(wjq0Var instanceof ljq0) && !(wjq0Var instanceof sjq0) && !(wjq0Var instanceof njq0) && !(wjq0Var instanceof ijq0) && !(wjq0Var instanceof tjq0) && !(wjq0Var instanceof djq0) && !(wjq0Var instanceof cjq0) && !(wjq0Var instanceof hjq0) && !(wjq0Var instanceof gjq0) && !(wjq0Var instanceof kjq0) && wjq0Var != null) {
                w511.b();
                return;
            }
            str = null;
        }
        if (cf6Var == null || (items2 = cf6Var.getItems()) == null) {
            orp0Var = orp0Var2;
        } else {
            Iterator it3 = items2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    orp0Var = orp0Var2;
                    ig6Var5 = 0;
                    break;
                }
                ig6Var5 = it3.next();
                sl e = zk01.e((ig6) ig6Var5);
                orp0Var = orp0Var2;
                if (jl40.l(e != null ? e.a : null, slVar != null ? slVar.a : null)) {
                    break;
                } else {
                    orp0Var2 = orp0Var;
                }
            }
            ig6Var = ig6Var5;
        }
        hg6 hg6Var3 = eh01Var.h;
        if (hg6Var3 != null) {
            Iterator it4 = hg6Var3.d.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    ig6Var4 = 0;
                    break;
                } else {
                    ig6Var4 = it4.next();
                    if (jl40.l(((ig6) ig6Var4).a, str)) {
                        break;
                    }
                }
            }
            ig6Var = ig6Var4;
        } else {
            ig6Var = null;
        }
        if (ig6Var == null) {
            r6q0 r6q0Var = eh01Var.i;
            if (r6q0Var != null) {
                Iterator it5 = r6q0Var.b().iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        ig6Var3 = 0;
                        break;
                    } else {
                        ig6Var3 = it5.next();
                        if (jl40.l(((ig6) ig6Var3).a, str)) {
                            break;
                        }
                    }
                }
                ig6Var = ig6Var3;
            } else {
                ig6Var = null;
            }
            if (ig6Var == null) {
                if (cf6Var == null || (items = cf6Var.getItems()) == null) {
                    ig6Var = null;
                } else {
                    Iterator it6 = items.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            ig6Var2 = 0;
                            break;
                        } else {
                            ig6Var2 = it6.next();
                            if (((ig6) ig6Var2).h == null) {
                                break;
                            }
                        }
                    }
                    ig6Var = ig6Var2;
                }
            }
        }
        if (ig6Var == null) {
            List items3 = cf6Var != null ? cf6Var.getItems() : null;
            if (items3 == null) {
                items3 = EmptyList.a;
            }
            List list2 = items3;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it7 = list2.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        break;
                    } else if (((ig6) it7.next()).h == null) {
                        x4c.g("Couldn't find subject account", null, null, Collections.singletonList(orp0Var), 6);
                        break;
                    }
                }
            }
            o0();
            return;
        }
        String str5 = ig6Var.a;
        lfq0 h = zk01.h(ig6Var);
        if (h == null) {
            return;
        }
        ButtonTransferType buttonTransferType = eh01Var.q;
        qj01Var.getClass();
        int i5 = mj01.b[transferDirection.ordinal()];
        if (i5 == 1) {
            mfq0 mfq0Var = h instanceof mfq0 ? (mfq0) h : null;
            if (mfq0Var != null) {
                qj01Var.h(str3, mfq0Var);
            }
        } else {
            if (i5 != 2) {
                w511.b();
                return;
            }
            qj01Var.k(str3, h, buttonTransferType);
        }
        TransferDeeplink transferDeeplink = ig6Var.i;
        if (jl40.l(transferDeeplink, TransferDeeplink.Self.Transfer.INSTANCE)) {
            if (jl40.l(str5, str2)) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        obj5 = null;
                        break;
                    }
                    obj5 = it8.next();
                    ak1 ak1Var3 = (ak1) obj5;
                    if (!jl40.l(ak1Var3.a, str2) && ak1Var3.l == null) {
                        break;
                    }
                }
                ak1 ak1Var4 = (ak1) obj5;
                if (ak1Var4 == null) {
                    return;
                }
                Iterator it9 = ak1Var4.f.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        obj6 = null;
                        break;
                    } else {
                        obj6 = it9.next();
                        if (jl40.l(((eh01) obj6).f, eh01Var2 != null ? eh01Var2.f : null)) {
                            break;
                        }
                    }
                }
                eh01 eh01Var5 = (eh01) obj6;
                if (eh01Var5 == null) {
                    return;
                }
                mfq0 mfq0Var2 = h instanceof mfq0 ? (mfq0) h : null;
                if (mfq0Var2 == null) {
                    return;
                } else {
                    triple3 = new Triple(ak1Var4, eh01Var5, new vjq0(mfq0Var2, str5, eh01Var5));
                }
            } else {
                mfq0 mfq0Var3 = h instanceof mfq0 ? (mfq0) h : null;
                if (mfq0Var3 == null) {
                    return;
                } else {
                    triple3 = new Triple(null, null, new vjq0(mfq0Var3, str5, eh01Var));
                }
            }
        } else if (jl40.l(transferDeeplink, TransferDeeplink.Self.Topup.INSTANCE)) {
            if (jl40.l(str5, str2)) {
                Iterator it10 = list.iterator();
                while (true) {
                    if (!it10.hasNext()) {
                        obj3 = null;
                        break;
                    } else {
                        obj3 = it10.next();
                        if (!jl40.l(((ak1) obj3).a, str2)) {
                            break;
                        }
                    }
                }
                ak1 ak1Var5 = (ak1) obj3;
                if (ak1Var5 == null) {
                    return;
                }
                Iterator it11 = ak1Var5.f.iterator();
                while (true) {
                    if (!it11.hasNext()) {
                        obj4 = null;
                        break;
                    } else {
                        obj4 = it11.next();
                        if (jl40.l(((eh01) obj4).f, eh01Var2 != null ? eh01Var2.f : null)) {
                            break;
                        }
                    }
                }
                eh01 eh01Var6 = (eh01) obj4;
                if (eh01Var6 == null) {
                    return;
                }
                mfq0 mfq0Var4 = h instanceof mfq0 ? (mfq0) h : null;
                if (mfq0Var4 == null) {
                    return;
                } else {
                    triple3 = new Triple(ak1Var5, eh01Var6, new ujq0(mfq0Var4, str5, eh01Var6));
                }
            } else {
                mfq0 mfq0Var5 = h instanceof mfq0 ? (mfq0) h : null;
                if (mfq0Var5 == null) {
                    return;
                } else {
                    triple3 = new Triple(null, null, new ujq0(mfq0Var5, str5, eh01Var));
                }
            }
        } else if (jl40.l(transferDeeplink, TransferDeeplink.Me2MeTopup.INSTANCE)) {
            phq0 phq0Var = h instanceof phq0 ? (phq0) h : null;
            if (phq0Var == null) {
                return;
            } else {
                triple3 = new Triple(null, null, new jjq0(eh01Var, str5, phq0Var));
            }
        } else if (jl40.l(transferDeeplink, TransferDeeplink.AftTopup.INSTANCE)) {
            tfq0 tfq0Var = h instanceof tfq0 ? (tfq0) h : null;
            if (tfq0Var == null) {
                return;
            } else {
                triple3 = new Triple(null, null, new ajq0(eh01Var, str5, tfq0Var));
            }
        } else if (transferDeeplink instanceof TransferDeeplink.RawAction) {
            f0(((TransferDeeplink.RawAction) transferDeeplink).getAction());
            triple3 = new Triple(null, null, null);
        } else if (!jl40.l(transferDeeplink, TransferDeeplink.AllTargets.INSTANCE) && !jl40.l(transferDeeplink, TransferDeeplink.PhoneTransfer.INSTANCE) && !jl40.l(transferDeeplink, TransferDeeplink.CrossBorderTransfer.INSTANCE) && !jl40.l(transferDeeplink, TransferDeeplink.RequisitesTransfer.INSTANCE) && !(transferDeeplink instanceof TransferDeeplink.SelectTarget) && !jl40.l(transferDeeplink, TransferDeeplink.Self.ItemsSheet.INSTANCE) && !jl40.l(transferDeeplink, TransferDeeplink.Self.SectionsSheet.INSTANCE) && transferDeeplink != null) {
            w511.b();
            return;
        } else {
            x4c.g("Unexpected action in sheet item", null, transferDeeplink, Collections.singletonList(orp0Var), 2);
            triple3 = new Triple(null, null, null);
        }
        ak1 ak1Var6 = (ak1) triple3.getFirst();
        final eh01 eh01Var7 = (eh01) triple3.getSecond();
        final wjq0 wjq0Var3 = (wjq0) triple3.getThird();
        if (ak1Var6 != null) {
            ak1Var = ak1Var6;
        }
        pz40 Y2 = Y();
        do {
            r0Var2 = (r0) Y2;
            value2 = r0Var2.getValue();
            i2 = 1;
        } while (!r0Var2.k(value2, zk01.c((xk01) value2, new tls() { // from class: bl01
            @Override // defpackage.tls
            public final Object invoke(Object obj7) {
                int i52 = i2;
                eh01 eh01Var52 = eh01Var7;
                switch (i52) {
                    case 0:
                        wk01 wk01Var = (wk01) obj7;
                        r501 r501Var = r501.c;
                        ak1 ak1Var32 = ak1Var;
                        unq unqVar = ak1Var32.n;
                        if (eh01Var52 == null) {
                            xk1 xk1Var2 = ak1Var32.h;
                            eh01Var52 = xk1Var2 != null ? xk1Var2.b.b() : null;
                        }
                        return wk01.b(wk01Var, null, null, null, null, ak1Var32, null, wjq0Var3, unqVar, null, null, null, eh01Var52, r501Var, false, false, null, null, false, null, false, null, null, null, null, null, null, null, -99137, 15);
                    default:
                        wk01 wk01Var2 = (wk01) obj7;
                        r501 r501Var2 = r501.c;
                        ak1 ak1Var42 = ak1Var;
                        unq unqVar2 = ak1Var42.n;
                        if (eh01Var52 == null) {
                            eh01Var52 = wk01Var2.p;
                        }
                        return wk01.b(wk01Var2, null, null, null, null, ak1Var42, null, wjq0Var3, unqVar2, null, null, null, eh01Var52, r501Var2, false, false, null, null, false, null, false, null, null, null, null, null, null, null, -99137, 15);
                }
            }
        })));
        if (wjq0Var3 != null) {
            d0(this, false, false, 2);
        }
        o0();
        if (!z || ak1Var6 == null) {
            return;
        }
        Y0();
    }

    public final void q0(String str) {
        Object obj;
        String str2 = str;
        orp0 orp0Var = orp0.e;
        wk01 b = zk01.b((xk01) X());
        if (b == null) {
            x4c.g("onCircleButtonClicked null bottomSheetState", null, null, Collections.singletonList(orp0Var), 6);
            return;
        }
        ak1 ak1Var = b.g;
        String str3 = ak1Var.b;
        Iterator it = ak1Var.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (jl40.l(((eh01) obj).a, str2)) {
                    break;
                }
            }
        }
        eh01 eh01Var = (eh01) obj;
        if (eh01Var == null) {
            x4c.g("Couldn't identify button from buttonsList with this id", null, str2, Collections.singletonList(orp0Var), 2);
            return;
        }
        ButtonTransferType buttonTransferType = eh01Var.q;
        pz40 Y = Y();
        while (true) {
            r0 r0Var = (r0) Y;
            Object value = r0Var.getValue();
            if (r0Var.k(value, zk01.c((xk01) value, new al01(eh01Var, 0)))) {
                break;
            }
            b = b;
            orp0Var = orp0Var;
            str2 = str;
        }
        TransferDeeplink transferDeeplink = eh01Var.f;
        boolean l = jl40.l(transferDeeplink, TransferDeeplink.Self.Transfer.INSTANCE);
        qj01 qj01Var = this.V;
        if (l) {
            qj01Var.g(str3, buttonTransferType);
            ymq0 ymq0Var = eh01Var.j;
            vjq0 vjq0Var = ymq0Var != null ? new vjq0(new mfq0(ymq0Var.a, null, ymq0Var.b, ymq0Var.c, ymq0Var.d, com.ybsdk.feature.transfer.version2.api.mappers.a.j(ymq0Var.e)), null, eh01Var) : null;
            if (vjq0Var != null) {
                W0(vjq0Var);
                return;
            } else {
                x4c.g("Null selfTransferPayload for SelfTransfer", null, null, Collections.singletonList(orp0Var), 6);
                return;
            }
        }
        if (jl40.l(transferDeeplink, TransferDeeplink.Self.Topup.INSTANCE)) {
            qj01Var.j(str3, buttonTransferType);
            xmq0 xmq0Var = eh01Var.k;
            ujq0 ujq0Var = xmq0Var != null ? new ujq0(new mfq0(xmq0Var.a, xmq0Var.f, xmq0Var.b, xmq0Var.c, xmq0Var.d, com.ybsdk.feature.transfer.version2.api.mappers.a.j(xmq0Var.e)), null, eh01Var) : null;
            if (ujq0Var != null) {
                W0(ujq0Var);
                return;
            } else {
                x4c.g("Null selfTransferPayload for SelfTopup", null, null, Collections.singletonList(orp0Var), 6);
                return;
            }
        }
        if (jl40.l(transferDeeplink, TransferDeeplink.PhoneTransfer.INSTANCE)) {
            b1(this, b, str2, TransferScenario.PHONE, null, null, 120);
            return;
        }
        wk01 wk01Var = b;
        orp0 orp0Var2 = orp0Var;
        if (jl40.l(transferDeeplink, TransferDeeplink.CrossBorderTransfer.INSTANCE)) {
            em3 em3Var = qj01Var.a.q0;
            String str4 = qj01Var.b;
            String str5 = qj01Var.c;
            String str6 = qj01Var.d;
            LinkedHashMap w = g8e.w(3, "transfer_session_id", str4);
            if (str5 != null) {
                w.put("transfer_direction", str5);
            }
            if (str6 != null) {
                w.put("transfer_scenario", str6);
            }
            em3Var.a.a("transfer.cross_border.click", w);
            if (((qu01) this.F).e()) {
                R0();
                return;
            } else {
                b1(this, wk01Var, str, TransferScenario.CROSS_BORDER, null, null, 120);
                return;
            }
        }
        if (jl40.l(transferDeeplink, TransferDeeplink.RequisitesTransfer.INSTANCE)) {
            RequisitesPersonTransferPayloadEntity requisitesPersonTransferPayloadEntity = eh01Var.l;
            RequisitesLegalTransferPayloadEntity requisitesLegalTransferPayloadEntity = eh01Var.m;
            RequisitesHcsTransferPayloadEntity requisitesHcsTransferPayloadEntity = eh01Var.n;
            wjq0 wjq0Var = wk01Var.i;
            c1(requisitesPersonTransferPayloadEntity, requisitesLegalTransferPayloadEntity, requisitesHcsTransferPayloadEntity, wjq0Var instanceof sjq0 ? (sjq0) wjq0Var : null);
            return;
        }
        boolean l2 = jl40.l(transferDeeplink, TransferDeeplink.Self.ItemsSheet.INSTANCE);
        TransferDirection transferDirection = this.R;
        if (l2) {
            qj01Var.f(str3, transferDirection, buttonTransferType);
            hg6 hg6Var = eh01Var.h;
            Z0(hg6Var != null ? new af6(hg6Var) : null, buttonTransferType);
            return;
        }
        if (jl40.l(transferDeeplink, TransferDeeplink.Self.SectionsSheet.INSTANCE)) {
            qj01Var.f(str3, transferDirection, buttonTransferType);
            r6q0 r6q0Var = eh01Var.i;
            Z0(r6q0Var != null ? new bf6(r6q0Var) : null, buttonTransferType);
            return;
        }
        if (jl40.l(transferDeeplink, TransferDeeplink.Me2MeTopup.INSTANCE)) {
            qj01Var.j(str3, buttonTransferType);
            t910 t910Var = eh01Var.o;
            jjq0 jjq0Var = t910Var != null ? new jjq0(eh01Var, null, new phq0(t910Var.e, t910Var.a, t910Var.b, t910Var.c, com.ybsdk.feature.transfer.version2.api.mappers.a.j(t910Var.d), t910Var.f, null)) : null;
            if (jjq0Var != null) {
                W0(jjq0Var);
                return;
            } else {
                x4c.g("Null me2meTopupPayload for Me2MeTopup", null, null, Collections.singletonList(orp0Var2), 6);
                return;
            }
        }
        if (jl40.l(transferDeeplink, TransferDeeplink.AftTopup.INSTANCE)) {
            qj01Var.j(str3, buttonTransferType);
            yi1 yi1Var = eh01Var.p;
            ajq0 ajq0Var = yi1Var != null ? new ajq0(eh01Var, null, new tfq0(yi1Var.e, yi1Var.f, yi1Var.a, yi1Var.b, yi1Var.c, com.ybsdk.feature.transfer.version2.api.mappers.a.a(yi1Var.d))) : null;
            if (ajq0Var != null) {
                W0(ajq0Var);
                return;
            } else {
                x4c.g("Null aftTopupPayload for AftTopup", null, null, Collections.singletonList(orp0Var2), 6);
                return;
            }
        }
        if (transferDeeplink instanceof TransferDeeplink.RawAction) {
            f0(((TransferDeeplink.RawAction) transferDeeplink).getAction());
        } else {
            if (transferDeeplink == null || (transferDeeplink instanceof TransferDeeplink.SelectTarget) || transferDeeplink.equals(TransferDeeplink.AllTargets.INSTANCE)) {
                return;
            }
            w511.b();
        }
    }

    public final void r0() {
        String supportUrl;
        Object X = X();
        uk01 uk01Var = X instanceof uk01 ? (uk01) X : null;
        Object obj = uk01Var != null ? uk01Var.a : null;
        FailDataException failDataException = obj instanceof FailDataException ? (FailDataException) obj : null;
        if (failDataException == null || (supportUrl = failDataException.getSupportUrl()) == null) {
            return;
        }
        ((ou01) this.D).a(supportUrl);
    }

    public final void s0(String str) {
        r0 r0Var;
        Object value;
        wk01 b = zk01.b((xk01) X());
        if (b == null) {
            return;
        }
        String str2 = b.e;
        boolean z = (str == null || evu0.J(str)) && (str2 == null || evu0.J(str2));
        if (jl40.l(str2, str) || z) {
            return;
        }
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, zk01.c((xk01) value, new g8r0(str, 28))));
        d0(this, false, false, 3);
    }

    public final void t0() {
        qj01 qj01Var = this.V;
        AppAnalyticsReporter appAnalyticsReporter = qj01Var.a;
        int i = mj01.c[qj01Var.e.ordinal()];
        if (i != 1) {
            if (i == 2) {
                appAnalyticsReporter.L.a.a("payment.mobile_services.payment_to_pay_click", null);
            } else if (i == 3) {
                appAnalyticsReporter.E.a.a("payment.internet_tv.payment_to_pay_click", null);
            } else if (i == 4) {
                appAnalyticsReporter.B.a.a("payment.gov.payment_screen.pay_button.click", null);
            } else {
                if (i != 5) {
                    w511.b();
                    return;
                }
                hwo0 hwo0Var = qj01Var.f;
                if (hwo0Var != null) {
                    z94 z94Var = ((AppAnalyticsReporter) hwo0Var.c).n0;
                    TemplatePaymentTypeTransfers templatePaymentTypeTransfers = (TemplatePaymentTypeTransfers) hwo0Var.w;
                    String str = (String) hwo0Var.x;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = (String) hwo0Var.b;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(3);
                    linkedHashMap.put("type", templatePaymentTypeTransfers.getOriginalValue());
                    linkedHashMap.put("item_type", str);
                    linkedHashMap.put("scenario_hash", str2);
                    z94Var.a.a("template_transfer.to_pay_click", linkedHashMap);
                }
            }
        }
        e0(false);
    }

    public final void u0(String str) {
        f0(str);
    }

    public final void v0() {
        this.P = false;
        j0(false);
    }

    public final void w0(boolean z) {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, zk01.c((xk01) value, new dzw0(z, 3))));
    }

    public final boolean x0(Uri uri) {
        if (uri.toString().length() == 0) {
            o0();
        }
        return ((nu01) this.G).a.c(uri.toString()).a instanceof v0h;
    }

    public final void y0() {
        unq unqVar;
        wk01 b = zk01.b((xk01) X());
        if (b == null || (unqVar = b.j) == null) {
            return;
        }
        qj01 qj01Var = this.V;
        int i = mj01.c[qj01Var.e.ordinal()];
        if (i == 1) {
            em3 em3Var = qj01Var.a.q0;
            String str = unqVar.a;
            String str2 = qj01Var.b;
            String str3 = qj01Var.c;
            String str4 = qj01Var.d;
            LinkedHashMap t = x4e.t(4, "text", str, "transfer_session_id", str2);
            if (str3 != null) {
                t.put("transfer_direction", str3);
            }
            if (str4 != null) {
                t.put("transfer_scenario", str4);
            }
            em3Var.a.a("transfer.payment_amount_fee_info_click", t);
        } else if (i != 2 && i != 3 && i != 4 && i != 5) {
            w511.b();
            return;
        }
        String str5 = unqVar.b;
        if (str5 != null) {
            ((nu01) this.G).a(str5);
        }
    }

    public final void z0() {
        g0();
    }
}
