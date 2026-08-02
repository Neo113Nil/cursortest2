package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/CommonEvents$PublicEventsNotifyEvent", "", "Lcom/ybsdk/core/analytics/generated/delegates/CommonEvents$PublicEventsNotifyEvent;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "CREDIT_RESULT_FAIL", "CREDIT_RESULT_SUCCESS", "PLUS_SHORTCUT_DATA_UPDATE", "SDK_RESULT", "REPLENISHMENT_SUCCESS", "REPLENISHMENT_FAIL", "REPLENISHMENT_PENDING", "REBIND_PAYMENT_CANCELED", "REBIND_PAYMENT_FAILURE", "REBIND_PAYMENT_SUCCESS", "PAYMENT_METHODS_INFO_UPDATE", "PRO_CARD_ACQUIRE_REQUEST", "WEBVIEW_JS_NATIVE_EVENT", "REGISTRATION_RESULT_SUCCESS", "REGISTRATION_RESULT_FAIL", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CommonEvents$PublicEventsNotifyEvent {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CommonEvents$PublicEventsNotifyEvent[] $VALUES;
    private final String originalValue;
    public static final CommonEvents$PublicEventsNotifyEvent CREDIT_RESULT_FAIL = new CommonEvents$PublicEventsNotifyEvent("CREDIT_RESULT_FAIL", 0, "credit_result_fail");
    public static final CommonEvents$PublicEventsNotifyEvent CREDIT_RESULT_SUCCESS = new CommonEvents$PublicEventsNotifyEvent("CREDIT_RESULT_SUCCESS", 1, "credit_result_success");
    public static final CommonEvents$PublicEventsNotifyEvent PLUS_SHORTCUT_DATA_UPDATE = new CommonEvents$PublicEventsNotifyEvent("PLUS_SHORTCUT_DATA_UPDATE", 2, "plus_shortcut_data_update");
    public static final CommonEvents$PublicEventsNotifyEvent SDK_RESULT = new CommonEvents$PublicEventsNotifyEvent("SDK_RESULT", 3, "sdk_result");
    public static final CommonEvents$PublicEventsNotifyEvent REPLENISHMENT_SUCCESS = new CommonEvents$PublicEventsNotifyEvent("REPLENISHMENT_SUCCESS", 4, "replenishment_success");
    public static final CommonEvents$PublicEventsNotifyEvent REPLENISHMENT_FAIL = new CommonEvents$PublicEventsNotifyEvent("REPLENISHMENT_FAIL", 5, "replenishment_fail");
    public static final CommonEvents$PublicEventsNotifyEvent REPLENISHMENT_PENDING = new CommonEvents$PublicEventsNotifyEvent("REPLENISHMENT_PENDING", 6, "replenishment_pending");
    public static final CommonEvents$PublicEventsNotifyEvent REBIND_PAYMENT_CANCELED = new CommonEvents$PublicEventsNotifyEvent("REBIND_PAYMENT_CANCELED", 7, "rebind_payment_canceled");
    public static final CommonEvents$PublicEventsNotifyEvent REBIND_PAYMENT_FAILURE = new CommonEvents$PublicEventsNotifyEvent("REBIND_PAYMENT_FAILURE", 8, "rebind_payment_failure");
    public static final CommonEvents$PublicEventsNotifyEvent REBIND_PAYMENT_SUCCESS = new CommonEvents$PublicEventsNotifyEvent("REBIND_PAYMENT_SUCCESS", 9, "rebind_payment_success");
    public static final CommonEvents$PublicEventsNotifyEvent PAYMENT_METHODS_INFO_UPDATE = new CommonEvents$PublicEventsNotifyEvent("PAYMENT_METHODS_INFO_UPDATE", 10, "payment_methods_info_update");
    public static final CommonEvents$PublicEventsNotifyEvent PRO_CARD_ACQUIRE_REQUEST = new CommonEvents$PublicEventsNotifyEvent("PRO_CARD_ACQUIRE_REQUEST", 11, "pro_card_acquire_request");
    public static final CommonEvents$PublicEventsNotifyEvent WEBVIEW_JS_NATIVE_EVENT = new CommonEvents$PublicEventsNotifyEvent("WEBVIEW_JS_NATIVE_EVENT", 12, "webview_js_native_event");
    public static final CommonEvents$PublicEventsNotifyEvent REGISTRATION_RESULT_SUCCESS = new CommonEvents$PublicEventsNotifyEvent("REGISTRATION_RESULT_SUCCESS", 13, "registration_result_success");
    public static final CommonEvents$PublicEventsNotifyEvent REGISTRATION_RESULT_FAIL = new CommonEvents$PublicEventsNotifyEvent("REGISTRATION_RESULT_FAIL", 14, "registration_result_fail");

    private static final /* synthetic */ CommonEvents$PublicEventsNotifyEvent[] $values() {
        return new CommonEvents$PublicEventsNotifyEvent[]{CREDIT_RESULT_FAIL, CREDIT_RESULT_SUCCESS, PLUS_SHORTCUT_DATA_UPDATE, SDK_RESULT, REPLENISHMENT_SUCCESS, REPLENISHMENT_FAIL, REPLENISHMENT_PENDING, REBIND_PAYMENT_CANCELED, REBIND_PAYMENT_FAILURE, REBIND_PAYMENT_SUCCESS, PAYMENT_METHODS_INFO_UPDATE, PRO_CARD_ACQUIRE_REQUEST, WEBVIEW_JS_NATIVE_EVENT, REGISTRATION_RESULT_SUCCESS, REGISTRATION_RESULT_FAIL};
    }

    static {
        CommonEvents$PublicEventsNotifyEvent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private CommonEvents$PublicEventsNotifyEvent(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CommonEvents$PublicEventsNotifyEvent valueOf(String str) {
        return (CommonEvents$PublicEventsNotifyEvent) Enum.valueOf(CommonEvents$PublicEventsNotifyEvent.class, str);
    }

    public static CommonEvents$PublicEventsNotifyEvent[] values() {
        return (CommonEvents$PublicEventsNotifyEvent[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
