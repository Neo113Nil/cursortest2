package com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/ButtonTransferType;", "", "<init>", "(Ljava/lang/String;I)V", "C2C_BY_PHONE", "SELF_TRANSFER", "ME2ME_PULL", "AFT", "REQUISITES_TRANSFER", "E_PAYMENT", "COMMON_TOPUP", "INVOICE_HCS", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ButtonTransferType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ButtonTransferType[] $VALUES;
    public static final ButtonTransferType C2C_BY_PHONE = new ButtonTransferType("C2C_BY_PHONE", 0);
    public static final ButtonTransferType SELF_TRANSFER = new ButtonTransferType("SELF_TRANSFER", 1);
    public static final ButtonTransferType ME2ME_PULL = new ButtonTransferType("ME2ME_PULL", 2);
    public static final ButtonTransferType AFT = new ButtonTransferType("AFT", 3);
    public static final ButtonTransferType REQUISITES_TRANSFER = new ButtonTransferType("REQUISITES_TRANSFER", 4);
    public static final ButtonTransferType E_PAYMENT = new ButtonTransferType("E_PAYMENT", 5);
    public static final ButtonTransferType COMMON_TOPUP = new ButtonTransferType("COMMON_TOPUP", 6);
    public static final ButtonTransferType INVOICE_HCS = new ButtonTransferType("INVOICE_HCS", 7);

    private static final /* synthetic */ ButtonTransferType[] $values() {
        return new ButtonTransferType[]{C2C_BY_PHONE, SELF_TRANSFER, ME2ME_PULL, AFT, REQUISITES_TRANSFER, E_PAYMENT, COMMON_TOPUP, INVOICE_HCS};
    }

    static {
        ButtonTransferType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ButtonTransferType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ButtonTransferType valueOf(String str) {
        return (ButtonTransferType) Enum.valueOf(ButtonTransferType.class, str);
    }

    public static ButtonTransferType[] values() {
        return (ButtonTransferType[]) $VALUES.clone();
    }
}
