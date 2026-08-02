package com.ybsdk.core.utils.poller;

import defpackage.k4o;
import defpackage.qje;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b=\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?¨\u0006@"}, d2 = {"Lcom/ybsdk/core/utils/poller/PollerEndpoint;", "", "urlPath", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getUrlPath", "()Ljava/lang/String;", "APPLICATION_STATUS_V1", "APPLICATION_STATUS_REGISTRATION_V2", "APPLICATION_STATUS_PRODUCT", "APPLICATION_STATUS_CLAIM_CARD", "APPLICATION_STATUS_CHANGE_PHONE", "APPLICATION_STATUS_CARD_REISSUE", "CARD_WIDGET_INFO", "KYC_APPLICATION_INFO", "DOCUMENTS_VERIFY", "AUTOTOPUP_PAYMENT_LAST", "AUTOTOPUP_REQUEST_STATUS_V1", "AUTOTOPUP_REQUEST_STATUS_V2", "AUTOTOPUP_PAYMENT_TEST_STATUS", "AUTOPAYMENTS_PAYMENT_TEST_STATUS", "EXTERNAL_YB_PAYMENTS_REQUEST_STATUS", "CREDIT_TRANSACTION_STATUS", "SPLIT_DEPOSIT_TRANSACTION_STATUS", "CARD_SET_PERIOD_LIMITS", "CREDIT_DEPOSIT_TRANSACTION_STATUS", "MKK_DEPOSIT_TRANSACTION_STATUS", "BOOST_DEPOSIT_TRANSACTION_STATUS", "REPORT_GET", "SPLIT_CONTRACT_DRAFT_STATUS", "TRANSFERS_C2B_GET_PAYMENT_INFO_V1", "TRANSFERS_C2B_GET_PAYMENT_INFO_V2", "TRANSFERS_C2B_PAYMENT_GET_RESULT_V1", "TRANSFERS_C2B_PAYMENT_GET_RESULT_V2", "LIMIT_AGREEMENT_CARD_BIND_STATUS", "SAVINGS_ACCOUNT_REQUEST_STATUS", "SAVINGS_ACCOUNT_LIST_V3", "SAVINGS_ACCOUNT_LIST_V4", "TRANSFERS_PHONE_CHECK_USER_YB", "TRANSFERS_TIPS_PHONE_CHECK_USER_YB", "YB_CHECK_FASTER", "TRANSFERS_TRANSFER_SIMPLIFIED_CONFIRM", "TRANSFERS_TRANSFER_GET_RESULT", "TRANSFERS_GET_RESULT", "TRANSFERS_TIPS_GET_RESULT", "TRANSFERS_MKK_CASHOUT_GET_RESULT", "TRANSFERS_ME2ME_DEBIT_GET_RESULT", "PAYMENT_METHODS_GET_LIST", "TRANSFERS_BUDGET_SEARCH_BY_UIN_STATUS", "CREDIT_LIMIT_DEFAULT_PAYMENT_METHOD_SET_STATUS", "DEFAULT_PAYMENT_METHOD_UNIFIED_SET_STATUS", "WALLET_GET_WALLETS_INFO", "INSTANCES_REGISTER_STATUS", "NFC_SYNC_WITH_TOKENS", "FUND_REQUEST_STATUS", "FUND_OPERATION_STATUS", "FUND_DOCS_NOTICE", "DIV_DOWNLOADER", "REPLENISH", "CBDC_TLS_CERT_STATUS", "CBDC_SKPEP_CERT_STATUS", "CBDC_REGISTER_STATUS", "CBDC_WALLET_TOPUP_STATUS", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PollerEndpoint {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PollerEndpoint[] $VALUES;
    private final String urlPath;
    public static final PollerEndpoint APPLICATION_STATUS_V1 = new PollerEndpoint("APPLICATION_STATUS_V1", 0, "v1/applications/v1/get_application_status");
    public static final PollerEndpoint APPLICATION_STATUS_REGISTRATION_V2 = new PollerEndpoint("APPLICATION_STATUS_REGISTRATION_V2", 1, "v1/applications/v2/registration/get_application_status");
    public static final PollerEndpoint APPLICATION_STATUS_PRODUCT = new PollerEndpoint("APPLICATION_STATUS_PRODUCT", 2, "v1/applications/v1/product/get_application_status");
    public static final PollerEndpoint APPLICATION_STATUS_CLAIM_CARD = new PollerEndpoint("APPLICATION_STATUS_CLAIM_CARD", 3, "v1/applications/v1/claim_card/get_application_status");
    public static final PollerEndpoint APPLICATION_STATUS_CHANGE_PHONE = new PollerEndpoint("APPLICATION_STATUS_CHANGE_PHONE", 4, "v1/applications/v1/change_phone/get_application_status");
    public static final PollerEndpoint APPLICATION_STATUS_CARD_REISSUE = new PollerEndpoint("APPLICATION_STATUS_CARD_REISSUE", 5, "v1/applications/v1/card_reissue/get_application_status");
    public static final PollerEndpoint CARD_WIDGET_INFO = new PollerEndpoint("CARD_WIDGET_INFO", 6, "v1/cards/get_card_widget_info");
    public static final PollerEndpoint KYC_APPLICATION_INFO = new PollerEndpoint("KYC_APPLICATION_INFO", 7, "v1/applications/kyc/online/get_application_info");
    public static final PollerEndpoint DOCUMENTS_VERIFY = new PollerEndpoint("DOCUMENTS_VERIFY", 8, "v1/applications/documents/verify/check");
    public static final PollerEndpoint AUTOTOPUP_PAYMENT_LAST = new PollerEndpoint("AUTOTOPUP_PAYMENT_LAST", 9, "v1/autotopup/payment/last");
    public static final PollerEndpoint AUTOTOPUP_REQUEST_STATUS_V1 = new PollerEndpoint("AUTOTOPUP_REQUEST_STATUS_V1", 10, "v1/autotopup/request/status");
    public static final PollerEndpoint AUTOTOPUP_REQUEST_STATUS_V2 = new PollerEndpoint("AUTOTOPUP_REQUEST_STATUS_V2", 11, "v2/autotopup/request/status");
    public static final PollerEndpoint AUTOTOPUP_PAYMENT_TEST_STATUS = new PollerEndpoint("AUTOTOPUP_PAYMENT_TEST_STATUS", 12, "v1/autotopup/payment/test/status");
    public static final PollerEndpoint AUTOPAYMENTS_PAYMENT_TEST_STATUS = new PollerEndpoint("AUTOPAYMENTS_PAYMENT_TEST_STATUS", 13, "v1/autopayments/payment/test/status");
    public static final PollerEndpoint EXTERNAL_YB_PAYMENTS_REQUEST_STATUS = new PollerEndpoint("EXTERNAL_YB_PAYMENTS_REQUEST_STATUS", 14, qje.h(qje.q));
    public static final PollerEndpoint CREDIT_TRANSACTION_STATUS = new PollerEndpoint("CREDIT_TRANSACTION_STATUS", 15, "v1/credit_limit_deposit/transaction/status");
    public static final PollerEndpoint SPLIT_DEPOSIT_TRANSACTION_STATUS = new PollerEndpoint("SPLIT_DEPOSIT_TRANSACTION_STATUS", 16, "v1/split_deposit/transaction/status");
    public static final PollerEndpoint CARD_SET_PERIOD_LIMITS = new PollerEndpoint("CARD_SET_PERIOD_LIMITS", 17, "v1/card/v1/settings/set_period_limits");
    public static final PollerEndpoint CREDIT_DEPOSIT_TRANSACTION_STATUS = new PollerEndpoint("CREDIT_DEPOSIT_TRANSACTION_STATUS", 18, "v1/credit_deposit/transaction/status");
    public static final PollerEndpoint MKK_DEPOSIT_TRANSACTION_STATUS = new PollerEndpoint("MKK_DEPOSIT_TRANSACTION_STATUS", 19, "v1/mkk/transaction/status");
    public static final PollerEndpoint BOOST_DEPOSIT_TRANSACTION_STATUS = new PollerEndpoint("BOOST_DEPOSIT_TRANSACTION_STATUS", 20, "v1/boost_deposit/transaction/status");
    public static final PollerEndpoint REPORT_GET = new PollerEndpoint("REPORT_GET", 21, "v1/report/get");
    public static final PollerEndpoint SPLIT_CONTRACT_DRAFT_STATUS = new PollerEndpoint("SPLIT_CONTRACT_DRAFT_STATUS", 22, "v1/split-contract-draft/status");
    public static final PollerEndpoint TRANSFERS_C2B_GET_PAYMENT_INFO_V1 = new PollerEndpoint("TRANSFERS_C2B_GET_PAYMENT_INFO_V1", 23, "v1/transfers/v3/c2b/get_payment_info");
    public static final PollerEndpoint TRANSFERS_C2B_GET_PAYMENT_INFO_V2 = new PollerEndpoint("TRANSFERS_C2B_GET_PAYMENT_INFO_V2", 24, "v2/c2b/get_payment_info");
    public static final PollerEndpoint TRANSFERS_C2B_PAYMENT_GET_RESULT_V1 = new PollerEndpoint("TRANSFERS_C2B_PAYMENT_GET_RESULT_V1", 25, "v1/transfers/v3/c2b/payment/get_result");
    public static final PollerEndpoint TRANSFERS_C2B_PAYMENT_GET_RESULT_V2 = new PollerEndpoint("TRANSFERS_C2B_PAYMENT_GET_RESULT_V2", 26, "v2/c2b/payment/get_result");
    public static final PollerEndpoint LIMIT_AGREEMENT_CARD_BIND_STATUS = new PollerEndpoint("LIMIT_AGREEMENT_CARD_BIND_STATUS", 27, "v1/limit/agreement/card/bind/get-status");
    public static final PollerEndpoint SAVINGS_ACCOUNT_REQUEST_STATUS = new PollerEndpoint("SAVINGS_ACCOUNT_REQUEST_STATUS", 28, "v1/savings-account/request/status");
    public static final PollerEndpoint SAVINGS_ACCOUNT_LIST_V3 = new PollerEndpoint("SAVINGS_ACCOUNT_LIST_V3", 29, "v3/savings-account/list");
    public static final PollerEndpoint SAVINGS_ACCOUNT_LIST_V4 = new PollerEndpoint("SAVINGS_ACCOUNT_LIST_V4", 30, "v4/savings-account/list");
    public static final PollerEndpoint TRANSFERS_PHONE_CHECK_USER_YB = new PollerEndpoint("TRANSFERS_PHONE_CHECK_USER_YB", 31, qje.h(qje.o));
    public static final PollerEndpoint TRANSFERS_TIPS_PHONE_CHECK_USER_YB = new PollerEndpoint("TRANSFERS_TIPS_PHONE_CHECK_USER_YB", 32, qje.h(qje.c));
    public static final PollerEndpoint YB_CHECK_FASTER = new PollerEndpoint("YB_CHECK_FASTER", 33, "v1/transfers/v2/faster");
    public static final PollerEndpoint TRANSFERS_TRANSFER_SIMPLIFIED_CONFIRM = new PollerEndpoint("TRANSFERS_TRANSFER_SIMPLIFIED_CONFIRM", 34, "v1/transfers/v1/transfer/simplified_confirm");
    public static final PollerEndpoint TRANSFERS_TRANSFER_GET_RESULT = new PollerEndpoint("TRANSFERS_TRANSFER_GET_RESULT", 35, "v1/transfers/v1/transfer/get_result");
    public static final PollerEndpoint TRANSFERS_GET_RESULT = new PollerEndpoint("TRANSFERS_GET_RESULT", 36, "v1/transfers/v1/get_result");
    public static final PollerEndpoint TRANSFERS_TIPS_GET_RESULT = new PollerEndpoint("TRANSFERS_TIPS_GET_RESULT", 37, "v1/transfers/v1/tips/get_result");
    public static final PollerEndpoint TRANSFERS_MKK_CASHOUT_GET_RESULT = new PollerEndpoint("TRANSFERS_MKK_CASHOUT_GET_RESULT", 38, "v1/transfers/v1/mkk_cashout/get_result");
    public static final PollerEndpoint TRANSFERS_ME2ME_DEBIT_GET_RESULT = new PollerEndpoint("TRANSFERS_ME2ME_DEBIT_GET_RESULT", 39, "v1/transfers/v1/me2me_debit/get_result");
    public static final PollerEndpoint PAYMENT_METHODS_GET_LIST = new PollerEndpoint("PAYMENT_METHODS_GET_LIST", 40, "v1/payment-methods/v1/get-list");
    public static final PollerEndpoint TRANSFERS_BUDGET_SEARCH_BY_UIN_STATUS = new PollerEndpoint("TRANSFERS_BUDGET_SEARCH_BY_UIN_STATUS", 41, "v1/transfers/budget/search_by_uin/get_status");
    public static final PollerEndpoint CREDIT_LIMIT_DEFAULT_PAYMENT_METHOD_SET_STATUS = new PollerEndpoint("CREDIT_LIMIT_DEFAULT_PAYMENT_METHOD_SET_STATUS", 42, "v1/credit-limit/default-payment-method/set/get-status");
    public static final PollerEndpoint DEFAULT_PAYMENT_METHOD_UNIFIED_SET_STATUS = new PollerEndpoint("DEFAULT_PAYMENT_METHOD_UNIFIED_SET_STATUS", 43, "v1/default-payment-method/unified/set/status");
    public static final PollerEndpoint WALLET_GET_WALLETS_INFO = new PollerEndpoint("WALLET_GET_WALLETS_INFO", 44, "v1/wallet/v1/get_wallets_info");
    public static final PollerEndpoint INSTANCES_REGISTER_STATUS = new PollerEndpoint("INSTANCES_REGISTER_STATUS", 45, "v1/instances/register-status");
    public static final PollerEndpoint NFC_SYNC_WITH_TOKENS = new PollerEndpoint("NFC_SYNC_WITH_TOKENS", 46, "nfc_sync_with_tokens");
    public static final PollerEndpoint FUND_REQUEST_STATUS = new PollerEndpoint("FUND_REQUEST_STATUS", 47, "v1/fund/request/status");
    public static final PollerEndpoint FUND_OPERATION_STATUS = new PollerEndpoint("FUND_OPERATION_STATUS", 48, "v1/fund/operation/status");
    public static final PollerEndpoint FUND_DOCS_NOTICE = new PollerEndpoint("FUND_DOCS_NOTICE", 49, "v1/fund_docs/notice/get");
    public static final PollerEndpoint DIV_DOWNLOADER = new PollerEndpoint("DIV_DOWNLOADER", 50, "div_downloader");
    public static final PollerEndpoint REPLENISH = new PollerEndpoint("REPLENISH", 51, "replenish");
    public static final PollerEndpoint CBDC_TLS_CERT_STATUS = new PollerEndpoint("CBDC_TLS_CERT_STATUS", 52, "v1/cbdc/v1/tls/status");
    public static final PollerEndpoint CBDC_SKPEP_CERT_STATUS = new PollerEndpoint("CBDC_SKPEP_CERT_STATUS", 53, "v1/cbdc/v1/wallets/certificate/status");
    public static final PollerEndpoint CBDC_REGISTER_STATUS = new PollerEndpoint("CBDC_REGISTER_STATUS", 54, "v1/cbdc/v1/register/status");
    public static final PollerEndpoint CBDC_WALLET_TOPUP_STATUS = new PollerEndpoint("CBDC_WALLET_TOPUP_STATUS", 55, "v1/cbdc/wallet/topup/status");

    private static final /* synthetic */ PollerEndpoint[] $values() {
        return new PollerEndpoint[]{APPLICATION_STATUS_V1, APPLICATION_STATUS_REGISTRATION_V2, APPLICATION_STATUS_PRODUCT, APPLICATION_STATUS_CLAIM_CARD, APPLICATION_STATUS_CHANGE_PHONE, APPLICATION_STATUS_CARD_REISSUE, CARD_WIDGET_INFO, KYC_APPLICATION_INFO, DOCUMENTS_VERIFY, AUTOTOPUP_PAYMENT_LAST, AUTOTOPUP_REQUEST_STATUS_V1, AUTOTOPUP_REQUEST_STATUS_V2, AUTOTOPUP_PAYMENT_TEST_STATUS, AUTOPAYMENTS_PAYMENT_TEST_STATUS, EXTERNAL_YB_PAYMENTS_REQUEST_STATUS, CREDIT_TRANSACTION_STATUS, SPLIT_DEPOSIT_TRANSACTION_STATUS, CARD_SET_PERIOD_LIMITS, CREDIT_DEPOSIT_TRANSACTION_STATUS, MKK_DEPOSIT_TRANSACTION_STATUS, BOOST_DEPOSIT_TRANSACTION_STATUS, REPORT_GET, SPLIT_CONTRACT_DRAFT_STATUS, TRANSFERS_C2B_GET_PAYMENT_INFO_V1, TRANSFERS_C2B_GET_PAYMENT_INFO_V2, TRANSFERS_C2B_PAYMENT_GET_RESULT_V1, TRANSFERS_C2B_PAYMENT_GET_RESULT_V2, LIMIT_AGREEMENT_CARD_BIND_STATUS, SAVINGS_ACCOUNT_REQUEST_STATUS, SAVINGS_ACCOUNT_LIST_V3, SAVINGS_ACCOUNT_LIST_V4, TRANSFERS_PHONE_CHECK_USER_YB, TRANSFERS_TIPS_PHONE_CHECK_USER_YB, YB_CHECK_FASTER, TRANSFERS_TRANSFER_SIMPLIFIED_CONFIRM, TRANSFERS_TRANSFER_GET_RESULT, TRANSFERS_GET_RESULT, TRANSFERS_TIPS_GET_RESULT, TRANSFERS_MKK_CASHOUT_GET_RESULT, TRANSFERS_ME2ME_DEBIT_GET_RESULT, PAYMENT_METHODS_GET_LIST, TRANSFERS_BUDGET_SEARCH_BY_UIN_STATUS, CREDIT_LIMIT_DEFAULT_PAYMENT_METHOD_SET_STATUS, DEFAULT_PAYMENT_METHOD_UNIFIED_SET_STATUS, WALLET_GET_WALLETS_INFO, INSTANCES_REGISTER_STATUS, NFC_SYNC_WITH_TOKENS, FUND_REQUEST_STATUS, FUND_OPERATION_STATUS, FUND_DOCS_NOTICE, DIV_DOWNLOADER, REPLENISH, CBDC_TLS_CERT_STATUS, CBDC_SKPEP_CERT_STATUS, CBDC_REGISTER_STATUS, CBDC_WALLET_TOPUP_STATUS};
    }

    static {
        PollerEndpoint[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private PollerEndpoint(String str, int i, String str2) {
        this.urlPath = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PollerEndpoint valueOf(String str) {
        return (PollerEndpoint) Enum.valueOf(PollerEndpoint.class, str);
    }

    public static PollerEndpoint[] values() {
        return (PollerEndpoint[]) $VALUES.clone();
    }

    public final String getUrlPath() {
        return this.urlPath;
    }
}
