package com.yandex.go.address_confirmation.analytics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/address_confirmation/analytics/AddressConfirmationAnalytics$DismissType", "", "Lcom/yandex/go/address_confirmation/analytics/AddressConfirmationAnalytics$DismissType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "BackButton", "SystemBack", "CloseAfterButtonTap", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressConfirmationAnalytics$DismissType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AddressConfirmationAnalytics$DismissType[] $VALUES;
    public static final AddressConfirmationAnalytics$DismissType BackButton;
    public static final AddressConfirmationAnalytics$DismissType CloseAfterButtonTap;
    public static final AddressConfirmationAnalytics$DismissType SystemBack;
    private final String eventValue;

    static {
        AddressConfirmationAnalytics$DismissType addressConfirmationAnalytics$DismissType = new AddressConfirmationAnalytics$DismissType("BackButton", 0, "back_button");
        BackButton = addressConfirmationAnalytics$DismissType;
        AddressConfirmationAnalytics$DismissType addressConfirmationAnalytics$DismissType2 = new AddressConfirmationAnalytics$DismissType("SystemBack", 1, "system_back");
        SystemBack = addressConfirmationAnalytics$DismissType2;
        AddressConfirmationAnalytics$DismissType addressConfirmationAnalytics$DismissType3 = new AddressConfirmationAnalytics$DismissType("CloseAfterButtonTap", 2, "close_after_button_tap");
        CloseAfterButtonTap = addressConfirmationAnalytics$DismissType3;
        AddressConfirmationAnalytics$DismissType[] addressConfirmationAnalytics$DismissTypeArr = {addressConfirmationAnalytics$DismissType, addressConfirmationAnalytics$DismissType2, addressConfirmationAnalytics$DismissType3};
        $VALUES = addressConfirmationAnalytics$DismissTypeArr;
        $ENTRIES = kotlin.enums.a.a(addressConfirmationAnalytics$DismissTypeArr);
    }

    public AddressConfirmationAnalytics$DismissType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static AddressConfirmationAnalytics$DismissType valueOf(String str) {
        return (AddressConfirmationAnalytics$DismissType) Enum.valueOf(AddressConfirmationAnalytics$DismissType.class, str);
    }

    public static AddressConfirmationAnalytics$DismissType[] values() {
        return (AddressConfirmationAnalytics$DismissType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
