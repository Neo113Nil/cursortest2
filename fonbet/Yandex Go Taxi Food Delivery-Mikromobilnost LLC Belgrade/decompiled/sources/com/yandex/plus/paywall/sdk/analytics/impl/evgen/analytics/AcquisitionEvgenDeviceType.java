package com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/plus/paywall/sdk/analytics/impl/evgen/analytics/AcquisitionEvgenDeviceType;", "", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Phone", "Pad", "Tv", "acquisition-sdk-analytics_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AcquisitionEvgenDeviceType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AcquisitionEvgenDeviceType[] $VALUES;
    public static final AcquisitionEvgenDeviceType Pad;
    public static final AcquisitionEvgenDeviceType Phone;
    public static final AcquisitionEvgenDeviceType Tv;
    private final String eventValue;

    static {
        AcquisitionEvgenDeviceType acquisitionEvgenDeviceType = new AcquisitionEvgenDeviceType("Phone", 0, "phone");
        Phone = acquisitionEvgenDeviceType;
        AcquisitionEvgenDeviceType acquisitionEvgenDeviceType2 = new AcquisitionEvgenDeviceType("Pad", 1, "pad");
        Pad = acquisitionEvgenDeviceType2;
        AcquisitionEvgenDeviceType acquisitionEvgenDeviceType3 = new AcquisitionEvgenDeviceType("Tv", 2, "tv");
        Tv = acquisitionEvgenDeviceType3;
        AcquisitionEvgenDeviceType[] acquisitionEvgenDeviceTypeArr = {acquisitionEvgenDeviceType, acquisitionEvgenDeviceType2, acquisitionEvgenDeviceType3};
        $VALUES = acquisitionEvgenDeviceTypeArr;
        $ENTRIES = a.a(acquisitionEvgenDeviceTypeArr);
    }

    public AcquisitionEvgenDeviceType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static AcquisitionEvgenDeviceType valueOf(String str) {
        return (AcquisitionEvgenDeviceType) Enum.valueOf(AcquisitionEvgenDeviceType.class, str);
    }

    public static AcquisitionEvgenDeviceType[] values() {
        return (AcquisitionEvgenDeviceType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
