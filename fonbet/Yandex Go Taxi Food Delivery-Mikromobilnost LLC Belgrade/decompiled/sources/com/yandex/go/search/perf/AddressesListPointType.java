package com.yandex.go.search.perf;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/search/perf/AddressesListPointType;", "", "", "analyticsValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "A", "B", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressesListPointType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AddressesListPointType[] $VALUES;
    public static final AddressesListPointType A;
    public static final AddressesListPointType B;
    private final String analyticsValue;

    static {
        AddressesListPointType addressesListPointType = new AddressesListPointType("A", 0, "a");
        A = addressesListPointType;
        AddressesListPointType addressesListPointType2 = new AddressesListPointType("B", 1, "b");
        B = addressesListPointType2;
        AddressesListPointType[] addressesListPointTypeArr = {addressesListPointType, addressesListPointType2};
        $VALUES = addressesListPointTypeArr;
        $ENTRIES = a.a(addressesListPointTypeArr);
    }

    public AddressesListPointType(String str, int i, String str2) {
        this.analyticsValue = str2;
    }

    public static AddressesListPointType valueOf(String str) {
        return (AddressesListPointType) Enum.valueOf(AddressesListPointType.class, str);
    }

    public static AddressesListPointType[] values() {
        return (AddressesListPointType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsValue() {
        return this.analyticsValue;
    }
}
