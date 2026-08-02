package com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.state;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/state/ItemType;", "", "<init>", "(Ljava/lang/String;I)V", "ACCOUNT_NUMBER", "BIC", "BENEFICIARY_NAME", "PAYMENT_PURPOSE", "INN", "VAT", "LAST_NAME", "FIRST_NAME", "MIDDLE_NAME", "MIDDLE_NAME_RADIO_BUTTON", "DIV_WIDGET", "PERSONAL_ACCOUNT", "PAYMENT_PERIOD", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ItemType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ItemType[] $VALUES;
    public static final ItemType ACCOUNT_NUMBER = new ItemType("ACCOUNT_NUMBER", 0);
    public static final ItemType BIC = new ItemType("BIC", 1);
    public static final ItemType BENEFICIARY_NAME = new ItemType("BENEFICIARY_NAME", 2);
    public static final ItemType PAYMENT_PURPOSE = new ItemType("PAYMENT_PURPOSE", 3);
    public static final ItemType INN = new ItemType("INN", 4);
    public static final ItemType VAT = new ItemType("VAT", 5);
    public static final ItemType LAST_NAME = new ItemType("LAST_NAME", 6);
    public static final ItemType FIRST_NAME = new ItemType("FIRST_NAME", 7);
    public static final ItemType MIDDLE_NAME = new ItemType("MIDDLE_NAME", 8);
    public static final ItemType MIDDLE_NAME_RADIO_BUTTON = new ItemType("MIDDLE_NAME_RADIO_BUTTON", 9);
    public static final ItemType DIV_WIDGET = new ItemType("DIV_WIDGET", 10);
    public static final ItemType PERSONAL_ACCOUNT = new ItemType("PERSONAL_ACCOUNT", 11);
    public static final ItemType PAYMENT_PERIOD = new ItemType("PAYMENT_PERIOD", 12);

    private static final /* synthetic */ ItemType[] $values() {
        return new ItemType[]{ACCOUNT_NUMBER, BIC, BENEFICIARY_NAME, PAYMENT_PURPOSE, INN, VAT, LAST_NAME, FIRST_NAME, MIDDLE_NAME, MIDDLE_NAME_RADIO_BUTTON, DIV_WIDGET, PERSONAL_ACCOUNT, PAYMENT_PERIOD};
    }

    static {
        ItemType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ItemType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ItemType valueOf(String str) {
        return (ItemType) Enum.valueOf(ItemType.class, str);
    }

    public static ItemType[] values() {
        return (ItemType[]) $VALUES.clone();
    }
}
