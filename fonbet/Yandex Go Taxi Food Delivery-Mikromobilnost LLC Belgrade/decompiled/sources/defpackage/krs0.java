package defpackage;

import com.yandex.go.slot.dto.SlotButtonDto;
import com.yandex.go.slot.dto.SlotItemBodyPropertiesDto;
import com.yandex.go.slot.dto.SlotItemLineDto;
import com.yandex.go.slot.dto.SlotItemSizeDto;
import com.yandex.go.slot.dto.SlotItemTrailDto$ButtonDto;
import com.yandex.go.slot.dto.SlotItemTrailDto$IconSpotDto;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class krs0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;
    public static final /* synthetic */ int[] g;
    public static final /* synthetic */ int[] h;

    static {
        int[] iArr = new int[SlotItemSizeDto.values().length];
        try {
            iArr[SlotItemSizeDto.XS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SlotItemSizeDto.S.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SlotItemSizeDto.M.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SlotItemSizeDto.L.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[SlotButtonDto.Properties.Size.values().length];
        try {
            iArr2[SlotButtonDto.Properties.Size.XS.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[SlotButtonDto.Properties.Size.S.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[SlotButtonDto.Properties.Size.M.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[SlotButtonDto.Properties.Size.L.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
        int[] iArr3 = new int[SlotButtonDto.Properties.Form.values().length];
        try {
            iArr3[SlotButtonDto.Properties.Form.SQUIRCLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[SlotButtonDto.Properties.Form.CIRCLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        c = iArr3;
        int[] iArr4 = new int[SlotButtonDto.Properties.Style.values().length];
        try {
            iArr4[SlotButtonDto.Properties.Style.MINOR.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        d = iArr4;
        int[] iArr5 = new int[SlotItemTrailDto$ButtonDto.Style.values().length];
        try {
            iArr5[SlotItemTrailDto$ButtonDto.Style.MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr5[SlotItemTrailDto$ButtonDto.Style.OUTLINE.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr5[SlotItemTrailDto$ButtonDto.Style.ACTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        e = iArr5;
        int[] iArr6 = new int[SlotItemBodyPropertiesDto.Align.values().length];
        try {
            iArr6[SlotItemBodyPropertiesDto.Align.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr6[SlotItemBodyPropertiesDto.Align.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr6[SlotItemBodyPropertiesDto.Align.END.ordinal()] = 3;
        } catch (NoSuchFieldError unused17) {
        }
        f = iArr6;
        int[] iArr7 = new int[SlotItemLineDto.Ellipsis.values().length];
        try {
            iArr7[SlotItemLineDto.Ellipsis.CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr7[SlotItemLineDto.Ellipsis.END.ordinal()] = 2;
        } catch (NoSuchFieldError unused19) {
        }
        g = iArr7;
        int[] iArr8 = new int[SlotItemTrailDto$IconSpotDto.Size.values().length];
        try {
            iArr8[SlotItemTrailDto$IconSpotDto.Size.M.ordinal()] = 1;
        } catch (NoSuchFieldError unused20) {
        }
        h = iArr8;
    }
}
