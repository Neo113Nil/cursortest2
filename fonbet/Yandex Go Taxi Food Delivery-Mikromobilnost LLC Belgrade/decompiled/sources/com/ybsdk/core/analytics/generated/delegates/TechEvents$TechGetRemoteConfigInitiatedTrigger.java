package com.ybsdk.core.analytics.generated.delegates;

import com.yandex.auth.LegacyAccountType;
import defpackage.k4o;
import defpackage.uza;
import defpackage.y5e;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/TechEvents$TechGetRemoteConfigInitiatedTrigger", "", "Lcom/ybsdk/core/analytics/generated/delegates/TechEvents$TechGetRemoteConfigInitiatedTrigger;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "INITIAL", "LOGIN", "LOGOUT", "APP_LAUNCH", "ACCOUNT_MANAGER_TOKEN_CHANGE", "ACCOUNT_MANAGER_TOKEN_REFRESH", "UI_OPEN", "YB_REGISTRATION", "APP_RETURN_FROM_BACKGROUND", "SDK_STATE_CHANGE", "PIN_CHECK", "PIN_CREATED", "UNKNOWN_USER", "RETRY", "PASSPORT_LOGIN", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TechEvents$TechGetRemoteConfigInitiatedTrigger {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TechEvents$TechGetRemoteConfigInitiatedTrigger[] $VALUES;
    public static final TechEvents$TechGetRemoteConfigInitiatedTrigger APP_RETURN_FROM_BACKGROUND;
    public static final TechEvents$TechGetRemoteConfigInitiatedTrigger PASSPORT_LOGIN;
    public static final TechEvents$TechGetRemoteConfigInitiatedTrigger PIN_CHECK;
    public static final TechEvents$TechGetRemoteConfigInitiatedTrigger PIN_CREATED;
    public static final TechEvents$TechGetRemoteConfigInitiatedTrigger RETRY;
    public static final TechEvents$TechGetRemoteConfigInitiatedTrigger SDK_STATE_CHANGE;
    public static final TechEvents$TechGetRemoteConfigInitiatedTrigger UNKNOWN_USER;
    public static final TechEvents$TechGetRemoteConfigInitiatedTrigger YB_REGISTRATION;
    private final String originalValue;
    public static final TechEvents$TechGetRemoteConfigInitiatedTrigger INITIAL = new TechEvents$TechGetRemoteConfigInitiatedTrigger("INITIAL", 0, "initial");
    public static final TechEvents$TechGetRemoteConfigInitiatedTrigger LOGIN = new TechEvents$TechGetRemoteConfigInitiatedTrigger("LOGIN", 1, LegacyAccountType.STRING_LOGIN);
    public static final TechEvents$TechGetRemoteConfigInitiatedTrigger LOGOUT = new TechEvents$TechGetRemoteConfigInitiatedTrigger("LOGOUT", 2, "logout");
    public static final TechEvents$TechGetRemoteConfigInitiatedTrigger APP_LAUNCH = new TechEvents$TechGetRemoteConfigInitiatedTrigger("APP_LAUNCH", 3, "app_launch");
    public static final TechEvents$TechGetRemoteConfigInitiatedTrigger ACCOUNT_MANAGER_TOKEN_CHANGE = new TechEvents$TechGetRemoteConfigInitiatedTrigger("ACCOUNT_MANAGER_TOKEN_CHANGE", 4, "account_manager_token_change");
    public static final TechEvents$TechGetRemoteConfigInitiatedTrigger ACCOUNT_MANAGER_TOKEN_REFRESH = new TechEvents$TechGetRemoteConfigInitiatedTrigger("ACCOUNT_MANAGER_TOKEN_REFRESH", 5, "account_manager_token_refresh");
    public static final TechEvents$TechGetRemoteConfigInitiatedTrigger UI_OPEN = new TechEvents$TechGetRemoteConfigInitiatedTrigger("UI_OPEN", 6, "ui_open");

    private static final /* synthetic */ TechEvents$TechGetRemoteConfigInitiatedTrigger[] $values() {
        return new TechEvents$TechGetRemoteConfigInitiatedTrigger[]{INITIAL, LOGIN, LOGOUT, APP_LAUNCH, ACCOUNT_MANAGER_TOKEN_CHANGE, ACCOUNT_MANAGER_TOKEN_REFRESH, UI_OPEN, YB_REGISTRATION, APP_RETURN_FROM_BACKGROUND, SDK_STATE_CHANGE, PIN_CHECK, PIN_CREATED, UNKNOWN_USER, RETRY, PASSPORT_LOGIN};
    }

    static {
        byte[] bArr = y5e.i;
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ y5e.c[i % 8]);
        }
        YB_REGISTRATION = new TechEvents$TechGetRemoteConfigInitiatedTrigger("YB_REGISTRATION", 7, new String(bArr2, uza.a));
        APP_RETURN_FROM_BACKGROUND = new TechEvents$TechGetRemoteConfigInitiatedTrigger("APP_RETURN_FROM_BACKGROUND", 8, "app_return_from_background");
        SDK_STATE_CHANGE = new TechEvents$TechGetRemoteConfigInitiatedTrigger("SDK_STATE_CHANGE", 9, "sdk_state_change");
        PIN_CHECK = new TechEvents$TechGetRemoteConfigInitiatedTrigger("PIN_CHECK", 10, "pin_check");
        PIN_CREATED = new TechEvents$TechGetRemoteConfigInitiatedTrigger("PIN_CREATED", 11, "pin_created");
        UNKNOWN_USER = new TechEvents$TechGetRemoteConfigInitiatedTrigger("UNKNOWN_USER", 12, "unknown_user");
        RETRY = new TechEvents$TechGetRemoteConfigInitiatedTrigger("RETRY", 13, "retry");
        PASSPORT_LOGIN = new TechEvents$TechGetRemoteConfigInitiatedTrigger("PASSPORT_LOGIN", 14, "passport_login");
        TechEvents$TechGetRemoteConfigInitiatedTrigger[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TechEvents$TechGetRemoteConfigInitiatedTrigger(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TechEvents$TechGetRemoteConfigInitiatedTrigger valueOf(String str) {
        return (TechEvents$TechGetRemoteConfigInitiatedTrigger) Enum.valueOf(TechEvents$TechGetRemoteConfigInitiatedTrigger.class, str);
    }

    public static TechEvents$TechGetRemoteConfigInitiatedTrigger[] values() {
        return (TechEvents$TechGetRemoteConfigInitiatedTrigger[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
