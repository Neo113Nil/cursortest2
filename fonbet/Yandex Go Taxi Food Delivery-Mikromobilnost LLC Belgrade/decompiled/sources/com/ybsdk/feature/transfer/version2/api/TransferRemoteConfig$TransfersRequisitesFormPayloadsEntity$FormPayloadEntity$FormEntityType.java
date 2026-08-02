package com.ybsdk.feature.transfer.version2.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/ybsdk/feature/transfer/version2/api/TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType", "", "Lcom/ybsdk/feature/transfer/version2/api/TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType;", "<init>", "(Ljava/lang/String;I)V", "HCS", "PERSON", "LEGAL", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType[] $VALUES;
    public static final TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType HCS = new TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType("HCS", 0);
    public static final TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType PERSON = new TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType("PERSON", 1);
    public static final TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType LEGAL = new TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType("LEGAL", 2);

    private static final /* synthetic */ TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType[] $values() {
        return new TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType[]{HCS, PERSON, LEGAL};
    }

    static {
        TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType valueOf(String str) {
        return (TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType) Enum.valueOf(TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType.class, str);
    }

    public static TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType[] values() {
        return (TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType[]) $VALUES.clone();
    }
}
