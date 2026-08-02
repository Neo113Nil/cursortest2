package com.yandex.go.clarify_address;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/clarify_address/AddressClarificationReason;", "", "Other", "LocationButtonTap", "Map", "Suggest", "AddressNotClarified", "go-client-android.features.clarify_address:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AddressClarificationReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AddressClarificationReason[] $VALUES;
    public static final AddressClarificationReason AddressNotClarified;
    public static final AddressClarificationReason LocationButtonTap;
    public static final AddressClarificationReason Map;
    public static final AddressClarificationReason Other;
    public static final AddressClarificationReason Suggest;

    static {
        AddressClarificationReason addressClarificationReason = new AddressClarificationReason("Other", 0);
        Other = addressClarificationReason;
        AddressClarificationReason addressClarificationReason2 = new AddressClarificationReason("LocationButtonTap", 1);
        LocationButtonTap = addressClarificationReason2;
        AddressClarificationReason addressClarificationReason3 = new AddressClarificationReason("Map", 2);
        Map = addressClarificationReason3;
        AddressClarificationReason addressClarificationReason4 = new AddressClarificationReason("Suggest", 3);
        Suggest = addressClarificationReason4;
        AddressClarificationReason addressClarificationReason5 = new AddressClarificationReason("AddressNotClarified", 4);
        AddressNotClarified = addressClarificationReason5;
        AddressClarificationReason[] addressClarificationReasonArr = {addressClarificationReason, addressClarificationReason2, addressClarificationReason3, addressClarificationReason4, addressClarificationReason5};
        $VALUES = addressClarificationReasonArr;
        $ENTRIES = kotlin.enums.a.a(addressClarificationReasonArr);
    }

    public static AddressClarificationReason valueOf(String str) {
        return (AddressClarificationReason) Enum.valueOf(AddressClarificationReason.class, str);
    }

    public static AddressClarificationReason[] values() {
        return (AddressClarificationReason[]) $VALUES.clone();
    }
}
