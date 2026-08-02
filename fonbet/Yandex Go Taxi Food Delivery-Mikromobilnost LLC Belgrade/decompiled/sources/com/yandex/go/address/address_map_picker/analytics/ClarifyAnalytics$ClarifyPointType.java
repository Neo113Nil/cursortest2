package com.yandex.go.address.address_map_picker.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/address/address_map_picker/analytics/ClarifyAnalytics$ClarifyPointType", "", "Lcom/yandex/go/address/address_map_picker/analytics/ClarifyAnalytics$ClarifyPointType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "A", "B", "Mid", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ClarifyAnalytics$ClarifyPointType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ClarifyAnalytics$ClarifyPointType[] $VALUES;
    public static final ClarifyAnalytics$ClarifyPointType A;
    public static final ClarifyAnalytics$ClarifyPointType B;
    public static final ClarifyAnalytics$ClarifyPointType Mid;
    private final String eventValue;

    static {
        ClarifyAnalytics$ClarifyPointType clarifyAnalytics$ClarifyPointType = new ClarifyAnalytics$ClarifyPointType("A", 0, "a");
        A = clarifyAnalytics$ClarifyPointType;
        ClarifyAnalytics$ClarifyPointType clarifyAnalytics$ClarifyPointType2 = new ClarifyAnalytics$ClarifyPointType("B", 1, "b");
        B = clarifyAnalytics$ClarifyPointType2;
        ClarifyAnalytics$ClarifyPointType clarifyAnalytics$ClarifyPointType3 = new ClarifyAnalytics$ClarifyPointType("Mid", 2, "mid");
        Mid = clarifyAnalytics$ClarifyPointType3;
        ClarifyAnalytics$ClarifyPointType[] clarifyAnalytics$ClarifyPointTypeArr = {clarifyAnalytics$ClarifyPointType, clarifyAnalytics$ClarifyPointType2, clarifyAnalytics$ClarifyPointType3};
        $VALUES = clarifyAnalytics$ClarifyPointTypeArr;
        $ENTRIES = a.a(clarifyAnalytics$ClarifyPointTypeArr);
    }

    public ClarifyAnalytics$ClarifyPointType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ClarifyAnalytics$ClarifyPointType valueOf(String str) {
        return (ClarifyAnalytics$ClarifyPointType) Enum.valueOf(ClarifyAnalytics$ClarifyPointType.class, str);
    }

    public static ClarifyAnalytics$ClarifyPointType[] values() {
        return (ClarifyAnalytics$ClarifyPointType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
