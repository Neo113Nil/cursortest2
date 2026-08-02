package defpackage;

import com.yandex.plus.acquisition.sdk.api.internal.diagnostic.PlusAcquisitionButtonSectionDiagnostic$ButtonSectionType;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a27 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlusAcquisitionButtonSectionDiagnostic$ButtonSectionType.values().length];
        try {
            iArr[PlusAcquisitionButtonSectionDiagnostic$ButtonSectionType.OneTariff.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlusAcquisitionButtonSectionDiagnostic$ButtonSectionType.TwoTariffs.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlusAcquisitionButtonSectionDiagnostic$ButtonSectionType.Composite.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
