package com.yandex.plus.paywall.sdk.analytics.impl.evgen.diagnostic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/plus/paywall/sdk/analytics/impl/evgen/diagnostic/AcquisitionEvgenBuildType;", "", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Debug", "Release", "acquisition-sdk-analytics_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AcquisitionEvgenBuildType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AcquisitionEvgenBuildType[] $VALUES;
    public static final AcquisitionEvgenBuildType Debug;
    public static final AcquisitionEvgenBuildType Release;
    private final String eventValue;

    static {
        AcquisitionEvgenBuildType acquisitionEvgenBuildType = new AcquisitionEvgenBuildType("Debug", 0, "debug");
        Debug = acquisitionEvgenBuildType;
        AcquisitionEvgenBuildType acquisitionEvgenBuildType2 = new AcquisitionEvgenBuildType("Release", 1, "release");
        Release = acquisitionEvgenBuildType2;
        AcquisitionEvgenBuildType[] acquisitionEvgenBuildTypeArr = {acquisitionEvgenBuildType, acquisitionEvgenBuildType2};
        $VALUES = acquisitionEvgenBuildTypeArr;
        $ENTRIES = a.a(acquisitionEvgenBuildTypeArr);
    }

    public AcquisitionEvgenBuildType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static AcquisitionEvgenBuildType valueOf(String str) {
        return (AcquisitionEvgenBuildType) Enum.valueOf(AcquisitionEvgenBuildType.class, str);
    }

    public static AcquisitionEvgenBuildType[] values() {
        return (AcquisitionEvgenBuildType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
