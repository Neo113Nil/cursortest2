package com.yandex.go.address_confirmation.analytics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/address_confirmation/analytics/AddressConfirmationAnalytics$ButtonName", "", "Lcom/yandex/go/address_confirmation/analytics/AddressConfirmationAnalytics$ButtonName;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "ChangeAddress", "ChooseCurrentAddress", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressConfirmationAnalytics$ButtonName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AddressConfirmationAnalytics$ButtonName[] $VALUES;
    public static final AddressConfirmationAnalytics$ButtonName ChangeAddress;
    public static final AddressConfirmationAnalytics$ButtonName ChooseCurrentAddress;
    private final String eventValue;

    static {
        AddressConfirmationAnalytics$ButtonName addressConfirmationAnalytics$ButtonName = new AddressConfirmationAnalytics$ButtonName("ChangeAddress", 0, "change_address");
        ChangeAddress = addressConfirmationAnalytics$ButtonName;
        AddressConfirmationAnalytics$ButtonName addressConfirmationAnalytics$ButtonName2 = new AddressConfirmationAnalytics$ButtonName("ChooseCurrentAddress", 1, "choose_current_address");
        ChooseCurrentAddress = addressConfirmationAnalytics$ButtonName2;
        AddressConfirmationAnalytics$ButtonName[] addressConfirmationAnalytics$ButtonNameArr = {addressConfirmationAnalytics$ButtonName, addressConfirmationAnalytics$ButtonName2};
        $VALUES = addressConfirmationAnalytics$ButtonNameArr;
        $ENTRIES = kotlin.enums.a.a(addressConfirmationAnalytics$ButtonNameArr);
    }

    public AddressConfirmationAnalytics$ButtonName(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static AddressConfirmationAnalytics$ButtonName valueOf(String str) {
        return (AddressConfirmationAnalytics$ButtonName) Enum.valueOf(AddressConfirmationAnalytics$ButtonName.class, str);
    }

    public static AddressConfirmationAnalytics$ButtonName[] values() {
        return (AddressConfirmationAnalytics$ButtonName[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
