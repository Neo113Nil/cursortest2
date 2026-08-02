package defpackage;

import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.contentbaseitems.ContentFontWeightDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.contentbaseitems.ContentTextItemTypographyDto;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class m4u0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ContentTextItemTypographyDto.values().length];
        try {
            iArr[ContentTextItemTypographyDto.TITLE1.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ContentTextItemTypographyDto.TITLE2.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ContentTextItemTypographyDto.TITLE3.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ContentTextItemTypographyDto.BODY1.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ContentTextItemTypographyDto.BODY2.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ContentTextItemTypographyDto.CAPTION1.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ContentTextItemTypographyDto.CAPTION2.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[ContentTextItemTypographyDto.SUBTITLE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        a = iArr;
        int[] iArr2 = new int[ContentFontWeightDto.values().length];
        try {
            iArr2[ContentFontWeightDto.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[ContentFontWeightDto.REGULAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[ContentFontWeightDto.MEDIUM.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[ContentFontWeightDto.BOLD.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[ContentFontWeightDto.HEAVY.ordinal()] = 5;
        } catch (NoSuchFieldError unused13) {
        }
        b = iArr2;
    }
}
