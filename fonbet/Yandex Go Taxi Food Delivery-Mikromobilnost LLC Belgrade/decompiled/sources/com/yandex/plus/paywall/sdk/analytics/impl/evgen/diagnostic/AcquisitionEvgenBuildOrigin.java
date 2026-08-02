package com.yandex.plus.paywall.sdk.analytics.impl.evgen.diagnostic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/plus/paywall/sdk/analytics/impl/evgen/diagnostic/AcquisitionEvgenBuildOrigin;", "", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Store", "TestService", "Fake", "acquisition-sdk-analytics_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AcquisitionEvgenBuildOrigin {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AcquisitionEvgenBuildOrigin[] $VALUES;
    public static final AcquisitionEvgenBuildOrigin Fake;
    public static final AcquisitionEvgenBuildOrigin Store;
    public static final AcquisitionEvgenBuildOrigin TestService;
    private final String eventValue;

    static {
        AcquisitionEvgenBuildOrigin acquisitionEvgenBuildOrigin = new AcquisitionEvgenBuildOrigin("Store", 0, "store");
        Store = acquisitionEvgenBuildOrigin;
        AcquisitionEvgenBuildOrigin acquisitionEvgenBuildOrigin2 = new AcquisitionEvgenBuildOrigin("TestService", 1, "test_service");
        TestService = acquisitionEvgenBuildOrigin2;
        AcquisitionEvgenBuildOrigin acquisitionEvgenBuildOrigin3 = new AcquisitionEvgenBuildOrigin("Fake", 2, "fake");
        Fake = acquisitionEvgenBuildOrigin3;
        AcquisitionEvgenBuildOrigin[] acquisitionEvgenBuildOriginArr = {acquisitionEvgenBuildOrigin, acquisitionEvgenBuildOrigin2, acquisitionEvgenBuildOrigin3};
        $VALUES = acquisitionEvgenBuildOriginArr;
        $ENTRIES = a.a(acquisitionEvgenBuildOriginArr);
    }

    public AcquisitionEvgenBuildOrigin(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static AcquisitionEvgenBuildOrigin valueOf(String str) {
        return (AcquisitionEvgenBuildOrigin) Enum.valueOf(AcquisitionEvgenBuildOrigin.class, str);
    }

    public static AcquisitionEvgenBuildOrigin[] values() {
        return (AcquisitionEvgenBuildOrigin[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
