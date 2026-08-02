package com.yandex.plus.acquisition.sdk.api.internal.diagnostic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/plus/acquisition/sdk/api/internal/diagnostic/PlusAcquisitionButtonSectionDiagnostic$ButtonSectionType", "", "Lcom/yandex/plus/acquisition/sdk/api/internal/diagnostic/PlusAcquisitionButtonSectionDiagnostic$ButtonSectionType;", "OneTariff", "TwoTariffs", "Composite", "acquisition-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusAcquisitionButtonSectionDiagnostic$ButtonSectionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlusAcquisitionButtonSectionDiagnostic$ButtonSectionType[] $VALUES;
    public static final PlusAcquisitionButtonSectionDiagnostic$ButtonSectionType Composite;
    public static final PlusAcquisitionButtonSectionDiagnostic$ButtonSectionType OneTariff;
    public static final PlusAcquisitionButtonSectionDiagnostic$ButtonSectionType TwoTariffs;

    static {
        PlusAcquisitionButtonSectionDiagnostic$ButtonSectionType plusAcquisitionButtonSectionDiagnostic$ButtonSectionType = new PlusAcquisitionButtonSectionDiagnostic$ButtonSectionType("OneTariff", 0);
        OneTariff = plusAcquisitionButtonSectionDiagnostic$ButtonSectionType;
        PlusAcquisitionButtonSectionDiagnostic$ButtonSectionType plusAcquisitionButtonSectionDiagnostic$ButtonSectionType2 = new PlusAcquisitionButtonSectionDiagnostic$ButtonSectionType("TwoTariffs", 1);
        TwoTariffs = plusAcquisitionButtonSectionDiagnostic$ButtonSectionType2;
        PlusAcquisitionButtonSectionDiagnostic$ButtonSectionType plusAcquisitionButtonSectionDiagnostic$ButtonSectionType3 = new PlusAcquisitionButtonSectionDiagnostic$ButtonSectionType("Composite", 2);
        Composite = plusAcquisitionButtonSectionDiagnostic$ButtonSectionType3;
        PlusAcquisitionButtonSectionDiagnostic$ButtonSectionType[] plusAcquisitionButtonSectionDiagnostic$ButtonSectionTypeArr = {plusAcquisitionButtonSectionDiagnostic$ButtonSectionType, plusAcquisitionButtonSectionDiagnostic$ButtonSectionType2, plusAcquisitionButtonSectionDiagnostic$ButtonSectionType3};
        $VALUES = plusAcquisitionButtonSectionDiagnostic$ButtonSectionTypeArr;
        $ENTRIES = a.a(plusAcquisitionButtonSectionDiagnostic$ButtonSectionTypeArr);
    }

    public static PlusAcquisitionButtonSectionDiagnostic$ButtonSectionType valueOf(String str) {
        return (PlusAcquisitionButtonSectionDiagnostic$ButtonSectionType) Enum.valueOf(PlusAcquisitionButtonSectionDiagnostic$ButtonSectionType.class, str);
    }

    public static PlusAcquisitionButtonSectionDiagnostic$ButtonSectionType[] values() {
        return (PlusAcquisitionButtonSectionDiagnostic$ButtonSectionType[]) $VALUES.clone();
    }
}
