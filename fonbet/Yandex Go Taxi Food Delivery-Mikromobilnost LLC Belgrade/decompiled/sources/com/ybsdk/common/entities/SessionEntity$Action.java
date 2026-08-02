package com.ybsdk.common.entities;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"com/ybsdk/common/entities/SessionEntity$Action", "", "Lcom/ybsdk/common/entities/SessionEntity$Action;", "<init>", "(Ljava/lang/String;I)V", JCP.RAW_PREFIX, "AUTHORIZATION", "PASSPORT_REGISTRATION", "BANK_REGISTRATION", "APPLICATION_STATUS_CHECK", "SUPPORT", "AM_TOKEN_UPDATE", "APP_UPDATE", "PIN_TOKEN_CLEAR", "PIN_TOKEN_REISSUE", "PIN_TOKEN_RETRY", "OPEN_PRODUCT", "OPEN_DEEPLINK", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SessionEntity$Action {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SessionEntity$Action[] $VALUES;
    public static final SessionEntity$Action NONE = new SessionEntity$Action(JCP.RAW_PREFIX, 0);
    public static final SessionEntity$Action AUTHORIZATION = new SessionEntity$Action("AUTHORIZATION", 1);
    public static final SessionEntity$Action PASSPORT_REGISTRATION = new SessionEntity$Action("PASSPORT_REGISTRATION", 2);
    public static final SessionEntity$Action BANK_REGISTRATION = new SessionEntity$Action("BANK_REGISTRATION", 3);
    public static final SessionEntity$Action APPLICATION_STATUS_CHECK = new SessionEntity$Action("APPLICATION_STATUS_CHECK", 4);
    public static final SessionEntity$Action SUPPORT = new SessionEntity$Action("SUPPORT", 5);
    public static final SessionEntity$Action AM_TOKEN_UPDATE = new SessionEntity$Action("AM_TOKEN_UPDATE", 6);
    public static final SessionEntity$Action APP_UPDATE = new SessionEntity$Action("APP_UPDATE", 7);
    public static final SessionEntity$Action PIN_TOKEN_CLEAR = new SessionEntity$Action("PIN_TOKEN_CLEAR", 8);
    public static final SessionEntity$Action PIN_TOKEN_REISSUE = new SessionEntity$Action("PIN_TOKEN_REISSUE", 9);
    public static final SessionEntity$Action PIN_TOKEN_RETRY = new SessionEntity$Action("PIN_TOKEN_RETRY", 10);
    public static final SessionEntity$Action OPEN_PRODUCT = new SessionEntity$Action("OPEN_PRODUCT", 11);
    public static final SessionEntity$Action OPEN_DEEPLINK = new SessionEntity$Action("OPEN_DEEPLINK", 12);

    private static final /* synthetic */ SessionEntity$Action[] $values() {
        return new SessionEntity$Action[]{NONE, AUTHORIZATION, PASSPORT_REGISTRATION, BANK_REGISTRATION, APPLICATION_STATUS_CHECK, SUPPORT, AM_TOKEN_UPDATE, APP_UPDATE, PIN_TOKEN_CLEAR, PIN_TOKEN_REISSUE, PIN_TOKEN_RETRY, OPEN_PRODUCT, OPEN_DEEPLINK};
    }

    static {
        SessionEntity$Action[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private SessionEntity$Action(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SessionEntity$Action valueOf(String str) {
        return (SessionEntity$Action) Enum.valueOf(SessionEntity$Action.class, str);
    }

    public static SessionEntity$Action[] values() {
        return (SessionEntity$Action[]) $VALUES.clone();
    }
}
