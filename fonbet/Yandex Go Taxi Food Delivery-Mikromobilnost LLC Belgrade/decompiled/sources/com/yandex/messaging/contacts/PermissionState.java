package com.yandex.messaging.contacts;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/messaging/contacts/PermissionState;", "", "", "loggingName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "GRANTED", "DENIED", "NEVER_ASK", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PermissionState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PermissionState[] $VALUES;
    public static final PermissionState DENIED;
    public static final PermissionState GRANTED;
    public static final PermissionState NEVER_ASK;
    private final String loggingName;

    static {
        PermissionState permissionState = new PermissionState("GRANTED", 0, "granted");
        GRANTED = permissionState;
        PermissionState permissionState2 = new PermissionState("DENIED", 1, "denied");
        DENIED = permissionState2;
        PermissionState permissionState3 = new PermissionState("NEVER_ASK", 2, "never ask");
        NEVER_ASK = permissionState3;
        PermissionState[] permissionStateArr = {permissionState, permissionState2, permissionState3};
        $VALUES = permissionStateArr;
        $ENTRIES = a.a(permissionStateArr);
    }

    public PermissionState(String str, int i, String str2) {
        this.loggingName = str2;
    }

    public static PermissionState valueOf(String str) {
        return (PermissionState) Enum.valueOf(PermissionState.class, str);
    }

    public static PermissionState[] values() {
        return (PermissionState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getLoggingName() {
        return this.loggingName;
    }
}
