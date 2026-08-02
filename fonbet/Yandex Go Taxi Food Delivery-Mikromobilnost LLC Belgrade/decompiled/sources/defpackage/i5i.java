package defpackage;

import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.CornerBadgeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.DiscountCouponDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.HorizontalAlignmentDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.SectionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.TextStyleDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.TileDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.TileHeaderDto;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class i5i {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;
    public static final /* synthetic */ int[] g;
    public static final /* synthetic */ int[] h;

    static {
        int[] iArr = new int[SectionDto.StyleDto.values().length];
        try {
            iArr[SectionDto.StyleDto.DARK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SectionDto.StyleDto.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[TextStyleDto.values().length];
        try {
            iArr2[TextStyleDto.BOLD.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[TextStyleDto.BOLD_ITALIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[TextStyleDto.LIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[TextStyleDto.LIGHT_ITALIC.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[TextStyleDto.REGULAR.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[TextStyleDto.REGULAR_ITALIC.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[TextStyleDto.MEDIUM.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[TextStyleDto.MEDIUM_ITALIC.ordinal()] = 8;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[TextStyleDto.LOGOTYPE_REGULAR.ordinal()] = 9;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[TextStyleDto.YANGO_HEADLINE_BLACK.ordinal()] = 10;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[TextStyleDto.YANGO_HEADLINE_BLACK_ITALIC.ordinal()] = 11;
        } catch (NoSuchFieldError unused13) {
        }
        b = iArr2;
        int[] iArr3 = new int[DiscountCouponDto.CouponSizeDto.values().length];
        try {
            iArr3[DiscountCouponDto.CouponSizeDto.SMALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[DiscountCouponDto.CouponSizeDto.MEDIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        c = iArr3;
        int[] iArr4 = new int[TileDto.StyleDto.values().length];
        try {
            iArr4[TileDto.StyleDto.IMAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused16) {
        }
        d = iArr4;
        int[] iArr5 = new int[HorizontalAlignmentDto.values().length];
        try {
            iArr5[HorizontalAlignmentDto.BEGIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr5[HorizontalAlignmentDto.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr5[HorizontalAlignmentDto.END.ordinal()] = 3;
        } catch (NoSuchFieldError unused19) {
        }
        e = iArr5;
        int[] iArr6 = new int[CornerBadgeDto.AnchorDto.values().length];
        try {
            iArr6[CornerBadgeDto.AnchorDto.UPPER_LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr6[CornerBadgeDto.AnchorDto.LOWER_LEFT.ordinal()] = 2;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr6[CornerBadgeDto.AnchorDto.LOWER_RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr6[CornerBadgeDto.AnchorDto.UPPER_RIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError unused23) {
        }
        f = iArr6;
        int[] iArr7 = new int[TileDto.ImagePositionDto.values().length];
        try {
            iArr7[TileDto.ImagePositionDto.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr7[TileDto.ImagePositionDto.TRAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused25) {
        }
        g = iArr7;
        int[] iArr8 = new int[TileHeaderDto.TextFormatDto.values().length];
        try {
            iArr8[TileHeaderDto.TextFormatDto.MARKDOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused26) {
        }
        h = iArr8;
    }
}
