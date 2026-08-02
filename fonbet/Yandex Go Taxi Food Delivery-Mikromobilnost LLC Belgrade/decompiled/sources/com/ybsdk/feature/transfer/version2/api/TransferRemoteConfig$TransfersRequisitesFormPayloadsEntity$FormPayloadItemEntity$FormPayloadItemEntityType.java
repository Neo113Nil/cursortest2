package com.ybsdk.feature.transfer.version2.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/ybsdk/feature/transfer/version2/api/TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType", "", "Lcom/ybsdk/feature/transfer/version2/api/TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType;", "<init>", "(Ljava/lang/String;I)V", "ACCOUNT_NUMBER", "BIC", "INN", "BENEFICIARY_NAME", "LAST_NAME", "FIRST_NAME", "MIDDLE_NAME", "PAYMENT_PURPOSE", "PERSONAL_ACCOUNT", "PAYMENT_PERIOD", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType[] $VALUES;
    public static final TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType ACCOUNT_NUMBER = new TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType("ACCOUNT_NUMBER", 0);
    public static final TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType BIC = new TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType("BIC", 1);
    public static final TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType INN = new TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType("INN", 2);
    public static final TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType BENEFICIARY_NAME = new TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType("BENEFICIARY_NAME", 3);
    public static final TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType LAST_NAME = new TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType("LAST_NAME", 4);
    public static final TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType FIRST_NAME = new TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType("FIRST_NAME", 5);
    public static final TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType MIDDLE_NAME = new TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType("MIDDLE_NAME", 6);
    public static final TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType PAYMENT_PURPOSE = new TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType("PAYMENT_PURPOSE", 7);
    public static final TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType PERSONAL_ACCOUNT = new TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType("PERSONAL_ACCOUNT", 8);
    public static final TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType PAYMENT_PERIOD = new TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType("PAYMENT_PERIOD", 9);

    private static final /* synthetic */ TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType[] $values() {
        return new TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType[]{ACCOUNT_NUMBER, BIC, INN, BENEFICIARY_NAME, LAST_NAME, FIRST_NAME, MIDDLE_NAME, PAYMENT_PURPOSE, PERSONAL_ACCOUNT, PAYMENT_PERIOD};
    }

    static {
        TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType valueOf(String str) {
        return (TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType) Enum.valueOf(TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType.class, str);
    }

    public static TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType[] values() {
        return (TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType[]) $VALUES.clone();
    }
}
