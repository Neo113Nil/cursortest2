package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/TransferEvents$TransferPhoneTransferAllowContactsInitiatedType", "", "Lcom/ybsdk/core/analytics/generated/delegates/TransferEvents$TransferPhoneTransferAllowContactsInitiatedType;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "SYSTEM", "IN_APP_INFO", "IN_APP_SETTINGS", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransferEvents$TransferPhoneTransferAllowContactsInitiatedType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransferEvents$TransferPhoneTransferAllowContactsInitiatedType[] $VALUES;
    private final String originalValue;
    public static final TransferEvents$TransferPhoneTransferAllowContactsInitiatedType SYSTEM = new TransferEvents$TransferPhoneTransferAllowContactsInitiatedType("SYSTEM", 0, "system");
    public static final TransferEvents$TransferPhoneTransferAllowContactsInitiatedType IN_APP_INFO = new TransferEvents$TransferPhoneTransferAllowContactsInitiatedType("IN_APP_INFO", 1, "in_app_info");
    public static final TransferEvents$TransferPhoneTransferAllowContactsInitiatedType IN_APP_SETTINGS = new TransferEvents$TransferPhoneTransferAllowContactsInitiatedType("IN_APP_SETTINGS", 2, "in_app_settings");

    private static final /* synthetic */ TransferEvents$TransferPhoneTransferAllowContactsInitiatedType[] $values() {
        return new TransferEvents$TransferPhoneTransferAllowContactsInitiatedType[]{SYSTEM, IN_APP_INFO, IN_APP_SETTINGS};
    }

    static {
        TransferEvents$TransferPhoneTransferAllowContactsInitiatedType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TransferEvents$TransferPhoneTransferAllowContactsInitiatedType(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TransferEvents$TransferPhoneTransferAllowContactsInitiatedType valueOf(String str) {
        return (TransferEvents$TransferPhoneTransferAllowContactsInitiatedType) Enum.valueOf(TransferEvents$TransferPhoneTransferAllowContactsInitiatedType.class, str);
    }

    public static TransferEvents$TransferPhoneTransferAllowContactsInitiatedType[] values() {
        return (TransferEvents$TransferPhoneTransferAllowContactsInitiatedType[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
