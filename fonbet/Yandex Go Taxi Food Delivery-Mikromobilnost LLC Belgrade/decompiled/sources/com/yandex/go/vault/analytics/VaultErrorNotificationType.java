package com.yandex.go.vault.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/vault/analytics/VaultErrorNotificationType;", "", "NOT_ENOUGH_KEYS", "NETWORK_ERROR", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class VaultErrorNotificationType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ VaultErrorNotificationType[] $VALUES;
    public static final VaultErrorNotificationType NETWORK_ERROR;
    public static final VaultErrorNotificationType NOT_ENOUGH_KEYS;

    static {
        VaultErrorNotificationType vaultErrorNotificationType = new VaultErrorNotificationType("NOT_ENOUGH_KEYS", 0);
        NOT_ENOUGH_KEYS = vaultErrorNotificationType;
        VaultErrorNotificationType vaultErrorNotificationType2 = new VaultErrorNotificationType("NETWORK_ERROR", 1);
        NETWORK_ERROR = vaultErrorNotificationType2;
        VaultErrorNotificationType[] vaultErrorNotificationTypeArr = {vaultErrorNotificationType, vaultErrorNotificationType2};
        $VALUES = vaultErrorNotificationTypeArr;
        $ENTRIES = a.a(vaultErrorNotificationTypeArr);
    }

    public static VaultErrorNotificationType valueOf(String str) {
        return (VaultErrorNotificationType) Enum.valueOf(VaultErrorNotificationType.class, str);
    }

    public static VaultErrorNotificationType[] values() {
        return (VaultErrorNotificationType[]) $VALUES.clone();
    }
}
