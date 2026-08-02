package com.ybsdk.core.analytics.generated.delegates;

import com.yandex.messaging.core.net.entities.FoldersConfig;
import defpackage.k4o;
import defpackage.uza;
import defpackage.y5e;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/CommonEvents$StartSessionAction", "", "Lcom/ybsdk/core/analytics/generated/delegates/CommonEvents$StartSessionAction;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "SUPPORT", "AUTHORIZATION", "OPEN_PRODUCT", "YB_REGISTRATION", "APP_UPDATE", JCP.RAW_PREFIX, "UNKNOWN", "PASSPORT_REGISTRATION", "APPLICATION_STATUS_CHECK", "AM_TOKEN_UPDATE", "PIN_TOKEN_CLEAR", "PIN_TOKEN_REISSUE", "PIN_TOKEN_RETRY", "OPEN_DEEPLINK", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CommonEvents$StartSessionAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CommonEvents$StartSessionAction[] $VALUES;
    public static final CommonEvents$StartSessionAction AM_TOKEN_UPDATE;
    public static final CommonEvents$StartSessionAction APPLICATION_STATUS_CHECK;
    public static final CommonEvents$StartSessionAction APP_UPDATE;
    public static final CommonEvents$StartSessionAction NONE;
    public static final CommonEvents$StartSessionAction OPEN_DEEPLINK;
    public static final CommonEvents$StartSessionAction PASSPORT_REGISTRATION;
    public static final CommonEvents$StartSessionAction PIN_TOKEN_CLEAR;
    public static final CommonEvents$StartSessionAction PIN_TOKEN_REISSUE;
    public static final CommonEvents$StartSessionAction PIN_TOKEN_RETRY;
    public static final CommonEvents$StartSessionAction UNKNOWN;
    public static final CommonEvents$StartSessionAction YB_REGISTRATION;
    private final String originalValue;
    public static final CommonEvents$StartSessionAction SUPPORT = new CommonEvents$StartSessionAction("SUPPORT", 0, FoldersConfig.SUPPORT_FILTER_ID);
    public static final CommonEvents$StartSessionAction AUTHORIZATION = new CommonEvents$StartSessionAction("AUTHORIZATION", 1, "authorization");
    public static final CommonEvents$StartSessionAction OPEN_PRODUCT = new CommonEvents$StartSessionAction("OPEN_PRODUCT", 2, "open_product");

    private static final /* synthetic */ CommonEvents$StartSessionAction[] $values() {
        return new CommonEvents$StartSessionAction[]{SUPPORT, AUTHORIZATION, OPEN_PRODUCT, YB_REGISTRATION, APP_UPDATE, NONE, UNKNOWN, PASSPORT_REGISTRATION, APPLICATION_STATUS_CHECK, AM_TOKEN_UPDATE, PIN_TOKEN_CLEAR, PIN_TOKEN_REISSUE, PIN_TOKEN_RETRY, OPEN_DEEPLINK};
    }

    static {
        byte[] bArr = y5e.i;
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ y5e.c[i % 8]);
        }
        YB_REGISTRATION = new CommonEvents$StartSessionAction("YB_REGISTRATION", 3, new String(bArr2, uza.a));
        APP_UPDATE = new CommonEvents$StartSessionAction("APP_UPDATE", 4, "app_update");
        NONE = new CommonEvents$StartSessionAction(JCP.RAW_PREFIX, 5, "none");
        UNKNOWN = new CommonEvents$StartSessionAction("UNKNOWN", 6, "unknown");
        PASSPORT_REGISTRATION = new CommonEvents$StartSessionAction("PASSPORT_REGISTRATION", 7, "passport_registration");
        APPLICATION_STATUS_CHECK = new CommonEvents$StartSessionAction("APPLICATION_STATUS_CHECK", 8, "application_status_check");
        AM_TOKEN_UPDATE = new CommonEvents$StartSessionAction("AM_TOKEN_UPDATE", 9, "am_token_update");
        PIN_TOKEN_CLEAR = new CommonEvents$StartSessionAction("PIN_TOKEN_CLEAR", 10, "pin_token_clear");
        PIN_TOKEN_REISSUE = new CommonEvents$StartSessionAction("PIN_TOKEN_REISSUE", 11, "pin_token_reissue");
        PIN_TOKEN_RETRY = new CommonEvents$StartSessionAction("PIN_TOKEN_RETRY", 12, "pin_token_retry");
        OPEN_DEEPLINK = new CommonEvents$StartSessionAction("OPEN_DEEPLINK", 13, "open_deeplink");
        CommonEvents$StartSessionAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private CommonEvents$StartSessionAction(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CommonEvents$StartSessionAction valueOf(String str) {
        return (CommonEvents$StartSessionAction) Enum.valueOf(CommonEvents$StartSessionAction.class, str);
    }

    public static CommonEvents$StartSessionAction[] values() {
        return (CommonEvents$StartSessionAction[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
