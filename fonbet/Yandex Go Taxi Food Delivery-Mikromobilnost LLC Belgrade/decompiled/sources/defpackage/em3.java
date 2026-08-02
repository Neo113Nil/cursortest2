package defpackage;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.a;
import com.ybsdk.core.analytics.generated.ResultCommon;
import com.ybsdk.core.analytics.generated.delegates.CommonEvents$BalanceRequestResultResult;
import com.ybsdk.core.analytics.generated.delegates.CommonEvents$FullscreenNotificationShownScreen;
import com.ybsdk.core.analytics.generated.delegates.DashboardEvents$DashboardLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.EducationEvents$EducationCloseCloseType;
import com.ybsdk.core.analytics.generated.delegates.EducationEvents$EducationErrorError;
import com.ybsdk.core.analytics.generated.delegates.ExternalNavigationTargetEvents$ExternalNavigationTargetDeeplinkFetchingResultResult;
import com.ybsdk.core.analytics.generated.delegates.KycEvents$KycOnlinePhotoUploadResultResult;
import com.ybsdk.core.analytics.generated.delegates.OffersListEvents$MerchantOffersLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.OffersListEvents$MerchantOffersSearchInitiatedLoadType;
import com.ybsdk.core.analytics.generated.delegates.OffersListEvents$MerchantOffersSearchLoadedLoadType;
import com.ybsdk.core.analytics.generated.delegates.OffersListEvents$MerchantOffersSearchLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.PublicApiEvents$PublicApiCompactHorizontalWidgetUpdateResultResult;
import com.ybsdk.core.analytics.generated.delegates.PublicApiEvents$PublicApiPaymentCheckRequestResultResult;
import com.ybsdk.core.analytics.generated.delegates.PublicApiEvents$PublicApiPaymentsMethodsUpdate2ResultResult;
import com.ybsdk.core.analytics.generated.delegates.PublicApiEvents$PublicApiPaymentsMethodsUpdateResultResult;
import com.ybsdk.core.analytics.generated.delegates.PublicApiEvents$PublicApiPlusShortcutWidgetDataResultResult;
import com.ybsdk.core.analytics.generated.delegates.SkeletonsEvents$SkeletonsLoadedStatus;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferBindCardResultResult;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferCrossBorderByPhoneBankCacheLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferCrossBorderByPhoneBankCacheSelectLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferCrossBorderByPhoneOtherBankLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferCrossBorderByPhoneOtherBankSelectLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferInitiatedPrerequisites;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferLoadedPrerequisites;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferPaymentResultChosenMethod;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferPaymentResultError;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferPaymentResultResult;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferPhoneAllowContactsInitiatedType;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferPhoneAllowContactsResultResult;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferPhoneBankCacheLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferPhoneBankCacheSelectLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferPhoneOtherBankLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferPhoneOtherBankSelectLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferScenarioCloseStatus;
import com.ybsdk.network.dto.CreateApplicationWithProductJsonAdapter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes8.dex */
public final class em3 {
    public final a a;

    public /* synthetic */ em3(a aVar) {
        this.a = aVar;
    }

    public static void A(em3 em3Var, Integer num, String str, String str2, boolean z, String str3, String str4, String str5, String str6, TransferEvents$TransferLoadedPrerequisites transferEvents$TransferLoadedPrerequisites, String str7, String str8, String str9, ResultCommon resultCommon, String str10, int i) {
        String str11 = (i & 2) != 0 ? null : str;
        String str12 = (i & 4) != 0 ? null : str2;
        TransferEvents$TransferLoadedPrerequisites transferEvents$TransferLoadedPrerequisites2 = (i & 512) != 0 ? null : transferEvents$TransferLoadedPrerequisites;
        String str13 = (i & 4096) == 0 ? str9 : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap(15);
        linkedHashMap.put("duration_ms", num);
        if (str11 != null) {
            linkedHashMap.put("sending_account", str11);
        }
        if (str12 != null) {
            linkedHashMap.put("receiving_account", str12);
        }
        linkedHashMap.put("receiving_phone", Boolean.valueOf(z));
        if (str3 != null) {
            byte[] bArr = y5e.m;
            byte[] bArr2 = new byte[17];
            for (int i2 = 0; i2 < 17; i2++) {
                bArr2[i2] = (byte) (bArr[i2] ^ y5e.c[i2 % 8]);
            }
            linkedHashMap.put(new String(bArr2, uza.a), str3);
        }
        linkedHashMap.put("sending_accounts_list", str4);
        linkedHashMap.put("receiving_accounts_list", str5);
        linkedHashMap.put("transfer_session_id", str6);
        if (transferEvents$TransferLoadedPrerequisites2 != null) {
            linkedHashMap.put("prerequisites", transferEvents$TransferLoadedPrerequisites2.getOriginalValue());
        }
        if (str7 != null) {
            linkedHashMap.put("transfer_direction", str7);
        }
        if (str8 != null) {
            linkedHashMap.put("transfer_scenario", str8);
        }
        if (str13 != null) {
            linkedHashMap.put(CreateApplicationWithProductJsonAdapter.productKey, str13);
        }
        if (resultCommon != null) {
            linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, resultCommon.getOriginalValue());
        }
        if (str10 != null) {
            linkedHashMap.put("error", str10);
        }
        em3Var.a.a("transfer.loaded", linkedHashMap);
    }

    public static void b(em3 em3Var, String str, String str2, String str3, DashboardEvents$DashboardLoadedResult dashboardEvents$DashboardLoadedResult, String str4, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(5);
        if (str != null) {
            linkedHashMap.put("member_id", str);
        }
        linkedHashMap.put("product_id", str2);
        if (str3 != null) {
            linkedHashMap.put("product_type", str3);
        }
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, dashboardEvents$DashboardLoadedResult.getOriginalValue());
        if (str4 != null) {
            linkedHashMap.put("error", str4);
        }
        em3Var.a.a("dashboard.loaded", linkedHashMap);
    }

    public static void e(em3 em3Var, String str, String str2, String str3, ExternalNavigationTargetEvents$ExternalNavigationTargetDeeplinkFetchingResultResult externalNavigationTargetEvents$ExternalNavigationTargetDeeplinkFetchingResultResult, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        if (str2 != null) {
            linkedHashMap.put("initial_deeplink", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("result_deeplink", str3);
        }
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, externalNavigationTargetEvents$ExternalNavigationTargetDeeplinkFetchingResultResult.getOriginalValue());
        em3Var.a.a("external_navigation_target.deeplink_fetching.result", linkedHashMap);
    }

    public static void n(em3 em3Var, PublicApiEvents$PublicApiCompactHorizontalWidgetUpdateResultResult publicApiEvents$PublicApiCompactHorizontalWidgetUpdateResultResult) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, publicApiEvents$PublicApiCompactHorizontalWidgetUpdateResultResult.getOriginalValue());
        em3Var.a.a("public_api.compact_horizontal_widget_update.result", linkedHashMap);
    }

    public static void o(em3 em3Var, PublicApiEvents$PublicApiPaymentCheckRequestResultResult publicApiEvents$PublicApiPaymentCheckRequestResultResult) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, publicApiEvents$PublicApiPaymentCheckRequestResultResult.getOriginalValue());
        em3Var.a.a("public_api.payment_check_request.result", linkedHashMap);
    }

    public static void p(em3 em3Var, PublicApiEvents$PublicApiPaymentsMethodsUpdate2ResultResult publicApiEvents$PublicApiPaymentsMethodsUpdate2ResultResult, Integer num, Integer num2, Boolean bool, Boolean bool2, int i) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 16) != 0) {
            bool = null;
        }
        if ((i & 32) != 0) {
            bool2 = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(6);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, publicApiEvents$PublicApiPaymentsMethodsUpdate2ResultResult.getOriginalValue());
        if (num != null) {
            linkedHashMap.put("paymentMethodsCount", num);
        }
        if (num2 != null) {
            linkedHashMap.put("promosCount", num2);
        }
        if (bool != null) {
            linkedHashMap.put("has_split_info", bool);
        }
        if (bool2 != null) {
            linkedHashMap.put("has_saver_info", bool2);
        }
        em3Var.a.a("public_api.payments_methods_update2.result", linkedHashMap);
    }

    public static void q(em3 em3Var, PublicApiEvents$PublicApiPaymentsMethodsUpdateResultResult publicApiEvents$PublicApiPaymentsMethodsUpdateResultResult) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, publicApiEvents$PublicApiPaymentsMethodsUpdateResultResult.getOriginalValue());
        em3Var.a.a("public_api.payments_methods_update.result", linkedHashMap);
    }

    public static void r(em3 em3Var, PublicApiEvents$PublicApiPlusShortcutWidgetDataResultResult publicApiEvents$PublicApiPlusShortcutWidgetDataResultResult, Boolean bool, String str, int i) {
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, publicApiEvents$PublicApiPlusShortcutWidgetDataResultResult.getOriginalValue());
        if (bool != null) {
            linkedHashMap.put("data_changed", bool);
        }
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        em3Var.a.a("public_api.plus_shortcut_widget_data.result", linkedHashMap);
    }

    public static void z(em3 em3Var, String str, String str2, boolean z, String str3, String str4, String str5, String str6, TransferEvents$TransferInitiatedPrerequisites transferEvents$TransferInitiatedPrerequisites, int i) {
        if ((i & 256) != 0) {
            transferEvents$TransferInitiatedPrerequisites = null;
        }
        em3Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(9);
        if (str != null) {
            linkedHashMap.put("sending_account", str);
        }
        if (str2 != null) {
            linkedHashMap.put("receiving_account", str2);
        }
        linkedHashMap.put("receiving_phone", Boolean.valueOf(z));
        if (str3 != null) {
            byte[] bArr = y5e.m;
            byte[] bArr2 = new byte[17];
            for (int i2 = 0; i2 < 17; i2++) {
                bArr2[i2] = (byte) (bArr[i2] ^ y5e.c[i2 % 8]);
            }
            linkedHashMap.put(new String(bArr2, uza.a), str3);
        }
        linkedHashMap.put("transfer_session_id", str4);
        if (str5 != null) {
            linkedHashMap.put("transfer_direction", str5);
        }
        if (str6 != null) {
            linkedHashMap.put("transfer_scenario", str6);
        }
        if (transferEvents$TransferInitiatedPrerequisites != null) {
            linkedHashMap.put("prerequisites", transferEvents$TransferInitiatedPrerequisites.getOriginalValue());
        }
        em3Var.a.a("transfer.initiated", linkedHashMap);
    }

    public void B(TransferEvents$TransferPaymentResultError transferEvents$TransferPaymentResultError, String str, String str2, String str3, String str4, TransferEvents$TransferPaymentResultChosenMethod transferEvents$TransferPaymentResultChosenMethod, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, TransferEvents$TransferPaymentResultResult transferEvents$TransferPaymentResultResult, String str14, String str15) {
        byte[] bArr = y5e.c;
        LinkedHashMap linkedHashMap = new LinkedHashMap(18);
        if (transferEvents$TransferPaymentResultError != null) {
            linkedHashMap.put("error", transferEvents$TransferPaymentResultError.getOriginalValue());
        }
        if (str != null) {
            linkedHashMap.put("sending_account", str);
        }
        if (str2 != null) {
            linkedHashMap.put("receiving_account", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("receiving_phone", str3);
        }
        if (str4 != null) {
            byte[] bArr2 = y5e.m;
            byte[] bArr3 = new byte[17];
            for (int i = 0; i < 17; i++) {
                bArr3[i] = (byte) (bArr2[i] ^ bArr[i % 8]);
            }
            linkedHashMap.put(new String(bArr3, uza.a), str4);
        }
        if (transferEvents$TransferPaymentResultChosenMethod != null) {
            linkedHashMap.put("chosen_method", transferEvents$TransferPaymentResultChosenMethod.getOriginalValue());
        }
        if (str5 != null) {
            linkedHashMap.put("sending_amount", str5);
        }
        if (str6 != null) {
            linkedHashMap.put("receiving_amount", str6);
        }
        if (str7 != null) {
            linkedHashMap.put("currency_code", str7);
        }
        if (str8 != null) {
            linkedHashMap.put("exchange_rate", str8);
        }
        if (str9 != null) {
            byte[] bArr4 = y5e.V;
            byte[] bArr5 = new byte[15];
            for (int i2 = 0; i2 < 15; i2++) {
                bArr5[i2] = (byte) (bArr4[i2] ^ bArr[i2 % 8]);
            }
            linkedHashMap.put(new String(bArr5, uza.a), str9);
        }
        if (str10 != null) {
            linkedHashMap.put("sending_card_id", str10);
        }
        linkedHashMap.put("transfer_session_id", str11);
        if (str12 != null) {
            linkedHashMap.put("transfer_direction", str12);
        }
        if (str13 != null) {
            linkedHashMap.put("transfer_scenario", str13);
        }
        if (transferEvents$TransferPaymentResultResult != null) {
            linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, transferEvents$TransferPaymentResultResult.getOriginalValue());
        }
        if (str14 != null) {
            linkedHashMap.put(CreateApplicationWithProductJsonAdapter.productKey, str14);
        }
        if (str15 != null) {
            linkedHashMap.put("transfer_id", str15);
        }
        this.a.a("transfer.payment.result", linkedHashMap);
    }

    public void C(TransferEvents$TransferPhoneAllowContactsInitiatedType transferEvents$TransferPhoneAllowContactsInitiatedType, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put("type", transferEvents$TransferPhoneAllowContactsInitiatedType.getOriginalValue());
        linkedHashMap.put("transfer_session_id", str);
        this.a.a("transfer.phone.allow_contacts.initiated", linkedHashMap);
    }

    public void D(TransferEvents$TransferPhoneAllowContactsResultResult transferEvents$TransferPhoneAllowContactsResultResult, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, transferEvents$TransferPhoneAllowContactsResultResult.getOriginalValue());
        linkedHashMap.put("transfer_session_id", str);
        this.a.a("transfer.phone.allow_contacts.result", linkedHashMap);
    }

    public void E(TransferEvents$TransferPhoneBankCacheLoadedResult transferEvents$TransferPhoneBankCacheLoadedResult, String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, transferEvents$TransferPhoneBankCacheLoadedResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        linkedHashMap.put(y5e.o(y5e.n), str2);
        linkedHashMap.put("transfer_session_id", str3);
        this.a.a(y5e.o(y5e.Y), linkedHashMap);
    }

    public void F(TransferEvents$TransferPhoneBankCacheSelectLoadedResult transferEvents$TransferPhoneBankCacheSelectLoadedResult, String str, Boolean bool, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, transferEvents$TransferPhoneBankCacheSelectLoadedResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        if (bool != null) {
            linkedHashMap.put("receiver_found", bool);
        }
        linkedHashMap.put("transfer_session_id", str2);
        byte[] bArr = y5e.T;
        byte[] bArr2 = new byte[39];
        for (int i = 0; i < 39; i++) {
            bArr2[i] = (byte) (bArr[i] ^ y5e.c[i % 8]);
        }
        this.a.a(new String(bArr2, uza.a), linkedHashMap);
    }

    public void G(TransferEvents$TransferPhoneOtherBankLoadedResult transferEvents$TransferPhoneOtherBankLoadedResult, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, transferEvents$TransferPhoneOtherBankLoadedResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        linkedHashMap.put("transfer_session_id", str2);
        byte[] bArr = y5e.A;
        byte[] bArr2 = new byte[32];
        for (int i = 0; i < 32; i++) {
            bArr2[i] = (byte) (bArr[i] ^ y5e.c[i % 8]);
        }
        this.a.a(new String(bArr2, uza.a), linkedHashMap);
    }

    public void H(TransferEvents$TransferPhoneOtherBankSelectLoadedResult transferEvents$TransferPhoneOtherBankSelectLoadedResult, String str, Boolean bool, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, transferEvents$TransferPhoneOtherBankSelectLoadedResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        linkedHashMap.put("receiver_found", bool);
        linkedHashMap.put("transfer_session_id", str2);
        byte[] bArr = y5e.H;
        byte[] bArr2 = new byte[39];
        for (int i = 0; i < 39; i++) {
            bArr2[i] = (byte) (bArr[i] ^ y5e.c[i % 8]);
        }
        this.a.a(new String(bArr2, uza.a), linkedHashMap);
    }

    public void I(TransferEvents$TransferScenarioCloseStatus transferEvents$TransferScenarioCloseStatus, String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
        linkedHashMap.put(ACSPConstants.STATUS, transferEvents$TransferScenarioCloseStatus.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("transfer_session_id", str);
        }
        if (str2 != null) {
            linkedHashMap.put("transfer_direction", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("transfer_scenario", str3);
        }
        this.a.a("transfer.scenario_close", linkedHashMap);
    }

    public void a(CommonEvents$BalanceRequestResultResult commonEvents$BalanceRequestResultResult, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, commonEvents$BalanceRequestResultResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        this.a.a("balance_request.result", linkedHashMap);
    }

    public void c(String str, int i, int i2, EducationEvents$EducationCloseCloseType educationEvents$EducationCloseCloseType) {
        LinkedHashMap w = g8e.w(4, "education_id", str);
        w.put("slides_cnt", Integer.valueOf(i));
        w.put("current_slide", Integer.valueOf(i2));
        w.put("close_type", educationEvents$EducationCloseCloseType.getOriginalValue());
        this.a.a("education.close", w);
    }

    public void d(String str, int i, int i2, EducationEvents$EducationErrorError educationEvents$EducationErrorError) {
        LinkedHashMap w = g8e.w(4, "education_id", str);
        w.put("slides_cnt", Integer.valueOf(i));
        w.put("current_slide", Integer.valueOf(i2));
        w.put("error", educationEvents$EducationErrorError.getOriginalValue());
        this.a.a("education.error", w);
    }

    public void f(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        if (str != null) {
            linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, str);
        }
        this.a.a("first_run_landing.close", linkedHashMap);
    }

    public void g(String str) {
        this.a.a("first_run_landing.open", g8e.w(1, "url", str));
    }

    public void h(CommonEvents$FullscreenNotificationShownScreen commonEvents$FullscreenNotificationShownScreen, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(8);
        linkedHashMap.put(MetaDataField.SCREEN_FIELD, commonEvents$FullscreenNotificationShownScreen.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("fullscreen_name", str);
        }
        if (str2 != null) {
            linkedHashMap.put("action", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("screen_open", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("target", str4);
        }
        if (str5 != null) {
            linkedHashMap.put("show_close_button", str5);
        }
        if (str6 != null) {
            linkedHashMap.put("screen_path", str6);
        }
        if (bool != null) {
            linkedHashMap.put("drop_sessions_without_fullscreens_on_show", bool);
        }
        this.a.a("fullscreen_notification.shown", linkedHashMap);
    }

    public void i(int i, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put("file_size", Integer.valueOf(i));
        linkedHashMap.put("photo_type", str);
        this.a.a("kyc_online.photo.upload.initiated", linkedHashMap);
    }

    public void j(KycEvents$KycOnlinePhotoUploadResultResult kycEvents$KycOnlinePhotoUploadResultResult, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, kycEvents$KycOnlinePhotoUploadResultResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        this.a.a("kyc_online.photo.upload.result", linkedHashMap);
    }

    public void k(OffersListEvents$MerchantOffersLoadedResult offersListEvents$MerchantOffersLoadedResult, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, offersListEvents$MerchantOffersLoadedResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        this.a.a("merchant_offers.loaded", linkedHashMap);
    }

    public void l(OffersListEvents$MerchantOffersSearchInitiatedLoadType offersListEvents$MerchantOffersSearchInitiatedLoadType) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put("load_type", offersListEvents$MerchantOffersSearchInitiatedLoadType.getOriginalValue());
        this.a.a("merchant_offers.search.initiated", linkedHashMap);
    }

    public void m(OffersListEvents$MerchantOffersSearchLoadedResult offersListEvents$MerchantOffersSearchLoadedResult, String str, OffersListEvents$MerchantOffersSearchLoadedLoadType offersListEvents$MerchantOffersSearchLoadedLoadType) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, offersListEvents$MerchantOffersSearchLoadedResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        linkedHashMap.put("load_type", offersListEvents$MerchantOffersSearchLoadedLoadType.getOriginalValue());
        this.a.a("merchant_offers.search.loaded", linkedHashMap);
    }

    public void s(SkeletonsEvents$SkeletonsLoadedStatus skeletonsEvents$SkeletonsLoadedStatus, ArrayList arrayList, List list, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
        linkedHashMap.put(ACSPConstants.STATUS, skeletonsEvents$SkeletonsLoadedStatus.getOriginalValue());
        if (arrayList != null) {
            linkedHashMap.put("skeletons_to_update", arrayList);
        }
        if (list != null) {
            linkedHashMap.put("skeletons_to_delete", list);
        }
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        this.a.a("skeletons.loaded", linkedHashMap);
    }

    public void t(String str, String str2, String str3, String str4, String str5, boolean z) {
        LinkedHashMap w = g8e.w(6, "value", str);
        w.put("uidIsNull", Boolean.valueOf(z));
        w.put("StartSessionCallSource", str2);
        if (str3 != null) {
            w.put("actionReason", str3);
        }
        if (str4 != null) {
            w.put("origin_deeplink", str4);
        }
        if (str5 != null) {
            w.put("error", str5);
        }
        this.a.a("start_session.call_result", w);
    }

    public void u(TransferEvents$TransferBindCardResultResult transferEvents$TransferBindCardResultResult, String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, transferEvents$TransferBindCardResultResult.getOriginalValue());
        linkedHashMap.put("transfer_session_id", str);
        if (str2 != null) {
            linkedHashMap.put("transfer_direction", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("transfer_scenario", str3);
        }
        this.a.a("transfer.bind_card.result", linkedHashMap);
    }

    public void v(TransferEvents$TransferCrossBorderByPhoneBankCacheLoadedResult transferEvents$TransferCrossBorderByPhoneBankCacheLoadedResult, String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, transferEvents$TransferCrossBorderByPhoneBankCacheLoadedResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        linkedHashMap.put(y5e.o(y5e.n), str2);
        linkedHashMap.put("transfer_session_id", str3);
        this.a.a(y5e.o(y5e.S), linkedHashMap);
    }

    public void w(TransferEvents$TransferCrossBorderByPhoneBankCacheSelectLoadedResult transferEvents$TransferCrossBorderByPhoneBankCacheSelectLoadedResult, String str, Boolean bool, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, transferEvents$TransferCrossBorderByPhoneBankCacheSelectLoadedResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        if (bool != null) {
            linkedHashMap.put("receiver_found", bool);
        }
        linkedHashMap.put("transfer_session_id", str2);
        byte[] bArr = y5e.s;
        byte[] bArr2 = new byte[55];
        for (int i = 0; i < 55; i++) {
            bArr2[i] = (byte) (bArr[i] ^ y5e.c[i % 8]);
        }
        this.a.a(new String(bArr2, uza.a), linkedHashMap);
    }

    public void x(TransferEvents$TransferCrossBorderByPhoneOtherBankLoadedResult transferEvents$TransferCrossBorderByPhoneOtherBankLoadedResult, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, transferEvents$TransferCrossBorderByPhoneOtherBankLoadedResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        linkedHashMap.put("transfer_session_id", str2);
        byte[] bArr = y5e.q;
        byte[] bArr2 = new byte[48];
        for (int i = 0; i < 48; i++) {
            bArr2[i] = (byte) (bArr[i] ^ y5e.c[i % 8]);
        }
        this.a.a(new String(bArr2, uza.a), linkedHashMap);
    }

    public void y(TransferEvents$TransferCrossBorderByPhoneOtherBankSelectLoadedResult transferEvents$TransferCrossBorderByPhoneOtherBankSelectLoadedResult, String str, Boolean bool, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, transferEvents$TransferCrossBorderByPhoneOtherBankSelectLoadedResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        linkedHashMap.put("receiver_found", bool);
        linkedHashMap.put("transfer_session_id", str2);
        byte[] bArr = y5e.g;
        byte[] bArr2 = new byte[55];
        for (int i = 0; i < 55; i++) {
            bArr2[i] = (byte) (bArr[i] ^ y5e.c[i % 8]);
        }
        this.a.a(new String(bArr2, uza.a), linkedHashMap);
    }
}
