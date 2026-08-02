package defpackage;

import com.yandex.go.slot.api.ui.SlotItemUiState$Body$Alignment;
import com.yandex.go.slot.api.ui.SlotItemUiState$Body$Ellipsize;
import com.yandex.go.slot.api.ui.SlotItemUiState$Size;
import com.yandex.go.slot.api.ui.SlotItemUiState$Trail$AccordionChevron$ChevronState;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class ats0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[SlotItemUiState$Size.values().length];
        try {
            iArr[SlotItemUiState$Size.XS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SlotItemUiState$Size.S.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SlotItemUiState$Size.M.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SlotItemUiState$Size.L.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[SlotItemUiState$Trail$AccordionChevron$ChevronState.values().length];
        try {
            iArr2[SlotItemUiState$Trail$AccordionChevron$ChevronState.UP.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[SlotItemUiState$Trail$AccordionChevron$ChevronState.DOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
        int[] iArr3 = new int[SlotItemUiState$Body$Alignment.values().length];
        try {
            iArr3[SlotItemUiState$Body$Alignment.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[SlotItemUiState$Body$Alignment.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[SlotItemUiState$Body$Alignment.END.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        c = iArr3;
        int[] iArr4 = new int[SlotItemUiState$Body$Ellipsize.values().length];
        try {
            iArr4[SlotItemUiState$Body$Ellipsize.MIDDLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[SlotItemUiState$Body$Ellipsize.END.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[SlotItemUiState$Body$Ellipsize.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        d = iArr4;
    }
}
