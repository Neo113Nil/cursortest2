package com.ybsdk.rconfig.configs;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/rconfig/configs/PushSubscribeAction;", "", "<init>", "(Ljava/lang/String;I)V", JCP.RAW_PREFIX, "AUTHORIZATION", "PASSPORT_REGISTRATION", "BANK_REGISTRATION", "APPLICATION_STATUS_CHECK", "SUPPORT", "AM_TOKEN_UPDATE", "APP_UPDATE", "PIN_TOKEN_CLEAR", "PIN_TOKEN_REISSUE", "PIN_TOKEN_RETRY", "OPEN_PRODUCT", "OPEN_DEEPLINK", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PushSubscribeAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PushSubscribeAction[] $VALUES;
    public static final PushSubscribeAction NONE = new PushSubscribeAction(JCP.RAW_PREFIX, 0);
    public static final PushSubscribeAction AUTHORIZATION = new PushSubscribeAction("AUTHORIZATION", 1);
    public static final PushSubscribeAction PASSPORT_REGISTRATION = new PushSubscribeAction("PASSPORT_REGISTRATION", 2);
    public static final PushSubscribeAction BANK_REGISTRATION = new PushSubscribeAction("BANK_REGISTRATION", 3);
    public static final PushSubscribeAction APPLICATION_STATUS_CHECK = new PushSubscribeAction("APPLICATION_STATUS_CHECK", 4);
    public static final PushSubscribeAction SUPPORT = new PushSubscribeAction("SUPPORT", 5);
    public static final PushSubscribeAction AM_TOKEN_UPDATE = new PushSubscribeAction("AM_TOKEN_UPDATE", 6);
    public static final PushSubscribeAction APP_UPDATE = new PushSubscribeAction("APP_UPDATE", 7);
    public static final PushSubscribeAction PIN_TOKEN_CLEAR = new PushSubscribeAction("PIN_TOKEN_CLEAR", 8);
    public static final PushSubscribeAction PIN_TOKEN_REISSUE = new PushSubscribeAction("PIN_TOKEN_REISSUE", 9);
    public static final PushSubscribeAction PIN_TOKEN_RETRY = new PushSubscribeAction("PIN_TOKEN_RETRY", 10);
    public static final PushSubscribeAction OPEN_PRODUCT = new PushSubscribeAction("OPEN_PRODUCT", 11);
    public static final PushSubscribeAction OPEN_DEEPLINK = new PushSubscribeAction("OPEN_DEEPLINK", 12);

    private static final /* synthetic */ PushSubscribeAction[] $values() {
        return new PushSubscribeAction[]{NONE, AUTHORIZATION, PASSPORT_REGISTRATION, BANK_REGISTRATION, APPLICATION_STATUS_CHECK, SUPPORT, AM_TOKEN_UPDATE, APP_UPDATE, PIN_TOKEN_CLEAR, PIN_TOKEN_REISSUE, PIN_TOKEN_RETRY, OPEN_PRODUCT, OPEN_DEEPLINK};
    }

    static {
        PushSubscribeAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private PushSubscribeAction(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PushSubscribeAction valueOf(String str) {
        return (PushSubscribeAction) Enum.valueOf(PushSubscribeAction.class, str);
    }

    public static PushSubscribeAction[] values() {
        return (PushSubscribeAction[]) $VALUES.clone();
    }
}
