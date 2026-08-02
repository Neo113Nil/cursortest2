package defpackage;

import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.go.summary.ui.model.expanded.content.tariffcard.divider.DividerUiState$CustomGroupTitleUiState$TextStyleUiState;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class njf {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SlotSize.values().length];
        try {
            iArr[SlotSize.L.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SlotSize.M.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SlotSize.S.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SlotSize.XS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[DividerUiState$CustomGroupTitleUiState$TextStyleUiState.values().length];
        try {
            iArr2[DividerUiState$CustomGroupTitleUiState$TextStyleUiState.MULTI_TARIFF_OPTIONS_TEXT_STYLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[DividerUiState$CustomGroupTitleUiState$TextStyleUiState.GLUED_REQUIREMENTS_TEXT_STYLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[DividerUiState$CustomGroupTitleUiState$TextStyleUiState.RULES_TEXT_STYLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
