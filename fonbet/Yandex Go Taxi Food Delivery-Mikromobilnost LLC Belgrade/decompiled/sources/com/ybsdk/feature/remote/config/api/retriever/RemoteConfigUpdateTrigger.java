package com.ybsdk.feature.remote.config.api.retriever;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/remote/config/api/retriever/RemoteConfigUpdateTrigger;", "", "<init>", "(Ljava/lang/String;I)V", "RETRY", "INITIAL", "LOGIN", "UI_OPEN", "BANK_REGISTRATION", "LOGOUT", "PIN_CHECK", "PIN_CREATED", "UNKNOWN_USER", "SDK_STATE_CHANGE", "PASSPORT_LOGIN", "feature-remote-config_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RemoteConfigUpdateTrigger {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RemoteConfigUpdateTrigger[] $VALUES;
    public static final RemoteConfigUpdateTrigger RETRY = new RemoteConfigUpdateTrigger("RETRY", 0);
    public static final RemoteConfigUpdateTrigger INITIAL = new RemoteConfigUpdateTrigger("INITIAL", 1);
    public static final RemoteConfigUpdateTrigger LOGIN = new RemoteConfigUpdateTrigger("LOGIN", 2);
    public static final RemoteConfigUpdateTrigger UI_OPEN = new RemoteConfigUpdateTrigger("UI_OPEN", 3);
    public static final RemoteConfigUpdateTrigger BANK_REGISTRATION = new RemoteConfigUpdateTrigger("BANK_REGISTRATION", 4);
    public static final RemoteConfigUpdateTrigger LOGOUT = new RemoteConfigUpdateTrigger("LOGOUT", 5);
    public static final RemoteConfigUpdateTrigger PIN_CHECK = new RemoteConfigUpdateTrigger("PIN_CHECK", 6);
    public static final RemoteConfigUpdateTrigger PIN_CREATED = new RemoteConfigUpdateTrigger("PIN_CREATED", 7);
    public static final RemoteConfigUpdateTrigger UNKNOWN_USER = new RemoteConfigUpdateTrigger("UNKNOWN_USER", 8);
    public static final RemoteConfigUpdateTrigger SDK_STATE_CHANGE = new RemoteConfigUpdateTrigger("SDK_STATE_CHANGE", 9);
    public static final RemoteConfigUpdateTrigger PASSPORT_LOGIN = new RemoteConfigUpdateTrigger("PASSPORT_LOGIN", 10);

    private static final /* synthetic */ RemoteConfigUpdateTrigger[] $values() {
        return new RemoteConfigUpdateTrigger[]{RETRY, INITIAL, LOGIN, UI_OPEN, BANK_REGISTRATION, LOGOUT, PIN_CHECK, PIN_CREATED, UNKNOWN_USER, SDK_STATE_CHANGE, PASSPORT_LOGIN};
    }

    static {
        RemoteConfigUpdateTrigger[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private RemoteConfigUpdateTrigger(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static RemoteConfigUpdateTrigger valueOf(String str) {
        return (RemoteConfigUpdateTrigger) Enum.valueOf(RemoteConfigUpdateTrigger.class, str);
    }

    public static RemoteConfigUpdateTrigger[] values() {
        return (RemoteConfigUpdateTrigger[]) $VALUES.clone();
    }
}
