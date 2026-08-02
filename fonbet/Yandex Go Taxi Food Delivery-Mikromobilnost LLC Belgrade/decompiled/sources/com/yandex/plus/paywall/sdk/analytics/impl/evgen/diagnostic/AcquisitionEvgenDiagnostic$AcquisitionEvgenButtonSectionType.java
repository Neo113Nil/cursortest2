package com.yandex.plus.paywall.sdk.analytics.impl.evgen.diagnostic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/plus/paywall/sdk/analytics/impl/evgen/diagnostic/AcquisitionEvgenDiagnostic$AcquisitionEvgenButtonSectionType", "", "Lcom/yandex/plus/paywall/sdk/analytics/impl/evgen/diagnostic/AcquisitionEvgenDiagnostic$AcquisitionEvgenButtonSectionType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "OneTariff", "TwoTariffs", "Composite", "acquisition-sdk-analytics_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AcquisitionEvgenDiagnostic$AcquisitionEvgenButtonSectionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AcquisitionEvgenDiagnostic$AcquisitionEvgenButtonSectionType[] $VALUES;
    public static final AcquisitionEvgenDiagnostic$AcquisitionEvgenButtonSectionType Composite;
    public static final AcquisitionEvgenDiagnostic$AcquisitionEvgenButtonSectionType OneTariff;
    public static final AcquisitionEvgenDiagnostic$AcquisitionEvgenButtonSectionType TwoTariffs;
    private final String eventValue;

    static {
        AcquisitionEvgenDiagnostic$AcquisitionEvgenButtonSectionType acquisitionEvgenDiagnostic$AcquisitionEvgenButtonSectionType = new AcquisitionEvgenDiagnostic$AcquisitionEvgenButtonSectionType("OneTariff", 0, "one_tariff");
        OneTariff = acquisitionEvgenDiagnostic$AcquisitionEvgenButtonSectionType;
        AcquisitionEvgenDiagnostic$AcquisitionEvgenButtonSectionType acquisitionEvgenDiagnostic$AcquisitionEvgenButtonSectionType2 = new AcquisitionEvgenDiagnostic$AcquisitionEvgenButtonSectionType("TwoTariffs", 1, "two_tariffs");
        TwoTariffs = acquisitionEvgenDiagnostic$AcquisitionEvgenButtonSectionType2;
        AcquisitionEvgenDiagnostic$AcquisitionEvgenButtonSectionType acquisitionEvgenDiagnostic$AcquisitionEvgenButtonSectionType3 = new AcquisitionEvgenDiagnostic$AcquisitionEvgenButtonSectionType("Composite", 2, "composite");
        Composite = acquisitionEvgenDiagnostic$AcquisitionEvgenButtonSectionType3;
        AcquisitionEvgenDiagnostic$AcquisitionEvgenButtonSectionType[] acquisitionEvgenDiagnostic$AcquisitionEvgenButtonSectionTypeArr = {acquisitionEvgenDiagnostic$AcquisitionEvgenButtonSectionType, acquisitionEvgenDiagnostic$AcquisitionEvgenButtonSectionType2, acquisitionEvgenDiagnostic$AcquisitionEvgenButtonSectionType3};
        $VALUES = acquisitionEvgenDiagnostic$AcquisitionEvgenButtonSectionTypeArr;
        $ENTRIES = a.a(acquisitionEvgenDiagnostic$AcquisitionEvgenButtonSectionTypeArr);
    }

    public AcquisitionEvgenDiagnostic$AcquisitionEvgenButtonSectionType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static AcquisitionEvgenDiagnostic$AcquisitionEvgenButtonSectionType valueOf(String str) {
        return (AcquisitionEvgenDiagnostic$AcquisitionEvgenButtonSectionType) Enum.valueOf(AcquisitionEvgenDiagnostic$AcquisitionEvgenButtonSectionType.class, str);
    }

    public static AcquisitionEvgenDiagnostic$AcquisitionEvgenButtonSectionType[] values() {
        return (AcquisitionEvgenDiagnostic$AcquisitionEvgenButtonSectionType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
