package com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.state;

import defpackage.k4o;
import defpackage.mq01;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"com/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/state/TransferRequisiteFormItemType$PersonFormItemType", "Lmq01;", "", "Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/state/TransferRequisiteFormItemType$PersonFormItemType;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/state/ItemType;", "itemType", "<init>", "(Ljava/lang/String;ILcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/state/ItemType;)V", "Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/state/ItemType;", "getItemType", "()Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/state/ItemType;", "DIV_WIDGET", "ACCOUNT_NUMBER", "BIC", "LAST_NAME", "FIRST_NAME", "MIDDLE_NAME", "MIDDLE_NAME_RADIO_BUTTON", "PAYMENT_PURPOSE", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransferRequisiteFormItemType$PersonFormItemType implements mq01 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransferRequisiteFormItemType$PersonFormItemType[] $VALUES;
    private final ItemType itemType;
    public static final TransferRequisiteFormItemType$PersonFormItemType DIV_WIDGET = new TransferRequisiteFormItemType$PersonFormItemType("DIV_WIDGET", 0, ItemType.DIV_WIDGET);
    public static final TransferRequisiteFormItemType$PersonFormItemType ACCOUNT_NUMBER = new TransferRequisiteFormItemType$PersonFormItemType("ACCOUNT_NUMBER", 1, ItemType.ACCOUNT_NUMBER);
    public static final TransferRequisiteFormItemType$PersonFormItemType BIC = new TransferRequisiteFormItemType$PersonFormItemType("BIC", 2, ItemType.BIC);
    public static final TransferRequisiteFormItemType$PersonFormItemType LAST_NAME = new TransferRequisiteFormItemType$PersonFormItemType("LAST_NAME", 3, ItemType.LAST_NAME);
    public static final TransferRequisiteFormItemType$PersonFormItemType FIRST_NAME = new TransferRequisiteFormItemType$PersonFormItemType("FIRST_NAME", 4, ItemType.FIRST_NAME);
    public static final TransferRequisiteFormItemType$PersonFormItemType MIDDLE_NAME = new TransferRequisiteFormItemType$PersonFormItemType("MIDDLE_NAME", 5, ItemType.MIDDLE_NAME);
    public static final TransferRequisiteFormItemType$PersonFormItemType MIDDLE_NAME_RADIO_BUTTON = new TransferRequisiteFormItemType$PersonFormItemType("MIDDLE_NAME_RADIO_BUTTON", 6, ItemType.MIDDLE_NAME_RADIO_BUTTON);
    public static final TransferRequisiteFormItemType$PersonFormItemType PAYMENT_PURPOSE = new TransferRequisiteFormItemType$PersonFormItemType("PAYMENT_PURPOSE", 7, ItemType.PAYMENT_PURPOSE);

    private static final /* synthetic */ TransferRequisiteFormItemType$PersonFormItemType[] $values() {
        return new TransferRequisiteFormItemType$PersonFormItemType[]{DIV_WIDGET, ACCOUNT_NUMBER, BIC, LAST_NAME, FIRST_NAME, MIDDLE_NAME, MIDDLE_NAME_RADIO_BUTTON, PAYMENT_PURPOSE};
    }

    static {
        TransferRequisiteFormItemType$PersonFormItemType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private TransferRequisiteFormItemType$PersonFormItemType(String str, int i, ItemType itemType) {
        this.itemType = itemType;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TransferRequisiteFormItemType$PersonFormItemType valueOf(String str) {
        return (TransferRequisiteFormItemType$PersonFormItemType) Enum.valueOf(TransferRequisiteFormItemType$PersonFormItemType.class, str);
    }

    public static TransferRequisiteFormItemType$PersonFormItemType[] values() {
        return (TransferRequisiteFormItemType$PersonFormItemType[]) $VALUES.clone();
    }

    @Override // defpackage.mq01
    public ItemType getItemType() {
        return this.itemType;
    }
}
