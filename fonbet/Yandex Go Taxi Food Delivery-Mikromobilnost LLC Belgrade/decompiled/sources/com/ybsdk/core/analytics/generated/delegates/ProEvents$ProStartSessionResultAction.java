package com.ybsdk.core.analytics.generated.delegates;

import com.yandex.messaging.core.net.entities.FoldersConfig;
import defpackage.k4o;
import defpackage.uza;
import defpackage.y5e;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/ProEvents$ProStartSessionResultAction", "", "Lcom/ybsdk/core/analytics/generated/delegates/ProEvents$ProStartSessionResultAction;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "SUPPORT", "AUTHORIZATION", "YB_REGISTRATION", "APP_UPDATE", JCP.RAW_PREFIX, "PASSPORT_REGISTRATION", "APPLICATION_STATUS_CHECK", "AM_TOKEN_UPDATE", "PIN_TOKEN_CLEAR", "PIN_TOKEN_REISSUE", "PIN_TOKEN_RETRY", "ERROR", "OPEN_DEEPLINK", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ProEvents$ProStartSessionResultAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ProEvents$ProStartSessionResultAction[] $VALUES;
    public static final ProEvents$ProStartSessionResultAction AM_TOKEN_UPDATE;
    public static final ProEvents$ProStartSessionResultAction APPLICATION_STATUS_CHECK;
    public static final ProEvents$ProStartSessionResultAction APP_UPDATE;
    public static final ProEvents$ProStartSessionResultAction ERROR;
    public static final ProEvents$ProStartSessionResultAction NONE;
    public static final ProEvents$ProStartSessionResultAction OPEN_DEEPLINK;
    public static final ProEvents$ProStartSessionResultAction PASSPORT_REGISTRATION;
    public static final ProEvents$ProStartSessionResultAction PIN_TOKEN_CLEAR;
    public static final ProEvents$ProStartSessionResultAction PIN_TOKEN_REISSUE;
    public static final ProEvents$ProStartSessionResultAction PIN_TOKEN_RETRY;
    public static final ProEvents$ProStartSessionResultAction YB_REGISTRATION;
    private final String originalValue;
    public static final ProEvents$ProStartSessionResultAction SUPPORT = new ProEvents$ProStartSessionResultAction("SUPPORT", 0, FoldersConfig.SUPPORT_FILTER_ID);
    public static final ProEvents$ProStartSessionResultAction AUTHORIZATION = new ProEvents$ProStartSessionResultAction("AUTHORIZATION", 1, "authorization");

    private static final /* synthetic */ ProEvents$ProStartSessionResultAction[] $values() {
        return new ProEvents$ProStartSessionResultAction[]{SUPPORT, AUTHORIZATION, YB_REGISTRATION, APP_UPDATE, NONE, PASSPORT_REGISTRATION, APPLICATION_STATUS_CHECK, AM_TOKEN_UPDATE, PIN_TOKEN_CLEAR, PIN_TOKEN_REISSUE, PIN_TOKEN_RETRY, ERROR, OPEN_DEEPLINK};
    }

    static {
        byte[] bArr = y5e.i;
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ y5e.c[i % 8]);
        }
        YB_REGISTRATION = new ProEvents$ProStartSessionResultAction("YB_REGISTRATION", 2, new String(bArr2, uza.a));
        APP_UPDATE = new ProEvents$ProStartSessionResultAction("APP_UPDATE", 3, "app_update");
        NONE = new ProEvents$ProStartSessionResultAction(JCP.RAW_PREFIX, 4, "none");
        PASSPORT_REGISTRATION = new ProEvents$ProStartSessionResultAction("PASSPORT_REGISTRATION", 5, "passport_registration");
        APPLICATION_STATUS_CHECK = new ProEvents$ProStartSessionResultAction("APPLICATION_STATUS_CHECK", 6, "application_status_check");
        AM_TOKEN_UPDATE = new ProEvents$ProStartSessionResultAction("AM_TOKEN_UPDATE", 7, "am_token_update");
        PIN_TOKEN_CLEAR = new ProEvents$ProStartSessionResultAction("PIN_TOKEN_CLEAR", 8, "pin_token_clear");
        PIN_TOKEN_REISSUE = new ProEvents$ProStartSessionResultAction("PIN_TOKEN_REISSUE", 9, "pin_token_reissue");
        PIN_TOKEN_RETRY = new ProEvents$ProStartSessionResultAction("PIN_TOKEN_RETRY", 10, "pin_token_retry");
        ERROR = new ProEvents$ProStartSessionResultAction("ERROR", 11, "error");
        OPEN_DEEPLINK = new ProEvents$ProStartSessionResultAction("OPEN_DEEPLINK", 12, "open_deeplink");
        ProEvents$ProStartSessionResultAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ProEvents$ProStartSessionResultAction(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ProEvents$ProStartSessionResultAction valueOf(String str) {
        return (ProEvents$ProStartSessionResultAction) Enum.valueOf(ProEvents$ProStartSessionResultAction.class, str);
    }

    public static ProEvents$ProStartSessionResultAction[] values() {
        return (ProEvents$ProStartSessionResultAction[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
