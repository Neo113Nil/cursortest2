package defpackage;

import com.yandex.go.summary.ui.model.common.tariffcell.EtaUiState$TextStyle;
import com.yandex.go.summary.ui.model.common.tariffcell.PriceUiState$TextStyle;
import com.yandex.go.summary.ui.model.common.tariffcell.TariffNameUiState$TextStyle;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class lex0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[EtaUiState$TextStyle.values().length];
        try {
            iArr[EtaUiState$TextStyle.CAPTION2_MEDIUM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EtaUiState$TextStyle.CAPTION2_REGULAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[PriceUiState$TextStyle.values().length];
        try {
            iArr2[PriceUiState$TextStyle.BODY2_MEDIUM.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[PriceUiState$TextStyle.BODY2_REGULAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
        int[] iArr3 = new int[TariffNameUiState$TextStyle.values().length];
        try {
            iArr3[TariffNameUiState$TextStyle.CAPTION1_MEDIUM.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[TariffNameUiState$TextStyle.CAPTION1_REGULAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        c = iArr3;
    }
}
