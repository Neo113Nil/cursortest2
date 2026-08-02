package com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.state;

import defpackage.k4o;
import defpackage.mq01;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"com/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/state/TransferRequisiteFormItemType$LegalFormItemType", "Lmq01;", "", "Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/state/TransferRequisiteFormItemType$LegalFormItemType;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/state/ItemType;", "itemType", "<init>", "(Ljava/lang/String;ILcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/state/ItemType;)V", "Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/state/ItemType;", "getItemType", "()Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/state/ItemType;", "DIV_WIDGET", "ACCOUNT_NUMBER", "BIC", "INN", "BENEFICIARY_NAME", "VAT", "PAYMENT_PURPOSE", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransferRequisiteFormItemType$LegalFormItemType implements mq01 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransferRequisiteFormItemType$LegalFormItemType[] $VALUES;
    private final ItemType itemType;
    public static final TransferRequisiteFormItemType$LegalFormItemType DIV_WIDGET = new TransferRequisiteFormItemType$LegalFormItemType("DIV_WIDGET", 0, ItemType.DIV_WIDGET);
    public static final TransferRequisiteFormItemType$LegalFormItemType ACCOUNT_NUMBER = new TransferRequisiteFormItemType$LegalFormItemType("ACCOUNT_NUMBER", 1, ItemType.ACCOUNT_NUMBER);
    public static final TransferRequisiteFormItemType$LegalFormItemType BIC = new TransferRequisiteFormItemType$LegalFormItemType("BIC", 2, ItemType.BIC);
    public static final TransferRequisiteFormItemType$LegalFormItemType INN = new TransferRequisiteFormItemType$LegalFormItemType("INN", 3, ItemType.INN);
    public static final TransferRequisiteFormItemType$LegalFormItemType BENEFICIARY_NAME = new TransferRequisiteFormItemType$LegalFormItemType("BENEFICIARY_NAME", 4, ItemType.BENEFICIARY_NAME);
    public static final TransferRequisiteFormItemType$LegalFormItemType VAT = new TransferRequisiteFormItemType$LegalFormItemType("VAT", 5, ItemType.VAT);
    public static final TransferRequisiteFormItemType$LegalFormItemType PAYMENT_PURPOSE = new TransferRequisiteFormItemType$LegalFormItemType("PAYMENT_PURPOSE", 6, ItemType.PAYMENT_PURPOSE);

    private static final /* synthetic */ TransferRequisiteFormItemType$LegalFormItemType[] $values() {
        return new TransferRequisiteFormItemType$LegalFormItemType[]{DIV_WIDGET, ACCOUNT_NUMBER, BIC, INN, BENEFICIARY_NAME, VAT, PAYMENT_PURPOSE};
    }

    static {
        TransferRequisiteFormItemType$LegalFormItemType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private TransferRequisiteFormItemType$LegalFormItemType(String str, int i, ItemType itemType) {
        this.itemType = itemType;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TransferRequisiteFormItemType$LegalFormItemType valueOf(String str) {
        return (TransferRequisiteFormItemType$LegalFormItemType) Enum.valueOf(TransferRequisiteFormItemType$LegalFormItemType.class, str);
    }

    public static TransferRequisiteFormItemType$LegalFormItemType[] values() {
        return (TransferRequisiteFormItemType$LegalFormItemType[]) $VALUES.clone();
    }

    @Override // defpackage.mq01
    public ItemType getItemType() {
        return this.itemType;
    }
}
