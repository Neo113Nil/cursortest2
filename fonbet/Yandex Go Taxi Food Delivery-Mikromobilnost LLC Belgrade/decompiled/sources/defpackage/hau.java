package defpackage;

import com.yandex.go.summary.ui.model.expanded.content.tariffcard.header.AddressesTextStyleUiState;
import com.yandex.go.summary.ui.model.expanded.content.tariffcard.header.TariffDescriptionTextStyleUiState;
import com.yandex.go.summary.ui.model.expanded.content.tariffcard.header.TariffNameTextStyleUiState;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class hau {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[AddressesTextStyleUiState.values().length];
        try {
            iArr[AddressesTextStyleUiState.HEADER_TEXT_STYLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AddressesTextStyleUiState.HEADER_REDESIGNED_TEXT_STYLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[TariffNameTextStyleUiState.values().length];
        try {
            iArr2[TariffNameTextStyleUiState.CAR_HEADER_TEXT_STYLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[TariffNameTextStyleUiState.CAR_HEADER_REDESIGNED_TEXT_STYLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[TariffNameTextStyleUiState.BACKGROUND_HEADER_TEXT_STYLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
        int[] iArr3 = new int[TariffDescriptionTextStyleUiState.values().length];
        try {
            iArr3[TariffDescriptionTextStyleUiState.CAR_HEADER_TEXT_STYLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[TariffDescriptionTextStyleUiState.CAR_HEADER_REDESIGNED_TEXT_STYLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[TariffDescriptionTextStyleUiState.BACKGROUND_HEADER_TEXT_STYLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        c = iArr3;
    }
}
